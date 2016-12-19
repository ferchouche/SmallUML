/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Variable Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RemoveVariableValueAction is a WriteVariableAction that removes values from a Variables.
 * if  variable.isOrdered and not variable.isUnique and not isRemoveDuplicates then 
 *   value = null and
 *   removeAt <> null and
 *   removeAt.type = UnlimitedNatural and
 *   removeAt.is(1,1)
 * else
 *   removeAt = null and value <> null
 * endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.RemoveVariableValueAction#isIsRemoveDuplicates <em>Is Remove Duplicates</em>}</li>
 *   <li>{@link uml.actions.RemoveVariableValueAction#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getRemoveVariableValueAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='removeAt_and_value'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL removeAt_and_value='if  variable.isOrdered and not variable.isUnique and not isRemoveDuplicates then \r\n  value = null and\r\n  removeAt <> null and\r\n  removeAt.type = UnlimitedNatural and\r\n  removeAt.is(1,1)\r\nelse\r\n  removeAt = null and value <> null\r\nendif'"
 * @generated
 */
public interface RemoveVariableValueAction extends WriteVariableAction {
	/**
	 * Returns the value of the '<em><b>Is Remove Duplicates</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether to remove duplicates of the value in nonunique Variables.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Remove Duplicates</em>' attribute.
	 * @see #setIsRemoveDuplicates(boolean)
	 * @see uml.actions.ActionsPackage#getRemoveVariableValueAction_IsRemoveDuplicates()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRemoveDuplicates();

	/**
	 * Sets the value of the '{@link uml.actions.RemoveVariableValueAction#isIsRemoveDuplicates <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Remove Duplicates</em>' attribute.
	 * @see #isIsRemoveDuplicates()
	 * @generated
	 */
	void setIsRemoveDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An InputPin that provides the position of an existing value to remove in ordered, nonunique Variables. The type of the removeAt InputPin is UnlimitedNatural, but the value cannot be zero or unlimited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove At</em>' containment reference.
	 * @see #setRemoveAt(InputPin)
	 * @see uml.actions.ActionsPackage#getRemoveVariableValueAction_RemoveAt()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='removeVariableValueAction'"
	 * @generated
	 */
	InputPin getRemoveAt();

	/**
	 * Sets the value of the '{@link uml.actions.RemoveVariableValueAction#getRemoveAt <em>Remove At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove At</em>' containment reference.
	 * @see #getRemoveAt()
	 * @generated
	 */
	void setRemoveAt(InputPin value);

} // RemoveVariableValueAction
