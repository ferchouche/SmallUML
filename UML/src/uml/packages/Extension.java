/**
 */
package uml.packages;

import uml.classification.Property;

import uml.structuredClassifiers.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An extension is used to indicate that the properties of a metaclass are extended through a stereotype, and gives the ability to flexibly add (and later remove) stereotypes to classes.
 * metaclassEnd()->notEmpty() and metaclassEnd().type.oclIsKindOf(Class)
 * memberEnd->size() = 2
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.Extension#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link uml.packages.Extension#isIsRequired <em>Is Required</em>}</li>
 * </ul>
 *
 * @see uml.packages.PackagesPackage#getExtension()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='non_owned_end is_binary'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL non_owned_end='metaclassEnd()->notEmpty() and metaclassEnd().type.oclIsKindOf(Class)' is_binary='memberEnd->size() = 2'"
 * @generated
 */
public interface Extension extends Association {
	/**
	 * Returns the value of the '<em><b>Metaclass</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.structuredClassifiers.Class#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Class that is extended through an Extension. The property is derived from the type of the memberEnd that is not the ownedEnd.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metaclass</em>' reference.
	 * @see uml.packages.PackagesPackage#getExtension_Metaclass()
	 * @see uml.structuredClassifiers.Class#getExtension
	 * @model opposite="extension" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	uml.structuredClassifiers.Class getMetaclass();

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether an instance of the extending stereotype must be created when an instance of the extended class is created. The attribute value is derived from the value of the lower property of the ExtensionEnd referenced by Extension::ownedEnd; a lower value of 1 means that isRequired is true, but otherwise it is false. Since the default value of ExtensionEnd::lower is 0, the default value of isRequired is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see uml.packages.PackagesPackage#getExtension_IsRequired()
	 * @model dataType="types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRequired() is true if the owned end has a multiplicity with the lower bound of 1.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedEnd.lowerBound() = 1'"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query metaclass() returns the metaclass that is being extended (as opposed to the extending stereotype).
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='metaclassEnd().type.oclAsType(Class)'"
	 * @generated
	 */
	uml.structuredClassifiers.Class metaclass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query metaclassEnd() returns the Property that is typed by a metaclass (as opposed to a stereotype).
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='memberEnd->reject(p | ownedEnd->includes(p.oclAsType(ExtensionEnd)))->any(true)'"
	 * @generated
	 */
	Property metaclassEnd();

} // Extension
