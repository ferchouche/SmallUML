/**
 */
package uml.commonBehavior;

import uml.values.TimeExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeEvent is an Event that occurs at a specific point in time.
 * when.integerValue() >= 0
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonBehavior.TimeEvent#isIsRelative <em>Is Relative</em>}</li>
 *   <li>{@link uml.commonBehavior.TimeEvent#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @see uml.commonBehavior.CommonBehaviorPackage#getTimeEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='when_non_negative'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL when_non_negative='when.integerValue() >= 0'"
 * @generated
 */
public interface TimeEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the TimeEvent is specified as an absolute or relative time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see uml.commonBehavior.CommonBehaviorPackage#getTimeEvent_IsRelative()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRelative();

	/**
	 * Sets the value of the '{@link uml.commonBehavior.TimeEvent#isIsRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isIsRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the time of the TimeEvent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(TimeExpression)
	 * @see uml.commonBehavior.CommonBehaviorPackage#getTimeEvent_When()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='timeEvent'"
	 * @generated
	 */
	TimeExpression getWhen();

	/**
	 * Sets the value of the '{@link uml.commonBehavior.TimeEvent#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(TimeExpression value);

} // TimeEvent
