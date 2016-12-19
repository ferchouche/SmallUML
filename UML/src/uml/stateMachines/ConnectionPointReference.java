/**
 */
package uml.stateMachines;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Point Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConnectionPointReference represents a usage (as part of a submachine State) of an entry/exit point Pseudostate defined in the StateMachine referenced by the submachine State.
 * exit->forAll(kind = PseudostateKind::exitPoint)
 * entry->forAll(kind = PseudostateKind::entryPoint)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.ConnectionPointReference#getState <em>State</em>}</li>
 *   <li>{@link uml.stateMachines.ConnectionPointReference#getEntry <em>Entry</em>}</li>
 *   <li>{@link uml.stateMachines.ConnectionPointReference#getExit <em>Exit</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getConnectionPointReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='exit_pseudostates entry_pseudostates'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL exit_pseudostates='exit->forAll(kind = PseudostateKind::exitPoint)' entry_pseudostates='entry->forAll(kind = PseudostateKind::entryPoint)'"
 * @generated
 */
public interface ConnectionPointReference extends Vertex {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.State#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State in which the ConnectionPointReference is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see uml.stateMachines.StateMachinesPackage#getConnectionPointReference_State()
	 * @see uml.stateMachines.State#getConnection
	 * @model opposite="connection" transient="false" ordered="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link uml.stateMachines.ConnectionPointReference#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference list.
	 * The list contents are of type {@link uml.stateMachines.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entryPoint Pseudostates corresponding to this connection point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getConnectionPointReference_Entry()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectionPointReference'"
	 * @generated
	 */
	EList<Pseudostate> getEntry();

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' reference list.
	 * The list contents are of type {@link uml.stateMachines.Pseudostate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exitPoints kind Pseudostates corresponding to this connection point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit</em>' reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getConnectionPointReference_Exit()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectionPointReference'"
	 * @generated
	 */
	EList<Pseudostate> getExit();

} // ConnectionPointReference
