/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReadStructuralFeatureAction is a StructuralFeatureAction that retrieves the values of a StructuralFeature.
 * structuralFeature.compatibleWith(result)
 * result.type =structuralFeature.type and 
 * result.isOrdered = structuralFeature.isOrdered
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReadStructuralFeatureAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReadStructuralFeatureAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity type_and_ordering'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity='structuralFeature.compatibleWith(result)' type_and_ordering='result.type =structuralFeature.type and \nresult.isOrdered = structuralFeature.isOrdered\n'"
 * @generated
 */
public interface ReadStructuralFeatureAction extends StructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which the result values are placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getReadStructuralFeatureAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readStructuralFeatureAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ReadStructuralFeatureAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // ReadStructuralFeatureAction
