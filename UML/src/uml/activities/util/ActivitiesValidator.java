/**
 */
package uml.activities.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.activities.*;

import uml.classification.util.ClassificationValidator;

import uml.commonBehavior.util.CommonBehaviorValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.simpleClassifiers.util.SimpleClassifiersValidator;

import uml.structuredClassifiers.util.StructuredClassifiersValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.activities.ActivitiesPackage
 * @generated
 */
public class ActivitiesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ActivitiesValidator INSTANCE = new ActivitiesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.activities";

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
	public ActivitiesValidator() {
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
	  return ActivitiesPackage.eINSTANCE;
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
			case ActivitiesPackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case ActivitiesPackage.ACTIVITY_EDGE:
				return validateActivityEdge((ActivityEdge)value, diagnostics, context);
			case ActivitiesPackage.ACTIVITY_GROUP:
				return validateActivityGroup((ActivityGroup)value, diagnostics, context);
			case ActivitiesPackage.ACTIVITY_NODE:
				return validateActivityNode((ActivityNode)value, diagnostics, context);
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION:
				return validateInterruptibleActivityRegion((InterruptibleActivityRegion)value, diagnostics, context);
			case ActivitiesPackage.ACTIVITY_PARTITION:
				return validateActivityPartition((ActivityPartition)value, diagnostics, context);
			case ActivitiesPackage.EXECUTABLE_NODE:
				return validateExecutableNode((ExecutableNode)value, diagnostics, context);
			case ActivitiesPackage.EXCEPTION_HANDLER:
				return validateExceptionHandler((ExceptionHandler)value, diagnostics, context);
			case ActivitiesPackage.OBJECT_NODE:
				return validateObjectNode((ObjectNode)value, diagnostics, context);
			case ActivitiesPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case ActivitiesPackage.ACTIVITY_FINAL_NODE:
				return validateActivityFinalNode((ActivityFinalNode)value, diagnostics, context);
			case ActivitiesPackage.FINAL_NODE:
				return validateFinalNode((FinalNode)value, diagnostics, context);
			case ActivitiesPackage.CONTROL_NODE:
				return validateControlNode((ControlNode)value, diagnostics, context);
			case ActivitiesPackage.ACTIVITY_PARAMETER_NODE:
				return validateActivityParameterNode((ActivityParameterNode)value, diagnostics, context);
			case ActivitiesPackage.CENTRAL_BUFFER_NODE:
				return validateCentralBufferNode((CentralBufferNode)value, diagnostics, context);
			case ActivitiesPackage.CONTROL_FLOW:
				return validateControlFlow((ControlFlow)value, diagnostics, context);
			case ActivitiesPackage.DATA_STORE_NODE:
				return validateDataStoreNode((DataStoreNode)value, diagnostics, context);
			case ActivitiesPackage.DECISION_NODE:
				return validateDecisionNode((DecisionNode)value, diagnostics, context);
			case ActivitiesPackage.OBJECT_FLOW:
				return validateObjectFlow((ObjectFlow)value, diagnostics, context);
			case ActivitiesPackage.FLOW_FINAL_NODE:
				return validateFlowFinalNode((FlowFinalNode)value, diagnostics, context);
			case ActivitiesPackage.FORK_NODE:
				return validateForkNode((ForkNode)value, diagnostics, context);
			case ActivitiesPackage.INITIAL_NODE:
				return validateInitialNode((InitialNode)value, diagnostics, context);
			case ActivitiesPackage.JOIN_NODE:
				return validateJoinNode((JoinNode)value, diagnostics, context);
			case ActivitiesPackage.MERGE_NODE:
				return validateMergeNode((MergeNode)value, diagnostics, context);
			case ActivitiesPackage.OBJECT_NODE_ORDERING_KIND:
				return validateObjectNodeOrderingKind((ObjectNodeOrderingKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(activity, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(activity, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(activity, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(activity, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(activity, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(activity, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(activity, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(activity, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(activity, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_most_one_behavior(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_parameters_match(activity, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_feature_of_context_classifier(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_maximum_one_parameter_node(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_maximum_two_parameter_nodes(activity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the maximum_one_parameter_node constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY__MAXIMUM_ONE_PARAMETER_NODE__EEXPRESSION = "ownedParameter->forAll(p | \r\n" +
		"   p.direction <> ParameterDirectionKind::inout implies node->select(\r\n" +
		"       oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p)->size()= 1)";

	/**
	 * Validates the maximum_one_parameter_node constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_maximum_one_parameter_node(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY,
				 activity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "maximum_one_parameter_node",
				 ACTIVITY__MAXIMUM_ONE_PARAMETER_NODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maximum_two_parameter_nodes constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY__MAXIMUM_TWO_PARAMETER_NODES__EEXPRESSION = "ownedParameter->forAll(p | \r\n" +
		"p.direction = ParameterDirectionKind::inout implies\r\n" +
		"let associatedNodes : Set(ActivityNode) = node->select(\r\n" +
		"       oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p) in \r\n" +
		"  associatedNodes->size()=2 and\r\n" +
		"  associatedNodes->select(incoming->notEmpty())->size()<=1 and\r\n" +
		"  associatedNodes->select(outgoing->notEmpty())->size()<=1\r\n" +
		")\r\n" +
		"";

	/**
	 * Validates the maximum_two_parameter_nodes constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_maximum_two_parameter_nodes(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY,
				 activity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "maximum_two_parameter_nodes",
				 ACTIVITY__MAXIMUM_TWO_PARAMETER_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityEdge(ActivityEdge activityEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityEdge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(activityEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_source_and_target(activityEdge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the source_and_target constraint of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_EDGE__SOURCE_AND_TARGET__EEXPRESSION = "activity<>null implies source.containingActivity() = activity and target.containingActivity() = activity";

	/**
	 * Validates the source_and_target constraint of '<em>Activity Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityEdge_source_and_target(ActivityEdge activityEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_EDGE,
				 activityEdge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "source_and_target",
				 ACTIVITY_EDGE__SOURCE_AND_TARGET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGroup(ActivityGroup activityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodes_and_edges(activityGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_not_contained(activityGroup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nodes_and_edges constraint of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_GROUP__NODES_AND_EDGES__EEXPRESSION = "containedNode->forAll(activity = self.containingActivity()) and \r\n" +
		"containedEdge->forAll(activity = self.containingActivity())";

	/**
	 * Validates the nodes_and_edges constraint of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGroup_nodes_and_edges(ActivityGroup activityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_GROUP,
				 activityGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "nodes_and_edges",
				 ACTIVITY_GROUP__NODES_AND_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the not_contained constraint of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_GROUP__NOT_CONTAINED__EEXPRESSION = "subgroup->closure(subgroup).containedNode->excludesAll(containedNode) and\r\n" +
		"superGroup->closure(superGroup).containedNode->excludesAll(containedNode) and \r\n" +
		"subgroup->closure(subgroup).containedEdge->excludesAll(containedEdge) and \r\n" +
		"superGroup->closure(superGroup).containedEdge->excludesAll(containedEdge)";

	/**
	 * Validates the not_contained constraint of '<em>Activity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityGroup_not_contained(ActivityGroup activityGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_GROUP,
				 activityGroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_contained",
				 ACTIVITY_GROUP__NOT_CONTAINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityNode(ActivityNode activityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(activityNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(activityNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptibleActivityRegion(InterruptibleActivityRegion interruptibleActivityRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interruptibleActivityRegion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodes_and_edges(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_not_contained(interruptibleActivityRegion, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterruptibleActivityRegion_interrupting_edges(interruptibleActivityRegion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the interrupting_edges constraint of '<em>Interruptible Activity Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES__EEXPRESSION = "interruptingEdge->forAll(edge | \r\n" +
		"  node->includes(edge.source) and node->excludes(edge.target) and edge.target.containingActivity() = inActivity)";

	/**
	 * Validates the interrupting_edges constraint of '<em>Interruptible Activity Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptibleActivityRegion_interrupting_edges(InterruptibleActivityRegion interruptibleActivityRegion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.INTERRUPTIBLE_ACTIVITY_REGION,
				 interruptibleActivityRegion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "interrupting_edges",
				 INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityPartition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_nodes_and_edges(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityGroup_not_contained(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityPartition_represents_classifier(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityPartition_represents_property_and_is_contained(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityPartition_represents_property(activityPartition, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityPartition_dimension_not_contained(activityPartition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the represents_classifier constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_PARTITION__REPRESENTS_CLASSIFIER__EEXPRESSION = "(not isExternal and represents.oclIsKindOf(Classifier) and superPartition->notEmpty()) implies\r\n" +
		"(\r\n" +
		"   let representedClassifier : Classifier = represents.oclAsType(Classifier) in\r\n" +
		"     superPartition.represents.oclIsKindOf(Classifier) and\r\n" +
		"      let representedSuperClassifier : Classifier = superPartition.represents.oclAsType(Classifier) in\r\n" +
		"       (representedSuperClassifier.oclIsKindOf(BehavioredClassifier) and representedClassifier.oclIsKindOf(Behavior) and \r\n" +
		"        representedSuperClassifier.oclAsType(BehavioredClassifier).ownedBehavior->includes(representedClassifier.oclAsType(Behavior))) \r\n" +
		"       or\r\n" +
		"       (representedSuperClassifier.oclIsKindOf(Class) and  representedSuperClassifier.oclAsType(Class).nestedClassifier->includes(representedClassifier))\r\n" +
		"       or\r\n" +
		"       (Association.allInstances()->exists(a | a.memberEnd->exists(end1 | end1.isComposite and end1.type = representedClassifier and \r\n" +
		"                                                                      a.memberEnd->exists(end2 | end1<>end2 and end2.type = representedSuperClassifier))))\r\n" +
		")";

	/**
	 * Validates the represents_classifier constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition_represents_classifier(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_PARTITION,
				 activityPartition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "represents_classifier",
				 ACTIVITY_PARTITION__REPRESENTS_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the represents_property_and_is_contained constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_PARTITION__REPRESENTS_PROPERTY_AND_IS_CONTAINED__EEXPRESSION = "(represents.oclIsKindOf(Property) and superPartition->notEmpty()) implies\r\n" +
		"(\r\n" +
		"  (superPartition.represents.oclIsKindOf(Classifier) and represents.owner = superPartition.represents) or \r\n" +
		"  (superPartition.represents.oclIsKindOf(Property) and represents.owner = superPartition.represents.oclAsType(Property).type)\r\n" +
		")";

	/**
	 * Validates the represents_property_and_is_contained constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition_represents_property_and_is_contained(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_PARTITION,
				 activityPartition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "represents_property_and_is_contained",
				 ACTIVITY_PARTITION__REPRESENTS_PROPERTY_AND_IS_CONTAINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the represents_property constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_PARTITION__REPRESENTS_PROPERTY__EEXPRESSION = "(represents.oclIsKindOf(Property) and superPartition->notEmpty() and superPartition.represents.oclIsKindOf(Classifier)) implies\r\n" +
		"(\r\n" +
		"  let representedClassifier : Classifier = superPartition.represents.oclAsType(Classifier)\r\n" +
		"  in\r\n" +
		"    superPartition.subpartition->reject(isExternal)->forAll(p | \r\n" +
		"       p.represents.oclIsKindOf(Property) and p.owner=representedClassifier)\r\n" +
		")";

	/**
	 * Validates the represents_property constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition_represents_property(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_PARTITION,
				 activityPartition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "represents_property",
				 ACTIVITY_PARTITION__REPRESENTS_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the dimension_not_contained constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_PARTITION__DIMENSION_NOT_CONTAINED__EEXPRESSION = "isDimension implies superPartition->isEmpty()";

	/**
	 * Validates the dimension_not_contained constraint of '<em>Activity Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityPartition_dimension_not_contained(ActivityPartition activityPartition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_PARTITION,
				 activityPartition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "dimension_not_contained",
				 ACTIVITY_PARTITION__DIMENSION_NOT_CONTAINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutableNode(ExecutableNode executableNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executableNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(executableNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(executableNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exceptionHandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_handler_body_edges(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_output_pins(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_one_input(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_edge_source_target(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_handler_body_owner(exceptionHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateExceptionHandler_exception_input_type(exceptionHandler, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the handler_body_edges constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXCEPTION_HANDLER__HANDLER_BODY_EDGES__EEXPRESSION = "handlerBody.incoming->isEmpty() and handlerBody.outgoing->isEmpty() and exceptionInput.incoming->isEmpty()";

	/**
	 * Validates the handler_body_edges constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_handler_body_edges(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.EXCEPTION_HANDLER,
				 exceptionHandler,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "handler_body_edges",
				 EXCEPTION_HANDLER__HANDLER_BODY_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the output_pins constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXCEPTION_HANDLER__OUTPUT_PINS__EEXPRESSION = "(protectedNode.oclIsKindOf(Action) and protectedNode.oclAsType(Action).output->notEmpty()) implies\r\n" +
		"(\r\n" +
		"  handlerBody.oclIsKindOf(Action) and \r\n" +
		"  let protectedNodeOutput : OrderedSet(OutputPin) = protectedNode.oclAsType(Action).output,\r\n" +
		"        handlerBodyOutput : OrderedSet(OutputPin) =  handlerBody.oclAsType(Action).output in\r\n" +
		"    protectedNodeOutput->size() = handlerBodyOutput->size() and\r\n" +
		"    Sequence{1..protectedNodeOutput->size()}->forAll(i |\r\n" +
		"    \thandlerBodyOutput->at(i).type.conformsTo(protectedNodeOutput->at(i).type) and\r\n" +
		"    \thandlerBodyOutput->at(i).isOrdered=protectedNodeOutput->at(i).isOrdered and\r\n" +
		"    \thandlerBodyOutput->at(i).compatibleWith(protectedNodeOutput->at(i)))\r\n" +
		")";

	/**
	 * Validates the output_pins constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_output_pins(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.EXCEPTION_HANDLER,
				 exceptionHandler,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "output_pins",
				 EXCEPTION_HANDLER__OUTPUT_PINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the one_input constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXCEPTION_HANDLER__ONE_INPUT__EEXPRESSION = "handlerBody.oclIsKindOf(Action) and\r\n" +
		"let inputs: OrderedSet(InputPin) = handlerBody.oclAsType(Action).input in\r\n" +
		"inputs->size()=1 and inputs->first()=exceptionInput";

	/**
	 * Validates the one_input constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_one_input(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.EXCEPTION_HANDLER,
				 exceptionHandler,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_input",
				 EXCEPTION_HANDLER__ONE_INPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the edge_source_target constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXCEPTION_HANDLER__EDGE_SOURCE_TARGET__EEXPRESSION = "let nodes:Set(ActivityNode) = handlerBody.oclAsType(Action).allOwnedNodes() in\r\n" +
		"nodes.outgoing->forAll(nodes->includes(target)) and\r\n" +
		"nodes.incoming->forAll(nodes->includes(source))";

	/**
	 * Validates the edge_source_target constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_edge_source_target(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.EXCEPTION_HANDLER,
				 exceptionHandler,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "edge_source_target",
				 EXCEPTION_HANDLER__EDGE_SOURCE_TARGET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the handler_body_owner constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXCEPTION_HANDLER__HANDLER_BODY_OWNER__EEXPRESSION = "handlerBody.owner=protectedNode.owner";

	/**
	 * Validates the handler_body_owner constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_handler_body_owner(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.EXCEPTION_HANDLER,
				 exceptionHandler,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "handler_body_owner",
				 EXCEPTION_HANDLER__HANDLER_BODY_OWNER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the exception_input_type constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXCEPTION_HANDLER__EXCEPTION_INPUT_TYPE__EEXPRESSION = "exceptionInput.type=null or \r\n" +
		"exceptionType->forAll(conformsTo(exceptionInput.type.oclAsType(Classifier)))";

	/**
	 * Validates the exception_input_type constraint of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionHandler_exception_input_type(ExceptionHandler exceptionHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.EXCEPTION_HANDLER,
				 exceptionHandler,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "exception_input_type",
				 EXCEPTION_HANDLER__EXCEPTION_INPUT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode(ObjectNode objectNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_input_output_parameter(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selection_behavior(objectNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_object_flow_edges(objectNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the input_output_parameter constraint of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_NODE__INPUT_OUTPUT_PARAMETER__EEXPRESSION = "selection<>null implies\r\n" +
		"\tselection.inputParameters()->size()=1 and\r\n" +
		"\tselection.inputParameters()->forAll(p | not p.isUnique and p.is(0,*) and self.type.conformsTo(p.type)) and\r\n" +
		"\tselection.outputParameters()->size()=1 and\r\n" +
		"\t\tselection.inputParameters()->forAll(p | self.type.conformsTo(p.type))\r\n" +
		"\t";

	/**
	 * Validates the input_output_parameter constraint of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode_input_output_parameter(ObjectNode objectNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.OBJECT_NODE,
				 objectNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "input_output_parameter",
				 OBJECT_NODE__INPUT_OUTPUT_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the selection_behavior constraint of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_NODE__SELECTION_BEHAVIOR__EEXPRESSION = "(selection<>null) = (ordering=ObjectNodeOrderingKind::ordered)";

	/**
	 * Validates the selection_behavior constraint of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode_selection_behavior(ObjectNode objectNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.OBJECT_NODE,
				 objectNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selection_behavior",
				 OBJECT_NODE__SELECTION_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the object_flow_edges constraint of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_NODE__OBJECT_FLOW_EDGES__EEXPRESSION = "(not isControlType) implies incoming->union(outgoing)->forAll(oclIsKindOf(ObjectFlow))";

	/**
	 * Validates the object_flow_edges constraint of '<em>Object Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNode_object_flow_edges(ObjectNode objectNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.OBJECT_NODE,
				 objectNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "object_flow_edges",
				 OBJECT_NODE__OBJECT_FLOW_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(variable, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(variable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityFinalNode(ActivityFinalNode activityFinalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityFinalNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(activityFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalNode_no_outgoing_edges(activityFinalNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalNode(FinalNode finalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(finalNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(finalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalNode_no_outgoing_edges(finalNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_outgoing_edges constraint of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FINAL_NODE__NO_OUTGOING_EDGES__EEXPRESSION = "outgoing->isEmpty()";

	/**
	 * Validates the no_outgoing_edges constraint of '<em>Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalNode_no_outgoing_edges(FinalNode finalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.FINAL_NODE,
				 finalNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_outgoing_edges",
				 FINAL_NODE__NO_OUTGOING_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlNode(ControlNode controlNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(controlNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(controlNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activityParameterNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_input_output_parameter(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selection_behavior(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_object_flow_edges(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_no_outgoing_edges(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_has_parameters(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_same_type(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_no_incoming_edges(activityParameterNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityParameterNode_no_edges(activityParameterNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_outgoing_edges constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_PARAMETER_NODE__NO_OUTGOING_EDGES__EEXPRESSION = "(incoming->notEmpty() and outgoing->isEmpty()) implies \r\n" +
		"\t(parameter.direction = ParameterDirectionKind::out or \r\n" +
		"\t parameter.direction = ParameterDirectionKind::inout or \r\n" +
		"\t parameter.direction = ParameterDirectionKind::return)";

	/**
	 * Validates the no_outgoing_edges constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_no_outgoing_edges(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_PARAMETER_NODE,
				 activityParameterNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_outgoing_edges",
				 ACTIVITY_PARAMETER_NODE__NO_OUTGOING_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the has_parameters constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_PARAMETER_NODE__HAS_PARAMETERS__EEXPRESSION = "activity.ownedParameter->includes(parameter)";

	/**
	 * Validates the has_parameters constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_has_parameters(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_PARAMETER_NODE,
				 activityParameterNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_parameters",
				 ACTIVITY_PARAMETER_NODE__HAS_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the same_type constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_PARAMETER_NODE__SAME_TYPE__EEXPRESSION = "type = parameter.type";

	/**
	 * Validates the same_type constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_same_type(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_PARAMETER_NODE,
				 activityParameterNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_type",
				 ACTIVITY_PARAMETER_NODE__SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_incoming_edges constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_PARAMETER_NODE__NO_INCOMING_EDGES__EEXPRESSION = "(outgoing->notEmpty() and incoming->isEmpty()) implies \r\n" +
		"\t(parameter.direction = ParameterDirectionKind::_'in' or \r\n" +
		"\t parameter.direction = ParameterDirectionKind::inout)";

	/**
	 * Validates the no_incoming_edges constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_no_incoming_edges(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_PARAMETER_NODE,
				 activityParameterNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_incoming_edges",
				 ACTIVITY_PARAMETER_NODE__NO_INCOMING_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_edges constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY_PARAMETER_NODE__NO_EDGES__EEXPRESSION = "incoming->isEmpty() or outgoing->isEmpty()";

	/**
	 * Validates the no_edges constraint of '<em>Activity Parameter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityParameterNode_no_edges(ActivityParameterNode activityParameterNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.ACTIVITY_PARAMETER_NODE,
				 activityParameterNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_edges",
				 ACTIVITY_PARAMETER_NODE__NO_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCentralBufferNode(CentralBufferNode centralBufferNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(centralBufferNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_input_output_parameter(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selection_behavior(centralBufferNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_object_flow_edges(centralBufferNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlFlow(ControlFlow controlFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_source_and_target(controlFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlFlow_object_nodes(controlFlow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the object_nodes constraint of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTROL_FLOW__OBJECT_NODES__EEXPRESSION = "(source.oclIsKindOf(ObjectNode) implies source.oclAsType(ObjectNode).isControlType) and \r\n" +
		"(target.oclIsKindOf(ObjectNode) implies target.oclAsType(ObjectNode).isControlType)";

	/**
	 * Validates the object_nodes constraint of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlFlow_object_nodes(ControlFlow controlFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.CONTROL_FLOW,
				 controlFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "object_nodes",
				 CONTROL_FLOW__OBJECT_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStoreNode(DataStoreNode dataStoreNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataStoreNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_input_output_parameter(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_selection_behavior(dataStoreNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectNode_object_flow_edges(dataStoreNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(decisionNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_zero_input_parameters(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_edges(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_decision_input_flow_incoming(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_two_input_parameters(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_incoming_outgoing_edges(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_incoming_control_one_input_parameter(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_parameters(decisionNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecisionNode_incoming_object_one_input_parameter(decisionNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the zero_input_parameters constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION_NODE__ZERO_INPUT_PARAMETERS__EEXPRESSION = "(decisionInput<>null and decisionInputFlow=null and incoming->exists(oclIsKindOf(ControlFlow))) implies\r\n" +
		"   decisionInput.inputParameters()->isEmpty()";

	/**
	 * Validates the zero_input_parameters constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_zero_input_parameters(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.DECISION_NODE,
				 decisionNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "zero_input_parameters",
				 DECISION_NODE__ZERO_INPUT_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the edges constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION_NODE__EDGES__EEXPRESSION = "let allEdges: Set(ActivityEdge) = incoming->union(outgoing) in\r\n" +
		"let allRelevantEdges: Set(ActivityEdge) = if decisionInputFlow->notEmpty() then allEdges->excluding(decisionInputFlow) else allEdges endif in\r\n" +
		"allRelevantEdges->forAll(oclIsKindOf(ControlFlow)) or allRelevantEdges->forAll(oclIsKindOf(ObjectFlow))\r\n" +
		"";

	/**
	 * Validates the edges constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_edges(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.DECISION_NODE,
				 decisionNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "edges",
				 DECISION_NODE__EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the decision_input_flow_incoming constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION_NODE__DECISION_INPUT_FLOW_INCOMING__EEXPRESSION = "incoming->includes(decisionInputFlow)";

	/**
	 * Validates the decision_input_flow_incoming constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_decision_input_flow_incoming(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.DECISION_NODE,
				 decisionNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "decision_input_flow_incoming",
				 DECISION_NODE__DECISION_INPUT_FLOW_INCOMING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the two_input_parameters constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION_NODE__TWO_INPUT_PARAMETERS__EEXPRESSION = "(decisionInput<>null and decisionInputFlow<>null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies\r\n" +
		"\tdecisionInput.inputParameters()->size()=2";

	/**
	 * Validates the two_input_parameters constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_two_input_parameters(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.DECISION_NODE,
				 decisionNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "two_input_parameters",
				 DECISION_NODE__TWO_INPUT_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the incoming_outgoing_edges constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION_NODE__INCOMING_OUTGOING_EDGES__EEXPRESSION = "(incoming->size() = 1 or incoming->size() = 2) and outgoing->size() > 0";

	/**
	 * Validates the incoming_outgoing_edges constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_incoming_outgoing_edges(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.DECISION_NODE,
				 decisionNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "incoming_outgoing_edges",
				 DECISION_NODE__INCOMING_OUTGOING_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the incoming_control_one_input_parameter constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION_NODE__INCOMING_CONTROL_ONE_INPUT_PARAMETER__EEXPRESSION = "(decisionInput<>null and decisionInputFlow<>null and incoming->exists(oclIsKindOf(ControlFlow))) implies\r\n" +
		"\tdecisionInput.inputParameters()->size()=1";

	/**
	 * Validates the incoming_control_one_input_parameter constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_incoming_control_one_input_parameter(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.DECISION_NODE,
				 decisionNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "incoming_control_one_input_parameter",
				 DECISION_NODE__INCOMING_CONTROL_ONE_INPUT_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the parameters constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION_NODE__PARAMETERS__EEXPRESSION = "decisionInput<>null implies \r\n" +
		"  (decisionInput.ownedParameter->forAll(par | \r\n" +
		"     par.direction <> ParameterDirectionKind::out and \r\n" +
		"     par.direction <> ParameterDirectionKind::inout ) and\r\n" +
		"   decisionInput.ownedParameter->one(par | \r\n" +
		"     par.direction <> ParameterDirectionKind::return))\r\n" +
		"     ";

	/**
	 * Validates the parameters constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_parameters(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.DECISION_NODE,
				 decisionNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "parameters",
				 DECISION_NODE__PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the incoming_object_one_input_parameter constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECISION_NODE__INCOMING_OBJECT_ONE_INPUT_PARAMETER__EEXPRESSION = "(decisionInput<>null and decisionInputFlow=null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies\r\n" +
		"\tdecisionInput.inputParameters()->size()=1";

	/**
	 * Validates the incoming_object_one_input_parameter constraint of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionNode_incoming_object_one_input_parameter(DecisionNode decisionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.DECISION_NODE,
				 decisionNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "incoming_object_one_input_parameter",
				 DECISION_NODE__INCOMING_OBJECT_ONE_INPUT_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(objectFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivityEdge_source_and_target(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_input_and_output_parameter(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_no_executable_nodes(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_transformation_behavior(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_selection_behavior(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_compatible_types(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_same_upper_bounds(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_target(objectFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateObjectFlow_is_multicast_or_is_multireceive(objectFlow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the input_and_output_parameter constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_FLOW__INPUT_AND_OUTPUT_PARAMETER__EEXPRESSION = "selection<>null implies\r\n" +
		"\tselection.inputParameters()->size()=1 and\r\n" +
		"\tselection.inputParameters()->forAll(not isUnique and is(0,*)) and\r\n" +
		"\tselection.outputParameters()->size()=1";

	/**
	 * Validates the input_and_output_parameter constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_input_and_output_parameter(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.OBJECT_FLOW,
				 objectFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "input_and_output_parameter",
				 OBJECT_FLOW__INPUT_AND_OUTPUT_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_executable_nodes constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_FLOW__NO_EXECUTABLE_NODES__EEXPRESSION = "not (source.oclIsKindOf(ExecutableNode) or target.oclIsKindOf(ExecutableNode))";

	/**
	 * Validates the no_executable_nodes constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_no_executable_nodes(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.OBJECT_FLOW,
				 objectFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_executable_nodes",
				 OBJECT_FLOW__NO_EXECUTABLE_NODES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the transformation_behavior constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_FLOW__TRANSFORMATION_BEHAVIOR__EEXPRESSION = "transformation<>null implies\r\n" +
		"\ttransformation.inputParameters()->size()=1 and\r\n" +
		"\ttransformation.outputParameters()->size()=1";

	/**
	 * Validates the transformation_behavior constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_transformation_behavior(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.OBJECT_FLOW,
				 objectFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "transformation_behavior",
				 OBJECT_FLOW__TRANSFORMATION_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the selection_behavior constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_FLOW__SELECTION_BEHAVIOR__EEXPRESSION = "selection<>null implies source.oclIsKindOf(ObjectNode)";

	/**
	 * Validates the selection_behavior constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_selection_behavior(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.OBJECT_FLOW,
				 objectFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "selection_behavior",
				 OBJECT_FLOW__SELECTION_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the compatible_types constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_compatible_types(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "compatible_types", getObjectLabel(objectFlow, context) },
						 new Object[] { objectFlow },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the same_upper_bounds constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_same_upper_bounds(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "same_upper_bounds", getObjectLabel(objectFlow, context) },
						 new Object[] { objectFlow },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the target constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_target(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "target", getObjectLabel(objectFlow, context) },
						 new Object[] { objectFlow },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the is_multicast_or_is_multireceive constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OBJECT_FLOW__IS_MULTICAST_OR_IS_MULTIRECEIVE__EEXPRESSION = "not (isMulticast and isMultireceive)";

	/**
	 * Validates the is_multicast_or_is_multireceive constraint of '<em>Object Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectFlow_is_multicast_or_is_multireceive(ObjectFlow objectFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.OBJECT_FLOW,
				 objectFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "is_multicast_or_is_multireceive",
				 OBJECT_FLOW__IS_MULTICAST_OR_IS_MULTIRECEIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowFinalNode(FlowFinalNode flowFinalNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(flowFinalNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(flowFinalNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalNode_no_outgoing_edges(flowFinalNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkNode(ForkNode forkNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(forkNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateForkNode_edges(forkNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateForkNode_one_incoming_edge(forkNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the edges constraint of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORK_NODE__EDGES__EEXPRESSION = "let allEdges : Set(ActivityEdge) = incoming->union(outgoing) in\r\n" +
		"allEdges->forAll(oclIsKindOf(ControlFlow)) or allEdges->forAll(oclIsKindOf(ObjectFlow))\r\n" +
		"";

	/**
	 * Validates the edges constraint of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkNode_edges(ForkNode forkNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.FORK_NODE,
				 forkNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "edges",
				 FORK_NODE__EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the one_incoming_edge constraint of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORK_NODE__ONE_INCOMING_EDGE__EEXPRESSION = "incoming->size()=1";

	/**
	 * Validates the one_incoming_edge constraint of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForkNode_one_incoming_edge(ForkNode forkNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.FORK_NODE,
				 forkNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_incoming_edge",
				 FORK_NODE__ONE_INCOMING_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialNode(InitialNode initialNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(initialNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateInitialNode_no_incoming_edges(initialNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateInitialNode_control_edges(initialNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_incoming_edges constraint of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INITIAL_NODE__NO_INCOMING_EDGES__EEXPRESSION = "incoming->isEmpty()";

	/**
	 * Validates the no_incoming_edges constraint of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialNode_no_incoming_edges(InitialNode initialNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.INITIAL_NODE,
				 initialNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_incoming_edges",
				 INITIAL_NODE__NO_INCOMING_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the control_edges constraint of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INITIAL_NODE__CONTROL_EDGES__EEXPRESSION = "outgoing->forAll(oclIsKindOf(ControlFlow))";

	/**
	 * Validates the control_edges constraint of '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialNode_control_edges(InitialNode initialNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.INITIAL_NODE,
				 initialNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "control_edges",
				 INITIAL_NODE__CONTROL_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinNode(JoinNode joinNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(joinNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateJoinNode_one_outgoing_edge(joinNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateJoinNode_incoming_object_flow(joinNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the one_outgoing_edge constraint of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOIN_NODE__ONE_OUTGOING_EDGE__EEXPRESSION = "outgoing->size() = 1";

	/**
	 * Validates the one_outgoing_edge constraint of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinNode_one_outgoing_edge(JoinNode joinNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.JOIN_NODE,
				 joinNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_outgoing_edge",
				 JOIN_NODE__ONE_OUTGOING_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the incoming_object_flow constraint of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JOIN_NODE__INCOMING_OBJECT_FLOW__EEXPRESSION = "if incoming->exists(oclIsKindOf(ObjectFlow)) then outgoing->forAll(oclIsKindOf(ObjectFlow))\r\n" +
		"else outgoing->forAll(oclIsKindOf(ControlFlow))\r\n" +
		"endif";

	/**
	 * Validates the incoming_object_flow constraint of '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoinNode_incoming_object_flow(JoinNode joinNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.JOIN_NODE,
				 joinNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "incoming_object_flow",
				 JOIN_NODE__INCOMING_OBJECT_FLOW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeNode(MergeNode mergeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mergeNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateMergeNode_one_outgoing_edge(mergeNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateMergeNode_edges(mergeNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the one_outgoing_edge constraint of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MERGE_NODE__ONE_OUTGOING_EDGE__EEXPRESSION = "outgoing->size()=1";

	/**
	 * Validates the one_outgoing_edge constraint of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeNode_one_outgoing_edge(MergeNode mergeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.MERGE_NODE,
				 mergeNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_outgoing_edge",
				 MERGE_NODE__ONE_OUTGOING_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the edges constraint of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MERGE_NODE__EDGES__EEXPRESSION = "let allEdges : Set(ActivityEdge) = incoming->union(outgoing) in\r\n" +
		"allEdges->forAll(oclIsKindOf(ControlFlow)) or allEdges->forAll(oclIsKindOf(ObjectFlow))\r\n" +
		"";

	/**
	 * Validates the edges constraint of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeNode_edges(MergeNode mergeNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ActivitiesPackage.Literals.MERGE_NODE,
				 mergeNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "edges",
				 MERGE_NODE__EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectNodeOrderingKind(ObjectNodeOrderingKind objectNodeOrderingKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ActivitiesValidator
