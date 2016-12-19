/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AcceptCallAction is an AcceptEventAction that handles the receipt of a synchronous call request. In addition to the values from the Operation input parameters, the Action produces an output that is needed later to supply the information to the ReplyAction necessary to return control to the caller. An AcceptCallAction is for synchronous calls. If it is used to handle an asynchronous call, execution of the subsequent ReplyAction will complete immediately with no effect.
 * let parameter: OrderedSet(Parameter) = trigger.event->asSequence()->first().oclAsType(CallEvent).operation.inputParameters() in
 * result->size() = parameter->size() and
 * Sequence{1..result->size()}->forAll(i | 
 * 	parameter->at(i).type.conformsTo(result->at(i).type) and 
 * 	parameter->at(i).isOrdered = result->at(i).isOrdered and
 * 	parameter->at(i).compatibleWith(result->at(i)))
 * trigger->size()=1 and
 * trigger->asSequence()->first().event.oclIsKindOf(CallEvent)
 * 
 * isUnmarshall = true
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.AcceptCallAction#getReturnInformation <em>Return Information</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getAcceptCallAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='result_pins trigger_call_event unmarshall'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL result_pins='let parameter: OrderedSet(Parameter) = trigger.event->asSequence()->first().oclAsType(CallEvent).operation.inputParameters() in\r\nresult->size() = parameter->size() and\r\nSequence{1..result->size()}->forAll(i | \r\n\tparameter->at(i).type.conformsTo(result->at(i).type) and \r\n\tparameter->at(i).isOrdered = result->at(i).isOrdered and\r\n\tparameter->at(i).compatibleWith(result->at(i)))' trigger_call_event='trigger->size()=1 and\r\ntrigger->asSequence()->first().event.oclIsKindOf(CallEvent)\r\n' unmarshall='isUnmarshall = true'"
 * @generated
 */
public interface AcceptCallAction extends AcceptEventAction {
	/**
	 * Returns the value of the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OutputPin where a value is placed containing sufficient information to perform a subsequent ReplyAction and return control to the caller. The contents of this value are opaque. It can be passed and copied but it cannot be manipulated by the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Information</em>' containment reference.
	 * @see #setReturnInformation(OutputPin)
	 * @see uml.actions.ActionsPackage#getAcceptCallAction_ReturnInformation()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='acceptCallAction'"
	 * @generated
	 */
	OutputPin getReturnInformation();

	/**
	 * Sets the value of the '{@link uml.actions.AcceptCallAction#getReturnInformation <em>Return Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Information</em>' containment reference.
	 * @see #getReturnInformation()
	 * @generated
	 */
	void setReturnInformation(OutputPin value);

} // AcceptCallAction
