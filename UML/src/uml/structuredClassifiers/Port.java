/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Property;

import uml.simpleClassifiers.Interface;

import uml.stateMachines.ProtocolStateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Port is a property of an EncapsulatedClassifier that specifies a distinct interaction point between that EncapsulatedClassifier and its environment or between the (behavior of the) EncapsulatedClassifier and its internal parts. Ports are connected to Properties of the EncapsulatedClassifier by Connectors through which requests can be made to invoke BehavioralFeatures. A Port may specify the services an EncapsulatedClassifier provides (offers) to its environment as well as the services that an EncapsulatedClassifier expects (requires) of its environment.  A Port may have an associated ProtocolStateMachine.
 * aggregation = AggregationKind::composite
 * type.oclIsKindOf(Interface) implies defaultValue->isEmpty()
 * owner = encapsulatedClassifier
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.Port#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Port#isIsConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Port#isIsService <em>Is Service</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Port#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Port#getProvided <em>Provided</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Port#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Port#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getPort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='port_aggregation default_value encapsulated_owner'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL port_aggregation='aggregation = AggregationKind::composite' default_value='type.oclIsKindOf(Interface) implies defaultValue->isEmpty()' encapsulated_owner='owner = encapsulatedClassifier'"
 * @generated
 */
public interface Port extends Property {
	/**
	 * Returns the value of the '<em><b>Is Behavior</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether requests arriving at this Port are sent to the classifier behavior of this EncapsulatedClassifier. Such a Port is referred to as a behavior Port. Any invocation of a BehavioralFeature targeted at a behavior Port will be handled by the instance of the owning EncapsulatedClassifier itself, rather than by any instances that it may contain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Behavior</em>' attribute.
	 * @see #setIsBehavior(boolean)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getPort_IsBehavior()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsBehavior();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.Port#isIsBehavior <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Behavior</em>' attribute.
	 * @see #isIsBehavior()
	 * @generated
	 */
	void setIsBehavior(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Conjugated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the way that the provided and required Interfaces are derived from the Port’s Type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Conjugated</em>' attribute.
	 * @see #setIsConjugated(boolean)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getPort_IsConjugated()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsConjugated();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.Port#isIsConjugated <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Conjugated</em>' attribute.
	 * @see #isIsConjugated()
	 * @generated
	 */
	void setIsConjugated(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Service</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, indicates that this Port is used to provide the published functionality of an EncapsulatedClassifier.  If false, this Port is used to implement the EncapsulatedClassifier but is not part of the essential externally-visible functionality of the EncapsulatedClassifier and can, therefore, be altered or deleted along with the internal implementation of the EncapsulatedClassifier and other properties that are considered part of its implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Service</em>' attribute.
	 * @see #setIsService(boolean)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getPort_IsService()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsService();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.Port#isIsService <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Service</em>' attribute.
	 * @see #isIsService()
	 * @generated
	 */
	void setIsService(boolean value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional ProtocolStateMachine which describes valid interactions at this interaction point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(ProtocolStateMachine)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getPort_Protocol()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='port'"
	 * @generated
	 */
	ProtocolStateMachine getProtocol();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.Port#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolStateMachine value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' reference list.
	 * The list contents are of type {@link uml.simpleClassifiers.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces specifying the set of Operations and Receptions that the EncapsulatedCclassifier offers to its environment via this Port, and which it will handle either directly or by forwarding it to a part of its internal structure. This association is derived according to the value of isConjugated. If isConjugated is false, provided is derived as the union of the sets of Interfaces realized by the type of the port and its supertypes, or directly from the type of the Port if the Port is typed by an Interface. If isConjugated is true, it is derived as the union of the sets of Interfaces used by the type of the Port and its supertypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getPort_Provided()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='port'"
	 * @generated
	 */
	EList<Interface> getProvided();

	/**
	 * Returns the value of the '<em><b>Redefined Port</b></em>' reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Port may be redefined when its containing EncapsulatedClassifier is specialized. The redefining Port may have additional Interfaces to those that are associated with the redefined Port or it may replace an Interface by one of its subtypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Port</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getPort_RedefinedPort()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='port'"
	 * @generated
	 */
	EList<Port> getRedefinedPort();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference list.
	 * The list contents are of type {@link uml.simpleClassifiers.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces specifying the set of Operations and Receptions that the EncapsulatedCassifier expects its environment to handle via this port. This association is derived according to the value of isConjugated. If isConjugated is false, required is derived as the union of the sets of Interfaces used by the type of the Port and its supertypes. If isConjugated is true, it is derived as the union of the sets of Interfaces realized by the type of the Port and its supertypes, or directly from the type of the Port if the Port is typed by an Interface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getPort_Required()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='port'"
	 * @generated
	 */
	EList<Interface> getRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Port::/provided
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if isConjugated then basicRequired() else basicProvided() endif'"
	 * @generated
	 */
	EList<Interface> provided();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Port::/required
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if isConjugated then basicProvided() else basicRequired() endif'"
	 * @generated
	 */
	EList<Interface> required();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The union of the sets of Interfaces realized by the type of the Port and its supertypes, or directly the type of the Port if the Port is typed by an Interface.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if type.oclIsKindOf(Interface) \r\nthen type.oclAsType(Interface)->asSet() \r\nelse type.oclAsType(Classifier).allRealizedInterfaces() \r\nendif'"
	 * @generated
	 */
	EList<Interface> basicProvided();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The union of the sets of Interfaces used by the type of the Port and its supertypes.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='type.oclAsType(Classifier).allUsedInterfaces()'"
	 * @generated
	 */
	EList<Interface> basicRequired();

} // Port
