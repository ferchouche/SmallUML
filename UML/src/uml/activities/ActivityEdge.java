/**
 */
package uml.activities;

import org.eclipse.emf.common.util.EList;

import uml.actions.StructuredActivityNode;

import uml.classification.RedefinableElement;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ActivityEdge is an abstract class for directed connections between two ActivityNodes.
 * activity<>null implies source.containingActivity() = activity and target.containingActivity() = activity
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.ActivityEdge#getGuard <em>Guard</em>}</li>
 *   <li>{@link uml.activities.ActivityEdge#getInGroup <em>In Group</em>}</li>
 *   <li>{@link uml.activities.ActivityEdge#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link uml.activities.ActivityEdge#getInPartition <em>In Partition</em>}</li>
 *   <li>{@link uml.activities.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link uml.activities.ActivityEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.activities.ActivityEdge#getSource <em>Source</em>}</li>
 *   <li>{@link uml.activities.ActivityEdge#getRedefinedEdge <em>Redefined Edge</em>}</li>
 *   <li>{@link uml.activities.ActivityEdge#getWeight <em>Weight</em>}</li>
 *   <li>{@link uml.activities.ActivityEdge#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getActivityEdge()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='source_and_target'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL source_and_target='activity<>null implies source.containingActivity() = activity and target.containingActivity() = activity'"
 * @generated
 */
public interface ActivityEdge extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification that is evaluated to determine if a token can traverse the ActivityEdge. If an ActivityEdge has no guard, then there is no restriction on tokens traversing the edge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(ValueSpecification)
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_Guard()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activityEdge'"
	 * @generated
	 */
	ValueSpecification getGuard();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityEdge#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>In Group</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityGroup#getContainedEdge <em>Contained Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityGroups containing the ActivityEdge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Group</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_InGroup()
	 * @see uml.activities.ActivityGroup#getContainedEdge
	 * @model opposite="containedEdge" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getInGroup();

	/**
	 * Returns the value of the '<em><b>Interrupts</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InterruptibleActivityRegion for which this ActivityEdge is an interruptingEdge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupts</em>' reference.
	 * @see #setInterrupts(InterruptibleActivityRegion)
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_Interrupts()
	 * @see uml.activities.InterruptibleActivityRegion#getInterruptingEdge
	 * @model opposite="interruptingEdge" ordered="false"
	 * @generated
	 */
	InterruptibleActivityRegion getInterrupts();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityEdge#getInterrupts <em>Interrupts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupts</em>' reference.
	 * @see #getInterrupts()
	 * @generated
	 */
	void setInterrupts(InterruptibleActivityRegion value);

	/**
	 * Returns the value of the '<em><b>In Partition</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityPartition#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityPartitions containing the ActivityEdge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Partition</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_InPartition()
	 * @see uml.activities.ActivityPartition#getEdge
	 * @model opposite="edge" ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getInPartition();

	/**
	 * Returns the value of the '<em><b>In Structured Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.actions.StructuredActivityNode#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StructuredActivityNode containing the ActivityEdge, if it is owned by a StructuredActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Structured Node</em>' container reference.
	 * @see #setInStructuredNode(StructuredActivityNode)
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_InStructuredNode()
	 * @see uml.actions.StructuredActivityNode#getEdge
	 * @model opposite="edge" transient="false" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getInStructuredNode();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Structured Node</em>' container reference.
	 * @see #getInStructuredNode()
	 * @generated
	 */
	void setInStructuredNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityNode to which tokens are put when they traverse the ActivityEdge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityNode)
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_Target()
	 * @see uml.activities.ActivityNode#getIncoming
	 * @model opposite="incoming" required="true" ordered="false"
	 * @generated
	 */
	ActivityNode getTarget();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityNode from which tokens are taken when they traverse the ActivityEdge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityNode)
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_Source()
	 * @see uml.activities.ActivityNode#getOutgoing
	 * @model opposite="outgoing" required="true" ordered="false"
	 * @generated
	 */
	ActivityNode getSource();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Redefined Edge</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges from a generalization of the Activity containing this ActivityEdge that are redefined by this ActivityEdge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Edge</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_RedefinedEdge()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activityEdge'"
	 * @generated
	 */
	EList<ActivityEdge> getRedefinedEdge();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum number of tokens that must traverse the ActivityEdge at the same time. If no weight is specified, this is equivalent to specifying a constant value of 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' containment reference.
	 * @see #setWeight(ValueSpecification)
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_Weight()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activityEdge'"
	 * @generated
	 */
	ValueSpecification getWeight();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityEdge#getWeight <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' containment reference.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.Activity#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activity containing the ActivityEdge, if it is directly owned by an Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see uml.activities.ActivitiesPackage#getActivityEdge_Activity()
	 * @see uml.activities.Activity#getEdge
	 * @model opposite="edge" transient="false" ordered="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityEdge#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // ActivityEdge
