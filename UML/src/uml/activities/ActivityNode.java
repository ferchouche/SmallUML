/**
 */
package uml.activities;

import org.eclipse.emf.common.util.EList;

import uml.actions.StructuredActivityNode;

import uml.classification.RedefinableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ActivityNode is an abstract class for points in the flow of an Activity connected by ActivityEdges.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link uml.activities.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link uml.activities.ActivityNode#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link uml.activities.ActivityNode#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link uml.activities.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link uml.activities.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link uml.activities.ActivityNode#getRedefinedNode <em>Redefined Node</em>}</li>
 *   <li>{@link uml.activities.ActivityNode#getInGroup <em>In Group</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.Activity#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activity containing the ActivityNode, if it is directly owned by an Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see uml.activities.ActivitiesPackage#getActivityNode_Activity()
	 * @see uml.activities.Activity#getNode
	 * @model opposite="node" transient="false" ordered="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>In Interruptible Region</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.InterruptibleActivityRegion}.
	 * It is bidirectional and its opposite is '{@link uml.activities.InterruptibleActivityRegion#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InterruptibleActivityRegions containing the ActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Interruptible Region</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityNode_InInterruptibleRegion()
	 * @see uml.activities.InterruptibleActivityRegion#getNode
	 * @model opposite="node" ordered="false"
	 * @generated
	 */
	EList<InterruptibleActivityRegion> getInInterruptibleRegion();

	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityPartition#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityPartitions containing the ActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityNode_InPartition()
	 * @see uml.activities.ActivityPartition#getNode
	 * @model opposite="node" ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.actions.StructuredActivityNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StructuredActivityNode containing the ActvityNode, if it is directly owned by a StructuredActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see uml.activities.ActivitiesPackage#getActivityNode_InStructuredNode()
	 * @see uml.actions.StructuredActivityNode#getNode
	 * @model opposite="node" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityNode#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges that have the ActivityNode as their target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityNode_Incoming()
	 * @see uml.activities.ActivityEdge#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges that have the ActivityNode as their source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityNode_Outgoing()
	 * @see uml.activities.ActivityEdge#getSource
	 * @model opposite="source" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Redefined Node</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityNodes from a generalization of the Activity containining this ActivityNode that are redefined by this ActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Node</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityNode_RedefinedNode()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activityNode'"
	 * @generated
	 */
	EList<ActivityNode> getRedefinedNode();

	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityGroup#getContainedNode <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityGroups containing the ActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityNode_InGroup()
	 * @see uml.activities.ActivityGroup#getContainedNode
	 * @model opposite="containedNode" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getInGroup();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activity that directly or indirectly contains this ActivityNode.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if inStructuredNode<>null then inStructuredNode.containingActivity()\r\nelse activity\r\nendif'"
	 * @generated
	 */
	Activity ActivityNode_containingActivity();

} // ActivityNode
