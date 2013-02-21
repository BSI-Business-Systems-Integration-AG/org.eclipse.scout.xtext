/*******************************************************************************
 * Copyright (c) 2010 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.operation.form;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.FormStackNewOperation;
import org.eclipse.scout.sdk.operation.service.ServiceNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.util.IItemVisitor;
import org.eclipse.scout.sdk.saml.importer.util.SamlImportUtility;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.workspace.IScoutBundle;

/**
 * <h3>{@link FormElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class FormElementImportOperation extends AbstractSamlElementImportOperation {

  public final static int EVENT_OBJECT_TYPE_SERVER_SERVICE = 3;
  public final static int EVENT_OBJECT_TYPE_SERVER_INTERFACE = 4;
  public final static int EVENT_OBJECT_TYPE_CLIENT_SERVICE = 5;
  public final static int EVENT_OBJECT_TYPE_CLIENT_INTERFACE = 6;
  public final static int EVENT_OBJECT_TYPE_FORM = 7;
  public final static int EVENT_OBJECT_TYPE_FORM_DATA = 8;
  public final static int EVENT_OBJECT_TYPE_MAIN_BOX = 9;

  private final static String CLIENT_FORM_SERVICE_SUFFIX = "ClientService";
  private final static String SERVER_FORM_SERVICE_SUFFIX = SdkProperties.SUFFIX_SERVICE;

  private IType m_createdServerServiceImplementation;
  private IType m_createdServerServiceInterface;

  private IType m_createdClientServiceImplementation;
  private IType m_createdClientServiceInterface;

  private IType m_createdForm;
  private IType m_createdFormData;
  private IType m_createdMainBox;
  private IMethod m_createdMainBoxGetter;

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("FormElement cannot be null.");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    createFormStack();

    processChildren(m_createdMainBox, createFormContext());

    fireEvents();

    postProcessForm();
  }

  private void fireEvents() throws IllegalArgumentException, CoreException {
    fireTypeCreated(m_createdServerServiceImplementation, EVENT_OBJECT_TYPE_SERVER_SERVICE);
    fireTypeCreated(m_createdServerServiceInterface, EVENT_OBJECT_TYPE_SERVER_INTERFACE);
    fireTypeCreated(m_createdClientServiceImplementation, EVENT_OBJECT_TYPE_CLIENT_SERVICE);
    fireTypeCreated(m_createdClientServiceInterface, EVENT_OBJECT_TYPE_CLIENT_INTERFACE);
    fireTypeCreated(m_createdForm, EVENT_OBJECT_TYPE_FORM);
    fireTypeCreated(m_createdFormData, EVENT_OBJECT_TYPE_FORM_DATA);
    fireTypeCreated(m_createdMainBox, EVENT_OBJECT_TYPE_MAIN_BOX);
  }

  private void postProcessForm() throws CoreException, IllegalArgumentException {
    postProcessType(m_createdClientServiceInterface);
    postProcessType(m_createdClientServiceImplementation);

    postProcessType(m_createdServerServiceInterface);
    serverServiceImportsCorrection();
    postProcessType(m_createdServerServiceImplementation);

    postProcessType(m_createdForm);
    postProcessType(m_createdFormData);
  }

  private void serverServiceImportsCorrection() throws JavaModelException {
    //TODO Why necessary? check organize imports!
    ICompilationUnit compilationUnit = m_createdServerServiceImplementation.getCompilationUnit();
    String src = compilationUnit.getSource();
    if (src.contains(m_createdFormData.getElementName())) {
      String fqn = m_createdFormData.getFullyQualifiedName();
      if (!src.contains("import " + fqn + ";")) {
        compilationUnit.createImport(fqn, null, getSamlContext().getMonitor());
      }
    }
  }

  private SamlFormContext createFormContext() throws JavaModelException {
    SamlFormContext formContext = new SamlFormContext();
    formContext.setClientType(m_createdClientServiceImplementation);
    formContext.setClientInterface(m_createdClientServiceInterface);
    formContext.setServerType(m_createdServerServiceImplementation);
    formContext.setServerInterface(m_createdServerServiceInterface);
    formContext.setFormDataType(m_createdFormData);
    formContext.setFormType(m_createdForm);
    formContext.setMainBoxType(m_createdMainBox);
    formContext.addFieldGetterMethod(m_createdMainBoxGetter);
    return formContext;
  }

  private boolean hasOneOfLogicEvents(final String[] logicEvents) {
    LogicElement handler = SamlImportUtility.findFirst(getElement().getLogic(), new IItemVisitor<LogicElement>() {
      @Override
      public boolean visit(LogicElement t) {
        for (String handlerType : logicEvents) {
          if (t.getEvent() != null && t.getEvent().equals(handlerType)) {
            return true;
          }
        }
        return false;
      }
    });
    return handler != null;
  }

  private void createFormStack() throws CoreException {
    String baseName = getElement().getName();

    String clientFormsPackage = getCurrentScoutModule().getClientBundle().getDefaultPackage(IScoutBundle.CLIENT_FORMS);
    String formClassName = baseName + SdkProperties.SUFFIX_FORM;
    String serverSvcPackage = getCurrentScoutModule().getServerBundle().getDefaultPackage(IScoutBundle.SERVER_SERVICES);
    String serverSvcName = baseName + SERVER_FORM_SERVICE_SUFFIX;
    String sharedIfcPackage = getCurrentScoutModule().getSharedBundle().getDefaultPackage(IScoutBundle.SHARED_SERVICES);
    String sharedIfcName = "I" + serverSvcName;
    String clientSvcPackage = getCurrentScoutModule().getClientBundle().getDefaultPackage(IScoutBundle.CLIENT_SERVICES);
    String clientSvcName = baseName + CLIENT_FORM_SERVICE_SUFFIX;
    String clientIfcName = "I" + clientSvcName;

    // delete old
    deleteClass(getCurrentScoutModule().getClientBundle(), clientFormsPackage, formClassName);
    deleteClass(getCurrentScoutModule().getServerBundle(), serverSvcPackage, serverSvcName);
    deleteClass(getCurrentScoutModule().getSharedBundle(), sharedIfcPackage, sharedIfcName);
    deleteClass(getCurrentScoutModule().getSharedBundle(), sharedIfcPackage, baseName + SdkProperties.SUFFIX_FORM_DATA);
    deleteClass(getCurrentScoutModule().getClientBundle(), clientSvcPackage, clientSvcName);
    deleteClass(getCurrentScoutModule().getClientBundle(), clientSvcPackage, clientIfcName);

    FormStackNewOperation op = new FormStackNewOperation(false);
    op.setNlsEntry(null);
    op.setCreateButtonOk(false);
    op.setCreateButtonCancel(false);
    op.setCreateExecLoad(false);
    op.setCreateExecStore(false);
    op.setCreateCreateMethod(false);
    op.setCreateLoadMethod(false);
    op.setCreatePrepareCreateMethod(false);
    op.setCreateStoreMethod(false);

    boolean createModifyHandler = hasOneOfLogicEvents(new String[]{
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getModify_loadKeyword_1().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getModify_storeKeyword_2().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getModify_discardKeyword_3().getValue()
    });

    op.setCreateModifyHandler(createModifyHandler);
    op.setCreateNewHandler(!createModifyHandler || hasOneOfLogicEvents(new String[]{
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getNew_loadKeyword_4().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getNew_storeKeyword_5().getValue(),
        getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getNew_discardKeyword_6().getValue()
    }));

    op.setFormBundle(getCurrentScoutModule().getClientBundle());
    op.setFormPackage(clientFormsPackage);
    op.setFormDataBundle(getCurrentScoutModule().getSharedBundle());
    op.setFormDataPackage(sharedIfcPackage);

    op.setClientServiceRegistryBundles(new IScoutBundle[]{getCurrentScoutModule().getClientBundle()});
    op.setPermissionCreateBundle(null);
    op.setPermissionCreateName(null);
    op.setPermissionReadBundle(null);
    op.setPermissionReadName(null);
    op.setPermissionUpdateBundle(null);
    op.setPermissionUpdateName(null);
    op.setServerServiceRegistryBundles(new IScoutBundle[]{getCurrentScoutModule().getServerBundle()});
    op.setServiceImplementationBundle(getCurrentScoutModule().getServerBundle());
    op.setServiceImplementationName(serverSvcName);
    op.setServiceImplementationPackage(serverSvcPackage);
    if (getElement().getSvcSuperType() != null) {
      op.setServiceImplementationSuperTypeSignature(SignatureCache.createTypeSignature(getElement().getSvcSuperType().getDefinition()));
    }
    op.setServiceInterfaceBundle(getCurrentScoutModule().getSharedBundle());
    op.setServiceInterfaceName(sharedIfcName);
    op.setServiceInterfacePackage(sharedIfcPackage);
    op.setFormSuperTypeSignature(getSuperTypeSignature(RuntimeClasses.IForm, getElement().getSuperType()));
    op.setFormName(formClassName);

    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    m_createdServerServiceImplementation = op.getOutProcessService();
    m_createdServerServiceInterface = op.getOutProcessServiceInterface();
    m_createdMainBox = op.getOutMainBox();
    m_createdForm = op.getOutForm();
    m_createdFormData = op.getOutFormData();
    m_createdMainBoxGetter = op.getOutMainBoxGetterMethod();

    // client service
    ServiceNewOperation clientSvcOp = new ServiceNewOperation();
    clientSvcOp.setImplementationBundle(getCurrentScoutModule().getClientBundle());
    clientSvcOp.setServicePackageName(clientSvcPackage);
    clientSvcOp.setServiceName(clientSvcName);
    clientSvcOp.setServiceSuperTypeSignature(RuntimeClasses.getSuperTypeSignature(RuntimeClasses.IService2, getSamlContext().getRootProject()));

    clientSvcOp.setInterfaceBundle(getCurrentScoutModule().getClientBundle());
    clientSvcOp.setServiceInterfacePackageName(clientSvcPackage);
    clientSvcOp.setServiceInterfaceName(clientIfcName);
    clientSvcOp.setServiceInterfaceSuperTypeSignature(SignatureCache.createTypeSignature(RuntimeClasses.IService2));
    clientSvcOp.addServiceRegistrationBundle(getCurrentScoutModule().getClientBundle());

    clientSvcOp.validate();
    clientSvcOp.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    m_createdClientServiceImplementation = clientSvcOp.getCreatedServiceImplementation();
    m_createdClientServiceInterface = clientSvcOp.getCreatedServiceInterface();
  }

  @Override
  protected FormElement getElement() {
    return (FormElement) super.getElement();
  }
}
