/**
 */
package uml.useCases.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.simpleClassifiers.util.SimpleClassifiersValidator;

import uml.useCases.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.useCases.UseCasesPackage
 * @generated
 */
public class UseCasesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UseCasesValidator INSTANCE = new UseCasesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.useCases";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCasesValidator() {
		super();
		commonStructureValidator = CommonStructureValidator.INSTANCE;
		classificationValidator = ClassificationValidator.INSTANCE;
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
	  return UseCasesPackage.eINSTANCE;
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
			case UseCasesPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case UseCasesPackage.EXTEND:
				return validateExtend((Extend)value, diagnostics, context);
			case UseCasesPackage.EXTENSION_POINT:
				return validateExtensionPoint((ExtensionPoint)value, diagnostics, context);
			case UseCasesPackage.INCLUDE:
				return validateInclude((Include)value, diagnostics, context);
			case UseCasesPackage.USE_CASE:
				return validateUseCase((UseCase)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(actor, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(actor, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(actor, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(actor, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(actor, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(actor, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(actor, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(actor, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(actor, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(actor, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(actor, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(actor, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(actor, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(actor, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(actor, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(actor, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateActor_associations(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateActor_must_have_name(actor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the associations constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTOR__ASSOCIATIONS__EEXPRESSION = "Association.allInstances()->forAll( a |\n" +
		"  a.memberEnd->collect(type)->includes(self) implies\n" +
		"  (\n" +
		"    a.memberEnd->size() = 2 and\n" +
		"    let actorEnd : Property = a.memberEnd->any(type = self) in\n" +
		"      actorEnd.opposite.class.oclIsKindOf(UseCase) or\n" +
		"      ( actorEnd.opposite.class.oclIsKindOf(Class) and not\n" +
		"         actorEnd.opposite.class.oclIsKindOf(Behavior))\n" +
		"      )\n" +
		"  )";

	/**
	 * Validates the associations constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor_associations(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UseCasesPackage.Literals.ACTOR,
				 actor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "associations",
				 ACTOR__ASSOCIATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the must_have_name constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTOR__MUST_HAVE_NAME__EEXPRESSION = "name->notEmpty()";

	/**
	 * Validates the must_have_name constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor_must_have_name(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UseCasesPackage.Literals.ACTOR,
				 actor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "must_have_name",
				 ACTOR__MUST_HAVE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtend(Extend extend, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extend, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extend, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(extend, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(extend, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(extend, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(extend, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(extend, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtend_extension_points(extend, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the extension_points constraint of '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTEND__EXTENSION_POINTS__EEXPRESSION = "extensionLocation->forAll (xp | extendedCase.extensionPoint->includes(xp))";

	/**
	 * Validates the extension_points constraint of '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtend_extension_points(Extend extend, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UseCasesPackage.Literals.EXTEND,
				 extend,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "extension_points",
				 EXTEND__EXTENSION_POINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionPoint(ExtensionPoint extensionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extensionPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(extensionPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtensionPoint_must_have_name(extensionPoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the must_have_name constraint of '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXTENSION_POINT__MUST_HAVE_NAME__EEXPRESSION = "name->notEmpty ()";

	/**
	 * Validates the must_have_name constraint of '<em>Extension Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionPoint_must_have_name(ExtensionPoint extensionPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UseCasesPackage.Literals.EXTENSION_POINT,
				 extensionPoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "must_have_name",
				 EXTENSION_POINT__MUST_HAVE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInclude(Include include, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(include, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(include, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(include, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(include, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(include, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(include, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(include, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(include, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(useCase, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateUseCase_binary_associations(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateUseCase_no_association_to_use_case(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateUseCase_cannot_include_self(useCase, diagnostics, context);
		if (result || diagnostics != null) result &= validateUseCase_must_have_name(useCase, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the binary_associations constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USE_CASE__BINARY_ASSOCIATIONS__EEXPRESSION = "Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies a.memberEnd->size() = 2)";

	/**
	 * Validates the binary_associations constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase_binary_associations(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UseCasesPackage.Literals.USE_CASE,
				 useCase,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "binary_associations",
				 USE_CASE__BINARY_ASSOCIATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_association_to_use_case constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USE_CASE__NO_ASSOCIATION_TO_USE_CASE__EEXPRESSION = "Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies \r\n" +
		"   (\r\n" +
		"   let usecases: Set(UseCase) = a.memberEnd.type->select(oclIsKindOf(UseCase))->collect(oclAsType(UseCase))->asSet() in\r\n" +
		"   usecases->size() > 1 implies usecases->collect(subject)->size() > 1\r\n" +
		"   )\r\n" +
		")";

	/**
	 * Validates the no_association_to_use_case constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase_no_association_to_use_case(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UseCasesPackage.Literals.USE_CASE,
				 useCase,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_association_to_use_case",
				 USE_CASE__NO_ASSOCIATION_TO_USE_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the cannot_include_self constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USE_CASE__CANNOT_INCLUDE_SELF__EEXPRESSION = "not allIncludedUseCases()->includes(self)";

	/**
	 * Validates the cannot_include_self constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase_cannot_include_self(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UseCasesPackage.Literals.USE_CASE,
				 useCase,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "cannot_include_self",
				 USE_CASE__CANNOT_INCLUDE_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the must_have_name constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String USE_CASE__MUST_HAVE_NAME__EEXPRESSION = "name -> notEmpty ()";

	/**
	 * Validates the must_have_name constraint of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCase_must_have_name(UseCase useCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(UseCasesPackage.Literals.USE_CASE,
				 useCase,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "must_have_name",
				 USE_CASE__MUST_HAVE_NAME__EEXPRESSION,
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

} //UseCasesValidator
