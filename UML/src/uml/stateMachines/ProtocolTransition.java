/**
 */
package uml.stateMachines;

import org.eclipse.emf.common.util.EList;

import uml.classification.Operation;

import uml.commonStructure.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProtocolTransition specifies a legal Transition for an Operation. Transitions of ProtocolStateMachines have the following information: a pre-condition (guard), a Trigger, and a post-condition. Every ProtocolTransition is associated with at most one BehavioralFeature belonging to the context Classifier of the ProtocolStateMachine.
 * if (referred()->notEmpty() and containingStateMachine()._'context'->notEmpty()) then 
 *     containingStateMachine()._'context'.oclAsType(BehavioredClassifier).allFeatures()->includesAll(referred())
 * else true endif
 * effect = null
 * container.belongsToPSM()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.ProtocolTransition#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link uml.stateMachines.ProtocolTransition#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link uml.stateMachines.ProtocolTransition#getReferred <em>Referred</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getProtocolTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='refers_to_operation associated_actions belongs_to_psm'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL refers_to_operation='if (referred()->notEmpty() and containingStateMachine()._\'context\'->notEmpty()) then \r\n    containingStateMachine()._\'context\'.oclAsType(BehavioredClassifier).allFeatures()->includesAll(referred())\r\nelse true endif' associated_actions='effect = null' belongs_to_psm='container.belongsToPSM()'"
 * @generated
 */
public interface ProtocolTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the post condition of the Transition which is the Condition that should be obtained once the Transition is triggered. This post condition is part of the post condition of the Operation connected to the Transition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Condition</em>' reference.
	 * @see #setPostCondition(Constraint)
	 * @see uml.stateMachines.StateMachinesPackage#getProtocolTransition_PostCondition()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningTransition'"
	 * @generated
	 */
	Constraint getPostCondition();

	/**
	 * Sets the value of the '{@link uml.stateMachines.ProtocolTransition#getPostCondition <em>Post Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the precondition of the Transition. It specifies the Condition that should be verified before triggering the Transition. This guard condition added to the source State will be evaluated as part of the precondition of the Operation referred by the Transition if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Condition</em>' reference.
	 * @see #setPreCondition(Constraint)
	 * @see uml.stateMachines.StateMachinesPackage#getProtocolTransition_PreCondition()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='protocolTransition'"
	 * @generated
	 */
	Constraint getPreCondition();

	/**
	 * Sets the value of the '{@link uml.stateMachines.ProtocolTransition#getPreCondition <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Referred</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This association refers to the associated Operation. It is derived from the Operation of the CallEvent Trigger when applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referred</em>' reference list.
	 * @see uml.stateMachines.StateMachinesPackage#getProtocolTransition_Referred()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='protocolTransition'"
	 * @generated
	 */
	EList<Operation> getReferred();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for ProtocolTransition::/referred
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='trigger->collect(event)->select(oclIsKindOf(CallEvent))->collect(oclAsType(CallEvent).operation)->asSet()'"
	 * @generated
	 */
	EList<Operation> referred();

} // ProtocolTransition
