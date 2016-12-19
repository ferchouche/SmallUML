/**
 */
package uml.interactions;

import uml.actions.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ActionExecutionSpecification is a kind of ExecutionSpecification representing the execution of an Action.
 * (enclosingInteraction->notEmpty() or enclosingOperand.combinedFragment->notEmpty()) and
 * let parentInteraction : Set(Interaction) = enclosingInteraction.oclAsType(Interaction)->asSet()->union(
 * enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->
 * collect(enclosingInteraction).oclAsType(Interaction)->asSet()) in
 * (parentInteraction->size() = 1) and self.action.interaction->asSet() = parentInteraction
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.ActionExecutionSpecification#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getActionExecutionSpecification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='action_referenced'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL action_referenced='(enclosingInteraction->notEmpty() or enclosingOperand.combinedFragment->notEmpty()) and\r\nlet parentInteraction : Set(Interaction) = enclosingInteraction.oclAsType(Interaction)->asSet()->union(\r\nenclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->\r\ncollect(enclosingInteraction).oclAsType(Interaction)->asSet()) in\r\n(parentInteraction->size() = 1) and self.action.interaction->asSet() = parentInteraction'"
 * @generated
 */
public interface ActionExecutionSpecification extends ExecutionSpecification {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action whose execution is occurring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see uml.interactions.InteractionsPackage#getActionExecutionSpecification_Action()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actionExecutionSpecification'"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link uml.interactions.ActionExecutionSpecification#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // ActionExecutionSpecification
