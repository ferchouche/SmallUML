/**
 */
package uml.deployments;

import uml.structuredClassifiers.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A communication path is an association between two deployment targets, through which they are able to exchange signals and messages.
 * endType->forAll (oclIsKindOf(DeploymentTarget))
 * <!-- end-model-doc -->
 *
 *
 * @see uml.deployments.DeploymentsPackage#getCommunicationPath()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='association_ends'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL association_ends='endType->forAll (oclIsKindOf(DeploymentTarget))'"
 * @generated
 */
public interface CommunicationPath extends Association {
} // CommunicationPath
