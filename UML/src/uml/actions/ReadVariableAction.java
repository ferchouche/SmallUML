/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Variable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReadVariableAction is a VariableAction that retrieves the values of a Variable.
 * result.type =variable.type and 
 * result.isOrdered = variable.isOrdered
 * 
 * variable.compatibleWith(result)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReadVariableAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReadVariableAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='type_and_ordering compatible_multiplicity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL type_and_ordering='result.type =variable.type and \nresult.isOrdered = variable.isOrdered\n' compatible_multiplicity='variable.compatibleWith(result)'"
 * @generated
 */
public interface ReadVariableAction extends VariableAction {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which the result values are placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getReadVariableAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readVariableAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ReadVariableAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // ReadVariableAction
