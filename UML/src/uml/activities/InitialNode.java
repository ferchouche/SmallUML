/**
 */
package uml.activities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InitialNode is a ControlNode that offers a single control token when initially enabled.
 * incoming->isEmpty()
 * outgoing->forAll(oclIsKindOf(ControlFlow))
 * <!-- end-model-doc -->
 *
 *
 * @see uml.activities.ActivitiesPackage#getInitialNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_incoming_edges control_edges'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL no_incoming_edges='incoming->isEmpty()' control_edges='outgoing->forAll(oclIsKindOf(ControlFlow))'"
 * @generated
 */
public interface InitialNode extends ControlNode {
} // InitialNode
