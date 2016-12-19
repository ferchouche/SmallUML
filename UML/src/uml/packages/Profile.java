/**
 */
package uml.packages;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.ElementImport;
import uml.commonStructure.PackageImport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A profile defines limited extensions to a reference metamodel with the purpose of adapting the metamodel to a specific platform or domain.
 * metaclassReference.importedElement->
 * 	select(c | c.oclIsKindOf(Classifier) and
 * 		(c.oclAsType(Classifier).allParents()->collect(namespace)->includes(self)))->isEmpty()
 * and 
 * packagedElement->
 *     select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier).allParents())->
 *        intersection(metaclassReference.importedElement->select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier)))->isEmpty()
 * metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages()->
 *   union(metaclassReference.importedElement.allOwningPackages() )->notEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.Profile#getMetaclassReference <em>Metaclass Reference</em>}</li>
 *   <li>{@link uml.packages.Profile#getMetamodelReference <em>Metamodel Reference</em>}</li>
 * </ul>
 *
 * @see uml.packages.PackagesPackage#getProfile()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='metaclass_reference_not_specialized references_same_metamodel'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL metaclass_reference_not_specialized='metaclassReference.importedElement->\r\n\tselect(c | c.oclIsKindOf(Classifier) and\r\n\t\t(c.oclAsType(Classifier).allParents()->collect(namespace)->includes(self)))->isEmpty()\r\nand \r\npackagedElement->\r\n    select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier).allParents())->\r\n       intersection(metaclassReference.importedElement->select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier)))->isEmpty()' references_same_metamodel='metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages()->\r\n  union(metaclassReference.importedElement.allOwningPackages() )->notEmpty()'"
 * @generated
 */
public interface Profile extends uml.packages.Package {
	/**
	 * Returns the value of the '<em><b>Metaclass Reference</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.ElementImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a metaclass that may be extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metaclass Reference</em>' reference list.
	 * @see uml.packages.PackagesPackage#getProfile_MetaclassReference()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='profile'"
	 * @generated
	 */
	EList<ElementImport> getMetaclassReference();

	/**
	 * Returns the value of the '<em><b>Metamodel Reference</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.PackageImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a package containing (directly or indirectly) metaclasses that may be extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metamodel Reference</em>' reference list.
	 * @see uml.packages.PackagesPackage#getProfile_MetamodelReference()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='profile'"
	 * @generated
	 */
	EList<PackageImport> getMetamodelReference();

} // Profile
