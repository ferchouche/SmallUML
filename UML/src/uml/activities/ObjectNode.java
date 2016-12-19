/**
 */
package uml.activities;

import org.eclipse.emf.common.util.EList;

import uml.commonBehavior.Behavior;

import uml.commonStructure.TypedElement;

import uml.stateMachines.State;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ObjectNode is an abstract ActivityNode that may hold tokens within the object flow in an Activity. ObjectNodes also support token selection, limitation on the number of tokens held, specification of the state required for tokens being held, and carrying control values.
 * 
 * selection<>null implies
 * 	selection.inputParameters()->size()=1 and
 * 	selection.inputParameters()->forAll(p | not p.isUnique and p.is(0,*) and self.type.conformsTo(p.type)) and
 * 	selection.outputParameters()->size()=1 and
 * 		selection.inputParameters()->forAll(p | self.type.conformsTo(p.type))
 * 	
 * (selection<>null) = (ordering=ObjectNodeOrderingKind::ordered)
 * (not isControlType) implies incoming->union(outgoing)->forAll(oclIsKindOf(ObjectFlow))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.ObjectNode#getInState <em>In State</em>}</li>
 *   <li>{@link uml.activities.ObjectNode#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link uml.activities.ObjectNode#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link uml.activities.ObjectNode#getSelection <em>Selection</em>}</li>
 *   <li>{@link uml.activities.ObjectNode#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getObjectNode()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='input_output_parameter selection_behavior object_flow_edges'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL input_output_parameter='selection<>null implies\r\n\tselection.inputParameters()->size()=1 and\r\n\tselection.inputParameters()->forAll(p | not p.isUnique and p.is(0,*) and self.type.conformsTo(p.type)) and\r\n\tselection.outputParameters()->size()=1 and\r\n\t\tselection.inputParameters()->forAll(p | self.type.conformsTo(p.type))\r\n\t' selection_behavior='(selection<>null) = (ordering=ObjectNodeOrderingKind::ordered)' object_flow_edges='(not isControlType) implies incoming->union(outgoing)->forAll(oclIsKindOf(ObjectFlow))'"
 * @generated
 */
public interface ObjectNode extends ActivityNode, TypedElement {
	/**
	 * Returns the value of the '<em><b>In State</b></em>' reference list.
	 * The list contents are of type {@link uml.stateMachines.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The States required to be associated with the values held by tokens on this ObjectNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In State</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getObjectNode_InState()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectNode'"
	 * @generated
	 */
	EList<State> getInState();

	/**
	 * Returns the value of the '<em><b>Is Control Type</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the type of the ObjectNode is to be treated as representing control values that may traverse ControlFlows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Control Type</em>' attribute.
	 * @see #setIsControlType(boolean)
	 * @see uml.activities.ActivitiesPackage#getObjectNode_IsControlType()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsControlType();

	/**
	 * Sets the value of the '{@link uml.activities.ObjectNode#isIsControlType <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control Type</em>' attribute.
	 * @see #isIsControlType()
	 * @generated
	 */
	void setIsControlType(boolean value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * The default value is <code>"fifo"</code>.
	 * The literals are from the enumeration {@link uml.activities.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how the tokens held by the ObjectNode are ordered for selection to traverse ActivityEdges outgoing from the ObjectNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see uml.activities.ObjectNodeOrderingKind
	 * @see #setOrdering(ObjectNodeOrderingKind)
	 * @see uml.activities.ActivitiesPackage#getObjectNode_Ordering()
	 * @model default="fifo" required="true" ordered="false"
	 * @generated
	 */
	ObjectNodeOrderingKind getOrdering();

	/**
	 * Sets the value of the '{@link uml.activities.ObjectNode#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see uml.activities.ObjectNodeOrderingKind
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(ObjectNodeOrderingKind value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior used to select tokens to be offered on outgoing ActivityEdges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see uml.activities.ActivitiesPackage#getObjectNode_Selection()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectNode'"
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link uml.activities.ObjectNode#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Behavior value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of tokens that may be held by this ObjectNode. Tokens cannot flow into the ObjectNode if the upperBound is reached. If no upperBound is specified, then there is no limit on how many tokens the ObjectNode can hold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(ValueSpecification)
	 * @see uml.activities.ActivitiesPackage#getObjectNode_UpperBound()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectNode'"
	 * @generated
	 */
	ValueSpecification getUpperBound();

	/**
	 * Sets the value of the '{@link uml.activities.ObjectNode#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(ValueSpecification value);

} // ObjectNode
