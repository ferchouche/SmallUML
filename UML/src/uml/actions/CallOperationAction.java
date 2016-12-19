/**
 */
package uml.actions;

import uml.classification.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Operation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CallOperationAction is a CallAction that transmits an Operation call request to the target object, where it may cause the invocation of associated Behavior. The argument values of the CallOperationAction are passed on the input Parameters of the Operation. If call is synchronous, the execution of the CallOperationAction waits until the execution of the invoked Operation completes and the values of output Parameters of the Operation are placed on the result OutputPins. If the call is asynchronous, the CallOperationAction completes immediately and no results values can be provided.
 * if onPort=null then  target.type.oclAsType(Classifier).allFeatures()->includes(operation)
 * else target.type.oclAsType(Classifier).allFeatures()->includes(onPort) and onPort.provided->union(onPort.required).allFeatures()->includes(operation)
 * endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.CallOperationAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link uml.actions.CallOperationAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getCallOperationAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='type_target_pin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL type_target_pin='if onPort=null then  target.type.oclAsType(Classifier).allFeatures()->includes(operation)\r\nelse target.type.oclAsType(Classifier).allFeatures()->includes(onPort) and onPort.provided->union(onPort.required).allFeatures()->includes(operation)\r\nendif'"
 * @generated
 */
public interface CallOperationAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operation being invoked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see uml.actions.ActionsPackage#getCallOperationAction_Operation()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='callOperationAction'"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link uml.actions.CallOperationAction#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that provides the target object to which the Operation call request is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see uml.actions.ActionsPackage#getCallOperationAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='callOperationAction'"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link uml.actions.CallOperationAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

} // CallOperationAction
