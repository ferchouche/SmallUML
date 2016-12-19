/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clear Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ClearStructuralFeatureAction is a StructuralFeatureAction that removes all values of a StructuralFeature.
 * result<>null implies result.type = object.type
 * result<>null implies result.is(1,1)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ClearStructuralFeatureAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getClearStructuralFeatureAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='type_of_result multiplicity_of_result'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL type_of_result='result<>null implies result.type = object.type' multiplicity_of_result='result<>null implies result.is(1,1)'"
 * @generated
 */
public interface ClearStructuralFeatureAction extends StructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which is put the input object as modified by the ClearStructuralFeatureAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getClearStructuralFeatureAction_Result()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='clearStructuralFeatureAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ClearStructuralFeatureAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // ClearStructuralFeatureAction
