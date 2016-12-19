/**
 */
package uml.stateMachines;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;
import uml.classification.RedefinableElement;

import uml.commonStructure.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Region is a top-level part of a StateMachine or a composite State, that serves as a container for the Vertices and Transitions of the StateMachine. A StateMachine or composite State may contain multiple Regions representing behaviors that may occur in parallel.
 * self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->
 *    select(kind = PseudostateKind::deepHistory)->size() <= 1
 * 
 * subvertex->select(oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->
 *   select(kind = PseudostateKind::shallowHistory)->size() <= 1
 * 
 * (stateMachine <> null implies state = null) and (state <> null implies stateMachine = null)
 * self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->
 *   select(kind = PseudostateKind::initial)->size() <= 1
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.Region#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link uml.stateMachines.Region#getState <em>State</em>}</li>
 *   <li>{@link uml.stateMachines.Region#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link uml.stateMachines.Region#getTransition <em>Transition</em>}</li>
 *   <li>{@link uml.stateMachines.Region#getSubvertex <em>Subvertex</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getRegion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='deep_history_vertex shallow_history_vertex owned initial_vertex'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL deep_history_vertex='self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->\n   select(kind = PseudostateKind::deepHistory)->size() <= 1\n' shallow_history_vertex='subvertex->select(oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->\n  select(kind = PseudostateKind::shallowHistory)->size() <= 1\n' owned='(stateMachine <> null implies state = null) and (state <> null implies stateMachine = null)' initial_vertex='self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->\n  select(kind = PseudostateKind::initial)->size() <= 1\n'"
 * @generated
 */
public interface Region extends Namespace, RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Extended Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The region of which this region is an extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Region</em>' reference.
	 * @see #setExtendedRegion(Region)
	 * @see uml.stateMachines.StateMachinesPackage#getRegion_ExtendedRegion()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='region'"
	 * @generated
	 */
	Region getExtendedRegion();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Region#getExtendedRegion <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Region</em>' reference.
	 * @see #getExtendedRegion()
	 * @generated
	 */
	void setExtendedRegion(Region value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.State#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State that owns the Region. If a Region is owned by a State, then it cannot also be owned by a StateMachine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see uml.stateMachines.StateMachinesPackage#getRegion_State()
	 * @see uml.stateMachines.State#getRegion
	 * @model opposite="region" transient="false" ordered="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Region#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachine that owns the Region. If a Region is owned by a StateMachine, then it cannot also be owned by a State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see uml.stateMachines.StateMachinesPackage#getRegion_StateMachine()
	 * @see uml.stateMachines.StateMachine#getRegion
	 * @model opposite="region" transient="false" ordered="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Region#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link uml.stateMachines.Transition}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Transitions owned by the Region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getRegion_Transition()
	 * @see uml.stateMachines.Transition#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link uml.stateMachines.Vertex}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Vertices that are owned by this Region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getRegion_Subvertex()
	 * @see uml.stateMachines.Vertex#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Vertex> getSubvertex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation belongsToPSM () checks if the Region belongs to a ProtocolStateMachine.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='belongsToPSM'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if  stateMachine <> null \nthen\n  stateMachine.oclIsKindOf(ProtocolStateMachine)\nelse \n  state <> null  implies  state.container.belongsToPSM()\nendif'"
	 * @generated
	 */
	boolean belongsToPsm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation containingStateMachine() returns the StateMachine in which this Region is defined.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if stateMachine = null \nthen\n  state.containingStateMachine()\nelse\n  stateMachine\nendif'"
	 * @generated
	 */
	StateMachine containingStateMachine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a Region is the nearest containing StateMachine.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let sm : StateMachine = containingStateMachine() in\nif sm._\'context\' = null or sm.general->notEmpty() then\n  sm\nelse\n  sm._\'context\'\nendif'"
	 * @generated
	 */
	Classifier redefinitionContext();

} // Region
