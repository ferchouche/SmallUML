/**
 */
package uml.activities;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DecisionNode is a ControlNode that chooses between outgoing ActivityEdges for the routing of tokens.
 * (decisionInput<>null and decisionInputFlow=null and incoming->exists(oclIsKindOf(ControlFlow))) implies
 *    decisionInput.inputParameters()->isEmpty()
 * let allEdges: Set(ActivityEdge) = incoming->union(outgoing) in
 * let allRelevantEdges: Set(ActivityEdge) = if decisionInputFlow->notEmpty() then allEdges->excluding(decisionInputFlow) else allEdges endif in
 * allRelevantEdges->forAll(oclIsKindOf(ControlFlow)) or allRelevantEdges->forAll(oclIsKindOf(ObjectFlow))
 * 
 * incoming->includes(decisionInputFlow)
 * (decisionInput<>null and decisionInputFlow<>null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies
 * 	decisionInput.inputParameters()->size()=2
 * (incoming->size() = 1 or incoming->size() = 2) and outgoing->size() > 0
 * (decisionInput<>null and decisionInputFlow<>null and incoming->exists(oclIsKindOf(ControlFlow))) implies
 * 	decisionInput.inputParameters()->size()=1
 * decisionInput<>null implies 
 *   (decisionInput.ownedParameter->forAll(par | 
 *      par.direction <> ParameterDirectionKind::out and 
 *      par.direction <> ParameterDirectionKind::inout ) and
 *    decisionInput.ownedParameter->one(par | 
 *      par.direction <> ParameterDirectionKind::return))
 *      
 * (decisionInput<>null and decisionInputFlow=null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies
 * 	decisionInput.inputParameters()->size()=1
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.DecisionNode#getDecisionInput <em>Decision Input</em>}</li>
 *   <li>{@link uml.activities.DecisionNode#getDecisionInputFlow <em>Decision Input Flow</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getDecisionNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='zero_input_parameters edges decision_input_flow_incoming two_input_parameters incoming_outgoing_edges incoming_control_one_input_parameter parameters incoming_object_one_input_parameter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL zero_input_parameters='(decisionInput<>null and decisionInputFlow=null and incoming->exists(oclIsKindOf(ControlFlow))) implies\r\n   decisionInput.inputParameters()->isEmpty()' edges='let allEdges: Set(ActivityEdge) = incoming->union(outgoing) in\r\nlet allRelevantEdges: Set(ActivityEdge) = if decisionInputFlow->notEmpty() then allEdges->excluding(decisionInputFlow) else allEdges endif in\r\nallRelevantEdges->forAll(oclIsKindOf(ControlFlow)) or allRelevantEdges->forAll(oclIsKindOf(ObjectFlow))\r\n' decision_input_flow_incoming='incoming->includes(decisionInputFlow)' two_input_parameters='(decisionInput<>null and decisionInputFlow<>null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies\r\n\tdecisionInput.inputParameters()->size()=2' incoming_outgoing_edges='(incoming->size() = 1 or incoming->size() = 2) and outgoing->size() > 0' incoming_control_one_input_parameter='(decisionInput<>null and decisionInputFlow<>null and incoming->exists(oclIsKindOf(ControlFlow))) implies\r\n\tdecisionInput.inputParameters()->size()=1' parameters='decisionInput<>null implies \r\n  (decisionInput.ownedParameter->forAll(par | \r\n     par.direction <> ParameterDirectionKind::out and \r\n     par.direction <> ParameterDirectionKind::inout ) and\r\n   decisionInput.ownedParameter->one(par | \r\n     par.direction <> ParameterDirectionKind::return))\r\n     ' incoming_object_one_input_parameter='(decisionInput<>null and decisionInputFlow=null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies\r\n\tdecisionInput.inputParameters()->size()=1'"
 * @generated
 */
public interface DecisionNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Decision Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior that is executed to provide an input to guard ValueSpecifications on ActivityEdges outgoing from the DecisionNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Input</em>' reference.
	 * @see #setDecisionInput(Behavior)
	 * @see uml.activities.ActivitiesPackage#getDecisionNode_DecisionInput()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='decisionNode'"
	 * @generated
	 */
	Behavior getDecisionInput();

	/**
	 * Sets the value of the '{@link uml.activities.DecisionNode#getDecisionInput <em>Decision Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Input</em>' reference.
	 * @see #getDecisionInput()
	 * @generated
	 */
	void setDecisionInput(Behavior value);

	/**
	 * Returns the value of the '<em><b>Decision Input Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional ActivityEdge incoming to the DecisionNode that provides a decision input value for the guards ValueSpecifications on ActivityEdges outgoing from the DecisionNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decision Input Flow</em>' reference.
	 * @see #setDecisionInputFlow(ObjectFlow)
	 * @see uml.activities.ActivitiesPackage#getDecisionNode_DecisionInputFlow()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='decisionNode'"
	 * @generated
	 */
	ObjectFlow getDecisionInputFlow();

	/**
	 * Sets the value of the '{@link uml.activities.DecisionNode#getDecisionInputFlow <em>Decision Input Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Input Flow</em>' reference.
	 * @see #getDecisionInputFlow()
	 * @generated
	 */
	void setDecisionInputFlow(ObjectFlow value);

} // DecisionNode
