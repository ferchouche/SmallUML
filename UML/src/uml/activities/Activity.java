/**
 */
package uml.activities;

import org.eclipse.emf.common.util.EList;

import uml.actions.StructuredActivityNode;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Activity is the specification of parameterized Behavior as the coordinated sequencing of subordinate units.
 * ownedParameter->forAll(p | 
 *    p.direction <> ParameterDirectionKind::inout implies node->select(
 *        oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p)->size()= 1)
 * ownedParameter->forAll(p | 
 * p.direction = ParameterDirectionKind::inout implies
 * let associatedNodes : Set(ActivityNode) = node->select(
 *        oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p) in 
 *   associatedNodes->size()=2 and
 *   associatedNodes->select(incoming->notEmpty())->size()<=1 and
 *   associatedNodes->select(outgoing->notEmpty())->size()<=1
 * )
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.Activity#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml.activities.Activity#getNode <em>Node</em>}</li>
 *   <li>{@link uml.activities.Activity#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml.activities.Activity#getStructuredNode <em>Structured Node</em>}</li>
 *   <li>{@link uml.activities.Activity#getGroup <em>Group</em>}</li>
 *   <li>{@link uml.activities.Activity#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link uml.activities.Activity#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link uml.activities.Activity#getPartition <em>Partition</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getActivity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maximum_one_parameter_node maximum_two_parameter_nodes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL maximum_one_parameter_node='ownedParameter->forAll(p | \r\n   p.direction <> ParameterDirectionKind::inout implies node->select(\r\n       oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p)->size()= 1)' maximum_two_parameter_nodes='ownedParameter->forAll(p | \r\np.direction = ParameterDirectionKind::inout implies\r\nlet associatedNodes : Set(ActivityNode) = node->select(\r\n       oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p) in \r\n  associatedNodes->size()=2 and\r\n  associatedNodes->select(incoming->notEmpty())->size()<=1 and\r\n  associatedNodes->select(outgoing->notEmpty())->size()<=1\r\n)\r\n'"
 * @generated
 */
public interface Activity extends Behavior {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link uml.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityEdge#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges expressing flow between the nodes of the Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see uml.activities.ActivitiesPackage#getActivity_Edge()
	 * @see uml.activities.ActivityEdge#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link uml.activities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityNodes coordinated by the Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see uml.activities.ActivitiesPackage#getActivity_Node()
	 * @see uml.activities.ActivityNode#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link uml.activities.Variable}.
	 * It is bidirectional and its opposite is '{@link uml.activities.Variable#getActivityScope <em>Activity Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level Variables defined by the Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see uml.activities.ActivitiesPackage#getActivity_Variable()
	 * @see uml.activities.Variable#getActivityScope
	 * @model opposite="activityScope" containment="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Structured Node</b></em>' reference list.
	 * The list contents are of type {@link uml.actions.StructuredActivityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level StructuredActivityNodes in the Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Node</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivity_StructuredNode()
	 * @model volatile="true" ordered="false"
	 * @generated
	 */
	EList<StructuredActivityNode> getStructuredNode();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link uml.activities.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityGroup#getInActivity <em>In Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level ActivityGroups in the Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see uml.activities.ActivitiesPackage#getActivity_Group()
	 * @see uml.activities.ActivityGroup#getInActivity
	 * @model opposite="inActivity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this Activity must not make any changes to objects. The default is false (an Activity may make nonlocal changes). (This is an assertion, not an executable property. It may be used by an execution engine to optimize model execution. If the assertion is violated by the Activity, then the model is ill-formed.) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see uml.activities.ActivitiesPackage#getActivity_IsReadOnly()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link uml.activities.Activity#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Single Execution</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, all invocations of the Activity are handled by the same execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Single Execution</em>' attribute.
	 * @see #setIsSingleExecution(boolean)
	 * @see uml.activities.ActivitiesPackage#getActivity_IsSingleExecution()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsSingleExecution();

	/**
	 * Sets the value of the '{@link uml.activities.Activity#isIsSingleExecution <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Execution</em>' attribute.
	 * @see #isIsSingleExecution()
	 * @generated
	 */
	void setIsSingleExecution(boolean value);

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level ActivityPartitions in the Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivity_Partition()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activity'"
	 * @generated
	 */
	EList<ActivityPartition> getPartition();

} // Activity
