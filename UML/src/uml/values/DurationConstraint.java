/**
 */
package uml.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DurationConstraint is a Constraint that refers to a DurationInterval.
 * if (constrainedElement->size() = 2)
 *   then (firstEvent->size() = 2) else (firstEvent->size() = 0) 
 * endif
 * constrainedElement->size() = 1 or constrainedElement->size()=2
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.DurationConstraint#getFirstEvent <em>First Event</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getDurationConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='first_event_multiplicity has_one_or_two_constrainedElements'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL first_event_multiplicity='if (constrainedElement->size() = 2)\r\n  then (firstEvent->size() = 2) else (firstEvent->size() = 0) \r\nendif' has_one_or_two_constrainedElements='constrainedElement->size() = 1 or constrainedElement->size()=2'"
 * @generated
 */
public interface DurationConstraint extends IntervalConstraint {
	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of firstEvent[i] is related to constrainedElement[i] (where i is 1 or 2). If firstEvent[i] is true, then the corresponding observation event is the first time instant the execution enters constrainedElement[i]. If firstEvent[i] is false, then the corresponding observation event is the last time instant the execution is within constrainedElement[i].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Event</em>' attribute list.
	 * @see uml.values.ValuesPackage#getDurationConstraint_FirstEvent()
	 * @model dataType="types.Boolean" upper="2" ordered="false"
	 * @generated
	 */
	EList<Boolean> getFirstEvent();

} // DurationConstraint
