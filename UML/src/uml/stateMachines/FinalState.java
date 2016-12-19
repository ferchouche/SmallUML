/**
 */
package uml.stateMachines;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A special kind of State, which, when entered, signifies that the enclosing Region has completed. If the enclosing Region is directly contained in a StateMachine and all other Regions in that StateMachine also are completed, then it means that the entire StateMachine behavior is completed.
 * exit->isEmpty()
 * outgoing->size() = 0
 * region->size() = 0
 * submachine->isEmpty()
 * entry->isEmpty()
 * doActivity->isEmpty()
 * <!-- end-model-doc -->
 *
 *
 * @see uml.stateMachines.StateMachinesPackage#getFinalState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_exit_behavior no_outgoing_transitions no_regions cannot_reference_submachine no_entry_behavior no_state_behavior'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL no_exit_behavior='exit->isEmpty()' no_outgoing_transitions='outgoing->size() = 0' no_regions='region->size() = 0' cannot_reference_submachine='submachine->isEmpty()' no_entry_behavior='entry->isEmpty()' no_state_behavior='doActivity->isEmpty()'"
 * @generated
 */
public interface FinalState extends State {
} // FinalState
