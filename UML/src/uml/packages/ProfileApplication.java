/**
 */
package uml.packages;

import uml.commonStructure.DirectedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A profile application is used to show which profiles have been applied to a package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.ProfileApplication#getAppliedProfile <em>Applied Profile</em>}</li>
 *   <li>{@link uml.packages.ProfileApplication#getApplyingPackage <em>Applying Package</em>}</li>
 *   <li>{@link uml.packages.ProfileApplication#isIsStrict <em>Is Strict</em>}</li>
 * </ul>
 *
 * @see uml.packages.PackagesPackage#getProfileApplication()
 * @model
 * @generated
 */
public interface ProfileApplication extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Applied Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Profiles that are applied to a Package through this ProfileApplication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applied Profile</em>' reference.
	 * @see #setAppliedProfile(Profile)
	 * @see uml.packages.PackagesPackage#getProfileApplication_AppliedProfile()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='profileApplication'"
	 * @generated
	 */
	Profile getAppliedProfile();

	/**
	 * Sets the value of the '{@link uml.packages.ProfileApplication#getAppliedProfile <em>Applied Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Profile</em>' reference.
	 * @see #getAppliedProfile()
	 * @generated
	 */
	void setAppliedProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>Applying Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.packages.Package#getProfileApplication <em>Profile Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The package that owns the profile application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applying Package</em>' container reference.
	 * @see #setApplyingPackage(uml.packages.Package)
	 * @see uml.packages.PackagesPackage#getProfileApplication_ApplyingPackage()
	 * @see uml.packages.Package#getProfileApplication
	 * @model opposite="profileApplication" required="true" transient="false" ordered="false"
	 * @generated
	 */
	uml.packages.Package getApplyingPackage();

	/**
	 * Sets the value of the '{@link uml.packages.ProfileApplication#getApplyingPackage <em>Applying Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applying Package</em>' container reference.
	 * @see #getApplyingPackage()
	 * @generated
	 */
	void setApplyingPackage(uml.packages.Package value);

	/**
	 * Returns the value of the '<em><b>Is Strict</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies that the Profile filtering rules for the metaclasses of the referenced metamodel shall be strictly applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Strict</em>' attribute.
	 * @see #setIsStrict(boolean)
	 * @see uml.packages.PackagesPackage#getProfileApplication_IsStrict()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsStrict();

	/**
	 * Sets the value of the '{@link uml.packages.ProfileApplication#isIsStrict <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict</em>' attribute.
	 * @see #isIsStrict()
	 * @generated
	 */
	void setIsStrict(boolean value);

} // ProfileApplication
