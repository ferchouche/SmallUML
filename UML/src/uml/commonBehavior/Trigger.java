/**
 */
package uml.commonBehavior;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

import uml.structuredClassifiers.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Trigger specifies a specific point  at which an Event occurrence may trigger an effect in a Behavior. A Trigger may be qualified by the Port on which the Event occurred.
 * port->notEmpty() implies event.oclIsKindOf(MessageEvent)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonBehavior.Trigger#getEvent <em>Event</em>}</li>
 *   <li>{@link uml.commonBehavior.Trigger#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see uml.commonBehavior.CommonBehaviorPackage#getTrigger()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='trigger_with_ports'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL trigger_with_ports='port->notEmpty() implies event.oclIsKindOf(MessageEvent)'"
 * @generated
 */
public interface Trigger extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Event that detected by the Trigger.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see uml.commonBehavior.CommonBehaviorPackage#getTrigger_Event()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='trigger'"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link uml.commonBehavior.Trigger#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A optional Port of through which the given effect is detected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see uml.commonBehavior.CommonBehaviorPackage#getTrigger_Port()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='trigger'"
	 * @generated
	 */
	EList<Port> getPort();

} // Trigger
