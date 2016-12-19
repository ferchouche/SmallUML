/**
 */
package uml.deployments;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;
import uml.classification.Operation;
import uml.classification.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An artifact is the specification of a physical piece of information that is used or produced by a software development process, or by deployment and operation of a system. Examples of artifacts include model files, source files, scripts, and binary executable files, a table in a database system, a development deliverable, or a word-processing document, a mail message.
 * An artifact is the source of a deployment to a node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.deployments.Artifact#getFileName <em>File Name</em>}</li>
 *   <li>{@link uml.deployments.Artifact#getManifestation <em>Manifestation</em>}</li>
 *   <li>{@link uml.deployments.Artifact#getNestedArtifact <em>Nested Artifact</em>}</li>
 *   <li>{@link uml.deployments.Artifact#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.deployments.Artifact#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 *
 * @see uml.deployments.DeploymentsPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends Classifier, DeployedArtifact {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concrete name that is used to refer to the Artifact in a physical context. Example: file system name, universal resource locator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see uml.deployments.DeploymentsPackage#getArtifact_FileName()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link uml.deployments.Artifact#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Manifestation</b></em>' containment reference list.
	 * The list contents are of type {@link uml.deployments.Manifestation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of model elements that are manifested in the Artifact. That is, these model elements are utilized in the construction (or generation) of the artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifestation</em>' containment reference list.
	 * @see uml.deployments.DeploymentsPackage#getArtifact_Manifestation()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='artifact'"
	 * @generated
	 */
	EList<Manifestation> getManifestation();

	/**
	 * Returns the value of the '<em><b>Nested Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link uml.deployments.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Artifacts that are defined (nested) within the Artifact. The association is a specialization of the ownedMember association from Namespace to NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Artifact</em>' containment reference list.
	 * @see uml.deployments.DeploymentsPackage#getArtifact_NestedArtifact()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='artifact'"
	 * @generated
	 */
	EList<Artifact> getNestedArtifact();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes or association ends defined for the Artifact. The association is a specialization of the ownedMember association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see uml.deployments.DeploymentsPackage#getArtifact_OwnedAttribute()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='artifact'"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations defined for the Artifact. The association is a specialization of the ownedMember association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see uml.deployments.DeploymentsPackage#getArtifact_OwnedOperation()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='artifact'"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

} // Artifact
