/**
 */
package uml.actions;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CallBehaviorAction is a CallAction that invokes a Behavior directly. The argument values of the CallBehaviorAction are passed on the input Parameters of the invoked Behavior. If the call is synchronous, the execution of the CallBehaviorAction waits until the execution of the invoked Behavior completes and the values of output Parameters of the Behavior are placed on the result OutputPins. If the call is asynchronous, the CallBehaviorAction completes immediately and no results values can be provided.
 * onPort=null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.CallBehaviorAction#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getCallBehaviorAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_onport'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL no_onport='onPort=null'"
 * @generated
 */
public interface CallBehaviorAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Behavior being invoked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see uml.actions.ActionsPackage#getCallBehaviorAction_Behavior()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='callBehaviorAction'"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link uml.actions.CallBehaviorAction#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // CallBehaviorAction
