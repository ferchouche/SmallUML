/**
 */
package uml.commonStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PackageImport is a Relationship that imports all the non-private members of a Package into the Namespace owning the PackageImport, so that those Elements may be referred to by their unqualified names in the importingNamespace.
 * visibility = VisibilityKind::public or visibility = VisibilityKind::private
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.PackageImport#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link uml.commonStructure.PackageImport#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml.commonStructure.PackageImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getPackageImport()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='public_or_private'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL public_or_private='visibility = VisibilityKind::public or visibility = VisibilityKind::private'"
 * @generated
 */
public interface PackageImport extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Imported Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Package whose members are imported into a Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Package</em>' reference.
	 * @see #setImportedPackage(uml.packages.Package)
	 * @see uml.commonStructure.CommonStructurePackage#getPackageImport_ImportedPackage()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='packageImport'"
	 * @generated
	 */
	uml.packages.Package getImportedPackage();

	/**
	 * Sets the value of the '{@link uml.commonStructure.PackageImport#getImportedPackage <em>Imported Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Package</em>' reference.
	 * @see #getImportedPackage()
	 * @generated
	 */
	void setImportedPackage(uml.packages.Package value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link uml.commonStructure.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the visibility of the imported PackageableElements within the importingNamespace, i.e., whether imported Elements will in turn be visible to other Namespaces. If the PackageImport is public, the imported Elements will be visible outside the importingNamespace, while, if the PackageImport is private, they will not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see uml.commonStructure.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see uml.commonStructure.CommonStructurePackage#getPackageImport_Visibility()
	 * @model default="public" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link uml.commonStructure.PackageImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see uml.commonStructure.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Importing Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.Namespace#getPackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Namespace that imports the members from a Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' container reference.
	 * @see #setImportingNamespace(Namespace)
	 * @see uml.commonStructure.CommonStructurePackage#getPackageImport_ImportingNamespace()
	 * @see uml.commonStructure.Namespace#getPackageImport
	 * @model opposite="packageImport" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getImportingNamespace();

	/**
	 * Sets the value of the '{@link uml.commonStructure.PackageImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' container reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(Namespace value);

} // PackageImport
