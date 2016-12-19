/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;
import uml.classification.Operation;

import uml.packages.Extension;

import uml.simpleClassifiers.BehavioredClassifier;
import uml.simpleClassifiers.Reception;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Class classifies a set of objects and specifies the features that characterize the structure and behavior of those objects.  A Class may have an internal structure and Ports.
 * 
 * not isActive implies (ownedReception->isEmpty() and classifierBehavior = null)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Class#getExtension <em>Extension</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Class#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Class#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Class#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Class#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getClass_()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='passive_class'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL passive_class='not isActive implies (ownedReception->isEmpty() and classifierBehavior = null)'"
 * @generated
 */
public interface Class extends EncapsulatedClassifier, BehavioredClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Operation}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Operation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations owned by the Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getClass_OwnedOperation()
	 * @see uml.classification.Operation#getClass_
	 * @model opposite="class" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' reference list.
	 * The list contents are of type {@link uml.packages.Extension}.
	 * It is bidirectional and its opposite is '{@link uml.packages.Extension#getMetaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used when the Class is acting as a metaclass. It references the Extensions that specify additional properties of the metaclass. The property is derived from the Extensions whose memberEnds are typed by the Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getClass_Extension()
	 * @see uml.packages.Extension#getMetaclass
	 * @model opposite="metaclass" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Extension> getExtension();

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether an object specified by this Class is active or not. If true, then the owning Class is referred to as an active Class. If false, then such a Class is referred to as a passive Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getClass_IsActive()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.Class#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers owned by the Class that are not ownedBehaviors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getClass_NestedClassifier()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='nestingClass'"
	 * @generated
	 */
	EList<Classifier> getNestedClassifier();

	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link uml.simpleClassifiers.Reception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Receptions owned by the Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getClass_OwnedReception()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='class'"
	 * @generated
	 */
	EList<Reception> getOwnedReception();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The superclasses of a Class, derived from its Generalizations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getClass_SuperClass()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='class'"
	 * @generated
	 */
	EList<Class> getSuperClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Class::/extension : Extension
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Extension.allInstances()->select(ext | \r\n  let endTypes : Sequence(Classifier) = ext.memberEnd->collect(type.oclAsType(Classifier)) in\r\n  endTypes->includes(self) or endTypes.allParents()->includes(self) )'"
	 * @generated
	 */
	EList<Extension> extension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Class::/superClass : Class
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.general()->select(oclIsKindOf(Class))->collect(oclAsType(Class))->asSet()'"
	 * @generated
	 */
	EList<Class> superClass();

} // Class
