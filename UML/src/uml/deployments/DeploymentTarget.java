/**
 */
package uml.deployments;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;
import uml.commonStructure.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment target is the location for a deployed artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.deployments.DeploymentTarget#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link uml.deployments.DeploymentTarget#getDeployedElement <em>Deployed Element</em>}</li>
 * </ul>
 *
 * @see uml.deployments.DeploymentsPackage#getDeploymentTarget()
 * @model abstract="true"
 * @generated
 */
public interface DeploymentTarget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link uml.deployments.Deployment}.
	 * It is bidirectional and its opposite is '{@link uml.deployments.Deployment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Deployments for a DeploymentTarget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see uml.deployments.DeploymentsPackage#getDeploymentTarget_Deployment()
	 * @see uml.deployments.Deployment#getLocation
	 * @model opposite="location" containment="true" ordered="false"
	 * @generated
	 */
	EList<Deployment> getDeployment();

	/**
	 * Returns the value of the '<em><b>Deployed Element</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of elements that are manifested in an Artifact that is involved in Deployment to a DeploymentTarget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Element</em>' reference list.
	 * @see uml.deployments.DeploymentsPackage#getDeploymentTarget_DeployedElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='deploymentTarget'"
	 * @generated
	 */
	EList<PackageableElement> getDeployedElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for DeploymentTarget::/deployedElement
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='deployment.deployedArtifact->select(oclIsKindOf(Artifact))->collect(oclAsType(Artifact).manifestation)->collect(utilizedElement)->asSet()'"
	 * @generated
	 */
	EList<PackageableElement> deployedElement();

} // DeploymentTarget
