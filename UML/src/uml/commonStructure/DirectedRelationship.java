/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DirectedRelationship represents a relationship between a collection of source model Elements and a collection of target model Elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.DirectedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link uml.commonStructure.DirectedRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getDirectedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface DirectedRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the source Element(s) of the DirectedRelationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getDirectedRelationship_Source()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='directedRelationship'"
	 * @generated
	 */
	EList<Element> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the target Element(s) of the DirectedRelationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getDirectedRelationship_Target()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='directedRelationship'"
	 * @generated
	 */
	EList<Element> getTarget();

} // DirectedRelationship
