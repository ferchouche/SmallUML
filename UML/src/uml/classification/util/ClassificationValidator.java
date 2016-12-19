/**
 */
package uml.classification.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.*;

import uml.commonStructure.util.CommonStructureValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.classification.ClassificationPackage
 * @generated
 */
public class ClassificationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ClassificationValidator INSTANCE = new ClassificationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.classification";

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
	public ClassificationValidator() {
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
	  return ClassificationPackage.eINSTANCE;
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
			case ClassificationPackage.SUBSTITUTION:
				return validateSubstitution((Substitution)value, diagnostics, context);
			case ClassificationPackage.BEHAVIORAL_FEATURE:
				return validateBehavioralFeature((BehavioralFeature)value, diagnostics, context);
			case ClassificationPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case ClassificationPackage.REDEFINABLE_ELEMENT:
				return validateRedefinableElement((RedefinableElement)value, diagnostics, context);
			case ClassificationPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case ClassificationPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case ClassificationPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case ClassificationPackage.OPERATION_TEMPLATE_PARAMETER:
				return validateOperationTemplateParameter((OperationTemplateParameter)value, diagnostics, context);
			case ClassificationPackage.STRUCTURAL_FEATURE:
				return validateStructuralFeature((StructuralFeature)value, diagnostics, context);
			case ClassificationPackage.PARAMETER_SET:
				return validateParameterSet((ParameterSet)value, diagnostics, context);
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER:
				return validateClassifierTemplateParameter((ClassifierTemplateParameter)value, diagnostics, context);
			case ClassificationPackage.GENERALIZATION:
				return validateGeneralization((Generalization)value, diagnostics, context);
			case ClassificationPackage.GENERALIZATION_SET:
				return validateGeneralizationSet((GeneralizationSet)value, diagnostics, context);
			case ClassificationPackage.INSTANCE_SPECIFICATION:
				return validateInstanceSpecification((InstanceSpecification)value, diagnostics, context);
			case ClassificationPackage.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case ClassificationPackage.INSTANCE_VALUE:
				return validateInstanceValue((InstanceValue)value, diagnostics, context);
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE:
				return validateRedefinableTemplateSignature((RedefinableTemplateSignature)value, diagnostics, context);
			case ClassificationPackage.CLASSIFIER:
				return validateClassifier((Classifier)value, diagnostics, context);
			case ClassificationPackage.CALL_CONCURRENCY_KIND:
				return validateCallConcurrencyKind((CallConcurrencyKind)value, diagnostics, context);
			case ClassificationPackage.AGGREGATION_KIND:
				return validateAggregationKind((AggregationKind)value, diagnostics, context);
			case ClassificationPackage.PARAMETER_DIRECTION_KIND:
				return validateParameterDirectionKind((ParameterDirectionKind)value, diagnostics, context);
			case ClassificationPackage.PARAMETER_EFFECT_KIND:
				return validateParameterEffectKind((ParameterEffectKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitution(Substitution substitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(substitution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(substitution, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(substitution, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioralFeature(BehavioralFeature behavioralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behavioralFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_consistent(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_non_leaf_redefinition(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_context_valid(behavioralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioralFeature_abstract_no_method(behavioralFeature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the abstract_no_method constraint of '<em>Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BEHAVIORAL_FEATURE__ABSTRACT_NO_METHOD__EEXPRESSION = "isAbstract implies method->isEmpty()";

	/**
	 * Validates the abstract_no_method constraint of '<em>Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioralFeature_abstract_no_method(BehavioralFeature behavioralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.BEHAVIORAL_FEATURE,
				 behavioralFeature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "abstract_no_method",
				 BEHAVIORAL_FEATURE__ABSTRACT_NO_METHOD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(feature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(feature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(feature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(feature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_consistent(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_non_leaf_redefinition(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_context_valid(feature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(redefinableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_consistent(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_non_leaf_redefinition(redefinableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_context_valid(redefinableElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the redefinition_consistent constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT__EEXPRESSION = "redefinedElement->forAll(re | re.isConsistentWith(self))";

	/**
	 * Validates the redefinition_consistent constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement_redefinition_consistent(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.REDEFINABLE_ELEMENT,
				 redefinableElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "redefinition_consistent",
				 REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the non_leaf_redefinition constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REDEFINABLE_ELEMENT__NON_LEAF_REDEFINITION__EEXPRESSION = "redefinedElement->forAll(re | not re.isLeaf)";

	/**
	 * Validates the non_leaf_redefinition constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement_non_leaf_redefinition(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.REDEFINABLE_ELEMENT,
				 redefinableElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "non_leaf_redefinition",
				 REDEFINABLE_ELEMENT__NON_LEAF_REDEFINITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the redefinition_context_valid constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID__EEXPRESSION = "redefinedElement->forAll(re | self.isRedefinitionContextValid(re))";

	/**
	 * Validates the redefinition_context_valid constraint of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableElement_redefinition_context_valid(RedefinableElement redefinableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.REDEFINABLE_ELEMENT,
				 redefinableElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "redefinition_context_valid",
				 REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_in_and_out(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_not_exception(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_connector_end(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_reentrant_behaviors(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_stream_and_exception(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_object_effect(parameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the in_and_out constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__IN_AND_OUT__EEXPRESSION = "(effect = ParameterEffectKind::delete implies (direction = ParameterDirectionKind::_'in' or direction = ParameterDirectionKind::inout))\r\n" +
		"and\r\n" +
		"(effect = ParameterEffectKind::create implies (direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::return))";

	/**
	 * Validates the in_and_out constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_in_and_out(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PARAMETER,
				 parameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "in_and_out",
				 PARAMETER__IN_AND_OUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the not_exception constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__NOT_EXCEPTION__EEXPRESSION = "isException implies (direction <> ParameterDirectionKind::_'in' and direction <> ParameterDirectionKind::inout)";

	/**
	 * Validates the not_exception constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_not_exception(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PARAMETER,
				 parameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_exception",
				 PARAMETER__NOT_EXCEPTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the connector_end constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__CONNECTOR_END__EEXPRESSION = "end->notEmpty() implies collaboration->notEmpty()";

	/**
	 * Validates the connector_end constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_connector_end(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PARAMETER,
				 parameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "connector_end",
				 PARAMETER__CONNECTOR_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the reentrant_behaviors constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__REENTRANT_BEHAVIORS__EEXPRESSION = "(isStream and behavior <> null) implies not behavior.isReentrant";

	/**
	 * Validates the reentrant_behaviors constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_reentrant_behaviors(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PARAMETER,
				 parameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "reentrant_behaviors",
				 PARAMETER__REENTRANT_BEHAVIORS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the stream_and_exception constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__STREAM_AND_EXCEPTION__EEXPRESSION = "not (isException and isStream)";

	/**
	 * Validates the stream_and_exception constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_stream_and_exception(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PARAMETER,
				 parameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "stream_and_exception",
				 PARAMETER__STREAM_AND_EXCEPTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the object_effect constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER__OBJECT_EFFECT__EEXPRESSION = "(type.oclIsKindOf(DataType)) implies (effect = null)";

	/**
	 * Validates the object_effect constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_object_effect(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PARAMETER,
				 parameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "object_effect",
				 PARAMETER__OBJECT_EFFECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_consistent(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_non_leaf_redefinition(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_context_valid(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(property, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsetting_context_conforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_derived_union_is_read_only(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_multiplicity_of_composite(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_redefined_property_inherited(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsetting_rules(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_binding_to_attribute(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_derived_union_is_derived(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_deployment_target(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_subsetted_property_names(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_type_of_opposite_end(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_qualified_is_association_end(property, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the subsetting_context_conforms constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__SUBSETTING_CONTEXT_CONFORMS__EEXPRESSION = "subsettedProperty->notEmpty() implies\n" +
		"  (subsettingContext()->notEmpty() and subsettingContext()->forAll (sc |\n" +
		"    subsettedProperty->forAll(sp |\n" +
		"      sp.subsettingContext()->exists(c | sc.conformsTo(c)))))";

	/**
	 * Validates the subsetting_context_conforms constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_subsetting_context_conforms(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "subsetting_context_conforms",
				 PROPERTY__SUBSETTING_CONTEXT_CONFORMS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the derived_union_is_read_only constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__DERIVED_UNION_IS_READ_ONLY__EEXPRESSION = "isDerivedUnion implies isReadOnly";

	/**
	 * Validates the derived_union_is_read_only constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_derived_union_is_read_only(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "derived_union_is_read_only",
				 PROPERTY__DERIVED_UNION_IS_READ_ONLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity_of_composite constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__MULTIPLICITY_OF_COMPOSITE__EEXPRESSION = "isComposite and association <> null implies opposite.upperBound() <= 1\r\n" +
		"\r\n" +
		"";

	/**
	 * Validates the multiplicity_of_composite constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_multiplicity_of_composite(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity_of_composite",
				 PROPERTY__MULTIPLICITY_OF_COMPOSITE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the redefined_property_inherited constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__REDEFINED_PROPERTY_INHERITED__EEXPRESSION = "(redefinedProperty->notEmpty()) implies\r\n" +
		"  (redefinitionContext->notEmpty() and\r\n" +
		"      redefinedProperty->forAll(rp|\r\n" +
		"        ((redefinitionContext->collect(fc|\r\n" +
		"          fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp)))";

	/**
	 * Validates the redefined_property_inherited constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_redefined_property_inherited(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "redefined_property_inherited",
				 PROPERTY__REDEFINED_PROPERTY_INHERITED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the subsetting_rules constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__SUBSETTING_RULES__EEXPRESSION = "subsettedProperty->forAll(sp |\n" +
		"  self.type.conformsTo(sp.type) and\n" +
		"    ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies\n" +
		"      self.upperBound() <= sp.upperBound() ))";

	/**
	 * Validates the subsetting_rules constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_subsetting_rules(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "subsetting_rules",
				 PROPERTY__SUBSETTING_RULES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the binding_to_attribute constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__BINDING_TO_ATTRIBUTE__EEXPRESSION = "(self.isAttribute()\r\n" +
		"and (templateParameterSubstitution->notEmpty())\r\n" +
		"implies (templateParameterSubstitution->forAll(ts |\r\n" +
		"    ts.formal.oclIsKindOf(Property)\r\n" +
		"    and ts.formal.oclAsType(Property).isAttribute())))";

	/**
	 * Validates the binding_to_attribute constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_binding_to_attribute(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "binding_to_attribute",
				 PROPERTY__BINDING_TO_ATTRIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the derived_union_is_derived constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__DERIVED_UNION_IS_DERIVED__EEXPRESSION = "isDerivedUnion implies isDerived";

	/**
	 * Validates the derived_union_is_derived constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_derived_union_is_derived(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "derived_union_is_derived",
				 PROPERTY__DERIVED_UNION_IS_DERIVED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the deployment_target constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__DEPLOYMENT_TARGET__EEXPRESSION = "deployment->notEmpty() implies owner.oclIsKindOf(Node) and Node.allInstances()->exists(n | n.part->exists(p | p = self))";

	/**
	 * Validates the deployment_target constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_deployment_target(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "deployment_target",
				 PROPERTY__DEPLOYMENT_TARGET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the subsetted_property_names constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__SUBSETTED_PROPERTY_NAMES__EEXPRESSION = "subsettedProperty->forAll(sp | sp.name <> name)";

	/**
	 * Validates the subsetted_property_names constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_subsetted_property_names(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "subsetted_property_names",
				 PROPERTY__SUBSETTED_PROPERTY_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the type_of_opposite_end constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__TYPE_OF_OPPOSITE_END__EEXPRESSION = "(opposite->notEmpty() and owningAssociation->isEmpty()) implies classifier = opposite.type";

	/**
	 * Validates the type_of_opposite_end constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_type_of_opposite_end(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "type_of_opposite_end",
				 PROPERTY__TYPE_OF_OPPOSITE_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the qualified_is_association_end constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__QUALIFIED_IS_ASSOCIATION_END__EEXPRESSION = "qualifier->notEmpty() implies association->notEmpty()";

	/**
	 * Validates the qualified_is_association_end constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_qualified_is_association_end(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "qualified_is_association_end",
				 PROPERTY__QUALIFIED_IS_ASSOCIATION_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(operation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(operation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(operation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(operation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(operation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(operation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(operation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_consistent(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_non_leaf_redefinition(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_context_valid(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioralFeature_abstract_no_method(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_at_most_one_return(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_only_body_for_query(operation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the at_most_one_return constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__AT_MOST_ONE_RETURN__EEXPRESSION = "self.ownedParameter->select(direction = ParameterDirectionKind::return)->size() <= 1";

	/**
	 * Validates the at_most_one_return constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_at_most_one_return(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "at_most_one_return",
				 OPERATION__AT_MOST_ONE_RETURN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the only_body_for_query constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__ONLY_BODY_FOR_QUERY__EEXPRESSION = "bodyCondition <> null implies isQuery";

	/**
	 * Validates the only_body_for_query constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_only_body_for_query(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "only_body_for_query",
				 OPERATION__ONLY_BODY_FOR_QUERY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationTemplateParameter(OperationTemplateParameter operationTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationTemplateParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateTemplateParameter_must_be_compatible(operationTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationTemplateParameter_match_default_signature(operationTemplateParameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the match_default_signature constraint of '<em>Operation Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION_TEMPLATE_PARAMETER__MATCH_DEFAULT_SIGNATURE__EEXPRESSION = "default->notEmpty() implies (default.oclIsKindOf(Operation) and (let defaultOp : Operation = default.oclAsType(Operation) in \r\n" +
		"    defaultOp.ownedParameter->size() = parameteredElement.ownedParameter->size() and\r\n" +
		"    Sequence{1.. defaultOp.ownedParameter->size()}->forAll( ix | \r\n" +
		"        let p1: Parameter = defaultOp.ownedParameter->at(ix), p2 : Parameter = parameteredElement.ownedParameter->at(ix) in\r\n" +
		"          p1.type = p2.type and p1.upper = p2.upper and p1.lower = p2.lower and p1.direction = p2.direction and p1.isOrdered = p2.isOrdered and p1.isUnique = p2.isUnique)))";

	/**
	 * Validates the match_default_signature constraint of '<em>Operation Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationTemplateParameter_match_default_signature(OperationTemplateParameter operationTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.OPERATION_TEMPLATE_PARAMETER,
				 operationTemplateParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "match_default_signature",
				 OPERATION_TEMPLATE_PARAMETER__MATCH_DEFAULT_SIGNATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuralFeature(StructuralFeature structuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuralFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_consistent(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_non_leaf_redefinition(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_context_valid(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(structuralFeature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(structuralFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSet(ParameterSet parameterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterSet_same_parameterized_entity(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterSet_input(parameterSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterSet_two_parameter_sets(parameterSet, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the same_parameterized_entity constraint of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_SET__SAME_PARAMETERIZED_ENTITY__EEXPRESSION = "parameter->forAll(p1, p2 | self.owner = p1.owner and self.owner = p2.owner and p1.direction = p2.direction)";

	/**
	 * Validates the same_parameterized_entity constraint of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSet_same_parameterized_entity(ParameterSet parameterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PARAMETER_SET,
				 parameterSet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_parameterized_entity",
				 PARAMETER_SET__SAME_PARAMETERIZED_ENTITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the input constraint of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_SET__INPUT__EEXPRESSION = "((parameter->exists(direction = ParameterDirectionKind::_'in')) implies \r\n" +
		"    behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::_'in' and p.parameterSet->isEmpty())->forAll(isStream))\r\n" +
		"    and\r\n" +
		"((parameter->exists(direction = ParameterDirectionKind::out)) implies \r\n" +
		"    behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::out and p.parameterSet->isEmpty())->forAll(isStream))  \r\n" +
		"";

	/**
	 * Validates the input constraint of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSet_input(ParameterSet parameterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PARAMETER_SET,
				 parameterSet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "input",
				 PARAMETER_SET__INPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the two_parameter_sets constraint of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_SET__TWO_PARAMETER_SETS__EEXPRESSION = "parameter->forAll(parameterSet->forAll(s1, s2 | s1->size() = s2->size() implies s1.parameter->exists(p | not s2.parameter->includes(p))))";

	/**
	 * Validates the two_parameter_sets constraint of '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSet_two_parameter_sets(ParameterSet parameterSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.PARAMETER_SET,
				 parameterSet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "two_parameter_sets",
				 PARAMETER_SET__TWO_PARAMETER_SETS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classifierTemplateParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateTemplateParameter_must_be_compatible(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifierTemplateParameter_has_constraining_classifier(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifierTemplateParameter_parametered_element_no_features(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifierTemplateParameter_matching_abstract(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifierTemplateParameter_actual_is_classifier(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifierTemplateParameter_constraining_classifiers_constrain_args(classifierTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifierTemplateParameter_constraining_classifiers_constrain_parametered_element(classifierTemplateParameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the has_constraining_classifier constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER_TEMPLATE_PARAMETER__HAS_CONSTRAINING_CLASSIFIER__EEXPRESSION = "allowSubstitutable implies constrainingClassifier->notEmpty()";

	/**
	 * Validates the has_constraining_classifier constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter_has_constraining_classifier(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
				 classifierTemplateParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_constraining_classifier",
				 CLASSIFIER_TEMPLATE_PARAMETER__HAS_CONSTRAINING_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the parametered_element_no_features constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT_NO_FEATURES__EEXPRESSION = "parameteredElement.feature->isEmpty() and (constrainingClassifier->isEmpty() implies  parameteredElement.allParents()->isEmpty())";

	/**
	 * Validates the parametered_element_no_features constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter_parametered_element_no_features(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
				 classifierTemplateParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "parametered_element_no_features",
				 CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT_NO_FEATURES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the matching_abstract constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER_TEMPLATE_PARAMETER__MATCHING_ABSTRACT__EEXPRESSION = "(not parameteredElement.isAbstract) implies templateParameterSubstitution.actual->forAll(a | not a.oclAsType(Classifier).isAbstract)";

	/**
	 * Validates the matching_abstract constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter_matching_abstract(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
				 classifierTemplateParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "matching_abstract",
				 CLASSIFIER_TEMPLATE_PARAMETER__MATCHING_ABSTRACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the actual_is_classifier constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER_TEMPLATE_PARAMETER__ACTUAL_IS_CLASSIFIER__EEXPRESSION = " templateParameterSubstitution.actual->forAll(a | a.oclIsKindOf(Classifier))";

	/**
	 * Validates the actual_is_classifier constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter_actual_is_classifier(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
				 classifierTemplateParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "actual_is_classifier",
				 CLASSIFIER_TEMPLATE_PARAMETER__ACTUAL_IS_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the constraining_classifiers_constrain_args constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIERS_CONSTRAIN_ARGS__EEXPRESSION = "templateParameterSubstitution.actual->forAll( a |\r\n" +
		"  let arg : Classifier = a.oclAsType(Classifier) in\r\n" +
		"    constrainingClassifier->forAll(\r\n" +
		"      cc |  \r\n" +
		"         arg = cc or arg.conformsTo(cc) or (allowSubstitutable and arg.isSubstitutableFor(cc))\r\n" +
		"      )\r\n" +
		")";

	/**
	 * Validates the constraining_classifiers_constrain_args constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter_constraining_classifiers_constrain_args(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
				 classifierTemplateParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "constraining_classifiers_constrain_args",
				 CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIERS_CONSTRAIN_ARGS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the constraining_classifiers_constrain_parametered_element constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIERS_CONSTRAIN_PARAMETERED_ELEMENT__EEXPRESSION = "constrainingClassifier->forAll(\r\n" +
		"     cc |  parameteredElement = cc or parameteredElement.conformsTo(cc) or (allowSubstitutable and parameteredElement.isSubstitutableFor(cc))\r\n" +
		")\r\n" +
		"";

	/**
	 * Validates the constraining_classifiers_constrain_parametered_element constraint of '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifierTemplateParameter_constraining_classifiers_constrain_parametered_element(ClassifierTemplateParameter classifierTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER,
				 classifierTemplateParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "constraining_classifiers_constrain_parametered_element",
				 CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIERS_CONSTRAIN_PARAMETERED_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralization(Generalization generalization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(generalization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(generalization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSet(GeneralizationSet generalizationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalizationSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralizationSet_generalization_same_classifier(generalizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralizationSet_maps_to_generalization_set(generalizationSet, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the generalization_same_classifier constraint of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENERALIZATION_SET__GENERALIZATION_SAME_CLASSIFIER__EEXPRESSION = "generalization->collect(general)->asSet()->size() <= 1";

	/**
	 * Validates the generalization_same_classifier constraint of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSet_generalization_same_classifier(GeneralizationSet generalizationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.GENERALIZATION_SET,
				 generalizationSet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "generalization_same_classifier",
				 GENERALIZATION_SET__GENERALIZATION_SAME_CLASSIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maps_to_generalization_set constraint of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENERALIZATION_SET__MAPS_TO_GENERALIZATION_SET__EEXPRESSION = "powertype <> null implies generalization->forAll( gen | \r\n" +
		"    not (gen.general = powertype) and not gen.general.allParents()->includes(powertype) and not (gen.specific = powertype) and not powertype.allParents()->includes(gen.specific)\r\n" +
		"  )";

	/**
	 * Validates the maps_to_generalization_set constraint of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralizationSet_maps_to_generalization_set(GeneralizationSet generalizationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.GENERALIZATION_SET,
				 generalizationSet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "maps_to_generalization_set",
				 GENERALIZATION_SET__MAPS_TO_GENERALIZATION_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_deployment_artifact(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_structural_feature(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_defining_feature(instanceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstanceSpecification_deployment_target(instanceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the deployment_artifact constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCE_SPECIFICATION__DEPLOYMENT_ARTIFACT__EEXPRESSION = "deploymentForArtifact->notEmpty() implies classifier->exists(oclIsKindOf(Artifact))";

	/**
	 * Validates the deployment_artifact constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_deployment_artifact(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.INSTANCE_SPECIFICATION,
				 instanceSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "deployment_artifact",
				 INSTANCE_SPECIFICATION__DEPLOYMENT_ARTIFACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the structural_feature constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCE_SPECIFICATION__STRUCTURAL_FEATURE__EEXPRESSION = "classifier->forAll(c | (c.allSlottableFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <= 1)))";

	/**
	 * Validates the structural_feature constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_structural_feature(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.INSTANCE_SPECIFICATION,
				 instanceSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "structural_feature",
				 INSTANCE_SPECIFICATION__STRUCTURAL_FEATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the defining_feature constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCE_SPECIFICATION__DEFINING_FEATURE__EEXPRESSION = "slot->forAll(s | classifier->exists (c | c.allSlottableFeatures()->includes (s.definingFeature)))";

	/**
	 * Validates the defining_feature constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_defining_feature(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.INSTANCE_SPECIFICATION,
				 instanceSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "defining_feature",
				 INSTANCE_SPECIFICATION__DEFINING_FEATURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the deployment_target constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCE_SPECIFICATION__DEPLOYMENT_TARGET__EEXPRESSION = "deployment->notEmpty() implies classifier->exists(node | node.oclIsKindOf(Node) and Node.allInstances()->exists(n | n.part->exists(p | p.type = node)))";

	/**
	 * Validates the deployment_target constraint of '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceSpecification_deployment_target(InstanceSpecification instanceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.INSTANCE_SPECIFICATION,
				 instanceSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "deployment_target",
				 INSTANCE_SPECIFICATION__DEPLOYMENT_TARGET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(slot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(slot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(slot, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(slot, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(slot, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceValue(InstanceValue instanceValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(instanceValue, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(instanceValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableTemplateSignature(RedefinableTemplateSignature redefinableTemplateSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(redefinableTemplateSignature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_consistent(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_non_leaf_redefinition(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_context_valid(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateTemplateSignature_own_elements(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateTemplateSignature_unique_parameters(redefinableTemplateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableTemplateSignature_redefines_parents(redefinableTemplateSignature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the redefines_parents constraint of '<em>Redefinable Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINES_PARENTS__EEXPRESSION = "classifier.allParents()->forAll(c | c.ownedTemplateSignature->notEmpty() implies self->closure(extendedSignature)->includes(c.ownedTemplateSignature))";

	/**
	 * Validates the redefines_parents constraint of '<em>Redefinable Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinableTemplateSignature_redefines_parents(RedefinableTemplateSignature redefinableTemplateSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE,
				 redefinableTemplateSignature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "redefines_parents",
				 REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINES_PARENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_consistent(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_non_leaf_redefinition(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedefinableElement_redefinition_context_valid(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_specialize_type(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_maps_to_generalization_set(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_non_final_parents(classifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassifier_no_cycles_in_generalization(classifier, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the specialize_type constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER__SPECIALIZE_TYPE__EEXPRESSION = "parents()->forAll(c | self.maySpecializeType(c))";

	/**
	 * Validates the specialize_type constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_specialize_type(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER,
				 classifier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "specialize_type",
				 CLASSIFIER__SPECIALIZE_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maps_to_generalization_set constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER__MAPS_TO_GENERALIZATION_SET__EEXPRESSION = "powertypeExtent->forAll( gs | \r\n" +
		"  gs.generalization->forAll( gen | \r\n" +
		"    not (gen.general = self) and not gen.general.allParents()->includes(self) and not (gen.specific = self) and not self.allParents()->includes(gen.specific) \r\n" +
		"  ))";

	/**
	 * Validates the maps_to_generalization_set constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_maps_to_generalization_set(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER,
				 classifier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "maps_to_generalization_set",
				 CLASSIFIER__MAPS_TO_GENERALIZATION_SET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the non_final_parents constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER__NON_FINAL_PARENTS__EEXPRESSION = "parents()->forAll(not isFinalSpecialization)";

	/**
	 * Validates the non_final_parents constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_non_final_parents(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER,
				 classifier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "non_final_parents",
				 CLASSIFIER__NON_FINAL_PARENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_cycles_in_generalization constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFIER__NO_CYCLES_IN_GENERALIZATION__EEXPRESSION = "not allParents()->includes(self)";

	/**
	 * Validates the no_cycles_in_generalization constraint of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassifier_no_cycles_in_generalization(Classifier classifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClassificationPackage.Literals.CLASSIFIER,
				 classifier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_cycles_in_generalization",
				 CLASSIFIER__NO_CYCLES_IN_GENERALIZATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallConcurrencyKind(CallConcurrencyKind callConcurrencyKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationKind(AggregationKind aggregationKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDirectionKind(ParameterDirectionKind parameterDirectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterEffectKind(ParameterEffectKind parameterEffectKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ClassificationValidator
