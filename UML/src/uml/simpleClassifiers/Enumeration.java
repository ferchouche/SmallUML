/**
 */
package uml.simpleClassifiers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Enumeration is a DataType whose values are enumerated in the model as EnumerationLiterals.
 * ownedAttribute->forAll(isReadOnly)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.Enumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 *
 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getEnumeration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='immutable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL immutable='ownedAttribute->forAll(isReadOnly)'"
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link uml.simpleClassifiers.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link uml.simpleClassifiers.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of literals owned by this Enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getEnumeration_OwnedLiteral()
	 * @see uml.simpleClassifiers.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getOwnedLiteral();

} // Enumeration
