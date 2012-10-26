package org.eclipse.scout.saml.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.scout.saml.SamlInjectorProvider;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.validation.SamlJavaValidator;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = SamlInjectorProvider.class)
@SuppressWarnings("all")
public class FormTests {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Test
  public void testFormFieldUniqueness() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyBox {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string my");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyBox2 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string my");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      EClass _formElement = SamlPackage.eINSTANCE.getFormElement();
      this._validationTestHelper.assertError(_parse, _formElement, SamlJavaValidator.DUPLICATE, SamlJavaValidator.MSG_DUPLICATE_FIELD);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module a.b");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("form MyForm {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("date d1");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("date d2");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("date d1");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      Model _parse_1 = this._parseHelper.parse(_builder_1);
      EClass _formElement_1 = SamlPackage.eINSTANCE.getFormElement();
      this._validationTestHelper.assertError(_parse_1, _formElement_1, SamlJavaValidator.DUPLICATE, SamlJavaValidator.MSG_DUPLICATE_FIELD);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module a.b");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("form MyForm {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("sequence_box MyBox {");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("string my");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("sequence_box MyBox2 {");
      _builder_2.newLine();
      _builder_2.append("\t\t");
      _builder_2.append("string my2");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      _builder_2.newLine();
      _builder_2.append("form MyForm2 {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("string my");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("string my2");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      Model _parse_2 = this._parseHelper.parse(_builder_2);
      this._validationTestHelper.assertNoErrors(_parse_2);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSimpleForm() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyBox {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string myString");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("long mylong {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("logic event=changed placement=server { \"\" }");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("sequence_box asdf {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMasterAttribute() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string test1");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyBox3 {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string string1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sequence_box MyBox {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string my master=test1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("string my2 master=string1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("form MyForm2 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string test1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string string1 master=test1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFormUniquencessOverFiles() {
    try {
      final XtextResourceSet rs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module a.b");
      _builder.newLine();
      _builder.append("form FormA {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder, rs);
      this._validationTestHelper.assertNoErrors(_parse);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("module a.b");
      _builder_1.newLine();
      _builder_1.append("form FormA {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      Model _parse_1 = this._parseHelper.parse(_builder_1, rs);
      EClass _model = SamlPackage.eINSTANCE.getModel();
      this._validationTestHelper.assertError(_parse_1, _model, SamlJavaValidator.DUPLICATE, SamlJavaValidator.MSG_DUPLICATE);
      final XtextResourceSet rs2 = this.resourceSetProvider.get();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("module a.b");
      _builder_2.newLine();
      _builder_2.append("translation T1 en=\"en\"");
      _builder_2.newLine();
      _builder_2.append("form FormA title=T1 {");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("string StringA");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      Model _parse_2 = this._parseHelper.parse(_builder_2, rs2);
      this._validationTestHelper.assertNoErrors(_parse_2);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("module a.b");
      _builder_3.newLine();
      _builder_3.append("form FormB title=T1 {");
      _builder_3.newLine();
      _builder_3.append("\t");
      _builder_3.append("string StringA");
      _builder_3.newLine();
      _builder_3.append("}");
      _builder_3.newLine();
      Model _parse_3 = this._parseHelper.parse(_builder_3, rs2);
      this._validationTestHelper.assertNoErrors(_parse_3);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}