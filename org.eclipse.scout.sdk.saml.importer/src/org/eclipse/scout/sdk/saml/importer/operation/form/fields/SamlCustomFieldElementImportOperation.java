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
package org.eclipse.scout.sdk.saml.importer.operation.form.fields;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.CustomFieldElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.sdk.operation.form.field.FormFieldNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link SamlCustomFieldElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlCustomFieldElementImportOperation extends AbstractSamlFormFieldElementOperation {

  private CustomFieldElement m_customElement;

  @Override
  public String getOperationName() {
    return "Create custom field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getCustomFieldElement() == null) {
      throw new IllegalArgumentException("custom field element cannot be null");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    String superClass = getCustomFieldElement().getTemplate().getDefinition();

    FormFieldNewOperation newOp = new FormFieldNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    newOp.setTypeName(getCustomFieldElement().getName() + getFieldSuffix());
    newOp.setSuperTypeSignature(Signature.createTypeSignature(superClass, true));
    newOp.validate();
    newOp.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = newOp.getCreatedFormField();

    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyFormFieldProperties(createdField, h);
    fillFormFieldLogic(createdField);
  }

  public CustomFieldElement getCustomFieldElement() {
    return m_customElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_customElement = (CustomFieldElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_customElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_FORM_FIELD;
  }
}
