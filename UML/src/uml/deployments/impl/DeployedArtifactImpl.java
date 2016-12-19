/**
 */
package uml.deployments.impl;

import org.eclipse.emf.ecore.EClass;

import uml.commonStructure.impl.NamedElementImpl;

import uml.deployments.DeployedArtifact;
import uml.deployments.DeploymentsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployed Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DeployedArtifactImpl extends NamedElementImpl implements DeployedArtifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployedArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentsPackage.Literals.DEPLOYED_ARTIFACT;
	}

} //DeployedArtifactImpl
