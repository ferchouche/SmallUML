/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TestIdentityAction is an Action that tests if two values are identical objects.
 * first.is(1,1) and second.is(1,1)
 * 
 * first.type= null and second.type = null
 * 
 * result.type=Boolean
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.TestIdentityAction#getFirst <em>First</em>}</li>
 *   <li>{@link uml.actions.TestIdentityAction#getResult <em>Result</em>}</li>
 *   <li>{@link uml.actions.TestIdentityAction#getSecond <em>Second</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getTestIdentityAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity no_type result_is_boolean'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity='first.is(1,1) and second.is(1,1)\n' no_type='first.type= null and second.type = null\n' result_is_boolean='result.type=Boolean'"
 * @generated
 */
public interface TestIdentityAction extends Action {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin on which the first input object is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(InputPin)
	 * @see uml.actions.ActionsPackage#getTestIdentityAction_First()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='testIdentityAction'"
	 * @generated
	 */
	InputPin getFirst();

	/**
	 * Sets the value of the '{@link uml.actions.TestIdentityAction#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(InputPin value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin whose Boolean value indicates whether the two input objects are identical.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getTestIdentityAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='testIdentityAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.TestIdentityAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which the second input object is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second</em>' containment reference.
	 * @see #setSecond(InputPin)
	 * @see uml.actions.ActionsPackage#getTestIdentityAction_Second()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='testIdentityAction'"
	 * @generated
	 */
	InputPin getSecond();

	/**
	 * Sets the value of the '{@link uml.actions.TestIdentityAction#getSecond <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' containment reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(InputPin value);

} // TestIdentityAction
