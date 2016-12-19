/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SendObjectAction is an InvocationAction that transmits an input object to the target object, which is handled as a request message by the target object. The requestor continues execution immediately after the object is sent out and cannot receive reply values.
 * onPort<>null implies target.type.oclAsType(Classifier).allFeatures()->includes(onPort)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.SendObjectAction#getRequest <em>Request</em>}</li>
 *   <li>{@link uml.actions.SendObjectAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getSendObjectAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='type_target_pin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL type_target_pin='onPort<>null implies target.type.oclAsType(Classifier).allFeatures()->includes(onPort)'"
 * @generated
 */
public interface SendObjectAction extends InvocationAction {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request object, which is transmitted to the target object. The object may be copied in transmission, so identity might not be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(InputPin)
	 * @see uml.actions.ActionsPackage#getSendObjectAction_Request()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sendObjectAction'"
	 * @generated
	 */
	InputPin getRequest();

	/**
	 * Sets the value of the '{@link uml.actions.SendObjectAction#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(InputPin value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target object to which the object is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see uml.actions.ActionsPackage#getSendObjectAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sendObjectAction'"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link uml.actions.SendObjectAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

} // SendObjectAction
