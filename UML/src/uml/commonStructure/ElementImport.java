/**
 */
package uml.commonStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ElementImport identifies a NamedElement in a Namespace other than the one that owns that NamedElement and allows the NamedElement to be referenced using an unqualified name in the Namespace owning the ElementImport.
 * importedElement.visibility <> null implies importedElement.visibility = VisibilityKind::public
 * visibility = VisibilityKind::public or visibility = VisibilityKind::private
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.ElementImport#getAlias <em>Alias</em>}</li>
 *   <li>{@link uml.commonStructure.ElementImport#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link uml.commonStructure.ElementImport#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml.commonStructure.ElementImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getElementImport()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='imported_element_is_public visibility_public_or_private'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL imported_element_is_public='importedElement.visibility <> null implies importedElement.visibility = VisibilityKind::public' visibility_public_or_private='visibility = VisibilityKind::public or visibility = VisibilityKind::private'"
 * @generated
 */
public interface ElementImport extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the name that should be added to the importing Namespace in lieu of the name of the imported PackagableElement. The alias must not clash with any other member in the importing Namespace. By default, no alias is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see uml.commonStructure.CommonStructurePackage#getElementImport_Alias()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link uml.commonStructure.ElementImport#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the PackageableElement whose name is to be added to a Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference.
	 * @see #setImportedElement(PackageableElement)
	 * @see uml.commonStructure.CommonStructurePackage#getElementImport_ImportedElement()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='import'"
	 * @generated
	 */
	PackageableElement getImportedElement();

	/**
	 * Sets the value of the '{@link uml.commonStructure.ElementImport#getImportedElement <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element</em>' reference.
	 * @see #getImportedElement()
	 * @generated
	 */
	void setImportedElement(PackageableElement value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link uml.commonStructure.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the visibility of the imported PackageableElement within the importingNamespace, i.e., whether the  importedElement will in turn be visible to other Namespaces. If the ElementImport is public, the importedElement will be visible outside the importingNamespace while, if the ElementImport is private, it will not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see uml.commonStructure.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see uml.commonStructure.CommonStructurePackage#getElementImport_Visibility()
	 * @model default="public" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link uml.commonStructure.ElementImport#getVisibility <em>Visibility</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.Namespace#getElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Namespace that imports a PackageableElement from another Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' container reference.
	 * @see #setImportingNamespace(Namespace)
	 * @see uml.commonStructure.CommonStructurePackage#getElementImport_ImportingNamespace()
	 * @see uml.commonStructure.Namespace#getElementImport
	 * @model opposite="elementImport" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getImportingNamespace();

	/**
	 * Sets the value of the '{@link uml.commonStructure.ElementImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' container reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(Namespace value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query getName() returns the name under which the imported PackageableElement will be known in the importing namespace.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if alias->notEmpty() then\n  alias\nelse\n  importedElement.name\nendif'"
	 * @generated
	 */
	String getName();

} // ElementImport
