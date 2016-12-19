/**
 */
package uml.actions;

import uml.simpleClassifiers.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Signal Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SendSignalAction is an InvocationAction that creates a Signal instance and transmits it to the target object. Values from the argument InputPins are used to provide values for the attributes of the Signal. The requestor continues execution immediately after the Signal instance is sent out and cannot receive reply values.
 * let attribute: OrderedSet(Property) = signal.allAttributes() in
 * Sequence{1..argument->size()}->forAll(i | 
 * 	argument->at(i).type.conformsTo(attribute->at(i).type) and 
 * 	argument->at(i).isOrdered = attribute->at(i).isOrdered and
 * 	argument->at(i).compatibleWith(attribute->at(i)))
 * argument->size()=signal.allAttributes()->size()
 * not onPort->isEmpty() implies target.type.oclAsType(Classifier).allFeatures()->includes(onPort)
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.SendSignalAction#getSignal <em>Signal</em>}</li>
 *   <li>{@link uml.actions.SendSignalAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getSendSignalAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='type_ordering_multiplicity number_order type_target_pin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL type_ordering_multiplicity='let attribute: OrderedSet(Property) = signal.allAttributes() in\r\nSequence{1..argument->size()}->forAll(i | \r\n\targument->at(i).type.conformsTo(attribute->at(i).type) and \r\n\targument->at(i).isOrdered = attribute->at(i).isOrdered and\r\n\targument->at(i).compatibleWith(attribute->at(i)))' number_order='argument->size()=signal.allAttributes()->size()' type_target_pin='not onPort->isEmpty() implies target.type.oclAsType(Classifier).allFeatures()->includes(onPort)\r\n'"
 * @generated
 */
public interface SendSignalAction extends InvocationAction {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Signal whose instance is transmitted to the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see uml.actions.ActionsPackage#getSendSignalAction_Signal()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sendSignalAction'"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link uml.actions.SendSignalAction#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that provides the target object to which the Signal instance is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see uml.actions.ActionsPackage#getSendSignalAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sendSignalAction'"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link uml.actions.SendSignalAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

} // SendSignalAction
