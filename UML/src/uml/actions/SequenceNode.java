/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.activities.ExecutableNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SequenceNode is a StructuredActivityNode that executes a sequence of ExecutableNodes in order.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.SequenceNode#getExecutableNode <em>Executable Node</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getSequenceNode()
 * @model
 * @generated
 */
public interface SequenceNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Executable Node</b></em>' containment reference list.
	 * The list contents are of type {@link uml.activities.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of ExecutableNodes to be sequenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executable Node</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getSequenceNode_ExecutableNode()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sequenceNode'"
	 * @generated
	 */
	EList<ExecutableNode> getExecutableNode();

} // SequenceNode
