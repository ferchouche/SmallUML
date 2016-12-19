/**
 */
package uml.actions;

import uml.activities.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VariableAction is an abstract class for Actions that operate on a specified Variable.
 * variable.isAccessibleBy(self)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.VariableAction#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getVariableAction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='scope_of_variable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL scope_of_variable='variable.isAccessibleBy(self)'"
 * @generated
 */
public interface VariableAction extends Action {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Variable to be read or written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see uml.actions.ActionsPackage#getVariableAction_Variable()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='variableAction'"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link uml.actions.VariableAction#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // VariableAction
