/**
 */
package uml.informationFlows;

import org.eclipse.emf.common.util.EList;

import uml.activities.ActivityEdge;

import uml.classification.Classifier;

import uml.commonStructure.DirectedRelationship;
import uml.commonStructure.NamedElement;
import uml.commonStructure.PackageableElement;
import uml.commonStructure.Relationship;

import uml.interactions.Message;

import uml.structuredClassifiers.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InformationFlows describe circulation of information through a system in a general manner. They do not specify the nature of the information, mechanisms by which it is conveyed, sequences of exchange or any control conditions. During more detailed modeling, representation and realization links may be added to specify which model elements implement an InformationFlow and to show how information is conveyed.  InformationFlows require some kind of “information channel” for unidirectional transmission of information items from sources to targets.  They specify the information channel’s realizations, if any, and identify the information that flows along them.  Information moving along the information channel may be represented by abstract InformationItems and by concrete Classifiers.
 * (self.informationSource->forAll( sis |
 *   oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or 
 *   oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or 
 *   oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or 
 *   (oclIsKindOf(InstanceSpecification) and not sis.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship))))) 
 * 
 * and
 * 
 * (self.informationTarget->forAll( sit | 
 *   oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or 
 *   oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or 
 *   oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or 
 * (oclIsKindOf(InstanceSpecification) and not sit.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship)))))
 * self.conveyed->forAll(oclIsKindOf(Class) or oclIsKindOf(Interface)
 *   or oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.informationFlows.InformationFlow#getConveyed <em>Conveyed</em>}</li>
 *   <li>{@link uml.informationFlows.InformationFlow#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link uml.informationFlows.InformationFlow#getInformationTarget <em>Information Target</em>}</li>
 *   <li>{@link uml.informationFlows.InformationFlow#getRealization <em>Realization</em>}</li>
 *   <li>{@link uml.informationFlows.InformationFlow#getRealizingActivityEdge <em>Realizing Activity Edge</em>}</li>
 *   <li>{@link uml.informationFlows.InformationFlow#getRealizingConnector <em>Realizing Connector</em>}</li>
 *   <li>{@link uml.informationFlows.InformationFlow#getRealizingMessage <em>Realizing Message</em>}</li>
 * </ul>
 *
 * @see uml.informationFlows.InformationFlowsPackage#getInformationFlow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='must_conform sources_and_targets_kind convey_classifiers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL sources_and_targets_kind='(self.informationSource->forAll( sis |\r\n  oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or \r\n  oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or \r\n  oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or \r\n  (oclIsKindOf(InstanceSpecification) and not sis.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship))))) \r\n\r\nand\r\n\r\n(self.informationTarget->forAll( sit | \r\n  oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or \r\n  oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or \r\n  oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or \r\n(oclIsKindOf(InstanceSpecification) and not sit.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship)))))' convey_classifiers='self.conveyed->forAll(oclIsKindOf(Class) or oclIsKindOf(Interface)\r\n  or oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component))'"
 * @generated
 */
public interface InformationFlow extends PackageableElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Conveyed</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the information items that may circulate on this information flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyed</em>' reference list.
	 * @see uml.informationFlows.InformationFlowsPackage#getInformationFlow_Conveyed()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conveyingFlow'"
	 * @generated
	 */
	EList<Classifier> getConveyed();

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines from which source the conveyed InformationItems are initiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Source</em>' reference list.
	 * @see uml.informationFlows.InformationFlowsPackage#getInformationFlow_InformationSource()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='informationFlow'"
	 * @generated
	 */
	EList<NamedElement> getInformationSource();

	/**
	 * Returns the value of the '<em><b>Information Target</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines to which target the conveyed InformationItems are directed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Information Target</em>' reference list.
	 * @see uml.informationFlows.InformationFlowsPackage#getInformationFlow_InformationTarget()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='informationFlow'"
	 * @generated
	 */
	EList<NamedElement> getInformationTarget();

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which Relationship will realize the specified flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realization</em>' reference list.
	 * @see uml.informationFlows.InformationFlowsPackage#getInformationFlow_Realization()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='abstraction'"
	 * @generated
	 */
	EList<Relationship> getRealization();

	/**
	 * Returns the value of the '<em><b>Realizing Activity Edge</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which ActivityEdges will realize the specified flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Activity Edge</em>' reference list.
	 * @see uml.informationFlows.InformationFlowsPackage#getInformationFlow_RealizingActivityEdge()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='informationFlow'"
	 * @generated
	 */
	EList<ActivityEdge> getRealizingActivityEdge();

	/**
	 * Returns the value of the '<em><b>Realizing Connector</b></em>' reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which Connectors will realize the specified flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Connector</em>' reference list.
	 * @see uml.informationFlows.InformationFlowsPackage#getInformationFlow_RealizingConnector()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='informationFlow'"
	 * @generated
	 */
	EList<Connector> getRealizingConnector();

	/**
	 * Returns the value of the '<em><b>Realizing Message</b></em>' reference list.
	 * The list contents are of type {@link uml.interactions.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines which Messages will realize the specified flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Message</em>' reference list.
	 * @see uml.informationFlows.InformationFlowsPackage#getInformationFlow_RealizingMessage()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='informationFlow'"
	 * @generated
	 */
	EList<Message> getRealizingMessage();

} // InformationFlow
