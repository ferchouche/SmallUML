/**
 */
package uml.packages;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A stereotype defines how an existing metaclass may be extended, and enables the use of platform or domain specific terminology or notation in place of, or in addition to, the ones used for the extended metaclass.
 * ownedAttribute.association->forAll(memberEnd->size()=2)
 * allParents()->forAll(oclIsKindOf(Stereotype)) 
 * and Classifier.allInstances()->forAll(c | c.allParents()->exists(oclIsKindOf(Stereotype)) implies c.oclIsKindOf(Stereotype))
 * 
 * ownedAttribute
 * ->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))
 * ->forAll(opposite.owner = association)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.Stereotype#getIcon <em>Icon</em>}</li>
 *   <li>{@link uml.packages.Stereotype#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see uml.packages.PackagesPackage#getStereotype()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='binaryAssociationsOnly generalize name_not_clash associationEndOwnership base_property_upper_bound base_property_multiplicity_single_extension base_property_multiplicity_multiple_extension'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL binaryAssociationsOnly='ownedAttribute.association->forAll(memberEnd->size()=2)' generalize='allParents()->forAll(oclIsKindOf(Stereotype)) \r\nand Classifier.allInstances()->forAll(c | c.allParents()->exists(oclIsKindOf(Stereotype)) implies c.oclIsKindOf(Stereotype))\r\n' associationEndOwnership='ownedAttribute\r\n->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))\r\n->forAll(opposite.owner = association)'"
 * @generated
 */
public interface Stereotype extends uml.structuredClassifiers.Class {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link uml.packages.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype can change the graphical appearance of the extended model element by using attached icons. When this association is not null, it references the location of the icon content to be displayed within diagrams presenting the extended model elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see uml.packages.PackagesPackage#getStereotype_Icon()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stereotype'"
	 * @generated
	 */
	EList<Image> getIcon();

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The profile that directly or indirectly contains this stereotype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see uml.packages.PackagesPackage#getStereotype_Profile()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stereotype'"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile returns the closest profile directly or indirectly containing this stereotype.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.namespace.oclAsType(Package).containingProfile()'"
	 * @generated
	 */
	Profile containingProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stereotype must be contained, directly or indirectly, in a profile.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.containingProfile()'"
	 * @generated
	 */
	Profile profile();

} // Stereotype
