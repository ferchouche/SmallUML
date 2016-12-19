/**
 */
package uml.activities;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ActivityGroup is an abstract class for defining sets of ActivityNodes and ActivityEdges in an Activity.
 * containedNode->forAll(activity = self.containingActivity()) and 
 * containedEdge->forAll(activity = self.containingActivity())
 * subgroup->closure(subgroup).containedNode->excludesAll(containedNode) and
 * superGroup->closure(superGroup).containedNode->excludesAll(containedNode) and 
 * subgroup->closure(subgroup).containedEdge->excludesAll(containedEdge) and 
 * superGroup->closure(superGroup).containedEdge->excludesAll(containedEdge)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.ActivityGroup#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link uml.activities.ActivityGroup#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link uml.activities.ActivityGroup#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link uml.activities.ActivityGroup#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link uml.activities.ActivityGroup#getContainedEdge <em>Contained Edge</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getActivityGroup()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nodes_and_edges not_contained'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL nodes_and_edges='containedNode->forAll(activity = self.containingActivity()) and \r\ncontainedEdge->forAll(activity = self.containingActivity())' not_contained='subgroup->closure(subgroup).containedNode->excludesAll(containedNode) and\r\nsuperGroup->closure(superGroup).containedNode->excludesAll(containedNode) and \r\nsubgroup->closure(subgroup).containedEdge->excludesAll(containedEdge) and \r\nsuperGroup->closure(superGroup).containedEdge->excludesAll(containedEdge)'"
 * @generated
 */
public interface ActivityGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityNode#getInGroup <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityNodes immediately contained in the ActivityGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityGroup_ContainedNode()
	 * @see uml.activities.ActivityNode#getInGroup
	 * @model opposite="inGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getContainedNode();

	/**
	 * Returns the value of the '<em><b>In Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.Activity#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activity containing the ActivityGroup, if it is directly owned by an Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Activity</em>' container reference.
	 * @see #setInActivity(Activity)
	 * @see uml.activities.ActivitiesPackage#getActivityGroup_InActivity()
	 * @see uml.activities.Activity#getGroup
	 * @model opposite="group" transient="false" ordered="false"
	 * @generated
	 */
	Activity getInActivity();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityGroup#getInActivity <em>In Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Activity</em>' container reference.
	 * @see #getInActivity()
	 * @generated
	 */
	void setInActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityGroup#getSuperGroup <em>Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other ActivityGroups immediately contained in this ActivityGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subgroup</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityGroup_Subgroup()
	 * @see uml.activities.ActivityGroup#getSuperGroup
	 * @model opposite="superGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getSubgroup();

	/**
	 * Returns the value of the '<em><b>Super Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityGroup#getSubgroup <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityGroup immediately containing this ActivityGroup, if it is directly owned by another ActivityGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Group</em>' reference.
	 * @see uml.activities.ActivitiesPackage#getActivityGroup_SuperGroup()
	 * @see uml.activities.ActivityGroup#getSubgroup
	 * @model opposite="subgroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ActivityGroup getSuperGroup();

	/**
	 * Returns the value of the '<em><b>Contained Edge</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityEdge#getInGroup <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges immediately contained in the ActivityGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Edge</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityGroup_ContainedEdge()
	 * @see uml.activities.ActivityEdge#getInGroup
	 * @model opposite="inGroup" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getContainedEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Activity that directly or indirectly contains this ActivityGroup.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if superGroup<>null then superGroup.containingActivity()\r\nelse inActivity\r\nendif'"
	 * @generated
	 */
	Activity containingActivity();

} // ActivityGroup
