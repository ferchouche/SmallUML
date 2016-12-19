/**
 */
package uml.activities.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uml.activities.*;

import uml.classification.Classifier;
import uml.classification.RedefinableElement;

import uml.commonBehavior.Behavior;

import uml.commonStructure.Element;
import uml.commonStructure.MultiplicityElement;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.PackageableElement;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.Type;
import uml.commonStructure.TypedElement;

import uml.simpleClassifiers.BehavioredClassifier;

import uml.structuredClassifiers.ConnectableElement;
import uml.structuredClassifiers.EncapsulatedClassifier;
import uml.structuredClassifiers.StructuredClassifier;

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
 * @see uml.activities.ActivitiesPackage
 * @generated
 */
public class ActivitiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivitiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesSwitch() {
		if (modelPackage == null) {
			modelPackage = ActivitiesPackage.eINSTANCE;
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
			case ActivitiesPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseBehavior(activity);
				if (result == null) result = caseClass(activity);
				if (result == null) result = caseEncapsulatedClassifier(activity);
				if (result == null) result = caseBehavioredClassifier(activity);
				if (result == null) result = caseStructuredClassifier(activity);
				if (result == null) result = caseClassifier(activity);
				if (result == null) result = caseNamespace(activity);
				if (result == null) result = caseRedefinableElement(activity);
				if (result == null) result = caseType(activity);
				if (result == null) result = caseTemplateableElement(activity);
				if (result == null) result = casePackageableElement(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = caseParameterableElement(activity);
				if (result == null) result = caseElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.ACTIVITY_EDGE: {
				ActivityEdge activityEdge = (ActivityEdge)theEObject;
				T result = caseActivityEdge(activityEdge);
				if (result == null) result = caseRedefinableElement(activityEdge);
				if (result == null) result = caseNamedElement(activityEdge);
				if (result == null) result = caseElement(activityEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.ACTIVITY_GROUP: {
				ActivityGroup activityGroup = (ActivityGroup)theEObject;
				T result = caseActivityGroup(activityGroup);
				if (result == null) result = caseNamedElement(activityGroup);
				if (result == null) result = caseElement(activityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.ACTIVITY_NODE: {
				ActivityNode activityNode = (ActivityNode)theEObject;
				T result = caseActivityNode(activityNode);
				if (result == null) result = caseRedefinableElement(activityNode);
				if (result == null) result = caseNamedElement(activityNode);
				if (result == null) result = caseElement(activityNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION: {
				InterruptibleActivityRegion interruptibleActivityRegion = (InterruptibleActivityRegion)theEObject;
				T result = caseInterruptibleActivityRegion(interruptibleActivityRegion);
				if (result == null) result = caseActivityGroup(interruptibleActivityRegion);
				if (result == null) result = caseNamedElement(interruptibleActivityRegion);
				if (result == null) result = caseElement(interruptibleActivityRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.ACTIVITY_PARTITION: {
				ActivityPartition activityPartition = (ActivityPartition)theEObject;
				T result = caseActivityPartition(activityPartition);
				if (result == null) result = caseActivityGroup(activityPartition);
				if (result == null) result = caseNamedElement(activityPartition);
				if (result == null) result = caseElement(activityPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.EXECUTABLE_NODE: {
				ExecutableNode executableNode = (ExecutableNode)theEObject;
				T result = caseExecutableNode(executableNode);
				if (result == null) result = caseActivityNode(executableNode);
				if (result == null) result = caseRedefinableElement(executableNode);
				if (result == null) result = caseNamedElement(executableNode);
				if (result == null) result = caseElement(executableNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.EXCEPTION_HANDLER: {
				ExceptionHandler exceptionHandler = (ExceptionHandler)theEObject;
				T result = caseExceptionHandler(exceptionHandler);
				if (result == null) result = caseElement(exceptionHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.OBJECT_NODE: {
				ObjectNode objectNode = (ObjectNode)theEObject;
				T result = caseObjectNode(objectNode);
				if (result == null) result = caseActivityNode(objectNode);
				if (result == null) result = caseTypedElement(objectNode);
				if (result == null) result = caseRedefinableElement(objectNode);
				if (result == null) result = caseNamedElement(objectNode);
				if (result == null) result = caseElement(objectNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseConnectableElement(variable);
				if (result == null) result = caseMultiplicityElement(variable);
				if (result == null) result = caseTypedElement(variable);
				if (result == null) result = caseParameterableElement(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = caseElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.ACTIVITY_FINAL_NODE: {
				ActivityFinalNode activityFinalNode = (ActivityFinalNode)theEObject;
				T result = caseActivityFinalNode(activityFinalNode);
				if (result == null) result = caseFinalNode(activityFinalNode);
				if (result == null) result = caseControlNode(activityFinalNode);
				if (result == null) result = caseActivityNode(activityFinalNode);
				if (result == null) result = caseRedefinableElement(activityFinalNode);
				if (result == null) result = caseNamedElement(activityFinalNode);
				if (result == null) result = caseElement(activityFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.FINAL_NODE: {
				FinalNode finalNode = (FinalNode)theEObject;
				T result = caseFinalNode(finalNode);
				if (result == null) result = caseControlNode(finalNode);
				if (result == null) result = caseActivityNode(finalNode);
				if (result == null) result = caseRedefinableElement(finalNode);
				if (result == null) result = caseNamedElement(finalNode);
				if (result == null) result = caseElement(finalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseActivityNode(controlNode);
				if (result == null) result = caseRedefinableElement(controlNode);
				if (result == null) result = caseNamedElement(controlNode);
				if (result == null) result = caseElement(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.ACTIVITY_PARAMETER_NODE: {
				ActivityParameterNode activityParameterNode = (ActivityParameterNode)theEObject;
				T result = caseActivityParameterNode(activityParameterNode);
				if (result == null) result = caseObjectNode(activityParameterNode);
				if (result == null) result = caseActivityNode(activityParameterNode);
				if (result == null) result = caseTypedElement(activityParameterNode);
				if (result == null) result = caseRedefinableElement(activityParameterNode);
				if (result == null) result = caseNamedElement(activityParameterNode);
				if (result == null) result = caseElement(activityParameterNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.CENTRAL_BUFFER_NODE: {
				CentralBufferNode centralBufferNode = (CentralBufferNode)theEObject;
				T result = caseCentralBufferNode(centralBufferNode);
				if (result == null) result = caseObjectNode(centralBufferNode);
				if (result == null) result = caseActivityNode(centralBufferNode);
				if (result == null) result = caseTypedElement(centralBufferNode);
				if (result == null) result = caseRedefinableElement(centralBufferNode);
				if (result == null) result = caseNamedElement(centralBufferNode);
				if (result == null) result = caseElement(centralBufferNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.CONTROL_FLOW: {
				ControlFlow controlFlow = (ControlFlow)theEObject;
				T result = caseControlFlow(controlFlow);
				if (result == null) result = caseActivityEdge(controlFlow);
				if (result == null) result = caseRedefinableElement(controlFlow);
				if (result == null) result = caseNamedElement(controlFlow);
				if (result == null) result = caseElement(controlFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.DATA_STORE_NODE: {
				DataStoreNode dataStoreNode = (DataStoreNode)theEObject;
				T result = caseDataStoreNode(dataStoreNode);
				if (result == null) result = caseCentralBufferNode(dataStoreNode);
				if (result == null) result = caseObjectNode(dataStoreNode);
				if (result == null) result = caseActivityNode(dataStoreNode);
				if (result == null) result = caseTypedElement(dataStoreNode);
				if (result == null) result = caseRedefinableElement(dataStoreNode);
				if (result == null) result = caseNamedElement(dataStoreNode);
				if (result == null) result = caseElement(dataStoreNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.DECISION_NODE: {
				DecisionNode decisionNode = (DecisionNode)theEObject;
				T result = caseDecisionNode(decisionNode);
				if (result == null) result = caseControlNode(decisionNode);
				if (result == null) result = caseActivityNode(decisionNode);
				if (result == null) result = caseRedefinableElement(decisionNode);
				if (result == null) result = caseNamedElement(decisionNode);
				if (result == null) result = caseElement(decisionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.OBJECT_FLOW: {
				ObjectFlow objectFlow = (ObjectFlow)theEObject;
				T result = caseObjectFlow(objectFlow);
				if (result == null) result = caseActivityEdge(objectFlow);
				if (result == null) result = caseRedefinableElement(objectFlow);
				if (result == null) result = caseNamedElement(objectFlow);
				if (result == null) result = caseElement(objectFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.FLOW_FINAL_NODE: {
				FlowFinalNode flowFinalNode = (FlowFinalNode)theEObject;
				T result = caseFlowFinalNode(flowFinalNode);
				if (result == null) result = caseFinalNode(flowFinalNode);
				if (result == null) result = caseControlNode(flowFinalNode);
				if (result == null) result = caseActivityNode(flowFinalNode);
				if (result == null) result = caseRedefinableElement(flowFinalNode);
				if (result == null) result = caseNamedElement(flowFinalNode);
				if (result == null) result = caseElement(flowFinalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.FORK_NODE: {
				ForkNode forkNode = (ForkNode)theEObject;
				T result = caseForkNode(forkNode);
				if (result == null) result = caseControlNode(forkNode);
				if (result == null) result = caseActivityNode(forkNode);
				if (result == null) result = caseRedefinableElement(forkNode);
				if (result == null) result = caseNamedElement(forkNode);
				if (result == null) result = caseElement(forkNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.INITIAL_NODE: {
				InitialNode initialNode = (InitialNode)theEObject;
				T result = caseInitialNode(initialNode);
				if (result == null) result = caseControlNode(initialNode);
				if (result == null) result = caseActivityNode(initialNode);
				if (result == null) result = caseRedefinableElement(initialNode);
				if (result == null) result = caseNamedElement(initialNode);
				if (result == null) result = caseElement(initialNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.JOIN_NODE: {
				JoinNode joinNode = (JoinNode)theEObject;
				T result = caseJoinNode(joinNode);
				if (result == null) result = caseControlNode(joinNode);
				if (result == null) result = caseActivityNode(joinNode);
				if (result == null) result = caseRedefinableElement(joinNode);
				if (result == null) result = caseNamedElement(joinNode);
				if (result == null) result = caseElement(joinNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivitiesPackage.MERGE_NODE: {
				MergeNode mergeNode = (MergeNode)theEObject;
				T result = caseMergeNode(mergeNode);
				if (result == null) result = caseControlNode(mergeNode);
				if (result == null) result = caseActivityNode(mergeNode);
				if (result == null) result = caseRedefinableElement(mergeNode);
				if (result == null) result = caseNamedElement(mergeNode);
				if (result == null) result = caseElement(mergeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityEdge(ActivityEdge object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interruptible Activity Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptibleActivityRegion(InterruptibleActivityRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityPartition(ActivityPartition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandler(ExceptionHandler object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityFinalNode(ActivityFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalNode(FinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Parameter Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityParameterNode(ActivityParameterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Central Buffer Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentralBufferNode(CentralBufferNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStoreNode(DataStoreNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectFlow(ObjectFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowFinalNode(FlowFinalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialNode(InitialNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinNode(JoinNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode(MergeNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavior(Behavior object) {
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

} //ActivitiesSwitch
