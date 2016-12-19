/**
 */
package uml.stateMachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudostate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Pseudostate is an abstraction that encompasses different types of transient Vertices in the StateMachine graph. A StateMachine instance never comes to rest in a Pseudostate, instead, it will exit and enter the Pseudostate within a single run-to-completion step.
 * (kind = PseudostateKind::fork) implies
 * 
 * -- for any pair of outgoing transitions there exists an orthogonal state which contains the targets of these transitions 
 * -- such that these targets belong to different regions of that orthogonal state 
 * 
 * outgoing->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.target, t2.target) in
 * 	((contState <> null) and (contState.region
 * 		->exists(r1:Region, r2: Region | (r1 <> r2) and t1.target.isContainedInRegion(r1) and t2.target.isContainedInRegion(r2)))))
 * 	
 * (kind = PseudostateKind::choice) implies (incoming->size() >= 1 and outgoing->size() >= 1)
 * 
 * (kind = PseudostateKind::initial) implies (outgoing.guard = null and outgoing.trigger->isEmpty())
 * (kind = PseudostateKind::join) implies (outgoing->size() = 1 and incoming->size() >= 2)
 * 
 * (kind = PseudostateKind::junction) implies (incoming->size() >= 1 and outgoing->size() >= 1)
 * 
 * ((kind = PseudostateKind::deepHistory) or (kind = PseudostateKind::shallowHistory)) implies (outgoing->size() <= 1)
 * 
 * (kind = PseudostateKind::initial) implies (outgoing->size() <= 1)
 * (kind = PseudostateKind::fork) implies (incoming->size() = 1 and outgoing->size() >= 2)
 * 
 * (kind = PseudostateKind::join) implies
 * 
 * -- for any pair of incoming transitions there exists an orthogonal state which contains the source vetices of these transitions 
 * -- such that these source vertices belong to different regions of that orthogonal state 
 * 
 * incoming->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.source, t2.source) in
 * 	((contState <> null) and (contState.region
 * 		->exists(r1:Region, r2: Region | (r1 <> r2) and t1.source.isContainedInRegion(r1) and t2.source.isContainedInRegion(r2)))))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.Pseudostate#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.stateMachines.Pseudostate#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link uml.stateMachines.Pseudostate#getState <em>State</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getPseudostate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='transitions_outgoing choice_vertex outgoing_from_initial join_vertex junction_vertex history_vertices initial_vertex fork_vertex transitions_incoming'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL transitions_outgoing='(kind = PseudostateKind::fork) implies\r\n\r\n-- for any pair of outgoing transitions there exists an orthogonal state which contains the targets of these transitions \r\n-- such that these targets belong to different regions of that orthogonal state \r\n\r\noutgoing->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.target, t2.target) in\r\n\t((contState <> null) and (contState.region\r\n\t\t->exists(r1:Region, r2: Region | (r1 <> r2) and t1.target.isContainedInRegion(r1) and t2.target.isContainedInRegion(r2)))))\r\n\t' choice_vertex='(kind = PseudostateKind::choice) implies (incoming->size() >= 1 and outgoing->size() >= 1)\n' outgoing_from_initial='(kind = PseudostateKind::initial) implies (outgoing.guard = null and outgoing.trigger->isEmpty())' join_vertex='(kind = PseudostateKind::join) implies (outgoing->size() = 1 and incoming->size() >= 2)\n' junction_vertex='(kind = PseudostateKind::junction) implies (incoming->size() >= 1 and outgoing->size() >= 1)\n' history_vertices='((kind = PseudostateKind::deepHistory) or (kind = PseudostateKind::shallowHistory)) implies (outgoing->size() <= 1)\n' initial_vertex='(kind = PseudostateKind::initial) implies (outgoing->size() <= 1)' fork_vertex='(kind = PseudostateKind::fork) implies (incoming->size() = 1 and outgoing->size() >= 2)\n' transitions_incoming='(kind = PseudostateKind::join) implies\n\n-- for any pair of incoming transitions there exists an orthogonal state which contains the source vetices of these transitions \n-- such that these source vertices belong to different regions of that orthogonal state \n\nincoming->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.source, t2.source) in\n\t((contState <> null) and (contState.region\n\t\t->exists(r1:Region, r2: Region | (r1 <> r2) and t1.source.isContainedInRegion(r1) and t2.source.isContainedInRegion(r2)))))'"
 * @generated
 */
public interface Pseudostate extends Vertex {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"initial"</code>.
	 * The literals are from the enumeration {@link uml.stateMachines.PseudostateKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the precise type of the Pseudostate and can be one of: entryPoint, exitPoint, initial, deepHistory, shallowHistory, join, fork, junction, terminate or choice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see uml.stateMachines.PseudostateKind
	 * @see #setKind(PseudostateKind)
	 * @see uml.stateMachines.StateMachinesPackage#getPseudostate_Kind()
	 * @model default="initial" required="true" ordered="false"
	 * @generated
	 */
	PseudostateKind getKind();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Pseudostate#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see uml.stateMachines.PseudostateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PseudostateKind value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.StateMachine#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachine in which this Pseudostate is defined. This only applies to Pseudostates of the kind entryPoint or exitPoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see uml.stateMachines.StateMachinesPackage#getPseudostate_StateMachine()
	 * @see uml.stateMachines.StateMachine#getConnectionPoint
	 * @model opposite="connectionPoint" transient="false" ordered="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Pseudostate#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.State#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State that owns this Pseudostate and in which it appears.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see uml.stateMachines.StateMachinesPackage#getPseudostate_State()
	 * @see uml.stateMachines.State#getConnectionPoint
	 * @model opposite="connectionPoint" transient="false" ordered="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Pseudostate#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Pseudostate
