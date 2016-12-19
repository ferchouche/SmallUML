/**
 */
package uml.actions.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.actions.*;

import uml.activities.util.ActivitiesValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonStructure.util.CommonStructureValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.actions.ActionsPackage
 * @generated
 */
public class ActionsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ActionsValidator INSTANCE = new ActionsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.actions";

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
	protected ActivitiesValidator activitiesValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsValidator() {
		super();
		commonStructureValidator = CommonStructureValidator.INSTANCE;
		classificationValidator = ClassificationValidator.INSTANCE;
		activitiesValidator = ActivitiesValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ActionsPackage.eINSTANCE;
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
			case ActionsPackage.VALUE_SPECIFICATION_ACTION:
				return validateValueSpecificationAction((ValueSpecificationAction)value, diagnostics, context);
			case ActionsPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case ActionsPackage.INPUT_PIN:
				return validateInputPin((InputPin)value, diagnostics, context);
			case ActionsPackage.PIN:
				return validatePin((Pin)value, diagnostics, context);
			case ActionsPackage.OUTPUT_PIN:
				return validateOutputPin((OutputPin)value, diagnostics, context);
			case ActionsPackage.VARIABLE_ACTION:
				return validateVariableAction((VariableAction)value, diagnostics, context);
			case ActionsPackage.WRITE_LINK_ACTION:
				return validateWriteLinkAction((WriteLinkAction)value, diagnostics, context);
			case ActionsPackage.LINK_ACTION:
				return validateLinkAction((LinkAction)value, diagnostics, context);
			case ActionsPackage.LINK_END_DATA:
				return validateLinkEndData((LinkEndData)value, diagnostics, context);
			case ActionsPackage.QUALIFIER_VALUE:
				return validateQualifierValue((QualifierValue)value, diagnostics, context);
			case ActionsPackage.WRITE_STRUCTURAL_FEATURE_ACTION:
				return validateWriteStructuralFeatureAction((WriteStructuralFeatureAction)value, diagnostics, context);
			case ActionsPackage.STRUCTURAL_FEATURE_ACTION:
				return validateStructuralFeatureAction((StructuralFeatureAction)value, diagnostics, context);
			case ActionsPackage.WRITE_VARIABLE_ACTION:
				return validateWriteVariableAction((WriteVariableAction)value, diagnostics, context);
			case ActionsPackage.ACCEPT_CALL_ACTION:
				return validateAcceptCallAction((AcceptCallAction)value, diagnostics, context);
			case ActionsPackage.ACCEPT_EVENT_ACTION:
				return validateAcceptEventAction((AcceptEventAction)value, diagnostics, context);
			case ActionsPackage.ACTION_INPUT_PIN:
				return validateActionInputPin((ActionInputPin)value, diagnostics, context);
			case ActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION:
				return validateAddStructuralFeatureValueAction((AddStructuralFeatureValueAction)value, diagnostics, context);
			case ActionsPackage.ADD_VARIABLE_VALUE_ACTION:
				return validateAddVariableValueAction((AddVariableValueAction)value, diagnostics, context);
			case ActionsPackage.BROADCAST_SIGNAL_ACTION:
				return validateBroadcastSignalAction((BroadcastSignalAction)value, diagnostics, context);
			case ActionsPackage.INVOCATION_ACTION:
				return validateInvocationAction((InvocationAction)value, diagnostics, context);
			case ActionsPackage.CALL_ACTION:
				return validateCallAction((CallAction)value, diagnostics, context);
			case ActionsPackage.CALL_BEHAVIOR_ACTION:
				return validateCallBehaviorAction((CallBehaviorAction)value, diagnostics, context);
			case ActionsPackage.CALL_OPERATION_ACTION:
				return validateCallOperationAction((CallOperationAction)value, diagnostics, context);
			case ActionsPackage.CLAUSE:
				return validateClause((Clause)value, diagnostics, context);
			case ActionsPackage.CLEAR_ASSOCIATION_ACTION:
				return validateClearAssociationAction((ClearAssociationAction)value, diagnostics, context);
			case ActionsPackage.CLEAR_STRUCTURAL_FEATURE_ACTION:
				return validateClearStructuralFeatureAction((ClearStructuralFeatureAction)value, diagnostics, context);
			case ActionsPackage.CLEAR_VARIABLE_ACTION:
				return validateClearVariableAction((ClearVariableAction)value, diagnostics, context);
			case ActionsPackage.CONDITIONAL_NODE:
				return validateConditionalNode((ConditionalNode)value, diagnostics, context);
			case ActionsPackage.CREATE_LINK_ACTION:
				return validateCreateLinkAction((CreateLinkAction)value, diagnostics, context);
			case ActionsPackage.LINK_END_CREATION_DATA:
				return validateLinkEndCreationData((LinkEndCreationData)value, diagnostics, context);
			case ActionsPackage.CREATE_LINK_OBJECT_ACTION:
				return validateCreateLinkObjectAction((CreateLinkObjectAction)value, diagnostics, context);
			case ActionsPackage.CREATE_OBJECT_ACTION:
				return validateCreateObjectAction((CreateObjectAction)value, diagnostics, context);
			case ActionsPackage.DESTROY_LINK_ACTION:
				return validateDestroyLinkAction((DestroyLinkAction)value, diagnostics, context);
			case ActionsPackage.LINK_END_DESTRUCTION_DATA:
				return validateLinkEndDestructionData((LinkEndDestructionData)value, diagnostics, context);
			case ActionsPackage.DESTROY_OBJECT_ACTION:
				return validateDestroyObjectAction((DestroyObjectAction)value, diagnostics, context);
			case ActionsPackage.EXPANSION_NODE:
				return validateExpansionNode((ExpansionNode)value, diagnostics, context);
			case ActionsPackage.EXPANSION_REGION:
				return validateExpansionRegion((ExpansionRegion)value, diagnostics, context);
			case ActionsPackage.LOOP_NODE:
				return validateLoopNode((LoopNode)value, diagnostics, context);
			case ActionsPackage.OPAQUE_ACTION:
				return validateOpaqueAction((OpaqueAction)value, diagnostics, context);
			case ActionsPackage.RAISE_EXCEPTION_ACTION:
				return validateRaiseExceptionAction((RaiseExceptionAction)value, diagnostics, context);
			case ActionsPackage.READ_EXTENT_ACTION:
				return validateReadExtentAction((ReadExtentAction)value, diagnostics, context);
			case ActionsPackage.READ_IS_CLASSIFIED_OBJECT_ACTION:
				return validateReadIsClassifiedObjectAction((ReadIsClassifiedObjectAction)value, diagnostics, context);
			case ActionsPackage.READ_LINK_ACTION:
				return validateReadLinkAction((ReadLinkAction)value, diagnostics, context);
			case ActionsPackage.READ_LINK_OBJECT_END_ACTION:
				return validateReadLinkObjectEndAction((ReadLinkObjectEndAction)value, diagnostics, context);
			case ActionsPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION:
				return validateReadLinkObjectEndQualifierAction((ReadLinkObjectEndQualifierAction)value, diagnostics, context);
			case ActionsPackage.READ_SELF_ACTION:
				return validateReadSelfAction((ReadSelfAction)value, diagnostics, context);
			case ActionsPackage.READ_STRUCTURAL_FEATURE_ACTION:
				return validateReadStructuralFeatureAction((ReadStructuralFeatureAction)value, diagnostics, context);
			case ActionsPackage.READ_VARIABLE_ACTION:
				return validateReadVariableAction((ReadVariableAction)value, diagnostics, context);
			case ActionsPackage.RECLASSIFY_OBJECT_ACTION:
				return validateReclassifyObjectAction((ReclassifyObjectAction)value, diagnostics, context);
			case ActionsPackage.REDUCE_ACTION:
				return validateReduceAction((ReduceAction)value, diagnostics, context);
			case ActionsPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION:
				return validateRemoveStructuralFeatureValueAction((RemoveStructuralFeatureValueAction)value, diagnostics, context);
			case ActionsPackage.REMOVE_VARIABLE_VALUE_ACTION:
				return validateRemoveVariableValueAction((RemoveVariableValueAction)value, diagnostics, context);
			case ActionsPackage.REPLY_ACTION:
				return validateReplyAction((ReplyAction)value, diagnostics, context);
			case ActionsPackage.SEND_OBJECT_ACTION:
				return validateSendObjectAction((SendObjectAction)value, diagnostics, context);
			case ActionsPackage.SEND_SIGNAL_ACTION:
				return validateSendSignalAction((SendSignalAction)value, diagnostics, context);
			case ActionsPackage.SEQUENCE_NODE:
				return validateSequenceNode((SequenceNode)value, diagnostics, context);
			case ActionsPackage.START_CLASSIFIER_BEHAVIOR_ACTION:
				return validateStartClassifierBehaviorAction((StartClassifierBehaviorAction)value, diagnostics, context);
			case ActionsPackage.START_OBJECT_BEHAVIOR_ACTION:
				return validateStartObjectBehaviorAction((StartObjectBehaviorAction)value, diagnostics, context);
			case ActionsPackage.TEST_IDENTITY_ACTION:
				return validateTestIdentityAction((TestIdentityAction)value, diagnostics, context);
			case ActionsPackage.UNMARSHALL_ACTION:
				return validateUnmarshallAction((UnmarshallAction)value, diagnostics, context);
			case ActionsPackage.VALUE_PIN:
				return validateValuePin((ValuePin)value, diagnostics, context);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE:
				return validateStructuredActivityNode((StructuredActivityNode)value, diagnostics, context);
			case ActionsPackage.EXPANSION_KIND:
				return validateExpansionKind((ExpansionKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationAction(ValueSpecificationAction valueSpecificationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueSpecificationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueSpecificationAction_multiplicity(valueSpecificationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueSpecificationAction_compatible_type(valueSpecificationAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALUE_SPECIFICATION_ACTION__MULTIPLICITY__EEXPRESSION = "result.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationAction_multiplicity(ValueSpecificationAction valueSpecificationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.VALUE_SPECIFICATION_ACTION,
				 valueSpecificationAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 VALUE_SPECIFICATION_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the compatible_type constraint of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALUE_SPECIFICATION_ACTION__COMPATIBLE_TYPE__EEXPRESSION = "value.type.conformsTo(result.type)";

	/**
	 * Validates the compatible_type constraint of '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationAction_compatible_type(ValueSpecificationAction valueSpecificationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.VALUE_SPECIFICATION_ACTION,
				 valueSpecificationAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "compatible_type",
				 VALUE_SPECIFICATION_ACTION__COMPATIBLE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(action, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(action, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(action, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(action, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(action, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(action, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(action, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(action, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(action, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(action, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin(InputPin inputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_input_output_parameter(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_selection_behavior(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_object_flow_edges(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_control_pins(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_not_unique(inputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputPin_outgoing_edges_structured_only(inputPin, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the outgoing_edges_structured_only constraint of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INPUT_PIN__OUTGOING_EDGES_STRUCTURED_ONLY__EEXPRESSION = "outgoing->notEmpty() implies\r\n" +
		"\taction<>null and\r\n" +
		"\taction.oclIsKindOf(StructuredActivityNode) and\r\n" +
		"\taction.oclAsType(StructuredActivityNode).allOwnedNodes()->includesAll(outgoing.target)";

	/**
	 * Validates the outgoing_edges_structured_only constraint of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin_outgoing_edges_structured_only(InputPin inputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.INPUT_PIN,
				 inputPin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "outgoing_edges_structured_only",
				 INPUT_PIN__OUTGOING_EDGES_STRUCTURED_ONLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(pin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(pin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(pin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(pin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_input_output_parameter(pin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_selection_behavior(pin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_object_flow_edges(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(pin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_control_pins(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_not_unique(pin, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the control_pins constraint of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PIN__CONTROL_PINS__EEXPRESSION = "isControl implies isControlType";

	/**
	 * Validates the control_pins constraint of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin_control_pins(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.PIN,
				 pin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "control_pins",
				 PIN__CONTROL_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the not_unique constraint of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PIN__NOT_UNIQUE__EEXPRESSION = "not isUnique";

	/**
	 * Validates the not_unique constraint of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin_not_unique(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.PIN,
				 pin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_unique",
				 PIN__NOT_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPin(OutputPin outputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_input_output_parameter(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_selection_behavior(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_object_flow_edges(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_control_pins(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_not_unique(outputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateOutputPin_incoming_edges_structured_only(outputPin, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the incoming_edges_structured_only constraint of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OUTPUT_PIN__INCOMING_EDGES_STRUCTURED_ONLY__EEXPRESSION = "incoming->notEmpty() implies\r\n" +
		"\taction<>null and\r\n" +
		"\taction.oclIsKindOf(StructuredActivityNode) and\r\n" +
		"\taction.oclAsType(StructuredActivityNode).allOwnedNodes()->includesAll(incoming.source)";

	/**
	 * Validates the incoming_edges_structured_only constraint of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPin_incoming_edges_structured_only(OutputPin outputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.OUTPUT_PIN,
				 outputPin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "incoming_edges_structured_only",
				 OUTPUT_PIN__INCOMING_EDGES_STRUCTURED_ONLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAction(VariableAction variableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(variableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scope_of_variable(variableAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the scope_of_variable constraint of '<em>Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VARIABLE_ACTION__SCOPE_OF_VARIABLE__EEXPRESSION = "variable.isAccessibleBy(self)";

	/**
	 * Validates the scope_of_variable constraint of '<em>Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAction_scope_of_variable(VariableAction variableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.VARIABLE_ACTION,
				 variableAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "scope_of_variable",
				 VARIABLE_ACTION__SCOPE_OF_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteLinkAction(WriteLinkAction writeLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(writeLinkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_pins(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_association(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_not_static(writeLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteLinkAction_allow_access(writeLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the allow_access constraint of '<em>Write Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WRITE_LINK_ACTION__ALLOW_ACCESS__EEXPRESSION = "endData.end->exists(end |\r\n" +
		"  end.type=_'context' or\r\n" +
		"  end.visibility=VisibilityKind::public or \r\n" +
		"  end.visibility=VisibilityKind::protected and\r\n" +
		"  endData.end->exists(other | \r\n" +
		"    other<>end and _'context'.conformsTo(other.type.oclAsType(Classifier))))\r\n" +
		"";

	/**
	 * Validates the allow_access constraint of '<em>Write Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteLinkAction_allow_access(WriteLinkAction writeLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.WRITE_LINK_ACTION,
				 writeLinkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "allow_access",
				 WRITE_LINK_ACTION__ALLOW_ACCESS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAction(LinkAction linkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_pins(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_association(linkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_not_static(linkAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the same_pins constraint of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_ACTION__SAME_PINS__EEXPRESSION = "inputValue->asBag()=endData.allPins()";

	/**
	 * Validates the same_pins constraint of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAction_same_pins(LinkAction linkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_ACTION,
				 linkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_pins",
				 LINK_ACTION__SAME_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the same_association constraint of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_ACTION__SAME_ASSOCIATION__EEXPRESSION = "endData.end = self.association().memberEnd->asBag()";

	/**
	 * Validates the same_association constraint of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAction_same_association(LinkAction linkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_ACTION,
				 linkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_association",
				 LINK_ACTION__SAME_ASSOCIATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the not_static constraint of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_ACTION__NOT_STATIC__EEXPRESSION = "endData->forAll(not end.isStatic)";

	/**
	 * Validates the not_static constraint of '<em>Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkAction_not_static(LinkAction linkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_ACTION,
				 linkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_static",
				 LINK_ACTION__NOT_STATIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkEndData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_same_type(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_multiplicity(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_end_object_input_pin(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_property_is_association_end(linkEndData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_qualifiers(linkEndData, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the same_type constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_END_DATA__SAME_TYPE__EEXPRESSION = "value<>null implies value.type.conformsTo(end.type)";

	/**
	 * Validates the same_type constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_same_type(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_END_DATA,
				 linkEndData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_type",
				 LINK_END_DATA__SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_END_DATA__MULTIPLICITY__EEXPRESSION = "value<>null implies value.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_multiplicity(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_END_DATA,
				 linkEndData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 LINK_END_DATA__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the end_object_input_pin constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_END_DATA__END_OBJECT_INPUT_PIN__EEXPRESSION = "value->excludesAll(qualifier.value)";

	/**
	 * Validates the end_object_input_pin constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_end_object_input_pin(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_END_DATA,
				 linkEndData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "end_object_input_pin",
				 LINK_END_DATA__END_OBJECT_INPUT_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the property_is_association_end constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_END_DATA__PROPERTY_IS_ASSOCIATION_END__EEXPRESSION = "end.association <> null";

	/**
	 * Validates the property_is_association_end constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_property_is_association_end(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_END_DATA,
				 linkEndData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "property_is_association_end",
				 LINK_END_DATA__PROPERTY_IS_ASSOCIATION_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the qualifiers constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_END_DATA__QUALIFIERS__EEXPRESSION = "end.qualifier->includesAll(qualifier.qualifier)";

	/**
	 * Validates the qualifiers constraint of '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndData_qualifiers(LinkEndData linkEndData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_END_DATA,
				 linkEndData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "qualifiers",
				 LINK_END_DATA__QUALIFIERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierValue(QualifierValue qualifierValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qualifierValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualifierValue_multiplicity_of_qualifier(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualifierValue_type_of_qualifier(qualifierValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateQualifierValue_qualifier_attribute(qualifierValue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity_of_qualifier constraint of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUALIFIER_VALUE__MULTIPLICITY_OF_QUALIFIER__EEXPRESSION = "value.is(1,1)";

	/**
	 * Validates the multiplicity_of_qualifier constraint of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierValue_multiplicity_of_qualifier(QualifierValue qualifierValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.QUALIFIER_VALUE,
				 qualifierValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_qualifier",
				 QUALIFIER_VALUE__MULTIPLICITY_OF_QUALIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_of_qualifier constraint of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUALIFIER_VALUE__TYPE_OF_QUALIFIER__EEXPRESSION = "value.type.conformsTo(qualifier.type)";

	/**
	 * Validates the type_of_qualifier constraint of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierValue_type_of_qualifier(QualifierValue qualifierValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.QUALIFIER_VALUE,
				 qualifierValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_qualifier",
				 QUALIFIER_VALUE__TYPE_OF_QUALIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the qualifier_attribute constraint of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUALIFIER_VALUE__QUALIFIER_ATTRIBUTE__EEXPRESSION = "linkEndData.end.qualifier->includes(qualifier)";

	/**
	 * Validates the qualifier_attribute constraint of '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierValue_qualifier_attribute(QualifierValue qualifierValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.QUALIFIER_VALUE,
				 qualifierValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "qualifier_attribute",
				 QUALIFIER_VALUE__QUALIFIER_ATTRIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(writeStructuralFeatureAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_object_type(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_not_static(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_one_featuring_classifier(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_multiplicity_of_result(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_type_of_value(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_multiplicity_of_value(writeStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_type_of_result(writeStructuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity_of_result constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WRITE_STRUCTURAL_FEATURE_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION = "result <> null implies result.is(1,1)";

	/**
	 * Validates the multiplicity_of_result constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction_multiplicity_of_result(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.WRITE_STRUCTURAL_FEATURE_ACTION,
				 writeStructuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_result",
				 WRITE_STRUCTURAL_FEATURE_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_of_value constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WRITE_STRUCTURAL_FEATURE_ACTION__TYPE_OF_VALUE__EEXPRESSION = "value <> null implies value.type.conformsTo(structuralFeature.type)";

	/**
	 * Validates the type_of_value constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction_type_of_value(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.WRITE_STRUCTURAL_FEATURE_ACTION,
				 writeStructuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_value",
				 WRITE_STRUCTURAL_FEATURE_ACTION__TYPE_OF_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_value constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WRITE_STRUCTURAL_FEATURE_ACTION__MULTIPLICITY_OF_VALUE__EEXPRESSION = "value<>null implies value.is(1,1)";

	/**
	 * Validates the multiplicity_of_value constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction_multiplicity_of_value(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.WRITE_STRUCTURAL_FEATURE_ACTION,
				 writeStructuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_value",
				 WRITE_STRUCTURAL_FEATURE_ACTION__MULTIPLICITY_OF_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_of_result constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WRITE_STRUCTURAL_FEATURE_ACTION__TYPE_OF_RESULT__EEXPRESSION = "result <> null implies result.type = object.type";

	/**
	 * Validates the type_of_result constraint of '<em>Write Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteStructuralFeatureAction_type_of_result(WriteStructuralFeatureAction writeStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.WRITE_STRUCTURAL_FEATURE_ACTION,
				 writeStructuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_result",
				 WRITE_STRUCTURAL_FEATURE_ACTION__TYPE_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuralFeatureAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_object_type(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_not_static(structuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_one_featuring_classifier(structuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURAL_FEATURE_ACTION__MULTIPLICITY__EEXPRESSION = "object.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_multiplicity(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.STRUCTURAL_FEATURE_ACTION,
				 structuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 STRUCTURAL_FEATURE_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the object_type constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURAL_FEATURE_ACTION__OBJECT_TYPE__EEXPRESSION = "object.type.oclAsType(Classifier).allFeatures()->includes(structuralFeature) or\r\n" +
		"\tobject.type.conformsTo(structuralFeature.oclAsType(Property).opposite.type)";

	/**
	 * Validates the object_type constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_object_type(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.STRUCTURAL_FEATURE_ACTION,
				 structuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "object_type",
				 STRUCTURAL_FEATURE_ACTION__OBJECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the visibility constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURAL_FEATURE_ACTION__VISIBILITY__EEXPRESSION = "structuralFeature.visibility = VisibilityKind::public or\n" +
		"_'context'.allFeatures()->includes(structuralFeature) or\n" +
		"structuralFeature.visibility=VisibilityKind::protected and\n" +
		"_'context'.conformsTo(structuralFeature.oclAsType(Property).opposite.type.oclAsType(Classifier))\n" +
		"";

	/**
	 * Validates the visibility constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_visibility(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.STRUCTURAL_FEATURE_ACTION,
				 structuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "visibility",
				 STRUCTURAL_FEATURE_ACTION__VISIBILITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the not_static constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURAL_FEATURE_ACTION__NOT_STATIC__EEXPRESSION = "not structuralFeature.isStatic";

	/**
	 * Validates the not_static constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_not_static(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.STRUCTURAL_FEATURE_ACTION,
				 structuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_static",
				 STRUCTURAL_FEATURE_ACTION__NOT_STATIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the one_featuring_classifier constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURAL_FEATURE_ACTION__ONE_FEATURING_CLASSIFIER__EEXPRESSION = "structuralFeature.featuringClassifier->size() = 1";

	/**
	 * Validates the one_featuring_classifier constraint of '<em>Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeatureAction_one_featuring_classifier(StructuralFeatureAction structuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.STRUCTURAL_FEATURE_ACTION,
				 structuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_featuring_classifier",
				 STRUCTURAL_FEATURE_ACTION__ONE_FEATURING_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteVariableAction(WriteVariableAction writeVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(writeVariableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scope_of_variable(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_value_type(writeVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_multiplicity(writeVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the value_type constraint of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WRITE_VARIABLE_ACTION__VALUE_TYPE__EEXPRESSION = "value <> null implies value.type.conformsTo(variable.type)";

	/**
	 * Validates the value_type constraint of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteVariableAction_value_type(WriteVariableAction writeVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.WRITE_VARIABLE_ACTION,
				 writeVariableAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "value_type",
				 WRITE_VARIABLE_ACTION__VALUE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WRITE_VARIABLE_ACTION__MULTIPLICITY__EEXPRESSION = "value<>null implies value.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Write Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWriteVariableAction_multiplicity(WriteVariableAction writeVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.WRITE_VARIABLE_ACTION,
				 writeVariableAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 WRITE_VARIABLE_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptCallAction(AcceptCallAction acceptCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(acceptCallAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_one_output_pin(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_no_input_pins(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_no_output_pins(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_unmarshall_signal_events(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_conforming_type(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptCallAction_result_pins(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptCallAction_trigger_call_event(acceptCallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptCallAction_unmarshall(acceptCallAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the result_pins constraint of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCEPT_CALL_ACTION__RESULT_PINS__EEXPRESSION = "let parameter: OrderedSet(Parameter) = trigger.event->asSequence()->first().oclAsType(CallEvent).operation.inputParameters() in\r\n" +
		"result->size() = parameter->size() and\r\n" +
		"Sequence{1..result->size()}->forAll(i | \r\n" +
		"\tparameter->at(i).type.conformsTo(result->at(i).type) and \r\n" +
		"\tparameter->at(i).isOrdered = result->at(i).isOrdered and\r\n" +
		"\tparameter->at(i).compatibleWith(result->at(i)))";

	/**
	 * Validates the result_pins constraint of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptCallAction_result_pins(AcceptCallAction acceptCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACCEPT_CALL_ACTION,
				 acceptCallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "result_pins",
				 ACCEPT_CALL_ACTION__RESULT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the trigger_call_event constraint of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCEPT_CALL_ACTION__TRIGGER_CALL_EVENT__EEXPRESSION = "trigger->size()=1 and\r\n" +
		"trigger->asSequence()->first().event.oclIsKindOf(CallEvent)\r\n" +
		"";

	/**
	 * Validates the trigger_call_event constraint of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptCallAction_trigger_call_event(AcceptCallAction acceptCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACCEPT_CALL_ACTION,
				 acceptCallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "trigger_call_event",
				 ACCEPT_CALL_ACTION__TRIGGER_CALL_EVENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the unmarshall constraint of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCEPT_CALL_ACTION__UNMARSHALL__EEXPRESSION = "isUnmarshall = true";

	/**
	 * Validates the unmarshall constraint of '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptCallAction_unmarshall(AcceptCallAction acceptCallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACCEPT_CALL_ACTION,
				 acceptCallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "unmarshall",
				 ACCEPT_CALL_ACTION__UNMARSHALL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(acceptEventAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_one_output_pin(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_no_input_pins(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_no_output_pins(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_unmarshall_signal_events(acceptEventAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceptEventAction_conforming_type(acceptEventAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the one_output_pin constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCEPT_EVENT_ACTION__ONE_OUTPUT_PIN__EEXPRESSION = "not isUnmarshall and trigger->exists(event.oclIsKindOf(SignalEvent) or event.oclIsKindOf(TimeEvent)) implies \r\n" +
		"\toutput->size() = 1 and output->first().is(1,1)";

	/**
	 * Validates the one_output_pin constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction_one_output_pin(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACCEPT_EVENT_ACTION,
				 acceptEventAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_output_pin",
				 ACCEPT_EVENT_ACTION__ONE_OUTPUT_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_input_pins constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCEPT_EVENT_ACTION__NO_INPUT_PINS__EEXPRESSION = "input->size() = 0";

	/**
	 * Validates the no_input_pins constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction_no_input_pins(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACCEPT_EVENT_ACTION,
				 acceptEventAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_input_pins",
				 ACCEPT_EVENT_ACTION__NO_INPUT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_output_pins constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCEPT_EVENT_ACTION__NO_OUTPUT_PINS__EEXPRESSION = "(self.oclIsTypeOf(AcceptEventAction) and\r\n" +
		"   (trigger->forAll(event.oclIsKindOf(ChangeEvent) or  \r\n" +
		"                             event.oclIsKindOf(CallEvent))))\r\n" +
		"implies output->size() = 0";

	/**
	 * Validates the no_output_pins constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction_no_output_pins(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACCEPT_EVENT_ACTION,
				 acceptEventAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_output_pins",
				 ACCEPT_EVENT_ACTION__NO_OUTPUT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the unmarshall_signal_events constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCEPT_EVENT_ACTION__UNMARSHALL_SIGNAL_EVENTS__EEXPRESSION = "isUnmarshall and self.oclIsTypeOf(AcceptEventAction) implies\r\n" +
		"\ttrigger->size()=1 and\r\n" +
		"\ttrigger->asSequence()->first().event.oclIsKindOf(SignalEvent) and\r\n" +
		"\tlet attribute: OrderedSet(Property) = trigger->asSequence()->first().event.oclAsType(SignalEvent).signal.allAttributes() in\r\n" +
		"\tattribute->size()>0 and result->size() = attribute->size() and\r\n" +
		"\tSequence{1..result->size()}->forAll(i | \r\n" +
		"\t\tresult->at(i).type = attribute->at(i).type and \r\n" +
		"\t\tresult->at(i).isOrdered = attribute->at(i).isOrdered and\r\n" +
		"\t\tresult->at(i).includesMultiplicity(attribute->at(i)))";

	/**
	 * Validates the unmarshall_signal_events constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction_unmarshall_signal_events(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACCEPT_EVENT_ACTION,
				 acceptEventAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "unmarshall_signal_events",
				 ACCEPT_EVENT_ACTION__UNMARSHALL_SIGNAL_EVENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the conforming_type constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCEPT_EVENT_ACTION__CONFORMING_TYPE__EEXPRESSION = "not isUnmarshall implies \r\n" +
		"\tresult->isEmpty() or\r\n" +
		"\tlet type: Type = result->first().type in\r\n" +
		"\ttype=null or \r\n" +
		"\t\t(trigger->forAll(event.oclIsKindOf(SignalEvent)) and \r\n" +
		"\t\t trigger.event.oclAsType(SignalEvent).signal->forAll(s | s.conformsTo(type)))";

	/**
	 * Validates the conforming_type constraint of '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptEventAction_conforming_type(AcceptEventAction acceptEventAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACCEPT_EVENT_ACTION,
				 acceptEventAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "conforming_type",
				 ACCEPT_EVENT_ACTION__CONFORMING_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionInputPin(ActionInputPin actionInputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actionInputPin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_input_output_parameter(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_selection_behavior(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_object_flow_edges(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_control_pins(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_not_unique(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputPin_outgoing_edges_structured_only(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionInputPin_input_pin(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionInputPin_one_output_pin(actionInputPin, diagnostics, context);
		if (result || diagnostics != null) result &= validateActionInputPin_no_control_or_object_flow(actionInputPin, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the input_pin constraint of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION_INPUT_PIN__INPUT_PIN__EEXPRESSION = "fromAction.input->forAll(oclIsKindOf(ActionInputPin))";

	/**
	 * Validates the input_pin constraint of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionInputPin_input_pin(ActionInputPin actionInputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACTION_INPUT_PIN,
				 actionInputPin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "input_pin",
				 ACTION_INPUT_PIN__INPUT_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the one_output_pin constraint of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION_INPUT_PIN__ONE_OUTPUT_PIN__EEXPRESSION = "fromAction.output->size() = 1";

	/**
	 * Validates the one_output_pin constraint of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionInputPin_one_output_pin(ActionInputPin actionInputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACTION_INPUT_PIN,
				 actionInputPin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_output_pin",
				 ACTION_INPUT_PIN__ONE_OUTPUT_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_control_or_object_flow constraint of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTION_INPUT_PIN__NO_CONTROL_OR_OBJECT_FLOW__EEXPRESSION = "fromAction.incoming->union(outgoing)->isEmpty() and\r\n" +
		"fromAction.input.incoming->isEmpty() and\r\n" +
		"fromAction.output.outgoing->isEmpty()";

	/**
	 * Validates the no_control_or_object_flow constraint of '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionInputPin_no_control_or_object_flow(ActionInputPin actionInputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ACTION_INPUT_PIN,
				 actionInputPin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_control_or_object_flow",
				 ACTION_INPUT_PIN__NO_CONTROL_OR_OBJECT_FLOW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddStructuralFeatureValueAction(AddStructuralFeatureValueAction addStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(addStructuralFeatureValueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_object_type(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_not_static(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_one_featuring_classifier(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_multiplicity_of_result(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_type_of_value(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_multiplicity_of_value(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_type_of_result(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddStructuralFeatureValueAction_required_value(addStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddStructuralFeatureValueAction_insertAt_pin(addStructuralFeatureValueAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the required_value constraint of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REQUIRED_VALUE__EEXPRESSION = "value<>null";

	/**
	 * Validates the required_value constraint of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddStructuralFeatureValueAction_required_value(AddStructuralFeatureValueAction addStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ADD_STRUCTURAL_FEATURE_VALUE_ACTION,
				 addStructuralFeatureValueAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "required_value",
				 ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REQUIRED_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the insertAt_pin constraint of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT_PIN__EEXPRESSION = "if not structuralFeature.isOrdered then insertAt = null\n" +
		"else \n" +
		"  not isReplaceAll implies\n" +
		"  \tinsertAt<>null and \n" +
		"  \tinsertAt->forAll(type=UnlimitedNatural and is(1,1.oclAsType(UnlimitedNatural)))\n" +
		"endif\n" +
		"";

	/**
	 * Validates the insertAt_pin constraint of '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddStructuralFeatureValueAction_insertAt_pin(AddStructuralFeatureValueAction addStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ADD_STRUCTURAL_FEATURE_VALUE_ACTION,
				 addStructuralFeatureValueAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "insertAt_pin",
				 ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddVariableValueAction(AddVariableValueAction addVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(addVariableValueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scope_of_variable(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_value_type(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_multiplicity(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddVariableValueAction_required_value(addVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddVariableValueAction_insertAt_pin(addVariableValueAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the required_value constraint of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ADD_VARIABLE_VALUE_ACTION__REQUIRED_VALUE__EEXPRESSION = "value <> null";

	/**
	 * Validates the required_value constraint of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddVariableValueAction_required_value(AddVariableValueAction addVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ADD_VARIABLE_VALUE_ACTION,
				 addVariableValueAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "required_value",
				 ADD_VARIABLE_VALUE_ACTION__REQUIRED_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the insertAt_pin constraint of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ADD_VARIABLE_VALUE_ACTION__INSERT_AT_PIN__EEXPRESSION = "if not variable.isOrdered then insertAt = null\n" +
		"else \n" +
		"  not isReplaceAll implies\n" +
		"  \tinsertAt<>null and \n" +
		"  \tinsertAt->forAll(type=UnlimitedNatural and is(1,1.oclAsType(UnlimitedNatural)))\n" +
		"endif\n" +
		"";

	/**
	 * Validates the insertAt_pin constraint of '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddVariableValueAction_insertAt_pin(AddVariableValueAction addVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.ADD_VARIABLE_VALUE_ACTION,
				 addVariableValueAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "insertAt_pin",
				 ADD_VARIABLE_VALUE_ACTION__INSERT_AT_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSignalAction(BroadcastSignalAction broadcastSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(broadcastSignalAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBroadcastSignalAction_number_of_arguments(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBroadcastSignalAction_type_ordering_multiplicity(broadcastSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBroadcastSignalAction_no_onport(broadcastSignalAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the number_of_arguments constraint of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BROADCAST_SIGNAL_ACTION__NUMBER_OF_ARGUMENTS__EEXPRESSION = "argument->size() = signal.allAttributes()->size()";

	/**
	 * Validates the number_of_arguments constraint of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSignalAction_number_of_arguments(BroadcastSignalAction broadcastSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.BROADCAST_SIGNAL_ACTION,
				 broadcastSignalAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "number_of_arguments",
				 BROADCAST_SIGNAL_ACTION__NUMBER_OF_ARGUMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_ordering_multiplicity constraint of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BROADCAST_SIGNAL_ACTION__TYPE_ORDERING_MULTIPLICITY__EEXPRESSION = "let attribute: OrderedSet(Property) = signal.allAttributes() in\r\n" +
		"Sequence{1..argument->size()}->forAll(i | \r\n" +
		"\targument->at(i).type.conformsTo(attribute->at(i).type) and \r\n" +
		"\targument->at(i).isOrdered = attribute->at(i).isOrdered and\r\n" +
		"\targument->at(i).compatibleWith(attribute->at(i)))";

	/**
	 * Validates the type_ordering_multiplicity constraint of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSignalAction_type_ordering_multiplicity(BroadcastSignalAction broadcastSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.BROADCAST_SIGNAL_ACTION,
				 broadcastSignalAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_ordering_multiplicity",
				 BROADCAST_SIGNAL_ACTION__TYPE_ORDERING_MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_onport constraint of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BROADCAST_SIGNAL_ACTION__NO_ONPORT__EEXPRESSION = "onPort=null";

	/**
	 * Validates the no_onport constraint of '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBroadcastSignalAction_no_onport(BroadcastSignalAction broadcastSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.BROADCAST_SIGNAL_ACTION,
				 broadcastSignalAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_onport",
				 BROADCAST_SIGNAL_ACTION__NO_ONPORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationAction(InvocationAction invocationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(invocationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(invocationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(invocationAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_argument_pins(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_result_pins(callAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_synchronous_call(callAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the argument_pins constraint of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALL_ACTION__ARGUMENT_PINS__EEXPRESSION = "let parameter: OrderedSet(Parameter) = self.inputParameters() in\r\n" +
		"argument->size() = parameter->size() and\r\n" +
		"Sequence{1..argument->size()}->forAll(i | \r\n" +
		"\targument->at(i).type.conformsTo(parameter->at(i).type) and \r\n" +
		"\targument->at(i).isOrdered = parameter->at(i).isOrdered and\r\n" +
		"\targument->at(i).compatibleWith(parameter->at(i)))";

	/**
	 * Validates the argument_pins constraint of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction_argument_pins(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CALL_ACTION,
				 callAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "argument_pins",
				 CALL_ACTION__ARGUMENT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the result_pins constraint of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALL_ACTION__RESULT_PINS__EEXPRESSION = "let parameter: OrderedSet(Parameter) = self.outputParameters() in\r\n" +
		"result->size() = parameter->size() and\r\n" +
		"Sequence{1..result->size()}->forAll(i | \r\n" +
		"\tparameter->at(i).type.conformsTo(result->at(i).type) and \r\n" +
		"\tparameter->at(i).isOrdered = result->at(i).isOrdered and\r\n" +
		"\tparameter->at(i).compatibleWith(result->at(i)))";

	/**
	 * Validates the result_pins constraint of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction_result_pins(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CALL_ACTION,
				 callAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "result_pins",
				 CALL_ACTION__RESULT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the synchronous_call constraint of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALL_ACTION__SYNCHRONOUS_CALL__EEXPRESSION = "result->notEmpty() implies isSynchronous";

	/**
	 * Validates the synchronous_call constraint of '<em>Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallAction_synchronous_call(CallAction callAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CALL_ACTION,
				 callAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "synchronous_call",
				 CALL_ACTION__SYNCHRONOUS_CALL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallBehaviorAction(CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callBehaviorAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_argument_pins(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_result_pins(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_synchronous_call(callBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallBehaviorAction_no_onport(callBehaviorAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_onport constraint of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALL_BEHAVIOR_ACTION__NO_ONPORT__EEXPRESSION = "onPort=null";

	/**
	 * Validates the no_onport constraint of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallBehaviorAction_no_onport(CallBehaviorAction callBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CALL_BEHAVIOR_ACTION,
				 callBehaviorAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_onport",
				 CALL_BEHAVIOR_ACTION__NO_ONPORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperationAction(CallOperationAction callOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callOperationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_argument_pins(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_result_pins(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_synchronous_call(callOperationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallOperationAction_type_target_pin(callOperationAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the type_target_pin constraint of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CALL_OPERATION_ACTION__TYPE_TARGET_PIN__EEXPRESSION = "if onPort=null then  target.type.oclAsType(Classifier).allFeatures()->includes(operation)\r\n" +
		"else target.type.oclAsType(Classifier).allFeatures()->includes(onPort) and onPort.provided->union(onPort.required).allFeatures()->includes(operation)\r\n" +
		"endif";

	/**
	 * Validates the type_target_pin constraint of '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallOperationAction_type_target_pin(CallOperationAction callOperationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CALL_OPERATION_ACTION,
				 callOperationAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_target_pin",
				 CALL_OPERATION_ACTION__TYPE_TARGET_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClause(Clause clause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clause, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clause, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(clause, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateClause_body_output_pins(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateClause_decider_output(clause, diagnostics, context);
		if (result || diagnostics != null) result &= validateClause_test_and_body(clause, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the body_output_pins constraint of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAUSE__BODY_OUTPUT_PINS__EEXPRESSION = "_'body'.oclAsType(Action).allActions().output->includesAll(bodyOutput)";

	/**
	 * Validates the body_output_pins constraint of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClause_body_output_pins(Clause clause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CLAUSE,
				 clause,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "body_output_pins",
				 CLAUSE__BODY_OUTPUT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the decider_output constraint of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAUSE__DECIDER_OUTPUT__EEXPRESSION = "test.oclAsType(Action).allActions().output->includes(decider) and\r\n" +
		"decider.type = Boolean and\r\n" +
		"decider.is(1,1)";

	/**
	 * Validates the decider_output constraint of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClause_decider_output(Clause clause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CLAUSE,
				 clause,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "decider_output",
				 CLAUSE__DECIDER_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the test_and_body constraint of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAUSE__TEST_AND_BODY__EEXPRESSION = "test->intersection(_'body')->isEmpty()";

	/**
	 * Validates the test_and_body constraint of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClause_test_and_body(Clause clause, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CLAUSE,
				 clause,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "test_and_body",
				 CLAUSE__TEST_AND_BODY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearAssociationAction(ClearAssociationAction clearAssociationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clearAssociationAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClearAssociationAction_multiplicity(clearAssociationAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClearAssociationAction_same_type(clearAssociationAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLEAR_ASSOCIATION_ACTION__MULTIPLICITY__EEXPRESSION = "object.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearAssociationAction_multiplicity(ClearAssociationAction clearAssociationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CLEAR_ASSOCIATION_ACTION,
				 clearAssociationAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 CLEAR_ASSOCIATION_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the same_type constraint of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLEAR_ASSOCIATION_ACTION__SAME_TYPE__EEXPRESSION = "association.memberEnd->exists(self.object.type.conformsTo(type))";

	/**
	 * Validates the same_type constraint of '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearAssociationAction_same_type(ClearAssociationAction clearAssociationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CLEAR_ASSOCIATION_ACTION,
				 clearAssociationAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_type",
				 CLEAR_ASSOCIATION_ACTION__SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearStructuralFeatureAction(ClearStructuralFeatureAction clearStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clearStructuralFeatureAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_object_type(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_not_static(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_one_featuring_classifier(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClearStructuralFeatureAction_type_of_result(clearStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateClearStructuralFeatureAction_multiplicity_of_result(clearStructuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the type_of_result constraint of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLEAR_STRUCTURAL_FEATURE_ACTION__TYPE_OF_RESULT__EEXPRESSION = "result<>null implies result.type = object.type";

	/**
	 * Validates the type_of_result constraint of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearStructuralFeatureAction_type_of_result(ClearStructuralFeatureAction clearStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CLEAR_STRUCTURAL_FEATURE_ACTION,
				 clearStructuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_result",
				 CLEAR_STRUCTURAL_FEATURE_ACTION__TYPE_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_result constraint of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLEAR_STRUCTURAL_FEATURE_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION = "result<>null implies result.is(1,1)";

	/**
	 * Validates the multiplicity_of_result constraint of '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearStructuralFeatureAction_multiplicity_of_result(ClearStructuralFeatureAction clearStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CLEAR_STRUCTURAL_FEATURE_ACTION,
				 clearStructuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_result",
				 CLEAR_STRUCTURAL_FEATURE_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClearVariableAction(ClearVariableAction clearVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clearVariableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(clearVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scope_of_variable(clearVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionalNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_nodes_and_edges(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_not_contained(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_output_pin_edges(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_input_pin_edges(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_result_no_incoming(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_no_input_pins(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_one_clause_with_executable_node(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_matching_output_pins(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_executable_nodes(conditionalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalNode_clause_no_predecessor(conditionalNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the result_no_incoming constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITIONAL_NODE__RESULT_NO_INCOMING__EEXPRESSION = "result.incoming->isEmpty()";

	/**
	 * Validates the result_no_incoming constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_result_no_incoming(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CONDITIONAL_NODE,
				 conditionalNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "result_no_incoming",
				 CONDITIONAL_NODE__RESULT_NO_INCOMING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_input_pins constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITIONAL_NODE__NO_INPUT_PINS__EEXPRESSION = "input->isEmpty()";

	/**
	 * Validates the no_input_pins constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_no_input_pins(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CONDITIONAL_NODE,
				 conditionalNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_input_pins",
				 CONDITIONAL_NODE__NO_INPUT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the one_clause_with_executable_node constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITIONAL_NODE__ONE_CLAUSE_WITH_EXECUTABLE_NODE__EEXPRESSION = "node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->forAll(n | \r\n" +
		"\tself.clause->select(test->union(_'body')->includes(n))->size()=1)";

	/**
	 * Validates the one_clause_with_executable_node constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_one_clause_with_executable_node(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CONDITIONAL_NODE,
				 conditionalNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_clause_with_executable_node",
				 CONDITIONAL_NODE__ONE_CLAUSE_WITH_EXECUTABLE_NODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the matching_output_pins constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITIONAL_NODE__MATCHING_OUTPUT_PINS__EEXPRESSION = "clause->forAll(\r\n" +
		"\tbodyOutput->size()=self.result->size() and\r\n" +
		"\tSequence{1..self.result->size()}->forAll(i |\r\n" +
		"\t\tbodyOutput->at(i).type.conformsTo(result->at(i).type) and\r\n" +
		"\t\tbodyOutput->at(i).isOrdered = result->at(i).isOrdered and\r\n" +
		"\t\tbodyOutput->at(i).isUnique = result->at(i).isUnique and\r\n" +
		"\t\tbodyOutput->at(i).compatibleWith(result->at(i))))";

	/**
	 * Validates the matching_output_pins constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_matching_output_pins(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CONDITIONAL_NODE,
				 conditionalNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "matching_output_pins",
				 CONDITIONAL_NODE__MATCHING_OUTPUT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the executable_nodes constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITIONAL_NODE__EXECUTABLE_NODES__EEXPRESSION = "clause.test->union(clause._'body') = node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)";

	/**
	 * Validates the executable_nodes constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_executable_nodes(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CONDITIONAL_NODE,
				 conditionalNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "executable_nodes",
				 CONDITIONAL_NODE__EXECUTABLE_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the clause_no_predecessor constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITIONAL_NODE__CLAUSE_NO_PREDECESSOR__EEXPRESSION = "clause->closure(predecessorClause)->intersection(clause)->isEmpty()";

	/**
	 * Validates the clause_no_predecessor constraint of '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalNode_clause_no_predecessor(ConditionalNode conditionalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CONDITIONAL_NODE,
				 conditionalNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "clause_no_predecessor",
				 CONDITIONAL_NODE__CLAUSE_NO_PREDECESSOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkAction(CreateLinkAction createLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createLinkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_pins(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_association(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_not_static(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteLinkAction_allow_access(createLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkAction_association_not_abstract(createLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the association_not_abstract constraint of '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATE_LINK_ACTION__ASSOCIATION_NOT_ABSTRACT__EEXPRESSION = "not self.association().isAbstract";

	/**
	 * Validates the association_not_abstract constraint of '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkAction_association_not_abstract(CreateLinkAction createLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CREATE_LINK_ACTION,
				 createLinkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "association_not_abstract",
				 CREATE_LINK_ACTION__ASSOCIATION_NOT_ABSTRACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndCreationData(LinkEndCreationData linkEndCreationData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkEndCreationData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_same_type(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_multiplicity(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_end_object_input_pin(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_property_is_association_end(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_qualifiers(linkEndCreationData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndCreationData_insertAt_pin(linkEndCreationData, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the insertAt_pin constraint of '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_END_CREATION_DATA__INSERT_AT_PIN__EEXPRESSION = "if  not end.isOrdered\n" +
		"then insertAt = null\n" +
		"else\n" +
		"\tnot isReplaceAll=false implies\n" +
		"\tinsertAt <> null and insertAt->forAll(type=UnlimitedNatural and is(1,1))\n" +
		"endif\n" +
		"";

	/**
	 * Validates the insertAt_pin constraint of '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndCreationData_insertAt_pin(LinkEndCreationData linkEndCreationData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_END_CREATION_DATA,
				 linkEndCreationData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "insertAt_pin",
				 LINK_END_CREATION_DATA__INSERT_AT_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkObjectAction(CreateLinkObjectAction createLinkObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createLinkObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_pins(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_association(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_not_static(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteLinkAction_allow_access(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkAction_association_not_abstract(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkObjectAction_multiplicity(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkObjectAction_type_of_result(createLinkObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateLinkObjectAction_association_class(createLinkObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATE_LINK_OBJECT_ACTION__MULTIPLICITY__EEXPRESSION = "result.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkObjectAction_multiplicity(CreateLinkObjectAction createLinkObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CREATE_LINK_OBJECT_ACTION,
				 createLinkObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 CREATE_LINK_OBJECT_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_of_result constraint of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATE_LINK_OBJECT_ACTION__TYPE_OF_RESULT__EEXPRESSION = "result.type = association()";

	/**
	 * Validates the type_of_result constraint of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkObjectAction_type_of_result(CreateLinkObjectAction createLinkObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CREATE_LINK_OBJECT_ACTION,
				 createLinkObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_result",
				 CREATE_LINK_OBJECT_ACTION__TYPE_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the association_class constraint of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATE_LINK_OBJECT_ACTION__ASSOCIATION_CLASS__EEXPRESSION = "self.association().oclIsKindOf(AssociationClass)";

	/**
	 * Validates the association_class constraint of '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateLinkObjectAction_association_class(CreateLinkObjectAction createLinkObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CREATE_LINK_OBJECT_ACTION,
				 createLinkObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "association_class",
				 CREATE_LINK_OBJECT_ACTION__ASSOCIATION_CLASS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(createObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateObjectAction_classifier_not_abstract(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateObjectAction_multiplicity(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateObjectAction_classifier_not_association_class(createObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCreateObjectAction_same_type(createObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the classifier_not_abstract constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATE_OBJECT_ACTION__CLASSIFIER_NOT_ABSTRACT__EEXPRESSION = "not classifier.isAbstract ";

	/**
	 * Validates the classifier_not_abstract constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction_classifier_not_abstract(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CREATE_OBJECT_ACTION,
				 createObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "classifier_not_abstract",
				 CREATE_OBJECT_ACTION__CLASSIFIER_NOT_ABSTRACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATE_OBJECT_ACTION__MULTIPLICITY__EEXPRESSION = "result.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction_multiplicity(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CREATE_OBJECT_ACTION,
				 createObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 CREATE_OBJECT_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the classifier_not_association_class constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATE_OBJECT_ACTION__CLASSIFIER_NOT_ASSOCIATION_CLASS__EEXPRESSION = "not classifier.oclIsKindOf(AssociationClass)";

	/**
	 * Validates the classifier_not_association_class constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction_classifier_not_association_class(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CREATE_OBJECT_ACTION,
				 createObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "classifier_not_association_class",
				 CREATE_OBJECT_ACTION__CLASSIFIER_NOT_ASSOCIATION_CLASS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the same_type constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CREATE_OBJECT_ACTION__SAME_TYPE__EEXPRESSION = "result.type = classifier";

	/**
	 * Validates the same_type constraint of '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateObjectAction_same_type(CreateObjectAction createObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.CREATE_OBJECT_ACTION,
				 createObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_type",
				 CREATE_OBJECT_ACTION__SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyLinkAction(DestroyLinkAction destroyLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(destroyLinkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_pins(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_association(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_not_static(destroyLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteLinkAction_allow_access(destroyLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndDestructionData(LinkEndDestructionData linkEndDestructionData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkEndDestructionData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_same_type(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_multiplicity(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_end_object_input_pin(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_property_is_association_end(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndData_qualifiers(linkEndDestructionData, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkEndDestructionData_destroyAt_pin(linkEndDestructionData, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the destroyAt_pin constraint of '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LINK_END_DESTRUCTION_DATA__DESTROY_AT_PIN__EEXPRESSION = "if  not end.isOrdered or end.isUnique or isDestroyDuplicates\r\n" +
		"then destroyAt = null\r\n" +
		"else\r\n" +
		"\tdestroyAt <> null and \r\n" +
		"\tdestroyAt->forAll(type=UnlimitedNatural and is(1,1))\r\n" +
		"endif\r\n" +
		"";

	/**
	 * Validates the destroyAt_pin constraint of '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEndDestructionData_destroyAt_pin(LinkEndDestructionData linkEndDestructionData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LINK_END_DESTRUCTION_DATA,
				 linkEndDestructionData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "destroyAt_pin",
				 LINK_END_DESTRUCTION_DATA__DESTROY_AT_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyObjectAction(DestroyObjectAction destroyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(destroyObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDestroyObjectAction_multiplicity(destroyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateDestroyObjectAction_no_type(destroyObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESTROY_OBJECT_ACTION__MULTIPLICITY__EEXPRESSION = "target.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyObjectAction_multiplicity(DestroyObjectAction destroyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.DESTROY_OBJECT_ACTION,
				 destroyObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 DESTROY_OBJECT_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_type constraint of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DESTROY_OBJECT_ACTION__NO_TYPE__EEXPRESSION = "target.type= null";

	/**
	 * Validates the no_type constraint of '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestroyObjectAction_no_type(DestroyObjectAction destroyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.DESTROY_OBJECT_ACTION,
				 destroyObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_type",
				 DESTROY_OBJECT_ACTION__NO_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionNode(ExpansionNode expansionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expansionNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_input_output_parameter(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_selection_behavior(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_object_flow_edges(expansionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateExpansionNode_region_as_input_or_output(expansionNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the region_as_input_or_output constraint of '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXPANSION_NODE__REGION_AS_INPUT_OR_OUTPUT__EEXPRESSION = "regionAsInput->notEmpty() xor regionAsOutput->notEmpty()";

	/**
	 * Validates the region_as_input_or_output constraint of '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionNode_region_as_input_or_output(ExpansionNode expansionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.EXPANSION_NODE,
				 expansionNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "region_as_input_or_output",
				 EXPANSION_NODE__REGION_AS_INPUT_OR_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionRegion(ExpansionRegion expansionRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expansionRegion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_nodes_and_edges(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_not_contained(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_output_pin_edges(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(expansionRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_input_pin_edges(expansionRegion, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loopNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_nodes_and_edges(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_not_contained(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_output_pin_edges(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_input_pin_edges(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_result_no_incoming(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_input_edges(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_executable_nodes(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_body_output_pins(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_setup_test_and_body(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_matching_output_pins(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_matching_loop_variables(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_matching_result_pins(loopNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLoopNode_loop_variable_outgoing(loopNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the result_no_incoming constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP_NODE__RESULT_NO_INCOMING__EEXPRESSION = "result.incoming->isEmpty()";

	/**
	 * Validates the result_no_incoming constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_result_no_incoming(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LOOP_NODE,
				 loopNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "result_no_incoming",
				 LOOP_NODE__RESULT_NO_INCOMING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the input_edges constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP_NODE__INPUT_EDGES__EEXPRESSION = "loopVariableInput.outgoing->isEmpty()";

	/**
	 * Validates the input_edges constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_input_edges(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LOOP_NODE,
				 loopNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "input_edges",
				 LOOP_NODE__INPUT_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the executable_nodes constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP_NODE__EXECUTABLE_NODES__EEXPRESSION = "setupPart->union(test)->union(bodyPart)=node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->asSet()";

	/**
	 * Validates the executable_nodes constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_executable_nodes(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LOOP_NODE,
				 loopNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "executable_nodes",
				 LOOP_NODE__EXECUTABLE_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the body_output_pins constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP_NODE__BODY_OUTPUT_PINS__EEXPRESSION = "bodyPart.oclAsType(Action).allActions().output->includesAll(bodyOutput)";

	/**
	 * Validates the body_output_pins constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_body_output_pins(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LOOP_NODE,
				 loopNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "body_output_pins",
				 LOOP_NODE__BODY_OUTPUT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the setup_test_and_body constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP_NODE__SETUP_TEST_AND_BODY__EEXPRESSION = "setupPart->intersection(test)->isEmpty() and\r\n" +
		"setupPart->intersection(bodyPart)->isEmpty() and\r\n" +
		"test->intersection(bodyPart)->isEmpty()";

	/**
	 * Validates the setup_test_and_body constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_setup_test_and_body(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LOOP_NODE,
				 loopNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "setup_test_and_body",
				 LOOP_NODE__SETUP_TEST_AND_BODY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the matching_output_pins constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP_NODE__MATCHING_OUTPUT_PINS__EEXPRESSION = "bodyOutput->size()=loopVariable->size() and\r\n" +
		"Sequence{1..loopVariable->size()}->forAll(i |\r\n" +
		"\tbodyOutput->at(i).type.conformsTo(loopVariable->at(i).type) and\r\n" +
		"\tbodyOutput->at(i).isOrdered = loopVariable->at(i).isOrdered and\r\n" +
		"\tbodyOutput->at(i).isUnique = loopVariable->at(i).isUnique and\r\n" +
		"\tloopVariable->at(i).includesMultiplicity(bodyOutput->at(i)))";

	/**
	 * Validates the matching_output_pins constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_matching_output_pins(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LOOP_NODE,
				 loopNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "matching_output_pins",
				 LOOP_NODE__MATCHING_OUTPUT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the matching_loop_variables constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP_NODE__MATCHING_LOOP_VARIABLES__EEXPRESSION = "loopVariableInput->size()=loopVariable->size() and\r\n" +
		"loopVariableInput.type=loopVariable.type and\r\n" +
		"loopVariableInput.isUnique=loopVariable.isUnique and\r\n" +
		"loopVariableInput.lower=loopVariable.lower and\r\n" +
		"loopVariableInput.upper=loopVariable.upper";

	/**
	 * Validates the matching_loop_variables constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_matching_loop_variables(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LOOP_NODE,
				 loopNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "matching_loop_variables",
				 LOOP_NODE__MATCHING_LOOP_VARIABLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the matching_result_pins constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP_NODE__MATCHING_RESULT_PINS__EEXPRESSION = "result->size()=loopVariable->size() and\r\n" +
		"result.type=loopVariable.type and\r\n" +
		"result.isUnique=loopVariable.isUnique and\r\n" +
		"result.lower=loopVariable.lower and\r\n" +
		"result.upper=loopVariable.upper";

	/**
	 * Validates the matching_result_pins constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_matching_result_pins(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LOOP_NODE,
				 loopNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "matching_result_pins",
				 LOOP_NODE__MATCHING_RESULT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the loop_variable_outgoing constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOOP_NODE__LOOP_VARIABLE_OUTGOING__EEXPRESSION = "allOwnedNodes()->includesAll(loopVariable.outgoing.target)";

	/**
	 * Validates the loop_variable_outgoing constraint of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopNode_loop_variable_outgoing(LoopNode loopNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.LOOP_NODE,
				 loopNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "loop_variable_outgoing",
				 LOOP_NODE__LOOP_VARIABLE_OUTGOING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueAction(OpaqueAction opaqueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(opaqueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(opaqueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpaqueAction_language_body_size(opaqueAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the language_body_size constraint of '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPAQUE_ACTION__LANGUAGE_BODY_SIZE__EEXPRESSION = "language->notEmpty() implies (_'body'->size() = language->size())";

	/**
	 * Validates the language_body_size constraint of '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueAction_language_body_size(OpaqueAction opaqueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.OPAQUE_ACTION,
				 opaqueAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "language_body_size",
				 OPAQUE_ACTION__LANGUAGE_BODY_SIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaiseExceptionAction(RaiseExceptionAction raiseExceptionAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(raiseExceptionAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(raiseExceptionAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(raiseExceptionAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadExtentAction(ReadExtentAction readExtentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readExtentAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadExtentAction_type_is_classifier(readExtentAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadExtentAction_multiplicity_of_result(readExtentAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the type_is_classifier constraint of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_EXTENT_ACTION__TYPE_IS_CLASSIFIER__EEXPRESSION = "result.type = classifier";

	/**
	 * Validates the type_is_classifier constraint of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadExtentAction_type_is_classifier(ReadExtentAction readExtentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_EXTENT_ACTION,
				 readExtentAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_is_classifier",
				 READ_EXTENT_ACTION__TYPE_IS_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_result constraint of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_EXTENT_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION = "result.is(0,*)";

	/**
	 * Validates the multiplicity_of_result constraint of '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadExtentAction_multiplicity_of_result(ReadExtentAction readExtentAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_EXTENT_ACTION,
				 readExtentAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_result",
				 READ_EXTENT_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readIsClassifiedObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadIsClassifiedObjectAction_no_type(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadIsClassifiedObjectAction_multiplicity_of_output(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadIsClassifiedObjectAction_boolean_result(readIsClassifiedObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadIsClassifiedObjectAction_multiplicity_of_input(readIsClassifiedObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_type constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_IS_CLASSIFIED_OBJECT_ACTION__NO_TYPE__EEXPRESSION = "object.type = null";

	/**
	 * Validates the no_type constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction_no_type(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_IS_CLASSIFIED_OBJECT_ACTION,
				 readIsClassifiedObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_type",
				 READ_IS_CLASSIFIED_OBJECT_ACTION__NO_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_output constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_IS_CLASSIFIED_OBJECT_ACTION__MULTIPLICITY_OF_OUTPUT__EEXPRESSION = "result.is(1,1)";

	/**
	 * Validates the multiplicity_of_output constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction_multiplicity_of_output(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_IS_CLASSIFIED_OBJECT_ACTION,
				 readIsClassifiedObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_output",
				 READ_IS_CLASSIFIED_OBJECT_ACTION__MULTIPLICITY_OF_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the boolean_result constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_IS_CLASSIFIED_OBJECT_ACTION__BOOLEAN_RESULT__EEXPRESSION = "result.type = Boolean";

	/**
	 * Validates the boolean_result constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction_boolean_result(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_IS_CLASSIFIED_OBJECT_ACTION,
				 readIsClassifiedObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "boolean_result",
				 READ_IS_CLASSIFIED_OBJECT_ACTION__BOOLEAN_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_input constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_IS_CLASSIFIED_OBJECT_ACTION__MULTIPLICITY_OF_INPUT__EEXPRESSION = "object.is(1,1)";

	/**
	 * Validates the multiplicity_of_input constraint of '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadIsClassifiedObjectAction_multiplicity_of_input(ReadIsClassifiedObjectAction readIsClassifiedObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_IS_CLASSIFIED_OBJECT_ACTION,
				 readIsClassifiedObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_input",
				 READ_IS_CLASSIFIED_OBJECT_ACTION__MULTIPLICITY_OF_INPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readLinkAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_pins(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_same_association(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkAction_not_static(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_type_and_ordering(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_compatible_multiplicity(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_visibility(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_one_open_end(readLinkAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkAction_navigable_open_end(readLinkAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the type_and_ordering constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_ACTION__TYPE_AND_ORDERING__EEXPRESSION = "self.openEnd()->forAll(type=result.type and isOrdered=result.isOrdered)\n" +
		"";

	/**
	 * Validates the type_and_ordering constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_type_and_ordering(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_ACTION,
				 readLinkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_and_ordering",
				 READ_LINK_ACTION__TYPE_AND_ORDERING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the compatible_multiplicity constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_ACTION__COMPATIBLE_MULTIPLICITY__EEXPRESSION = "self.openEnd()->first().compatibleWith(result)\n" +
		"";

	/**
	 * Validates the compatible_multiplicity constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_compatible_multiplicity(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_ACTION,
				 readLinkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "compatible_multiplicity",
				 READ_LINK_ACTION__COMPATIBLE_MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the visibility constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_ACTION__VISIBILITY__EEXPRESSION = "let openEnd : Property = self.openEnd()->first() in\n" +
		"  openEnd.visibility = VisibilityKind::public or \n" +
		"  endData->exists(oed | \n" +
		"    oed.end<>openEnd and \n" +
		"    (_'context' = oed.end.type or \n" +
		"      (openEnd.visibility = VisibilityKind::protected and \n" +
		"        _'context'.conformsTo(oed.end.type.oclAsType(Classifier)))))\n" +
		"";

	/**
	 * Validates the visibility constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_visibility(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_ACTION,
				 readLinkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "visibility",
				 READ_LINK_ACTION__VISIBILITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the one_open_end constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_ACTION__ONE_OPEN_END__EEXPRESSION = "self.openEnd()->size() = 1";

	/**
	 * Validates the one_open_end constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_one_open_end(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_ACTION,
				 readLinkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_open_end",
				 READ_LINK_ACTION__ONE_OPEN_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the navigable_open_end constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_ACTION__NAVIGABLE_OPEN_END__EEXPRESSION = "self.openEnd()->first().isNavigable()\n" +
		"";

	/**
	 * Validates the navigable_open_end constraint of '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkAction_navigable_open_end(ReadLinkAction readLinkAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_ACTION,
				 readLinkAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "navigable_open_end",
				 READ_LINK_ACTION__NAVIGABLE_OPEN_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readLinkObjectEndAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_property(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_multiplicity_of_object(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_ends_of_association(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_type_of_result(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_multiplicity_of_result(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_type_of_object(readLinkObjectEndAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndAction_association_of_association(readLinkObjectEndAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the property constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_ACTION__PROPERTY__EEXPRESSION = "end.association <> null";

	/**
	 * Validates the property constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_property(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_ACTION,
				 readLinkObjectEndAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "property",
				 READ_LINK_OBJECT_END_ACTION__PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_object constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_ACTION__MULTIPLICITY_OF_OBJECT__EEXPRESSION = "object.is(1,1)";

	/**
	 * Validates the multiplicity_of_object constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_multiplicity_of_object(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_ACTION,
				 readLinkObjectEndAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_object",
				 READ_LINK_OBJECT_END_ACTION__MULTIPLICITY_OF_OBJECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ends_of_association constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_ACTION__ENDS_OF_ASSOCIATION__EEXPRESSION = "end.association.memberEnd->forAll(e | not e.isStatic)";

	/**
	 * Validates the ends_of_association constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_ends_of_association(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_ACTION,
				 readLinkObjectEndAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ends_of_association",
				 READ_LINK_OBJECT_END_ACTION__ENDS_OF_ASSOCIATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_of_result constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_ACTION__TYPE_OF_RESULT__EEXPRESSION = "result.type = end.type";

	/**
	 * Validates the type_of_result constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_type_of_result(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_ACTION,
				 readLinkObjectEndAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_result",
				 READ_LINK_OBJECT_END_ACTION__TYPE_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_result constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION = "result.is(1,1)";

	/**
	 * Validates the multiplicity_of_result constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_multiplicity_of_result(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_ACTION,
				 readLinkObjectEndAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_result",
				 READ_LINK_OBJECT_END_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_of_object constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_ACTION__TYPE_OF_OBJECT__EEXPRESSION = "object.type = end.association";

	/**
	 * Validates the type_of_object constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_type_of_object(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_ACTION,
				 readLinkObjectEndAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_object",
				 READ_LINK_OBJECT_END_ACTION__TYPE_OF_OBJECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the association_of_association constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_ACTION__ASSOCIATION_OF_ASSOCIATION__EEXPRESSION = "end.association.oclIsKindOf(AssociationClass)";

	/**
	 * Validates the association_of_association constraint of '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndAction_association_of_association(ReadLinkObjectEndAction readLinkObjectEndAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_ACTION,
				 readLinkObjectEndAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "association_of_association",
				 READ_LINK_OBJECT_END_ACTION__ASSOCIATION_OF_ASSOCIATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readLinkObjectEndQualifierAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_multiplicity_of_object(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_type_of_object(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_multiplicity_of_qualifier(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_ends_of_association(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_multiplicity_of_result(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_same_type(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_association_of_association(readLinkObjectEndQualifierAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadLinkObjectEndQualifierAction_qualifier_attribute(readLinkObjectEndQualifierAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity_of_object constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_OBJECT__EEXPRESSION = "object.is(1,1)";

	/**
	 * Validates the multiplicity_of_object constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_multiplicity_of_object(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_QUALIFIER_ACTION,
				 readLinkObjectEndQualifierAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_object",
				 READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_OBJECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_of_object constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_QUALIFIER_ACTION__TYPE_OF_OBJECT__EEXPRESSION = "object.type = qualifier.associationEnd.association";

	/**
	 * Validates the type_of_object constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_type_of_object(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_QUALIFIER_ACTION,
				 readLinkObjectEndQualifierAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_object",
				 READ_LINK_OBJECT_END_QUALIFIER_ACTION__TYPE_OF_OBJECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_qualifier constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_QUALIFIER__EEXPRESSION = "qualifier.is(1,1)";

	/**
	 * Validates the multiplicity_of_qualifier constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_multiplicity_of_qualifier(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_QUALIFIER_ACTION,
				 readLinkObjectEndQualifierAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_qualifier",
				 READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_QUALIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ends_of_association constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_QUALIFIER_ACTION__ENDS_OF_ASSOCIATION__EEXPRESSION = "qualifier.associationEnd.association.memberEnd->forAll(e | not e.isStatic)";

	/**
	 * Validates the ends_of_association constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_ends_of_association(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_QUALIFIER_ACTION,
				 readLinkObjectEndQualifierAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ends_of_association",
				 READ_LINK_OBJECT_END_QUALIFIER_ACTION__ENDS_OF_ASSOCIATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_result constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION = "result.is(1,1)";

	/**
	 * Validates the multiplicity_of_result constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_multiplicity_of_result(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_QUALIFIER_ACTION,
				 readLinkObjectEndQualifierAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_result",
				 READ_LINK_OBJECT_END_QUALIFIER_ACTION__MULTIPLICITY_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the same_type constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_QUALIFIER_ACTION__SAME_TYPE__EEXPRESSION = "result.type = qualifier.type";

	/**
	 * Validates the same_type constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_same_type(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_QUALIFIER_ACTION,
				 readLinkObjectEndQualifierAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_type",
				 READ_LINK_OBJECT_END_QUALIFIER_ACTION__SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the association_of_association constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_QUALIFIER_ACTION__ASSOCIATION_OF_ASSOCIATION__EEXPRESSION = "qualifier.associationEnd.association.oclIsKindOf(AssociationClass)";

	/**
	 * Validates the association_of_association constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_association_of_association(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_QUALIFIER_ACTION,
				 readLinkObjectEndQualifierAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "association_of_association",
				 READ_LINK_OBJECT_END_QUALIFIER_ACTION__ASSOCIATION_OF_ASSOCIATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the qualifier_attribute constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER_ATTRIBUTE__EEXPRESSION = "qualifier.associationEnd <> null";

	/**
	 * Validates the qualifier_attribute constraint of '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadLinkObjectEndQualifierAction_qualifier_attribute(ReadLinkObjectEndQualifierAction readLinkObjectEndQualifierAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_LINK_OBJECT_END_QUALIFIER_ACTION,
				 readLinkObjectEndQualifierAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "qualifier_attribute",
				 READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER_ATTRIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readSelfAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadSelfAction_contained(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadSelfAction_multiplicity(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadSelfAction_not_static(readSelfAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadSelfAction_type(readSelfAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the contained constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_SELF_ACTION__CONTAINED__EEXPRESSION = "_'context' <> null";

	/**
	 * Validates the contained constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction_contained(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_SELF_ACTION,
				 readSelfAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "contained",
				 READ_SELF_ACTION__CONTAINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_SELF_ACTION__MULTIPLICITY__EEXPRESSION = "result.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction_multiplicity(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_SELF_ACTION,
				 readSelfAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 READ_SELF_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the not_static constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_SELF_ACTION__NOT_STATIC__EEXPRESSION = "let behavior: Behavior = self.containingBehavior() in\r\n" +
		"behavior.specification<>null implies not behavior.specification.isStatic";

	/**
	 * Validates the not_static constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction_not_static(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_SELF_ACTION,
				 readSelfAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_static",
				 READ_SELF_ACTION__NOT_STATIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_SELF_ACTION__TYPE__EEXPRESSION = "result.type = _'context'";

	/**
	 * Validates the type constraint of '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadSelfAction_type(ReadSelfAction readSelfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_SELF_ACTION,
				 readSelfAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type",
				 READ_SELF_ACTION__TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadStructuralFeatureAction(ReadStructuralFeatureAction readStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readStructuralFeatureAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadStructuralFeatureAction_multiplicity(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_object_type(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_not_static(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_one_featuring_classifier(readStructuralFeatureAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadStructuralFeatureAction_type_and_ordering(readStructuralFeatureAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_STRUCTURAL_FEATURE_ACTION__MULTIPLICITY__EEXPRESSION = "structuralFeature.compatibleWith(result)";

	/**
	 * Validates the multiplicity constraint of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadStructuralFeatureAction_multiplicity(ReadStructuralFeatureAction readStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
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
						 new Object[] { "multiplicity", getObjectLabel(readStructuralFeatureAction, context) },
						 new Object[] { readStructuralFeatureAction },
						 context));
			}
			return false;
		}
		return validateStructuralFeatureAction_multiplicity(readStructuralFeatureAction, diagnostics, context);
	}

	/**
	 * The cached validation expression for the type_and_ordering constraint of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_STRUCTURAL_FEATURE_ACTION__TYPE_AND_ORDERING__EEXPRESSION = "result.type =structuralFeature.type and \n" +
		"result.isOrdered = structuralFeature.isOrdered\n" +
		"";

	/**
	 * Validates the type_and_ordering constraint of '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadStructuralFeatureAction_type_and_ordering(ReadStructuralFeatureAction readStructuralFeatureAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_STRUCTURAL_FEATURE_ACTION,
				 readStructuralFeatureAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_and_ordering",
				 READ_STRUCTURAL_FEATURE_ACTION__TYPE_AND_ORDERING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadVariableAction(ReadVariableAction readVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readVariableAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scope_of_variable(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadVariableAction_type_and_ordering(readVariableAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadVariableAction_compatible_multiplicity(readVariableAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the type_and_ordering constraint of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_VARIABLE_ACTION__TYPE_AND_ORDERING__EEXPRESSION = "result.type =variable.type and \n" +
		"result.isOrdered = variable.isOrdered\n" +
		"";

	/**
	 * Validates the type_and_ordering constraint of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadVariableAction_type_and_ordering(ReadVariableAction readVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_VARIABLE_ACTION,
				 readVariableAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_and_ordering",
				 READ_VARIABLE_ACTION__TYPE_AND_ORDERING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the compatible_multiplicity constraint of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String READ_VARIABLE_ACTION__COMPATIBLE_MULTIPLICITY__EEXPRESSION = "variable.compatibleWith(result)";

	/**
	 * Validates the compatible_multiplicity constraint of '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadVariableAction_compatible_multiplicity(ReadVariableAction readVariableAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.READ_VARIABLE_ACTION,
				 readVariableAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "compatible_multiplicity",
				 READ_VARIABLE_ACTION__COMPATIBLE_MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReclassifyObjectAction(ReclassifyObjectAction reclassifyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reclassifyObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReclassifyObjectAction_input_pin(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReclassifyObjectAction_classifier_not_abstract(reclassifyObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReclassifyObjectAction_multiplicity(reclassifyObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the input_pin constraint of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECLASSIFY_OBJECT_ACTION__INPUT_PIN__EEXPRESSION = "object.type = null";

	/**
	 * Validates the input_pin constraint of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReclassifyObjectAction_input_pin(ReclassifyObjectAction reclassifyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.RECLASSIFY_OBJECT_ACTION,
				 reclassifyObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "input_pin",
				 RECLASSIFY_OBJECT_ACTION__INPUT_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the classifier_not_abstract constraint of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECLASSIFY_OBJECT_ACTION__CLASSIFIER_NOT_ABSTRACT__EEXPRESSION = "not newClassifier->exists(isAbstract)";

	/**
	 * Validates the classifier_not_abstract constraint of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReclassifyObjectAction_classifier_not_abstract(ReclassifyObjectAction reclassifyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.RECLASSIFY_OBJECT_ACTION,
				 reclassifyObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "classifier_not_abstract",
				 RECLASSIFY_OBJECT_ACTION__CLASSIFIER_NOT_ABSTRACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECLASSIFY_OBJECT_ACTION__MULTIPLICITY__EEXPRESSION = "object.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReclassifyObjectAction_multiplicity(ReclassifyObjectAction reclassifyObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.RECLASSIFY_OBJECT_ACTION,
				 reclassifyObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 RECLASSIFY_OBJECT_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduceAction(ReduceAction reduceAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reduceAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReduceAction_reducer_inputs_output(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReduceAction_input_type_is_collection(reduceAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReduceAction_output_types_are_compatible(reduceAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the reducer_inputs_output constraint of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REDUCE_ACTION__REDUCER_INPUTS_OUTPUT__EEXPRESSION = "let inputs: OrderedSet(Parameter) = reducer.inputParameters() in\r\n" +
		"let outputs: OrderedSet(Parameter) = reducer.outputParameters() in\r\n" +
		"inputs->size()=2 and outputs->size()=1 and\r\n" +
		"inputs.type->forAll(t | \r\n" +
		"\toutputs.type->forAll(conformsTo(t)) and \r\n" +
		"\t-- Note that the following only checks the case when the collection is via multiple tokens.\r\n" +
		"\tcollection.upperBound()>1 implies collection.type.conformsTo(t))";

	/**
	 * Validates the reducer_inputs_output constraint of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduceAction_reducer_inputs_output(ReduceAction reduceAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.REDUCE_ACTION,
				 reduceAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "reducer_inputs_output",
				 REDUCE_ACTION__REDUCER_INPUTS_OUTPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the input_type_is_collection constraint of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduceAction_input_type_is_collection(ReduceAction reduceAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "input_type_is_collection", getObjectLabel(reduceAction, context) },
						 new Object[] { reduceAction },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the output_types_are_compatible constraint of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REDUCE_ACTION__OUTPUT_TYPES_ARE_COMPATIBLE__EEXPRESSION = "reducer.outputParameters().type->forAll(conformsTo(result.type))";

	/**
	 * Validates the output_types_are_compatible constraint of '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReduceAction_output_types_are_compatible(ReduceAction reduceAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.REDUCE_ACTION,
				 reduceAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "output_types_are_compatible",
				 REDUCE_ACTION__OUTPUT_TYPES_ARE_COMPATIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(removeStructuralFeatureValueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_multiplicity(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_object_type(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_visibility(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_not_static(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuralFeatureAction_one_featuring_classifier(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_multiplicity_of_result(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_type_of_value(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_multiplicity_of_value(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteStructuralFeatureAction_type_of_result(removeStructuralFeatureValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRemoveStructuralFeatureValueAction_removeAt_and_value(removeStructuralFeatureValueAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the removeAt_and_value constraint of '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT_AND_VALUE__EEXPRESSION = "if structuralFeature.isOrdered and not structuralFeature.isUnique and  not isRemoveDuplicates then\r\n" +
		"  value = null and\r\n" +
		"  removeAt <> null and\r\n" +
		"  removeAt.type = UnlimitedNatural and\r\n" +
		"  removeAt.is(1,1)\r\n" +
		"else\r\n" +
		"  removeAt = null and value <> null\r\n" +
		"endif";

	/**
	 * Validates the removeAt_and_value constraint of '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveStructuralFeatureValueAction_removeAt_and_value(RemoveStructuralFeatureValueAction removeStructuralFeatureValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION,
				 removeStructuralFeatureValueAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "removeAt_and_value",
				 REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT_AND_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveVariableValueAction(RemoveVariableValueAction removeVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(removeVariableValueAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableAction_scope_of_variable(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_value_type(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateWriteVariableAction_multiplicity(removeVariableValueAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateRemoveVariableValueAction_removeAt_and_value(removeVariableValueAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the removeAt_and_value constraint of '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT_AND_VALUE__EEXPRESSION = "if  variable.isOrdered and not variable.isUnique and not isRemoveDuplicates then \r\n" +
		"  value = null and\r\n" +
		"  removeAt <> null and\r\n" +
		"  removeAt.type = UnlimitedNatural and\r\n" +
		"  removeAt.is(1,1)\r\n" +
		"else\r\n" +
		"  removeAt = null and value <> null\r\n" +
		"endif";

	/**
	 * Validates the removeAt_and_value constraint of '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveVariableValueAction_removeAt_and_value(RemoveVariableValueAction removeVariableValueAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.REMOVE_VARIABLE_VALUE_ACTION,
				 removeVariableValueAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "removeAt_and_value",
				 REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT_AND_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyAction(ReplyAction replyAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(replyAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReplyAction_pins_match_parameter(replyAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateReplyAction_event_on_reply_to_call_trigger(replyAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the pins_match_parameter constraint of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPLY_ACTION__PINS_MATCH_PARAMETER__EEXPRESSION = "let parameter:OrderedSet(Parameter) = replyToCall.event.oclAsType(CallEvent).operation.outputParameters() in\r\n" +
		"replyValue->size()=parameter->size() and\r\n" +
		"Sequence{1..replyValue->size()}->forAll(i |\r\n" +
		"\treplyValue->at(i).type.conformsTo(parameter->at(i).type) and\r\n" +
		"\treplyValue->at(i).isOrdered=parameter->at(i).isOrdered and\r\n" +
		"\treplyValue->at(i).compatibleWith(parameter->at(i)))";

	/**
	 * Validates the pins_match_parameter constraint of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyAction_pins_match_parameter(ReplyAction replyAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.REPLY_ACTION,
				 replyAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "pins_match_parameter",
				 REPLY_ACTION__PINS_MATCH_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the event_on_reply_to_call_trigger constraint of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPLY_ACTION__EVENT_ON_REPLY_TO_CALL_TRIGGER__EEXPRESSION = "replyToCall.event.oclIsKindOf(CallEvent)";

	/**
	 * Validates the event_on_reply_to_call_trigger constraint of '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyAction_event_on_reply_to_call_trigger(ReplyAction replyAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.REPLY_ACTION,
				 replyAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "event_on_reply_to_call_trigger",
				 REPLY_ACTION__EVENT_ON_REPLY_TO_CALL_TRIGGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendObjectAction(SendObjectAction sendObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendObjectAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(sendObjectAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendObjectAction_type_target_pin(sendObjectAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the type_target_pin constraint of '<em>Send Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEND_OBJECT_ACTION__TYPE_TARGET_PIN__EEXPRESSION = "onPort<>null implies target.type.oclAsType(Classifier).allFeatures()->includes(onPort)";

	/**
	 * Validates the type_target_pin constraint of '<em>Send Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendObjectAction_type_target_pin(SendObjectAction sendObjectAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.SEND_OBJECT_ACTION,
				 sendObjectAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_target_pin",
				 SEND_OBJECT_ACTION__TYPE_TARGET_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction(SendSignalAction sendSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendSignalAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendSignalAction_type_ordering_multiplicity(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendSignalAction_number_order(sendSignalAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendSignalAction_type_target_pin(sendSignalAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the type_ordering_multiplicity constraint of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEND_SIGNAL_ACTION__TYPE_ORDERING_MULTIPLICITY__EEXPRESSION = "let attribute: OrderedSet(Property) = signal.allAttributes() in\r\n" +
		"Sequence{1..argument->size()}->forAll(i | \r\n" +
		"\targument->at(i).type.conformsTo(attribute->at(i).type) and \r\n" +
		"\targument->at(i).isOrdered = attribute->at(i).isOrdered and\r\n" +
		"\targument->at(i).compatibleWith(attribute->at(i)))";

	/**
	 * Validates the type_ordering_multiplicity constraint of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction_type_ordering_multiplicity(SendSignalAction sendSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.SEND_SIGNAL_ACTION,
				 sendSignalAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_ordering_multiplicity",
				 SEND_SIGNAL_ACTION__TYPE_ORDERING_MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the number_order constraint of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEND_SIGNAL_ACTION__NUMBER_ORDER__EEXPRESSION = "argument->size()=signal.allAttributes()->size()";

	/**
	 * Validates the number_order constraint of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction_number_order(SendSignalAction sendSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.SEND_SIGNAL_ACTION,
				 sendSignalAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "number_order",
				 SEND_SIGNAL_ACTION__NUMBER_ORDER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_target_pin constraint of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEND_SIGNAL_ACTION__TYPE_TARGET_PIN__EEXPRESSION = "not onPort->isEmpty() implies target.type.oclAsType(Classifier).allFeatures()->includes(onPort)\r\n" +
		"";

	/**
	 * Validates the type_target_pin constraint of '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendSignalAction_type_target_pin(SendSignalAction sendSignalAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.SEND_SIGNAL_ACTION,
				 sendSignalAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_target_pin",
				 SEND_SIGNAL_ACTION__TYPE_TARGET_PIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceNode(SequenceNode sequenceNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequenceNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_nodes_and_edges(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_not_contained(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_output_pin_edges(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(sequenceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_input_pin_edges(sequenceNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartClassifierBehaviorAction(StartClassifierBehaviorAction startClassifierBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startClassifierBehaviorAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartClassifierBehaviorAction_multiplicity(startClassifierBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartClassifierBehaviorAction_type_has_classifier(startClassifierBehaviorAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START_CLASSIFIER_BEHAVIOR_ACTION__MULTIPLICITY__EEXPRESSION = "object.is(1,1)";

	/**
	 * Validates the multiplicity constraint of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartClassifierBehaviorAction_multiplicity(StartClassifierBehaviorAction startClassifierBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.START_CLASSIFIER_BEHAVIOR_ACTION,
				 startClassifierBehaviorAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 START_CLASSIFIER_BEHAVIOR_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_has_classifier constraint of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START_CLASSIFIER_BEHAVIOR_ACTION__TYPE_HAS_CLASSIFIER__EEXPRESSION = "object.type->notEmpty() implies \r\n" +
		"   (object.type.oclIsKindOf(BehavioredClassifier) and object.type.oclAsType(BehavioredClassifier).classifierBehavior<>null)";

	/**
	 * Validates the type_has_classifier constraint of '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartClassifierBehaviorAction_type_has_classifier(StartClassifierBehaviorAction startClassifierBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.START_CLASSIFIER_BEHAVIOR_ACTION,
				 startClassifierBehaviorAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_has_classifier",
				 START_CLASSIFIER_BEHAVIOR_ACTION__TYPE_HAS_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startObjectBehaviorAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_argument_pins(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_result_pins(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallAction_synchronous_call(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartObjectBehaviorAction_multiplicity_of_object(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartObjectBehaviorAction_type_of_object(startObjectBehaviorAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartObjectBehaviorAction_no_onport(startObjectBehaviorAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity_of_object constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START_OBJECT_BEHAVIOR_ACTION__MULTIPLICITY_OF_OBJECT__EEXPRESSION = "object.is(1,1)";

	/**
	 * Validates the multiplicity_of_object constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction_multiplicity_of_object(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.START_OBJECT_BEHAVIOR_ACTION,
				 startObjectBehaviorAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_object",
				 START_OBJECT_BEHAVIOR_ACTION__MULTIPLICITY_OF_OBJECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_of_object constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START_OBJECT_BEHAVIOR_ACTION__TYPE_OF_OBJECT__EEXPRESSION = "self.behavior()<>null";

	/**
	 * Validates the type_of_object constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction_type_of_object(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.START_OBJECT_BEHAVIOR_ACTION,
				 startObjectBehaviorAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_object",
				 START_OBJECT_BEHAVIOR_ACTION__TYPE_OF_OBJECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_onport constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START_OBJECT_BEHAVIOR_ACTION__NO_ONPORT__EEXPRESSION = "onPort->isEmpty()";

	/**
	 * Validates the no_onport constraint of '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartObjectBehaviorAction_no_onport(StartObjectBehaviorAction startObjectBehaviorAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.START_OBJECT_BEHAVIOR_ACTION,
				 startObjectBehaviorAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_onport",
				 START_OBJECT_BEHAVIOR_ACTION__NO_ONPORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestIdentityAction(TestIdentityAction testIdentityAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(testIdentityAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestIdentityAction_multiplicity(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestIdentityAction_no_type(testIdentityAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTestIdentityAction_result_is_boolean(testIdentityAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEST_IDENTITY_ACTION__MULTIPLICITY__EEXPRESSION = "first.is(1,1) and second.is(1,1)\n" +
		"";

	/**
	 * Validates the multiplicity constraint of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestIdentityAction_multiplicity(TestIdentityAction testIdentityAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.TEST_IDENTITY_ACTION,
				 testIdentityAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 TEST_IDENTITY_ACTION__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_type constraint of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEST_IDENTITY_ACTION__NO_TYPE__EEXPRESSION = "first.type= null and second.type = null\n" +
		"";

	/**
	 * Validates the no_type constraint of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestIdentityAction_no_type(TestIdentityAction testIdentityAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.TEST_IDENTITY_ACTION,
				 testIdentityAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_type",
				 TEST_IDENTITY_ACTION__NO_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the result_is_boolean constraint of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEST_IDENTITY_ACTION__RESULT_IS_BOOLEAN__EEXPRESSION = "result.type=Boolean";

	/**
	 * Validates the result_is_boolean constraint of '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestIdentityAction_result_is_boolean(TestIdentityAction testIdentityAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.TEST_IDENTITY_ACTION,
				 testIdentityAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "result_is_boolean",
				 TEST_IDENTITY_ACTION__RESULT_IS_BOOLEAN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unmarshallAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_structural_feature(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_number_of_result(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_type_ordering_and_multiplicity(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_multiplicity_of_object(unmarshallAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnmarshallAction_object_type(unmarshallAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the structural_feature constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNMARSHALL_ACTION__STRUCTURAL_FEATURE__EEXPRESSION = "unmarshallType.allAttributes()->size() >= 1";

	/**
	 * Validates the structural_feature constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_structural_feature(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.UNMARSHALL_ACTION,
				 unmarshallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "structural_feature",
				 UNMARSHALL_ACTION__STRUCTURAL_FEATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the number_of_result constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNMARSHALL_ACTION__NUMBER_OF_RESULT__EEXPRESSION = "unmarshallType.allAttributes()->size() = result->size()";

	/**
	 * Validates the number_of_result constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_number_of_result(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.UNMARSHALL_ACTION,
				 unmarshallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "number_of_result",
				 UNMARSHALL_ACTION__NUMBER_OF_RESULT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_ordering_and_multiplicity constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNMARSHALL_ACTION__TYPE_ORDERING_AND_MULTIPLICITY__EEXPRESSION = "let attribute:OrderedSet(Property) = unmarshallType.allAttributes() in\r\n" +
		"Sequence{1..result->size()}->forAll(i | \r\n" +
		"\tattribute->at(i).type.conformsTo(result->at(i).type) and\r\n" +
		"\tattribute->at(i).isOrdered=result->at(i).isOrdered and\r\n" +
		"\tattribute->at(i).compatibleWith(result->at(i)))";

	/**
	 * Validates the type_ordering_and_multiplicity constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_type_ordering_and_multiplicity(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.UNMARSHALL_ACTION,
				 unmarshallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_ordering_and_multiplicity",
				 UNMARSHALL_ACTION__TYPE_ORDERING_AND_MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_object constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNMARSHALL_ACTION__MULTIPLICITY_OF_OBJECT__EEXPRESSION = "object.is(1,1)";

	/**
	 * Validates the multiplicity_of_object constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_multiplicity_of_object(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.UNMARSHALL_ACTION,
				 unmarshallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_object",
				 UNMARSHALL_ACTION__MULTIPLICITY_OF_OBJECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the object_type constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNMARSHALL_ACTION__OBJECT_TYPE__EEXPRESSION = "object.type.conformsTo(unmarshallType)";

	/**
	 * Validates the object_type constraint of '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnmarshallAction_object_type(UnmarshallAction unmarshallAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.UNMARSHALL_ACTION,
				 unmarshallAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "object_type",
				 UNMARSHALL_ACTION__OBJECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuePin(ValuePin valuePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valuePin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_input_output_parameter(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_selection_behavior(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateObjectNode_object_flow_edges(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_control_pins(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validatePin_not_unique(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputPin_outgoing_edges_structured_only(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateValuePin_no_incoming_edges(valuePin, diagnostics, context);
		if (result || diagnostics != null) result &= validateValuePin_compatible_type(valuePin, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_incoming_edges constraint of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALUE_PIN__NO_INCOMING_EDGES__EEXPRESSION = "incoming->isEmpty()";

	/**
	 * Validates the no_incoming_edges constraint of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuePin_no_incoming_edges(ValuePin valuePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.VALUE_PIN,
				 valuePin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_incoming_edges",
				 VALUE_PIN__NO_INCOMING_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the compatible_type constraint of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VALUE_PIN__COMPATIBLE_TYPE__EEXPRESSION = "value.type.conformsTo(type)";

	/**
	 * Validates the compatible_type constraint of '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuePin_compatible_type(ValuePin valuePin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.VALUE_PIN,
				 valuePin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "compatible_type",
				 VALUE_PIN__COMPATIBLE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuredActivityNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_nodes_and_edges(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= activitiesValidator.validateActivityGroup_not_contained(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_output_pin_edges(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_edges(structuredActivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStructuredActivityNode_input_pin_edges(structuredActivityNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the output_pin_edges constraint of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_ACTIVITY_NODE__OUTPUT_PIN_EDGES__EEXPRESSION = "output.outgoing.target->excludesAll(allOwnedNodes()-input)";

	/**
	 * Validates the output_pin_edges constraint of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode_output_pin_edges(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.STRUCTURED_ACTIVITY_NODE,
				 structuredActivityNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "output_pin_edges",
				 STRUCTURED_ACTIVITY_NODE__OUTPUT_PIN_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the edges constraint of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_ACTIVITY_NODE__EDGES__EEXPRESSION = "edge=self.sourceNodes().outgoing->intersection(self.allOwnedNodes().incoming)->\r\n" +
		"\tunion(self.targetNodes().incoming->intersection(self.allOwnedNodes().outgoing))->asSet()";

	/**
	 * Validates the edges constraint of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode_edges(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.STRUCTURED_ACTIVITY_NODE,
				 structuredActivityNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "edges",
				 STRUCTURED_ACTIVITY_NODE__EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the input_pin_edges constraint of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCTURED_ACTIVITY_NODE__INPUT_PIN_EDGES__EEXPRESSION = "input.incoming.source->excludesAll(allOwnedNodes()-output)";

	/**
	 * Validates the input_pin_edges constraint of '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredActivityNode_input_pin_edges(StructuredActivityNode structuredActivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActionsPackage.Literals.STRUCTURED_ACTIVITY_NODE,
				 structuredActivityNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "input_pin_edges",
				 STRUCTURED_ACTIVITY_NODE__INPUT_PIN_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpansionKind(ExpansionKind expansionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ActionsValidator
