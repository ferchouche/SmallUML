/**
 */
package uml.activities;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ControlFlow is an ActivityEdge traversed by control tokens or object tokens of control type, which are use to control the execution of ExecutableNodes.
 * (source.oclIsKindOf(ObjectNode) implies source.oclAsType(ObjectNode).isControlType) and 
 * (target.oclIsKindOf(ObjectNode) implies target.oclAsType(ObjectNode).isControlType)
 * <!-- end-model-doc -->
 *
 *
 * @see uml.activities.ActivitiesPackage#getControlFlow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='object_nodes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL object_nodes='(source.oclIsKindOf(ObjectNode) implies source.oclAsType(ObjectNode).isControlType) and \r\n(target.oclIsKindOf(ObjectNode) implies target.oclAsType(ObjectNode).isControlType)'"
 * @generated
 */
public interface ControlFlow extends ActivityEdge {
} // ControlFlow
