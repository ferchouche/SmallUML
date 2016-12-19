/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Feature;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Connector specifies links that enables communication between two or more instances. In contrast to Associations, which specify links between any instance of the associated Classifiers, Connectors specify links between instances playing the connected parts only.
 * type<>null implies 
 *   let noOfEnds : Integer = end->size() in 
 *   (type.memberEnd->size() = noOfEnds) and Sequence{1..noOfEnds}->forAll(i | end->at(i).role.type.conformsTo(type.memberEnd->at(i).type))
 * structuredClassifier <> null
 * and
 *   end->forAll( e | structuredClassifier.allRoles()->includes(e.role)
 * or
 *   e.role.oclIsKindOf(Port) and structuredClassifier.allRoles()->includes(e.partWithPort))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.Connector#getContract <em>Contract</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Connector#getEnd <em>End</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Connector#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Connector#getRedefinedConnector <em>Redefined Connector</em>}</li>
 *   <li>{@link uml.structuredClassifiers.Connector#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='types roles'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL types='type<>null implies \r\n  let noOfEnds : Integer = end->size() in \r\n  (type.memberEnd->size() = noOfEnds) and Sequence{1..noOfEnds}->forAll(i | end->at(i).role.type.conformsTo(type.memberEnd->at(i).type))' roles='structuredClassifier <> null\r\nand\r\n  end->forAll( e | structuredClassifier.allRoles()->includes(e.role)\r\nor\r\n  e.role.oclIsKindOf(Port) and structuredClassifier.allRoles()->includes(e.partWithPort))'"
 * @generated
 */
public interface Connector extends Feature {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference list.
	 * The list contents are of type {@link uml.commonBehavior.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Behaviors that specify the valid interaction patterns across the Connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnector_Contract()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connector'"
	 * @generated
	 */
	EList<Behavior> getContract();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Connector has at least two ConnectorEnds, each representing the participation of instances of the Classifiers typing the ConnectableElements attached to the end. The set of ConnectorEnds is ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnector_End()
	 * @model containment="true" lower="2"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connector'"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link uml.structuredClassifiers.ConnectorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the kind of Connector. This is derived: a Connector with one or more ends connected to a Port which is not on a Part and which is not a behavior port is a delegation; otherwise it is an assembly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see uml.structuredClassifiers.ConnectorKind
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnector_Kind()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ConnectorKind getKind();

	/**
	 * Returns the value of the '<em><b>Redefined Connector</b></em>' reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Connector may be redefined when its containing Classifier is specialized. The redefining Connector may have a type that specializes the type of the redefined Connector. The types of the ConnectorEnds of the redefining Connector may specialize the types of the ConnectorEnds of the redefined Connector. The properties of the ConnectorEnds of the redefining Connector may be replaced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Connector</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnector_RedefinedConnector()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connector'"
	 * @generated
	 */
	EList<Connector> getRedefinedConnector();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Association that classifies links corresponding to this Connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Association)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnector_Type()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connector'"
	 * @generated
	 */
	Association getType();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.Connector#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Association value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Connector::/kind : ConnectorKind
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if end->exists(\r\n\t\trole.oclIsKindOf(Port) \r\n\t\tand partWithPort->isEmpty()\r\n\t\tand not role.oclAsType(Port).isBehavior)\r\nthen ConnectorKind::delegation \r\nelse ConnectorKind::assembly \r\nendif'"
	 * @generated
	 */
	ConnectorKind kind();

} // Connector
