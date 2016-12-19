/**
 */
package uml.activities;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A JoinNode is a ControlNode that synchronizes multiple flows.
 * outgoing->size() = 1
 * if incoming->exists(oclIsKindOf(ObjectFlow)) then outgoing->forAll(oclIsKindOf(ObjectFlow))
 * else outgoing->forAll(oclIsKindOf(ControlFlow))
 * endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 *   <li>{@link uml.activities.JoinNode#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getJoinNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='one_outgoing_edge incoming_object_flow'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL one_outgoing_edge='outgoing->size() = 1' incoming_object_flow='if incoming->exists(oclIsKindOf(ObjectFlow)) then outgoing->forAll(oclIsKindOf(ObjectFlow))\r\nelse outgoing->forAll(oclIsKindOf(ControlFlow))\r\nendif'"
 * @generated
 */
public interface JoinNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether incoming tokens having objects with the same identity are combined into one by the JoinNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #setIsCombineDuplicate(boolean)
	 * @see uml.activities.ActivitiesPackage#getJoinNode_IsCombineDuplicate()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsCombineDuplicate();

	/**
	 * Sets the value of the '{@link uml.activities.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #isIsCombineDuplicate()
	 * @generated
	 */
	void setIsCombineDuplicate(boolean value);

	/**
	 * Returns the value of the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification giving the condition under which the JoinNode will offer a token on its outgoing ActivityEdge. If no joinSpec is specified, then the JoinNode will offer an outgoing token if tokens are offered on all of its incoming ActivityEdges (an \"and\" condition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Join Spec</em>' containment reference.
	 * @see #setJoinSpec(ValueSpecification)
	 * @see uml.activities.ActivitiesPackage#getJoinNode_JoinSpec()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='joinNode'"
	 * @generated
	 */
	ValueSpecification getJoinSpec();

	/**
	 * Sets the value of the '{@link uml.activities.JoinNode#getJoinSpec <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Spec</em>' containment reference.
	 * @see #getJoinSpec()
	 * @generated
	 */
	void setJoinSpec(ValueSpecification value);

} // JoinNode
