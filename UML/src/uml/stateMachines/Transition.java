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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Transition represents an arc between exactly one source Vertex and exactly one Target vertex (the source and targets may be the same Vertex). It may form part of a compound transition, which takes the StateMachine from one steady State configuration to another, representing the full response of the StateMachine to an occurrence of an Event that triggered it.
 * (kind = TransitionKind::external) implies
 * 	not (source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint)
 * (target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (guard = null and trigger->isEmpty())
 * (kind = TransitionKind::internal) implies
 * 		(source.oclIsKindOf (State) and source = target)
 * source.oclIsKindOf(Pseudostate) and (source.oclAsType(Pseudostate).kind <> PseudostateKind::initial) implies trigger->isEmpty()
 * (target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (source.oclIsKindOf(State))
 * (source.oclIsKindOf(Pseudostate) and  source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (target.oclIsKindOf(State))
 * (kind = TransitionKind::local) implies
 * 		((source.oclIsKindOf (State) and source.oclAsType(State).isComposite) or
 * 		(source.oclIsKindOf (Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint))
 * (source.oclIsKindOf(Pseudostate) and container.stateMachine->notEmpty()) implies
 * 	trigger->isEmpty()
 * 
 * (source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (guard = null and trigger->isEmpty())
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.Transition#getEffect <em>Effect</em>}</li>
 *   <li>{@link uml.stateMachines.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link uml.stateMachines.Transition#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.stateMachines.Transition#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link uml.stateMachines.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link uml.stateMachines.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.stateMachines.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link uml.stateMachines.Transition#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='state_is_external join_segment_guards state_is_internal outgoing_pseudostates join_segment_state fork_segment_state state_is_local initial_transition fork_segment_guards'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL state_is_external='(kind = TransitionKind::external) implies\r\n\tnot (source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint)' join_segment_guards='(target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (guard = null and trigger->isEmpty())' state_is_internal='(kind = TransitionKind::internal) implies\r\n\t\t(source.oclIsKindOf (State) and source = target)' outgoing_pseudostates='source.oclIsKindOf(Pseudostate) and (source.oclAsType(Pseudostate).kind <> PseudostateKind::initial) implies trigger->isEmpty()' join_segment_state='(target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (source.oclIsKindOf(State))' fork_segment_state='(source.oclIsKindOf(Pseudostate) and  source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (target.oclIsKindOf(State))' state_is_local='(kind = TransitionKind::local) implies\r\n\t\t((source.oclIsKindOf (State) and source.oclAsType(State).isComposite) or\r\n\t\t(source.oclIsKindOf (Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint))' initial_transition='(source.oclIsKindOf(Pseudostate) and container.stateMachine->notEmpty()) implies\n\ttrigger->isEmpty()\n' fork_segment_guards='(source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (guard = null and trigger->isEmpty())'"
 * @generated
 */
public interface Transition extends Namespace, RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies an optional behavior to be performed when the Transition fires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(Behavior)
	 * @see uml.stateMachines.StateMachinesPackage#getTransition_Effect()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transition'"
	 * @generated
	 */
	Behavior getEffect();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Transition#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Behavior value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A guard is a Constraint that provides a fine-grained control over the firing of the Transition. The guard is evaluated when an Event occurrence is dispatched by the StateMachine. If the guard is true at that time, the Transition may be enabled, otherwise, it is disabled. Guards should be pure expressions without side effects. Guard expressions with side effects are ill formed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(Constraint)
	 * @see uml.stateMachines.StateMachinesPackage#getTransition_Guard()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transition'"
	 * @generated
	 */
	Constraint getGuard();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Transition#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Constraint value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"external"</code>.
	 * The literals are from the enumeration {@link uml.stateMachines.TransitionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the precise type of the Transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see uml.stateMachines.TransitionKind
	 * @see #setKind(TransitionKind)
	 * @see uml.stateMachines.StateMachinesPackage#getTransition_Kind()
	 * @model default="external" required="true" ordered="false"
	 * @generated
	 */
	TransitionKind getKind();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Transition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see uml.stateMachines.TransitionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionKind value);

	/**
	 * Returns the value of the '<em><b>Redefined Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Transition that is redefined by this Transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Transition</em>' reference.
	 * @see #setRedefinedTransition(Transition)
	 * @see uml.stateMachines.StateMachinesPackage#getTransition_RedefinedTransition()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transition'"
	 * @generated
	 */
	Transition getRedefinedTransition();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Transition#getRedefinedTransition <em>Redefined Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Transition</em>' reference.
	 * @see #getRedefinedTransition()
	 * @generated
	 */
	void setRedefinedTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the originating Vertex (State or Pseudostate) of the Transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see uml.stateMachines.StateMachinesPackage#getTransition_Source()
	 * @see uml.stateMachines.Vertex#getOutgoing
	 * @model opposite="outgoing" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the target Vertex that is reached when the Transition is taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see uml.stateMachines.StateMachinesPackage#getTransition_Target()
	 * @see uml.stateMachines.Vertex#getIncoming
	 * @model opposite="incoming" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonBehavior.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Triggers that may fire the transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getTransition_Trigger()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transition'"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the Region that owns this Transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see uml.stateMachines.StateMachinesPackage#getTransition_Container()
	 * @see uml.stateMachines.Region#getTransition
	 * @model opposite="transition" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Transition#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingStateMachine() returns the StateMachine that contains the Transition either directly or transitively.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='container.containingStateMachine()'"
	 * @generated
	 */
	StateMachine containingStateMachine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a Transition is the nearest containing StateMachine.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let sm : StateMachine = containingStateMachine() in\nif sm._\'context\' = null or sm.general->notEmpty() then\n  sm\nelse\n  sm._\'context\'\nendif'"
	 * @generated
	 */
	Classifier redefinitionContext();

} // Transition
