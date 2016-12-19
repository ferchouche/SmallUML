/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.Dependency;
import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CollaborationUse is used to specify the application of a pattern specified by a Collaboration to a specific situation.
 * roleBinding->collect(client)->forAll(ne1, ne2 |
 *   ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and
 *     let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in
 *       ce1.structuredClassifier = ce2.structuredClassifier)
 * and
 *   roleBinding->collect(supplier)->forAll(ne1, ne2 |
 *   ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and
 *     let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in
 *       ce1.collaboration = ce2.collaboration)
 * type.collaborationRole->forAll(role | roleBinding->exists(rb | rb.supplier->includes(role)))
 * type.ownedConnector->forAll(connector |
 *   let rolesConnectedInCollab : Set(ConnectableElement) = connector.end.role->asSet(),
 *         relevantBindings : Set(Dependency) = roleBinding->select(rb | rb.supplier->intersection(rolesConnectedInCollab)->notEmpty()),
 *         boundRoles : Set(ConnectableElement) = relevantBindings->collect(client.oclAsType(ConnectableElement))->asSet(),
 *         contextClassifier : StructuredClassifier = boundRoles->any(true).structuredClassifier->any(true) in
 *           contextClassifier.ownedConnector->exists( correspondingConnector | 
 *               correspondingConnector.end.role->forAll( role | boundRoles->includes(role) )
 *               and (connector.type->notEmpty() and correspondingConnector.type->notEmpty()) implies connector.type->forAll(conformsTo(correspondingConnector.type)) )
 * )
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.CollaborationUse#getRoleBinding <em>Role Binding</em>}</li>
 *   <li>{@link uml.structuredClassifiers.CollaborationUse#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getCollaborationUse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='client_elements every_role connectors'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL client_elements='roleBinding->collect(client)->forAll(ne1, ne2 |\r\n  ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and\r\n    let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in\r\n      ce1.structuredClassifier = ce2.structuredClassifier)\r\nand\r\n  roleBinding->collect(supplier)->forAll(ne1, ne2 |\r\n  ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and\r\n    let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in\r\n      ce1.collaboration = ce2.collaboration)' every_role='type.collaborationRole->forAll(role | roleBinding->exists(rb | rb.supplier->includes(role)))' connectors='type.ownedConnector->forAll(connector |\r\n  let rolesConnectedInCollab : Set(ConnectableElement) = connector.end.role->asSet(),\r\n        relevantBindings : Set(Dependency) = roleBinding->select(rb | rb.supplier->intersection(rolesConnectedInCollab)->notEmpty()),\r\n        boundRoles : Set(ConnectableElement) = relevantBindings->collect(client.oclAsType(ConnectableElement))->asSet(),\r\n        contextClassifier : StructuredClassifier = boundRoles->any(true).structuredClassifier->any(true) in\r\n          contextClassifier.ownedConnector->exists( correspondingConnector | \r\n              correspondingConnector.end.role->forAll( role | boundRoles->includes(role) )\r\n              and (connector.type->notEmpty() and correspondingConnector.type->notEmpty()) implies connector.type->forAll(conformsTo(correspondingConnector.type)) )\r\n)'"
 * @generated
 */
public interface CollaborationUse extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Role Binding</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A mapping between features of the Collaboration and features of the owning Classifier. This mapping indicates which ConnectableElement of the Classifier plays which role(s) in the Collaboration. A ConnectableElement may be bound to multiple roles in the same CollaborationUse (that is, it may play multiple roles).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Binding</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getCollaborationUse_RoleBinding()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='collaborationUse'"
	 * @generated
	 */
	EList<Dependency> getRoleBinding();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Collaboration which is used in this CollaborationUse. The Collaboration defines the cooperation between its roles which are mapped to ConnectableElements relating to the Classifier owning the CollaborationUse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Collaboration)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getCollaborationUse_Type()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='collaborationUse'"
	 * @generated
	 */
	Collaboration getType();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.CollaborationUse#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Collaboration value);

} // CollaborationUse
