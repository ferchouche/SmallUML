/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relationship is an abstract concept that specifies some kind of relationship between Elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.Relationship#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends Element {
	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the elements related by the Relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Element</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getRelationship_RelatedElement()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='relationship'"
	 * @generated
	 */
	EList<Element> getRelatedElement();

} // Relationship
