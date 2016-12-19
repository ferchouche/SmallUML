/**
 */
package uml.structuredClassifiers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uml.classification.Classifier;
import uml.classification.Feature;
import uml.classification.Property;
import uml.classification.RedefinableElement;
import uml.classification.StructuralFeature;

import uml.commonStructure.Abstraction;
import uml.commonStructure.Dependency;
import uml.commonStructure.DirectedRelationship;
import uml.commonStructure.Element;
import uml.commonStructure.MultiplicityElement;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.PackageableElement;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.Realization;
import uml.commonStructure.Relationship;
import uml.commonStructure.TemplateParameter;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.Type;
import uml.commonStructure.TypedElement;

import uml.deployments.DeploymentTarget;

import uml.simpleClassifiers.BehavioredClassifier;

import uml.structuredClassifiers.Association;
import uml.structuredClassifiers.AssociationClass;
import uml.structuredClassifiers.Collaboration;
import uml.structuredClassifiers.CollaborationUse;
import uml.structuredClassifiers.Component;
import uml.structuredClassifiers.ComponentRealization;
import uml.structuredClassifiers.ConnectableElement;
import uml.structuredClassifiers.ConnectableElementTemplateParameter;
import uml.structuredClassifiers.Connector;
import uml.structuredClassifiers.ConnectorEnd;
import uml.structuredClassifiers.EncapsulatedClassifier;
import uml.structuredClassifiers.Port;
import uml.structuredClassifiers.StructuredClassifier;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uml.structuredClassifiers.StructuredClassifiersPackage
 * @generated
 */
public class StructuredClassifiersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructuredClassifiersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClassifiersSwitch() {
		if (modelPackage == null) {
			modelPackage = StructuredClassifiersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StructuredClassifiersPackage.ASSOCIATION_CLASS: {
				AssociationClass associationClass = (AssociationClass)theEObject;
				T result = caseAssociationClass(associationClass);
				if (result == null) result = caseClass(associationClass);
				if (result == null) result = caseAssociation(associationClass);
				if (result == null) result = caseEncapsulatedClassifier(associationClass);
				if (result == null) result = caseBehavioredClassifier(associationClass);
				if (result == null) result = caseRelationship(associationClass);
				if (result == null) result = caseStructuredClassifier(associationClass);
				if (result == null) result = caseClassifier(associationClass);
				if (result == null) result = caseNamespace(associationClass);
				if (result == null) result = caseRedefinableElement(associationClass);
				if (result == null) result = caseType(associationClass);
				if (result == null) result = caseTemplateableElement(associationClass);
				if (result == null) result = casePackageableElement(associationClass);
				if (result == null) result = caseNamedElement(associationClass);
				if (result == null) result = caseParameterableElement(associationClass);
				if (result == null) result = caseElement(associationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.CLASS: {
				uml.structuredClassifiers.Class class_ = (uml.structuredClassifiers.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseEncapsulatedClassifier(class_);
				if (result == null) result = caseBehavioredClassifier(class_);
				if (result == null) result = caseStructuredClassifier(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseNamespace(class_);
				if (result == null) result = caseRedefinableElement(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseTemplateableElement(class_);
				if (result == null) result = casePackageableElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseParameterableElement(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.CONNECTABLE_ELEMENT: {
				ConnectableElement connectableElement = (ConnectableElement)theEObject;
				T result = caseConnectableElement(connectableElement);
				if (result == null) result = caseTypedElement(connectableElement);
				if (result == null) result = caseParameterableElement(connectableElement);
				if (result == null) result = caseNamedElement(connectableElement);
				if (result == null) result = caseElement(connectableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.CONNECTOR_END: {
				ConnectorEnd connectorEnd = (ConnectorEnd)theEObject;
				T result = caseConnectorEnd(connectorEnd);
				if (result == null) result = caseMultiplicityElement(connectorEnd);
				if (result == null) result = caseElement(connectorEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseProperty(port);
				if (result == null) result = caseStructuralFeature(port);
				if (result == null) result = caseConnectableElement(port);
				if (result == null) result = caseDeploymentTarget(port);
				if (result == null) result = caseFeature(port);
				if (result == null) result = caseTypedElement(port);
				if (result == null) result = caseMultiplicityElement(port);
				if (result == null) result = caseParameterableElement(port);
				if (result == null) result = caseRedefinableElement(port);
				if (result == null) result = caseNamedElement(port);
				if (result == null) result = caseElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER: {
				ConnectableElementTemplateParameter connectableElementTemplateParameter = (ConnectableElementTemplateParameter)theEObject;
				T result = caseConnectableElementTemplateParameter(connectableElementTemplateParameter);
				if (result == null) result = caseTemplateParameter(connectableElementTemplateParameter);
				if (result == null) result = caseElement(connectableElementTemplateParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.COLLABORATION_USE: {
				CollaborationUse collaborationUse = (CollaborationUse)theEObject;
				T result = caseCollaborationUse(collaborationUse);
				if (result == null) result = caseNamedElement(collaborationUse);
				if (result == null) result = caseElement(collaborationUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.COLLABORATION: {
				Collaboration collaboration = (Collaboration)theEObject;
				T result = caseCollaboration(collaboration);
				if (result == null) result = caseStructuredClassifier(collaboration);
				if (result == null) result = caseBehavioredClassifier(collaboration);
				if (result == null) result = caseClassifier(collaboration);
				if (result == null) result = caseNamespace(collaboration);
				if (result == null) result = caseRedefinableElement(collaboration);
				if (result == null) result = caseType(collaboration);
				if (result == null) result = caseTemplateableElement(collaboration);
				if (result == null) result = casePackageableElement(collaboration);
				if (result == null) result = caseNamedElement(collaboration);
				if (result == null) result = caseParameterableElement(collaboration);
				if (result == null) result = caseElement(collaboration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER: {
				StructuredClassifier structuredClassifier = (StructuredClassifier)theEObject;
				T result = caseStructuredClassifier(structuredClassifier);
				if (result == null) result = caseClassifier(structuredClassifier);
				if (result == null) result = caseNamespace(structuredClassifier);
				if (result == null) result = caseRedefinableElement(structuredClassifier);
				if (result == null) result = caseType(structuredClassifier);
				if (result == null) result = caseTemplateableElement(structuredClassifier);
				if (result == null) result = casePackageableElement(structuredClassifier);
				if (result == null) result = caseNamedElement(structuredClassifier);
				if (result == null) result = caseParameterableElement(structuredClassifier);
				if (result == null) result = caseElement(structuredClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseFeature(connector);
				if (result == null) result = caseRedefinableElement(connector);
				if (result == null) result = caseNamedElement(connector);
				if (result == null) result = caseElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.ENCAPSULATED_CLASSIFIER: {
				EncapsulatedClassifier encapsulatedClassifier = (EncapsulatedClassifier)theEObject;
				T result = caseEncapsulatedClassifier(encapsulatedClassifier);
				if (result == null) result = caseStructuredClassifier(encapsulatedClassifier);
				if (result == null) result = caseClassifier(encapsulatedClassifier);
				if (result == null) result = caseNamespace(encapsulatedClassifier);
				if (result == null) result = caseRedefinableElement(encapsulatedClassifier);
				if (result == null) result = caseType(encapsulatedClassifier);
				if (result == null) result = caseTemplateableElement(encapsulatedClassifier);
				if (result == null) result = casePackageableElement(encapsulatedClassifier);
				if (result == null) result = caseNamedElement(encapsulatedClassifier);
				if (result == null) result = caseParameterableElement(encapsulatedClassifier);
				if (result == null) result = caseElement(encapsulatedClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseClass(component);
				if (result == null) result = caseEncapsulatedClassifier(component);
				if (result == null) result = caseBehavioredClassifier(component);
				if (result == null) result = caseStructuredClassifier(component);
				if (result == null) result = caseClassifier(component);
				if (result == null) result = caseNamespace(component);
				if (result == null) result = caseRedefinableElement(component);
				if (result == null) result = caseType(component);
				if (result == null) result = caseTemplateableElement(component);
				if (result == null) result = casePackageableElement(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = caseParameterableElement(component);
				if (result == null) result = caseElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.COMPONENT_REALIZATION: {
				ComponentRealization componentRealization = (ComponentRealization)theEObject;
				T result = caseComponentRealization(componentRealization);
				if (result == null) result = caseRealization(componentRealization);
				if (result == null) result = caseAbstraction(componentRealization);
				if (result == null) result = caseDependency(componentRealization);
				if (result == null) result = casePackageableElement(componentRealization);
				if (result == null) result = caseDirectedRelationship(componentRealization);
				if (result == null) result = caseNamedElement(componentRealization);
				if (result == null) result = caseParameterableElement(componentRealization);
				if (result == null) result = caseRelationship(componentRealization);
				if (result == null) result = caseElement(componentRealization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructuredClassifiersPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseClassifier(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseNamespace(association);
				if (result == null) result = caseRedefinableElement(association);
				if (result == null) result = caseType(association);
				if (result == null) result = caseTemplateableElement(association);
				if (result == null) result = casePackageableElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = caseParameterableElement(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationClass(AssociationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(uml.structuredClassifiers.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElement(ConnectableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorEnd(ConnectorEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElementTemplateParameter(ConnectableElementTemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborationUse(CollaborationUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaboration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaboration(Collaboration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClassifier(StructuredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedClassifier(EncapsulatedClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRealization(ComponentRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableElement(ParameterableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElement(TemplateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentTarget(DeploymentTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateParameter(TemplateParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstraction(Abstraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StructuredClassifiersSwitch
