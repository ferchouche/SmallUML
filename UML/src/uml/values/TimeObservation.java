/**
 */
package uml.values;

import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeObservation is a reference to a time instant during an execution. It points out the NamedElement in the model to observe and whether the observation is when this NamedElement is entered or when it is exited.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.TimeObservation#getEvent <em>Event</em>}</li>
 *   <li>{@link uml.values.TimeObservation#isFirstEvent <em>First Event</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getTimeObservation()
 * @model
 * @generated
 */
public interface TimeObservation extends Observation {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TimeObservation is determined by the entering or exiting of the event Element during execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(NamedElement)
	 * @see uml.values.ValuesPackage#getTimeObservation_Event()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='timeObservation'"
	 * @generated
	 */
	NamedElement getEvent();

	/**
	 * Sets the value of the '{@link uml.values.TimeObservation#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(NamedElement value);

	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of firstEvent is related to the event. If firstEvent is true, then the corresponding observation event is the first time instant the execution enters the event Element. If firstEvent is false, then the corresponding observation event is the time instant the execution exits the event Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Event</em>' attribute.
	 * @see #setFirstEvent(boolean)
	 * @see uml.values.ValuesPackage#getTimeObservation_FirstEvent()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isFirstEvent();

	/**
	 * Sets the value of the '{@link uml.values.TimeObservation#isFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #isFirstEvent()
	 * @generated
	 */
	void setFirstEvent(boolean value);

} // TimeObservation
