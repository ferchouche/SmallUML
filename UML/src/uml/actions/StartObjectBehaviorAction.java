/**
 */
package uml.actions;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Object Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StartObjectBehaviorAction is an InvocationAction that starts the execution either of a directly instantiated Behavior or of the classifierBehavior of an object. Argument values may be supplied for the input Parameters of the Behavior. If the Behavior is invoked synchronously, then output values may be obtained for output Parameters.
 * object.is(1,1)
 * self.behavior()<>null
 * onPort->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.StartObjectBehaviorAction#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getStartObjectBehaviorAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity_of_object type_of_object no_onport'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity_of_object='object.is(1,1)' type_of_object='self.behavior()<>null' no_onport='onPort->isEmpty()'"
 * @generated
 */
public interface StartObjectBehaviorAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InputPin that holds the object that is either a Behavior to be started or has a classifierBehavior to be started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.actions.ActionsPackage#getStartObjectBehaviorAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='startObjectBehaviorAction'"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.actions.StartObjectBehaviorAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the type of the object InputPin is a Behavior, then that Behavior. Otherwise, if the type of the object InputPin is a BehavioredClassifier, then the classifierBehavior of that BehavioredClassifier.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if object.type.oclIsKindOf(Behavior) then\r\n  object.type.oclAsType(Behavior)\r\nelse if object.type.oclIsKindOf(BehavioredClassifier) then\r\n  object.type.oclAsType(BehavioredClassifier).classifierBehavior\r\nelse\r\n  null\r\nendif\r\nendif'"
	 * @generated
	 */
	Behavior behavior();

} // StartObjectBehaviorAction
