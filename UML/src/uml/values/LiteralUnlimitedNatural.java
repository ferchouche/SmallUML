/**
 */
package uml.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Unlimited Natural</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LiteralUnlimitedNatural is a specification of an UnlimitedNatural number.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.LiteralUnlimitedNatural#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getLiteralUnlimitedNatural()
 * @model
 * @generated
 */
public interface LiteralUnlimitedNatural extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified UnlimitedNatural value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see uml.values.ValuesPackage#getLiteralUnlimitedNatural_Value()
	 * @model default="0" dataType="types.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link uml.values.LiteralUnlimitedNatural#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // LiteralUnlimitedNatural
