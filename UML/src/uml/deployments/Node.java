/**
 */
package uml.deployments;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Node is computational resource upon which artifacts may be deployed for execution. Nodes can be interconnected through communication paths to define network structures.
 * part->forAll(oclIsKindOf(Node))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.deployments.Node#getNestedNode <em>Nested Node</em>}</li>
 * </ul>
 *
 * @see uml.deployments.DeploymentsPackage#getNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='internal_structure'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL internal_structure='part->forAll(oclIsKindOf(Node))'"
 * @generated
 */
public interface Node extends uml.structuredClassifiers.Class, DeploymentTarget {
	/**
	 * Returns the value of the '<em><b>Nested Node</b></em>' containment reference list.
	 * The list contents are of type {@link uml.deployments.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Nodes that are defined (nested) within the Node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Node</em>' containment reference list.
	 * @see uml.deployments.DeploymentsPackage#getNode_NestedNode()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='node'"
	 * @generated
	 */
	EList<Node> getNestedNode();

} // Node
