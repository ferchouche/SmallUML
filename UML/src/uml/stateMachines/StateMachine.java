/**
 */
package uml.stateMachines;

import org.eclipse.emf.common.util.EList;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StateMachines can be used to express event-driven behaviors of parts of a system. Behavior is modeled as a traversal of a graph of Vertices interconnected by one or more joined Transition arcs that are triggered by the dispatching of successive Event occurrences. During this traversal, the StateMachine may execute a sequence of Behaviors associated with various elements of the StateMachine.
 * connectionPoint->forAll (kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)
 * _'context' <> null implies not _'context'.oclIsKindOf(Interface)
 * specification <> null implies connectionPoint->isEmpty()
 * specification <> null implies ( _'context' <> null and specification.featuringClassifier->exists(c | c = _'context'))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 *   <li>{@link uml.stateMachines.StateMachine#getRegion <em>Region</em>}</li>
 *   <li>{@link uml.stateMachines.StateMachine#getSubmachineState <em>Submachine State</em>}</li>
 *   <li>{@link uml.stateMachines.StateMachine#getConnectionPoint <em>Connection Point</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getStateMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='connection_points classifier_context method context_classifier'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL connection_points='connectionPoint->forAll (kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)' classifier_context='_\'context\' <> null implies not _\'context\'.oclIsKindOf(Interface)' method='specification <> null implies connectionPoint->isEmpty()' context_classifier='specification <> null implies ( _\'context\' <> null and specification.featuringClassifier->exists(c | c = _\'context\'))'"
 * @generated
 */
public interface StateMachine extends Behavior {
	/**
	 * Returns the value of the '<em><b>Extended State Machine</b></em>' reference list.
	 * The list contents are of type {@link uml.stateMachines.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachines of which this is an extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended State Machine</em>' reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getStateMachine_ExtendedStateMachine()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateMachine'"
	 * @generated
	 */
	EList<StateMachine> getExtendedStateMachine();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link uml.stateMachines.Region}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Region#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Regions owned directly by the StateMachine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getStateMachine_Region()
	 * @see uml.stateMachines.Region#getStateMachine
	 * @model opposite="stateMachine" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * Returns the value of the '<em><b>Submachine State</b></em>' reference list.
	 * The list contents are of type {@link uml.stateMachines.State}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.State#getSubmachine <em>Submachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the submachine(s) in case of a submachine State. Multiple machines are referenced in case of a concurrent State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submachine State</em>' reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getStateMachine_SubmachineState()
	 * @see uml.stateMachines.State#getSubmachine
	 * @model opposite="submachine" ordered="false"
	 * @generated
	 */
	EList<State> getSubmachineState();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link uml.stateMachines.Pseudostate}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Pseudostate#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection points defined for this StateMachine. They represent the interface of the StateMachine when used as part of submachine State
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getStateMachine_ConnectionPoint()
	 * @see uml.stateMachines.Pseudostate#getStateMachine
	 * @model opposite="stateMachine" containment="true" ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation LCA(s1,s2) returns the Region that is the least common ancestor of Vertices s1 and s2, based on the StateMachine containment hierarchy.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" s1Required="true" s1Ordered="false" s2Required="true" s2Ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LCA'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if ancestor(s1, s2) then \r\n    s2.container\r\nelse\r\n\tif ancestor(s2, s1) then\r\n\t    s1.container \r\n\telse \r\n\t    LCA(s1.container.state, s2.container.state)\r\n\tendif\r\nendif'"
	 * @generated
	 */
	Region lca(Vertex s1, Vertex s2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query ancestor(s1, s2) checks whether Vertex s2 is an ancestor of Vertex s1.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" s1Required="true" s1Ordered="false" s2Required="true" s2Ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (s2 = s1) then \r\n\ttrue \r\nelse \r\n\tif s1.container.stateMachine->notEmpty() then \r\n\t    true\r\n\telse \r\n\t    if s2.container.stateMachine->notEmpty() then \r\n\t        false\r\n\t    else\r\n\t        ancestor(s1, s2.container.state)\r\n\t     endif\r\n\t endif\r\nendif'"
	 * @generated
	 */
	boolean ancestor(Vertex s1, Vertex s2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This utility funciton is like the LCA, except that it returns the nearest composite State that contains both input Vertices.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" v1Required="true" v1Ordered="false" v2Required="true" v2Ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LCAState'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if v2.oclIsTypeOf(State) and ancestor(v1, v2) then\r\n\tv2.oclAsType(State)\r\nelse if v1.oclIsTypeOf(State) and ancestor(v2, v1) then\r\n\tv1.oclAsType(State)\r\nelse if (v1.container.state->isEmpty() or v2.container.state->isEmpty()) then \r\n\tnull.oclAsType(State)\r\nelse LCAState(v1.container.state, v2.container.state)\r\nendif endif endif'"
	 * @generated
	 */
	State lcaState(Vertex v1, Vertex v2);

} // StateMachine
