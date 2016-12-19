/**
 */
package uml.commonBehavior;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ChangeEvent models a change in the system configuration that makes a condition true.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonBehavior.ChangeEvent#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 *
 * @see uml.commonBehavior.CommonBehaviorPackage#getChangeEvent()
 * @model
 * @generated
 */
public interface ChangeEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Change Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean-valued ValueSpecification that will result in a ChangeEvent whenever its value changes from false to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Change Expression</em>' containment reference.
	 * @see #setChangeExpression(ValueSpecification)
	 * @see uml.commonBehavior.CommonBehaviorPackage#getChangeEvent_ChangeExpression()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='changeEvent'"
	 * @generated
	 */
	ValueSpecification getChangeExpression();

	/**
	 * Sets the value of the '{@link uml.commonBehavior.ChangeEvent#getChangeExpression <em>Change Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Expression</em>' containment reference.
	 * @see #getChangeExpression()
	 * @generated
	 */
	void setChangeExpression(ValueSpecification value);

} // ChangeEvent
