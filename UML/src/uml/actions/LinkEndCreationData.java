/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LinkEndCreationData is LinkEndData used to provide values for one end of a link to be created by a CreateLinkAction.
 * if  not end.isOrdered
 * then insertAt = null
 * else
 * 	not isReplaceAll=false implies
 * 	insertAt <> null and insertAt->forAll(type=UnlimitedNatural and is(1,1))
 * endif
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.LinkEndCreationData#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link uml.actions.LinkEndCreationData#isIsReplaceAll <em>Is Replace All</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getLinkEndCreationData()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='insertAt_pin'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL insertAt_pin='if  not end.isOrdered\nthen insertAt = null\nelse\n\tnot isReplaceAll=false implies\n\tinsertAt <> null and insertAt->forAll(type=UnlimitedNatural and is(1,1))\nendif\n'"
 * @generated
 */
public interface LinkEndCreationData extends LinkEndData {
	/**
	 * Returns the value of the '<em><b>Insert At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For ordered Association ends, the InputPin that provides the position where the new link should be inserted or where an existing link should be moved to. The type of the insertAt InputPin is UnlimitedNatural, but the input cannot be zero. It is omitted for Association ends that are not ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert At</em>' reference.
	 * @see #setInsertAt(InputPin)
	 * @see uml.actions.ActionsPackage#getLinkEndCreationData_InsertAt()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='linkEndCreationData'"
	 * @generated
	 */
	InputPin getInsertAt();

	/**
	 * Sets the value of the '{@link uml.actions.LinkEndCreationData#getInsertAt <em>Insert At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert At</em>' reference.
	 * @see #getInsertAt()
	 * @generated
	 */
	void setInsertAt(InputPin value);

	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the existing links emanating from the object on this end should be destroyed before creating a new link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(boolean)
	 * @see uml.actions.ActionsPackage#getLinkEndCreationData_IsReplaceAll()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReplaceAll();

	/**
	 * Sets the value of the '{@link uml.actions.LinkEndCreationData#isIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #isIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(boolean value);

} // LinkEndCreationData
