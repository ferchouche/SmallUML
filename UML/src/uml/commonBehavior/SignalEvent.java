/**
 */
package uml.commonBehavior;

import uml.simpleClassifiers.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SignalEvent represents the receipt of an asynchronous Signal instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonBehavior.SignalEvent#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see uml.commonBehavior.CommonBehaviorPackage#getSignalEvent()
 * @model
 * @generated
 */
public interface SignalEvent extends MessageEvent {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific Signal that is associated with this SignalEvent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see uml.commonBehavior.CommonBehaviorPackage#getSignalEvent_Signal()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='signalEvent'"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link uml.commonBehavior.SignalEvent#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // SignalEvent
