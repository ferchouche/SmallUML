/**
 */
package uml.activities;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;

import uml.commonStructure.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExceptionHandler is an Element that specifies a handlerBody ExecutableNode to execute in case the specified exception occurs during the execution of the protected ExecutableNode.
 * handlerBody.incoming->isEmpty() and handlerBody.outgoing->isEmpty() and exceptionInput.incoming->isEmpty()
 * (protectedNode.oclIsKindOf(Action) and protectedNode.oclAsType(Action).output->notEmpty()) implies
 * (
 *   handlerBody.oclIsKindOf(Action) and 
 *   let protectedNodeOutput : OrderedSet(OutputPin) = protectedNode.oclAsType(Action).output,
 *         handlerBodyOutput : OrderedSet(OutputPin) =  handlerBody.oclAsType(Action).output in
 *     protectedNodeOutput->size() = handlerBodyOutput->size() and
 *     Sequence{1..protectedNodeOutput->size()}->forAll(i |
 *     	handlerBodyOutput->at(i).type.conformsTo(protectedNodeOutput->at(i).type) and
 *     	handlerBodyOutput->at(i).isOrdered=protectedNodeOutput->at(i).isOrdered and
 *     	handlerBodyOutput->at(i).compatibleWith(protectedNodeOutput->at(i)))
 * )
 * handlerBody.oclIsKindOf(Action) and
 * let inputs: OrderedSet(InputPin) = handlerBody.oclAsType(Action).input in
 * inputs->size()=1 and inputs->first()=exceptionInput
 * let nodes:Set(ActivityNode) = handlerBody.oclAsType(Action).allOwnedNodes() in
 * nodes.outgoing->forAll(nodes->includes(target)) and
 * nodes.incoming->forAll(nodes->includes(source))
 * handlerBody.owner=protectedNode.owner
 * exceptionInput.type=null or 
 * exceptionType->forAll(conformsTo(exceptionInput.type.oclAsType(Classifier)))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.ExceptionHandler#getExceptionInput <em>Exception Input</em>}</li>
 *   <li>{@link uml.activities.ExceptionHandler#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link uml.activities.ExceptionHandler#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link uml.activities.ExceptionHandler#getProtectedNode <em>Protected Node</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getExceptionHandler()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='handler_body_edges output_pins one_input edge_source_target handler_body_owner exception_input_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL handler_body_edges='handlerBody.incoming->isEmpty() and handlerBody.outgoing->isEmpty() and exceptionInput.incoming->isEmpty()' output_pins='(protectedNode.oclIsKindOf(Action) and protectedNode.oclAsType(Action).output->notEmpty()) implies\r\n(\r\n  handlerBody.oclIsKindOf(Action) and \r\n  let protectedNodeOutput : OrderedSet(OutputPin) = protectedNode.oclAsType(Action).output,\r\n        handlerBodyOutput : OrderedSet(OutputPin) =  handlerBody.oclAsType(Action).output in\r\n    protectedNodeOutput->size() = handlerBodyOutput->size() and\r\n    Sequence{1..protectedNodeOutput->size()}->forAll(i |\r\n    \thandlerBodyOutput->at(i).type.conformsTo(protectedNodeOutput->at(i).type) and\r\n    \thandlerBodyOutput->at(i).isOrdered=protectedNodeOutput->at(i).isOrdered and\r\n    \thandlerBodyOutput->at(i).compatibleWith(protectedNodeOutput->at(i)))\r\n)' one_input='handlerBody.oclIsKindOf(Action) and\r\nlet inputs: OrderedSet(InputPin) = handlerBody.oclAsType(Action).input in\r\ninputs->size()=1 and inputs->first()=exceptionInput' edge_source_target='let nodes:Set(ActivityNode) = handlerBody.oclAsType(Action).allOwnedNodes() in\r\nnodes.outgoing->forAll(nodes->includes(target)) and\r\nnodes.incoming->forAll(nodes->includes(source))' handler_body_owner='handlerBody.owner=protectedNode.owner' exception_input_type='exceptionInput.type=null or \r\nexceptionType->forAll(conformsTo(exceptionInput.type.oclAsType(Classifier)))'"
 * @generated
 */
public interface ExceptionHandler extends Element {
	/**
	 * Returns the value of the '<em><b>Exception Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ObjectNode within the handlerBody. When the ExceptionHandler catches an exception, the exception token is placed on this ObjectNode, causing the handlerBody to execute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Input</em>' reference.
	 * @see #setExceptionInput(ObjectNode)
	 * @see uml.activities.ActivitiesPackage#getExceptionHandler_ExceptionInput()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exceptionHandler'"
	 * @generated
	 */
	ObjectNode getExceptionInput();

	/**
	 * Sets the value of the '{@link uml.activities.ExceptionHandler#getExceptionInput <em>Exception Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Input</em>' reference.
	 * @see #getExceptionInput()
	 * @generated
	 */
	void setExceptionInput(ObjectNode value);

	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers whose instances the ExceptionHandler catches as exceptions. If an exception occurs whose type is any exceptionType, the ExceptionHandler catches the exception and executes the handlerBody.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Type</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getExceptionHandler_ExceptionType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exceptionHandler'"
	 * @generated
	 */
	EList<Classifier> getExceptionType();

	/**
	 * Returns the value of the '<em><b>Handler Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ExecutableNode that is executed if the ExceptionHandler catches an exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Body</em>' reference.
	 * @see #setHandlerBody(ExecutableNode)
	 * @see uml.activities.ActivitiesPackage#getExceptionHandler_HandlerBody()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exceptionHandler'"
	 * @generated
	 */
	ExecutableNode getHandlerBody();

	/**
	 * Sets the value of the '{@link uml.activities.ExceptionHandler#getHandlerBody <em>Handler Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Body</em>' reference.
	 * @see #getHandlerBody()
	 * @generated
	 */
	void setHandlerBody(ExecutableNode value);

	/**
	 * Returns the value of the '<em><b>Protected Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.activities.ExecutableNode#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExecutableNode protected by the ExceptionHandler. If an exception propagates out of the protectedNode and has a type matching one of the exceptionTypes, then it is caught by this ExceptionHandler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protected Node</em>' container reference.
	 * @see #setProtectedNode(ExecutableNode)
	 * @see uml.activities.ActivitiesPackage#getExceptionHandler_ProtectedNode()
	 * @see uml.activities.ExecutableNode#getHandler
	 * @model opposite="handler" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ExecutableNode getProtectedNode();

	/**
	 * Sets the value of the '{@link uml.activities.ExceptionHandler#getProtectedNode <em>Protected Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected Node</em>' container reference.
	 * @see #getProtectedNode()
	 * @generated
	 */
	void setProtectedNode(ExecutableNode value);

} // ExceptionHandler
