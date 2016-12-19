/**
 */
package uml.stateMachines;

import uml.commonStructure.DirectedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Conformance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProtocolStateMachine can be redefined into a more specific ProtocolStateMachine or into behavioral StateMachine. ProtocolConformance declares that the specific ProtocolStateMachine specifies a protocol that conforms to the general ProtocolStateMachine or that the specific behavioral StateMachine abides by the protocol of the general ProtocolStateMachine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.ProtocolConformance#getGeneralMachine <em>General Machine</em>}</li>
 *   <li>{@link uml.stateMachines.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}</li>
 * </ul>
 *
 * @see uml.stateMachines.StateMachinesPackage#getProtocolConformance()
 * @model
 * @generated
 */
public interface ProtocolConformance extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>General Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the ProtocolStateMachine to which the specific ProtocolStateMachine conforms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Machine</em>' reference.
	 * @see #setGeneralMachine(ProtocolStateMachine)
	 * @see uml.stateMachines.StateMachinesPackage#getProtocolConformance_GeneralMachine()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='protocolConformance'"
	 * @generated
	 */
	ProtocolStateMachine getGeneralMachine();

	/**
	 * Sets the value of the '{@link uml.stateMachines.ProtocolConformance#getGeneralMachine <em>General Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Machine</em>' reference.
	 * @see #getGeneralMachine()
	 * @generated
	 */
	void setGeneralMachine(ProtocolStateMachine value);

	/**
	 * Returns the value of the '<em><b>Specific Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.stateMachines.ProtocolStateMachine#getConformance <em>Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the ProtocolStateMachine which conforms to the general ProtocolStateMachine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Machine</em>' container reference.
	 * @see #setSpecificMachine(ProtocolStateMachine)
	 * @see uml.stateMachines.StateMachinesPackage#getProtocolConformance_SpecificMachine()
	 * @see uml.stateMachines.ProtocolStateMachine#getConformance
	 * @model opposite="conformance" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ProtocolStateMachine getSpecificMachine();

	/**
	 * Sets the value of the '{@link uml.stateMachines.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Machine</em>' container reference.
	 * @see #getSpecificMachine()
	 * @generated
	 */
	void setSpecificMachine(ProtocolStateMachine value);

} // ProtocolConformance
