/**
 */
package uml.simpleClassifiers.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.simpleClassifiers.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.simpleClassifiers.SimpleClassifiersPackage
 * @generated
 */
public class SimpleClassifiersValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimpleClassifiersValidator INSTANCE = new SimpleClassifiersValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.simpleClassifiers";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClassifiersValidator() {
		super();
		commonStructureValidator = CommonStructureValidator.INSTANCE;
		classificationValidator = ClassificationValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SimpleClassifiersPackage.eINSTANCE;
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
			case SimpleClassifiersPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case SimpleClassifiersPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case SimpleClassifiersPackage.RECEPTION:
				return validateReception((Reception)value, diagnostics, context);
			case SimpleClassifiersPackage.SIGNAL:
				return validateSignal((Signal)value, diagnostics, context);
			case SimpleClassifiersPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case SimpleClassifiersPackage.ENUMERATION_LITERAL:
				return validateEnumerationLiteral((EnumerationLiteral)value, diagnostics, context);
			case SimpleClassifiersPackage.INTERFACE_REALIZATION:
				return validateInterfaceRealization((InterfaceRealization)value, diagnostics, context);
			case SimpleClassifiersPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER:
				return validateBehavioredClassifier((BehavioredClassifier)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(dataType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(dataType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateInterface_visibility(interface_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the visibility constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERFACE__VISIBILITY__EEXPRESSION = "feature->forAll(visibility = VisibilityKind::public)";

	/**
	 * Validates the visibility constraint of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface_visibility(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimpleClassifiersPackage.Literals.INTERFACE,
				 interface_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "visibility",
				 INTERFACE__VISIBILITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReception(Reception reception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reception, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reception, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(reception, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(reception, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(reception, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(reception, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(reception, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(reception, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(reception, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(reception, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(reception, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(reception, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(reception, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateBehavioralFeature_abstract_no_method(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateReception_same_name_as_signal(reception, diagnostics, context);
		if (result || diagnostics != null) result &= validateReception_same_structure_as_signal(reception, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the same_name_as_signal constraint of '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECEPTION__SAME_NAME_AS_SIGNAL__EEXPRESSION = "name = signal.name";

	/**
	 * Validates the same_name_as_signal constraint of '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReception_same_name_as_signal(Reception reception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimpleClassifiersPackage.Literals.RECEPTION,
				 reception,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_name_as_signal",
				 RECEPTION__SAME_NAME_AS_SIGNAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the same_structure_as_signal constraint of '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RECEPTION__SAME_STRUCTURE_AS_SIGNAL__EEXPRESSION = "signal.ownedAttribute->size() = ownedParameter->size() and\r\n" +
		"Sequence{1..signal.ownedAttribute->size()}->forAll( i | \r\n" +
		"    ownedParameter->at(i).direction = ParameterDirectionKind::_'in' and \r\n" +
		"    ownedParameter->at(i).name = signal.ownedAttribute->at(i).name and\r\n" +
		"    ownedParameter->at(i).type = signal.ownedAttribute->at(i).type and\r\n" +
		"    ownedParameter->at(i).lowerBound() = signal.ownedAttribute->at(i).lowerBound() and\r\n" +
		"    ownedParameter->at(i).upperBound() = signal.ownedAttribute->at(i).upperBound()\r\n" +
		")";

	/**
	 * Validates the same_structure_as_signal constraint of '<em>Reception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReception_same_structure_as_signal(Reception reception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimpleClassifiersPackage.Literals.RECEPTION,
				 reception,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "same_structure_as_signal",
				 RECEPTION__SAME_STRUCTURE_AS_SIGNAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal(Signal signal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(signal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(signal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(signal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(signal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(signal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(signal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(signal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(signal, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(signal, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(signal, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(signal, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(signal, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(signal, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(signal, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(signal, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(signal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumeration_immutable(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the immutable constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENUMERATION__IMMUTABLE__EEXPRESSION = "ownedAttribute->forAll(isReadOnly)";

	/**
	 * Validates the immutable constraint of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration_immutable(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimpleClassifiersPackage.Literals.ENUMERATION,
				 enumeration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "immutable",
				 ENUMERATION__IMMUTABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationLiteral(EnumerationLiteral enumerationLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationLiteral, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateInstanceSpecification_deployment_artifact(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateInstanceSpecification_structural_feature(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateInstanceSpecification_defining_feature(enumerationLiteral, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateInstanceSpecification_deployment_target(enumerationLiteral, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceRealization(InterfaceRealization interfaceRealization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceRealization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(interfaceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(interfaceRealization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primitiveType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(primitiveType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioredClassifier(BehavioredClassifier behavioredClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behavioredClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(behavioredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehavioredClassifier_class_behavior(behavioredClassifier, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the class_behavior constraint of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BEHAVIORED_CLASSIFIER__CLASS_BEHAVIOR__EEXPRESSION = "classifierBehavior->notEmpty() implies classifierBehavior.specification->isEmpty()";

	/**
	 * Validates the class_behavior constraint of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioredClassifier_class_behavior(BehavioredClassifier behavioredClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimpleClassifiersPackage.Literals.BEHAVIORED_CLASSIFIER,
				 behavioredClassifier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "class_behavior",
				 BEHAVIORED_CLASSIFIER__CLASS_BEHAVIOR__EEXPRESSION,
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

} //SimpleClassifiersValidator
