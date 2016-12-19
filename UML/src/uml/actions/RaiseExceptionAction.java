/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exception Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RaiseExceptionAction is an Action that causes an exception to occur. The input value becomes the exception object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.RaiseExceptionAction#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getRaiseExceptionAction()
 * @model
 * @generated
 */
public interface RaiseExceptionAction extends Action {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InputPin whose value becomes the exception object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(InputPin)
	 * @see uml.actions.ActionsPackage#getRaiseExceptionAction_Exception()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='raiseExceptionAction'"
	 * @generated
	 */
	InputPin getException();

	/**
	 * Sets the value of the '{@link uml.actions.RaiseExceptionAction#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(InputPin value);

} // RaiseExceptionAction
