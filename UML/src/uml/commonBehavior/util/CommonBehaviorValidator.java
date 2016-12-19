/**
 */
package uml.commonBehavior.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonBehavior.*;

import uml.commonStructure.util.CommonStructureValidator;

import uml.simpleClassifiers.util.SimpleClassifiersValidator;

import uml.structuredClassifiers.util.StructuredClassifiersValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.commonBehavior.CommonBehaviorPackage
 * @generated
 */
public class CommonBehaviorValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommonBehaviorValidator INSTANCE = new CommonBehaviorValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.commonBehavior";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonBehaviorValidator() {
		super();
		commonStructureValidator = CommonStructureValidator.INSTANCE;
		classificationValidator = ClassificationValidator.INSTANCE;
		simpleClassifiersValidator = SimpleClassifiersValidator.INSTANCE;
		structuredClassifiersValidator = StructuredClassifiersValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CommonBehaviorPackage.eINSTANCE;
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
			case CommonBehaviorPackage.ANY_RECEIVE_EVENT:
				return validateAnyReceiveEvent((AnyReceiveEvent)value, diagnostics, context);
			case CommonBehaviorPackage.MESSAGE_EVENT:
				return validateMessageEvent((MessageEvent)value, diagnostics, context);
			case CommonBehaviorPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case CommonBehaviorPackage.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case CommonBehaviorPackage.CALL_EVENT:
				return validateCallEvent((CallEvent)value, diagnostics, context);
			case CommonBehaviorPackage.CHANGE_EVENT:
				return validateChangeEvent((ChangeEvent)value, diagnostics, context);
			case CommonBehaviorPackage.FUNCTION_BEHAVIOR:
				return validateFunctionBehavior((FunctionBehavior)value, diagnostics, context);
			case CommonBehaviorPackage.OPAQUE_BEHAVIOR:
				return validateOpaqueBehavior((OpaqueBehavior)value, diagnostics, context);
			case CommonBehaviorPackage.SIGNAL_EVENT:
				return validateSignalEvent((SignalEvent)value, diagnostics, context);
			case CommonBehaviorPackage.TIME_EVENT:
				return validateTimeEvent((TimeEvent)value, diagnostics, context);
			case CommonBehaviorPackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyReceiveEvent(AnyReceiveEvent anyReceiveEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anyReceiveEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(anyReceiveEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(anyReceiveEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageEvent(MessageEvent messageEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(messageEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(messageEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(event, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(event, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(event, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(event, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(event, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(event, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrigger_trigger_with_ports(trigger, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the trigger_with_ports constraint of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRIGGER__TRIGGER_WITH_PORTS__EEXPRESSION = "port->notEmpty() implies event.oclIsKindOf(MessageEvent)";

	/**
	 * Validates the trigger_with_ports constraint of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger_trigger_with_ports(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonBehaviorPackage.Literals.TRIGGER,
				 trigger,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "trigger_with_ports",
				 TRIGGER__TRIGGER_WITH_PORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallEvent(CallEvent callEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(callEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(callEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeEvent(ChangeEvent changeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(changeEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(changeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(changeEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBehavior(FunctionBehavior functionBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_most_one_behavior(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parameters_match(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_feature_of_context_classifier(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionBehavior_one_output_parameter(functionBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionBehavior_types_of_parameters(functionBehavior, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the one_output_parameter constraint of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTION_BEHAVIOR__ONE_OUTPUT_PARAMETER__EEXPRESSION = "self.ownedParameter->\r\n" +
		"  select(p | p.direction = ParameterDirectionKind::out or p.direction= ParameterDirectionKind::inout or p.direction= ParameterDirectionKind::return)->size() >= 1";

	/**
	 * Validates the one_output_parameter constraint of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBehavior_one_output_parameter(FunctionBehavior functionBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonBehaviorPackage.Literals.FUNCTION_BEHAVIOR,
				 functionBehavior,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_output_parameter",
				 FUNCTION_BEHAVIOR__ONE_OUTPUT_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the types_of_parameters constraint of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTION_BEHAVIOR__TYPES_OF_PARAMETERS__EEXPRESSION = "ownedParameter->forAll(p | p.type <> null and\r\n" +
		"  p.type.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p.type.oclAsType(DataType)))";

	/**
	 * Validates the types_of_parameters constraint of '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionBehavior_types_of_parameters(FunctionBehavior functionBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonBehaviorPackage.Literals.FUNCTION_BEHAVIOR,
				 functionBehavior,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "types_of_parameters",
				 FUNCTION_BEHAVIOR__TYPES_OF_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueBehavior(OpaqueBehavior opaqueBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(opaqueBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_most_one_behavior(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parameters_match(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_feature_of_context_classifier(opaqueBehavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalEvent(SignalEvent signalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signalEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(signalEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(signalEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeEvent(TimeEvent timeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(timeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeEvent_when_non_negative(timeEvent, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the when_non_negative constraint of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_EVENT__WHEN_NON_NEGATIVE__EEXPRESSION = "when.integerValue() >= 0";

	/**
	 * Validates the when_non_negative constraint of '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeEvent_when_non_negative(TimeEvent timeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonBehaviorPackage.Literals.TIME_EVENT,
				 timeEvent,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "when_non_negative",
				 TIME_EVENT__WHEN_NON_NEGATIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_most_one_behavior(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_parameters_match(behavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavior_feature_of_context_classifier(behavior, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the most_one_behavior constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BEHAVIOR__MOST_ONE_BEHAVIOR__EEXPRESSION = "specification <> null implies _'context'.ownedBehavior->select(specification=self.specification)->size() = 1";

	/**
	 * Validates the most_one_behavior constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior_most_one_behavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonBehaviorPackage.Literals.BEHAVIOR,
				 behavior,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "most_one_behavior",
				 BEHAVIOR__MOST_ONE_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the parameters_match constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BEHAVIOR__PARAMETERS_MATCH__EEXPRESSION = "specification <> null implies ownedParameter->size() = specification.ownedParameter->size()";

	/**
	 * Validates the parameters_match constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior_parameters_match(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonBehaviorPackage.Literals.BEHAVIOR,
				 behavior,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "parameters_match",
				 BEHAVIOR__PARAMETERS_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the feature_of_context_classifier constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BEHAVIOR__FEATURE_OF_CONTEXT_CLASSIFIER__EEXPRESSION = "_'context'.feature->includes(specification)";

	/**
	 * Validates the feature_of_context_classifier constraint of '<em>Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior_feature_of_context_classifier(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonBehaviorPackage.Literals.BEHAVIOR,
				 behavior,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "feature_of_context_classifier",
				 BEHAVIOR__FEATURE_OF_CONTEXT_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //CommonBehaviorValidator
