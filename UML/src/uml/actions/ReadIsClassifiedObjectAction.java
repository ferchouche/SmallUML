/**
 */
package uml.actions;

import uml.classification.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Is Classified Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReadIsClassifiedObjectAction is an Action that determines whether an object is classified by a given Classifier.
 * object.type = null
 * result.is(1,1)
 * result.type = Boolean
 * object.is(1,1)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReadIsClassifiedObjectAction#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link uml.actions.ReadIsClassifiedObjectAction#isIsDirect <em>Is Direct</em>}</li>
 *   <li>{@link uml.actions.ReadIsClassifiedObjectAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml.actions.ReadIsClassifiedObjectAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReadIsClassifiedObjectAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_type multiplicity_of_output boolean_result multiplicity_of_input'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL no_type='object.type = null' multiplicity_of_output='result.is(1,1)' boolean_result='result.type = Boolean' multiplicity_of_input='object.is(1,1)'"
 * @generated
 */
public interface ReadIsClassifiedObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier against which the classification of the input object is tested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(Classifier)
	 * @see uml.actions.ActionsPackage#getReadIsClassifiedObjectAction_Classifier()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readIsClassifiedObjectAction'"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * Sets the value of the '{@link uml.actions.ReadIsClassifiedObjectAction#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Is Direct</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the input object must be directly classified by the given Classifier or whether it may also be an instance of a specialization of the given Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Direct</em>' attribute.
	 * @see #setIsDirect(boolean)
	 * @see uml.actions.ActionsPackage#getReadIsClassifiedObjectAction_IsDirect()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDirect();

	/**
	 * Sets the value of the '{@link uml.actions.ReadIsClassifiedObjectAction#isIsDirect <em>Is Direct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Direct</em>' attribute.
	 * @see #isIsDirect()
	 * @generated
	 */
	void setIsDirect(boolean value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that holds the object whose classification is to be tested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.actions.ActionsPackage#getReadIsClassifiedObjectAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readIsClassifiedObjectAction'"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.actions.ReadIsClassifiedObjectAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin that holds the Boolean result of the test.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getReadIsClassifiedObjectAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readIsClassifiedObjectAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ReadIsClassifiedObjectAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // ReadIsClassifiedObjectAction
