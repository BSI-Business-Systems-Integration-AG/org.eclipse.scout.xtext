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
package org.eclipse.scout.sdk.saml.importer.operation.form.fields.container;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.sdk.operation.form.field.SequenceBoxNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link SamlSequenceBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlSequenceBoxElementImportOperation extends AbstractBoxElementImportOperation {

  private SequenceBoxElement m_sequenceBoxElement;

  @Override
  public String getOperationName() {
    return "Create sequence box";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getSequenceBoxElement() == null) {
      throw new IllegalArgumentException("sequence box element cannot be null.");
    }
  }

  @Override
  public IType createBox() throws CoreException, IllegalArgumentException {
    SequenceBoxNewOperation o = new SequenceBoxNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getSequenceBoxElement().getName() + getFieldSuffix());
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedField();

    overrideMethod(createdField, null, "getConfiguredAutoCheckFromTo", "return false;");

    return createdField;
  }

  public SequenceBoxElement getSequenceBoxElement() {
    return m_sequenceBoxElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_sequenceBoxElement = (SequenceBoxElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_sequenceBoxElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_BOX;
  }
}
