/**
 */
package uml.packages.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.packages.Extension;
import uml.packages.ExtensionEnd;
import uml.packages.Image;
import uml.packages.Model;
import uml.packages.PackageMerge;
import uml.packages.PackagesPackage;
import uml.packages.Profile;
import uml.packages.ProfileApplication;
import uml.packages.Stereotype;

import uml.simpleClassifiers.util.SimpleClassifiersValidator;

import uml.structuredClassifiers.util.StructuredClassifiersValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.packages.PackagesPackage
 * @generated
 */
public class PackagesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PackagesValidator INSTANCE = new PackagesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.packages";

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
	protected StructuredClassifiersValidator structuredClassifiersValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleClassifiersValidator simpleClassifiersValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesValidator() {
		super();
		commonStructureValidator = CommonStructureValidator.INSTANCE;
		classificationValidator = ClassificationValidator.INSTANCE;
		structuredClassifiersValidator = StructuredClassifiersValidator.INSTANCE;
		simpleClassifiersValidator = SimpleClassifiersValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PackagesPackage.eINSTANCE;
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
			case PackagesPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case PackagesPackage.EXTENSION_END:
				return validateExtensionEnd((ExtensionEnd)value, diagnostics, context);
			case PackagesPackage.STEREOTYPE:
				return validateStereotype((Stereotype)value, diagnostics, context);
			case PackagesPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case PackagesPackage.PROFILE:
				return validateProfile((Profile)value, diagnostics, context);
			case PackagesPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case PackagesPackage.PACKAGE_MERGE:
				return validatePackageMerge((PackageMerge)value, diagnostics, context);
			case PackagesPackage.PROFILE_APPLICATION:
				return validateProfileApplication((ProfileApplication)value, diagnostics, context);
			case PackagesPackage.PACKAGE:
				return validatePackage((uml.packages.Package)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extension, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(extension, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(extension, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(extension, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(extension, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(extension, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(extension, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(extension, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(extension, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(extension, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(extension, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(extension, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(extension, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(extension, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(extension, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(extension, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(extension, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateAssociation_specialized_end_number(extension, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateAssociation_specialized_end_types(extension, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateAssociation_binary_associations(extension, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateAssociation_association_ends(extension, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateAssociation_ends_must_be_typed(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_non_owned_end(extension, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtension_is_binary(extension, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the non_owned_end constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION__NON_OWNED_END__EEXPRESSION = "metaclassEnd()->notEmpty() and metaclassEnd().type.oclIsKindOf(Class)";

	/**
	 * Validates the non_owned_end constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_non_owned_end(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.EXTENSION,
				 extension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "non_owned_end",
				 EXTENSION__NON_OWNED_END__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the is_binary constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION__IS_BINARY__EEXPRESSION = "memberEnd->size() = 2";

	/**
	 * Validates the is_binary constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_is_binary(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.EXTENSION,
				 extension,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "is_binary",
				 EXTENSION__IS_BINARY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionEnd(ExtensionEnd extensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extensionEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_subsetting_context_conforms(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_derived_union_is_read_only(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_multiplicity_of_composite(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_redefined_property_inherited(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_subsetting_rules(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_binding_to_attribute(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_derived_union_is_derived(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_deployment_target(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_subsetted_property_names(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_type_of_opposite_end(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_qualified_is_association_end(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtensionEnd_multiplicity(extensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtensionEnd_aggregation(extensionEnd, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION_END__MULTIPLICITY__EEXPRESSION = "(lowerBound() = 0 or lowerBound() = 1) and upperBound() = 1";

	/**
	 * Validates the multiplicity constraint of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionEnd_multiplicity(ExtensionEnd extensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.EXTENSION_END,
				 extensionEnd,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 EXTENSION_END__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the aggregation constraint of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION_END__AGGREGATION__EEXPRESSION = "self.aggregation = AggregationKind::composite";

	/**
	 * Validates the aggregation constraint of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionEnd_aggregation(ExtensionEnd extensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.EXTENSION_END,
				 extensionEnd,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "aggregation",
				 EXTENSION_END__AGGREGATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stereotype, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_binaryAssociationsOnly(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_generalize(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_name_not_clash(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_associationEndOwnership(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_base_property_upper_bound(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_base_property_multiplicity_single_extension(stereotype, diagnostics, context);
		if (result || diagnostics != null) result &= validateStereotype_base_property_multiplicity_multiple_extension(stereotype, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the binaryAssociationsOnly constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEREOTYPE__BINARY_ASSOCIATIONS_ONLY__EEXPRESSION = "ownedAttribute.association->forAll(memberEnd->size()=2)";

	/**
	 * Validates the binaryAssociationsOnly constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_binaryAssociationsOnly(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.STEREOTYPE,
				 stereotype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "binaryAssociationsOnly",
				 STEREOTYPE__BINARY_ASSOCIATIONS_ONLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the generalize constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEREOTYPE__GENERALIZE__EEXPRESSION = "allParents()->forAll(oclIsKindOf(Stereotype)) \r\n" +
		"and Classifier.allInstances()->forAll(c | c.allParents()->exists(oclIsKindOf(Stereotype)) implies c.oclIsKindOf(Stereotype))\r\n" +
		"";

	/**
	 * Validates the generalize constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_generalize(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.STEREOTYPE,
				 stereotype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "generalize",
				 STEREOTYPE__GENERALIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the name_not_clash constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_name_not_clash(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "name_not_clash", getObjectLabel(stereotype, context) },
						 new Object[] { stereotype },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the associationEndOwnership constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEREOTYPE__ASSOCIATION_END_OWNERSHIP__EEXPRESSION = "ownedAttribute\r\n" +
		"->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))\r\n" +
		"->forAll(opposite.owner = association)";

	/**
	 * Validates the associationEndOwnership constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_associationEndOwnership(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.STEREOTYPE,
				 stereotype,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "associationEndOwnership",
				 STEREOTYPE__ASSOCIATION_END_OWNERSHIP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the base_property_upper_bound constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_base_property_upper_bound(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "base_property_upper_bound", getObjectLabel(stereotype, context) },
						 new Object[] { stereotype },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the base_property_multiplicity_single_extension constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_base_property_multiplicity_single_extension(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "base_property_multiplicity_single_extension", getObjectLabel(stereotype, context) },
						 new Object[] { stereotype },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the base_property_multiplicity_multiple_extension constraint of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStereotype_base_property_multiplicity_multiple_extension(Stereotype stereotype, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "base_property_multiplicity_multiple_extension", getObjectLabel(stereotype, context) },
						 new Object[] { stereotype },
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
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(image, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(image, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(image, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(image, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(image, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(profile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(profile, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(profile, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(profile, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(profile, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(profile, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(profile, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(profile, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(profile, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(profile, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_elements_public_or_private(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateProfile_metaclass_reference_not_specialized(profile, diagnostics, context);
		if (result || diagnostics != null) result &= validateProfile_references_same_metamodel(profile, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the metaclass_reference_not_specialized constraint of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROFILE__METACLASS_REFERENCE_NOT_SPECIALIZED__EEXPRESSION = "metaclassReference.importedElement->\r\n" +
		"\tselect(c | c.oclIsKindOf(Classifier) and\r\n" +
		"\t\t(c.oclAsType(Classifier).allParents()->collect(namespace)->includes(self)))->isEmpty()\r\n" +
		"and \r\n" +
		"packagedElement->\r\n" +
		"    select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier).allParents())->\r\n" +
		"       intersection(metaclassReference.importedElement->select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier)))->isEmpty()";

	/**
	 * Validates the metaclass_reference_not_specialized constraint of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile_metaclass_reference_not_specialized(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.PROFILE,
				 profile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "metaclass_reference_not_specialized",
				 PROFILE__METACLASS_REFERENCE_NOT_SPECIALIZED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the references_same_metamodel constraint of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROFILE__REFERENCES_SAME_METAMODEL__EEXPRESSION = "metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages()->\r\n" +
		"  union(metaclassReference.importedElement.allOwningPackages() )->notEmpty()";

	/**
	 * Validates the references_same_metamodel constraint of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfile_references_same_metamodel(Profile profile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.PROFILE,
				 profile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "references_same_metamodel",
				 PROFILE__REFERENCES_SAME_METAMODEL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(model, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(model, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(model, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(model, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(model, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(model, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(model, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(model, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(model, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_elements_public_or_private(model, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageMerge(PackageMerge packageMerge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(packageMerge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(packageMerge, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(packageMerge, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProfileApplication(ProfileApplication profileApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(profileApplication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(profileApplication, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(profileApplication, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(uml.packages.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(package_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(package_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(package_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(package_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(package_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(package_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(package_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(package_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(package_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_elements_public_or_private(package_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the elements_public_or_private constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE__EEXPRESSION = "packagedElement->forAll(e | e.visibility<> null implies e.visibility = VisibilityKind::public or e.visibility = VisibilityKind::private)";

	/**
	 * Validates the elements_public_or_private constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_elements_public_or_private(uml.packages.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PackagesPackage.Literals.PACKAGE,
				 package_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "elements_public_or_private",
				 PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE__EEXPRESSION,
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

} //PackagesValidator
