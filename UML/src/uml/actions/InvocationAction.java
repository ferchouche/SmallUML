/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.structuredClassifiers.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InvocationAction is an abstract class for the various actions that request Behavior invocation.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.InvocationAction#getArgument <em>Argument</em>}</li>
 *   <li>{@link uml.actions.InvocationAction#getOnPort <em>On Port</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getInvocationAction()
 * @model abstract="true"
 * @generated
 */
public interface InvocationAction extends Action {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPins that provide the argument values passed in the invocation request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getInvocationAction_Argument()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invocationAction'"
	 * @generated
	 */
	EList<InputPin> getArgument();

	/**
	 * Returns the value of the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For CallOperationActions, SendSignalActions, and SendObjectActions, an optional Port of the target object through which the invocation request is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Port</em>' reference.
	 * @see #setOnPort(Port)
	 * @see uml.actions.ActionsPackage#getInvocationAction_OnPort()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invocationAction'"
	 * @generated
	 */
	Port getOnPort();

	/**
	 * Sets the value of the '{@link uml.actions.InvocationAction#getOnPort <em>On Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Port</em>' reference.
	 * @see #getOnPort()
	 * @generated
	 */
	void setOnPort(Port value);

} // InvocationAction
