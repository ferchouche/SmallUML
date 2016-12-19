/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LinkEndDestructionData is LinkEndData used to provide values for one end of a link to be destroyed by a DestroyLinkAction.
 * if  not end.isOrdered or end.isUnique or isDestroyDuplicates
 * then destroyAt = null
 * else
 * 	destroyAt <> null and 
 * 	destroyAt->forAll(type=UnlimitedNatural and is(1,1))
 * endif
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}</li>
 *   <li>{@link uml.actions.LinkEndDestructionData#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getLinkEndDestructionData()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='destroyAt_pin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL destroyAt_pin='if  not end.isOrdered or end.isUnique or isDestroyDuplicates\r\nthen destroyAt = null\r\nelse\r\n\tdestroyAt <> null and \r\n\tdestroyAt->forAll(type=UnlimitedNatural and is(1,1))\r\nendif\r\n'"
 * @generated
 */
public interface LinkEndDestructionData extends LinkEndData {
	/**
	 * Returns the value of the '<em><b>Destroy At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that provides the position of an existing link to be destroyed in an ordered, nonunique Association end. The type of the destroyAt InputPin is UnlimitedNatural, but the value cannot be zero or unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destroy At</em>' reference.
	 * @see #setDestroyAt(InputPin)
	 * @see uml.actions.ActionsPackage#getLinkEndDestructionData_DestroyAt()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='linkEndDestructionData'"
	 * @generated
	 */
	InputPin getDestroyAt();

	/**
	 * Sets the value of the '{@link uml.actions.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy At</em>' reference.
	 * @see #getDestroyAt()
	 * @generated
	 */
	void setDestroyAt(InputPin value);

	/**
	 * Returns the value of the '<em><b>Is Destroy Duplicates</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to destroy duplicates of the value in nonunique Association ends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Destroy Duplicates</em>' attribute.
	 * @see #setIsDestroyDuplicates(boolean)
	 * @see uml.actions.ActionsPackage#getLinkEndDestructionData_IsDestroyDuplicates()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDestroyDuplicates();

	/**
	 * Sets the value of the '{@link uml.actions.LinkEndDestructionData#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Duplicates</em>' attribute.
	 * @see #isIsDestroyDuplicates()
	 * @generated
	 */
	void setIsDestroyDuplicates(boolean value);

} // LinkEndDestructionData
