/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EncapsulatedClassifier may own Ports to specify typed interaction points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.EncapsulatedClassifier#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getEncapsulatedClassifier()
 * @model abstract="true"
 * @generated
 */
public interface EncapsulatedClassifier extends StructuredClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Ports owned by the EncapsulatedClassifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getEncapsulatedClassifier_OwnedPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='encapsulatedClassifier'"
	 * @generated
	 */
	EList<Port> getOwnedPort();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for EncapsulatedClassifier::/ownedPort : Port
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedAttribute->select(oclIsKindOf(Port))->collect(oclAsType(Port))->asOrderedSet()'"
	 * @generated
	 */
	EList<Port> ownedPort();

} // EncapsulatedClassifier
