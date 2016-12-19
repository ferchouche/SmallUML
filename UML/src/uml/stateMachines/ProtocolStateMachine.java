/**
 */
package uml.stateMachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProtocolStateMachine is always defined in the context of a Classifier. It specifies which BehavioralFeatures of the Classifier can be called in which State and under which conditions, thus specifying the allowed invocation sequences on the Classifier's BehavioralFeatures. A ProtocolStateMachine specifies the possible and permitted Transitions on the instances of its context Classifier, together with the BehavioralFeatures that carry the Transitions. In this manner, an instance lifecycle can be specified for a Classifier, by defining the order in which the BehavioralFeatures can be activated and the States through which an instance progresses during its existence.
 * _'context' <> null and specification = null
 * region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Pseudostate) implies
 * ((v.oclAsType(Pseudostate).kind <>  PseudostateKind::deepHistory) and (v.oclAsType(Pseudostate).kind <> PseudostateKind::shallowHistory))))
 * 
 * region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies
 * (v.oclAsType(State).entry->isEmpty() and v.oclAsType(State).exit->isEmpty() and v.oclAsType(State).doActivity->isEmpty())))
 * 
 * region->forAll(r | r.transition->forAll(t | t.oclIsTypeOf(ProtocolTransition)))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.ProtocolStateMachine#getConformance <em>Conformance</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getProtocolStateMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='classifier_context deep_or_shallow_history entry_exit_do protocol_transitions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL classifier_context='_\'context\' <> null and specification = null' deep_or_shallow_history='region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Pseudostate) implies\n((v.oclAsType(Pseudostate).kind <>  PseudostateKind::deepHistory) and (v.oclAsType(Pseudostate).kind <> PseudostateKind::shallowHistory))))\n' entry_exit_do='region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies\n(v.oclAsType(State).entry->isEmpty() and v.oclAsType(State).exit->isEmpty() and v.oclAsType(State).doActivity->isEmpty())))\n' protocol_transitions='region->forAll(r | r.transition->forAll(t | t.oclIsTypeOf(ProtocolTransition)))'"
 * @generated
 */
public interface ProtocolStateMachine extends StateMachine {
	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference list.
	 * The list contents are of type {@link uml.stateMachines.ProtocolConformance}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conformance between ProtocolStateMachine 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getProtocolStateMachine_Conformance()
	 * @see uml.stateMachines.ProtocolConformance#getSpecificMachine
	 * @model opposite="specificMachine" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProtocolConformance> getConformance();

} // ProtocolStateMachine
