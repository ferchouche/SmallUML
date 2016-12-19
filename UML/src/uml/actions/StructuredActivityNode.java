/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.activities.ActivityEdge;
import uml.activities.ActivityGroup;
import uml.activities.ActivityNode;
import uml.activities.Variable;

import uml.commonStructure.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StructuredActivityNode is an Action that is also an ActivityGroup and whose behavior is specified by the ActivityNodes and ActivityEdges it so contains. Unlike other kinds of ActivityGroup, a StructuredActivityNode owns the ActivityNodes and ActivityEdges it contains, and so a node or edge can only be directly contained in one StructuredActivityNode, though StructuredActivityNodes may be nested.
 * output.outgoing.target->excludesAll(allOwnedNodes()-input)
 * edge=self.sourceNodes().outgoing->intersection(self.allOwnedNodes().incoming)->
 * 	union(self.targetNodes().incoming->intersection(self.allOwnedNodes().outgoing))->asSet()
 * input.incoming.source->excludesAll(allOwnedNodes()-output)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.StructuredActivityNode#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml.actions.StructuredActivityNode#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml.actions.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link uml.actions.StructuredActivityNode#getStructuredNodeInput <em>Structured Node Input</em>}</li>
 *   <li>{@link uml.actions.StructuredActivityNode#getStructuredNodeOutput <em>Structured Node Output</em>}</li>
 *   <li>{@link uml.actions.StructuredActivityNode#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getStructuredActivityNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='output_pin_edges edges input_pin_edges'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL output_pin_edges='output.outgoing.target->excludesAll(allOwnedNodes()-input)' edges='edge=self.sourceNodes().outgoing->intersection(self.allOwnedNodes().incoming)->\r\n\tunion(self.targetNodes().incoming->intersection(self.allOwnedNodes().outgoing))->asSet()' input_pin_edges='input.incoming.source->excludesAll(allOwnedNodes()-output)'"
 * @generated
 */
public interface StructuredActivityNode extends Action, Namespace, ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link uml.activities.Variable}.
	 * It is bidirectional and its opposite is '{@link uml.activities.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Variables defined in the scope of the StructuredActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getStructuredActivityNode_Variable()
	 * @see uml.activities.Variable#getScope
	 * @model opposite="scope" containment="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link uml.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityEdges immediately contained in the StructuredActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getStructuredActivityNode_Edge()
	 * @see uml.activities.ActivityEdge#getInStructuredNode
	 * @model opposite="inStructuredNode" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Must Isolate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then any object used by an Action within the StructuredActivityNode cannot be accessed by any Action outside the node until the StructuredActivityNode as a whole completes. Any concurrent Actions that would result in accessing such objects are required to have their execution deferred until the completion of the StructuredActivityNode.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Isolate</em>' attribute.
	 * @see #setMustIsolate(boolean)
	 * @see uml.actions.ActionsPackage#getStructuredActivityNode_MustIsolate()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMustIsolate();

	/**
	 * Sets the value of the '{@link uml.actions.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Isolate</em>' attribute.
	 * @see #isMustIsolate()
	 * @generated
	 */
	void setMustIsolate(boolean value);

	/**
	 * Returns the value of the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPins owned by the StructuredActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Node Input</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getStructuredActivityNode_StructuredNodeInput()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='structuredActivityNode'"
	 * @generated
	 */
	EList<InputPin> getStructuredNodeInput();

	/**
	 * Returns the value of the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins owned by the StructuredActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Node Output</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getStructuredActivityNode_StructuredNodeOutput()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='structuredActivityNode'"
	 * @generated
	 */
	EList<OutputPin> getStructuredNodeOutput();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link uml.activities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityNode#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityNodes immediately contained in the StructuredActivityNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getStructuredActivityNode_Node()
	 * @see uml.activities.ActivityNode#getInStructuredNode
	 * @model opposite="inStructuredNode" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return those ActivityNodes contained immediately within the StructuredActivityNode that may act as sources of edges owned by the StructuredActivityNode.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='node->union(input.oclAsType(ActivityNode)->asSet())->\r\n  union(node->select(oclIsKindOf(Action)).oclAsType(Action).output)->asSet()'"
	 * @generated
	 */
	EList<ActivityNode> sourceNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return those ActivityNodes contained immediately within the StructuredActivityNode that may act as targets of edges owned by the StructuredActivityNode.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='node->union(output.oclAsType(ActivityNode)->asSet())->\r\n  union(node->select(oclIsKindOf(Action)).oclAsType(Action).input)->asSet()'"
	 * @generated
	 */
	EList<ActivityNode> targetNodes();

} // StructuredActivityNode
