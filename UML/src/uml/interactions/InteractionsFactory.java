/**
 */
package uml.interactions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml.interactions.InteractionsPackage
 * @generated
 */
public interface InteractionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionsFactory eINSTANCE = uml.interactions.impl.InteractionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Execution Specification</em>'.
	 * @generated
	 */
	ActionExecutionSpecification createActionExecutionSpecification();

	/**
	 * Returns a new object of class '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lifeline</em>'.
	 * @generated
	 */
	Lifeline createLifeline();

	/**
	 * Returns a new object of class '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part Decomposition</em>'.
	 * @generated
	 */
	PartDecomposition createPartDecomposition();

	/**
	 * Returns a new object of class '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Use</em>'.
	 * @generated
	 */
	InteractionUse createInteractionUse();

	/**
	 * Returns a new object of class '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate</em>'.
	 * @generated
	 */
	Gate createGate();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction</em>'.
	 * @generated
	 */
	Interaction createInteraction();

	/**
	 * Returns a new object of class '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Operand</em>'.
	 * @generated
	 */
	InteractionOperand createInteractionOperand();

	/**
	 * Returns a new object of class '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Constraint</em>'.
	 * @generated
	 */
	InteractionConstraint createInteractionConstraint();

	/**
	 * Returns a new object of class '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Ordering</em>'.
	 * @generated
	 */
	GeneralOrdering createGeneralOrdering();

	/**
	 * Returns a new object of class '<em>Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occurrence Specification</em>'.
	 * @generated
	 */
	OccurrenceSpecification createOccurrenceSpecification();

	/**
	 * Returns a new object of class '<em>Behavior Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Execution Specification</em>'.
	 * @generated
	 */
	BehaviorExecutionSpecification createBehaviorExecutionSpecification();

	/**
	 * Returns a new object of class '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Fragment</em>'.
	 * @generated
	 */
	CombinedFragment createCombinedFragment();

	/**
	 * Returns a new object of class '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consider Ignore Fragment</em>'.
	 * @generated
	 */
	ConsiderIgnoreFragment createConsiderIgnoreFragment();

	/**
	 * Returns a new object of class '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuation</em>'.
	 * @generated
	 */
	Continuation createContinuation();

	/**
	 * Returns a new object of class '<em>Destruction Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destruction Occurrence Specification</em>'.
	 * @generated
	 */
	DestructionOccurrenceSpecification createDestructionOccurrenceSpecification();

	/**
	 * Returns a new object of class '<em>Message Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Occurrence Specification</em>'.
	 * @generated
	 */
	MessageOccurrenceSpecification createMessageOccurrenceSpecification();

	/**
	 * Returns a new object of class '<em>Execution Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Occurrence Specification</em>'.
	 * @generated
	 */
	ExecutionOccurrenceSpecification createExecutionOccurrenceSpecification();

	/**
	 * Returns a new object of class '<em>State Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Invariant</em>'.
	 * @generated
	 */
	StateInvariant createStateInvariant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InteractionsPackage getInteractionsPackage();

} //InteractionsFactory
