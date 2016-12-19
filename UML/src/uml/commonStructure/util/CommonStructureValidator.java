/**
 */
package uml.commonStructure.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml.commonStructure.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see uml.commonStructure.CommonStructurePackage
 * @generated
 */
public class CommonStructureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CommonStructureValidator INSTANCE = new CommonStructureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "uml.commonStructure";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonStructureValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CommonStructurePackage.eINSTANCE;
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
			case CommonStructurePackage.ABSTRACTION:
				return validateAbstraction((Abstraction)value, diagnostics, context);
			case CommonStructurePackage.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case CommonStructurePackage.DIRECTED_RELATIONSHIP:
				return validateDirectedRelationship((DirectedRelationship)value, diagnostics, context);
			case CommonStructurePackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case CommonStructurePackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case CommonStructurePackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case CommonStructurePackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case CommonStructurePackage.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case CommonStructurePackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case CommonStructurePackage.REALIZATION:
				return validateRealization((Realization)value, diagnostics, context);
			case CommonStructurePackage.NAMESPACE:
				return validateNamespace((Namespace)value, diagnostics, context);
			case CommonStructurePackage.ELEMENT_IMPORT:
				return validateElementImport((ElementImport)value, diagnostics, context);
			case CommonStructurePackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case CommonStructurePackage.PACKAGE_IMPORT:
				return validatePackageImport((PackageImport)value, diagnostics, context);
			case CommonStructurePackage.MULTIPLICITY_ELEMENT:
				return validateMultiplicityElement((MultiplicityElement)value, diagnostics, context);
			case CommonStructurePackage.PARAMETERABLE_ELEMENT:
				return validateParameterableElement((ParameterableElement)value, diagnostics, context);
			case CommonStructurePackage.TEMPLATE_PARAMETER:
				return validateTemplateParameter((TemplateParameter)value, diagnostics, context);
			case CommonStructurePackage.TEMPLATE_SIGNATURE:
				return validateTemplateSignature((TemplateSignature)value, diagnostics, context);
			case CommonStructurePackage.TEMPLATEABLE_ELEMENT:
				return validateTemplateableElement((TemplateableElement)value, diagnostics, context);
			case CommonStructurePackage.TEMPLATE_BINDING:
				return validateTemplateBinding((TemplateBinding)value, diagnostics, context);
			case CommonStructurePackage.TEMPLATE_PARAMETER_SUBSTITUTION:
				return validateTemplateParameterSubstitution((TemplateParameterSubstitution)value, diagnostics, context);
			case CommonStructurePackage.USAGE:
				return validateUsage((Usage)value, diagnostics, context);
			case CommonStructurePackage.PACKAGEABLE_ELEMENT:
				return validatePackageableElement((PackageableElement)value, diagnostics, context);
			case CommonStructurePackage.VISIBILITY_KIND:
				return validateVisibilityKind((VisibilityKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstraction(Abstraction abstraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstraction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(abstraction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageableElement_namespace_needs_visibility(abstraction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(dependency, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageableElement_namespace_needs_visibility(dependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedRelationship(DirectedRelationship directedRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(directedRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(directedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(directedRelationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(relationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(element, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the has_owner constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ELEMENT__HAS_OWNER__EEXPRESSION = "mustBeOwned() implies owner->notEmpty()";

	/**
	 * Validates the has_owner constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_has_owner(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.ELEMENT,
				 element,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_owner",
				 ELEMENT__HAS_OWNER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the not_own_self constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ELEMENT__NOT_OWN_SELF__EEXPRESSION = "not allOwnedElements()->includes(self)";

	/**
	 * Validates the not_own_self constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_not_own_self(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.ELEMENT,
				 element,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_own_self",
				 ELEMENT__NOT_OWN_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(comment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the visibility_needs_ownership constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP__EEXPRESSION = "(namespace = null and owner <> null) implies visibility = null";

	/**
	 * Validates the visibility_needs_ownership constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_visibility_needs_ownership(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.NAMED_ELEMENT,
				 namedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "visibility_needs_ownership",
				 NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the has_qualified_name constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ELEMENT__HAS_QUALIFIED_NAME__EEXPRESSION = "(name <> null and allNamespaces()->select(ns | ns.name = null)->isEmpty()) implies\n" +
		"  qualifiedName = allNamespaces()->iterate( ns : Namespace; agg: String = name | ns.name.concat(self.separator()).concat(agg))";

	/**
	 * Validates the has_qualified_name constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_has_qualified_name(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.NAMED_ELEMENT,
				 namedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_qualified_name",
				 NAMED_ELEMENT__HAS_QUALIFIED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the has_no_qualified_name constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME__EEXPRESSION = "name=null or allNamespaces()->select( ns | ns.name=null )->notEmpty() implies qualifiedName = null";

	/**
	 * Validates the has_no_qualified_name constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_has_no_qualified_name(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.NAMED_ELEMENT,
				 namedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_no_qualified_name",
				 NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(typedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(typedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(typedElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(type, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(type, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageableElement_namespace_needs_visibility(type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealization(Realization realization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(realization, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageableElement_namespace_needs_visibility(realization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace(Namespace namespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namespace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_members_distinguishable(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_cannot_import_self(namespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamespace_cannot_import_ownedMembers(namespace, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the members_distinguishable constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMESPACE__MEMBERS_DISTINGUISHABLE__EEXPRESSION = "membersAreDistinguishable()";

	/**
	 * Validates the members_distinguishable constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace_members_distinguishable(Namespace namespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.NAMESPACE,
				 namespace,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "members_distinguishable",
				 NAMESPACE__MEMBERS_DISTINGUISHABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the cannot_import_self constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMESPACE__CANNOT_IMPORT_SELF__EEXPRESSION = "packageImport.importedPackage.oclAsType(Namespace)->excludes(self)";

	/**
	 * Validates the cannot_import_self constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace_cannot_import_self(Namespace namespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.NAMESPACE,
				 namespace,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "cannot_import_self",
				 NAMESPACE__CANNOT_IMPORT_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the cannot_import_ownedMembers constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMESPACE__CANNOT_IMPORT_OWNED_MEMBERS__EEXPRESSION = "elementImport.importedElement.oclAsType(Element)->excludesAll(ownedMember)";

	/**
	 * Validates the cannot_import_ownedMembers constraint of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespace_cannot_import_ownedMembers(Namespace namespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.NAMESPACE,
				 namespace,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "cannot_import_ownedMembers",
				 NAMESPACE__CANNOT_IMPORT_OWNED_MEMBERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementImport(ElementImport elementImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elementImport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementImport_imported_element_is_public(elementImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElementImport_visibility_public_or_private(elementImport, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the imported_element_is_public constraint of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC__EEXPRESSION = "importedElement.visibility <> null implies importedElement.visibility = VisibilityKind::public";

	/**
	 * Validates the imported_element_is_public constraint of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementImport_imported_element_is_public(ElementImport elementImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.ELEMENT_IMPORT,
				 elementImport,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "imported_element_is_public",
				 ELEMENT_IMPORT__IMPORTED_ELEMENT_IS_PUBLIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the visibility_public_or_private constraint of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE__EEXPRESSION = "visibility = VisibilityKind::public or visibility = VisibilityKind::private";

	/**
	 * Validates the visibility_public_or_private constraint of '<em>Element Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementImport_visibility_public_or_private(ElementImport elementImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.ELEMENT_IMPORT,
				 elementImport,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "visibility_public_or_private",
				 ELEMENT_IMPORT__VISIBILITY_PUBLIC_OR_PRIVATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageableElement_namespace_needs_visibility(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_boolean_value(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_no_side_effects(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_not_apply_to_self(constraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the boolean_value constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_boolean_value(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "boolean_value", getObjectLabel(constraint, context) },
						 new Object[] { constraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the no_side_effects constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_no_side_effects(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "no_side_effects", getObjectLabel(constraint, context) },
						 new Object[] { constraint },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the not_apply_to_self constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSTRAINT__NOT_APPLY_TO_SELF__EEXPRESSION = "not constrainedElement->includes(self)";

	/**
	 * Validates the not_apply_to_self constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_not_apply_to_self(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.CONSTRAINT,
				 constraint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_apply_to_self",
				 CONSTRAINT__NOT_APPLY_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageImport(PackageImport packageImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(packageImport, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(packageImport, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageImport_public_or_private(packageImport, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the public_or_private constraint of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PACKAGE_IMPORT__PUBLIC_OR_PRIVATE__EEXPRESSION = "visibility = VisibilityKind::public or visibility = VisibilityKind::private";

	/**
	 * Validates the public_or_private constraint of '<em>Package Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageImport_public_or_private(PackageImport packageImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.PACKAGE_IMPORT,
				 packageImport,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "public_or_private",
				 PACKAGE_IMPORT__PUBLIC_OR_PRIVATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiplicityElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upper_ge_lower(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lower_ge_0(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_value_specification_no_side_effects(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_value_specification_constant(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_lower_is_integer(multiplicityElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiplicityElement_upper_is_unlimitedNatural(multiplicityElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the upper_ge_lower constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIPLICITY_ELEMENT__UPPER_GE_LOWER__EEXPRESSION = "upperBound() >= lowerBound()";

	/**
	 * Validates the upper_ge_lower constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_upper_ge_lower(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT,
				 multiplicityElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "upper_ge_lower",
				 MULTIPLICITY_ELEMENT__UPPER_GE_LOWER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the lower_ge_0 constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIPLICITY_ELEMENT__LOWER_GE_0__EEXPRESSION = "lowerBound() >= 0";

	/**
	 * Validates the lower_ge_0 constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_lower_ge_0(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT,
				 multiplicityElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "lower_ge_0",
				 MULTIPLICITY_ELEMENT__LOWER_GE_0__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the value_specification_no_side_effects constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_value_specification_no_side_effects(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "value_specification_no_side_effects", getObjectLabel(multiplicityElement, context) },
						 new Object[] { multiplicityElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the value_specification_constant constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_value_specification_constant(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "value_specification_constant", getObjectLabel(multiplicityElement, context) },
						 new Object[] { multiplicityElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached validation expression for the lower_is_integer constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIPLICITY_ELEMENT__LOWER_IS_INTEGER__EEXPRESSION = "lowerValue <> null implies lowerValue.integerValue() <> null";

	/**
	 * Validates the lower_is_integer constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_lower_is_integer(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT,
				 multiplicityElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "lower_is_integer",
				 MULTIPLICITY_ELEMENT__LOWER_IS_INTEGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the upper_is_unlimitedNatural constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIPLICITY_ELEMENT__UPPER_IS_UNLIMITED_NATURAL__EEXPRESSION = "upperValue <> null implies upperValue.unlimitedValue() <> null";

	/**
	 * Validates the upper_is_unlimitedNatural constraint of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityElement_upper_is_unlimitedNatural(MultiplicityElement multiplicityElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT,
				 multiplicityElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "upper_is_unlimitedNatural",
				 MULTIPLICITY_ELEMENT__UPPER_IS_UNLIMITED_NATURAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterableElement(ParameterableElement parameterableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(parameterableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(parameterableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameter(TemplateParameter templateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(templateParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateParameter_must_be_compatible(templateParameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the must_be_compatible constraint of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEMPLATE_PARAMETER__MUST_BE_COMPATIBLE__EEXPRESSION = "default <> null implies default.isCompatibleWith(parameteredElement)";

	/**
	 * Validates the must_be_compatible constraint of '<em>Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameter_must_be_compatible(TemplateParameter templateParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.TEMPLATE_PARAMETER,
				 templateParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "must_be_compatible",
				 TEMPLATE_PARAMETER__MUST_BE_COMPATIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateSignature(TemplateSignature templateSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateSignature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateSignature_own_elements(templateSignature, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateSignature_unique_parameters(templateSignature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the own_elements constraint of '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEMPLATE_SIGNATURE__OWN_ELEMENTS__EEXPRESSION = "template.ownedElement->includesAll(parameter.parameteredElement->asSet() - parameter.ownedParameteredElement->asSet())";

	/**
	 * Validates the own_elements constraint of '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateSignature_own_elements(TemplateSignature templateSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.TEMPLATE_SIGNATURE,
				 templateSignature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "own_elements",
				 TEMPLATE_SIGNATURE__OWN_ELEMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the unique_parameters constraint of '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEMPLATE_SIGNATURE__UNIQUE_PARAMETERS__EEXPRESSION = "parameter->forAll( p1, p2 | (p1 <> p2 and p1.parameteredElement.oclIsKindOf(NamedElement) and p2.parameteredElement.oclIsKindOf(NamedElement) ) implies\r\n" +
		"   p1.parameteredElement.oclAsType(NamedElement).name <> p2.parameteredElement.oclAsType(NamedElement).name)";

	/**
	 * Validates the unique_parameters constraint of '<em>Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateSignature_unique_parameters(TemplateSignature templateSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.TEMPLATE_SIGNATURE,
				 templateSignature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "unique_parameters",
				 TEMPLATE_SIGNATURE__UNIQUE_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateableElement(TemplateableElement templateableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(templateableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(templateableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateBinding(TemplateBinding templateBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateBinding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateBinding_parameter_substitution_formal(templateBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateBinding_one_parameter_substitution(templateBinding, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the parameter_substitution_formal constraint of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEMPLATE_BINDING__PARAMETER_SUBSTITUTION_FORMAL__EEXPRESSION = "parameterSubstitution->forAll(b | signature.parameter->includes(b.formal))";

	/**
	 * Validates the parameter_substitution_formal constraint of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateBinding_parameter_substitution_formal(TemplateBinding templateBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.TEMPLATE_BINDING,
				 templateBinding,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "parameter_substitution_formal",
				 TEMPLATE_BINDING__PARAMETER_SUBSTITUTION_FORMAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the one_parameter_substitution constraint of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEMPLATE_BINDING__ONE_PARAMETER_SUBSTITUTION__EEXPRESSION = "signature.parameter->forAll(p | parameterSubstitution->select(b | b.formal = p)->size() <= 1)";

	/**
	 * Validates the one_parameter_substitution constraint of '<em>Template Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateBinding_one_parameter_substitution(TemplateBinding templateBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.TEMPLATE_BINDING,
				 templateBinding,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "one_parameter_substitution",
				 TEMPLATE_BINDING__ONE_PARAMETER_SUBSTITUTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameterSubstitution(TemplateParameterSubstitution templateParameterSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(templateParameterSubstitution, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(templateParameterSubstitution, diagnostics, context);
		if (result || diagnostics != null) result &= validateTemplateParameterSubstitution_must_be_compatible(templateParameterSubstitution, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the must_be_compatible constraint of '<em>Template Parameter Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TEMPLATE_PARAMETER_SUBSTITUTION__MUST_BE_COMPATIBLE__EEXPRESSION = "actual->forAll(a | a.isCompatibleWith(formal.parameteredElement))";

	/**
	 * Validates the must_be_compatible constraint of '<em>Template Parameter Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplateParameterSubstitution_must_be_compatible(TemplateParameterSubstitution templateParameterSubstitution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION,
				 templateParameterSubstitution,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "must_be_compatible",
				 TEMPLATE_PARAMETER_SUBSTITUTION__MUST_BE_COMPATIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsage(Usage usage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(usage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(usage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageableElement_namespace_needs_visibility(usage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageableElement(PackageableElement packageableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(packageableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_has_owner(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateElement_not_own_self(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_visibility_needs_ownership(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_qualified_name(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_has_no_qualified_name(packageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackageableElement_namespace_needs_visibility(packageableElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the namespace_needs_visibility constraint of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PACKAGEABLE_ELEMENT__NAMESPACE_NEEDS_VISIBILITY__EEXPRESSION = "visibility = null implies namespace = null";

	/**
	 * Validates the namespace_needs_visibility constraint of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageableElement_namespace_needs_visibility(PackageableElement packageableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(CommonStructurePackage.Literals.PACKAGEABLE_ELEMENT,
				 packageableElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "namespace_needs_visibility",
				 PACKAGEABLE_ELEMENT__NAMESPACE_NEEDS_VISIBILITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityKind(VisibilityKind visibilityKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //CommonStructureValidator
