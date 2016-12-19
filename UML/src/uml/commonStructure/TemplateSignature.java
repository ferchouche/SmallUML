/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Template Signature bundles the set of formal TemplateParameters for a template.
 * template.ownedElement->includesAll(parameter.parameteredElement->asSet() - parameter.ownedParameteredElement->asSet())
 * parameter->forAll( p1, p2 | (p1 <> p2 and p1.parameteredElement.oclIsKindOf(NamedElement) and p2.parameteredElement.oclIsKindOf(NamedElement) ) implies
 *    p1.parameteredElement.oclAsType(NamedElement).name <> p2.parameteredElement.oclAsType(NamedElement).name)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.TemplateSignature#getParameter <em>Parameter</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateSignature#getTemplate <em>Template</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getTemplateSignature()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='own_elements unique_parameters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL own_elements='template.ownedElement->includesAll(parameter.parameteredElement->asSet() - parameter.ownedParameteredElement->asSet())' unique_parameters='parameter->forAll( p1, p2 | (p1 <> p2 and p1.parameteredElement.oclIsKindOf(NamedElement) and p2.parameteredElement.oclIsKindOf(NamedElement) ) implies\r\n   p1.parameteredElement.oclAsType(NamedElement).name <> p2.parameteredElement.oclAsType(NamedElement).name)'"
 * @generated
 */
public interface TemplateSignature extends Element {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of all formal TemplateParameters for this TemplateSignature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateSignature_Parameter()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='templateSignature'"
	 * @generated
	 */
	EList<TemplateParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateableElement that owns this TemplateSignature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(TemplateableElement)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateSignature_Template()
	 * @see uml.commonStructure.TemplateableElement#getOwnedTemplateSignature
	 * @model opposite="ownedTemplateSignature" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateableElement getTemplate();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateSignature#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateableElement value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.TemplateParameter}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateParameter#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal parameters that are owned by this TemplateSignature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateSignature_OwnedParameter()
	 * @see uml.commonStructure.TemplateParameter#getSignature
	 * @model opposite="signature" containment="true"
	 * @generated
	 */
	EList<TemplateParameter> getOwnedParameter();

} // TemplateSignature
