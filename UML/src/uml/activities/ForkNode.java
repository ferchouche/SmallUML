/**
 */
package uml.activities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ForkNode is a ControlNode that splits a flow into multiple concurrent flows.
 * let allEdges : Set(ActivityEdge) = incoming->union(outgoing) in
 * allEdges->forAll(oclIsKindOf(ControlFlow)) or allEdges->forAll(oclIsKindOf(ObjectFlow))
 * 
 * incoming->size()=1
 * <!-- end-model-doc -->
 *
 *
 * @see uml.activities.ActivitiesPackage#getForkNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='edges one_incoming_edge'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL edges='let allEdges : Set(ActivityEdge) = incoming->union(outgoing) in\r\nallEdges->forAll(oclIsKindOf(ControlFlow)) or allEdges->forAll(oclIsKindOf(ObjectFlow))\r\n' one_incoming_edge='incoming->size()=1'"
 * @generated
 */
public interface ForkNode extends ControlNode {
} // ForkNode
