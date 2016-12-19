/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.activities.ExecutableNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LoopNode is a StructuredActivityNode that represents an iterative loop with setup, test, and body sections.
 * result.incoming->isEmpty()
 * loopVariableInput.outgoing->isEmpty()
 * setupPart->union(test)->union(bodyPart)=node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->asSet()
 * bodyPart.oclAsType(Action).allActions().output->includesAll(bodyOutput)
 * setupPart->intersection(test)->isEmpty() and
 * setupPart->intersection(bodyPart)->isEmpty() and
 * test->intersection(bodyPart)->isEmpty()
 * bodyOutput->size()=loopVariable->size() and
 * Sequence{1..loopVariable->size()}->forAll(i |
 * 	bodyOutput->at(i).type.conformsTo(loopVariable->at(i).type) and
 * 	bodyOutput->at(i).isOrdered = loopVariable->at(i).isOrdered and
 * 	bodyOutput->at(i).isUnique = loopVariable->at(i).isUnique and
 * 	loopVariable->at(i).includesMultiplicity(bodyOutput->at(i)))
 * loopVariableInput->size()=loopVariable->size() and
 * loopVariableInput.type=loopVariable.type and
 * loopVariableInput.isUnique=loopVariable.isUnique and
 * loopVariableInput.lower=loopVariable.lower and
 * loopVariableInput.upper=loopVariable.upper
 * result->size()=loopVariable->size() and
 * result.type=loopVariable.type and
 * result.isUnique=loopVariable.isUnique and
 * result.lower=loopVariable.lower and
 * result.upper=loopVariable.upper
 * allOwnedNodes()->includesAll(loopVariable.outgoing.target)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.LoopNode#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link uml.actions.LoopNode#getBodyPart <em>Body Part</em>}</li>
 *   <li>{@link uml.actions.LoopNode#getDecider <em>Decider</em>}</li>
 *   <li>{@link uml.actions.LoopNode#isIsTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link uml.actions.LoopNode#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link uml.actions.LoopNode#getLoopVariableInput <em>Loop Variable Input</em>}</li>
 *   <li>{@link uml.actions.LoopNode#getResult <em>Result</em>}</li>
 *   <li>{@link uml.actions.LoopNode#getSetupPart <em>Setup Part</em>}</li>
 *   <li>{@link uml.actions.LoopNode#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getLoopNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='result_no_incoming input_edges executable_nodes body_output_pins setup_test_and_body matching_output_pins matching_loop_variables matching_result_pins loop_variable_outgoing'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL result_no_incoming='result.incoming->isEmpty()' input_edges='loopVariableInput.outgoing->isEmpty()' executable_nodes='setupPart->union(test)->union(bodyPart)=node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->asSet()' body_output_pins='bodyPart.oclAsType(Action).allActions().output->includesAll(bodyOutput)' setup_test_and_body='setupPart->intersection(test)->isEmpty() and\r\nsetupPart->intersection(bodyPart)->isEmpty() and\r\ntest->intersection(bodyPart)->isEmpty()' matching_output_pins='bodyOutput->size()=loopVariable->size() and\r\nSequence{1..loopVariable->size()}->forAll(i |\r\n\tbodyOutput->at(i).type.conformsTo(loopVariable->at(i).type) and\r\n\tbodyOutput->at(i).isOrdered = loopVariable->at(i).isOrdered and\r\n\tbodyOutput->at(i).isUnique = loopVariable->at(i).isUnique and\r\n\tloopVariable->at(i).includesMultiplicity(bodyOutput->at(i)))' matching_loop_variables='loopVariableInput->size()=loopVariable->size() and\r\nloopVariableInput.type=loopVariable.type and\r\nloopVariableInput.isUnique=loopVariable.isUnique and\r\nloopVariableInput.lower=loopVariable.lower and\r\nloopVariableInput.upper=loopVariable.upper' matching_result_pins='result->size()=loopVariable->size() and\r\nresult.type=loopVariable.type and\r\nresult.isUnique=loopVariable.isUnique and\r\nresult.lower=loopVariable.lower and\r\nresult.upper=loopVariable.upper' loop_variable_outgoing='allOwnedNodes()->includesAll(loopVariable.outgoing.target)'"
 * @generated
 */
public interface LoopNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins on Actions within the bodyPart, the values of which are moved to the loopVariable OutputPins after the completion of each execution of the bodyPart, before the next iteration of the loop begins or before the loop exits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' reference list.
	 * @see uml.actions.ActionsPackage#getLoopNode_BodyOutput()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopNode'"
	 * @generated
	 */
	EList<OutputPin> getBodyOutput();

	/**
	 * Returns the value of the '<em><b>Body Part</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes that perform the repetitive computations of the loop. The bodyPart is executed as long as the test section produces a true value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Part</em>' reference list.
	 * @see uml.actions.ActionsPackage#getLoopNode_BodyPart()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopNode'"
	 * @generated
	 */
	EList<ExecutableNode> getBodyPart();

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OutputPin on an Action in the test section whose Boolean value determines whether to continue executing the loop bodyPart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decider</em>' reference.
	 * @see #setDecider(OutputPin)
	 * @see uml.actions.ActionsPackage#getLoopNode_Decider()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopNode'"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link uml.actions.LoopNode#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Is Tested First</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the test is performed before the first execution of the bodyPart. If false, the bodyPart is executed once before the test is performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Tested First</em>' attribute.
	 * @see #setIsTestedFirst(boolean)
	 * @see uml.actions.ActionsPackage#getLoopNode_IsTestedFirst()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsTestedFirst();

	/**
	 * Sets the value of the '{@link uml.actions.LoopNode#isIsTestedFirst <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tested First</em>' attribute.
	 * @see #isIsTestedFirst()
	 * @generated
	 */
	void setIsTestedFirst(boolean value);

	/**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of OutputPins that hold the values of the loop variables during an execution of the loop. When the test fails, the values are moved to the result OutputPins of the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getLoopNode_LoopVariable()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopNode'"
	 * @generated
	 */
	EList<OutputPin> getLoopVariable();

	/**
	 * Returns the value of the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of InputPins whose values are moved into the loopVariable Pins before the first iteration of the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable Input</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getLoopNode_LoopVariableInput()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopNode'"
	 * @generated
	 */
	EList<InputPin> getLoopVariableInput();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of OutputPins that receive the loopVariable values after the last iteration of the loop and constitute the output of the LoopNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getLoopNode_Result()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopNode'"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * Returns the value of the '<em><b>Setup Part</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes executed before the first iteration of the loop, in order to initialize values or perform other setup computations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setup Part</em>' reference list.
	 * @see uml.actions.ActionsPackage#getLoopNode_SetupPart()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopNode'"
	 * @generated
	 */
	EList<ExecutableNode> getSetupPart();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes executed in order to provide the test result for the loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see uml.actions.ActionsPackage#getLoopNode_Test()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopNode'"
	 * @generated
	 */
	EList<ExecutableNode> getTest();

} // LoopNode
