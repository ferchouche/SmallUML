/**
 */
package uml.interactions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uml.classification.Classifier;
import uml.classification.RedefinableElement;

import uml.commonBehavior.Behavior;

import uml.commonStructure.Constraint;
import uml.commonStructure.Element;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.PackageableElement;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.Type;

import uml.interactions.*;

import uml.simpleClassifiers.BehavioredClassifier;

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
 * @see uml.interactions.InteractionsPackage
 * @generated
 */
public class InteractionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InteractionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionsSwitch() {
		if (modelPackage == null) {
			modelPackage = InteractionsPackage.eINSTANCE;
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
			case InteractionsPackage.ACTION_EXECUTION_SPECIFICATION: {
				ActionExecutionSpecification actionExecutionSpecification = (ActionExecutionSpecification)theEObject;
				T result = caseActionExecutionSpecification(actionExecutionSpecification);
				if (result == null) result = caseExecutionSpecification(actionExecutionSpecification);
				if (result == null) result = caseInteractionFragment(actionExecutionSpecification);
				if (result == null) result = caseNamedElement(actionExecutionSpecification);
				if (result == null) result = caseElement(actionExecutionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.EXECUTION_SPECIFICATION: {
				ExecutionSpecification executionSpecification = (ExecutionSpecification)theEObject;
				T result = caseExecutionSpecification(executionSpecification);
				if (result == null) result = caseInteractionFragment(executionSpecification);
				if (result == null) result = caseNamedElement(executionSpecification);
				if (result == null) result = caseElement(executionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.INTERACTION_FRAGMENT: {
				InteractionFragment interactionFragment = (InteractionFragment)theEObject;
				T result = caseInteractionFragment(interactionFragment);
				if (result == null) result = caseNamedElement(interactionFragment);
				if (result == null) result = caseElement(interactionFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.LIFELINE: {
				Lifeline lifeline = (Lifeline)theEObject;
				T result = caseLifeline(lifeline);
				if (result == null) result = caseNamedElement(lifeline);
				if (result == null) result = caseElement(lifeline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.PART_DECOMPOSITION: {
				PartDecomposition partDecomposition = (PartDecomposition)theEObject;
				T result = casePartDecomposition(partDecomposition);
				if (result == null) result = caseInteractionUse(partDecomposition);
				if (result == null) result = caseInteractionFragment(partDecomposition);
				if (result == null) result = caseNamedElement(partDecomposition);
				if (result == null) result = caseElement(partDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.INTERACTION_USE: {
				InteractionUse interactionUse = (InteractionUse)theEObject;
				T result = caseInteractionUse(interactionUse);
				if (result == null) result = caseInteractionFragment(interactionUse);
				if (result == null) result = caseNamedElement(interactionUse);
				if (result == null) result = caseElement(interactionUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseMessageEnd(gate);
				if (result == null) result = caseNamedElement(gate);
				if (result == null) result = caseElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.MESSAGE_END: {
				MessageEnd messageEnd = (MessageEnd)theEObject;
				T result = caseMessageEnd(messageEnd);
				if (result == null) result = caseNamedElement(messageEnd);
				if (result == null) result = caseElement(messageEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseNamedElement(message);
				if (result == null) result = caseElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.INTERACTION: {
				Interaction interaction = (Interaction)theEObject;
				T result = caseInteraction(interaction);
				if (result == null) result = caseBehavior(interaction);
				if (result == null) result = caseInteractionFragment(interaction);
				if (result == null) result = caseClass(interaction);
				if (result == null) result = caseEncapsulatedClassifier(interaction);
				if (result == null) result = caseBehavioredClassifier(interaction);
				if (result == null) result = caseStructuredClassifier(interaction);
				if (result == null) result = caseClassifier(interaction);
				if (result == null) result = caseNamespace(interaction);
				if (result == null) result = caseRedefinableElement(interaction);
				if (result == null) result = caseType(interaction);
				if (result == null) result = caseTemplateableElement(interaction);
				if (result == null) result = casePackageableElement(interaction);
				if (result == null) result = caseNamedElement(interaction);
				if (result == null) result = caseParameterableElement(interaction);
				if (result == null) result = caseElement(interaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.INTERACTION_OPERAND: {
				InteractionOperand interactionOperand = (InteractionOperand)theEObject;
				T result = caseInteractionOperand(interactionOperand);
				if (result == null) result = caseNamespace(interactionOperand);
				if (result == null) result = caseInteractionFragment(interactionOperand);
				if (result == null) result = caseNamedElement(interactionOperand);
				if (result == null) result = caseElement(interactionOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.INTERACTION_CONSTRAINT: {
				InteractionConstraint interactionConstraint = (InteractionConstraint)theEObject;
				T result = caseInteractionConstraint(interactionConstraint);
				if (result == null) result = caseConstraint(interactionConstraint);
				if (result == null) result = casePackageableElement(interactionConstraint);
				if (result == null) result = caseNamedElement(interactionConstraint);
				if (result == null) result = caseParameterableElement(interactionConstraint);
				if (result == null) result = caseElement(interactionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.GENERAL_ORDERING: {
				GeneralOrdering generalOrdering = (GeneralOrdering)theEObject;
				T result = caseGeneralOrdering(generalOrdering);
				if (result == null) result = caseNamedElement(generalOrdering);
				if (result == null) result = caseElement(generalOrdering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.OCCURRENCE_SPECIFICATION: {
				OccurrenceSpecification occurrenceSpecification = (OccurrenceSpecification)theEObject;
				T result = caseOccurrenceSpecification(occurrenceSpecification);
				if (result == null) result = caseInteractionFragment(occurrenceSpecification);
				if (result == null) result = caseNamedElement(occurrenceSpecification);
				if (result == null) result = caseElement(occurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.BEHAVIOR_EXECUTION_SPECIFICATION: {
				BehaviorExecutionSpecification behaviorExecutionSpecification = (BehaviorExecutionSpecification)theEObject;
				T result = caseBehaviorExecutionSpecification(behaviorExecutionSpecification);
				if (result == null) result = caseExecutionSpecification(behaviorExecutionSpecification);
				if (result == null) result = caseInteractionFragment(behaviorExecutionSpecification);
				if (result == null) result = caseNamedElement(behaviorExecutionSpecification);
				if (result == null) result = caseElement(behaviorExecutionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.COMBINED_FRAGMENT: {
				CombinedFragment combinedFragment = (CombinedFragment)theEObject;
				T result = caseCombinedFragment(combinedFragment);
				if (result == null) result = caseInteractionFragment(combinedFragment);
				if (result == null) result = caseNamedElement(combinedFragment);
				if (result == null) result = caseElement(combinedFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.CONSIDER_IGNORE_FRAGMENT: {
				ConsiderIgnoreFragment considerIgnoreFragment = (ConsiderIgnoreFragment)theEObject;
				T result = caseConsiderIgnoreFragment(considerIgnoreFragment);
				if (result == null) result = caseCombinedFragment(considerIgnoreFragment);
				if (result == null) result = caseInteractionFragment(considerIgnoreFragment);
				if (result == null) result = caseNamedElement(considerIgnoreFragment);
				if (result == null) result = caseElement(considerIgnoreFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.CONTINUATION: {
				Continuation continuation = (Continuation)theEObject;
				T result = caseContinuation(continuation);
				if (result == null) result = caseInteractionFragment(continuation);
				if (result == null) result = caseNamedElement(continuation);
				if (result == null) result = caseElement(continuation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION: {
				DestructionOccurrenceSpecification destructionOccurrenceSpecification = (DestructionOccurrenceSpecification)theEObject;
				T result = caseDestructionOccurrenceSpecification(destructionOccurrenceSpecification);
				if (result == null) result = caseMessageOccurrenceSpecification(destructionOccurrenceSpecification);
				if (result == null) result = caseOccurrenceSpecification(destructionOccurrenceSpecification);
				if (result == null) result = caseMessageEnd(destructionOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(destructionOccurrenceSpecification);
				if (result == null) result = caseNamedElement(destructionOccurrenceSpecification);
				if (result == null) result = caseElement(destructionOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION: {
				MessageOccurrenceSpecification messageOccurrenceSpecification = (MessageOccurrenceSpecification)theEObject;
				T result = caseMessageOccurrenceSpecification(messageOccurrenceSpecification);
				if (result == null) result = caseOccurrenceSpecification(messageOccurrenceSpecification);
				if (result == null) result = caseMessageEnd(messageOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(messageOccurrenceSpecification);
				if (result == null) result = caseNamedElement(messageOccurrenceSpecification);
				if (result == null) result = caseElement(messageOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION: {
				ExecutionOccurrenceSpecification executionOccurrenceSpecification = (ExecutionOccurrenceSpecification)theEObject;
				T result = caseExecutionOccurrenceSpecification(executionOccurrenceSpecification);
				if (result == null) result = caseOccurrenceSpecification(executionOccurrenceSpecification);
				if (result == null) result = caseInteractionFragment(executionOccurrenceSpecification);
				if (result == null) result = caseNamedElement(executionOccurrenceSpecification);
				if (result == null) result = caseElement(executionOccurrenceSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InteractionsPackage.STATE_INVARIANT: {
				StateInvariant stateInvariant = (StateInvariant)theEObject;
				T result = caseStateInvariant(stateInvariant);
				if (result == null) result = caseInteractionFragment(stateInvariant);
				if (result == null) result = caseNamedElement(stateInvariant);
				if (result == null) result = caseElement(stateInvariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionExecutionSpecification(ActionExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionSpecification(ExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFragment(InteractionFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeline(Lifeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartDecomposition(PartDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionUse(InteractionUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageEnd(MessageEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteraction(Interaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionOperand(InteractionOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionConstraint(InteractionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Ordering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralOrdering(GeneralOrdering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrenceSpecification(OccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Execution Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorExecutionSpecification(BehaviorExecutionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combined Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinedFragment(CombinedFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consider Ignore Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsiderIgnoreFragment(ConsiderIgnoreFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuation(Continuation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destruction Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestructionOccurrenceSpecification(DestructionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageOccurrenceSpecification(MessageOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Occurrence Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionOccurrenceSpecification(ExecutionOccurrenceSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInvariant(StateInvariant object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
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

} //InteractionsSwitch
