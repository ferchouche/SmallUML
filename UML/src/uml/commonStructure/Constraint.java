/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Constraint is a condition or restriction expressed in natural language text or in a machine readable language for the purpose of declaring some of the semantics of an Element or set of Elements.
 * not constrainedElement->includes(self)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link uml.commonStructure.Constraint#getSpecification <em>Specification</em>}</li>
 *   <li>{@link uml.commonStructure.Constraint#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='boolean_value no_side_effects not_apply_to_self'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL not_apply_to_self='not constrainedElement->includes(self)'"
 * @generated
 */
public interface Constraint extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of Elements referenced by this Constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getConstraint_ConstrainedElement()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='constraint'"
	 * @generated
	 */
	EList<Element> getConstrainedElement();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A condition that must be true when evaluated in order for the Constraint to be satisfied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see uml.commonStructure.CommonStructurePackage#getConstraint_Specification()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningConstraint'"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link uml.commonStructure.Constraint#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.Namespace#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Namespace that owns the Constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(Namespace)
	 * @see uml.commonStructure.CommonStructurePackage#getConstraint_Context()
	 * @see uml.commonStructure.Namespace#getOwnedRule
	 * @model opposite="ownedRule" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getContext();

	/**
	 * Sets the value of the '{@link uml.commonStructure.Constraint#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Namespace value);

} // Constraint
