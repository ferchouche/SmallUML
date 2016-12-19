/**
 */
package uml.actions;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ValuePin is an InputPin that provides a value by evaluating a ValueSpecification.
 * incoming->isEmpty()
 * value.type.conformsTo(type)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ValuePin#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getValuePin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_incoming_edges compatible_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL no_incoming_edges='incoming->isEmpty()' compatible_type='value.type.conformsTo(type)'"
 * @generated
 */
public interface ValuePin extends InputPin {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ValueSpecification that is evaluated to obtain the value that the ValuePin will provide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueSpecification)
	 * @see uml.actions.ActionsPackage#getValuePin_Value()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='valuePin'"
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link uml.actions.ValuePin#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

} // ValuePin
