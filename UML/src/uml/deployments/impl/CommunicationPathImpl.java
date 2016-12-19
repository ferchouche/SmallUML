/**
 */
package uml.deployments.impl;

import org.eclipse.emf.ecore.EClass;

import uml.deployments.CommunicationPath;
import uml.deployments.DeploymentsPackage;

import uml.structuredClassifiers.impl.AssociationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommunicationPathImpl extends AssociationImpl implements CommunicationPath {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentsPackage.Literals.COMMUNICATION_PATH;
	}

} //CommunicationPathImpl
