/**
 */
package uml.stateMachines;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;
import uml.classification.RedefinableElement;

import uml.commonBehavior.Behavior;
import uml.commonBehavior.Trigger;

import uml.commonStructure.Constraint;
import uml.commonStructure.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A State models a situation during which some (usually implicit) invariant condition holds.
 * connectionPoint->forAll(kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)
 * isSubmachineState implies connection->notEmpty( )
 * connectionPoint->notEmpty() implies isComposite
 * self.isSubmachineState implies (self.connection->forAll (cp |
 *   cp.entry->forAll (ps | ps.stateMachine = self.submachine) and
 *   cp.exit->forAll (ps | ps.stateMachine = self.submachine)))
 * isComposite implies not isSubmachineState
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.State#getConnection <em>Connection</em>}</li>
 *   <li>{@link uml.stateMachines.State#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link uml.stateMachines.State#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link uml.stateMachines.State#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link uml.stateMachines.State#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link uml.stateMachines.State#getEntry <em>Entry</em>}</li>
 *   <li>{@link uml.stateMachines.State#getExit <em>Exit</em>}</li>
 *   <li>{@link uml.stateMachines.State#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link uml.stateMachines.State#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link uml.stateMachines.State#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link uml.stateMachines.State#isIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link uml.stateMachines.State#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link uml.stateMachines.State#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link uml.stateMachines.State#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='entry_or_exit submachine_states composite_states destinations_or_sources_of_transitions submachine_or_regions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL entry_or_exit='connectionPoint->forAll(kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)' submachine_states='isSubmachineState implies connection->notEmpty( )' composite_states='connectionPoint->notEmpty() implies isComposite' destinations_or_sources_of_transitions='self.isSubmachineState implies (self.connection->forAll (cp |\r\n  cp.entry->forAll (ps | ps.stateMachine = self.submachine) and\r\n  cp.exit->forAll (ps | ps.stateMachine = self.submachine)))' submachine_or_regions='isComposite implies not isSubmachineState'"
 * @generated
 */
public interface State extends Namespace, RedefinableElement, Vertex {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link uml.stateMachines.ConnectionPointReference}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.ConnectionPointReference#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entry and exit connection points used in conjunction with this (submachine) State, i.e., as targets and sources, respectively, in the Region with the submachine State. A connection point reference references the corresponding definition of a connection point Pseudostate in the StateMachine referenced by the submachine State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getState_Connection()
	 * @see uml.stateMachines.ConnectionPointReference#getState
	 * @model opposite="state" containment="true" ordered="false"
	 * @generated
	 */
	EList<ConnectionPointReference> getConnection();

	/**
	 * Returns the value of the '<em><b>Connection Point</b></em>' containment reference list.
	 * The list contents are of type {@link uml.stateMachines.Pseudostate}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Pseudostate#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entry and exit Pseudostates of a composite State. These can only be entry or exit Pseudostates, and they must have different names. They can only be defined for composite States.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Point</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getState_ConnectionPoint()
	 * @see uml.stateMachines.Pseudostate#getState
	 * @model opposite="state" containment="true" ordered="false"
	 * @generated
	 */
	EList<Pseudostate> getConnectionPoint();

	/**
	 * Returns the value of the '<em><b>Submachine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.StateMachine#getSubmachineState <em>Submachine State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachine that is to be inserted in place of the (submachine) State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submachine</em>' reference.
	 * @see #setSubmachine(StateMachine)
	 * @see uml.stateMachines.StateMachinesPackage#getState_Submachine()
	 * @see uml.stateMachines.StateMachine#getSubmachineState
	 * @model opposite="submachineState" ordered="false"
	 * @generated
	 */
	StateMachine getSubmachine();

	/**
	 * Sets the value of the '{@link uml.stateMachines.State#getSubmachine <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submachine</em>' reference.
	 * @see #getSubmachine()
	 * @generated
	 */
	void setSubmachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonBehavior.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of Triggers that are candidates to be retained by the StateMachine if they trigger no Transitions out of the State (not consumed). A deferred Trigger is retained until the StateMachine reaches a State configuration where it is no longer deferred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deferrable Trigger</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getState_DeferrableTrigger()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='state'"
	 * @generated
	 */
	EList<Trigger> getDeferrableTrigger();

	/**
	 * Returns the value of the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Behavior that is executed while being in the State. The execution starts when this State is entered, and ceases either by itself when done, or when the State is exited, whichever comes first.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Activity</em>' containment reference.
	 * @see #setDoActivity(Behavior)
	 * @see uml.stateMachines.StateMachinesPackage#getState_DoActivity()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='state'"
	 * @generated
	 */
	Behavior getDoActivity();

	/**
	 * Sets the value of the '{@link uml.stateMachines.State#getDoActivity <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Activity</em>' containment reference.
	 * @see #getDoActivity()
	 * @generated
	 */
	void setDoActivity(Behavior value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Behavior that is executed whenever this State is entered regardless of the Transition taken to reach the State. If defined, entry Behaviors are always executed to completion prior to any internal Behavior or Transitions performed within the State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(Behavior)
	 * @see uml.stateMachines.StateMachinesPackage#getState_Entry()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='state'"
	 * @generated
	 */
	Behavior getEntry();

	/**
	 * Sets the value of the '{@link uml.stateMachines.State#getEntry <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Behavior value);

	/**
	 * Returns the value of the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Behavior that is executed whenever this State is exited regardless of which Transition was taken out of the State. If defined, exit Behaviors are always executed to completion only after all internal and transition Behaviors have completed execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit</em>' containment reference.
	 * @see #setExit(Behavior)
	 * @see uml.stateMachines.StateMachinesPackage#getState_Exit()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='state'"
	 * @generated
	 */
	Behavior getExit();

	/**
	 * Sets the value of the '{@link uml.stateMachines.State#getExit <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' containment reference.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(Behavior value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state with isComposite=true is said to be a composite State. A composite State is a State that contains at least one Region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see uml.stateMachines.StateMachinesPackage#getState_IsComposite()
	 * @model dataType="types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Returns the value of the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A State with isOrthogonal=true is said to be an orthogonal composite State An orthogonal composite State contains two or more Regions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Orthogonal</em>' attribute.
	 * @see uml.stateMachines.StateMachinesPackage#getState_IsOrthogonal()
	 * @model dataType="types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrthogonal();

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A State with isSimple=true is said to be a simple State A simple State does not have any Regions and it does not refer to any submachine StateMachine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see uml.stateMachines.StateMachinesPackage#getState_IsSimple()
	 * @model dataType="types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsSimple();

	/**
	 * Returns the value of the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A State with isSubmachineState=true is said to be a submachine State Such a State refers to another StateMachine(submachine).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Submachine State</em>' attribute.
	 * @see uml.stateMachines.StateMachinesPackage#getState_IsSubmachineState()
	 * @model dataType="types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsSubmachineState();

	/**
	 * Returns the value of the '<em><b>Redefined State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State of which this State is a redefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined State</em>' reference.
	 * @see #setRedefinedState(State)
	 * @see uml.stateMachines.StateMachinesPackage#getState_RedefinedState()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='state'"
	 * @generated
	 */
	State getRedefinedState();

	/**
	 * Sets the value of the '{@link uml.stateMachines.State#getRedefinedState <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined State</em>' reference.
	 * @see #getRedefinedState()
	 * @generated
	 */
	void setRedefinedState(State value);

	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies conditions that are always true when this State is the current State. In ProtocolStateMachines state invariants are additional conditions to the preconditions of the outgoing Transitions, and to the postcondition of the incoming Transitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Invariant</em>' reference.
	 * @see #setStateInvariant(Constraint)
	 * @see uml.stateMachines.StateMachinesPackage#getState_StateInvariant()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningState'"
	 * @generated
	 */
	Constraint getStateInvariant();

	/**
	 * Sets the value of the '{@link uml.stateMachines.State#getStateInvariant <em>State Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Invariant</em>' reference.
	 * @see #getStateInvariant()
	 * @generated
	 */
	void setStateInvariant(Constraint value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference list.
	 * The list contents are of type {@link uml.stateMachines.Region}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Region#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Regions owned directly by the State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getState_Region()
	 * @see uml.stateMachines.Region#getState
	 * @model opposite="state" containment="true" ordered="false"
	 * @generated
	 */
	EList<Region> getRegion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A composite State is a State with at least one Region.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='region->notEmpty()'"
	 * @generated
	 */
	boolean isComposite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An orthogonal State is a composite state with at least 2 regions.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='region->size () > 1'"
	 * @generated
	 */
	boolean isOrthogonal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A simple State is a State without any regions.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='(region->isEmpty()) and not isSubmachineState()'"
	 * @generated
	 */
	boolean isSimple();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only submachine State references another StateMachine.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='submachine <> null'"
	 * @generated
	 */
	boolean isSubmachineState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a State is the nearest containing StateMachine.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let sm : StateMachine = containingStateMachine() in\nif sm._\'context\' = null or sm.general->notEmpty() then\n  sm\nelse\n  sm._\'context\'\nendif'"
	 * @generated
	 */
	Classifier redefinitionContext();

} // State
