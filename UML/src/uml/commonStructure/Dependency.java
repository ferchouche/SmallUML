/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Dependency is a Relationship that signifies that a single model Element or a set of model Elements requires other model Elements for their specification or implementation. This means that the complete semantics of the client Element(s) are either semantically or structurally dependent on the definition of the supplier Element(s).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.Dependency#getClient <em>Client</em>}</li>
 *   <li>{@link uml.commonStructure.Dependency#getSupplier <em>Supplier</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends PackageableElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.NamedElement}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.NamedElement#getClientDependency <em>Client Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Element(s) dependent on the supplier Element(s). In some cases (such as a trace Abstraction) the assignment of direction (that is, the designation of the client Element) is at the discretion of the modeler and is a stipulation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getDependency_Client()
	 * @see uml.commonStructure.NamedElement#getClientDependency
	 * @model opposite="clientDependency" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getClient();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Element(s) on which the client Element(s) depend in some respect. The modeler may stipulate a sense of Dependency direction suitable for their domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getDependency_Supplier()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='supplierDependency'"
	 * @generated
	 */
	EList<NamedElement> getSupplier();

} // Dependency
