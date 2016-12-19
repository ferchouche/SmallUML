/**
 */
package uml.structuredClassifiers;

import uml.classification.Property;

import uml.commonStructure.MultiplicityElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConnectorEnd is an endpoint of a Connector, which attaches the Connector to a ConnectableElement.
 * partWithPort->notEmpty() implies 
 *   (role.oclIsKindOf(Port) and partWithPort.type.oclAsType(Namespace).member->includes(role))
 * (role.oclIsKindOf(Port) and role.owner = connector.owner) implies partWithPort->isEmpty()
 * self.compatibleWith(definingEnd)
 * partWithPort->notEmpty() implies not partWithPort.oclIsKindOf(Port)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.ConnectorEnd#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link uml.structuredClassifiers.ConnectorEnd#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link uml.structuredClassifiers.ConnectorEnd#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnectorEnd()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='role_and_part_with_port part_with_port_empty multiplicity self_part_with_port'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL role_and_part_with_port='partWithPort->notEmpty() implies \r\n  (role.oclIsKindOf(Port) and partWithPort.type.oclAsType(Namespace).member->includes(role))' part_with_port_empty='(role.oclIsKindOf(Port) and role.owner = connector.owner) implies partWithPort->isEmpty()' multiplicity='self.compatibleWith(definingEnd)' self_part_with_port='partWithPort->notEmpty() implies not partWithPort.oclIsKindOf(Port)'"
 * @generated
 */
public interface ConnectorEnd extends MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Defining End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A derived property referencing the corresponding end on the Association which types the Connector owing this ConnectorEnd, if any. It is derived by selecting the end at the same place in the ordering of Association ends as this ConnectorEnd.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining End</em>' reference.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnectorEnd_DefiningEnd()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectorEnd'"
	 * @generated
	 */
	Property getDefiningEnd();

	/**
	 * Returns the value of the '<em><b>Part With Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the role of the internal structure of a Classifier with the Port to which the ConnectorEnd is attached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part With Port</em>' reference.
	 * @see #setPartWithPort(Property)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnectorEnd_PartWithPort()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectorEnd'"
	 * @generated
	 */
	Property getPartWithPort();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.ConnectorEnd#getPartWithPort <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part With Port</em>' reference.
	 * @see #getPartWithPort()
	 * @generated
	 */
	void setPartWithPort(Property value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.structuredClassifiers.ConnectableElement#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectableElement attached at this ConnectorEnd. When an instance of the containing Classifier is created, a link may (depending on the multiplicities) be created to an instance of the Classifier that types this ConnectableElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(ConnectableElement)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnectorEnd_Role()
	 * @see uml.structuredClassifiers.ConnectableElement#getEnd
	 * @model opposite="end" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ConnectableElement getRole();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.ConnectorEnd#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ConnectableElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for ConnectorEnd::/definingEnd : Property
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if connector.type = null \r\nthen\r\n  null \r\nelse\r\n  let index : Integer = connector.end->indexOf(self) in\r\n    connector.type.memberEnd->at(index)\r\nendif'"
	 * @generated
	 */
	Property definingEnd();

} // ConnectorEnd
