/**
 */
package uml.commonStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PackageableElement is a NamedElement that may be owned directly by a Package. A PackageableElement is also able to serve as the parameteredElement of a TemplateParameter.
 * visibility = null implies namespace = null
 * <!-- end-model-doc -->
 *
 *
 * @see uml.commonStructure.CommonStructurePackage#getPackageableElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='namespace_needs_visibility'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL namespace_needs_visibility='visibility = null implies namespace = null'"
 * @generated
 */
public interface PackageableElement extends NamedElement, ParameterableElement {
} // PackageableElement
