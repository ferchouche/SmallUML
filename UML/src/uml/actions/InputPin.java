/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InputPin is a Pin that holds input values to be consumed by an Action.
 * outgoing->notEmpty() implies
 * 	action<>null and
 * 	action.oclIsKindOf(StructuredActivityNode) and
 * 	action.oclAsType(StructuredActivityNode).allOwnedNodes()->includesAll(outgoing.target)
 * <!-- end-model-doc -->
 *
 *
 * @see uml.actions.ActionsPackage#getInputPin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='outgoing_edges_structured_only'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL outgoing_edges_structured_only='outgoing->notEmpty() implies\r\n\taction<>null and\r\n\taction.oclIsKindOf(StructuredActivityNode) and\r\n\taction.oclAsType(StructuredActivityNode).allOwnedNodes()->includesAll(outgoing.target)'"
 * @generated
 */
public interface InputPin extends Pin {
} // InputPin
