/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.commonBehavior.Trigger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AcceptEventAction is an Action that waits for the occurrence of one or more specific Events.
 * not isUnmarshall and trigger->exists(event.oclIsKindOf(SignalEvent) or event.oclIsKindOf(TimeEvent)) implies 
 * 	output->size() = 1 and output->first().is(1,1)
 * input->size() = 0
 * (self.oclIsTypeOf(AcceptEventAction) and
 *    (trigger->forAll(event.oclIsKindOf(ChangeEvent) or  
 *                              event.oclIsKindOf(CallEvent))))
 * implies output->size() = 0
 * isUnmarshall and self.oclIsTypeOf(AcceptEventAction) implies
 * 	trigger->size()=1 and
 * 	trigger->asSequence()->first().event.oclIsKindOf(SignalEvent) and
 * 	let attribute: OrderedSet(Property) = trigger->asSequence()->first().event.oclAsType(SignalEvent).signal.allAttributes() in
 * 	attribute->size()>0 and result->size() = attribute->size() and
 * 	Sequence{1..result->size()}->forAll(i | 
 * 		result->at(i).type = attribute->at(i).type and 
 * 		result->at(i).isOrdered = attribute->at(i).isOrdered and
 * 		result->at(i).includesMultiplicity(attribute->at(i)))
 * not isUnmarshall implies 
 * 	result->isEmpty() or
 * 	let type: Type = result->first().type in
 * 	type=null or 
 * 		(trigger->forAll(event.oclIsKindOf(SignalEvent)) and 
 * 		 trigger.event.oclAsType(SignalEvent).signal->forAll(s | s.conformsTo(type)))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.AcceptEventAction#isIsUnmarshall <em>Is Unmarshall</em>}</li>
 *   <li>{@link uml.actions.AcceptEventAction#getResult <em>Result</em>}</li>
 *   <li>{@link uml.actions.AcceptEventAction#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getAcceptEventAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='one_output_pin no_input_pins no_output_pins unmarshall_signal_events conforming_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL one_output_pin='not isUnmarshall and trigger->exists(event.oclIsKindOf(SignalEvent) or event.oclIsKindOf(TimeEvent)) implies \r\n\toutput->size() = 1 and output->first().is(1,1)' no_input_pins='input->size() = 0' no_output_pins='(self.oclIsTypeOf(AcceptEventAction) and\r\n   (trigger->forAll(event.oclIsKindOf(ChangeEvent) or  \r\n                             event.oclIsKindOf(CallEvent))))\r\nimplies output->size() = 0' unmarshall_signal_events='isUnmarshall and self.oclIsTypeOf(AcceptEventAction) implies\r\n\ttrigger->size()=1 and\r\n\ttrigger->asSequence()->first().event.oclIsKindOf(SignalEvent) and\r\n\tlet attribute: OrderedSet(Property) = trigger->asSequence()->first().event.oclAsType(SignalEvent).signal.allAttributes() in\r\n\tattribute->size()>0 and result->size() = attribute->size() and\r\n\tSequence{1..result->size()}->forAll(i | \r\n\t\tresult->at(i).type = attribute->at(i).type and \r\n\t\tresult->at(i).isOrdered = attribute->at(i).isOrdered and\r\n\t\tresult->at(i).includesMultiplicity(attribute->at(i)))' conforming_type='not isUnmarshall implies \r\n\tresult->isEmpty() or\r\n\tlet type: Type = result->first().type in\r\n\ttype=null or \r\n\t\t(trigger->forAll(event.oclIsKindOf(SignalEvent)) and \r\n\t\t trigger.event.oclAsType(SignalEvent).signal->forAll(s | s.conformsTo(type)))'"
 * @generated
 */
public interface AcceptEventAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Unmarshall</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether there is a single OutputPin for a SignalEvent occurrence, or multiple OutputPins for attribute values of the instance of the Signal associated with a SignalEvent occurrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #setIsUnmarshall(boolean)
	 * @see uml.actions.ActionsPackage#getAcceptEventAction_IsUnmarshall()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnmarshall();

	/**
	 * Sets the value of the '{@link uml.actions.AcceptEventAction#isIsUnmarshall <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unmarshall</em>' attribute.
	 * @see #isIsUnmarshall()
	 * @generated
	 */
	void setIsUnmarshall(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OutputPins holding the values received from an Event occurrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getAcceptEventAction_Result()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='acceptEventAction'"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonBehavior.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Triggers specifying the Events of which the AcceptEventAction waits for occurrences.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getAcceptEventAction_Trigger()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='acceptEventAction'"
	 * @generated
	 */
	EList<Trigger> getTrigger();

} // AcceptEventAction
