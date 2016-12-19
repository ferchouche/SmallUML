/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.classification.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CallAction is an abstract class for Actions that invoke a Behavior with given argument values and (if the invocation is synchronous) receive reply values.
 * let parameter: OrderedSet(Parameter) = self.inputParameters() in
 * argument->size() = parameter->size() and
 * Sequence{1..argument->size()}->forAll(i | 
 * 	argument->at(i).type.conformsTo(parameter->at(i).type) and 
 * 	argument->at(i).isOrdered = parameter->at(i).isOrdered and
 * 	argument->at(i).compatibleWith(parameter->at(i)))
 * let parameter: OrderedSet(Parameter) = self.outputParameters() in
 * result->size() = parameter->size() and
 * Sequence{1..result->size()}->forAll(i | 
 * 	parameter->at(i).type.conformsTo(result->at(i).type) and 
 * 	parameter->at(i).isOrdered = result->at(i).isOrdered and
 * 	parameter->at(i).compatibleWith(result->at(i)))
 * result->notEmpty() implies isSynchronous
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.CallAction#isIsSynchronous <em>Is Synchronous</em>}</li>
 *   <li>{@link uml.actions.CallAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getCallAction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='argument_pins result_pins synchronous_call'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL argument_pins='let parameter: OrderedSet(Parameter) = self.inputParameters() in\r\nargument->size() = parameter->size() and\r\nSequence{1..argument->size()}->forAll(i | \r\n\targument->at(i).type.conformsTo(parameter->at(i).type) and \r\n\targument->at(i).isOrdered = parameter->at(i).isOrdered and\r\n\targument->at(i).compatibleWith(parameter->at(i)))' result_pins='let parameter: OrderedSet(Parameter) = self.outputParameters() in\r\nresult->size() = parameter->size() and\r\nSequence{1..result->size()}->forAll(i | \r\n\tparameter->at(i).type.conformsTo(result->at(i).type) and \r\n\tparameter->at(i).isOrdered = result->at(i).isOrdered and\r\n\tparameter->at(i).compatibleWith(result->at(i)))' synchronous_call='result->notEmpty() implies isSynchronous'"
 * @generated
 */
public interface CallAction extends InvocationAction {
	/**
	 * Returns the value of the '<em><b>Is Synchronous</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the call is synchronous and the caller waits for completion of the invoked Behavior. If false, the call is asynchronous and the caller proceeds immediately and cannot receive return values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Synchronous</em>' attribute.
	 * @see #setIsSynchronous(boolean)
	 * @see uml.actions.ActionsPackage#getCallAction_IsSynchronous()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsSynchronous();

	/**
	 * Sets the value of the '{@link uml.actions.CallAction#isIsSynchronous <em>Is Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synchronous</em>' attribute.
	 * @see #isIsSynchronous()
	 * @generated
	 */
	void setIsSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins on which the reply values from the invocation are placed (if the call is synchronous).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getCallAction_Result()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='callAction'"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the in and inout ownedParameters of the Behavior or Operation being called. (This operation is abstract and should be overridden by subclasses of CallAction.)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Parameter> inputParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the inout, out and return ownedParameters of the Behavior or Operation being called. (This operation is abstract and should be overridden by subclasses of CallAction.)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Parameter> outputParameters();

} // CallAction
