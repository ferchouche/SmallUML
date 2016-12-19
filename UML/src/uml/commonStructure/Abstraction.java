/**
 */
package uml.commonStructure;

import uml.values.OpaqueExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Abstraction is a Relationship that relates two Elements or sets of Elements that represent the same concept at different levels of abstraction or from different viewpoints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.Abstraction#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getAbstraction()
 * @model
 * @generated
 */
public interface Abstraction extends Dependency {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OpaqueExpression that states the abstraction relationship between the supplier(s) and the client(s). In some cases, such as derivation, it is usually formal and unidirectional; in other cases, such as trace, it is usually informal and bidirectional. The mapping expression is optional and may be omitted if the precise relationship between the Elements is not specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(OpaqueExpression)
	 * @see uml.commonStructure.CommonStructurePackage#getAbstraction_Mapping()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='abstraction'"
	 * @generated
	 */
	OpaqueExpression getMapping();

	/**
	 * Sets the value of the '{@link uml.commonStructure.Abstraction#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(OpaqueExpression value);

} // Abstraction
