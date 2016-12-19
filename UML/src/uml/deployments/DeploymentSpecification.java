/**
 */
package uml.deployments;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment specification specifies a set of properties that determine execution parameters of a component artifact that is deployed on a node. A deployment specification can be aimed at a specific type of container. An artifact that reifies or implements deployment specification properties is a deployment descriptor.
 * deployment->forAll (location.oclIsKindOf(ExecutionEnvironment))
 * deployment->forAll (location.deployedElement->forAll (oclIsKindOf(Component)))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.deployments.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link uml.deployments.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link uml.deployments.DeploymentSpecification#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see uml.deployments.DeploymentsPackage#getDeploymentSpecification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='deployment_target deployed_elements'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL deployment_target='deployment->forAll (location.oclIsKindOf(ExecutionEnvironment))' deployed_elements='deployment->forAll (location.deployedElement->forAll (oclIsKindOf(Component)))'"
 * @generated
 */
public interface DeploymentSpecification extends Artifact {
	/**
	 * Returns the value of the '<em><b>Deployment Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where an Artifact is deployed onto a Node. This is typically a 'directory' or 'memory address.'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Location</em>' attribute.
	 * @see #setDeploymentLocation(String)
	 * @see uml.deployments.DeploymentsPackage#getDeploymentSpecification_DeploymentLocation()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getDeploymentLocation();

	/**
	 * Sets the value of the '{@link uml.deployments.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Location</em>' attribute.
	 * @see #getDeploymentLocation()
	 * @generated
	 */
	void setDeploymentLocation(String value);

	/**
	 * Returns the value of the '<em><b>Execution Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where a component Artifact executes. This may be a local or remote location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Location</em>' attribute.
	 * @see #setExecutionLocation(String)
	 * @see uml.deployments.DeploymentsPackage#getDeploymentSpecification_ExecutionLocation()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getExecutionLocation();

	/**
	 * Sets the value of the '{@link uml.deployments.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Location</em>' attribute.
	 * @see #getExecutionLocation()
	 * @generated
	 */
	void setExecutionLocation(String value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.deployments.Deployment#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployment with which the DeploymentSpecification is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' container reference.
	 * @see #setDeployment(Deployment)
	 * @see uml.deployments.DeploymentsPackage#getDeploymentSpecification_Deployment()
	 * @see uml.deployments.Deployment#getConfiguration
	 * @model opposite="configuration" transient="false" ordered="false"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link uml.deployments.DeploymentSpecification#getDeployment <em>Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' container reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

} // DeploymentSpecification
