/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WriteStructuralFeatureAction is an abstract class for StructuralFeatureActions that change StructuralFeature values.
 * result <> null implies result.is(1,1)
 * value <> null implies value.type.conformsTo(structuralFeature.type)
 * value<>null implies value.is(1,1)
 * result <> null implies result.type = object.type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.WriteStructuralFeatureAction#getResult <em>Result</em>}</li>
 *   <li>{@link uml.actions.WriteStructuralFeatureAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getWriteStructuralFeatureAction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity_of_result type_of_value multiplicity_of_value type_of_result'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity_of_result='result <> null implies result.is(1,1)' type_of_value='value <> null implies value.type.conformsTo(structuralFeature.type)' multiplicity_of_value='value<>null implies value.is(1,1)' type_of_result='result <> null implies result.type = object.type'"
 * @generated
 */
public interface WriteStructuralFeatureAction extends StructuralFeatureAction {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which is put the input object as modified by the WriteStructuralFeatureAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getWriteStructuralFeatureAction_Result()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='writeStructuralFeatureAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.WriteStructuralFeatureAction#getResult <em>Result</em>}' containment reference.
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
	 * The InputPin that provides the value to be added or removed from the StructuralFeature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(InputPin)
	 * @see uml.actions.ActionsPackage#getWriteStructuralFeatureAction_Value()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='writeStructuralFeatureAction'"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link uml.actions.WriteStructuralFeatureAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

} // WriteStructuralFeatureAction
