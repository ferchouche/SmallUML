/**
 */
package uml.actions;

import uml.structuredClassifiers.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clear Association Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ClearAssociationAction is an Action that destroys all links of an Association in which a particular object participates.
 * object.is(1,1)
 * association.memberEnd->exists(self.object.type.conformsTo(type))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ClearAssociationAction#getAssociation <em>Association</em>}</li>
 *   <li>{@link uml.actions.ClearAssociationAction#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getClearAssociationAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity same_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity='object.is(1,1)' same_type='association.memberEnd->exists(self.object.type.conformsTo(type))'"
 * @generated
 */
public interface ClearAssociationAction extends Action {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Association to be cleared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uml.actions.ActionsPackage#getClearAssociationAction_Association()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='clearAssociationAction'"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uml.actions.ClearAssociationAction#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that gives the object whose participation in the Association is to be cleared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.actions.ActionsPackage#getClearAssociationAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='clearAssociationAction'"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.actions.ClearAssociationAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

} // ClearAssociationAction
