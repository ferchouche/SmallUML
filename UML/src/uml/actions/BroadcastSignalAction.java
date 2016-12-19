/**
 */
package uml.actions;

import uml.simpleClassifiers.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Signal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BroadcastSignalAction is an InvocationAction that transmits a Signal instance to all the potential target objects in the system. Values from the argument InputPins are used to provide values for the attributes of the Signal. The requestor continues execution immediately after the Signal instances are sent out and cannot receive reply values.
 * argument->size() = signal.allAttributes()->size()
 * let attribute: OrderedSet(Property) = signal.allAttributes() in
 * Sequence{1..argument->size()}->forAll(i | 
 * 	argument->at(i).type.conformsTo(attribute->at(i).type) and 
 * 	argument->at(i).isOrdered = attribute->at(i).isOrdered and
 * 	argument->at(i).compatibleWith(attribute->at(i)))
 * onPort=null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.BroadcastSignalAction#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getBroadcastSignalAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='number_of_arguments type_ordering_multiplicity no_onport'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL number_of_arguments='argument->size() = signal.allAttributes()->size()' type_ordering_multiplicity='let attribute: OrderedSet(Property) = signal.allAttributes() in\r\nSequence{1..argument->size()}->forAll(i | \r\n\targument->at(i).type.conformsTo(attribute->at(i).type) and \r\n\targument->at(i).isOrdered = attribute->at(i).isOrdered and\r\n\targument->at(i).compatibleWith(attribute->at(i)))' no_onport='onPort=null'"
 * @generated
 */
public interface BroadcastSignalAction extends InvocationAction {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Signal whose instances are to be sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see uml.actions.ActionsPackage#getBroadcastSignalAction_Signal()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='broadcastSignalAction'"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link uml.actions.BroadcastSignalAction#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // BroadcastSignalAction
