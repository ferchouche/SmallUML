/**
 */
package uml.stateMachines.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonBehavior.util.CommonBehaviorValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.simpleClassifiers.util.SimpleClassifiersValidator;

import uml.stateMachines.*;

import uml.structuredClassifiers.util.StructuredClassifiersValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.stateMachines.StateMachinesPackage
 * @generated
 */
public class StateMachinesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StateMachinesValidator INSTANCE = new StateMachinesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.stateMachines";

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
	public StateMachinesValidator() {
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
	  return StateMachinesPackage.eINSTANCE;
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
			case StateMachinesPackage.CONNECTION_POINT_REFERENCE:
				return validateConnectionPointReference((ConnectionPointReference)value, diagnostics, context);
			case StateMachinesPackage.VERTEX:
				return validateVertex((Vertex)value, diagnostics, context);
			case StateMachinesPackage.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case StateMachinesPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case StateMachinesPackage.PSEUDOSTATE:
				return validatePseudostate((Pseudostate)value, diagnostics, context);
			case StateMachinesPackage.STATE_MACHINE:
				return validateStateMachine((StateMachine)value, diagnostics, context);
			case StateMachinesPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case StateMachinesPackage.FINAL_STATE:
				return validateFinalState((FinalState)value, diagnostics, context);
			case StateMachinesPackage.PROTOCOL_CONFORMANCE:
				return validateProtocolConformance((ProtocolConformance)value, diagnostics, context);
			case StateMachinesPackage.PROTOCOL_TRANSITION:
				return validateProtocolTransition((ProtocolTransition)value, diagnostics, context);
			case StateMachinesPackage.PROTOCOL_STATE_MACHINE:
				return validateProtocolStateMachine((ProtocolStateMachine)value, diagnostics, context);
			case StateMachinesPackage.PSEUDOSTATE_KIND:
				return validatePseudostateKind((PseudostateKind)value, diagnostics, context);
			case StateMachinesPackage.TRANSITION_KIND:
				return validateTransitionKind((TransitionKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointReference(ConnectionPointReference connectionPointReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectionPointReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPointReference_exit_pseudostates(connectionPointReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectionPointReference_entry_pseudostates(connectionPointReference, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the exit_pseudostates constraint of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTION_POINT_REFERENCE__EXIT_PSEUDOSTATES__EEXPRESSION = "exit->forAll(kind = PseudostateKind::exitPoint)";

	/**
	 * Validates the exit_pseudostates constraint of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointReference_exit_pseudostates(ConnectionPointReference connectionPointReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.CONNECTION_POINT_REFERENCE,
				 connectionPointReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "exit_pseudostates",
				 CONNECTION_POINT_REFERENCE__EXIT_PSEUDOSTATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the entry_pseudostates constraint of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTION_POINT_REFERENCE__ENTRY_PSEUDOSTATES__EEXPRESSION = "entry->forAll(kind = PseudostateKind::entryPoint)";

	/**
	 * Validates the entry_pseudostates constraint of '<em>Connection Point Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointReference_entry_pseudostates(ConnectionPointReference connectionPointReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.CONNECTION_POINT_REFERENCE,
				 connectionPointReference,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "entry_pseudostates",
				 CONNECTION_POINT_REFERENCE__ENTRY_PSEUDOSTATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVertex(Vertex vertex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vertex, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(vertex, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(vertex, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(region, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(region, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(region, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(region, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(region, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(region, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(region, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(region, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(region, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(region, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(region, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(region, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegion_deep_history_vertex(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegion_shallow_history_vertex(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegion_owned(region, diagnostics, context);
		if (result || diagnostics != null) result &= validateRegion_initial_vertex(region, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the deep_history_vertex constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGION__DEEP_HISTORY_VERTEX__EEXPRESSION = "self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->\n" +
		"   select(kind = PseudostateKind::deepHistory)->size() <= 1\n" +
		"";

	/**
	 * Validates the deep_history_vertex constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion_deep_history_vertex(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.REGION,
				 region,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "deep_history_vertex",
				 REGION__DEEP_HISTORY_VERTEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the shallow_history_vertex constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGION__SHALLOW_HISTORY_VERTEX__EEXPRESSION = "subvertex->select(oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->\n" +
		"  select(kind = PseudostateKind::shallowHistory)->size() <= 1\n" +
		"";

	/**
	 * Validates the shallow_history_vertex constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion_shallow_history_vertex(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.REGION,
				 region,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "shallow_history_vertex",
				 REGION__SHALLOW_HISTORY_VERTEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the owned constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGION__OWNED__EEXPRESSION = "(stateMachine <> null implies state = null) and (state <> null implies stateMachine = null)";

	/**
	 * Validates the owned constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion_owned(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.REGION,
				 region,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "owned",
				 REGION__OWNED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the initial_vertex constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REGION__INITIAL_VERTEX__EEXPRESSION = "self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->\n" +
		"  select(kind = PseudostateKind::initial)->size() <= 1\n" +
		"";

	/**
	 * Validates the initial_vertex constraint of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion_initial_vertex(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.REGION,
				 region,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "initial_vertex",
				 REGION__INITIAL_VERTEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(state, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(state, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(state, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(state, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(state, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(state, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(state, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(state, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(state, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(state, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_entry_or_exit(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_submachine_states(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_composite_states(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_destinations_or_sources_of_transitions(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_submachine_or_regions(state, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the entry_or_exit constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__ENTRY_OR_EXIT__EEXPRESSION = "connectionPoint->forAll(kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)";

	/**
	 * Validates the entry_or_exit constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_entry_or_exit(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "entry_or_exit",
				 STATE__ENTRY_OR_EXIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the submachine_states constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__SUBMACHINE_STATES__EEXPRESSION = "isSubmachineState implies connection->notEmpty( )";

	/**
	 * Validates the submachine_states constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_submachine_states(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "submachine_states",
				 STATE__SUBMACHINE_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the composite_states constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__COMPOSITE_STATES__EEXPRESSION = "connectionPoint->notEmpty() implies isComposite";

	/**
	 * Validates the composite_states constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_composite_states(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "composite_states",
				 STATE__COMPOSITE_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the destinations_or_sources_of_transitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__DESTINATIONS_OR_SOURCES_OF_TRANSITIONS__EEXPRESSION = "self.isSubmachineState implies (self.connection->forAll (cp |\r\n" +
		"  cp.entry->forAll (ps | ps.stateMachine = self.submachine) and\r\n" +
		"  cp.exit->forAll (ps | ps.stateMachine = self.submachine)))";

	/**
	 * Validates the destinations_or_sources_of_transitions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_destinations_or_sources_of_transitions(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "destinations_or_sources_of_transitions",
				 STATE__DESTINATIONS_OR_SOURCES_OF_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the submachine_or_regions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__SUBMACHINE_OR_REGIONS__EEXPRESSION = "isComposite implies not isSubmachineState";

	/**
	 * Validates the submachine_or_regions constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_submachine_or_regions(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "submachine_or_regions",
				 STATE__SUBMACHINE_OR_REGIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pseudostate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_transitions_outgoing(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_choice_vertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_outgoing_from_initial(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_join_vertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_junction_vertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_history_vertices(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_initial_vertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_fork_vertex(pseudostate, diagnostics, context);
		if (result || diagnostics != null) result &= validatePseudostate_transitions_incoming(pseudostate, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the transitions_outgoing constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSEUDOSTATE__TRANSITIONS_OUTGOING__EEXPRESSION = "(kind = PseudostateKind::fork) implies\r\n" +
		"\r\n" +
		"-- for any pair of outgoing transitions there exists an orthogonal state which contains the targets of these transitions \r\n" +
		"-- such that these targets belong to different regions of that orthogonal state \r\n" +
		"\r\n" +
		"outgoing->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.target, t2.target) in\r\n" +
		"\t((contState <> null) and (contState.region\r\n" +
		"\t\t->exists(r1:Region, r2: Region | (r1 <> r2) and t1.target.isContainedInRegion(r1) and t2.target.isContainedInRegion(r2)))))\r\n" +
		"\t";

	/**
	 * Validates the transitions_outgoing constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_transitions_outgoing(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PSEUDOSTATE,
				 pseudostate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "transitions_outgoing",
				 PSEUDOSTATE__TRANSITIONS_OUTGOING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the choice_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSEUDOSTATE__CHOICE_VERTEX__EEXPRESSION = "(kind = PseudostateKind::choice) implies (incoming->size() >= 1 and outgoing->size() >= 1)\n" +
		"";

	/**
	 * Validates the choice_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_choice_vertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PSEUDOSTATE,
				 pseudostate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "choice_vertex",
				 PSEUDOSTATE__CHOICE_VERTEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the outgoing_from_initial constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSEUDOSTATE__OUTGOING_FROM_INITIAL__EEXPRESSION = "(kind = PseudostateKind::initial) implies (outgoing.guard = null and outgoing.trigger->isEmpty())";

	/**
	 * Validates the outgoing_from_initial constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_outgoing_from_initial(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PSEUDOSTATE,
				 pseudostate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "outgoing_from_initial",
				 PSEUDOSTATE__OUTGOING_FROM_INITIAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the join_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSEUDOSTATE__JOIN_VERTEX__EEXPRESSION = "(kind = PseudostateKind::join) implies (outgoing->size() = 1 and incoming->size() >= 2)\n" +
		"";

	/**
	 * Validates the join_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_join_vertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PSEUDOSTATE,
				 pseudostate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "join_vertex",
				 PSEUDOSTATE__JOIN_VERTEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the junction_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSEUDOSTATE__JUNCTION_VERTEX__EEXPRESSION = "(kind = PseudostateKind::junction) implies (incoming->size() >= 1 and outgoing->size() >= 1)\n" +
		"";

	/**
	 * Validates the junction_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_junction_vertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PSEUDOSTATE,
				 pseudostate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "junction_vertex",
				 PSEUDOSTATE__JUNCTION_VERTEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the history_vertices constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSEUDOSTATE__HISTORY_VERTICES__EEXPRESSION = "((kind = PseudostateKind::deepHistory) or (kind = PseudostateKind::shallowHistory)) implies (outgoing->size() <= 1)\n" +
		"";

	/**
	 * Validates the history_vertices constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_history_vertices(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PSEUDOSTATE,
				 pseudostate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "history_vertices",
				 PSEUDOSTATE__HISTORY_VERTICES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the initial_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSEUDOSTATE__INITIAL_VERTEX__EEXPRESSION = "(kind = PseudostateKind::initial) implies (outgoing->size() <= 1)";

	/**
	 * Validates the initial_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_initial_vertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PSEUDOSTATE,
				 pseudostate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "initial_vertex",
				 PSEUDOSTATE__INITIAL_VERTEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the fork_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSEUDOSTATE__FORK_VERTEX__EEXPRESSION = "(kind = PseudostateKind::fork) implies (incoming->size() = 1 and outgoing->size() >= 2)\n" +
		"";

	/**
	 * Validates the fork_vertex constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_fork_vertex(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PSEUDOSTATE,
				 pseudostate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "fork_vertex",
				 PSEUDOSTATE__FORK_VERTEX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the transitions_incoming constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSEUDOSTATE__TRANSITIONS_INCOMING__EEXPRESSION = "(kind = PseudostateKind::join) implies\n" +
		"\n" +
		"-- for any pair of incoming transitions there exists an orthogonal state which contains the source vetices of these transitions \n" +
		"-- such that these source vertices belong to different regions of that orthogonal state \n" +
		"\n" +
		"incoming->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.source, t2.source) in\n" +
		"\t((contState <> null) and (contState.region\n" +
		"\t\t->exists(r1:Region, r2: Region | (r1 <> r2) and t1.source.isContainedInRegion(r1) and t2.source.isContainedInRegion(r2)))))";

	/**
	 * Validates the transitions_incoming constraint of '<em>Pseudostate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostate_transitions_incoming(Pseudostate pseudostate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PSEUDOSTATE,
				 pseudostate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "transitions_incoming",
				 PSEUDOSTATE__TRANSITIONS_INCOMING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_most_one_behavior(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_parameters_match(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_feature_of_context_classifier(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_connection_points(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_classifier_context(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_method(stateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_context_classifier(stateMachine, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the connection_points constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_MACHINE__CONNECTION_POINTS__EEXPRESSION = "connectionPoint->forAll (kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)";

	/**
	 * Validates the connection_points constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_connection_points(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.STATE_MACHINE,
				 stateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "connection_points",
				 STATE_MACHINE__CONNECTION_POINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the classifier_context constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_MACHINE__CLASSIFIER_CONTEXT__EEXPRESSION = "_'context' <> null implies not _'context'.oclIsKindOf(Interface)";

	/**
	 * Validates the classifier_context constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_classifier_context(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.STATE_MACHINE,
				 stateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "classifier_context",
				 STATE_MACHINE__CLASSIFIER_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the method constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_MACHINE__METHOD__EEXPRESSION = "specification <> null implies connectionPoint->isEmpty()";

	/**
	 * Validates the method constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_method(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.STATE_MACHINE,
				 stateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "method",
				 STATE_MACHINE__METHOD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the context_classifier constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_MACHINE__CONTEXT_CLASSIFIER__EEXPRESSION = "specification <> null implies ( _'context' <> null and specification.featuringClassifier->exists(c | c = _'context'))";

	/**
	 * Validates the context_classifier constraint of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateMachine_context_classifier(StateMachine stateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.STATE_MACHINE,
				 stateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "context_classifier",
				 STATE_MACHINE__CONTEXT_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(transition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(transition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(transition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(transition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(transition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(transition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(transition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(transition, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(transition, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(transition, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_state_is_external(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_join_segment_guards(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_state_is_internal(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_outgoing_pseudostates(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_join_segment_state(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_fork_segment_state(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_state_is_local(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_initial_transition(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_fork_segment_guards(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the state_is_external constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__STATE_IS_EXTERNAL__EEXPRESSION = "(kind = TransitionKind::external) implies\r\n" +
		"\tnot (source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint)";

	/**
	 * Validates the state_is_external constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_state_is_external(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "state_is_external",
				 TRANSITION__STATE_IS_EXTERNAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the join_segment_guards constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__JOIN_SEGMENT_GUARDS__EEXPRESSION = "(target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (guard = null and trigger->isEmpty())";

	/**
	 * Validates the join_segment_guards constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_join_segment_guards(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "join_segment_guards",
				 TRANSITION__JOIN_SEGMENT_GUARDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the state_is_internal constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__STATE_IS_INTERNAL__EEXPRESSION = "(kind = TransitionKind::internal) implies\r\n" +
		"\t\t(source.oclIsKindOf (State) and source = target)";

	/**
	 * Validates the state_is_internal constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_state_is_internal(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "state_is_internal",
				 TRANSITION__STATE_IS_INTERNAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the outgoing_pseudostates constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__OUTGOING_PSEUDOSTATES__EEXPRESSION = "source.oclIsKindOf(Pseudostate) and (source.oclAsType(Pseudostate).kind <> PseudostateKind::initial) implies trigger->isEmpty()";

	/**
	 * Validates the outgoing_pseudostates constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_outgoing_pseudostates(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "outgoing_pseudostates",
				 TRANSITION__OUTGOING_PSEUDOSTATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the join_segment_state constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__JOIN_SEGMENT_STATE__EEXPRESSION = "(target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (source.oclIsKindOf(State))";

	/**
	 * Validates the join_segment_state constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_join_segment_state(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "join_segment_state",
				 TRANSITION__JOIN_SEGMENT_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the fork_segment_state constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__FORK_SEGMENT_STATE__EEXPRESSION = "(source.oclIsKindOf(Pseudostate) and  source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (target.oclIsKindOf(State))";

	/**
	 * Validates the fork_segment_state constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_fork_segment_state(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "fork_segment_state",
				 TRANSITION__FORK_SEGMENT_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the state_is_local constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__STATE_IS_LOCAL__EEXPRESSION = "(kind = TransitionKind::local) implies\r\n" +
		"\t\t((source.oclIsKindOf (State) and source.oclAsType(State).isComposite) or\r\n" +
		"\t\t(source.oclIsKindOf (Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint))";

	/**
	 * Validates the state_is_local constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_state_is_local(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "state_is_local",
				 TRANSITION__STATE_IS_LOCAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the initial_transition constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__INITIAL_TRANSITION__EEXPRESSION = "(source.oclIsKindOf(Pseudostate) and container.stateMachine->notEmpty()) implies\n" +
		"\ttrigger->isEmpty()\n" +
		"";

	/**
	 * Validates the initial_transition constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_initial_transition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "initial_transition",
				 TRANSITION__INITIAL_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the fork_segment_guards constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__FORK_SEGMENT_GUARDS__EEXPRESSION = "(source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (guard = null and trigger->isEmpty())";

	/**
	 * Validates the fork_segment_guards constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_fork_segment_guards(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "fork_segment_guards",
				 TRANSITION__FORK_SEGMENT_GUARDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(finalState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_entry_or_exit(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_submachine_states(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_composite_states(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_destinations_or_sources_of_transitions(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_submachine_or_regions(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_no_exit_behavior(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_no_outgoing_transitions(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_no_regions(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_cannot_reference_submachine(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_no_entry_behavior(finalState, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinalState_no_state_behavior(finalState, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_exit_behavior constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FINAL_STATE__NO_EXIT_BEHAVIOR__EEXPRESSION = "exit->isEmpty()";

	/**
	 * Validates the no_exit_behavior constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_no_exit_behavior(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.FINAL_STATE,
				 finalState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_exit_behavior",
				 FINAL_STATE__NO_EXIT_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_outgoing_transitions constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FINAL_STATE__NO_OUTGOING_TRANSITIONS__EEXPRESSION = "outgoing->size() = 0";

	/**
	 * Validates the no_outgoing_transitions constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_no_outgoing_transitions(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.FINAL_STATE,
				 finalState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_outgoing_transitions",
				 FINAL_STATE__NO_OUTGOING_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_regions constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FINAL_STATE__NO_REGIONS__EEXPRESSION = "region->size() = 0";

	/**
	 * Validates the no_regions constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_no_regions(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.FINAL_STATE,
				 finalState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_regions",
				 FINAL_STATE__NO_REGIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the cannot_reference_submachine constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FINAL_STATE__CANNOT_REFERENCE_SUBMACHINE__EEXPRESSION = "submachine->isEmpty()";

	/**
	 * Validates the cannot_reference_submachine constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_cannot_reference_submachine(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.FINAL_STATE,
				 finalState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "cannot_reference_submachine",
				 FINAL_STATE__CANNOT_REFERENCE_SUBMACHINE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_entry_behavior constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FINAL_STATE__NO_ENTRY_BEHAVIOR__EEXPRESSION = "entry->isEmpty()";

	/**
	 * Validates the no_entry_behavior constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_no_entry_behavior(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.FINAL_STATE,
				 finalState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_entry_behavior",
				 FINAL_STATE__NO_ENTRY_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_state_behavior constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FINAL_STATE__NO_STATE_BEHAVIOR__EEXPRESSION = "doActivity->isEmpty()";

	/**
	 * Validates the no_state_behavior constraint of '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState_no_state_behavior(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.FINAL_STATE,
				 finalState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_state_behavior",
				 FINAL_STATE__NO_STATE_BEHAVIOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolConformance(ProtocolConformance protocolConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocolConformance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(protocolConformance, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(protocolConformance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransition(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocolTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_state_is_external(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_join_segment_guards(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_state_is_internal(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_outgoing_pseudostates(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_join_segment_state(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_fork_segment_state(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_state_is_local(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_initial_transition(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_fork_segment_guards(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolTransition_refers_to_operation(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolTransition_associated_actions(protocolTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolTransition_belongs_to_psm(protocolTransition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the refers_to_operation constraint of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROTOCOL_TRANSITION__REFERS_TO_OPERATION__EEXPRESSION = "if (referred()->notEmpty() and containingStateMachine()._'context'->notEmpty()) then \r\n" +
		"    containingStateMachine()._'context'.oclAsType(BehavioredClassifier).allFeatures()->includesAll(referred())\r\n" +
		"else true endif";

	/**
	 * Validates the refers_to_operation constraint of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransition_refers_to_operation(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PROTOCOL_TRANSITION,
				 protocolTransition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "refers_to_operation",
				 PROTOCOL_TRANSITION__REFERS_TO_OPERATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the associated_actions constraint of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROTOCOL_TRANSITION__ASSOCIATED_ACTIONS__EEXPRESSION = "effect = null";

	/**
	 * Validates the associated_actions constraint of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransition_associated_actions(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PROTOCOL_TRANSITION,
				 protocolTransition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "associated_actions",
				 PROTOCOL_TRANSITION__ASSOCIATED_ACTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the belongs_to_psm constraint of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROTOCOL_TRANSITION__BELONGS_TO_PSM__EEXPRESSION = "container.belongsToPSM()";

	/**
	 * Validates the belongs_to_psm constraint of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolTransition_belongs_to_psm(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PROTOCOL_TRANSITION,
				 protocolTransition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "belongs_to_psm",
				 PROTOCOL_TRANSITION__BELONGS_TO_PSM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocolStateMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_most_one_behavior(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_parameters_match(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= commonBehaviorValidator.validateBehavior_feature_of_context_classifier(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_connection_points(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolStateMachine_classifier_context(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_method(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateMachine_context_classifier(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolStateMachine_deep_or_shallow_history(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolStateMachine_entry_exit_do(protocolStateMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolStateMachine_protocol_transitions(protocolStateMachine, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the classifier_context constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROTOCOL_STATE_MACHINE__CLASSIFIER_CONTEXT__EEXPRESSION = "_'context' <> null and specification = null";

	/**
	 * Validates the classifier_context constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine_classifier_context(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "classifier_context", getObjectLabel(protocolStateMachine, context) },
						 new Object[] { protocolStateMachine },
						 context));
			}
			return false;
		}
		return validateStateMachine_classifier_context(protocolStateMachine, diagnostics, context);
	}

	/**
	 * The cached validation expression for the deep_or_shallow_history constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROTOCOL_STATE_MACHINE__DEEP_OR_SHALLOW_HISTORY__EEXPRESSION = "region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Pseudostate) implies\n" +
		"((v.oclAsType(Pseudostate).kind <>  PseudostateKind::deepHistory) and (v.oclAsType(Pseudostate).kind <> PseudostateKind::shallowHistory))))\n" +
		"";

	/**
	 * Validates the deep_or_shallow_history constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine_deep_or_shallow_history(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PROTOCOL_STATE_MACHINE,
				 protocolStateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "deep_or_shallow_history",
				 PROTOCOL_STATE_MACHINE__DEEP_OR_SHALLOW_HISTORY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the entry_exit_do constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROTOCOL_STATE_MACHINE__ENTRY_EXIT_DO__EEXPRESSION = "region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies\n" +
		"(v.oclAsType(State).entry->isEmpty() and v.oclAsType(State).exit->isEmpty() and v.oclAsType(State).doActivity->isEmpty())))\n" +
		"";

	/**
	 * Validates the entry_exit_do constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine_entry_exit_do(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PROTOCOL_STATE_MACHINE,
				 protocolStateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "entry_exit_do",
				 PROTOCOL_STATE_MACHINE__ENTRY_EXIT_DO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the protocol_transitions constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROTOCOL_STATE_MACHINE__PROTOCOL_TRANSITIONS__EEXPRESSION = "region->forAll(r | r.transition->forAll(t | t.oclIsTypeOf(ProtocolTransition)))";

	/**
	 * Validates the protocol_transitions constraint of '<em>Protocol State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolStateMachine_protocol_transitions(ProtocolStateMachine protocolStateMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StateMachinesPackage.Literals.PROTOCOL_STATE_MACHINE,
				 protocolStateMachine,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "protocol_transitions",
				 PROTOCOL_STATE_MACHINE__PROTOCOL_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudostateKind(PseudostateKind pseudostateKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionKind(TransitionKind transitionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //StateMachinesValidator
