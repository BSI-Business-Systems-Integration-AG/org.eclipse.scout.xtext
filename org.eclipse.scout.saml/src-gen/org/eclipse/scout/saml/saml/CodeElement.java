/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.CodeElement#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.CodeElement#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.CodeElement#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.CodeElement#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.CodeElement#getCodes <em>Codes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getCodeElement()
 * @model
 * @generated
 */
public interface CodeElement extends NamedTypeElement
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCodeElement_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.CodeElement#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' attribute.
   * @see #setValueType(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCodeElement_ValueType()
   * @model
   * @generated
   */
  String getValueType();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.CodeElement#getValueType <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' attribute.
   * @see #getValueType()
   * @generated
   */
  void setValueType(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' reference.
   * @see #setText(TranslationElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCodeElement_Text()
   * @model
   * @generated
   */
  TranslationElement getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.CodeElement#getText <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' reference.
   * @see #getText()
   * @generated
   */
  void setText(TranslationElement value);

  /**
   * Returns the value of the '<em><b>Logic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.LogicElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCodeElement_Logic()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getLogic();

  /**
   * Returns the value of the '<em><b>Codes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.CodeElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Codes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Codes</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getCodeElement_Codes()
   * @model containment="true"
   * @generated
   */
  EList<CodeElement> getCodes();

} // CodeElement
