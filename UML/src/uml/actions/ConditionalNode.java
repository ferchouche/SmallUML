/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConditionalNode is a StructuredActivityNode that chooses one among some number of alternative collections of ExecutableNodes to execute.
 * result.incoming->isEmpty()
 * input->isEmpty()
 * node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->forAll(n | 
 * 	self.clause->select(test->union(_'body')->includes(n))->size()=1)
 * clause->forAll(
 * 	bodyOutput->size()=self.result->size() and
 * 	Sequence{1..self.result->size()}->forAll(i |
 * 		bodyOutput->at(i).type.conformsTo(result->at(i).type) and
 * 		bodyOutput->at(i).isOrdered = result->at(i).isOrdered and
 * 		bodyOutput->at(i).isUnique = result->at(i).isUnique and
 * 		bodyOutput->at(i).compatibleWith(result->at(i))))
 * clause.test->union(clause._'body') = node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)
 * clause->closure(predecessorClause)->intersection(clause)->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ConditionalNode#getClause <em>Clause</em>}</li>
 *   <li>{@link uml.actions.ConditionalNode#isIsAssured <em>Is Assured</em>}</li>
 *   <li>{@link uml.actions.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link uml.actions.ConditionalNode#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getConditionalNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='result_no_incoming no_input_pins one_clause_with_executable_node matching_output_pins executable_nodes clause_no_predecessor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL result_no_incoming='result.incoming->isEmpty()' no_input_pins='input->isEmpty()' one_clause_with_executable_node='node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->forAll(n | \r\n\tself.clause->select(test->union(_\'body\')->includes(n))->size()=1)' matching_output_pins='clause->forAll(\r\n\tbodyOutput->size()=self.result->size() and\r\n\tSequence{1..self.result->size()}->forAll(i |\r\n\t\tbodyOutput->at(i).type.conformsTo(result->at(i).type) and\r\n\t\tbodyOutput->at(i).isOrdered = result->at(i).isOrdered and\r\n\t\tbodyOutput->at(i).isUnique = result->at(i).isUnique and\r\n\t\tbodyOutput->at(i).compatibleWith(result->at(i))))' executable_nodes='clause.test->union(clause._\'body\') = node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)' clause_no_predecessor='clause->closure(predecessorClause)->intersection(clause)->isEmpty()'"
 * @generated
 */
public interface ConditionalNode extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Clause</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.Clause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Clauses composing the ConditionalNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clause</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getConditionalNode_Clause()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conditionalNode'"
	 * @generated
	 */
	EList<Clause> getClause();

	/**
	 * Returns the value of the '<em><b>Is Assured</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the modeler asserts that the test for at least one Clause of the ConditionalNode will succeed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Assured</em>' attribute.
	 * @see #setIsAssured(boolean)
	 * @see uml.actions.ActionsPackage#getConditionalNode_IsAssured()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAssured();

	/**
	 * Sets the value of the '{@link uml.actions.ConditionalNode#isIsAssured <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Assured</em>' attribute.
	 * @see #isIsAssured()
	 * @generated
	 */
	void setIsAssured(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Determinate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the modeler asserts that the test for at most one Clause of the ConditionalNode will succeed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Determinate</em>' attribute.
	 * @see #setIsDeterminate(boolean)
	 * @see uml.actions.ActionsPackage#getConditionalNode_IsDeterminate()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDeterminate();

	/**
	 * Sets the value of the '{@link uml.actions.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Determinate</em>' attribute.
	 * @see #isIsDeterminate()
	 * @generated
	 */
	void setIsDeterminate(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins that onto which are moved values from the bodyOutputs of the Clause selected for execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getConditionalNode_Result()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conditionalNode'"
	 * @generated
	 */
	EList<OutputPin> getResult();

} // ConditionalNode
