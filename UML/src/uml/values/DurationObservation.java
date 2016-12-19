/**
 */
package uml.values;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DurationObservation is a reference to a duration during an execution. It points out the NamedElement(s) in the model to observe and whether the observations are when this NamedElement is entered or when it is exited.
 * if (event->size() = 2)
 *   then (firstEvent->size() = 2) else (firstEvent->size() = 0)
 * endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.DurationObservation#getEvent <em>Event</em>}</li>
 *   <li>{@link uml.values.DurationObservation#getFirstEvent <em>First Event</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getDurationObservation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='first_event_multiplicity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL first_event_multiplicity='if (event->size() = 2)\r\n  then (firstEvent->size() = 2) else (firstEvent->size() = 0)\r\nendif'"
 * @generated
 */
public interface DurationObservation extends Observation {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DurationObservation is determined as the duration between the entering or exiting of a single event Element during execution, or the entering/exiting of one event Element and the entering/exiting of a second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see uml.values.ValuesPackage#getDurationObservation_Event()
	 * @model required="true" upper="2"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='durationObservation'"
	 * @generated
	 */
	EList<NamedElement> getEvent();

	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of firstEvent[i] is related to event[i] (where i is 1 or 2). If firstEvent[i] is true, then the corresponding observation event is the first time instant the execution enters event[i]. If firstEvent[i] is false, then the corresponding observation event is the time instant the execution exits event[i].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Event</em>' attribute list.
	 * @see uml.values.ValuesPackage#getDurationObservation_FirstEvent()
	 * @model dataType="types.Boolean" upper="2" ordered="false"
	 * @generated
	 */
	EList<Boolean> getFirstEvent();

} // DurationObservation
