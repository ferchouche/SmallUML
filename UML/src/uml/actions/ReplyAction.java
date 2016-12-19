/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.commonBehavior.Trigger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reply Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReplyAction is an Action that accepts a set of reply values and a value containing return information produced by a previous AcceptCallAction. The ReplyAction returns the values to the caller of the previous call, completing execution of the call.
 * let parameter:OrderedSet(Parameter) = replyToCall.event.oclAsType(CallEvent).operation.outputParameters() in
 * replyValue->size()=parameter->size() and
 * Sequence{1..replyValue->size()}->forAll(i |
 * 	replyValue->at(i).type.conformsTo(parameter->at(i).type) and
 * 	replyValue->at(i).isOrdered=parameter->at(i).isOrdered and
 * 	replyValue->at(i).compatibleWith(parameter->at(i)))
 * replyToCall.event.oclIsKindOf(CallEvent)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReplyAction#getReplyToCall <em>Reply To Call</em>}</li>
 *   <li>{@link uml.actions.ReplyAction#getReplyValue <em>Reply Value</em>}</li>
 *   <li>{@link uml.actions.ReplyAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReplyAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='pins_match_parameter event_on_reply_to_call_trigger'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL pins_match_parameter='let parameter:OrderedSet(Parameter) = replyToCall.event.oclAsType(CallEvent).operation.outputParameters() in\r\nreplyValue->size()=parameter->size() and\r\nSequence{1..replyValue->size()}->forAll(i |\r\n\treplyValue->at(i).type.conformsTo(parameter->at(i).type) and\r\n\treplyValue->at(i).isOrdered=parameter->at(i).isOrdered and\r\n\treplyValue->at(i).compatibleWith(parameter->at(i)))' event_on_reply_to_call_trigger='replyToCall.event.oclIsKindOf(CallEvent)'"
 * @generated
 */
public interface ReplyAction extends Action {
	/**
	 * Returns the value of the '<em><b>Reply To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Trigger specifying the Operation whose call is being replied to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reply To Call</em>' reference.
	 * @see #setReplyToCall(Trigger)
	 * @see uml.actions.ActionsPackage#getReplyAction_ReplyToCall()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='replyAction'"
	 * @generated
	 */
	Trigger getReplyToCall();

	/**
	 * Sets the value of the '{@link uml.actions.ReplyAction#getReplyToCall <em>Reply To Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To Call</em>' reference.
	 * @see #getReplyToCall()
	 * @generated
	 */
	void setReplyToCall(Trigger value);

	/**
	 * Returns the value of the '<em><b>Reply Value</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of InputPins providing the values for the output (inout, out, and return) Parameters of the Operation. These values are returned to the caller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reply Value</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getReplyAction_ReplyValue()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='replyAction'"
	 * @generated
	 */
	EList<InputPin> getReplyValue();

	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InputPin that holds the return information value produced by an earlier AcceptCallAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Information</em>' containment reference.
	 * @see #setReturnInformation(InputPin)
	 * @see uml.actions.ActionsPackage#getReplyAction_ReturnInformation()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='replyAction'"
	 * @generated
	 */
	InputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link uml.actions.ReplyAction#getReturnInformation <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' containment reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(InputPin value);

} // ReplyAction
