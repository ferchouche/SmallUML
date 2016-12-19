/**
 */
package uml.interactions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExecutionSpecification is a specification of the execution of a unit of Behavior or Action within the Lifeline. The duration of an ExecutionSpecification is represented by two OccurrenceSpecifications, the start OccurrenceSpecification and the finish OccurrenceSpecification.
 * start.covered = finish.covered
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.ExecutionSpecification#getFinish <em>Finish</em>}</li>
 *   <li>{@link uml.interactions.ExecutionSpecification#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getExecutionSpecification()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='same_lifeline'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL same_lifeline='start.covered = finish.covered'"
 * @generated
 */
public interface ExecutionSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the OccurrenceSpecification that designates the finish of the Action or Behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finish</em>' reference.
	 * @see #setFinish(OccurrenceSpecification)
	 * @see uml.interactions.InteractionsPackage#getExecutionSpecification_Finish()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='executionSpecification'"
	 * @generated
	 */
	OccurrenceSpecification getFinish();

	/**
	 * Sets the value of the '{@link uml.interactions.ExecutionSpecification#getFinish <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(OccurrenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the OccurrenceSpecification that designates the start of the Action or Behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(OccurrenceSpecification)
	 * @see uml.interactions.InteractionsPackage#getExecutionSpecification_Start()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='executionSpecification'"
	 * @generated
	 */
	OccurrenceSpecification getStart();

	/**
	 * Sets the value of the '{@link uml.interactions.ExecutionSpecification#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(OccurrenceSpecification value);

} // ExecutionSpecification
