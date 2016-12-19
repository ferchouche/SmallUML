/**
 */
package uml.simpleClassifiers;

import uml.classification.InstanceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An EnumerationLiteral is a user-defined data value for an Enumeration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.EnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends InstanceSpecification {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.simpleClassifiers.Enumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Enumeration that this EnumerationLiteral is a member of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration</em>' container reference.
	 * @see #setEnumeration(Enumeration)
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getEnumerationLiteral_Enumeration()
	 * @see uml.simpleClassifiers.Enumeration#getOwnedLiteral
	 * @model opposite="ownedLiteral" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link uml.simpleClassifiers.EnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' container reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation of Enumeration::/classifier
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='enumeration'"
	 * @generated
	 */
	Enumeration classifier();

} // EnumerationLiteral
