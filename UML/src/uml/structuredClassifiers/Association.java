/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;
import uml.classification.Property;

import uml.commonStructure.Relationship;
import uml.commonStructure.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A link is a tuple of values that refer to typed objects.  An Association classifies a set of links, each of which is an instance of the Association.  Each value in the link refers to an instance of the type of the corresponding end of the Association.
 * 
 * parents()->select(oclIsKindOf(Association)).oclAsType(Association)->forAll(p | p.memberEnd->size() = self.memberEnd->size())
 * Sequence{1..memberEnd->size()}->
 * 	forAll(i | general->select(oclIsKindOf(Association)).oclAsType(Association)->
 * 		forAll(ga | self.memberEnd->at(i).type.conformsTo(ga.memberEnd->at(i).type)))
 * memberEnd->exists(aggregation <> AggregationKind::none) implies (memberEnd->size() = 2 and memberEnd->exists(aggregation = AggregationKind::none))
 * memberEnd->size() > 2 implies ownedEnd->includesAll(memberEnd)
 * memberEnd->forAll(type->notEmpty())
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.Association#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Association#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Association#getEndType <em>End Type</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Association#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Association#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='specialized_end_number specialized_end_types binary_associations association_ends ends_must_be_typed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL specialized_end_number='parents()->select(oclIsKindOf(Association)).oclAsType(Association)->forAll(p | p.memberEnd->size() = self.memberEnd->size())' specialized_end_types='Sequence{1..memberEnd->size()}->\r\n\tforAll(i | general->select(oclIsKindOf(Association)).oclAsType(Association)->\r\n\t\tforAll(ga | self.memberEnd->at(i).type.conformsTo(ga.memberEnd->at(i).type)))' binary_associations='memberEnd->exists(aggregation <> AggregationKind::none) implies (memberEnd->size() = 2 and memberEnd->exists(aggregation = AggregationKind::none))' association_ends='memberEnd->size() > 2 implies ownedEnd->includesAll(memberEnd)' ends_must_be_typed='memberEnd->forAll(type->notEmpty())'"
 * @generated
 */
public interface Association extends Classifier, Relationship {
	/**
	 * Returns the value of the '<em><b>Member End</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Property#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each end represents participation of instances of the Classifier connected to the end in links of the Association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member End</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getAssociation_MemberEnd()
	 * @see uml.classification.Property#getAssociation
	 * @model opposite="association" lower="2"
	 * @generated
	 */
	EList<Property> getMemberEnd();

	/**
	 * Returns the value of the '<em><b>Owned End</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Property#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ends that are owned by the Association itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned End</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getAssociation_OwnedEnd()
	 * @see uml.classification.Property#getOwningAssociation
	 * @model opposite="owningAssociation" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedEnd();

	/**
	 * Returns the value of the '<em><b>End Type</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers that are used as types of the ends of the Association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Type</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getAssociation_EndType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='association'"
	 * @generated
	 */
	EList<Type> getEndType();

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the Association is derived from other model elements such as other Associations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getAssociation_IsDerived()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.Association#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Navigable Owned End</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The navigable ends that are owned by the Association itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Navigable Owned End</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getAssociation_NavigableOwnedEnd()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='association'"
	 * @generated
	 */
	EList<Property> getNavigableOwnedEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * endType is derived from the types of the member ends.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='memberEnd->collect(type)->asSet()'"
	 * @generated
	 */
	EList<Type> endType();

} // Association
