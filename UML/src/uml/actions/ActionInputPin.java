/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Input Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ActionInputPin is a kind of InputPin that executes an Action to determine the values to input to another Action.
 * fromAction.input->forAll(oclIsKindOf(ActionInputPin))
 * fromAction.output->size() = 1
 * fromAction.incoming->union(outgoing)->isEmpty() and
 * fromAction.input.incoming->isEmpty() and
 * fromAction.output.outgoing->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ActionInputPin#getFromAction <em>From Action</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getActionInputPin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='input_pin one_output_pin no_control_or_object_flow'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL input_pin='fromAction.input->forAll(oclIsKindOf(ActionInputPin))' one_output_pin='fromAction.output->size() = 1' no_control_or_object_flow='fromAction.incoming->union(outgoing)->isEmpty() and\r\nfromAction.input.incoming->isEmpty() and\r\nfromAction.output.outgoing->isEmpty()'"
 * @generated
 */
public interface ActionInputPin extends InputPin {
	/**
	 * Returns the value of the '<em><b>From Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Action used to provide the values of the ActionInputPin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Action</em>' containment reference.
	 * @see #setFromAction(Action)
	 * @see uml.actions.ActionsPackage#getActionInputPin_FromAction()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actionInputPin'"
	 * @generated
	 */
	Action getFromAction();

	/**
	 * Sets the value of the '{@link uml.actions.ActionInputPin#getFromAction <em>From Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Action</em>' containment reference.
	 * @see #getFromAction()
	 * @generated
	 */
	void setFromAction(Action value);

} // ActionInputPin
