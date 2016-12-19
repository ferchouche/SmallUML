/**
 */
package uml.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LiteralReal is a specification of a Real value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.LiteralReal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getLiteralReal()
 * @model
 * @generated
 */
public interface LiteralReal extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified Real value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see uml.values.ValuesPackage#getLiteralReal_Value()
	 * @model dataType="types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link uml.values.LiteralReal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // LiteralReal
