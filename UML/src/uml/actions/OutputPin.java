/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OutputPin is a Pin that holds output values produced by an Action.
 * incoming->notEmpty() implies
 * 	action<>null and
 * 	action.oclIsKindOf(StructuredActivityNode) and
 * 	action.oclAsType(StructuredActivityNode).allOwnedNodes()->includesAll(incoming.source)
 * <!-- end-model-doc -->
 *
 *
 * @see uml.actions.ActionsPackage#getOutputPin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='incoming_edges_structured_only'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL incoming_edges_structured_only='incoming->notEmpty() implies\r\n\taction<>null and\r\n\taction.oclIsKindOf(StructuredActivityNode) and\r\n\taction.oclAsType(StructuredActivityNode).allOwnedNodes()->includesAll(incoming.source)'"
 * @generated
 */
public interface OutputPin extends Pin {
} // OutputPin
