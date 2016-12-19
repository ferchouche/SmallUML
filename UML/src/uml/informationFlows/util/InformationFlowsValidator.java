/**
 */
package uml.informationFlows.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.informationFlows.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.informationFlows.InformationFlowsPackage
 * @generated
 */
public class InformationFlowsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final InformationFlowsValidator INSTANCE = new InformationFlowsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.informationFlows";

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
	public InformationFlowsValidator() {
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
	  return InformationFlowsPackage.eINSTANCE;
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
			case InformationFlowsPackage.INFORMATION_FLOW:
				return validateInformationFlow((InformationFlow)value, diagnostics, context);
			case InformationFlowsPackage.INFORMATION_ITEM:
				return validateInformationItem((InformationItem)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationFlow(InformationFlow informationFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(informationFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationFlow_must_conform(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationFlow_sources_and_targets_kind(informationFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationFlow_convey_classifiers(informationFlow, diagnostics, context);
		return result;
	}

	/**
	 * Validates the must_conform constraint of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationFlow_must_conform(InformationFlow informationFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "must_conform", getObjectLabel(informationFlow, context) },
						 new Object[] { informationFlow },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the sources_and_targets_kind constraint of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFORMATION_FLOW__SOURCES_AND_TARGETS_KIND__EEXPRESSION = "(self.informationSource->forAll( sis |\r\n" +
		"  oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or \r\n" +
		"  oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or \r\n" +
		"  oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or \r\n" +
		"  (oclIsKindOf(InstanceSpecification) and not sis.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship))))) \r\n" +
		"\r\n" +
		"and\r\n" +
		"\r\n" +
		"(self.informationTarget->forAll( sit | \r\n" +
		"  oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or \r\n" +
		"  oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or \r\n" +
		"  oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or \r\n" +
		"(oclIsKindOf(InstanceSpecification) and not sit.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship)))))";

	/**
	 * Validates the sources_and_targets_kind constraint of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationFlow_sources_and_targets_kind(InformationFlow informationFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InformationFlowsPackage.Literals.INFORMATION_FLOW,
				 informationFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "sources_and_targets_kind",
				 INFORMATION_FLOW__SOURCES_AND_TARGETS_KIND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the convey_classifiers constraint of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFORMATION_FLOW__CONVEY_CLASSIFIERS__EEXPRESSION = "self.conveyed->forAll(oclIsKindOf(Class) or oclIsKindOf(Interface)\r\n" +
		"  or oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component))";

	/**
	 * Validates the convey_classifiers constraint of '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationFlow_convey_classifiers(InformationFlow informationFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InformationFlowsPackage.Literals.INFORMATION_FLOW,
				 informationFlow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "convey_classifiers",
				 INFORMATION_FLOW__CONVEY_CLASSIFIERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationItem(InformationItem informationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(informationItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationItem_sources_and_targets(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationItem_has_no(informationItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationItem_not_instantiable(informationItem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sources_and_targets constraint of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFORMATION_ITEM__SOURCES_AND_TARGETS__EEXPRESSION = "(self.represented->select(oclIsKindOf(InformationItem))->forAll(p |\r\n" +
		"  p.conveyingFlow.source->forAll(q | self.conveyingFlow.source->includes(q)) and\r\n" +
		"    p.conveyingFlow.target->forAll(q | self.conveyingFlow.target->includes(q)))) and\r\n" +
		"      (self.represented->forAll(oclIsKindOf(Class) or oclIsKindOf(Interface) or\r\n" +
		"        oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component)))";

	/**
	 * Validates the sources_and_targets constraint of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationItem_sources_and_targets(InformationItem informationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InformationFlowsPackage.Literals.INFORMATION_ITEM,
				 informationItem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "sources_and_targets",
				 INFORMATION_ITEM__SOURCES_AND_TARGETS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the has_no constraint of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFORMATION_ITEM__HAS_NO__EEXPRESSION = "self.generalization->isEmpty() and self.feature->isEmpty()";

	/**
	 * Validates the has_no constraint of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationItem_has_no(InformationItem informationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InformationFlowsPackage.Literals.INFORMATION_ITEM,
				 informationItem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_no",
				 INFORMATION_ITEM__HAS_NO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the not_instantiable constraint of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFORMATION_ITEM__NOT_INSTANTIABLE__EEXPRESSION = "isAbstract";

	/**
	 * Validates the not_instantiable constraint of '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationItem_not_instantiable(InformationItem informationItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(InformationFlowsPackage.Literals.INFORMATION_ITEM,
				 informationItem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_instantiable",
				 INFORMATION_ITEM__NOT_INSTANTIABLE__EEXPRESSION,
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

} //InformationFlowsValidator
