/**
 */
package uml.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Interval defines the range between two ValueSpecifications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.Interval#getMax <em>Max</em>}</li>
 *   <li>{@link uml.values.Interval#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the ValueSpecification denoting the maximum value of the range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(ValueSpecification)
	 * @see uml.values.ValuesPackage#getInterval_Max()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interval'"
	 * @generated
	 */
	ValueSpecification getMax();

	/**
	 * Sets the value of the '{@link uml.values.Interval#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the ValueSpecification denoting the minimum value of the range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(ValueSpecification)
	 * @see uml.values.ValuesPackage#getInterval_Min()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interval'"
	 * @generated
	 */
	ValueSpecification getMin();

	/**
	 * Sets the value of the '{@link uml.values.Interval#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(ValueSpecification value);

} // Interval
