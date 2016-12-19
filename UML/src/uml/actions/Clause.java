/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.activities.ExecutableNode;

import uml.commonStructure.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Clause is an Element that represents a single branch of a ConditionalNode, including a test and a body section. The body section is executed only if (but not necessarily if) the test section evaluates to true.
 * _'body'.oclAsType(Action).allActions().output->includesAll(bodyOutput)
 * test.oclAsType(Action).allActions().output->includes(decider) and
 * decider.type = Boolean and
 * decider.is(1,1)
 * test->intersection(_'body')->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.Clause#getBody <em>Body</em>}</li>
 *   <li>{@link uml.actions.Clause#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link uml.actions.Clause#getDecider <em>Decider</em>}</li>
 *   <li>{@link uml.actions.Clause#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link uml.actions.Clause#getSuccessorClause <em>Successor Clause</em>}</li>
 *   <li>{@link uml.actions.Clause#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getClause()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='body_output_pins decider_output test_and_body'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body_output_pins='_\'body\'.oclAsType(Action).allActions().output->includesAll(bodyOutput)' decider_output='test.oclAsType(Action).allActions().output->includes(decider) and\r\ndecider.type = Boolean and\r\ndecider.is(1,1)' test_and_body='test->intersection(_\'body\')->isEmpty()'"
 * @generated
 */
public interface Clause extends Element {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes that are executed if the test evaluates to true and the Clause is chosen over other Clauses within the ConditionalNode that also have tests that evaluate to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see uml.actions.ActionsPackage#getClause_Body()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='clause'"
	 * @generated
	 */
	EList<ExecutableNode> getBody();

	/**
	 * Returns the value of the '<em><b>Body Output</b></em>' reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins on Actions within the body section whose values are moved to the result OutputPins of the containing ConditionalNode after execution of the body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Output</em>' reference list.
	 * @see uml.actions.ActionsPackage#getClause_BodyOutput()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='clause'"
	 * @generated
	 */
	EList<OutputPin> getBodyOutput();

	/**
	 * Returns the value of the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OutputPin on an Action in the test section whose Boolean value determines the result of the test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decider</em>' reference.
	 * @see #setDecider(OutputPin)
	 * @see uml.actions.ActionsPackage#getClause_Decider()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='clause'"
	 * @generated
	 */
	OutputPin getDecider();

	/**
	 * Sets the value of the '{@link uml.actions.Clause#getDecider <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decider</em>' reference.
	 * @see #getDecider()
	 * @generated
	 */
	void setDecider(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Predecessor Clause</b></em>' reference list.
	 * The list contents are of type {@link uml.actions.Clause}.
	 * It is bidirectional and its opposite is '{@link uml.actions.Clause#getSuccessorClause <em>Successor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Clauses whose tests must all evaluate to false before this Clause can evaluate its test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predecessor Clause</em>' reference list.
	 * @see uml.actions.ActionsPackage#getClause_PredecessorClause()
	 * @see uml.actions.Clause#getSuccessorClause
	 * @model opposite="successorClause" ordered="false"
	 * @generated
	 */
	EList<Clause> getPredecessorClause();

	/**
	 * Returns the value of the '<em><b>Successor Clause</b></em>' reference list.
	 * The list contents are of type {@link uml.actions.Clause}.
	 * It is bidirectional and its opposite is '{@link uml.actions.Clause#getPredecessorClause <em>Predecessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Clauses that may not evaluate their tests unless the test for this Clause evaluates to false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Successor Clause</em>' reference list.
	 * @see uml.actions.ActionsPackage#getClause_SuccessorClause()
	 * @see uml.actions.Clause#getPredecessorClause
	 * @model opposite="predecessorClause" ordered="false"
	 * @generated
	 */
	EList<Clause> getSuccessorClause();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ExecutableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of ExecutableNodes that are executed in order to provide a test result for the Clause.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see uml.actions.ActionsPackage#getClause_Test()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='clause'"
	 * @generated
	 */
	EList<ExecutableNode> getTest();

} // Clause
