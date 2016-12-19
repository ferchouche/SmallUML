/**
 */
package uml.stateMachines;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Vertex is an abstraction of a node in a StateMachine graph. It can be the source or destination of any number of Transitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.Vertex#getContainer <em>Container</em>}</li>
 *   <li>{@link uml.stateMachines.Vertex#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link uml.stateMachines.Vertex#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Region that contains this Vertex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(Region)
	 * @see uml.stateMachines.StateMachinesPackage#getVertex_Container()
	 * @see uml.stateMachines.Region#getSubvertex
	 * @model opposite="subvertex" transient="false" ordered="false"
	 * @generated
	 */
	Region getContainer();

	/**
	 * Sets the value of the '{@link uml.stateMachines.Vertex#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Region value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link uml.stateMachines.Transition}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Transitions departing from this Vertex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getVertex_Outgoing()
	 * @see uml.stateMachines.Transition#getSource
	 * @model opposite="source" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link uml.stateMachines.Transition}.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Transitions entering this Vertex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getVertex_Incoming()
	 * @see uml.stateMachines.Transition#getTarget
	 * @model opposite="target" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation containingStateMachine() returns the StateMachine in which this Vertex is defined.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if container <> null\nthen\n-- the container is a region\n   container.containingStateMachine()\nelse \n   if (self.oclIsKindOf(Pseudostate)) and ((self.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint) or (self.oclAsType(Pseudostate).kind = PseudostateKind::exitPoint)) then\n      self.oclAsType(Pseudostate).stateMachine\n   else \n      if (self.oclIsKindOf(ConnectionPointReference)) then\n          self.oclAsType(ConnectionPointReference).state.containingStateMachine() -- no other valid cases possible\n      else \n          null\n      endif\n   endif\nendif'"
	 * @generated
	 */
	StateMachine containingStateMachine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Vertex::/incoming.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Transition.allInstances()->select(target=self)'"
	 * @generated
	 */
	EList<Transition> incoming();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Vertex::/outgoing
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Transition.allInstances()->select(source=self)'"
	 * @generated
	 */
	EList<Transition> outgoing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This utility operation returns true if the Vertex is contained in the State s (input argument).
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" sRequired="true" sOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if not s.isComposite() or container->isEmpty() then\r\n\tfalse\r\nelse\r\n\tif container.state = s then \r\n\t\ttrue\r\n\telse\r\n\t\tcontainer.state.isContainedInState(s)\r\n\tendif\r\nendif'"
	 * @generated
	 */
	boolean isContainedInState(State s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This utility query returns true if the Vertex is contained in the Region r (input argument).
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" rRequired="true" rOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (container = r) then\r\n\ttrue\r\nelse\r\n\tif (r.state->isEmpty()) then\r\n\t\tfalse\r\n\telse\r\n\t\tcontainer.state.isContainedInRegion(r)\r\n\tendif\r\nendif'"
	 * @generated
	 */
	boolean isContainedInRegion(Region r);

} // Vertex
