/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.PackageableElement;

import uml.simpleClassifiers.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Component represents a modular part of a system that encapsulates its contents and whose manifestation is replaceable within its environment.  
 * nestedClassifier->isEmpty()
 * nestingClass <> null implies packagedElement->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.Component#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Component#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Component#getProvided <em>Provided</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Component#getRealization <em>Realization</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Component#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_nested_classifiers no_packaged_elements'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL no_nested_classifiers='nestedClassifier->isEmpty()' no_packaged_elements='nestingClass <> null implies packagedElement->isEmpty()'"
 * @generated
 */
public interface Component extends uml.structuredClassifiers.Class {
	/**
	 * Returns the value of the '<em><b>Is Indirectly Instantiated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Component is defined at design-time, but at run-time (or execution-time) an object specified by the Component does not exist, that is, the Component is instantiated indirectly, through the instantiation of its realizing Classifiers or parts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #setIsIndirectlyInstantiated(boolean)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getComponent_IsIndirectlyInstantiated()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsIndirectlyInstantiated();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.Component#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 */
	void setIsIndirectlyInstantiated(boolean value);

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of PackageableElements that a Component owns. In the namespace of a Component, all model elements that are involved in or related to its definition may be owned or imported explicitly. These may include e.g., Classes, Interfaces, Components, Packages, UseCases, Dependencies (e.g., mappings), and Artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getComponent_PackagedElement()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='component'"
	 * @generated
	 */
	EList<PackageableElement> getPackagedElement();

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link uml.simpleClassifiers.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces that the Component exposes to its environment. These Interfaces may be Realized by the Component or any of its realizingClassifiers, or they may be the Interfaces that are provided by its public Ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getComponent_Provided()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='component'"
	 * @generated
	 */
	EList<Interface> getProvided();

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' containment reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.ComponentRealization}.
	 * It is bidirectional and its opposite is '{@link uml.structuredClassifiers.ComponentRealization#getAbstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Realizations owned by the Component. Realizations reference the Classifiers of which the Component is an abstraction; i.e., that realize its behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getComponent_Realization()
	 * @see uml.structuredClassifiers.ComponentRealization#getAbstraction
	 * @model opposite="abstraction" containment="true" ordered="false"
	 * @generated
	 */
	EList<ComponentRealization> getRealization();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link uml.simpleClassifiers.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces that the Component requires from other Components in its environment in order to be able to offer its full set of provided functionality. These Interfaces may be used by the Component or any of its realizingClassifiers, or they may be the Interfaces that are required by its public Ports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getComponent_Required()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='component'"
	 * @generated
	 */
	EList<Interface> getRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Component::/provided
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let \tris : Set(Interface) = allRealizedInterfaces(),\r\n        realizingClassifiers : Set(Classifier) =  self.realization.realizingClassifier->union(self.allParents()->collect(realization.realizingClassifier))->asSet(),\r\n        allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents())->asSet(),\r\n        realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(c.allRealizedInterfaces())),\r\n        ports : Set(Port) = self.ownedPort->union(allParents()->collect(ownedPort))->asSet(),\r\n        providedByPorts : Set(Interface) = ports.provided->asSet()\r\nin     ris->union(realizingClassifierInterfaces) ->union(providedByPorts)->asSet()'"
	 * @generated
	 */
	EList<Interface> provided();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Component::/required
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let \tuis : Set(Interface) = allUsedInterfaces(),\r\n        realizingClassifiers : Set(Classifier) = self.realization.realizingClassifier->union(self.allParents()->collect(realization.realizingClassifier))->asSet(),\r\n        allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents())->asSet(),\r\n        realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(c.allUsedInterfaces())),\r\n        ports : Set(Port) = self.ownedPort->union(allParents()->collect(ownedPort))->asSet(),\r\n        usedByPorts : Set(Interface) = ports.required->asSet()\r\nin\t    uis->union(realizingClassifierInterfaces)->union(usedByPorts)->asSet()'"
	 * @generated
	 */
	EList<Interface> required();

} // Component
