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
package org.eclipse.scout.sdk.saml.importer.operation.lookup;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.lookupcall.LookupCallNewOperation;
import org.eclipse.scout.sdk.operation.service.ServiceDeleteOperation;
import org.eclipse.scout.sdk.operation.util.SourceFormatOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
import org.eclipse.scout.sdk.workspace.IScoutBundle;

/**
 * <h3>{@link LookupElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public class LookupElementImportOperation extends AbstractSamlElementImportOperation {

  private LookupElement m_lookupElement;

  @Override
  public String getOperationName() {
    return "Create Lookup Call & Lookup Service";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getLookupElement() == null) {
      throw new IllegalArgumentException("LookupElement cannot be null.");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    String baseName = getLookupElement().getName();
    String lookupCallName = baseName + SdkProperties.SUFFIX_LOOKUP_CALL;

    deleteExisting(monitor, workingCopyManager, baseName);

    // create classes
    LookupCallNewOperation op = new LookupCallNewOperation();
    op.setLookupCallName(lookupCallName);
    op.setBundle(getCurrentScoutModule().getSharedBundle());
    op.setServiceInterfaceBundle(getCurrentScoutModule().getSharedBundle());
    op.setInterfaceRegistrationBundle(getCurrentScoutModule().getClientBundle());
    op.setImplementationRegistrationBundle(getCurrentScoutModule().getServerBundle());
    op.setServiceImplementationBundle(getCurrentScoutModule().getServerBundle());
    op.setServiceSuperTypeSignature(Signature.createTypeSignature(RuntimeClasses.AbstractLookupService, true));
    op.validate();
    op.run(monitor, workingCopyManager);

    // fill logic
    IType lookupService = TypeUtility.getType(getLookupServiceFqn(baseName));
    SamlLogicFillOperation logicFillOp = new SamlLogicFillOperation();
    logicFillOp.setSamlContext(getSamlContext());
    logicFillOp.setChildElements(getLookupElement().getServicelogic());
    logicFillOp.setClientType(op.getOutLookupCall());
    logicFillOp.setServerType(lookupService);
    logicFillOp.validate();
    logicFillOp.run(monitor, workingCopyManager);

    // format
    SourceFormatOperation f = new SourceFormatOperation(op.getOutLookupCall());
    f.validate();
    f.run(monitor, workingCopyManager);
    f = new SourceFormatOperation(lookupService);
    f.validate();
    f.run(monitor, workingCopyManager);
  }

  private String getLookupServiceFqn(String baseName) {
    IScoutBundle server = getCurrentScoutModule().getServerBundle();
    return server.getPackageName(IScoutBundle.SERVER_PACKAGE_APPENDIX_SERVICES_LOOKUP) + "." + baseName + SdkProperties.SUFFIX_LOOKUP_SERVICE;
  }

  private void deleteExisting(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, String name) throws CoreException, IllegalArgumentException {
    IScoutBundle shared = getCurrentScoutModule().getSharedBundle();

    IType oldService = TypeUtility.getType(getLookupServiceFqn(name));
    IType oldCall = TypeUtility.getType(shared.getPackageName(IScoutBundle.SHARED_PACKAGE_APPENDIX_SERVICES_LOOKUP) + "." + name + SdkProperties.SUFFIX_LOOKUP_CALL);
    IType oldServiceInterface = TypeUtility.getType(shared.getPackageName(IScoutBundle.SHARED_PACKAGE_APPENDIX_SERVICES_LOOKUP) + ".I" + name + SdkProperties.SUFFIX_LOOKUP_SERVICE);

    ServiceDeleteOperation sdo = new ServiceDeleteOperation();
    sdo.setServiceImplementation(oldService);
    sdo.setServiceInterface(oldServiceInterface);
    sdo.setAdditionalTypesToBeDeleted(new IType[]{oldCall});
    sdo.validate();
    sdo.run(monitor, workingCopyManager);
  }

  public LookupElement getLookupElement() {
    return m_lookupElement;
  }

  public void setLookupElement(LookupElement lookupElement) {
    m_lookupElement = lookupElement;
  }

}
