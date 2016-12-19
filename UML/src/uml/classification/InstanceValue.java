/**
 */
package uml.classification;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InstanceValue is a ValueSpecification that identifies an instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.InstanceValue#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getInstanceValue()
 * @model
 * @generated
 */
public interface InstanceValue extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceSpecification that represents the specified value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(InstanceSpecification)
	 * @see uml.classification.ClassificationPackage#getInstanceValue_Instance()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='instanceValue'"
	 * @generated
	 */
	InstanceSpecification getInstance();

	/**
	 * Sets the value of the '{@link uml.classification.InstanceValue#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(InstanceSpecification value);

} // InstanceValue
