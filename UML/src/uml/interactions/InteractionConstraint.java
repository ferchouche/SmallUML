/**
 */
package uml.interactions;

import uml.commonStructure.Constraint;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InteractionConstraint is a Boolean expression that guards an operand in a CombinedFragment.
 * maxint->notEmpty() or minint->notEmpty() implies
 * interactionOperand.combinedFragment.interactionOperator =
 * InteractionOperatorKind::loop
 * minint->notEmpty() implies 
 * minint->asSequence()->first().integerValue() >= 0
 * maxint->notEmpty() implies 
 * maxint->asSequence()->first().integerValue() > 0
 * maxint->notEmpty() implies (minint->notEmpty() and 
 * maxint->asSequence()->first().integerValue() >=
 * minint->asSequence()->first().integerValue() )
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.InteractionConstraint#getMaxint <em>Maxint</em>}</li>
 *   <li>{@link uml.interactions.InteractionConstraint#getMinint <em>Minint</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getInteractionConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minint_maxint minint_non_negative maxint_positive dynamic_variables global_data maxint_greater_equal_minint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL minint_maxint='maxint->notEmpty() or minint->notEmpty() implies\r\ninteractionOperand.combinedFragment.interactionOperator =\r\nInteractionOperatorKind::loop' minint_non_negative='minint->notEmpty() implies \r\nminint->asSequence()->first().integerValue() >= 0' maxint_positive='maxint->notEmpty() implies \r\nmaxint->asSequence()->first().integerValue() > 0' maxint_greater_equal_minint='maxint->notEmpty() implies (minint->notEmpty() and \r\nmaxint->asSequence()->first().integerValue() >=\r\nminint->asSequence()->first().integerValue() )'"
 * @generated
 */
public interface InteractionConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Maxint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of iterations of a loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maxint</em>' containment reference.
	 * @see #setMaxint(ValueSpecification)
	 * @see uml.interactions.InteractionsPackage#getInteractionConstraint_Maxint()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interactionConstraint'"
	 * @generated
	 */
	ValueSpecification getMaxint();

	/**
	 * Sets the value of the '{@link uml.interactions.InteractionConstraint#getMaxint <em>Maxint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxint</em>' containment reference.
	 * @see #getMaxint()
	 * @generated
	 */
	void setMaxint(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Minint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum number of iterations of a loop
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minint</em>' containment reference.
	 * @see #setMinint(ValueSpecification)
	 * @see uml.interactions.InteractionsPackage#getInteractionConstraint_Minint()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interactionConstraint'"
	 * @generated
	 */
	ValueSpecification getMinint();

	/**
	 * Sets the value of the '{@link uml.interactions.InteractionConstraint#getMinint <em>Minint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minint</em>' containment reference.
	 * @see #getMinint()
	 * @generated
	 */
	void setMinint(ValueSpecification value);

} // InteractionConstraint
