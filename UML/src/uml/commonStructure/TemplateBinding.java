/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TemplateBinding is a DirectedRelationship between a TemplateableElement and a template. A TemplateBinding specifies the TemplateParameterSubstitutions of actual parameters for the formal parameters of the template.
 * parameterSubstitution->forAll(b | signature.parameter->includes(b.formal))
 * signature.parameter->forAll(p | parameterSubstitution->select(b | b.formal = p)->size() <= 1)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateBinding#getSignature <em>Signature</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getTemplateBinding()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parameter_substitution_formal one_parameter_substitution'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL parameter_substitution_formal='parameterSubstitution->forAll(b | signature.parameter->includes(b.formal))' one_parameter_substitution='signature.parameter->forAll(p | parameterSubstitution->select(b | b.formal = p)->size() <= 1)'"
 * @generated
 */
public interface TemplateBinding extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.TemplateParameterSubstitution}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateParameterSubstitutions owned by this TemplateBinding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateBinding_ParameterSubstitution()
	 * @see uml.commonStructure.TemplateParameterSubstitution#getTemplateBinding
	 * @model opposite="templateBinding" containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateParameterSubstitution> getParameterSubstitution();

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateSignature for the template that is the target of this TemplateBinding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(TemplateSignature)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateBinding_Signature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='templateBinding'"
	 * @generated
	 */
	TemplateSignature getSignature();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateBinding#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Bound Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateableElement#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateableElement that is bound by this TemplateBinding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound Element</em>' container reference.
	 * @see #setBoundElement(TemplateableElement)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateBinding_BoundElement()
	 * @see uml.commonStructure.TemplateableElement#getTemplateBinding
	 * @model opposite="templateBinding" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateableElement getBoundElement();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateBinding#getBoundElement <em>Bound Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Element</em>' container reference.
	 * @see #getBoundElement()
	 * @generated
	 */
	void setBoundElement(TemplateableElement value);

} // TemplateBinding
