/**
 */
package uml.actions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uml.actions.*;

import uml.activities.ActivityGroup;
import uml.activities.ActivityNode;
import uml.activities.ExecutableNode;
import uml.activities.ObjectNode;

import uml.classification.RedefinableElement;

import uml.commonStructure.Element;
import uml.commonStructure.MultiplicityElement;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.TypedElement;

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
 * @see uml.actions.ActionsPackage
 * @generated
 */
public class ActionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ActionsPackage.eINSTANCE;
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
			case ActionsPackage.VALUE_SPECIFICATION_ACTION: {
				ValueSpecificationAction valueSpecificationAction = (ValueSpecificationAction)theEObject;
				T result = caseValueSpecificationAction(valueSpecificationAction);
				if (result == null) result = caseAction(valueSpecificationAction);
				if (result == null) result = caseExecutableNode(valueSpecificationAction);
				if (result == null) result = caseActivityNode(valueSpecificationAction);
				if (result == null) result = caseRedefinableElement(valueSpecificationAction);
				if (result == null) result = caseNamedElement(valueSpecificationAction);
				if (result == null) result = caseElement(valueSpecificationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseExecutableNode(action);
				if (result == null) result = caseActivityNode(action);
				if (result == null) result = caseRedefinableElement(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.INPUT_PIN: {
				InputPin inputPin = (InputPin)theEObject;
				T result = caseInputPin(inputPin);
				if (result == null) result = casePin(inputPin);
				if (result == null) result = caseObjectNode(inputPin);
				if (result == null) result = caseMultiplicityElement(inputPin);
				if (result == null) result = caseActivityNode(inputPin);
				if (result == null) result = caseTypedElement(inputPin);
				if (result == null) result = caseRedefinableElement(inputPin);
				if (result == null) result = caseNamedElement(inputPin);
				if (result == null) result = caseElement(inputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.PIN: {
				Pin pin = (Pin)theEObject;
				T result = casePin(pin);
				if (result == null) result = caseObjectNode(pin);
				if (result == null) result = caseMultiplicityElement(pin);
				if (result == null) result = caseActivityNode(pin);
				if (result == null) result = caseTypedElement(pin);
				if (result == null) result = caseRedefinableElement(pin);
				if (result == null) result = caseNamedElement(pin);
				if (result == null) result = caseElement(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.OUTPUT_PIN: {
				OutputPin outputPin = (OutputPin)theEObject;
				T result = caseOutputPin(outputPin);
				if (result == null) result = casePin(outputPin);
				if (result == null) result = caseObjectNode(outputPin);
				if (result == null) result = caseMultiplicityElement(outputPin);
				if (result == null) result = caseActivityNode(outputPin);
				if (result == null) result = caseTypedElement(outputPin);
				if (result == null) result = caseRedefinableElement(outputPin);
				if (result == null) result = caseNamedElement(outputPin);
				if (result == null) result = caseElement(outputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.VARIABLE_ACTION: {
				VariableAction variableAction = (VariableAction)theEObject;
				T result = caseVariableAction(variableAction);
				if (result == null) result = caseAction(variableAction);
				if (result == null) result = caseExecutableNode(variableAction);
				if (result == null) result = caseActivityNode(variableAction);
				if (result == null) result = caseRedefinableElement(variableAction);
				if (result == null) result = caseNamedElement(variableAction);
				if (result == null) result = caseElement(variableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.WRITE_LINK_ACTION: {
				WriteLinkAction writeLinkAction = (WriteLinkAction)theEObject;
				T result = caseWriteLinkAction(writeLinkAction);
				if (result == null) result = caseLinkAction(writeLinkAction);
				if (result == null) result = caseAction(writeLinkAction);
				if (result == null) result = caseExecutableNode(writeLinkAction);
				if (result == null) result = caseActivityNode(writeLinkAction);
				if (result == null) result = caseRedefinableElement(writeLinkAction);
				if (result == null) result = caseNamedElement(writeLinkAction);
				if (result == null) result = caseElement(writeLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.LINK_ACTION: {
				LinkAction linkAction = (LinkAction)theEObject;
				T result = caseLinkAction(linkAction);
				if (result == null) result = caseAction(linkAction);
				if (result == null) result = caseExecutableNode(linkAction);
				if (result == null) result = caseActivityNode(linkAction);
				if (result == null) result = caseRedefinableElement(linkAction);
				if (result == null) result = caseNamedElement(linkAction);
				if (result == null) result = caseElement(linkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.LINK_END_DATA: {
				LinkEndData linkEndData = (LinkEndData)theEObject;
				T result = caseLinkEndData(linkEndData);
				if (result == null) result = caseElement(linkEndData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.QUALIFIER_VALUE: {
				QualifierValue qualifierValue = (QualifierValue)theEObject;
				T result = caseQualifierValue(qualifierValue);
				if (result == null) result = caseElement(qualifierValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.WRITE_STRUCTURAL_FEATURE_ACTION: {
				WriteStructuralFeatureAction writeStructuralFeatureAction = (WriteStructuralFeatureAction)theEObject;
				T result = caseWriteStructuralFeatureAction(writeStructuralFeatureAction);
				if (result == null) result = caseStructuralFeatureAction(writeStructuralFeatureAction);
				if (result == null) result = caseAction(writeStructuralFeatureAction);
				if (result == null) result = caseExecutableNode(writeStructuralFeatureAction);
				if (result == null) result = caseActivityNode(writeStructuralFeatureAction);
				if (result == null) result = caseRedefinableElement(writeStructuralFeatureAction);
				if (result == null) result = caseNamedElement(writeStructuralFeatureAction);
				if (result == null) result = caseElement(writeStructuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.STRUCTURAL_FEATURE_ACTION: {
				StructuralFeatureAction structuralFeatureAction = (StructuralFeatureAction)theEObject;
				T result = caseStructuralFeatureAction(structuralFeatureAction);
				if (result == null) result = caseAction(structuralFeatureAction);
				if (result == null) result = caseExecutableNode(structuralFeatureAction);
				if (result == null) result = caseActivityNode(structuralFeatureAction);
				if (result == null) result = caseRedefinableElement(structuralFeatureAction);
				if (result == null) result = caseNamedElement(structuralFeatureAction);
				if (result == null) result = caseElement(structuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.WRITE_VARIABLE_ACTION: {
				WriteVariableAction writeVariableAction = (WriteVariableAction)theEObject;
				T result = caseWriteVariableAction(writeVariableAction);
				if (result == null) result = caseVariableAction(writeVariableAction);
				if (result == null) result = caseAction(writeVariableAction);
				if (result == null) result = caseExecutableNode(writeVariableAction);
				if (result == null) result = caseActivityNode(writeVariableAction);
				if (result == null) result = caseRedefinableElement(writeVariableAction);
				if (result == null) result = caseNamedElement(writeVariableAction);
				if (result == null) result = caseElement(writeVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ACCEPT_CALL_ACTION: {
				AcceptCallAction acceptCallAction = (AcceptCallAction)theEObject;
				T result = caseAcceptCallAction(acceptCallAction);
				if (result == null) result = caseAcceptEventAction(acceptCallAction);
				if (result == null) result = caseAction(acceptCallAction);
				if (result == null) result = caseExecutableNode(acceptCallAction);
				if (result == null) result = caseActivityNode(acceptCallAction);
				if (result == null) result = caseRedefinableElement(acceptCallAction);
				if (result == null) result = caseNamedElement(acceptCallAction);
				if (result == null) result = caseElement(acceptCallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ACCEPT_EVENT_ACTION: {
				AcceptEventAction acceptEventAction = (AcceptEventAction)theEObject;
				T result = caseAcceptEventAction(acceptEventAction);
				if (result == null) result = caseAction(acceptEventAction);
				if (result == null) result = caseExecutableNode(acceptEventAction);
				if (result == null) result = caseActivityNode(acceptEventAction);
				if (result == null) result = caseRedefinableElement(acceptEventAction);
				if (result == null) result = caseNamedElement(acceptEventAction);
				if (result == null) result = caseElement(acceptEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ACTION_INPUT_PIN: {
				ActionInputPin actionInputPin = (ActionInputPin)theEObject;
				T result = caseActionInputPin(actionInputPin);
				if (result == null) result = caseInputPin(actionInputPin);
				if (result == null) result = casePin(actionInputPin);
				if (result == null) result = caseObjectNode(actionInputPin);
				if (result == null) result = caseMultiplicityElement(actionInputPin);
				if (result == null) result = caseActivityNode(actionInputPin);
				if (result == null) result = caseTypedElement(actionInputPin);
				if (result == null) result = caseRedefinableElement(actionInputPin);
				if (result == null) result = caseNamedElement(actionInputPin);
				if (result == null) result = caseElement(actionInputPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION: {
				AddStructuralFeatureValueAction addStructuralFeatureValueAction = (AddStructuralFeatureValueAction)theEObject;
				T result = caseAddStructuralFeatureValueAction(addStructuralFeatureValueAction);
				if (result == null) result = caseWriteStructuralFeatureAction(addStructuralFeatureValueAction);
				if (result == null) result = caseStructuralFeatureAction(addStructuralFeatureValueAction);
				if (result == null) result = caseAction(addStructuralFeatureValueAction);
				if (result == null) result = caseExecutableNode(addStructuralFeatureValueAction);
				if (result == null) result = caseActivityNode(addStructuralFeatureValueAction);
				if (result == null) result = caseRedefinableElement(addStructuralFeatureValueAction);
				if (result == null) result = caseNamedElement(addStructuralFeatureValueAction);
				if (result == null) result = caseElement(addStructuralFeatureValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.ADD_VARIABLE_VALUE_ACTION: {
				AddVariableValueAction addVariableValueAction = (AddVariableValueAction)theEObject;
				T result = caseAddVariableValueAction(addVariableValueAction);
				if (result == null) result = caseWriteVariableAction(addVariableValueAction);
				if (result == null) result = caseVariableAction(addVariableValueAction);
				if (result == null) result = caseAction(addVariableValueAction);
				if (result == null) result = caseExecutableNode(addVariableValueAction);
				if (result == null) result = caseActivityNode(addVariableValueAction);
				if (result == null) result = caseRedefinableElement(addVariableValueAction);
				if (result == null) result = caseNamedElement(addVariableValueAction);
				if (result == null) result = caseElement(addVariableValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.BROADCAST_SIGNAL_ACTION: {
				BroadcastSignalAction broadcastSignalAction = (BroadcastSignalAction)theEObject;
				T result = caseBroadcastSignalAction(broadcastSignalAction);
				if (result == null) result = caseInvocationAction(broadcastSignalAction);
				if (result == null) result = caseAction(broadcastSignalAction);
				if (result == null) result = caseExecutableNode(broadcastSignalAction);
				if (result == null) result = caseActivityNode(broadcastSignalAction);
				if (result == null) result = caseRedefinableElement(broadcastSignalAction);
				if (result == null) result = caseNamedElement(broadcastSignalAction);
				if (result == null) result = caseElement(broadcastSignalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.INVOCATION_ACTION: {
				InvocationAction invocationAction = (InvocationAction)theEObject;
				T result = caseInvocationAction(invocationAction);
				if (result == null) result = caseAction(invocationAction);
				if (result == null) result = caseExecutableNode(invocationAction);
				if (result == null) result = caseActivityNode(invocationAction);
				if (result == null) result = caseRedefinableElement(invocationAction);
				if (result == null) result = caseNamedElement(invocationAction);
				if (result == null) result = caseElement(invocationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CALL_ACTION: {
				CallAction callAction = (CallAction)theEObject;
				T result = caseCallAction(callAction);
				if (result == null) result = caseInvocationAction(callAction);
				if (result == null) result = caseAction(callAction);
				if (result == null) result = caseExecutableNode(callAction);
				if (result == null) result = caseActivityNode(callAction);
				if (result == null) result = caseRedefinableElement(callAction);
				if (result == null) result = caseNamedElement(callAction);
				if (result == null) result = caseElement(callAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CALL_BEHAVIOR_ACTION: {
				CallBehaviorAction callBehaviorAction = (CallBehaviorAction)theEObject;
				T result = caseCallBehaviorAction(callBehaviorAction);
				if (result == null) result = caseCallAction(callBehaviorAction);
				if (result == null) result = caseInvocationAction(callBehaviorAction);
				if (result == null) result = caseAction(callBehaviorAction);
				if (result == null) result = caseExecutableNode(callBehaviorAction);
				if (result == null) result = caseActivityNode(callBehaviorAction);
				if (result == null) result = caseRedefinableElement(callBehaviorAction);
				if (result == null) result = caseNamedElement(callBehaviorAction);
				if (result == null) result = caseElement(callBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CALL_OPERATION_ACTION: {
				CallOperationAction callOperationAction = (CallOperationAction)theEObject;
				T result = caseCallOperationAction(callOperationAction);
				if (result == null) result = caseCallAction(callOperationAction);
				if (result == null) result = caseInvocationAction(callOperationAction);
				if (result == null) result = caseAction(callOperationAction);
				if (result == null) result = caseExecutableNode(callOperationAction);
				if (result == null) result = caseActivityNode(callOperationAction);
				if (result == null) result = caseRedefinableElement(callOperationAction);
				if (result == null) result = caseNamedElement(callOperationAction);
				if (result == null) result = caseElement(callOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CLAUSE: {
				Clause clause = (Clause)theEObject;
				T result = caseClause(clause);
				if (result == null) result = caseElement(clause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CLEAR_ASSOCIATION_ACTION: {
				ClearAssociationAction clearAssociationAction = (ClearAssociationAction)theEObject;
				T result = caseClearAssociationAction(clearAssociationAction);
				if (result == null) result = caseAction(clearAssociationAction);
				if (result == null) result = caseExecutableNode(clearAssociationAction);
				if (result == null) result = caseActivityNode(clearAssociationAction);
				if (result == null) result = caseRedefinableElement(clearAssociationAction);
				if (result == null) result = caseNamedElement(clearAssociationAction);
				if (result == null) result = caseElement(clearAssociationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CLEAR_STRUCTURAL_FEATURE_ACTION: {
				ClearStructuralFeatureAction clearStructuralFeatureAction = (ClearStructuralFeatureAction)theEObject;
				T result = caseClearStructuralFeatureAction(clearStructuralFeatureAction);
				if (result == null) result = caseStructuralFeatureAction(clearStructuralFeatureAction);
				if (result == null) result = caseAction(clearStructuralFeatureAction);
				if (result == null) result = caseExecutableNode(clearStructuralFeatureAction);
				if (result == null) result = caseActivityNode(clearStructuralFeatureAction);
				if (result == null) result = caseRedefinableElement(clearStructuralFeatureAction);
				if (result == null) result = caseNamedElement(clearStructuralFeatureAction);
				if (result == null) result = caseElement(clearStructuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CLEAR_VARIABLE_ACTION: {
				ClearVariableAction clearVariableAction = (ClearVariableAction)theEObject;
				T result = caseClearVariableAction(clearVariableAction);
				if (result == null) result = caseVariableAction(clearVariableAction);
				if (result == null) result = caseAction(clearVariableAction);
				if (result == null) result = caseExecutableNode(clearVariableAction);
				if (result == null) result = caseActivityNode(clearVariableAction);
				if (result == null) result = caseRedefinableElement(clearVariableAction);
				if (result == null) result = caseNamedElement(clearVariableAction);
				if (result == null) result = caseElement(clearVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CONDITIONAL_NODE: {
				ConditionalNode conditionalNode = (ConditionalNode)theEObject;
				T result = caseConditionalNode(conditionalNode);
				if (result == null) result = caseStructuredActivityNode(conditionalNode);
				if (result == null) result = caseAction(conditionalNode);
				if (result == null) result = caseNamespace(conditionalNode);
				if (result == null) result = caseActivityGroup(conditionalNode);
				if (result == null) result = caseExecutableNode(conditionalNode);
				if (result == null) result = caseActivityNode(conditionalNode);
				if (result == null) result = caseRedefinableElement(conditionalNode);
				if (result == null) result = caseNamedElement(conditionalNode);
				if (result == null) result = caseElement(conditionalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CREATE_LINK_ACTION: {
				CreateLinkAction createLinkAction = (CreateLinkAction)theEObject;
				T result = caseCreateLinkAction(createLinkAction);
				if (result == null) result = caseWriteLinkAction(createLinkAction);
				if (result == null) result = caseLinkAction(createLinkAction);
				if (result == null) result = caseAction(createLinkAction);
				if (result == null) result = caseExecutableNode(createLinkAction);
				if (result == null) result = caseActivityNode(createLinkAction);
				if (result == null) result = caseRedefinableElement(createLinkAction);
				if (result == null) result = caseNamedElement(createLinkAction);
				if (result == null) result = caseElement(createLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.LINK_END_CREATION_DATA: {
				LinkEndCreationData linkEndCreationData = (LinkEndCreationData)theEObject;
				T result = caseLinkEndCreationData(linkEndCreationData);
				if (result == null) result = caseLinkEndData(linkEndCreationData);
				if (result == null) result = caseElement(linkEndCreationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CREATE_LINK_OBJECT_ACTION: {
				CreateLinkObjectAction createLinkObjectAction = (CreateLinkObjectAction)theEObject;
				T result = caseCreateLinkObjectAction(createLinkObjectAction);
				if (result == null) result = caseCreateLinkAction(createLinkObjectAction);
				if (result == null) result = caseWriteLinkAction(createLinkObjectAction);
				if (result == null) result = caseLinkAction(createLinkObjectAction);
				if (result == null) result = caseAction(createLinkObjectAction);
				if (result == null) result = caseExecutableNode(createLinkObjectAction);
				if (result == null) result = caseActivityNode(createLinkObjectAction);
				if (result == null) result = caseRedefinableElement(createLinkObjectAction);
				if (result == null) result = caseNamedElement(createLinkObjectAction);
				if (result == null) result = caseElement(createLinkObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.CREATE_OBJECT_ACTION: {
				CreateObjectAction createObjectAction = (CreateObjectAction)theEObject;
				T result = caseCreateObjectAction(createObjectAction);
				if (result == null) result = caseAction(createObjectAction);
				if (result == null) result = caseExecutableNode(createObjectAction);
				if (result == null) result = caseActivityNode(createObjectAction);
				if (result == null) result = caseRedefinableElement(createObjectAction);
				if (result == null) result = caseNamedElement(createObjectAction);
				if (result == null) result = caseElement(createObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.DESTROY_LINK_ACTION: {
				DestroyLinkAction destroyLinkAction = (DestroyLinkAction)theEObject;
				T result = caseDestroyLinkAction(destroyLinkAction);
				if (result == null) result = caseWriteLinkAction(destroyLinkAction);
				if (result == null) result = caseLinkAction(destroyLinkAction);
				if (result == null) result = caseAction(destroyLinkAction);
				if (result == null) result = caseExecutableNode(destroyLinkAction);
				if (result == null) result = caseActivityNode(destroyLinkAction);
				if (result == null) result = caseRedefinableElement(destroyLinkAction);
				if (result == null) result = caseNamedElement(destroyLinkAction);
				if (result == null) result = caseElement(destroyLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.LINK_END_DESTRUCTION_DATA: {
				LinkEndDestructionData linkEndDestructionData = (LinkEndDestructionData)theEObject;
				T result = caseLinkEndDestructionData(linkEndDestructionData);
				if (result == null) result = caseLinkEndData(linkEndDestructionData);
				if (result == null) result = caseElement(linkEndDestructionData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.DESTROY_OBJECT_ACTION: {
				DestroyObjectAction destroyObjectAction = (DestroyObjectAction)theEObject;
				T result = caseDestroyObjectAction(destroyObjectAction);
				if (result == null) result = caseAction(destroyObjectAction);
				if (result == null) result = caseExecutableNode(destroyObjectAction);
				if (result == null) result = caseActivityNode(destroyObjectAction);
				if (result == null) result = caseRedefinableElement(destroyObjectAction);
				if (result == null) result = caseNamedElement(destroyObjectAction);
				if (result == null) result = caseElement(destroyObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.EXPANSION_NODE: {
				ExpansionNode expansionNode = (ExpansionNode)theEObject;
				T result = caseExpansionNode(expansionNode);
				if (result == null) result = caseObjectNode(expansionNode);
				if (result == null) result = caseActivityNode(expansionNode);
				if (result == null) result = caseTypedElement(expansionNode);
				if (result == null) result = caseRedefinableElement(expansionNode);
				if (result == null) result = caseNamedElement(expansionNode);
				if (result == null) result = caseElement(expansionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.EXPANSION_REGION: {
				ExpansionRegion expansionRegion = (ExpansionRegion)theEObject;
				T result = caseExpansionRegion(expansionRegion);
				if (result == null) result = caseStructuredActivityNode(expansionRegion);
				if (result == null) result = caseAction(expansionRegion);
				if (result == null) result = caseNamespace(expansionRegion);
				if (result == null) result = caseActivityGroup(expansionRegion);
				if (result == null) result = caseExecutableNode(expansionRegion);
				if (result == null) result = caseActivityNode(expansionRegion);
				if (result == null) result = caseRedefinableElement(expansionRegion);
				if (result == null) result = caseNamedElement(expansionRegion);
				if (result == null) result = caseElement(expansionRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.LOOP_NODE: {
				LoopNode loopNode = (LoopNode)theEObject;
				T result = caseLoopNode(loopNode);
				if (result == null) result = caseStructuredActivityNode(loopNode);
				if (result == null) result = caseAction(loopNode);
				if (result == null) result = caseNamespace(loopNode);
				if (result == null) result = caseActivityGroup(loopNode);
				if (result == null) result = caseExecutableNode(loopNode);
				if (result == null) result = caseActivityNode(loopNode);
				if (result == null) result = caseRedefinableElement(loopNode);
				if (result == null) result = caseNamedElement(loopNode);
				if (result == null) result = caseElement(loopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.OPAQUE_ACTION: {
				OpaqueAction opaqueAction = (OpaqueAction)theEObject;
				T result = caseOpaqueAction(opaqueAction);
				if (result == null) result = caseAction(opaqueAction);
				if (result == null) result = caseExecutableNode(opaqueAction);
				if (result == null) result = caseActivityNode(opaqueAction);
				if (result == null) result = caseRedefinableElement(opaqueAction);
				if (result == null) result = caseNamedElement(opaqueAction);
				if (result == null) result = caseElement(opaqueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.RAISE_EXCEPTION_ACTION: {
				RaiseExceptionAction raiseExceptionAction = (RaiseExceptionAction)theEObject;
				T result = caseRaiseExceptionAction(raiseExceptionAction);
				if (result == null) result = caseAction(raiseExceptionAction);
				if (result == null) result = caseExecutableNode(raiseExceptionAction);
				if (result == null) result = caseActivityNode(raiseExceptionAction);
				if (result == null) result = caseRedefinableElement(raiseExceptionAction);
				if (result == null) result = caseNamedElement(raiseExceptionAction);
				if (result == null) result = caseElement(raiseExceptionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.READ_EXTENT_ACTION: {
				ReadExtentAction readExtentAction = (ReadExtentAction)theEObject;
				T result = caseReadExtentAction(readExtentAction);
				if (result == null) result = caseAction(readExtentAction);
				if (result == null) result = caseExecutableNode(readExtentAction);
				if (result == null) result = caseActivityNode(readExtentAction);
				if (result == null) result = caseRedefinableElement(readExtentAction);
				if (result == null) result = caseNamedElement(readExtentAction);
				if (result == null) result = caseElement(readExtentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION: {
				ReadIsClassifiedObjectAction readIsClassifiedObjectAction = (ReadIsClassifiedObjectAction)theEObject;
				T result = caseReadIsClassifiedObjectAction(readIsClassifiedObjectAction);
				if (result == null) result = caseAction(readIsClassifiedObjectAction);
				if (result == null) result = caseExecutableNode(readIsClassifiedObjectAction);
				if (result == null) result = caseActivityNode(readIsClassifiedObjectAction);
				if (result == null) result = caseRedefinableElement(readIsClassifiedObjectAction);
				if (result == null) result = caseNamedElement(readIsClassifiedObjectAction);
				if (result == null) result = caseElement(readIsClassifiedObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.READ_LINK_ACTION: {
				ReadLinkAction readLinkAction = (ReadLinkAction)theEObject;
				T result = caseReadLinkAction(readLinkAction);
				if (result == null) result = caseLinkAction(readLinkAction);
				if (result == null) result = caseAction(readLinkAction);
				if (result == null) result = caseExecutableNode(readLinkAction);
				if (result == null) result = caseActivityNode(readLinkAction);
				if (result == null) result = caseRedefinableElement(readLinkAction);
				if (result == null) result = caseNamedElement(readLinkAction);
				if (result == null) result = caseElement(readLinkAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.READ_LINK_OBJECT_END_ACTION: {
				ReadLinkObjectEndAction readLinkObjectEndAction = (ReadLinkObjectEndAction)theEObject;
				T result = caseReadLinkObjectEndAction(readLinkObjectEndAction);
				if (result == null) result = caseAction(readLinkObjectEndAction);
				if (result == null) result = caseExecutableNode(readLinkObjectEndAction);
				if (result == null) result = caseActivityNode(readLinkObjectEndAction);
				if (result == null) result = caseRedefinableElement(readLinkObjectEndAction);
				if (result == null) result = caseNamedElement(readLinkObjectEndAction);
				if (result == null) result = caseElement(readLinkObjectEndAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION: {
				ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction = (ReadLinkObjectEndQualifierAction)theEObject;
				T result = caseReadLinkObjectEndQualifierAction(readLinkObjectEndQualifierAction);
				if (result == null) result = caseAction(readLinkObjectEndQualifierAction);
				if (result == null) result = caseExecutableNode(readLinkObjectEndQualifierAction);
				if (result == null) result = caseActivityNode(readLinkObjectEndQualifierAction);
				if (result == null) result = caseRedefinableElement(readLinkObjectEndQualifierAction);
				if (result == null) result = caseNamedElement(readLinkObjectEndQualifierAction);
				if (result == null) result = caseElement(readLinkObjectEndQualifierAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.READ_SELF_ACTION: {
				ReadSelfAction readSelfAction = (ReadSelfAction)theEObject;
				T result = caseReadSelfAction(readSelfAction);
				if (result == null) result = caseAction(readSelfAction);
				if (result == null) result = caseExecutableNode(readSelfAction);
				if (result == null) result = caseActivityNode(readSelfAction);
				if (result == null) result = caseRedefinableElement(readSelfAction);
				if (result == null) result = caseNamedElement(readSelfAction);
				if (result == null) result = caseElement(readSelfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.READ_STRUCTURAL_FEATURE_ACTION: {
				ReadStructuralFeatureAction readStructuralFeatureAction = (ReadStructuralFeatureAction)theEObject;
				T result = caseReadStructuralFeatureAction(readStructuralFeatureAction);
				if (result == null) result = caseStructuralFeatureAction(readStructuralFeatureAction);
				if (result == null) result = caseAction(readStructuralFeatureAction);
				if (result == null) result = caseExecutableNode(readStructuralFeatureAction);
				if (result == null) result = caseActivityNode(readStructuralFeatureAction);
				if (result == null) result = caseRedefinableElement(readStructuralFeatureAction);
				if (result == null) result = caseNamedElement(readStructuralFeatureAction);
				if (result == null) result = caseElement(readStructuralFeatureAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.READ_VARIABLE_ACTION: {
				ReadVariableAction readVariableAction = (ReadVariableAction)theEObject;
				T result = caseReadVariableAction(readVariableAction);
				if (result == null) result = caseVariableAction(readVariableAction);
				if (result == null) result = caseAction(readVariableAction);
				if (result == null) result = caseExecutableNode(readVariableAction);
				if (result == null) result = caseActivityNode(readVariableAction);
				if (result == null) result = caseRedefinableElement(readVariableAction);
				if (result == null) result = caseNamedElement(readVariableAction);
				if (result == null) result = caseElement(readVariableAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.RECLASSIFY_OBJECT_ACTION: {
				ReclassifyObjectAction reclassifyObjectAction = (ReclassifyObjectAction)theEObject;
				T result = caseReclassifyObjectAction(reclassifyObjectAction);
				if (result == null) result = caseAction(reclassifyObjectAction);
				if (result == null) result = caseExecutableNode(reclassifyObjectAction);
				if (result == null) result = caseActivityNode(reclassifyObjectAction);
				if (result == null) result = caseRedefinableElement(reclassifyObjectAction);
				if (result == null) result = caseNamedElement(reclassifyObjectAction);
				if (result == null) result = caseElement(reclassifyObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.REDUCE_ACTION: {
				ReduceAction reduceAction = (ReduceAction)theEObject;
				T result = caseReduceAction(reduceAction);
				if (result == null) result = caseAction(reduceAction);
				if (result == null) result = caseExecutableNode(reduceAction);
				if (result == null) result = caseActivityNode(reduceAction);
				if (result == null) result = caseRedefinableElement(reduceAction);
				if (result == null) result = caseNamedElement(reduceAction);
				if (result == null) result = caseElement(reduceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION: {
				RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction = (RemoveStructuralFeatureValueAction)theEObject;
				T result = caseRemoveStructuralFeatureValueAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseWriteStructuralFeatureAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseStructuralFeatureAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseAction(removeStructuralFeatureValueAction);
				if (result == null) result = caseExecutableNode(removeStructuralFeatureValueAction);
				if (result == null) result = caseActivityNode(removeStructuralFeatureValueAction);
				if (result == null) result = caseRedefinableElement(removeStructuralFeatureValueAction);
				if (result == null) result = caseNamedElement(removeStructuralFeatureValueAction);
				if (result == null) result = caseElement(removeStructuralFeatureValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.REMOVE_VARIABLE_VALUE_ACTION: {
				RemoveVariableValueAction removeVariableValueAction = (RemoveVariableValueAction)theEObject;
				T result = caseRemoveVariableValueAction(removeVariableValueAction);
				if (result == null) result = caseWriteVariableAction(removeVariableValueAction);
				if (result == null) result = caseVariableAction(removeVariableValueAction);
				if (result == null) result = caseAction(removeVariableValueAction);
				if (result == null) result = caseExecutableNode(removeVariableValueAction);
				if (result == null) result = caseActivityNode(removeVariableValueAction);
				if (result == null) result = caseRedefinableElement(removeVariableValueAction);
				if (result == null) result = caseNamedElement(removeVariableValueAction);
				if (result == null) result = caseElement(removeVariableValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.REPLY_ACTION: {
				ReplyAction replyAction = (ReplyAction)theEObject;
				T result = caseReplyAction(replyAction);
				if (result == null) result = caseAction(replyAction);
				if (result == null) result = caseExecutableNode(replyAction);
				if (result == null) result = caseActivityNode(replyAction);
				if (result == null) result = caseRedefinableElement(replyAction);
				if (result == null) result = caseNamedElement(replyAction);
				if (result == null) result = caseElement(replyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.SEND_OBJECT_ACTION: {
				SendObjectAction sendObjectAction = (SendObjectAction)theEObject;
				T result = caseSendObjectAction(sendObjectAction);
				if (result == null) result = caseInvocationAction(sendObjectAction);
				if (result == null) result = caseAction(sendObjectAction);
				if (result == null) result = caseExecutableNode(sendObjectAction);
				if (result == null) result = caseActivityNode(sendObjectAction);
				if (result == null) result = caseRedefinableElement(sendObjectAction);
				if (result == null) result = caseNamedElement(sendObjectAction);
				if (result == null) result = caseElement(sendObjectAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.SEND_SIGNAL_ACTION: {
				SendSignalAction sendSignalAction = (SendSignalAction)theEObject;
				T result = caseSendSignalAction(sendSignalAction);
				if (result == null) result = caseInvocationAction(sendSignalAction);
				if (result == null) result = caseAction(sendSignalAction);
				if (result == null) result = caseExecutableNode(sendSignalAction);
				if (result == null) result = caseActivityNode(sendSignalAction);
				if (result == null) result = caseRedefinableElement(sendSignalAction);
				if (result == null) result = caseNamedElement(sendSignalAction);
				if (result == null) result = caseElement(sendSignalAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.SEQUENCE_NODE: {
				SequenceNode sequenceNode = (SequenceNode)theEObject;
				T result = caseSequenceNode(sequenceNode);
				if (result == null) result = caseStructuredActivityNode(sequenceNode);
				if (result == null) result = caseAction(sequenceNode);
				if (result == null) result = caseNamespace(sequenceNode);
				if (result == null) result = caseActivityGroup(sequenceNode);
				if (result == null) result = caseExecutableNode(sequenceNode);
				if (result == null) result = caseActivityNode(sequenceNode);
				if (result == null) result = caseRedefinableElement(sequenceNode);
				if (result == null) result = caseNamedElement(sequenceNode);
				if (result == null) result = caseElement(sequenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.START_CLASSIFIER_BEHAVIOR_ACTION: {
				StartClassifierBehaviorAction startClassifierBehaviorAction = (StartClassifierBehaviorAction)theEObject;
				T result = caseStartClassifierBehaviorAction(startClassifierBehaviorAction);
				if (result == null) result = caseAction(startClassifierBehaviorAction);
				if (result == null) result = caseExecutableNode(startClassifierBehaviorAction);
				if (result == null) result = caseActivityNode(startClassifierBehaviorAction);
				if (result == null) result = caseRedefinableElement(startClassifierBehaviorAction);
				if (result == null) result = caseNamedElement(startClassifierBehaviorAction);
				if (result == null) result = caseElement(startClassifierBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.START_OBJECT_BEHAVIOR_ACTION: {
				StartObjectBehaviorAction startObjectBehaviorAction = (StartObjectBehaviorAction)theEObject;
				T result = caseStartObjectBehaviorAction(startObjectBehaviorAction);
				if (result == null) result = caseCallAction(startObjectBehaviorAction);
				if (result == null) result = caseInvocationAction(startObjectBehaviorAction);
				if (result == null) result = caseAction(startObjectBehaviorAction);
				if (result == null) result = caseExecutableNode(startObjectBehaviorAction);
				if (result == null) result = caseActivityNode(startObjectBehaviorAction);
				if (result == null) result = caseRedefinableElement(startObjectBehaviorAction);
				if (result == null) result = caseNamedElement(startObjectBehaviorAction);
				if (result == null) result = caseElement(startObjectBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.TEST_IDENTITY_ACTION: {
				TestIdentityAction testIdentityAction = (TestIdentityAction)theEObject;
				T result = caseTestIdentityAction(testIdentityAction);
				if (result == null) result = caseAction(testIdentityAction);
				if (result == null) result = caseExecutableNode(testIdentityAction);
				if (result == null) result = caseActivityNode(testIdentityAction);
				if (result == null) result = caseRedefinableElement(testIdentityAction);
				if (result == null) result = caseNamedElement(testIdentityAction);
				if (result == null) result = caseElement(testIdentityAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.UNMARSHALL_ACTION: {
				UnmarshallAction unmarshallAction = (UnmarshallAction)theEObject;
				T result = caseUnmarshallAction(unmarshallAction);
				if (result == null) result = caseAction(unmarshallAction);
				if (result == null) result = caseExecutableNode(unmarshallAction);
				if (result == null) result = caseActivityNode(unmarshallAction);
				if (result == null) result = caseRedefinableElement(unmarshallAction);
				if (result == null) result = caseNamedElement(unmarshallAction);
				if (result == null) result = caseElement(unmarshallAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.VALUE_PIN: {
				ValuePin valuePin = (ValuePin)theEObject;
				T result = caseValuePin(valuePin);
				if (result == null) result = caseInputPin(valuePin);
				if (result == null) result = casePin(valuePin);
				if (result == null) result = caseObjectNode(valuePin);
				if (result == null) result = caseMultiplicityElement(valuePin);
				if (result == null) result = caseActivityNode(valuePin);
				if (result == null) result = caseTypedElement(valuePin);
				if (result == null) result = caseRedefinableElement(valuePin);
				if (result == null) result = caseNamedElement(valuePin);
				if (result == null) result = caseElement(valuePin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE: {
				StructuredActivityNode structuredActivityNode = (StructuredActivityNode)theEObject;
				T result = caseStructuredActivityNode(structuredActivityNode);
				if (result == null) result = caseAction(structuredActivityNode);
				if (result == null) result = caseNamespace(structuredActivityNode);
				if (result == null) result = caseActivityGroup(structuredActivityNode);
				if (result == null) result = caseExecutableNode(structuredActivityNode);
				if (result == null) result = caseActivityNode(structuredActivityNode);
				if (result == null) result = caseRedefinableElement(structuredActivityNode);
				if (result == null) result = caseNamedElement(structuredActivityNode);
				if (result == null) result = caseElement(structuredActivityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecificationAction(ValueSpecificationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAction(VariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteLinkAction(WriteLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkAction(LinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndData(LinkEndData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifierValue(QualifierValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteStructuralFeatureAction(WriteStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureAction(StructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteVariableAction(WriteVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptCallAction(AcceptCallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptEventAction(AcceptEventAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionInputPin(ActionInputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddStructuralFeatureValueAction(AddStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddVariableValueAction(AddVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBroadcastSignalAction(BroadcastSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationAction(InvocationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallAction(CallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallBehaviorAction(CallBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallOperationAction(CallOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClause(Clause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Association Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearAssociationAction(ClearAssociationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearStructuralFeatureAction(ClearStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearVariableAction(ClearVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalNode(ConditionalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkAction(CreateLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Creation Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndCreationData(LinkEndCreationData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Link Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateLinkObjectAction(CreateLinkObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateObjectAction(CreateObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyLinkAction(DestroyLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link End Destruction Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkEndDestructionData(LinkEndDestructionData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroyObjectAction(DestroyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionNode(ExpansionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expansion Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expansion Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpansionRegion(ExpansionRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopNode(LoopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueAction(OpaqueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise Exception Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaiseExceptionAction(RaiseExceptionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Extent Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadExtentAction(ReadExtentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Is Classified Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkAction(ReadLinkAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndAction(ReadLinkObjectEndAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Link Object End Qualifier Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Self Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadSelfAction(ReadSelfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Structural Feature Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadStructuralFeatureAction(ReadStructuralFeatureAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Variable Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadVariableAction(ReadVariableAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reclassify Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReclassifyObjectAction(ReclassifyObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduce Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReduceAction(ReduceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Structural Feature Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Variable Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveVariableValueAction(RemoveVariableValueAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyAction(ReplyAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Object Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendObjectAction(SendObjectAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Signal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendSignalAction(SendSignalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceNode(SequenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Classifier Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartClassifierBehaviorAction(StartClassifierBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Object Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartObjectBehaviorAction(StartObjectBehaviorAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Identity Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestIdentityAction(TestIdentityAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unmarshall Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnmarshallAction(UnmarshallAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePin(ValuePin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredActivityNode(StructuredActivityNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableNode(ExecutableNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNode(ObjectNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityGroup(ActivityGroup object) {
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

} //ActionsSwitch
