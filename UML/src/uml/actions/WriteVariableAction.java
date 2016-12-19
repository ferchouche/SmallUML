/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Variable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WriteVariableAction is an abstract class for VariableActions that change Variable values.
 * value <> null implies value.type.conformsTo(variable.type)
 * value<>null implies value.is(1,1)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.WriteVariableAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getWriteVariableAction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='value_type multiplicity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL value_type='value <> null implies value.type.conformsTo(variable.type)' multiplicity='value<>null implies value.is(1,1)'"
 * @generated
 */
public interface WriteVariableAction extends VariableAction {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that gives the value to be added or removed from the Variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(InputPin)
	 * @see uml.actions.ActionsPackage#getWriteVariableAction_Value()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='writeVariableAction'"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link uml.actions.WriteVariableAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

} // WriteVariableAction
