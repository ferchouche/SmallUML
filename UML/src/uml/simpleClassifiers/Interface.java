/**
 */
package uml.simpleClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;
import uml.classification.Operation;
import uml.classification.Property;

import uml.stateMachines.ProtocolStateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Interfaces declare coherent services that are implemented by BehavioredClassifiers that implement the Interfaces via InterfaceRealizations.
 * feature->forAll(visibility = VisibilityKind::public)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.Interface#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.simpleClassifiers.Interface#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.simpleClassifiers.Interface#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link uml.simpleClassifiers.Interface#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link uml.simpleClassifiers.Interface#getRedefinedInterface <em>Redefined Interface</em>}</li>
 *   <li>{@link uml.simpleClassifiers.Interface#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 *
 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getInterface()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='visibility'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL visibility='feature->forAll(visibility = VisibilityKind::public)'"
 * @generated
 */
public interface Interface extends Classifier {
	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References all the Classifiers that are defined (nested) within the Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getInterface_NestedClassifier()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interface'"
	 * @generated
	 */
	EList<Classifier> getNestedClassifier();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Property#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes (i.e., the Properties) owned by the Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getInterface_OwnedAttribute()
	 * @see uml.classification.Property#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Reception</b></em>' containment reference list.
	 * The list contents are of type {@link uml.simpleClassifiers.Reception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Receptions that objects providing this Interface are willing to accept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Reception</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getInterface_OwnedReception()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interface'"
	 * @generated
	 */
	EList<Reception> getOwnedReception();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a ProtocolStateMachine specifying the legal sequences of the invocation of the BehavioralFeatures described in the Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference.
	 * @see #setProtocol(ProtocolStateMachine)
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getInterface_Protocol()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interface'"
	 * @generated
	 */
	ProtocolStateMachine getProtocol();

	/**
	 * Sets the value of the '{@link uml.simpleClassifiers.Interface#getProtocol <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' containment reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolStateMachine value);

	/**
	 * Returns the value of the '<em><b>Redefined Interface</b></em>' reference list.
	 * The list contents are of type {@link uml.simpleClassifiers.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References all the Interfaces redefined by this Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Interface</em>' reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getInterface_RedefinedInterface()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interface'"
	 * @generated
	 */
	EList<Interface> getRedefinedInterface();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Operation}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Operation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations owned by the Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getInterface_OwnedOperation()
	 * @see uml.classification.Operation#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

} // Interface
