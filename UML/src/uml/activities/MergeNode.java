/**
 */
package uml.activities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A merge node is a control node that brings together multiple alternate flows. It is not used to synchronize concurrent flows but to accept one among several alternate flows.
 * outgoing->size()=1
 * let allEdges : Set(ActivityEdge) = incoming->union(outgoing) in
 * allEdges->forAll(oclIsKindOf(ControlFlow)) or allEdges->forAll(oclIsKindOf(ObjectFlow))
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see uml.activities.ActivitiesPackage#getMergeNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='one_outgoing_edge edges'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL one_outgoing_edge='outgoing->size()=1' edges='let allEdges : Set(ActivityEdge) = incoming->union(outgoing) in\r\nallEdges->forAll(oclIsKindOf(ControlFlow)) or allEdges->forAll(oclIsKindOf(ObjectFlow))\r\n'"
 * @generated
 */
public interface MergeNode extends ControlNode {
} // MergeNode
