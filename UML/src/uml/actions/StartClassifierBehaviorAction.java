/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Classifier Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StartClassifierBehaviorAction is an Action that starts the classifierBehavior of the input object.
 * object.is(1,1)
 * object.type->notEmpty() implies 
 *    (object.type.oclIsKindOf(BehavioredClassifier) and object.type.oclAsType(BehavioredClassifier).classifierBehavior<>null)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.StartClassifierBehaviorAction#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getStartClassifierBehaviorAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity type_has_classifier'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity='object.is(1,1)' type_has_classifier='object.type->notEmpty() implies \r\n   (object.type.oclIsKindOf(BehavioredClassifier) and object.type.oclAsType(BehavioredClassifier).classifierBehavior<>null)'"
 * @generated
 */
public interface StartClassifierBehaviorAction extends Action {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that holds the object whose classifierBehavior is to be started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.actions.ActionsPackage#getStartClassifierBehaviorAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='startClassifierBehaviorAction'"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.actions.StartClassifierBehaviorAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

} // StartClassifierBehaviorAction
