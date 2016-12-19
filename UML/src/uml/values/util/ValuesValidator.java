/**
 */
package uml.values.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.values.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.values.ValuesPackage
 * @generated
 */
public class ValuesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ValuesValidator INSTANCE = new ValuesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.values";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesValidator() {
		super();
		commonStructureValidator = CommonStructureValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ValuesPackage.eINSTANCE;
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
			case ValuesPackage.DURATION:
				return validateDuration((Duration)value, diagnostics, context);
			case ValuesPackage.VALUE_SPECIFICATION:
				return validateValueSpecification((ValueSpecification)value, diagnostics, context);
			case ValuesPackage.OBSERVATION:
				return validateObservation((Observation)value, diagnostics, context);
			case ValuesPackage.DURATION_CONSTRAINT:
				return validateDurationConstraint((DurationConstraint)value, diagnostics, context);
			case ValuesPackage.INTERVAL_CONSTRAINT:
				return validateIntervalConstraint((IntervalConstraint)value, diagnostics, context);
			case ValuesPackage.INTERVAL:
				return validateInterval((Interval)value, diagnostics, context);
			case ValuesPackage.DURATION_INTERVAL:
				return validateDurationInterval((DurationInterval)value, diagnostics, context);
			case ValuesPackage.DURATION_OBSERVATION:
				return validateDurationObservation((DurationObservation)value, diagnostics, context);
			case ValuesPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case ValuesPackage.LITERAL_BOOLEAN:
				return validateLiteralBoolean((LiteralBoolean)value, diagnostics, context);
			case ValuesPackage.LITERAL_SPECIFICATION:
				return validateLiteralSpecification((LiteralSpecification)value, diagnostics, context);
			case ValuesPackage.LITERAL_INTEGER:
				return validateLiteralInteger((LiteralInteger)value, diagnostics, context);
			case ValuesPackage.LITERAL_NULL:
				return validateLiteralNull((LiteralNull)value, diagnostics, context);
			case ValuesPackage.LITERAL_REAL:
				return validateLiteralReal((LiteralReal)value, diagnostics, context);
			case ValuesPackage.LITERAL_STRING:
				return validateLiteralString((LiteralString)value, diagnostics, context);
			case ValuesPackage.LITERAL_UNLIMITED_NATURAL:
				return validateLiteralUnlimitedNatural((LiteralUnlimitedNatural)value, diagnostics, context);
			case ValuesPackage.OPAQUE_EXPRESSION:
				return validateOpaqueExpression((OpaqueExpression)value, diagnostics, context);
			case ValuesPackage.TIME_CONSTRAINT:
				return validateTimeConstraint((TimeConstraint)value, diagnostics, context);
			case ValuesPackage.TIME_INTERVAL:
				return validateTimeInterval((TimeInterval)value, diagnostics, context);
			case ValuesPackage.TIME_EXPRESSION:
				return validateTimeExpression((TimeExpression)value, diagnostics, context);
			case ValuesPackage.TIME_OBSERVATION:
				return validateTimeObservation((TimeObservation)value, diagnostics, context);
			case ValuesPackage.STRING_EXPRESSION:
				return validateStringExpression((StringExpression)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(duration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(duration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(duration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(duration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(duration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(duration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(duration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(duration, diagnostics, context);
		if (result || diagnostics != null) result &= validateDuration_no_expr_requires_observation(duration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_expr_requires_observation constraint of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DURATION__NO_EXPR_REQUIRES_OBSERVATION__EEXPRESSION = "expr = null implies (observation->size() = 1 and observation->forAll(oclIsKindOf(DurationObservation)))";

	/**
	 * Validates the no_expr_requires_observation constraint of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDuration_no_expr_requires_observation(Duration duration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.DURATION,
				 duration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_expr_requires_observation",
				 DURATION__NO_EXPR_REQUIRES_OBSERVATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecification(ValueSpecification valueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(valueSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservation(Observation observation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(observation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(observation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(observation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(observation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(observation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(observation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(observation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(observation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(observation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationConstraint(DurationConstraint durationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(durationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_boolean_value(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_no_side_effects(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_not_apply_to_self(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationConstraint_first_event_multiplicity(durationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationConstraint_has_one_or_two_constrainedElements(durationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the first_event_multiplicity constraint of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DURATION_CONSTRAINT__FIRST_EVENT_MULTIPLICITY__EEXPRESSION = "if (constrainedElement->size() = 2)\r\n" +
		"  then (firstEvent->size() = 2) else (firstEvent->size() = 0) \r\n" +
		"endif";

	/**
	 * Validates the first_event_multiplicity constraint of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationConstraint_first_event_multiplicity(DurationConstraint durationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.DURATION_CONSTRAINT,
				 durationConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "first_event_multiplicity",
				 DURATION_CONSTRAINT__FIRST_EVENT_MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the has_one_or_two_constrainedElements constraint of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DURATION_CONSTRAINT__HAS_ONE_OR_TWO_CONSTRAINED_ELEMENTS__EEXPRESSION = "constrainedElement->size() = 1 or constrainedElement->size()=2";

	/**
	 * Validates the has_one_or_two_constrainedElements constraint of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationConstraint_has_one_or_two_constrainedElements(DurationConstraint durationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.DURATION_CONSTRAINT,
				 durationConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_one_or_two_constrainedElements",
				 DURATION_CONSTRAINT__HAS_ONE_OR_TWO_CONSTRAINED_ELEMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntervalConstraint(IntervalConstraint intervalConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intervalConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_boolean_value(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_no_side_effects(intervalConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_not_apply_to_self(intervalConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterval(Interval interval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(interval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(interval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(interval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(interval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(interval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(interval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInterval(DurationInterval durationInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(durationInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(durationInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(durationInterval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationObservation(DurationObservation durationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(durationObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(durationObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationObservation_first_event_multiplicity(durationObservation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the first_event_multiplicity constraint of '<em>Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DURATION_OBSERVATION__FIRST_EVENT_MULTIPLICITY__EEXPRESSION = "if (event->size() = 2)\r\n" +
		"  then (firstEvent->size() = 2) else (firstEvent->size() = 0)\r\n" +
		"endif";

	/**
	 * Validates the first_event_multiplicity constraint of '<em>Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationObservation_first_event_multiplicity(DurationObservation durationObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.DURATION_OBSERVATION,
				 durationObservation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "first_event_multiplicity",
				 DURATION_OBSERVATION__FIRST_EVENT_MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(expression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(expression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(expression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(expression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(expression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(expression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(expression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(expression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(expression, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralBoolean(LiteralBoolean literalBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalBoolean, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(literalBoolean, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(literalBoolean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralSpecification(LiteralSpecification literalSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(literalSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(literalSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralInteger(LiteralInteger literalInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalInteger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(literalInteger, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(literalInteger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralNull(LiteralNull literalNull, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalNull, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(literalNull, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(literalNull, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralReal(LiteralReal literalReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalReal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(literalReal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(literalReal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralString(LiteralString literalString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalString, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(literalString, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(literalString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralUnlimitedNatural(LiteralUnlimitedNatural literalUnlimitedNatural, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(literalUnlimitedNatural, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(literalUnlimitedNatural, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(literalUnlimitedNatural, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(opaqueExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpaqueExpression_language_body_size(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpaqueExpression_one_return_result_parameter(opaqueExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateOpaqueExpression_only_return_result_parameters(opaqueExpression, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the language_body_size constraint of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPAQUE_EXPRESSION__LANGUAGE_BODY_SIZE__EEXPRESSION = "language->notEmpty() implies (_'body'->size() = language->size())";

	/**
	 * Validates the language_body_size constraint of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression_language_body_size(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.OPAQUE_EXPRESSION,
				 opaqueExpression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "language_body_size",
				 OPAQUE_EXPRESSION__LANGUAGE_BODY_SIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the one_return_result_parameter constraint of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPAQUE_EXPRESSION__ONE_RETURN_RESULT_PARAMETER__EEXPRESSION = "behavior <> null implies\r\n" +
		"   behavior.ownedParameter->select(direction=ParameterDirectionKind::return)->size() = 1";

	/**
	 * Validates the one_return_result_parameter constraint of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression_one_return_result_parameter(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.OPAQUE_EXPRESSION,
				 opaqueExpression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_return_result_parameter",
				 OPAQUE_EXPRESSION__ONE_RETURN_RESULT_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the only_return_result_parameters constraint of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPAQUE_EXPRESSION__ONLY_RETURN_RESULT_PARAMETERS__EEXPRESSION = "behavior <> null implies behavior.ownedParameter->select(direction<>ParameterDirectionKind::return)->isEmpty()";

	/**
	 * Validates the only_return_result_parameters constraint of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueExpression_only_return_result_parameters(OpaqueExpression opaqueExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.OPAQUE_EXPRESSION,
				 opaqueExpression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "only_return_result_parameters",
				 OPAQUE_EXPRESSION__ONLY_RETURN_RESULT_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeConstraint(TimeConstraint timeConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_boolean_value(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_no_side_effects(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateConstraint_not_apply_to_self(timeConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeConstraint_has_one_constrainedElement(timeConstraint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the has_one_constrainedElement constraint of '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_CONSTRAINT__HAS_ONE_CONSTRAINED_ELEMENT__EEXPRESSION = "constrainedElement->size() = 1";

	/**
	 * Validates the has_one_constrainedElement constraint of '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeConstraint_has_one_constrainedElement(TimeConstraint timeConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.TIME_CONSTRAINT,
				 timeConstraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_one_constrainedElement",
				 TIME_CONSTRAINT__HAS_ONE_CONSTRAINED_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInterval(TimeInterval timeInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(timeInterval, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(timeInterval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeExpression(TimeExpression timeExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(timeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeExpression_no_expr_requires_observation(timeExpression, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_expr_requires_observation constraint of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_EXPRESSION__NO_EXPR_REQUIRES_OBSERVATION__EEXPRESSION = "expr = null implies (observation->size() = 1 and observation->forAll(oclIsKindOf(TimeObservation)))";

	/**
	 * Validates the no_expr_requires_observation constraint of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeExpression_no_expr_requires_observation(TimeExpression timeExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.TIME_EXPRESSION,
				 timeExpression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_expr_requires_observation",
				 TIME_EXPRESSION__NO_EXPR_REQUIRES_OBSERVATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeObservation(TimeObservation timeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(timeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(timeObservation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringExpression(StringExpression stringExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateStringExpression_operands(stringExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateStringExpression_subexpressions(stringExpression, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the operands constraint of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRING_EXPRESSION__OPERANDS__EEXPRESSION = "operand->forAll (oclIsKindOf (LiteralString))";

	/**
	 * Validates the operands constraint of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringExpression_operands(StringExpression stringExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.STRING_EXPRESSION,
				 stringExpression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "operands",
				 STRING_EXPRESSION__OPERANDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the subexpressions constraint of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRING_EXPRESSION__SUBEXPRESSIONS__EEXPRESSION = "if subExpression->notEmpty() then operand->isEmpty() else operand->notEmpty() endif";

	/**
	 * Validates the subexpressions constraint of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringExpression_subexpressions(StringExpression stringExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ValuesPackage.Literals.STRING_EXPRESSION,
				 stringExpression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "subexpressions",
				 STRING_EXPRESSION__SUBEXPRESSIONS__EEXPRESSION,
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

} //ValuesValidator
