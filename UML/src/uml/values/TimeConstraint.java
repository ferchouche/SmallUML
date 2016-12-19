/**
 */
package uml.values;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeConstraint is a Constraint that refers to a TimeInterval.
 * constrainedElement->size() = 1
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.TimeConstraint#isFirstEvent <em>First Event</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getTimeConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='has_one_constrainedElement'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL has_one_constrainedElement='constrainedElement->size() = 1'"
 * @generated
 */
public interface TimeConstraint extends IntervalConstraint {
	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of firstEvent is related to the constrainedElement. If firstEvent is true, then the corresponding observation event is the first time instant the execution enters the constrainedElement. If firstEvent is false, then the corresponding observation event is the last time instant the execution is within the constrainedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Event</em>' attribute.
	 * @see #setFirstEvent(boolean)
	 * @see uml.values.ValuesPackage#getTimeConstraint_FirstEvent()
	 * @model default="true" dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isFirstEvent();

	/**
	 * Sets the value of the '{@link uml.values.TimeConstraint#isFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #isFirstEvent()
	 * @generated
	 */
	void setFirstEvent(boolean value);

} // TimeConstraint
