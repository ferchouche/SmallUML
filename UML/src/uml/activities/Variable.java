/**
 */
package uml.activities;

import uml.actions.Action;
import uml.actions.StructuredActivityNode;

import uml.commonStructure.MultiplicityElement;

import uml.structuredClassifiers.ConnectableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Variable is a ConnectableElement that may store values during the execution of an Activity. Reading and writing the values of a Variable provides an alternative means for passing data than the use of ObjectFlows. A Variable may be owned directly by an Activity, in which case it is accessible from anywhere within that activity, or it may be owned by a StructuredActivityNode, in which case it is only accessible within that node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.Variable#getActivityScope <em>Activity Scope</em>}</li>
 *   <li>{@link uml.activities.Variable#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ConnectableElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Activity Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.Activity#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Activity that owns the Variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Scope</em>' container reference.
	 * @see #setActivityScope(Activity)
	 * @see uml.activities.ActivitiesPackage#getVariable_ActivityScope()
	 * @see uml.activities.Activity#getVariable
	 * @model opposite="variable" transient="false" ordered="false"
	 * @generated
	 */
	Activity getActivityScope();

	/**
	 * Sets the value of the '{@link uml.activities.Variable#getActivityScope <em>Activity Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Scope</em>' container reference.
	 * @see #getActivityScope()
	 * @generated
	 */
	void setActivityScope(Activity value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.actions.StructuredActivityNode#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A StructuredActivityNode that owns the Variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(StructuredActivityNode)
	 * @see uml.activities.ActivitiesPackage#getVariable_Scope()
	 * @see uml.actions.StructuredActivityNode#getVariable
	 * @model opposite="variable" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getScope();

	/**
	 * Sets the value of the '{@link uml.activities.Variable#getScope <em>Scope</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(StructuredActivityNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Variable is accessible by Actions within its scope (the Activity or StructuredActivityNode that owns it).
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" aRequired="true" aOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if scope<>null then scope.allOwnedNodes()->includes(a)\r\nelse a.containingActivity()=activityScope\r\nendif'"
	 * @generated
	 */
	boolean isAccessibleBy(Action a);

} // Variable
