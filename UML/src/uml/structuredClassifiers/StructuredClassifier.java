/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;
import uml.classification.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StructuredClassifiers may contain an internal structure of connected elements each of which plays a role in the overall Behavior modeled by the StructuredClassifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.StructuredClassifier#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.structuredClassifiers.StructuredClassifier#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link uml.structuredClassifiers.StructuredClassifier#getPart <em>Part</em>}</li>
 *   <li>{@link uml.structuredClassifiers.StructuredClassifier#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getStructuredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface StructuredClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Properties owned by the StructuredClassifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getStructuredClassifier_OwnedAttribute()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='structuredClassifier'"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectors owned by the StructuredClassifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getStructuredClassifier_OwnedConnector()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='structuredClassifier'"
	 * @generated
	 */
	EList<Connector> getOwnedConnector();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Properties specifying instances that the StructuredClassifier owns by composition. This collection is derived, selecting those owned Properties where isComposite is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getStructuredClassifier_Part()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='structuredClassifier'"
	 * @generated
	 */
	EList<Property> getPart();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The roles that instances may play in this StructuredClassifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getStructuredClassifier_Role()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='structuredClassifier'"
	 * @generated
	 */
	EList<ConnectableElement> getRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for StructuredClassifier::/part
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedAttribute->select(isComposite)'"
	 * @generated
	 */
	EList<Property> part();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All features of type ConnectableElement, equivalent to all direct and inherited roles.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='allFeatures()->select(oclIsKindOf(ConnectableElement))->collect(oclAsType(ConnectableElement))->asSet()'"
	 * @generated
	 */
	EList<ConnectableElement> allRoles();

} // StructuredClassifier
