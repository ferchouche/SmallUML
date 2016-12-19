/**
 */
package uml.activities;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ActivityPartition is a kind of ActivityGroup for identifying ActivityNodes that have some characteristic in common.
 * (not isExternal and represents.oclIsKindOf(Classifier) and superPartition->notEmpty()) implies
 * (
 *    let representedClassifier : Classifier = represents.oclAsType(Classifier) in
 *      superPartition.represents.oclIsKindOf(Classifier) and
 *       let representedSuperClassifier : Classifier = superPartition.represents.oclAsType(Classifier) in
 *        (representedSuperClassifier.oclIsKindOf(BehavioredClassifier) and representedClassifier.oclIsKindOf(Behavior) and 
 *         representedSuperClassifier.oclAsType(BehavioredClassifier).ownedBehavior->includes(representedClassifier.oclAsType(Behavior))) 
 *        or
 *        (representedSuperClassifier.oclIsKindOf(Class) and  representedSuperClassifier.oclAsType(Class).nestedClassifier->includes(representedClassifier))
 *        or
 *        (Association.allInstances()->exists(a | a.memberEnd->exists(end1 | end1.isComposite and end1.type = representedClassifier and 
 *                                                                       a.memberEnd->exists(end2 | end1<>end2 and end2.type = representedSuperClassifier))))
 * )
 * (represents.oclIsKindOf(Property) and superPartition->notEmpty()) implies
 * (
 *   (superPartition.represents.oclIsKindOf(Classifier) and represents.owner = superPartition.represents) or 
 *   (superPartition.represents.oclIsKindOf(Property) and represents.owner = superPartition.represents.oclAsType(Property).type)
 * )
 * (represents.oclIsKindOf(Property) and superPartition->notEmpty() and superPartition.represents.oclIsKindOf(Classifier)) implies
 * (
 *   let representedClassifier : Classifier = superPartition.represents.oclAsType(Classifier)
 *   in
 *     superPartition.subpartition->reject(isExternal)->forAll(p | 
 *        p.represents.oclIsKindOf(Property) and p.owner=representedClassifier)
 * )
 * isDimension implies superPartition->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.ActivityPartition#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml.activities.ActivityPartition#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link uml.activities.ActivityPartition#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link uml.activities.ActivityPartition#getRepresents <em>Represents</em>}</li>
 *   <li>{@link uml.activities.ActivityPartition#getSubpartition <em>Subpartition</em>}</li>
 *   <li>{@link uml.activities.ActivityPartition#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link uml.activities.ActivityPartition#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getActivityPartition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='represents_classifier represents_property_and_is_contained represents_property dimension_not_contained'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL represents_classifier='(not isExternal and represents.oclIsKindOf(Classifier) and superPartition->notEmpty()) implies\r\n(\r\n   let representedClassifier : Classifier = represents.oclAsType(Classifier) in\r\n     superPartition.represents.oclIsKindOf(Classifier) and\r\n      let representedSuperClassifier : Classifier = superPartition.represents.oclAsType(Classifier) in\r\n       (representedSuperClassifier.oclIsKindOf(BehavioredClassifier) and representedClassifier.oclIsKindOf(Behavior) and \r\n        representedSuperClassifier.oclAsType(BehavioredClassifier).ownedBehavior->includes(representedClassifier.oclAsType(Behavior))) \r\n       or\r\n       (representedSuperClassifier.oclIsKindOf(Class) and  representedSuperClassifier.oclAsType(Class).nestedClassifier->includes(representedClassifier))\r\n       or\r\n       (Association.allInstances()->exists(a | a.memberEnd->exists(end1 | end1.isComposite and end1.type = representedClassifier and \r\n                                                                      a.memberEnd->exists(end2 | end1<>end2 and end2.type = representedSuperClassifier))))\r\n)' represents_property_and_is_contained='(represents.oclIsKindOf(Property) and superPartition->notEmpty()) implies\r\n(\r\n  (superPartition.represents.oclIsKindOf(Classifier) and represents.owner = superPartition.represents) or \r\n  (superPartition.represents.oclIsKindOf(Property) and represents.owner = superPartition.represents.oclAsType(Property).type)\r\n)' represents_property='(represents.oclIsKindOf(Property) and superPartition->notEmpty() and superPartition.represents.oclIsKindOf(Classifier)) implies\r\n(\r\n  let representedClassifier : Classifier = superPartition.represents.oclAsType(Classifier)\r\n  in\r\n    superPartition.subpartition->reject(isExternal)->forAll(p | \r\n       p.represents.oclIsKindOf(Property) and p.owner=representedClassifier)\r\n)' dimension_not_contained='isDimension implies superPartition->isEmpty()'"
 * @generated
 */
public interface ActivityPartition extends ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityEdge#getInPartition <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityEdges immediately contained in the ActivityPartition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityPartition_Edge()
	 * @see uml.activities.ActivityEdge#getInPartition
	 * @model opposite="inPartition" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Is Dimension</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the ActivityPartition groups other ActivityPartitions along a dimension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Dimension</em>' attribute.
	 * @see #setIsDimension(boolean)
	 * @see uml.activities.ActivitiesPackage#getActivityPartition_IsDimension()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDimension();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityPartition#isIsDimension <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dimension</em>' attribute.
	 * @see #isIsDimension()
	 * @generated
	 */
	void setIsDimension(boolean value);

	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the ActivityPartition represents an entity to which the partitioning structure does not apply.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #setIsExternal(boolean)
	 * @see uml.activities.ActivitiesPackage#getActivityPartition_IsExternal()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityPartition#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isIsExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Element represented by the functionality modeled within the ActivityPartition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(Element)
	 * @see uml.activities.ActivitiesPackage#getActivityPartition_Represents()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activityPartition'"
	 * @generated
	 */
	Element getRepresents();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityPartition#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(Element value);

	/**
	 * Returns the value of the '<em><b>Subpartition</b></em>' containment reference list.
	 * The list contents are of type {@link uml.activities.ActivityPartition}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityPartition#getSuperPartition <em>Super Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other ActivityPartitions immediately contained in this ActivityPartition (as its subgroups).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subpartition</em>' containment reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityPartition_Subpartition()
	 * @see uml.activities.ActivityPartition#getSuperPartition
	 * @model opposite="superPartition" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getSubpartition();

	/**
	 * Returns the value of the '<em><b>Super Partition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityPartition#getSubpartition <em>Subpartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other ActivityPartitions immediately containing this ActivityPartition (as its superGroups).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Partition</em>' container reference.
	 * @see #setSuperPartition(ActivityPartition)
	 * @see uml.activities.ActivitiesPackage#getActivityPartition_SuperPartition()
	 * @see uml.activities.ActivityPartition#getSubpartition
	 * @model opposite="subpartition" transient="false" ordered="false"
	 * @generated
	 */
	ActivityPartition getSuperPartition();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityPartition#getSuperPartition <em>Super Partition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Partition</em>' container reference.
	 * @see #getSuperPartition()
	 * @generated
	 */
	void setSuperPartition(ActivityPartition value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityNode#getInPartition <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityNodes immediately contained in the ActivityPartition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getActivityPartition_Node()
	 * @see uml.activities.ActivityNode#getInPartition
	 * @model opposite="inPartition" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNode();

} // ActivityPartition
