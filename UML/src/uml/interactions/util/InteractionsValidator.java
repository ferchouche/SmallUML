/**
 */
package uml.interactions.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonBehavior.util.CommonBehaviorValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.interactions.*;

import uml.simpleClassifiers.util.SimpleClassifiersValidator;

import uml.structuredClassifiers.util.StructuredClassifiersValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.interactions.InteractionsPackage
 * @generated
 */
public class InteractionsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InteractionsValidator INSTANCE = new InteractionsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.interactions";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonStructureValidator commonStructureValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationValidator classificationValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleClassifiersValidator simpleClassifiersValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredClassifiersValidator structuredClassifiersValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonBehaviorValidator commonBehaviorValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionsValidator() {
		super();
		commonStructureValidator = CommonStructureValidator.INSTANCE;
		classificationValidator = ClassificationValidator.INSTANCE;
		simpleClassifiersValidator = SimpleClassifiersValidator.INSTANCE;
		structuredClassifiersValidator = StructuredClassifiersValidator.INSTANCE;
		commonBehaviorValidator = CommonBehaviorValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return InteractionsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case InteractionsPackage.ACTION_EXECUTION_SPECIFICATION:
				return validateActionExecutionSpecification((ActionExecutionSpecification)value, diagnostics, context);
			case InteractionsPackage.EXECUTION_SPECIFICATION:
				return validateExecutionSpecification((ExecutionSpecification)value, diagnostics, context);
			case InteractionsPackage.INTERACTION_FRAGMENT:
				return validateInteractionFragment((InteractionFragment)value, diagnostics, context);
			case InteractionsPackage.LIFELINE:
				return validateLifeline((Lifeline)value, diagnostics, context);
			case InteractionsPackage.PART_DECOMPOSITION:
				return validatePartDecomposition((PartDecomposition)value, diagnostics, context);
			case InteractionsPackage.INTERACTION_USE:
				return validateInteractionUse((InteractionUse)value, diagnostics, context);
			case InteractionsPackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case InteractionsPackage.MESSAGE_END:
				return validateMessageEnd((MessageEnd)value, diagnostics, context);
			case InteractionsPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case InteractionsPackage.INTERACTION:
				return validateInteraction((Interaction)value, diagnostics, context);
			case InteractionsPackage.INTERACTION_OPERAND:
				return validateInteractionOperand((InteractionOperand)value, diagnostics, context);
			case InteractionsPackage.INTERACTION_CONSTRAINT:
				return validateInteractionConstraint((InteractionConstraint)value, diagnostics, context);
			case InteractionsPackage.GENERAL_ORDERING:
				return validateGeneralOrdering((GeneralOrdering)value, diagnostics, context);
			case InteractionsPackage.OCCURRENCE_SPECIFICATION:
				return validateOccurrenceSpecification((OccurrenceSpecification)value, diagnostics, context);
			case InteractionsPackage.BEHAVIOR_EXECUTION_SPECIFICATION:
				return validateBehaviorExecutionSpecification((BehaviorExecutionSpecification)value, diagnostics, context);
			case InteractionsPackage.COMBINED_FRAGMENT:
				return validateCombinedFragment((CombinedFragment)value, diagnostics, context);
			case InteractionsPackage.CONSIDER_IGNORE_FRAGMENT:
				return validateConsiderIgnoreFragment((ConsiderIgnoreFragment)value, diagnostics, context);
			case InteractionsPackage.CONTINUATION:
				return validateContinuation((Continuation)value, diagnostics, context);
			case InteractionsPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION:
				return validateDestructionOccurrenceSpecification((DestructionOccurrenceSpecification)value, diagnostics, context);
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION:
				return validateMessageOccurrenceSpecification((MessageOccurrenceSpecification)value, diagnostics, context);
			case InteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION:
				return validateExecutionOccurrenceSpecification((ExecutionOccurrenceSpecification)value, diagnostics, context);
			case InteractionsPackage.STATE_INVARIANT:
				return validateStateInvariant((StateInvariant)value, diagnostics, context);
			case InteractionsPackage.MESSAGE_KIND:
				return validateMessageKind((MessageKind)value, diagnostics, context);
			case InteractionsPackage.MESSAGE_SORT:
				return validateMessageSort((MessageSort)value, diagnostics, context);
			case InteractionsPackage.INTERACTION_OPERATOR_KIND:
				return validateInteractionOperatorKind((InteractionOperatorKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionExecutionSpecification(ActionExecutionSpecification actionExecutionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionExecutionSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutionSpecification_same_lifeline(actionExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionExecutionSpecification_action_referenced(actionExecutionSpecification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the action_referenced constraint of '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION_EXECUTION_SPECIFICATION__ACTION_REFERENCED__EEXPRESSION = "(enclosingInteraction->notEmpty() or enclosingOperand.combinedFragment->notEmpty()) and\r\n" +
		"let parentInteraction : Set(Interaction) = enclosingInteraction.oclAsType(Interaction)->asSet()->union(\r\n" +
		"enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->\r\n" +
		"collect(enclosingInteraction).oclAsType(Interaction)->asSet()) in\r\n" +
		"(parentInteraction->size() = 1) and self.action.interaction->asSet() = parentInteraction";

	/**
	 * Validates the action_referenced constraint of '<em>Action Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionExecutionSpecification_action_referenced(ActionExecutionSpecification actionExecutionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.ACTION_EXECUTION_SPECIFICATION,
				 actionExecutionSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "action_referenced",
				 ACTION_EXECUTION_SPECIFICATION__ACTION_REFERENCED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionSpecification(ExecutionSpecification executionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutionSpecification_same_lifeline(executionSpecification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the same_lifeline constraint of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXECUTION_SPECIFICATION__SAME_LIFELINE__EEXPRESSION = "start.covered = finish.covered";

	/**
	 * Validates the same_lifeline constraint of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionSpecification_same_lifeline(ExecutionSpecification executionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.EXECUTION_SPECIFICATION,
				 executionSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_lifeline",
				 EXECUTION_SPECIFICATION__SAME_LIFELINE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionFragment(InteractionFragment interactionFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionFragment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(interactionFragment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lifeline, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_selector_specified(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_interaction_uses_share_lifeline(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_same_classifier(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_selector_int_or_string(lifeline, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the selector_specified constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LIFELINE__SELECTOR_SPECIFIED__EEXPRESSION = " self.selector->notEmpty() = (self.represents.oclIsKindOf(MultiplicityElement) and self.represents.oclAsType(MultiplicityElement).isMultivalued())";

	/**
	 * Validates the selector_specified constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_selector_specified(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.LIFELINE,
				 lifeline,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selector_specified",
				 LIFELINE__SELECTOR_SPECIFIED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the interaction_uses_share_lifeline constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LIFELINE__INTERACTION_USES_SHARE_LIFELINE__EEXPRESSION = "let intUses : Set(InteractionUse) = interaction.interactionUse  in \r\n" +
		"intUses->forAll\r\n" +
		"( iuse : InteractionUse | \r\n" +
		"let usingInteraction : Set(Interaction)  = iuse.enclosingInteraction->asSet()\r\n" +
		"->union(\r\n" +
		"iuse.enclosingOperand.combinedFragment->asSet()->closure(enclosingOperand.combinedFragment).enclosingInteraction->asSet()\r\n" +
		"               ) \r\n" +
		"in\r\n" +
		"let peerUses : Set(InteractionUse) = usingInteraction.fragment->select(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()\r\n" +
		"->union(\r\n" +
		"usingInteraction.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet()\r\n" +
		"->closure(operand.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)).operand.fragment->\r\n" +
		"select(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()\r\n" +
		"               )->excluding(iuse)\r\n" +
		" in\r\n" +
		"peerUses->forAll( peerUse : InteractionUse |\r\n" +
		" peerUse.refersTo.lifeline->forAll( l : Lifeline | (l.represents = self.represents and \r\n" +
		" ( self.selector.oclIsKindOf(LiteralString) implies\r\n" +
		"  l.selector.oclIsKindOf(LiteralString) and \r\n" +
		"  self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )\r\n" +
		"  and \r\n" +
		"( self.selector.oclIsKindOf(LiteralInteger) implies\r\n" +
		"  l.selector.oclIsKindOf(LiteralInteger) and \r\n" +
		"  self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )\r\n" +
		")  \r\n" +
		"implies\r\n" +
		" usingInteraction.lifeline->select(represents = self.represents and\r\n" +
		" ( self.selector.oclIsKindOf(LiteralString) implies\r\n" +
		"  l.selector.oclIsKindOf(LiteralString) and \r\n" +
		"  self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )\r\n" +
		"and \r\n" +
		"( self.selector.oclIsKindOf(LiteralInteger) implies\r\n" +
		"  l.selector.oclIsKindOf(LiteralInteger) and \r\n" +
		"  self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )\r\n" +
		")\r\n" +
		"                                                )\r\n" +
		"                    )\r\n" +
		")";

	/**
	 * Validates the interaction_uses_share_lifeline constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_interaction_uses_share_lifeline(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.LIFELINE,
				 lifeline,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "interaction_uses_share_lifeline",
				 LIFELINE__INTERACTION_USES_SHARE_LIFELINE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the same_classifier constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LIFELINE__SAME_CLASSIFIER__EEXPRESSION = "represents.namespace->closure(namespace)->includes(interaction._'context')";

	/**
	 * Validates the same_classifier constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_same_classifier(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.LIFELINE,
				 lifeline,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_classifier",
				 LIFELINE__SAME_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the selector_int_or_string constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LIFELINE__SELECTOR_INT_OR_STRING__EEXPRESSION = "self.selector->notEmpty() implies \r\n" +
		"self.selector.oclIsKindOf(LiteralInteger) or \r\n" +
		"self.selector.oclIsKindOf(LiteralString)";

	/**
	 * Validates the selector_int_or_string constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_selector_int_or_string(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.LIFELINE,
				 lifeline,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selector_int_or_string",
				 LIFELINE__SELECTOR_INT_OR_STRING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartDecomposition(PartDecomposition partDecomposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partDecomposition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_gates_match(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_arguments_are_constants(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_returnValueRecipient_coverage(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_arguments_correspond_to_parameters(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_returnValue_type_recipient_correspondence(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_all_lifelines(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartDecomposition_commutativity_of_decomposition(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartDecomposition_assume(partDecomposition, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartDecomposition_parts_of_internal_structures(partDecomposition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the commutativity_of_decomposition constraint of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartDecomposition_commutativity_of_decomposition(PartDecomposition partDecomposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "commutativity_of_decomposition", getObjectLabel(partDecomposition, context) },
						 new Object[] { partDecomposition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the assume constraint of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartDecomposition_assume(PartDecomposition partDecomposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "assume", getObjectLabel(partDecomposition, context) },
						 new Object[] { partDecomposition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the parts_of_internal_structures constraint of '<em>Part Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartDecomposition_parts_of_internal_structures(PartDecomposition partDecomposition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "parts_of_internal_structures", getObjectLabel(partDecomposition, context) },
						 new Object[] { partDecomposition },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionUse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_gates_match(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_arguments_are_constants(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_returnValueRecipient_coverage(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_arguments_correspond_to_parameters(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_returnValue_type_recipient_correspondence(interactionUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionUse_all_lifelines(interactionUse, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the gates_match constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_USE__GATES_MATCH__EEXPRESSION = "actualGate->notEmpty() implies \r\n" +
		"refersTo.formalGate->forAll( fg : Gate | self.actualGate->select(matches(fg))->size()=1) and\r\n" +
		"self.actualGate->forAll(ag : Gate | refersTo.formalGate->select(matches(ag))->size()=1)";

	/**
	 * Validates the gates_match constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_gates_match(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.INTERACTION_USE,
				 interactionUse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "gates_match",
				 INTERACTION_USE__GATES_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the arguments_are_constants constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_arguments_are_constants(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "arguments_are_constants", getObjectLabel(interactionUse, context) },
						 new Object[] { interactionUse },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the returnValueRecipient_coverage constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_USE__RETURN_VALUE_RECIPIENT_COVERAGE__EEXPRESSION = "returnValueRecipient->asSet()->notEmpty() implies\r\n" +
		"let covCE : Set(ConnectableElement) = covered.represents->asSet() in \r\n" +
		"covCE->notEmpty() and let classes:Set(Classifier) = covCE.type.oclIsKindOf(Classifier).oclAsType(Classifier)->asSet() in \r\n" +
		"let allProps : Set(Property) = classes.attribute->union(classes.allParents().attribute)->asSet() in \r\n" +
		"allProps->includes(returnValueRecipient)";

	/**
	 * Validates the returnValueRecipient_coverage constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_returnValueRecipient_coverage(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.INTERACTION_USE,
				 interactionUse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "returnValueRecipient_coverage",
				 INTERACTION_USE__RETURN_VALUE_RECIPIENT_COVERAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the arguments_correspond_to_parameters constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_arguments_correspond_to_parameters(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "arguments_correspond_to_parameters", getObjectLabel(interactionUse, context) },
						 new Object[] { interactionUse },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the returnValue_type_recipient_correspondence constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_USE__RETURN_VALUE_TYPE_RECIPIENT_CORRESPONDENCE__EEXPRESSION = "returnValue.type->asSequence()->notEmpty() implies returnValue.type->asSequence()->first() = returnValueRecipient.type->asSequence()->first()\r\n" +
		"";

	/**
	 * Validates the returnValue_type_recipient_correspondence constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_returnValue_type_recipient_correspondence(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.INTERACTION_USE,
				 interactionUse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "returnValue_type_recipient_correspondence",
				 INTERACTION_USE__RETURN_VALUE_TYPE_RECIPIENT_CORRESPONDENCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the all_lifelines constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_USE__ALL_LIFELINES__EEXPRESSION = "let parentInteraction : Set(Interaction) = enclosingInteraction->asSet()->\r\n" +
		"union(enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->\r\n" +
		"collect(enclosingInteraction).oclAsType(Interaction)->asSet()) in\r\n" +
		"parentInteraction->size()=1 and let refInteraction : Interaction = refersTo in\r\n" +
		"parentInteraction.covered-> forAll(intLifeline : Lifeline | refInteraction.covered->\r\n" +
		"forAll( refLifeline : Lifeline | refLifeline.represents = intLifeline.represents and \r\n" +
		"(\r\n" +
		"( refLifeline.selector.oclIsKindOf(LiteralString) implies\r\n" +
		"  intLifeline.selector.oclIsKindOf(LiteralString) and \r\n" +
		"  refLifeline.selector.oclAsType(LiteralString).value = intLifeline.selector.oclAsType(LiteralString).value ) and\r\n" +
		"( refLifeline.selector.oclIsKindOf(LiteralInteger) implies\r\n" +
		"  intLifeline.selector.oclIsKindOf(LiteralInteger) and \r\n" +
		"  refLifeline.selector.oclAsType(LiteralInteger).value = intLifeline.selector.oclAsType(LiteralInteger).value )\r\n" +
		")\r\n" +
		" implies self.covered->asSet()->includes(intLifeline)))";

	/**
	 * Validates the all_lifelines constraint of '<em>Interaction Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionUse_all_lifelines(InteractionUse interactionUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.INTERACTION_USE,
				 interactionUse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "all_lifelines",
				 INTERACTION_USE__ALL_LIFELINES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(gate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(gate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(gate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(gate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_actual_gate_matched(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_inside_cf_matched(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_outside_cf_matched(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_formal_gate_distinguishable(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_actual_gate_distinguishable(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_outside_cf_gate_distinguishable(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_inside_cf_gate_distinguishable(gate, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the actual_gate_matched constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__ACTUAL_GATE_MATCHED__EEXPRESSION = "interactionUse->notEmpty() implies interactionUse.refersTo.formalGate->select(matches(self))->size()=1";

	/**
	 * Validates the actual_gate_matched constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_actual_gate_matched(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "actual_gate_matched",
				 GATE__ACTUAL_GATE_MATCHED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the inside_cf_matched constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__INSIDE_CF_MATCHED__EEXPRESSION = "isInsideCF() implies combinedFragment.cfragmentGate->select(isOutsideCF() and matches(self))->size()=1";

	/**
	 * Validates the inside_cf_matched constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_inside_cf_matched(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "inside_cf_matched",
				 GATE__INSIDE_CF_MATCHED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the outside_cf_matched constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__OUTSIDE_CF_MATCHED__EEXPRESSION = "isOutsideCF() implies\r\n" +
		" if self.combinedFragment.interactionOperator->asOrderedSet()->first() = InteractionOperatorKind::alt\r\n" +
		" then self.combinedFragment.operand->forAll(op : InteractionOperand |\r\n" +
		" self.combinedFragment.cfragmentGate->select(isInsideCF() and \r\n" +
		" oppositeEnd().enclosingFragment()->includes(self.combinedFragment) and matches(self))->size()=1)\r\n" +
		" else  self.combinedFragment.cfragmentGate->select(isInsideCF() and matches(self))->size()=1\r\n" +
		" endif";

	/**
	 * Validates the outside_cf_matched constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_outside_cf_matched(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "outside_cf_matched",
				 GATE__OUTSIDE_CF_MATCHED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the formal_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__FORMAL_GATE_DISTINGUISHABLE__EEXPRESSION = "isFormal() implies interaction.formalGate->select(getName() = self.getName())->size()=1";

	/**
	 * Validates the formal_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_formal_gate_distinguishable(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "formal_gate_distinguishable",
				 GATE__FORMAL_GATE_DISTINGUISHABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the actual_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__ACTUAL_GATE_DISTINGUISHABLE__EEXPRESSION = "isActual() implies interactionUse.actualGate->select(getName() = self.getName())->size()=1";

	/**
	 * Validates the actual_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_actual_gate_distinguishable(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "actual_gate_distinguishable",
				 GATE__ACTUAL_GATE_DISTINGUISHABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the outside_cf_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__OUTSIDE_CF_GATE_DISTINGUISHABLE__EEXPRESSION = "isOutsideCF() implies combinedFragment.cfragmentGate->select(getName() = self.getName())->size()=1";

	/**
	 * Validates the outside_cf_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_outside_cf_gate_distinguishable(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "outside_cf_gate_distinguishable",
				 GATE__OUTSIDE_CF_GATE_DISTINGUISHABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the inside_cf_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GATE__INSIDE_CF_GATE_DISTINGUISHABLE__EEXPRESSION = "isInsideCF() implies\r\n" +
		"let selfOperand : InteractionOperand = self.getOperand() in\r\n" +
		"  combinedFragment.cfragmentGate->select(isInsideCF() and getName() = self.getName())->select(getOperand() = selfOperand)->size()=1";

	/**
	 * Validates the inside_cf_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_inside_cf_gate_distinguishable(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.GATE,
				 gate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "inside_cf_gate_distinguishable",
				 GATE__INSIDE_CF_GATE_DISTINGUISHABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageEnd(MessageEnd messageEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(messageEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(message, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(message, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(message, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(message, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(message, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_sending_receiving_message_event(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_arguments(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_cannot_cross_boundaries(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signature_is_signal(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_occurrence_specifications(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signature_refer_to(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signature_is_operation_request(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signature_is_operation_reply(message, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sending_receiving_message_event constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__SENDING_RECEIVING_MESSAGE_EVENT__EEXPRESSION = "receiveEvent.oclIsKindOf(MessageOccurrenceSpecification)\r\n" +
		"implies\r\n" +
		"let f :  Lifeline = sendEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered in\r\n" +
		"f = receiveEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered  implies\r\n" +
		"f.events->indexOf(sendEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() ) < \r\n" +
		"f.events->indexOf(receiveEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() )";

	/**
	 * Validates the sending_receiving_message_event constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_sending_receiving_message_event(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "sending_receiving_message_event",
				 MESSAGE__SENDING_RECEIVING_MESSAGE_EVENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the arguments constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_arguments(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "arguments", getObjectLabel(message, context) },
						 new Object[] { message },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the cannot_cross_boundaries constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__CANNOT_CROSS_BOUNDARIES__EEXPRESSION = "sendEvent->notEmpty() and receiveEvent->notEmpty() implies\r\n" +
		"let sendEnclosingFrag : Set(InteractionFragment) = \r\n" +
		"sendEvent->asOrderedSet()->first().enclosingFragment()\r\n" +
		"in \r\n" +
		"let receiveEnclosingFrag : Set(InteractionFragment) = \r\n" +
		"receiveEvent->asOrderedSet()->first().enclosingFragment()\r\n" +
		"in  sendEnclosingFrag = receiveEnclosingFrag";

	/**
	 * Validates the cannot_cross_boundaries constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_cannot_cross_boundaries(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "cannot_cross_boundaries",
				 MESSAGE__CANNOT_CROSS_BOUNDARIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the signature_is_signal constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__SIGNATURE_IS_SIGNAL__EEXPRESSION = "(messageSort = MessageSort::asynchSignal ) and signature.oclIsKindOf(Signal) implies\r\n" +
		"   let signalAttributes : OrderedSet(Property) = signature.oclAsType(Signal).inheritedMember()->\r\n" +
		"             select(n:NamedElement | n.oclIsTypeOf(Property))->collect(oclAsType(Property))->asOrderedSet()\r\n" +
		"   in signalAttributes->size() = self.argument->size()\r\n" +
		"   and self.argument->forAll( o: ValueSpecification |\r\n" +
		"          not (o.oclIsKindOf(Expression)\r\n" +
		"          and o.oclAsType(Expression).symbol->size()=0\r\n" +
		"          and o.oclAsType(Expression).operand->isEmpty() ) implies\r\n" +
		"              let p : Property = signalAttributes->at(self.argument->indexOf(o))\r\n" +
		"              in o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier)))\r\n" +
		"";

	/**
	 * Validates the signature_is_signal constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signature_is_signal(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "signature_is_signal",
				 MESSAGE__SIGNATURE_IS_SIGNAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the occurrence_specifications constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_occurrence_specifications(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "occurrence_specifications", getObjectLabel(message, context) },
						 new Object[] { message },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the signature_refer_to constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__SIGNATURE_REFER_TO__EEXPRESSION = "signature->notEmpty() implies \r\n" +
		"((signature.oclIsKindOf(Operation) and \r\n" +
		"(messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall or messageSort = MessageSort::reply) \r\n" +
		") or (signature.oclIsKindOf(Signal)  and messageSort = MessageSort::asynchSignal )\r\n" +
		" ) and name = signature.name";

	/**
	 * Validates the signature_refer_to constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signature_refer_to(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "signature_refer_to",
				 MESSAGE__SIGNATURE_REFER_TO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the signature_is_operation_request constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__SIGNATURE_IS_OPERATION_REQUEST__EEXPRESSION = "(messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall) and signature.oclIsKindOf(Operation)  implies \r\n" +
		" let requestParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->\r\n" +
		" select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::_'in'  )\r\n" +
		"in requestParms->size() = self.argument->size() and\r\n" +
		"self.argument->forAll( o: ValueSpecification | \r\n" +
		"not (o.oclIsKindOf(Expression) and o.oclAsType(Expression).symbol->size()=0 and o.oclAsType(Expression).operand->isEmpty() ) implies \r\n" +
		"let p : Parameter = requestParms->at(self.argument->indexOf(o)) in\r\n" +
		"o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))\r\n" +
		")";

	/**
	 * Validates the signature_is_operation_request constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signature_is_operation_request(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "signature_is_operation_request",
				 MESSAGE__SIGNATURE_IS_OPERATION_REQUEST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the signature_is_operation_reply constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MESSAGE__SIGNATURE_IS_OPERATION_REPLY__EEXPRESSION = "(messageSort = MessageSort::reply) and signature.oclIsKindOf(Operation) implies \r\n" +
		" let replyParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->\r\n" +
		"select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::return)\r\n" +
		"in replyParms->size() = self.argument->size() and\r\n" +
		"self.argument->forAll( o: ValueSpecification | o.oclIsKindOf(Expression) and let e : Expression = o.oclAsType(Expression) in\r\n" +
		"e.operand->notEmpty()  implies \r\n" +
		"let p : Parameter = replyParms->at(self.argument->indexOf(o)) in\r\n" +
		"e.operand->asSequence()->first().type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))\r\n" +
		")";

	/**
	 * Validates the signature_is_operation_reply constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signature_is_operation_reply(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.MESSAGE,
				 message,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "signature_is_operation_reply",
				 MESSAGE__SIGNATURE_IS_OPERATION_REPLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interaction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_most_one_behavior(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_parameters_match(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_feature_of_context_classifier(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteraction_not_contained(interaction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the not_contained constraint of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION__NOT_CONTAINED__EEXPRESSION = "enclosingInteraction->isEmpty()";

	/**
	 * Validates the not_contained constraint of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction_not_contained(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.INTERACTION,
				 interaction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_contained",
				 INTERACTION__NOT_CONTAINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperand(InteractionOperand interactionOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionOperand, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionOperand_guard_contain_references(interactionOperand, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionOperand_guard_directly_prior(interactionOperand, diagnostics, context);
		return result;
	}

	/**
	 * Validates the guard_contain_references constraint of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperand_guard_contain_references(InteractionOperand interactionOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "guard_contain_references", getObjectLabel(interactionOperand, context) },
						 new Object[] { interactionOperand },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the guard_directly_prior constraint of '<em>Interaction Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperand_guard_directly_prior(InteractionOperand interactionOperand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "guard_directly_prior", getObjectLabel(interactionOperand, context) },
						 new Object[] { interactionOperand },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_boolean_value(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_no_side_effects(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_not_apply_to_self(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_minint_maxint(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_minint_non_negative(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_maxint_positive(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_dynamic_variables(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_global_data(interactionConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateInteractionConstraint_maxint_greater_equal_minint(interactionConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the minint_maxint constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_CONSTRAINT__MININT_MAXINT__EEXPRESSION = "maxint->notEmpty() or minint->notEmpty() implies\r\n" +
		"interactionOperand.combinedFragment.interactionOperator =\r\n" +
		"InteractionOperatorKind::loop";

	/**
	 * Validates the minint_maxint constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_minint_maxint(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.INTERACTION_CONSTRAINT,
				 interactionConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "minint_maxint",
				 INTERACTION_CONSTRAINT__MININT_MAXINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the minint_non_negative constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_CONSTRAINT__MININT_NON_NEGATIVE__EEXPRESSION = "minint->notEmpty() implies \r\n" +
		"minint->asSequence()->first().integerValue() >= 0";

	/**
	 * Validates the minint_non_negative constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_minint_non_negative(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.INTERACTION_CONSTRAINT,
				 interactionConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "minint_non_negative",
				 INTERACTION_CONSTRAINT__MININT_NON_NEGATIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maxint_positive constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_CONSTRAINT__MAXINT_POSITIVE__EEXPRESSION = "maxint->notEmpty() implies \r\n" +
		"maxint->asSequence()->first().integerValue() > 0";

	/**
	 * Validates the maxint_positive constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_maxint_positive(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.INTERACTION_CONSTRAINT,
				 interactionConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "maxint_positive",
				 INTERACTION_CONSTRAINT__MAXINT_POSITIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the dynamic_variables constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_dynamic_variables(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "dynamic_variables", getObjectLabel(interactionConstraint, context) },
						 new Object[] { interactionConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the global_data constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_global_data(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "global_data", getObjectLabel(interactionConstraint, context) },
						 new Object[] { interactionConstraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the maxint_greater_equal_minint constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERACTION_CONSTRAINT__MAXINT_GREATER_EQUAL_MININT__EEXPRESSION = "maxint->notEmpty() implies (minint->notEmpty() and \r\n" +
		"maxint->asSequence()->first().integerValue() >=\r\n" +
		"minint->asSequence()->first().integerValue() )";

	/**
	 * Validates the maxint_greater_equal_minint constraint of '<em>Interaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionConstraint_maxint_greater_equal_minint(InteractionConstraint interactionConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.INTERACTION_CONSTRAINT,
				 interactionConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "maxint_greater_equal_minint",
				 INTERACTION_CONSTRAINT__MAXINT_GREATER_EQUAL_MININT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralOrdering(GeneralOrdering generalOrdering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalOrdering, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(generalOrdering, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralOrdering_irreflexive_transitive_closure(generalOrdering, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the irreflexive_transitive_closure constraint of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENERAL_ORDERING__IRREFLEXIVE_TRANSITIVE_CLOSURE__EEXPRESSION = "after->closure(toAfter.after)->excludes(before)";

	/**
	 * Validates the irreflexive_transitive_closure constraint of '<em>General Ordering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralOrdering_irreflexive_transitive_closure(GeneralOrdering generalOrdering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.GENERAL_ORDERING,
				 generalOrdering,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "irreflexive_transitive_closure",
				 GENERAL_ORDERING__IRREFLEXIVE_TRANSITIVE_CLOSURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccurrenceSpecification(OccurrenceSpecification occurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(occurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(occurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(occurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviorExecutionSpecification(BehaviorExecutionSpecification behaviorExecutionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviorExecutionSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutionSpecification_same_lifeline(behaviorExecutionSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(combinedFragment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_break(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_consider_and_ignore(combinedFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_opt_loop_break_neg(combinedFragment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the break constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMBINED_FRAGMENT__BREAK__EEXPRESSION = "interactionOperator=InteractionOperatorKind::break  implies   \r\n" +
		"enclosingInteraction.oclAsType(InteractionFragment)->asSet()->union(\r\n" +
		"   enclosingOperand.oclAsType(InteractionFragment)->asSet()).covered->asSet() = self.covered->asSet()";

	/**
	 * Validates the break constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment_break(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.COMBINED_FRAGMENT,
				 combinedFragment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "break",
				 COMBINED_FRAGMENT__BREAK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the consider_and_ignore constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMBINED_FRAGMENT__CONSIDER_AND_IGNORE__EEXPRESSION = "((interactionOperator = InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)) implies oclIsKindOf(ConsiderIgnoreFragment)";

	/**
	 * Validates the consider_and_ignore constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment_consider_and_ignore(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.COMBINED_FRAGMENT,
				 combinedFragment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "consider_and_ignore",
				 COMBINED_FRAGMENT__CONSIDER_AND_IGNORE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the opt_loop_break_neg constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMBINED_FRAGMENT__OPT_LOOP_BREAK_NEG__EEXPRESSION = "(interactionOperator =  InteractionOperatorKind::opt or interactionOperator = InteractionOperatorKind::loop or\r\n" +
		"interactionOperator = InteractionOperatorKind::break or interactionOperator = InteractionOperatorKind::assert or\r\n" +
		"interactionOperator = InteractionOperatorKind::neg)\r\n" +
		"implies operand->size()=1";

	/**
	 * Validates the opt_loop_break_neg constraint of '<em>Combined Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinedFragment_opt_loop_break_neg(CombinedFragment combinedFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.COMBINED_FRAGMENT,
				 combinedFragment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "opt_loop_break_neg",
				 COMBINED_FRAGMENT__OPT_LOOP_BREAK_NEG__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderIgnoreFragment(ConsiderIgnoreFragment considerIgnoreFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(considerIgnoreFragment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_break(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_consider_and_ignore(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinedFragment_opt_loop_break_neg(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsiderIgnoreFragment_consider_or_ignore(considerIgnoreFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsiderIgnoreFragment_type(considerIgnoreFragment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the consider_or_ignore constraint of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSIDER_IGNORE_FRAGMENT__CONSIDER_OR_IGNORE__EEXPRESSION = "(interactionOperator =  InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)";

	/**
	 * Validates the consider_or_ignore constraint of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderIgnoreFragment_consider_or_ignore(ConsiderIgnoreFragment considerIgnoreFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.CONSIDER_IGNORE_FRAGMENT,
				 considerIgnoreFragment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "consider_or_ignore",
				 CONSIDER_IGNORE_FRAGMENT__CONSIDER_OR_IGNORE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type constraint of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSIDER_IGNORE_FRAGMENT__TYPE__EEXPRESSION = "message->forAll(m | m.oclIsKindOf(Operation) or m.oclIsKindOf(Signal))";

	/**
	 * Validates the type constraint of '<em>Consider Ignore Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderIgnoreFragment_type(ConsiderIgnoreFragment considerIgnoreFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.CONSIDER_IGNORE_FRAGMENT,
				 considerIgnoreFragment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type",
				 CONSIDER_IGNORE_FRAGMENT__TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation(Continuation continuation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuation_first_or_last_interaction_fragment(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuation_same_name(continuation, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuation_global(continuation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the first_or_last_interaction_fragment constraint of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTINUATION__FIRST_OR_LAST_INTERACTION_FRAGMENT__EEXPRESSION = " enclosingOperand->notEmpty() and \r\n" +
		" let peerFragments : OrderedSet(InteractionFragment) =  enclosingOperand.fragment in \r\n" +
		"   ( peerFragments->notEmpty() and \r\n" +
		"   ((peerFragments->first() = self) or  (peerFragments->last() = self)))";

	/**
	 * Validates the first_or_last_interaction_fragment constraint of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation_first_or_last_interaction_fragment(Continuation continuation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.CONTINUATION,
				 continuation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "first_or_last_interaction_fragment",
				 CONTINUATION__FIRST_OR_LAST_INTERACTION_FRAGMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the same_name constraint of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTINUATION__SAME_NAME__EEXPRESSION = "enclosingOperand.combinedFragment->notEmpty() and\r\n" +
		"let parentInteraction : Set(Interaction) = \r\n" +
		"enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->\r\n" +
		"collect(enclosingInteraction).oclAsType(Interaction)->asSet()\r\n" +
		"in \r\n" +
		"(parentInteraction->size() = 1) \r\n" +
		"and let peerInteractions : Set(Interaction) =\r\n" +
		" (parentInteraction->union(parentInteraction->collect(_'context')->collect(behavior)->\r\n" +
		" select(oclIsKindOf(Interaction)).oclAsType(Interaction)->asSet())->asSet()) in\r\n" +
		" (peerInteractions->notEmpty()) and \r\n" +
		"  let combinedFragments1 : Set(CombinedFragment) = peerInteractions.fragment->\r\n" +
		" select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet() in\r\n" +
		"   combinedFragments1->notEmpty() and  combinedFragments1->closure(operand.fragment->\r\n" +
		"   select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment))->asSet().operand.fragment->\r\n" +
		"   select(oclIsKindOf(Continuation)).oclAsType(Continuation)->asSet()->\r\n" +
		"   forAll(c : Continuation |  (c.name = self.name) implies \r\n" +
		"  (c.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by self\r\n" +
		"  self.covered->asSet()->\r\n" +
		"  select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))\r\n" +
		"   and\r\n" +
		" (self.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by c\r\n" +
		" c.covered->asSet()->\r\n" +
		"  select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))\r\n" +
		"  )";

	/**
	 * Validates the same_name constraint of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation_same_name(Continuation continuation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.CONTINUATION,
				 continuation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_name",
				 CONTINUATION__SAME_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the global constraint of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTINUATION__GLOBAL__EEXPRESSION = "enclosingOperand->notEmpty() and\r\n" +
		"  let operandLifelines : Set(Lifeline) =  enclosingOperand.covered in \r\n" +
		"    (operandLifelines->notEmpty() and \r\n" +
		"    operandLifelines->forAll(ol :Lifeline |self.covered->includes(ol)))";

	/**
	 * Validates the global constraint of '<em>Continuation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuation_global(Continuation continuation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.CONTINUATION,
				 continuation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "global",
				 CONTINUATION__GLOBAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestructionOccurrenceSpecification(DestructionOccurrenceSpecification destructionOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(destructionOccurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(destructionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateDestructionOccurrenceSpecification_no_occurrence_specifications_below(destructionOccurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_occurrence_specifications_below constraint of '<em>Destruction Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESTRUCTION_OCCURRENCE_SPECIFICATION__NO_OCCURRENCE_SPECIFICATIONS_BELOW__EEXPRESSION = "let o : InteractionOperand = enclosingOperand in o->notEmpty() and \r\n" +
		"let peerEvents : OrderedSet(OccurrenceSpecification) = covered.events->select(enclosingOperand = o)\r\n" +
		"in peerEvents->last() = self";

	/**
	 * Validates the no_occurrence_specifications_below constraint of '<em>Destruction Occurrence Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestructionOccurrenceSpecification_no_occurrence_specifications_below(DestructionOccurrenceSpecification destructionOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InteractionsPackage.Literals.DESTRUCTION_OCCURRENCE_SPECIFICATION,
				 destructionOccurrenceSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_occurrence_specifications_below",
				 DESTRUCTION_OCCURRENCE_SPECIFICATION__NO_OCCURRENCE_SPECIFICATIONS_BELOW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageOccurrenceSpecification(MessageOccurrenceSpecification messageOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageOccurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(messageOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(messageOccurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionOccurrenceSpecification(ExecutionOccurrenceSpecification executionOccurrenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionOccurrenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(executionOccurrenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(executionOccurrenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateInvariant(StateInvariant stateInvariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateInvariant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(stateInvariant, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(stateInvariant, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageKind(MessageKind messageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSort(MessageSort messageSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionOperatorKind(InteractionOperatorKind interactionOperatorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //InteractionsValidator
