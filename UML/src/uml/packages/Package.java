/**
 */
package uml.packages;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.PackageableElement;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A package can have one or more profile applications to indicate which profiles have been applied. Because a profile is a package, it is possible to apply a profile not only to packages, but also to profiles.
 * Package specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.
 * A package is used to group elements, and provides a namespace for the grouped elements.
 * packagedElement->forAll(e | e.visibility<> null implies e.visibility = VisibilityKind::public or e.visibility = VisibilityKind::private)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.Package#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link uml.packages.Package#getProfileApplication <em>Profile Application</em>}</li>
 *   <li>{@link uml.packages.Package#getUri <em>Uri</em>}</li>
 *   <li>{@link uml.packages.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link uml.packages.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link uml.packages.Package#getOwnedStereotype <em>Owned Stereotype</em>}</li>
 *   <li>{@link uml.packages.Package#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.packages.Package#getOwnedType <em>Owned Type</em>}</li>
 * </ul>
 *
 * @see uml.packages.PackagesPackage#getPackage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='elements_public_or_private'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL elements_public_or_private='packagedElement->forAll(e | e.visibility<> null implies e.visibility = VisibilityKind::public or e.visibility = VisibilityKind::private)'"
 * @generated
 */
public interface Package extends Namespace, PackageableElement, TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Package Merge</b></em>' containment reference list.
	 * The list contents are of type {@link uml.packages.PackageMerge}.
	 * It is bidirectional and its opposite is '{@link uml.packages.PackageMerge#getReceivingPackage <em>Receiving Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageMerges that are owned by this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Merge</em>' containment reference list.
	 * @see uml.packages.PackagesPackage#getPackage_PackageMerge()
	 * @see uml.packages.PackageMerge#getReceivingPackage
	 * @model opposite="receivingPackage" containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageMerge> getPackageMerge();

	/**
	 * Returns the value of the '<em><b>Profile Application</b></em>' containment reference list.
	 * The list contents are of type {@link uml.packages.ProfileApplication}.
	 * It is bidirectional and its opposite is '{@link uml.packages.ProfileApplication#getApplyingPackage <em>Applying Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ProfileApplications that indicate which profiles have been applied to the Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile Application</em>' containment reference list.
	 * @see uml.packages.PackagesPackage#getPackage_ProfileApplication()
	 * @see uml.packages.ProfileApplication#getApplyingPackage
	 * @model opposite="applyingPackage" containment="true" ordered="false"
	 * @generated
	 */
	EList<ProfileApplication> getProfileApplication();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides an identifier for the package that can be used for many purposes. A URI is the universally unique identification of the package following the IETF URI specification, RFC 2396 http://www.ietf.org/rfc/rfc2396.txt and it must comply with those syntax rules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see uml.packages.PackagesPackage#getPackage_Uri()
	 * @model dataType="types.String" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='URI'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link uml.packages.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' reference list.
	 * The list contents are of type {@link uml.packages.Package}.
	 * It is bidirectional and its opposite is '{@link uml.packages.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the packaged elements that are Packages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Package</em>' reference list.
	 * @see uml.packages.PackagesPackage#getPackage_NestedPackage()
	 * @see uml.packages.Package#getNestingPackage
	 * @model opposite="nestingPackage" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Package> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.packages.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Package that owns this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nesting Package</em>' reference.
	 * @see #setNestingPackage(Package)
	 * @see uml.packages.PackagesPackage#getPackage_NestingPackage()
	 * @see uml.packages.Package#getNestedPackage
	 * @model opposite="nestedPackage" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link uml.packages.Package#getNestingPackage <em>Nesting Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Owned Stereotype</b></em>' reference list.
	 * The list contents are of type {@link uml.packages.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Stereotypes that are owned by the Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Stereotype</em>' reference list.
	 * @see uml.packages.PackagesPackage#getPackage_OwnedStereotype()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningPackage'"
	 * @generated
	 */
	EList<Stereotype> getOwnedStereotype();

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the packageable elements that are owned by this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see uml.packages.PackagesPackage#getPackage_PackagedElement()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningPackage'"
	 * @generated
	 */
	EList<PackageableElement> getPackagedElement();

	/**
	 * Returns the value of the '<em><b>Owned Type</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Type}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the packaged elements that are Types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Type</em>' reference list.
	 * @see uml.packages.PackagesPackage#getPackage_OwnedType()
	 * @see uml.commonStructure.Type#getPackage
	 * @model opposite="package" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Type> getOwnedType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allApplicableStereotypes() returns all the directly or indirectly owned stereotypes, including stereotypes contained in sub-profiles.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let ownedPackages : Bag(Package) = ownedMember->select(oclIsKindOf(Package))->collect(oclAsType(Package)) in\r\n ownedStereotype->union(ownedPackages.allApplicableStereotypes())->flatten()->asSet()'"
	 * @generated
	 */
	EList<Stereotype> allApplicableStereotypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile() returns the closest profile directly or indirectly containing this package (or this package itself, if it is a profile).
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if self.oclIsKindOf(Profile) then \r\n\tself.oclAsType(Profile)\r\nelse\r\n\tself.namespace.oclAsType(Package).containingProfile()\r\nendif'"
	 * @generated
	 */
	Profile containingProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query makesVisible() defines whether a Package makes an element visible outside itself. Elements with no visibility and elements with public visibility are made visible.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" elRequired="true" elOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedMember->includes(el) or\n(elementImport->select(ei|ei.importedElement = VisibilityKind::public)->collect(importedElement.oclAsType(NamedElement))->includes(el)) or\n(packageImport->select(visibility = VisibilityKind::public)->collect(importedPackage.member->includes(el))->notEmpty())'"
	 * @generated
	 */
	boolean makesVisible(NamedElement el);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Package::/nestedPackage 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='packagedElement->select(oclIsKindOf(Package))->collect(oclAsType(Package))->asSet()'"
	 * @generated
	 */
	EList<Package> nestedPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Package::/ownedStereotype 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='packagedElement->select(oclIsKindOf(Stereotype))->collect(oclAsType(Stereotype))->asSet()'"
	 * @generated
	 */
	EList<Stereotype> ownedStereotype();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Package::/ownedType
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='packagedElement->select(oclIsKindOf(Type))->collect(oclAsType(Type))->asSet()'"
	 * @generated
	 */
	EList<Type> ownedType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query visibleMembers() defines which members of a Package can be accessed outside it.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='member->select( m | m.oclIsKindOf(PackageableElement) and self.makesVisible(m))->collect(oclAsType(PackageableElement))->asSet()'"
	 * @generated
	 */
	EList<PackageableElement> visibleMembers();

} // Package
