/**
 */
package uml.actions;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ValueSpecificationAction is an Action that evaluates a ValueSpecification and provides a result.
 * result.is(1,1)
 * value.type.conformsTo(result.type)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ValueSpecificationAction#getResult <em>Result</em>}</li>
 *   <li>{@link uml.actions.ValueSpecificationAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getValueSpecificationAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity compatible_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity='result.is(1,1)' compatible_type='value.type.conformsTo(result.type)'"
 * @generated
 */
public interface ValueSpecificationAction extends Action {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which the result value is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getValueSpecificationAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='valueSpecificationAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ValueSpecificationAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ValueSpecification to be evaluated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueSpecification)
	 * @see uml.actions.ActionsPackage#getValueSpecificationAction_Value()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='valueSpecificationAction'"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link uml.actions.ValueSpecificationAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

} // ValueSpecificationAction
