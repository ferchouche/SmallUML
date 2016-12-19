/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Self Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReadSelfAction is an Action that retrieves the context object of the Behavior execution within which the ReadSelfAction execution is taking place.
 * _'context' <> null
 * result.is(1,1)
 * let behavior: Behavior = self.containingBehavior() in
 * behavior.specification<>null implies not behavior.specification.isStatic
 * result.type = _'context'
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReadSelfAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReadSelfAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='contained multiplicity not_static type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL contained='_\'context\' <> null' multiplicity='result.is(1,1)' not_static='let behavior: Behavior = self.containingBehavior() in\r\nbehavior.specification<>null implies not behavior.specification.isStatic' type='result.type = _\'context\''"
 * @generated
 */
public interface ReadSelfAction extends Action {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which the context object is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getReadSelfAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readSelfAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ReadSelfAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // ReadSelfAction
