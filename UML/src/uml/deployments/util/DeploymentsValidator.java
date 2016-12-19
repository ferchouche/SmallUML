/**
 */
package uml.deployments.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.deployments.*;

import uml.simpleClassifiers.util.SimpleClassifiersValidator;

import uml.structuredClassifiers.util.StructuredClassifiersValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.deployments.DeploymentsPackage
 * @generated
 */
public class DeploymentsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeploymentsValidator INSTANCE = new DeploymentsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.deployments";

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
	public DeploymentsValidator() {
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
	  return DeploymentsPackage.eINSTANCE;
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
			case DeploymentsPackage.ARTIFACT:
				return validateArtifact((Artifact)value, diagnostics, context);
			case DeploymentsPackage.DEPLOYED_ARTIFACT:
				return validateDeployedArtifact((DeployedArtifact)value, diagnostics, context);
			case DeploymentsPackage.MANIFESTATION:
				return validateManifestation((Manifestation)value, diagnostics, context);
			case DeploymentsPackage.COMMUNICATION_PATH:
				return validateCommunicationPath((CommunicationPath)value, diagnostics, context);
			case DeploymentsPackage.DEPLOYMENT:
				return validateDeployment((Deployment)value, diagnostics, context);
			case DeploymentsPackage.DEPLOYMENT_SPECIFICATION:
				return validateDeploymentSpecification((DeploymentSpecification)value, diagnostics, context);
			case DeploymentsPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case DeploymentsPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case DeploymentsPackage.EXECUTION_ENVIRONMENT:
				return validateExecutionEnvironment((ExecutionEnvironment)value, diagnostics, context);
			case DeploymentsPackage.DEPLOYMENT_TARGET:
				return validateDeploymentTarget((DeploymentTarget)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifact(Artifact artifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(artifact, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(artifact, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(artifact, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployedArtifact(DeployedArtifact deployedArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deployedArtifact, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(deployedArtifact, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(deployedArtifact, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManifestation(Manifestation manifestation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manifestation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(manifestation, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(manifestation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPath(CommunicationPath communicationPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communicationPath, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateAssociation_specialized_end_number(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateAssociation_specialized_end_types(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateAssociation_binary_associations(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommunicationPath_association_ends(communicationPath, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateAssociation_ends_must_be_typed(communicationPath, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the association_ends constraint of '<em>Communication Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMUNICATION_PATH__ASSOCIATION_ENDS__EEXPRESSION = "endType->forAll (oclIsKindOf(DeploymentTarget))";

	/**
	 * Validates the association_ends constraint of '<em>Communication Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationPath_association_ends(CommunicationPath communicationPath, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "association_ends", getObjectLabel(communicationPath, context) },
						 new Object[] { communicationPath },
						 context));
			}
			return false;
		}
		return structuredClassifiersValidator.validateAssociation_association_ends(communicationPath, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployment(Deployment deployment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deployment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(deployment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentSpecification(DeploymentSpecification deploymentSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deploymentSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeploymentSpecification_deployment_target(deploymentSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeploymentSpecification_deployed_elements(deploymentSpecification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the deployment_target constraint of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPLOYMENT_SPECIFICATION__DEPLOYMENT_TARGET__EEXPRESSION = "deployment->forAll (location.oclIsKindOf(ExecutionEnvironment))";

	/**
	 * Validates the deployment_target constraint of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentSpecification_deployment_target(DeploymentSpecification deploymentSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentsPackage.Literals.DEPLOYMENT_SPECIFICATION,
				 deploymentSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "deployment_target",
				 DEPLOYMENT_SPECIFICATION__DEPLOYMENT_TARGET__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the deployed_elements constraint of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEPLOYMENT_SPECIFICATION__DEPLOYED_ELEMENTS__EEXPRESSION = "deployment->forAll (location.deployedElement->forAll (oclIsKindOf(Component)))";

	/**
	 * Validates the deployed_elements constraint of '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentSpecification_deployed_elements(DeploymentSpecification deploymentSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentsPackage.Literals.DEPLOYMENT_SPECIFICATION,
				 deploymentSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "deployed_elements",
				 DEPLOYMENT_SPECIFICATION__DEPLOYED_ELEMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(device, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(device, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(device, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(device, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(device, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(device, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(device, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(device, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(device, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(device, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(device, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(device, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(device, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(device, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(device, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(device, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(device, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(device, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(device, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(device, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(device, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_internal_structure(device, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(node, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(node, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(node, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(node, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(node, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(node, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(node, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(node, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(node, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(node, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(node, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(node, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(node, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(node, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(node, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(node, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(node, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_internal_structure(node, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the internal_structure constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NODE__INTERNAL_STRUCTURE__EEXPRESSION = "part->forAll(oclIsKindOf(Node))";

	/**
	 * Validates the internal_structure constraint of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode_internal_structure(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DeploymentsPackage.Literals.NODE,
				 node,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "internal_structure",
				 NODE__INTERNAL_STRUCTURE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionEnvironment(ExecutionEnvironment executionEnvironment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionEnvironment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= structuredClassifiersValidator.validateClass_passive_class(executionEnvironment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNode_internal_structure(executionEnvironment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentTarget(DeploymentTarget deploymentTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deploymentTarget, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(deploymentTarget, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(deploymentTarget, diagnostics, context);
		return result;
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

} //DeploymentsValidator
