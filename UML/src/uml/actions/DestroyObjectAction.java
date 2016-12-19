/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DestroyObjectAction is an Action that destroys objects.
 * target.is(1,1)
 * target.type= null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.DestroyObjectAction#isIsDestroyLinks <em>Is Destroy Links</em>}</li>
 *   <li>{@link uml.actions.DestroyObjectAction#isIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}</li>
 *   <li>{@link uml.actions.DestroyObjectAction#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getDestroyObjectAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity no_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity='target.is(1,1)' no_type='target.type= null'"
 * @generated
 */
public interface DestroyObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Destroy Links</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether links in which the object participates are destroyed along with the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #setIsDestroyLinks(boolean)
	 * @see uml.actions.ActionsPackage#getDestroyObjectAction_IsDestroyLinks()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDestroyLinks();

	/**
	 * Sets the value of the '{@link uml.actions.DestroyObjectAction#isIsDestroyLinks <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #isIsDestroyLinks()
	 * @generated
	 */
	void setIsDestroyLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Destroy Owned Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether objects owned by the object (via composition) are destroyed along with the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #setIsDestroyOwnedObjects(boolean)
	 * @see uml.actions.ActionsPackage#getDestroyObjectAction_IsDestroyOwnedObjects()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDestroyOwnedObjects();

	/**
	 * Sets the value of the '{@link uml.actions.DestroyObjectAction#isIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #isIsDestroyOwnedObjects()
	 * @generated
	 */
	void setIsDestroyOwnedObjects(boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin providing the object to be destroyed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see uml.actions.ActionsPackage#getDestroyObjectAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='destroyObjectAction'"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link uml.actions.DestroyObjectAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

} // DestroyObjectAction
