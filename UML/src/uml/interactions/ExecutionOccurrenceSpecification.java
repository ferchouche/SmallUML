/**
 */
package uml.interactions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExecutionOccurrenceSpecification represents moments in time at which Actions or Behaviors start or finish.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getExecutionOccurrenceSpecification()
 * @model
 * @generated
 */
public interface ExecutionOccurrenceSpecification extends OccurrenceSpecification {
	/**
	 * Returns the value of the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the execution specification describing the execution that is started or finished at this execution event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution</em>' reference.
	 * @see #setExecution(ExecutionSpecification)
	 * @see uml.interactions.InteractionsPackage#getExecutionOccurrenceSpecification_Execution()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='executionOccurrenceSpecification'"
	 * @generated
	 */
	ExecutionSpecification getExecution();

	/**
	 * Sets the value of the '{@link uml.interactions.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(ExecutionSpecification value);

} // ExecutionOccurrenceSpecification
