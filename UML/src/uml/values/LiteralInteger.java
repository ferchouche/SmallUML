/**
 */
package uml.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LiteralInteger is a specification of an Integer value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.LiteralInteger#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getLiteralInteger()
 * @model
 * @generated
 */
public interface LiteralInteger extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified Integer value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see uml.values.ValuesPackage#getLiteralInteger_Value()
	 * @model default="0" dataType="types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link uml.values.LiteralInteger#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // LiteralInteger
