/**
 */
package uml.structuredClassifiers.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.classification.util.ClassificationValidator;

import uml.commonStructure.util.CommonStructureValidator;

import uml.simpleClassifiers.util.SimpleClassifiersValidator;

import uml.structuredClassifiers.Association;
import uml.structuredClassifiers.AssociationClass;
import uml.structuredClassifiers.Collaboration;
import uml.structuredClassifiers.CollaborationUse;
import uml.structuredClassifiers.Component;
import uml.structuredClassifiers.ComponentRealization;
import uml.structuredClassifiers.ConnectableElement;
import uml.structuredClassifiers.ConnectableElementTemplateParameter;
import uml.structuredClassifiers.Connector;
import uml.structuredClassifiers.ConnectorEnd;
import uml.structuredClassifiers.ConnectorKind;
import uml.structuredClassifiers.EncapsulatedClassifier;
import uml.structuredClassifiers.Port;
import uml.structuredClassifiers.StructuredClassifier;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.structuredClassifiers.StructuredClassifiersPackage
 * @generated
 */
public class StructuredClassifiersValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StructuredClassifiersValidator INSTANCE = new StructuredClassifiersValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.structuredClassifiers";

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
	public StructuredClassifiersValidator() {
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
	  return StructuredClassifiersPackage.eINSTANCE;
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
			case StructuredClassifiersPackage.ASSOCIATION_CLASS:
				return validateAssociationClass((AssociationClass)value, diagnostics, context);
			case StructuredClassifiersPackage.CLASS:
				return validateClass((uml.structuredClassifiers.Class)value, diagnostics, context);
			case StructuredClassifiersPackage.CONNECTABLE_ELEMENT:
				return validateConnectableElement((ConnectableElement)value, diagnostics, context);
			case StructuredClassifiersPackage.CONNECTOR_END:
				return validateConnectorEnd((ConnectorEnd)value, diagnostics, context);
			case StructuredClassifiersPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case StructuredClassifiersPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER:
				return validateConnectableElementTemplateParameter((ConnectableElementTemplateParameter)value, diagnostics, context);
			case StructuredClassifiersPackage.COLLABORATION_USE:
				return validateCollaborationUse((CollaborationUse)value, diagnostics, context);
			case StructuredClassifiersPackage.COLLABORATION:
				return validateCollaboration((Collaboration)value, diagnostics, context);
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER:
				return validateStructuredClassifier((StructuredClassifier)value, diagnostics, context);
			case StructuredClassifiersPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case StructuredClassifiersPackage.ENCAPSULATED_CLASSIFIER:
				return validateEncapsulatedClassifier((EncapsulatedClassifier)value, diagnostics, context);
			case StructuredClassifiersPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case StructuredClassifiersPackage.COMPONENT_REALIZATION:
				return validateComponentRealization((ComponentRealization)value, diagnostics, context);
			case StructuredClassifiersPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case StructuredClassifiersPackage.CONNECTOR_KIND:
				return validateConnectorKind((ConnectorKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationClass(AssociationClass associationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(associationClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passive_class(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specialized_end_number(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specialized_end_types(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_binary_associations(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_association_ends(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_ends_must_be_typed(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationClass_cannot_be_defined(associationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociationClass_disjoint_attributes_ends(associationClass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the cannot_be_defined constraint of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION_CLASS__CANNOT_BE_DEFINED__EEXPRESSION = "self.endType()->excludes(self) and self.endType()->collect(et|et.oclAsType(Classifier).allParents())->flatten()->excludes(self)";

	/**
	 * Validates the cannot_be_defined constraint of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationClass_cannot_be_defined(AssociationClass associationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.ASSOCIATION_CLASS,
				 associationClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "cannot_be_defined",
				 ASSOCIATION_CLASS__CANNOT_BE_DEFINED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the disjoint_attributes_ends constraint of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION_CLASS__DISJOINT_ATTRIBUTES_ENDS__EEXPRESSION = "ownedAttribute->intersection(ownedEnd)->isEmpty()";

	/**
	 * Validates the disjoint_attributes_ends constraint of '<em>Association Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationClass_disjoint_attributes_ends(AssociationClass associationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.ASSOCIATION_CLASS,
				 associationClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "disjoint_attributes_ends",
				 ASSOCIATION_CLASS__DISJOINT_ATTRIBUTES_ENDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(uml.structuredClassifiers.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(class_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(class_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(class_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(class_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(class_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(class_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(class_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(class_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(class_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(class_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(class_, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(class_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(class_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(class_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(class_, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(class_, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passive_class(class_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the passive_class constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASS__PASSIVE_CLASS__EEXPRESSION = "not isActive implies (ownedReception->isEmpty() and classifierBehavior = null)";

	/**
	 * Validates the passive_class constraint of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass_passive_class(uml.structuredClassifiers.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.CLASS,
				 class_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "passive_class",
				 CLASS__PASSIVE_CLASS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectableElement(ConnectableElement connectableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(connectableElement, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(connectableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectorEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorEnd_role_and_part_with_port(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorEnd_part_with_port_empty(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorEnd_multiplicity(connectorEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectorEnd_self_part_with_port(connectorEnd, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the role_and_part_with_port constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_END__ROLE_AND_PART_WITH_PORT__EEXPRESSION = "partWithPort->notEmpty() implies \r\n" +
		"  (role.oclIsKindOf(Port) and partWithPort.type.oclAsType(Namespace).member->includes(role))";

	/**
	 * Validates the role_and_part_with_port constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd_role_and_part_with_port(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.CONNECTOR_END,
				 connectorEnd,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "role_and_part_with_port",
				 CONNECTOR_END__ROLE_AND_PART_WITH_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the part_with_port_empty constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_END__PART_WITH_PORT_EMPTY__EEXPRESSION = "(role.oclIsKindOf(Port) and role.owner = connector.owner) implies partWithPort->isEmpty()";

	/**
	 * Validates the part_with_port_empty constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd_part_with_port_empty(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.CONNECTOR_END,
				 connectorEnd,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "part_with_port_empty",
				 CONNECTOR_END__PART_WITH_PORT_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the multiplicity constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_END__MULTIPLICITY__EEXPRESSION = "self.compatibleWith(definingEnd)";

	/**
	 * Validates the multiplicity constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd_multiplicity(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.CONNECTOR_END,
				 connectorEnd,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "multiplicity",
				 CONNECTOR_END__MULTIPLICITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the self_part_with_port constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR_END__SELF_PART_WITH_PORT__EEXPRESSION = "partWithPort->notEmpty() implies not partWithPort.oclIsKindOf(Port)";

	/**
	 * Validates the self_part_with_port constraint of '<em>Connector End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd_self_part_with_port(ConnectorEnd connectorEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.CONNECTOR_END,
				 connectorEnd,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "self_part_with_port",
				 CONNECTOR_END__SELF_PART_WITH_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_ge_lower(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_ge_0(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_no_side_effects(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_value_specification_constant(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_lower_is_integer(port, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateMultiplicityElement_upper_is_unlimitedNatural(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_subsetting_context_conforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_derived_union_is_read_only(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_multiplicity_of_composite(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_redefined_property_inherited(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_subsetting_rules(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_binding_to_attribute(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_derived_union_is_derived(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_deployment_target(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_subsetted_property_names(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_type_of_opposite_end(port, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateProperty_qualified_is_association_end(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_port_aggregation(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_default_value(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_encapsulated_owner(port, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the port_aggregation constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT__PORT_AGGREGATION__EEXPRESSION = "aggregation = AggregationKind::composite";

	/**
	 * Validates the port_aggregation constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_port_aggregation(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.PORT,
				 port,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "port_aggregation",
				 PORT__PORT_AGGREGATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the default_value constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT__DEFAULT_VALUE__EEXPRESSION = "type.oclIsKindOf(Interface) implies defaultValue->isEmpty()";

	/**
	 * Validates the default_value constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_default_value(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.PORT,
				 port,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "default_value",
				 PORT__DEFAULT_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the encapsulated_owner constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PORT__ENCAPSULATED_OWNER__EEXPRESSION = "owner = encapsulatedClassifier";

	/**
	 * Validates the encapsulated_owner constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_encapsulated_owner(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.PORT,
				 port,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "encapsulated_owner",
				 PORT__ENCAPSULATED_OWNER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectableElementTemplateParameter(ConnectableElementTemplateParameter connectableElementTemplateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectableElementTemplateParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(connectableElementTemplateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateTemplateParameter_must_be_compatible(connectableElementTemplateParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationUse(CollaborationUse collaborationUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collaborationUse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollaborationUse_client_elements(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollaborationUse_every_role(collaborationUse, diagnostics, context);
		if (result || diagnostics != null) result &= validateCollaborationUse_connectors(collaborationUse, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the client_elements constraint of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLLABORATION_USE__CLIENT_ELEMENTS__EEXPRESSION = "roleBinding->collect(client)->forAll(ne1, ne2 |\r\n" +
		"  ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and\r\n" +
		"    let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in\r\n" +
		"      ce1.structuredClassifier = ce2.structuredClassifier)\r\n" +
		"and\r\n" +
		"  roleBinding->collect(supplier)->forAll(ne1, ne2 |\r\n" +
		"  ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and\r\n" +
		"    let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in\r\n" +
		"      ce1.collaboration = ce2.collaboration)";

	/**
	 * Validates the client_elements constraint of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationUse_client_elements(CollaborationUse collaborationUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.COLLABORATION_USE,
				 collaborationUse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "client_elements",
				 COLLABORATION_USE__CLIENT_ELEMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the every_role constraint of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLLABORATION_USE__EVERY_ROLE__EEXPRESSION = "type.collaborationRole->forAll(role | roleBinding->exists(rb | rb.supplier->includes(role)))";

	/**
	 * Validates the every_role constraint of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationUse_every_role(CollaborationUse collaborationUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.COLLABORATION_USE,
				 collaborationUse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "every_role",
				 COLLABORATION_USE__EVERY_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the connectors constraint of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COLLABORATION_USE__CONNECTORS__EEXPRESSION = "type.ownedConnector->forAll(connector |\r\n" +
		"  let rolesConnectedInCollab : Set(ConnectableElement) = connector.end.role->asSet(),\r\n" +
		"        relevantBindings : Set(Dependency) = roleBinding->select(rb | rb.supplier->intersection(rolesConnectedInCollab)->notEmpty()),\r\n" +
		"        boundRoles : Set(ConnectableElement) = relevantBindings->collect(client.oclAsType(ConnectableElement))->asSet(),\r\n" +
		"        contextClassifier : StructuredClassifier = boundRoles->any(true).structuredClassifier->any(true) in\r\n" +
		"          contextClassifier.ownedConnector->exists( correspondingConnector | \r\n" +
		"              correspondingConnector.end.role->forAll( role | boundRoles->includes(role) )\r\n" +
		"              and (connector.type->notEmpty() and correspondingConnector.type->notEmpty()) implies connector.type->forAll(conformsTo(correspondingConnector.type)) )\r\n" +
		")";

	/**
	 * Validates the connectors constraint of '<em>Collaboration Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaborationUse_connectors(CollaborationUse collaborationUse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.COLLABORATION_USE,
				 collaborationUse,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "connectors",
				 COLLABORATION_USE__CONNECTORS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollaboration(Collaboration collaboration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(collaboration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(collaboration, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(collaboration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredClassifier(StructuredClassifier structuredClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuredClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(structuredClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(structuredClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(connector, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(connector, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(connector, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(connector, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(connector, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(connector, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(connector, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_types(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_roles(connector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the types constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__TYPES__EEXPRESSION = "type<>null implies \r\n" +
		"  let noOfEnds : Integer = end->size() in \r\n" +
		"  (type.memberEnd->size() = noOfEnds) and Sequence{1..noOfEnds}->forAll(i | end->at(i).role.type.conformsTo(type.memberEnd->at(i).type))";

	/**
	 * Validates the types constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_types(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "types",
				 CONNECTOR__TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the roles constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__ROLES__EEXPRESSION = "structuredClassifier <> null\r\n" +
		"and\r\n" +
		"  end->forAll( e | structuredClassifier.allRoles()->includes(e.role)\r\n" +
		"or\r\n" +
		"  e.role.oclIsKindOf(Port) and structuredClassifier.allRoles()->includes(e.partWithPort))";

	/**
	 * Validates the roles constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_roles(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "roles",
				 CONNECTOR__ROLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncapsulatedClassifier(EncapsulatedClassifier encapsulatedClassifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encapsulatedClassifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(encapsulatedClassifier, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(encapsulatedClassifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(component, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(component, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(component, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(component, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(component, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(component, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(component, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(component, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(component, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(component, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(component, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(component, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(component, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(component, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(component, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(component, diagnostics, context);
		if (result || diagnostics != null) result &= simpleClassifiersValidator.validateBehavioredClassifier_class_behavior(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateClass_passive_class(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_no_nested_classifiers(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_no_packaged_elements(component, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the no_nested_classifiers constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT__NO_NESTED_CLASSIFIERS__EEXPRESSION = "nestedClassifier->isEmpty()";

	/**
	 * Validates the no_nested_classifiers constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_no_nested_classifiers(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.COMPONENT,
				 component,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_nested_classifiers",
				 COMPONENT__NO_NESTED_CLASSIFIERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_packaged_elements constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENT__NO_PACKAGED_ELEMENTS__EEXPRESSION = "nestingClass <> null implies packagedElement->isEmpty()";

	/**
	 * Validates the no_packaged_elements constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_no_packaged_elements(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.COMPONENT,
				 component,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "no_packaged_elements",
				 COMPONENT__NO_PACKAGED_ELEMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentRealization(ComponentRealization componentRealization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentRealization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(componentRealization, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(componentRealization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_has_owner(association, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateElement_not_own_self(association, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_visibility_needs_ownership(association, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_qualified_name(association, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamedElement_has_no_qualified_name(association, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_members_distinguishable(association, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_self(association, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validateNamespace_cannot_import_ownedMembers(association, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_consistent(association, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_non_leaf_redefinition(association, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateRedefinableElement_redefinition_context_valid(association, diagnostics, context);
		if (result || diagnostics != null) result &= commonStructureValidator.validatePackageableElement_namespace_needs_visibility(association, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_specialize_type(association, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_maps_to_generalization_set(association, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_non_final_parents(association, diagnostics, context);
		if (result || diagnostics != null) result &= classificationValidator.validateClassifier_no_cycles_in_generalization(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specialized_end_number(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_specialized_end_types(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_binary_associations(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_association_ends(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_ends_must_be_typed(association, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the specialized_end_number constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__SPECIALIZED_END_NUMBER__EEXPRESSION = "parents()->select(oclIsKindOf(Association)).oclAsType(Association)->forAll(p | p.memberEnd->size() = self.memberEnd->size())";

	/**
	 * Validates the specialized_end_number constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_specialized_end_number(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "specialized_end_number",
				 ASSOCIATION__SPECIALIZED_END_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the specialized_end_types constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__SPECIALIZED_END_TYPES__EEXPRESSION = "Sequence{1..memberEnd->size()}->\r\n" +
		"\tforAll(i | general->select(oclIsKindOf(Association)).oclAsType(Association)->\r\n" +
		"\t\tforAll(ga | self.memberEnd->at(i).type.conformsTo(ga.memberEnd->at(i).type)))";

	/**
	 * Validates the specialized_end_types constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_specialized_end_types(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "specialized_end_types",
				 ASSOCIATION__SPECIALIZED_END_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the binary_associations constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__BINARY_ASSOCIATIONS__EEXPRESSION = "memberEnd->exists(aggregation <> AggregationKind::none) implies (memberEnd->size() = 2 and memberEnd->exists(aggregation = AggregationKind::none))";

	/**
	 * Validates the binary_associations constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_binary_associations(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "binary_associations",
				 ASSOCIATION__BINARY_ASSOCIATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the association_ends constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__ASSOCIATION_ENDS__EEXPRESSION = "memberEnd->size() > 2 implies ownedEnd->includesAll(memberEnd)";

	/**
	 * Validates the association_ends constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_association_ends(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "association_ends",
				 ASSOCIATION__ASSOCIATION_ENDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ends_must_be_typed constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASSOCIATION__ENDS_MUST_BE_TYPED__EEXPRESSION = "memberEnd->forAll(type->notEmpty())";

	/**
	 * Validates the ends_must_be_typed constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_ends_must_be_typed(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StructuredClassifiersPackage.Literals.ASSOCIATION,
				 association,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ends_must_be_typed",
				 ASSOCIATION__ENDS_MUST_BE_TYPED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorKind(ConnectorKind connectorKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //StructuredClassifiersValidator
