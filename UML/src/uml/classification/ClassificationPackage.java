/**
 */
package uml.classification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uml.commonStructure.CommonStructurePackage;

import uml.deployments.DeploymentsPackage;

import uml.structuredClassifiers.StructuredClassifiersPackage;

import uml.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uml.classification.ClassificationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Classification'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ClassificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "classification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/classification.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.classification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassificationPackage eINSTANCE = uml.classification.impl.ClassificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.classification.impl.SubstitutionImpl <em>Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.SubstitutionImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getSubstitution()
	 * @generated
	 */
	int SUBSTITUTION = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__OWNED_COMMENT = CommonStructurePackage.REALIZATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__OWNED_ELEMENT = CommonStructurePackage.REALIZATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__OWNER = CommonStructurePackage.REALIZATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__NAME = CommonStructurePackage.REALIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__NAME_EXPRESSION = CommonStructurePackage.REALIZATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__NAMESPACE = CommonStructurePackage.REALIZATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__QUALIFIED_NAME = CommonStructurePackage.REALIZATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__VISIBILITY = CommonStructurePackage.REALIZATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__CLIENT_DEPENDENCY = CommonStructurePackage.REALIZATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.REALIZATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__TEMPLATE_PARAMETER = CommonStructurePackage.REALIZATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__RELATED_ELEMENT = CommonStructurePackage.REALIZATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__SOURCE = CommonStructurePackage.REALIZATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__TARGET = CommonStructurePackage.REALIZATION__TARGET;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__CLIENT = CommonStructurePackage.REALIZATION__CLIENT;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__SUPPLIER = CommonStructurePackage.REALIZATION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__MAPPING = CommonStructurePackage.REALIZATION__MAPPING;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__CONTRACT = CommonStructurePackage.REALIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Substituting Classifier</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION__SUBSTITUTING_CLASSIFIER = CommonStructurePackage.REALIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_FEATURE_COUNT = CommonStructurePackage.REALIZATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___ALL_OWNED_ELEMENTS = CommonStructurePackage.REALIZATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___MUST_BE_OWNED = CommonStructurePackage.REALIZATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___ALL_NAMESPACES = CommonStructurePackage.REALIZATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___ALL_OWNING_PACKAGES = CommonStructurePackage.REALIZATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.REALIZATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___QUALIFIED_NAME = CommonStructurePackage.REALIZATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___SEPARATOR = CommonStructurePackage.REALIZATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___CLIENT_DEPENDENCY = CommonStructurePackage.REALIZATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.REALIZATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION___IS_TEMPLATE_PARAMETER = CommonStructurePackage.REALIZATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTION_OPERATION_COUNT = CommonStructurePackage.REALIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.classification.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.BehavioralFeatureImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getBehavioralFeature()
	 * @generated
	 */
	int BEHAVIORAL_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_COMMENT = CommonStructurePackage.NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_ELEMENT = CommonStructurePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNER = CommonStructurePackage.NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__NAME = CommonStructurePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__NAME_EXPRESSION = CommonStructurePackage.NAMESPACE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__NAMESPACE = CommonStructurePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__QUALIFIED_NAME = CommonStructurePackage.NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__VISIBILITY = CommonStructurePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__ELEMENT_IMPORT = CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__MEMBER = CommonStructurePackage.NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_MEMBER = CommonStructurePackage.NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_RULE = CommonStructurePackage.NAMESPACE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__PACKAGE_IMPORT = CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__IS_LEAF = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__REDEFINED_ELEMENT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__IS_STATIC = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__CONCURRENCY = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__IS_ABSTRACT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__METHOD = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_PARAMETER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__RAISED_EXCEPTION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_FEATURE_COUNT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___MUST_BE_OWNED = CommonStructurePackage.NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___ALL_NAMESPACES = CommonStructurePackage.NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMESPACE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMESPACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___QUALIFIED_NAME = CommonStructurePackage.NAMESPACE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___SEPARATOR = CommonStructurePackage.NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___EXCLUDE_COLLISIONS__ELIST = CommonStructurePackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonStructurePackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___IMPORT_MEMBERS__ELIST = CommonStructurePackage.NAMESPACE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___MEMBERS_ARE_DISTINGUISHABLE = CommonStructurePackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___INPUT_PARAMETERS = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE___OUTPUT_PARAMETERS = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_OPERATION_COUNT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml.classification.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.RedefinableElementImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getRedefinableElement()
	 * @generated
	 */
	int REDEFINABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__IS_LEAF = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__REDEFINED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Redefinable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Redefinable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml.classification.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.FeatureImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_COMMENT = REDEFINABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNED_ELEMENT = REDEFINABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OWNER = REDEFINABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = REDEFINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME_EXPRESSION = REDEFINABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAMESPACE = REDEFINABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__QUALIFIED_NAME = REDEFINABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VISIBILITY = REDEFINABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CLIENT_DEPENDENCY = REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_LEAF = REDEFINABLE_ELEMENT__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REDEFINED_ELEMENT = REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REDEFINITION_CONTEXT = REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURING_CLASSIFIER = REDEFINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IS_STATIC = REDEFINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = REDEFINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___ALL_OWNED_ELEMENTS = REDEFINABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___MUST_BE_OWNED = REDEFINABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___ALL_NAMESPACES = REDEFINABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___ALL_OWNING_PACKAGES = REDEFINABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = REDEFINABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___QUALIFIED_NAME = REDEFINABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___SEPARATOR = REDEFINABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___CLIENT_DEPENDENCY = REDEFINABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = REDEFINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.classification.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.ParameterImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_COMMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNED_ELEMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME_EXPRESSION = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAMESPACE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__QUALIFIED_NAME = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VISIBILITY = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CLIENT_DEPENDENCY = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OWNING_TEMPLATE_PARAMETER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TEMPLATE_PARAMETER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__END = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_ORDERED = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_UNIQUE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOWER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOWER_VALUE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UPPER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UPPER_VALUE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIRECTION = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EFFECT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Exception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_EXCEPTION = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_STREAM = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_SET = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ALL_OWNED_ELEMENTS = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___MUST_BE_OWNED = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ALL_NAMESPACES = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___ALL_OWNING_PACKAGES = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___QUALIFIED_NAME = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___SEPARATOR = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___CLIENT_DEPENDENCY = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_TEMPLATE_PARAMETER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___END = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___END;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS__INT_INT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_MULTIVALUED = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___LOWER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___LOWER_BOUND = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___UPPER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___UPPER_BOUND = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Default </em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___DEFAULT_ = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link uml.classification.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.StructuralFeatureImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__OWNED_COMMENT = FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__OWNED_ELEMENT = FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__OWNER = FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAME_EXPRESSION = FEATURE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAMESPACE = FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__QUALIFIED_NAME = FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__VISIBILITY = FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__CLIENT_DEPENDENCY = FEATURE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__IS_LEAF = FEATURE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__REDEFINED_ELEMENT = FEATURE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__REDEFINITION_CONTEXT = FEATURE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__FEATURING_CLASSIFIER = FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__IS_STATIC = FEATURE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__TYPE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__IS_ORDERED = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__IS_UNIQUE = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__LOWER = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__LOWER_VALUE = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__UPPER = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__UPPER_VALUE = FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__IS_READ_ONLY = FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___ALL_OWNED_ELEMENTS = FEATURE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___MUST_BE_OWNED = FEATURE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___ALL_NAMESPACES = FEATURE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___ALL_OWNING_PACKAGES = FEATURE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___QUALIFIED_NAME = FEATURE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___SEPARATOR = FEATURE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___CLIENT_DEPENDENCY = FEATURE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___COMPATIBLE_WITH__MULTIPLICITYELEMENT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = FEATURE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___IS__INT_INT = FEATURE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___IS_MULTIVALUED = FEATURE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___LOWER = FEATURE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___LOWER_BOUND = FEATURE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___UPPER = FEATURE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE___UPPER_BOUND = FEATURE_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link uml.classification.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.PropertyImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNED_COMMENT = STRUCTURAL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNED_ELEMENT = STRUCTURAL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNER = STRUCTURAL_FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME_EXPRESSION = STRUCTURAL_FEATURE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAMESPACE = STRUCTURAL_FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__QUALIFIED_NAME = STRUCTURAL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = STRUCTURAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLIENT_DEPENDENCY = STRUCTURAL_FEATURE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_LEAF = STRUCTURAL_FEATURE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINED_ELEMENT = STRUCTURAL_FEATURE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINITION_CONTEXT = STRUCTURAL_FEATURE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FEATURING_CLASSIFIER = STRUCTURAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_STATIC = STRUCTURAL_FEATURE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = STRUCTURAL_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ORDERED = STRUCTURAL_FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_UNIQUE = STRUCTURAL_FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER = STRUCTURAL_FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_VALUE = STRUCTURAL_FEATURE__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER = STRUCTURAL_FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_VALUE = STRUCTURAL_FEATURE__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_READ_ONLY = STRUCTURAL_FEATURE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNING_TEMPLATE_PARAMETER = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TEMPLATE_PARAMETER = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__END = STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEPLOYMENT = STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEPLOYED_ELEMENT = STRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INTERFACE = STRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__AGGREGATION = STRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATION = STRUCTURAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATION_END = STRUCTURAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__QUALIFIER = STRUCTURAL_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLASS = STRUCTURAL_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATATYPE = STRUCTURAL_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT_VALUE = STRUCTURAL_FEATURE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_COMPOSITE = STRUCTURAL_FEATURE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DERIVED = STRUCTURAL_FEATURE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DERIVED_UNION = STRUCTURAL_FEATURE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ID = STRUCTURAL_FEATURE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPPOSITE = STRUCTURAL_FEATURE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Owning Association</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNING_ASSOCIATION = STRUCTURAL_FEATURE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Redefined Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINED_PROPERTY = STRUCTURAL_FEATURE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Subsetted Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUBSETTED_PROPERTY = STRUCTURAL_FEATURE_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 21;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ALL_OWNED_ELEMENTS = STRUCTURAL_FEATURE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___MUST_BE_OWNED = STRUCTURAL_FEATURE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ALL_NAMESPACES = STRUCTURAL_FEATURE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ALL_OWNING_PACKAGES = STRUCTURAL_FEATURE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STRUCTURAL_FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___QUALIFIED_NAME = STRUCTURAL_FEATURE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SEPARATOR = STRUCTURAL_FEATURE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___CLIENT_DEPENDENCY = STRUCTURAL_FEATURE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STRUCTURAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STRUCTURAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___COMPATIBLE_WITH__MULTIPLICITYELEMENT = STRUCTURAL_FEATURE___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = STRUCTURAL_FEATURE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS__INT_INT = STRUCTURAL_FEATURE___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_MULTIVALUED = STRUCTURAL_FEATURE___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___LOWER = STRUCTURAL_FEATURE___LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___LOWER_BOUND = STRUCTURAL_FEATURE___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___UPPER = STRUCTURAL_FEATURE___UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___UPPER_BOUND = STRUCTURAL_FEATURE___UPPER_BOUND;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = STRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_TEMPLATE_PARAMETER = STRUCTURAL_FEATURE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___END = STRUCTURAL_FEATURE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Deployed Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___DEPLOYED_ELEMENT = STRUCTURAL_FEATURE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_ATTRIBUTE = STRUCTURAL_FEATURE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Composite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_COMPOSITE = STRUCTURAL_FEATURE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Navigable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_NAVIGABLE = STRUCTURAL_FEATURE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___OPPOSITE = STRUCTURAL_FEATURE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Subsetting Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SUBSETTING_CONTEXT = STRUCTURAL_FEATURE_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = STRUCTURAL_FEATURE_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link uml.classification.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.OperationImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_COMMENT = BEHAVIORAL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_ELEMENT = BEHAVIORAL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNER = BEHAVIORAL_FEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = BEHAVIORAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME_EXPRESSION = BEHAVIORAL_FEATURE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAMESPACE = BEHAVIORAL_FEATURE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__QUALIFIED_NAME = BEHAVIORAL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = BEHAVIORAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CLIENT_DEPENDENCY = BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ELEMENT_IMPORT = BEHAVIORAL_FEATURE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IMPORTED_MEMBER = BEHAVIORAL_FEATURE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MEMBER = BEHAVIORAL_FEATURE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_MEMBER = BEHAVIORAL_FEATURE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_RULE = BEHAVIORAL_FEATURE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PACKAGE_IMPORT = BEHAVIORAL_FEATURE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_LEAF = BEHAVIORAL_FEATURE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINED_ELEMENT = BEHAVIORAL_FEATURE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINITION_CONTEXT = BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FEATURING_CLASSIFIER = BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_STATIC = BEHAVIORAL_FEATURE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONCURRENCY = BEHAVIORAL_FEATURE__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ABSTRACT = BEHAVIORAL_FEATURE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__METHOD = BEHAVIORAL_FEATURE__METHOD;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMETER = BEHAVIORAL_FEATURE__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMETER_SET = BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RAISED_EXCEPTION = BEHAVIORAL_FEATURE__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNING_TEMPLATE_PARAMETER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TEMPLATE_PARAMETER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TEMPLATE_BINDING = BEHAVIORAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_TEMPLATE_SIGNATURE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY_CONDITION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CLASS = BEHAVIORAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DATATYPE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INTERFACE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ORDERED = BEHAVIORAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_QUERY = BEHAVIORAL_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_UNIQUE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LOWER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__POSTCONDITION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRECONDITION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINED_OPERATION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UPPER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ALL_OWNED_ELEMENTS = BEHAVIORAL_FEATURE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___MUST_BE_OWNED = BEHAVIORAL_FEATURE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ALL_NAMESPACES = BEHAVIORAL_FEATURE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ALL_OWNING_PACKAGES = BEHAVIORAL_FEATURE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = BEHAVIORAL_FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___QUALIFIED_NAME = BEHAVIORAL_FEATURE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SEPARATOR = BEHAVIORAL_FEATURE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CLIENT_DEPENDENCY = BEHAVIORAL_FEATURE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___EXCLUDE_COLLISIONS__ELIST = BEHAVIORAL_FEATURE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT = BEHAVIORAL_FEATURE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IMPORT_MEMBERS__ELIST = BEHAVIORAL_FEATURE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IMPORTED_MEMBER = BEHAVIORAL_FEATURE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___MEMBERS_ARE_DISTINGUISHABLE = BEHAVIORAL_FEATURE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = BEHAVIORAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = BEHAVIORAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___INPUT_PARAMETERS = BEHAVIORAL_FEATURE___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___OUTPUT_PARAMETERS = BEHAVIORAL_FEATURE___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = BEHAVIORAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_TEMPLATE_PARAMETER = BEHAVIORAL_FEATURE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_TEMPLATE = BEHAVIORAL_FEATURE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___PARAMETERABLE_ELEMENTS = BEHAVIORAL_FEATURE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_ORDERED = BEHAVIORAL_FEATURE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_UNIQUE = BEHAVIORAL_FEATURE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___LOWER = BEHAVIORAL_FEATURE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___RETURN_RESULT = BEHAVIORAL_FEATURE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___TYPE = BEHAVIORAL_FEATURE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___UPPER = BEHAVIORAL_FEATURE_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = BEHAVIORAL_FEATURE_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link uml.classification.impl.OperationTemplateParameterImpl <em>Operation Template Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.OperationTemplateParameterImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getOperationTemplateParameter()
	 * @generated
	 */
	int OPERATION_TEMPLATE_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER__OWNED_COMMENT = CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER__OWNED_ELEMENT = CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER__OWNER = CommonStructurePackage.TEMPLATE_PARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER__DEFAULT = CommonStructurePackage.TEMPLATE_PARAMETER__DEFAULT;

	/**
	 * The feature id for the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER__OWNED_DEFAULT = CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT;

	/**
	 * The feature id for the '<em><b>Parametered Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER__SIGNATURE = CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT = CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Operation Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER_FEATURE_COUNT = CommonStructurePackage.TEMPLATE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER___ALL_OWNED_ELEMENTS = CommonStructurePackage.TEMPLATE_PARAMETER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER___MUST_BE_OWNED = CommonStructurePackage.TEMPLATE_PARAMETER___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Operation Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TEMPLATE_PARAMETER_OPERATION_COUNT = CommonStructurePackage.TEMPLATE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.classification.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.ParameterSetImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getParameterSet()
	 * @generated
	 */
	int PARAMETER_SET = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__CONDITION = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__PARAMETER = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Parameter Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.classification.impl.ClassifierTemplateParameterImpl <em>Classifier Template Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.ClassifierTemplateParameterImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getClassifierTemplateParameter()
	 * @generated
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__OWNED_COMMENT = CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__OWNED_ELEMENT = CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__OWNER = CommonStructurePackage.TEMPLATE_PARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__DEFAULT = CommonStructurePackage.TEMPLATE_PARAMETER__DEFAULT;

	/**
	 * The feature id for the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__OWNED_DEFAULT = CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_DEFAULT;

	/**
	 * The feature id for the '<em><b>Parametered Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__SIGNATURE = CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT = CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Allow Substitutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE = CommonStructurePackage.TEMPLATE_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraining Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER = CommonStructurePackage.TEMPLATE_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classifier Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER_FEATURE_COUNT = CommonStructurePackage.TEMPLATE_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER___ALL_OWNED_ELEMENTS = CommonStructurePackage.TEMPLATE_PARAMETER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER___MUST_BE_OWNED = CommonStructurePackage.TEMPLATE_PARAMETER___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Classifier Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_TEMPLATE_PARAMETER_OPERATION_COUNT = CommonStructurePackage.TEMPLATE_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.classification.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.GeneralizationImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 11;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_COMMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNED_ELEMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__OWNER = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RELATED_ELEMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = CommonStructurePackage.DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = CommonStructurePackage.DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generalization Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERALIZATION_SET = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Substitutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__IS_SUBSTITUTABLE = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___ALL_OWNED_ELEMENTS = CommonStructurePackage.DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___MUST_BE_OWNED = CommonStructurePackage.DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = CommonStructurePackage.DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.classification.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.GeneralizationSetImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getGeneralizationSet()
	 * @generated
	 */
	int GENERALIZATION_SET = 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__OWNED_COMMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__OWNED_ELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__OWNER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAME_EXPRESSION = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__VISIBILITY = CommonStructurePackage.PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Covering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_COVERING = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_DISJOINT = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Powertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__POWERTYPE = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__GENERALIZATION = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_FEATURE_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___ALL_OWNED_ELEMENTS = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___MUST_BE_OWNED = CommonStructurePackage.PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___ALL_NAMESPACES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___ALL_OWNING_PACKAGES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___SEPARATOR = CommonStructurePackage.PACKAGEABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___IS_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_OPERATION_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.classification.impl.InstanceSpecificationImpl <em>Instance Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.InstanceSpecificationImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getInstanceSpecification()
	 * @generated
	 */
	int INSTANCE_SPECIFICATION = 13;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__OWNED_COMMENT = DeploymentsPackage.DEPLOYMENT_TARGET__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__OWNED_ELEMENT = DeploymentsPackage.DEPLOYMENT_TARGET__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__OWNER = DeploymentsPackage.DEPLOYMENT_TARGET__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__NAME = DeploymentsPackage.DEPLOYMENT_TARGET__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__NAME_EXPRESSION = DeploymentsPackage.DEPLOYMENT_TARGET__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__NAMESPACE = DeploymentsPackage.DEPLOYMENT_TARGET__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__QUALIFIED_NAME = DeploymentsPackage.DEPLOYMENT_TARGET__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__VISIBILITY = DeploymentsPackage.DEPLOYMENT_TARGET__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__CLIENT_DEPENDENCY = DeploymentsPackage.DEPLOYMENT_TARGET__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__DEPLOYMENT = DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYMENT;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__DEPLOYED_ELEMENT = DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER = DeploymentsPackage.DEPLOYMENT_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__TEMPLATE_PARAMETER = DeploymentsPackage.DEPLOYMENT_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__CLASSIFIER = DeploymentsPackage.DEPLOYMENT_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__SLOT = DeploymentsPackage.DEPLOYMENT_TARGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION__SPECIFICATION = DeploymentsPackage.DEPLOYMENT_TARGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Instance Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_FEATURE_COUNT = DeploymentsPackage.DEPLOYMENT_TARGET_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___ALL_OWNED_ELEMENTS = DeploymentsPackage.DEPLOYMENT_TARGET___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___MUST_BE_OWNED = DeploymentsPackage.DEPLOYMENT_TARGET___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___ALL_NAMESPACES = DeploymentsPackage.DEPLOYMENT_TARGET___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___ALL_OWNING_PACKAGES = DeploymentsPackage.DEPLOYMENT_TARGET___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = DeploymentsPackage.DEPLOYMENT_TARGET___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___QUALIFIED_NAME = DeploymentsPackage.DEPLOYMENT_TARGET___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___SEPARATOR = DeploymentsPackage.DEPLOYMENT_TARGET___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___CLIENT_DEPENDENCY = DeploymentsPackage.DEPLOYMENT_TARGET___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Deployed Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___DEPLOYED_ELEMENT = DeploymentsPackage.DEPLOYMENT_TARGET___DEPLOYED_ELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = DeploymentsPackage.DEPLOYMENT_TARGET_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION___IS_TEMPLATE_PARAMETER = DeploymentsPackage.DEPLOYMENT_TARGET_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SPECIFICATION_OPERATION_COUNT = DeploymentsPackage.DEPLOYMENT_TARGET_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml.classification.impl.SlotImpl <em>Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.SlotImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getSlot()
	 * @generated
	 */
	int SLOT = 14;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__OWNED_COMMENT = CommonStructurePackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__OWNED_ELEMENT = CommonStructurePackage.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__OWNER = CommonStructurePackage.ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Defining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__DEFINING_FEATURE = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__VALUE = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT__OWNING_INSTANCE = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_FEATURE_COUNT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___ALL_OWNED_ELEMENTS = CommonStructurePackage.ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT___MUST_BE_OWNED = CommonStructurePackage.ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOT_OPERATION_COUNT = CommonStructurePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.classification.impl.InstanceValueImpl <em>Instance Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.InstanceValueImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getInstanceValue()
	 * @generated
	 */
	int INSTANCE_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__OWNED_COMMENT = ValuesPackage.VALUE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__OWNED_ELEMENT = ValuesPackage.VALUE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__OWNER = ValuesPackage.VALUE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__NAME = ValuesPackage.VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__NAME_EXPRESSION = ValuesPackage.VALUE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__NAMESPACE = ValuesPackage.VALUE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__QUALIFIED_NAME = ValuesPackage.VALUE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__VISIBILITY = ValuesPackage.VALUE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__CLIENT_DEPENDENCY = ValuesPackage.VALUE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__OWNING_TEMPLATE_PARAMETER = ValuesPackage.VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__TEMPLATE_PARAMETER = ValuesPackage.VALUE_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__TYPE = ValuesPackage.VALUE_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE__INSTANCE = ValuesPackage.VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE_FEATURE_COUNT = ValuesPackage.VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___ALL_OWNED_ELEMENTS = ValuesPackage.VALUE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___MUST_BE_OWNED = ValuesPackage.VALUE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___ALL_NAMESPACES = ValuesPackage.VALUE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___ALL_OWNING_PACKAGES = ValuesPackage.VALUE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ValuesPackage.VALUE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___QUALIFIED_NAME = ValuesPackage.VALUE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___SEPARATOR = ValuesPackage.VALUE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___CLIENT_DEPENDENCY = ValuesPackage.VALUE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = ValuesPackage.VALUE_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___IS_TEMPLATE_PARAMETER = ValuesPackage.VALUE_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___BOOLEAN_VALUE = ValuesPackage.VALUE_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___INTEGER_VALUE = ValuesPackage.VALUE_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___IS_COMPUTABLE = ValuesPackage.VALUE_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___IS_NULL = ValuesPackage.VALUE_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___REAL_VALUE = ValuesPackage.VALUE_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___STRING_VALUE = ValuesPackage.VALUE_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE___UNLIMITED_VALUE = ValuesPackage.VALUE_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Instance Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VALUE_OPERATION_COUNT = ValuesPackage.VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.classification.impl.RedefinableTemplateSignatureImpl <em>Redefinable Template Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.RedefinableTemplateSignatureImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getRedefinableTemplateSignature()
	 * @generated
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE = 16;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_COMMENT = REDEFINABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_ELEMENT = REDEFINABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__OWNER = REDEFINABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__NAME = REDEFINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__NAME_EXPRESSION = REDEFINABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__NAMESPACE = REDEFINABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__QUALIFIED_NAME = REDEFINABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__VISIBILITY = REDEFINABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__CLIENT_DEPENDENCY = REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__IS_LEAF = REDEFINABLE_ELEMENT__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINED_ELEMENT = REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__REDEFINITION_CONTEXT = REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER = REDEFINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE = REDEFINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER = REDEFINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER = REDEFINABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extended Signature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE = REDEFINABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inherited Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER = REDEFINABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Redefinable Template Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE_FEATURE_COUNT = REDEFINABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___ALL_OWNED_ELEMENTS = REDEFINABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___MUST_BE_OWNED = REDEFINABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___ALL_NAMESPACES = REDEFINABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___ALL_OWNING_PACKAGES = REDEFINABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = REDEFINABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___QUALIFIED_NAME = REDEFINABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___SEPARATOR = REDEFINABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___CLIENT_DEPENDENCY = REDEFINABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Inherited Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE___INHERITED_PARAMETER = REDEFINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Redefinable Template Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_TEMPLATE_SIGNATURE_OPERATION_COUNT = REDEFINABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.classification.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.impl.ClassifierImpl
	 * @see uml.classification.impl.ClassificationPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_COMMENT = CommonStructurePackage.NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_ELEMENT = CommonStructurePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNER = CommonStructurePackage.NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = CommonStructurePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME_EXPRESSION = CommonStructurePackage.NAMESPACE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAMESPACE = CommonStructurePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__QUALIFIED_NAME = CommonStructurePackage.NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__VISIBILITY = CommonStructurePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ELEMENT_IMPORT = CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__MEMBER = CommonStructurePackage.NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_MEMBER = CommonStructurePackage.NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_RULE = CommonStructurePackage.NAMESPACE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__PACKAGE_IMPORT = CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_LEAF = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__REDEFINED_ELEMENT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__REDEFINITION_CONTEXT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__TEMPLATE_PARAMETER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__PACKAGE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__TEMPLATE_BINDING = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_TEMPLATE_SIGNATURE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__SUBSTITUTION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__FEATURE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__POWERTYPE_EXTENT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__GENERALIZATION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ATTRIBUTE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__COLLABORATION_USE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__GENERAL = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__INHERITED_MEMBER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_ABSTRACT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_FINAL_SPECIALIZATION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_USE_CASE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__USE_CASE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__REDEFINED_CLASSIFIER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__REPRESENTATION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 22;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___MUST_BE_OWNED = CommonStructurePackage.NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_NAMESPACES = CommonStructurePackage.NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMESPACE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMESPACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___QUALIFIED_NAME = CommonStructurePackage.NAMESPACE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___SEPARATOR = CommonStructurePackage.NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___EXCLUDE_COLLISIONS__ELIST = CommonStructurePackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonStructurePackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IMPORT_MEMBERS__ELIST = CommonStructurePackage.NAMESPACE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___MEMBERS_ARE_DISTINGUISHABLE = CommonStructurePackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_TEMPLATE_PARAMETER = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___CONFORMS_TO__TYPE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_TEMPLATE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___PARAMETERABLE_ELEMENTS = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_FEATURES = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_PARENTS = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___GENERAL = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___INHERIT__ELIST = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___INHERITED_MEMBER = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___PARENTS = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___DIRECTLY_REALIZED_INTERFACES = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___DIRECTLY_USED_INTERFACES = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_REALIZED_INTERFACES = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_USED_INTERFACES = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_ATTRIBUTES = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_SLOTTABLE_FEATURES = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 22;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 23;

	/**
	 * The meta object id for the '{@link uml.classification.CallConcurrencyKind <em>Call Concurrency Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.CallConcurrencyKind
	 * @see uml.classification.impl.ClassificationPackageImpl#getCallConcurrencyKind()
	 * @generated
	 */
	int CALL_CONCURRENCY_KIND = 18;

	/**
	 * The meta object id for the '{@link uml.classification.AggregationKind <em>Aggregation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.AggregationKind
	 * @see uml.classification.impl.ClassificationPackageImpl#getAggregationKind()
	 * @generated
	 */
	int AGGREGATION_KIND = 19;

	/**
	 * The meta object id for the '{@link uml.classification.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.ParameterDirectionKind
	 * @see uml.classification.impl.ClassificationPackageImpl#getParameterDirectionKind()
	 * @generated
	 */
	int PARAMETER_DIRECTION_KIND = 20;

	/**
	 * The meta object id for the '{@link uml.classification.ParameterEffectKind <em>Parameter Effect Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.classification.ParameterEffectKind
	 * @see uml.classification.impl.ClassificationPackageImpl#getParameterEffectKind()
	 * @generated
	 */
	int PARAMETER_EFFECT_KIND = 21;


	/**
	 * Returns the meta object for class '{@link uml.classification.Substitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substitution</em>'.
	 * @see uml.classification.Substitution
	 * @generated
	 */
	EClass getSubstitution();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Substitution#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contract</em>'.
	 * @see uml.classification.Substitution#getContract()
	 * @see #getSubstitution()
	 * @generated
	 */
	EReference getSubstitution_Contract();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Substituting Classifier</em>'.
	 * @see uml.classification.Substitution#getSubstitutingClassifier()
	 * @see #getSubstitution()
	 * @generated
	 */
	EReference getSubstitution_SubstitutingClassifier();

	/**
	 * Returns the meta object for class '{@link uml.classification.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Feature</em>'.
	 * @see uml.classification.BehavioralFeature
	 * @generated
	 */
	EClass getBehavioralFeature();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.BehavioralFeature#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency</em>'.
	 * @see uml.classification.BehavioralFeature#getConcurrency()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EAttribute getBehavioralFeature_Concurrency();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see uml.classification.BehavioralFeature#isIsAbstract()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EAttribute getBehavioralFeature_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.BehavioralFeature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Method</em>'.
	 * @see uml.classification.BehavioralFeature#getMethod()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.BehavioralFeature#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see uml.classification.BehavioralFeature#getOwnedParameter()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_OwnedParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.BehavioralFeature#getOwnedParameterSet <em>Owned Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter Set</em>'.
	 * @see uml.classification.BehavioralFeature#getOwnedParameterSet()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_OwnedParameterSet();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.BehavioralFeature#getRaisedException <em>Raised Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Raised Exception</em>'.
	 * @see uml.classification.BehavioralFeature#getRaisedException()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_RaisedException();

	/**
	 * Returns the meta object for the '{@link uml.classification.BehavioralFeature#inputParameters() <em>Input Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Parameters</em>' operation.
	 * @see uml.classification.BehavioralFeature#inputParameters()
	 * @generated
	 */
	EOperation getBehavioralFeature__InputParameters();

	/**
	 * Returns the meta object for the '{@link uml.classification.BehavioralFeature#outputParameters() <em>Output Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Parameters</em>' operation.
	 * @see uml.classification.BehavioralFeature#outputParameters()
	 * @generated
	 */
	EOperation getBehavioralFeature__OutputParameters();

	/**
	 * Returns the meta object for class '{@link uml.classification.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see uml.classification.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Featuring Classifier</em>'.
	 * @see uml.classification.Feature#getFeaturingClassifier()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeaturingClassifier();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Feature#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see uml.classification.Feature#isIsStatic()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_IsStatic();

	/**
	 * Returns the meta object for class '{@link uml.classification.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefinable Element</em>'.
	 * @see uml.classification.RedefinableElement
	 * @generated
	 */
	EClass getRedefinableElement();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.RedefinableElement#isIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see uml.classification.RedefinableElement#isIsLeaf()
	 * @see #getRedefinableElement()
	 * @generated
	 */
	EAttribute getRedefinableElement_IsLeaf();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.RedefinableElement#getRedefinedElement <em>Redefined Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Element</em>'.
	 * @see uml.classification.RedefinableElement#getRedefinedElement()
	 * @see #getRedefinableElement()
	 * @generated
	 */
	EReference getRedefinableElement_RedefinedElement();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.RedefinableElement#getRedefinitionContext <em>Redefinition Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefinition Context</em>'.
	 * @see uml.classification.RedefinableElement#getRedefinitionContext()
	 * @see #getRedefinableElement()
	 * @generated
	 */
	EReference getRedefinableElement_RedefinitionContext();

	/**
	 * Returns the meta object for the '{@link uml.classification.RedefinableElement#isConsistentWith(uml.classification.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Consistent With</em>' operation.
	 * @see uml.classification.RedefinableElement#isConsistentWith(uml.classification.RedefinableElement)
	 * @generated
	 */
	EOperation getRedefinableElement__IsConsistentWith__RedefinableElement();

	/**
	 * Returns the meta object for the '{@link uml.classification.RedefinableElement#isRedefinitionContextValid(uml.classification.RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Redefinition Context Valid</em>' operation.
	 * @see uml.classification.RedefinableElement#isRedefinitionContextValid(uml.classification.RedefinableElement)
	 * @generated
	 */
	EOperation getRedefinableElement__IsRedefinitionContextValid__RedefinableElement();

	/**
	 * Returns the meta object for class '{@link uml.classification.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see uml.classification.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see uml.classification.Parameter#getOperation()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Operation();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see uml.classification.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default();

	/**
	 * Returns the meta object for the containment reference '{@link uml.classification.Parameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see uml.classification.Parameter#getDefaultValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Parameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see uml.classification.Parameter#getDirection()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Direction();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Parameter#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see uml.classification.Parameter#getEffect()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Effect();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Parameter#isIsException <em>Is Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exception</em>'.
	 * @see uml.classification.Parameter#isIsException()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_IsException();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Parameter#isIsStream <em>Is Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Stream</em>'.
	 * @see uml.classification.Parameter#isIsStream()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_IsStream();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Parameter#getParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Set</em>'.
	 * @see uml.classification.Parameter#getParameterSet()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterSet();

	/**
	 * Returns the meta object for the '{@link uml.classification.Parameter#default_() <em>Default </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Default </em>' operation.
	 * @see uml.classification.Parameter#default_()
	 * @generated
	 */
	EOperation getParameter__Default_();

	/**
	 * Returns the meta object for class '{@link uml.classification.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see uml.classification.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Property#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see uml.classification.Property#getInterface()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Interface();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Property#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see uml.classification.Property#getAggregation()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Aggregation();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Property#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see uml.classification.Property#getAssociation()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Association();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Association End</em>'.
	 * @see uml.classification.Property#getAssociationEnd()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_AssociationEnd();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.Property#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see uml.classification.Property#getQualifier()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Property#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see uml.classification.Property#getClass_()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Class();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Property#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Datatype</em>'.
	 * @see uml.classification.Property#getDatatype()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Datatype();

	/**
	 * Returns the meta object for the containment reference '{@link uml.classification.Property#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see uml.classification.Property#getDefaultValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Property#isIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see uml.classification.Property#isIsComposite()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsComposite();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Property#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see uml.classification.Property#isIsDerived()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Property#isIsDerivedUnion <em>Is Derived Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived Union</em>'.
	 * @see uml.classification.Property#isIsDerivedUnion()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsDerivedUnion();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Property#isIsId <em>Is Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Id</em>'.
	 * @see uml.classification.Property#isIsId()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsId();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Property#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see uml.classification.Property#getOpposite()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Opposite();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Property#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Association</em>'.
	 * @see uml.classification.Property#getOwningAssociation()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OwningAssociation();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Property#getRedefinedProperty <em>Redefined Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Property</em>'.
	 * @see uml.classification.Property#getRedefinedProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_RedefinedProperty();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Property#getSubsettedProperty <em>Subsetted Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsetted Property</em>'.
	 * @see uml.classification.Property#getSubsettedProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_SubsettedProperty();

	/**
	 * Returns the meta object for the '{@link uml.classification.Property#isAttribute() <em>Is Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Attribute</em>' operation.
	 * @see uml.classification.Property#isAttribute()
	 * @generated
	 */
	EOperation getProperty__IsAttribute();

	/**
	 * Returns the meta object for the '{@link uml.classification.Property#isComposite() <em>Is Composite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Composite</em>' operation.
	 * @see uml.classification.Property#isComposite()
	 * @generated
	 */
	EOperation getProperty__IsComposite();

	/**
	 * Returns the meta object for the '{@link uml.classification.Property#isNavigable() <em>Is Navigable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Navigable</em>' operation.
	 * @see uml.classification.Property#isNavigable()
	 * @generated
	 */
	EOperation getProperty__IsNavigable();

	/**
	 * Returns the meta object for the '{@link uml.classification.Property#opposite() <em>Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Opposite</em>' operation.
	 * @see uml.classification.Property#opposite()
	 * @generated
	 */
	EOperation getProperty__Opposite();

	/**
	 * Returns the meta object for the '{@link uml.classification.Property#subsettingContext() <em>Subsetting Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subsetting Context</em>' operation.
	 * @see uml.classification.Property#subsettingContext()
	 * @generated
	 */
	EOperation getProperty__SubsettingContext();

	/**
	 * Returns the meta object for class '{@link uml.classification.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see uml.classification.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Operation#getBodyCondition <em>Body Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body Condition</em>'.
	 * @see uml.classification.Operation#getBodyCondition()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_BodyCondition();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Operation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class</em>'.
	 * @see uml.classification.Operation#getClass_()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Class();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Operation#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Datatype</em>'.
	 * @see uml.classification.Operation#getDatatype()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Datatype();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Operation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see uml.classification.Operation#getInterface()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Interface();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Operation#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see uml.classification.Operation#isIsOrdered()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Operation#isIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see uml.classification.Operation#isIsQuery()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsQuery();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Operation#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see uml.classification.Operation#isIsUnique()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Operation#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see uml.classification.Operation#getLower()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Lower();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Operation#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Postcondition</em>'.
	 * @see uml.classification.Operation#getPostcondition()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Postcondition();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Operation#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precondition</em>'.
	 * @see uml.classification.Operation#getPrecondition()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Precondition();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Operation#getRedefinedOperation <em>Redefined Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Operation</em>'.
	 * @see uml.classification.Operation#getRedefinedOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RedefinedOperation();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Operation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see uml.classification.Operation#getType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Type();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Operation#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see uml.classification.Operation#getUpper()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Upper();

	/**
	 * Returns the meta object for the '{@link uml.classification.Operation#isOrdered() <em>Is Ordered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ordered</em>' operation.
	 * @see uml.classification.Operation#isOrdered()
	 * @generated
	 */
	EOperation getOperation__IsOrdered();

	/**
	 * Returns the meta object for the '{@link uml.classification.Operation#isUnique() <em>Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Unique</em>' operation.
	 * @see uml.classification.Operation#isUnique()
	 * @generated
	 */
	EOperation getOperation__IsUnique();

	/**
	 * Returns the meta object for the '{@link uml.classification.Operation#lower() <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower</em>' operation.
	 * @see uml.classification.Operation#lower()
	 * @generated
	 */
	EOperation getOperation__Lower();

	/**
	 * Returns the meta object for the '{@link uml.classification.Operation#returnResult() <em>Return Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Result</em>' operation.
	 * @see uml.classification.Operation#returnResult()
	 * @generated
	 */
	EOperation getOperation__ReturnResult();

	/**
	 * Returns the meta object for the '{@link uml.classification.Operation#type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type</em>' operation.
	 * @see uml.classification.Operation#type()
	 * @generated
	 */
	EOperation getOperation__Type();

	/**
	 * Returns the meta object for the '{@link uml.classification.Operation#upper() <em>Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upper</em>' operation.
	 * @see uml.classification.Operation#upper()
	 * @generated
	 */
	EOperation getOperation__Upper();

	/**
	 * Returns the meta object for class '{@link uml.classification.OperationTemplateParameter <em>Operation Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Template Parameter</em>'.
	 * @see uml.classification.OperationTemplateParameter
	 * @generated
	 */
	EClass getOperationTemplateParameter();

	/**
	 * Returns the meta object for class '{@link uml.classification.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see uml.classification.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.StructuralFeature#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see uml.classification.StructuralFeature#isIsReadOnly()
	 * @see #getStructuralFeature()
	 * @generated
	 */
	EAttribute getStructuralFeature_IsReadOnly();

	/**
	 * Returns the meta object for class '{@link uml.classification.ParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Set</em>'.
	 * @see uml.classification.ParameterSet
	 * @generated
	 */
	EClass getParameterSet();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.ParameterSet#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see uml.classification.ParameterSet#getCondition()
	 * @see #getParameterSet()
	 * @generated
	 */
	EReference getParameterSet_Condition();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.ParameterSet#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see uml.classification.ParameterSet#getParameter()
	 * @see #getParameterSet()
	 * @generated
	 */
	EReference getParameterSet_Parameter();

	/**
	 * Returns the meta object for class '{@link uml.classification.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Template Parameter</em>'.
	 * @see uml.classification.ClassifierTemplateParameter
	 * @generated
	 */
	EClass getClassifierTemplateParameter();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.ClassifierTemplateParameter#isAllowSubstitutable <em>Allow Substitutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Substitutable</em>'.
	 * @see uml.classification.ClassifierTemplateParameter#isAllowSubstitutable()
	 * @see #getClassifierTemplateParameter()
	 * @generated
	 */
	EAttribute getClassifierTemplateParameter_AllowSubstitutable();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.ClassifierTemplateParameter#getConstrainingClassifier <em>Constraining Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraining Classifier</em>'.
	 * @see uml.classification.ClassifierTemplateParameter#getConstrainingClassifier()
	 * @see #getClassifierTemplateParameter()
	 * @generated
	 */
	EReference getClassifierTemplateParameter_ConstrainingClassifier();

	/**
	 * Returns the meta object for class '{@link uml.classification.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see uml.classification.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see uml.classification.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Generalization#getGeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalization Set</em>'.
	 * @see uml.classification.Generalization#getGeneralizationSet()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_GeneralizationSet();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Generalization#isIsSubstitutable <em>Is Substitutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Substitutable</em>'.
	 * @see uml.classification.Generalization#isIsSubstitutable()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_IsSubstitutable();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specific</em>'.
	 * @see uml.classification.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for class '{@link uml.classification.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Set</em>'.
	 * @see uml.classification.GeneralizationSet
	 * @generated
	 */
	EClass getGeneralizationSet();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.GeneralizationSet#isIsCovering <em>Is Covering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Covering</em>'.
	 * @see uml.classification.GeneralizationSet#isIsCovering()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsCovering();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disjoint</em>'.
	 * @see uml.classification.GeneralizationSet#isIsDisjoint()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsDisjoint();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.GeneralizationSet#getPowertype <em>Powertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Powertype</em>'.
	 * @see uml.classification.GeneralizationSet#getPowertype()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Powertype();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.GeneralizationSet#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalization</em>'.
	 * @see uml.classification.GeneralizationSet#getGeneralization()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Generalization();

	/**
	 * Returns the meta object for class '{@link uml.classification.InstanceSpecification <em>Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Specification</em>'.
	 * @see uml.classification.InstanceSpecification
	 * @generated
	 */
	EClass getInstanceSpecification();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.InstanceSpecification#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classifier</em>'.
	 * @see uml.classification.InstanceSpecification#getClassifier()
	 * @see #getInstanceSpecification()
	 * @generated
	 */
	EReference getInstanceSpecification_Classifier();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.InstanceSpecification#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see uml.classification.InstanceSpecification#getSlot()
	 * @see #getInstanceSpecification()
	 * @generated
	 */
	EReference getInstanceSpecification_Slot();

	/**
	 * Returns the meta object for the containment reference '{@link uml.classification.InstanceSpecification#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see uml.classification.InstanceSpecification#getSpecification()
	 * @see #getInstanceSpecification()
	 * @generated
	 */
	EReference getInstanceSpecification_Specification();

	/**
	 * Returns the meta object for class '{@link uml.classification.Slot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot</em>'.
	 * @see uml.classification.Slot
	 * @generated
	 */
	EClass getSlot();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Slot#getDefiningFeature <em>Defining Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defining Feature</em>'.
	 * @see uml.classification.Slot#getDefiningFeature()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_DefiningFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.Slot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see uml.classification.Slot#getValue()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_Value();

	/**
	 * Returns the meta object for the container reference '{@link uml.classification.Slot#getOwningInstance <em>Owning Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Instance</em>'.
	 * @see uml.classification.Slot#getOwningInstance()
	 * @see #getSlot()
	 * @generated
	 */
	EReference getSlot_OwningInstance();

	/**
	 * Returns the meta object for class '{@link uml.classification.InstanceValue <em>Instance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Value</em>'.
	 * @see uml.classification.InstanceValue
	 * @generated
	 */
	EClass getInstanceValue();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.InstanceValue#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see uml.classification.InstanceValue#getInstance()
	 * @see #getInstanceValue()
	 * @generated
	 */
	EReference getInstanceValue_Instance();

	/**
	 * Returns the meta object for class '{@link uml.classification.RedefinableTemplateSignature <em>Redefinable Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefinable Template Signature</em>'.
	 * @see uml.classification.RedefinableTemplateSignature
	 * @generated
	 */
	EClass getRedefinableTemplateSignature();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.RedefinableTemplateSignature#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see uml.classification.RedefinableTemplateSignature#getClassifier()
	 * @see #getRedefinableTemplateSignature()
	 * @generated
	 */
	EReference getRedefinableTemplateSignature_Classifier();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.RedefinableTemplateSignature#getExtendedSignature <em>Extended Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extended Signature</em>'.
	 * @see uml.classification.RedefinableTemplateSignature#getExtendedSignature()
	 * @see #getRedefinableTemplateSignature()
	 * @generated
	 */
	EReference getRedefinableTemplateSignature_ExtendedSignature();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.RedefinableTemplateSignature#getInheritedParameter <em>Inherited Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Parameter</em>'.
	 * @see uml.classification.RedefinableTemplateSignature#getInheritedParameter()
	 * @see #getRedefinableTemplateSignature()
	 * @generated
	 */
	EReference getRedefinableTemplateSignature_InheritedParameter();

	/**
	 * Returns the meta object for the '{@link uml.classification.RedefinableTemplateSignature#inheritedParameter() <em>Inherited Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inherited Parameter</em>' operation.
	 * @see uml.classification.RedefinableTemplateSignature#inheritedParameter()
	 * @generated
	 */
	EOperation getRedefinableTemplateSignature__InheritedParameter();

	/**
	 * Returns the meta object for class '{@link uml.classification.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see uml.classification.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.Classifier#getSubstitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Substitution</em>'.
	 * @see uml.classification.Classifier#getSubstitution()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Substitution();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see uml.classification.Classifier#getFeature()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Feature();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Classifier#getPowertypeExtent <em>Powertype Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Powertype Extent</em>'.
	 * @see uml.classification.Classifier#getPowertypeExtent()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_PowertypeExtent();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalization</em>'.
	 * @see uml.classification.Classifier#getGeneralization()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Generalization();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Classifier#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see uml.classification.Classifier#getAttribute()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.Classifier#getCollaborationUse <em>Collaboration Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collaboration Use</em>'.
	 * @see uml.classification.Classifier#getCollaborationUse()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_CollaborationUse();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Classifier#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>General</em>'.
	 * @see uml.classification.Classifier#getGeneral()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_General();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Classifier#getInheritedMember <em>Inherited Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Member</em>'.
	 * @see uml.classification.Classifier#getInheritedMember()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_InheritedMember();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Classifier#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see uml.classification.Classifier#isIsAbstract()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link uml.classification.Classifier#isIsFinalSpecialization <em>Is Final Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final Specialization</em>'.
	 * @see uml.classification.Classifier#isIsFinalSpecialization()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsFinalSpecialization();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classification.Classifier#getOwnedUseCase <em>Owned Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Use Case</em>'.
	 * @see uml.classification.Classifier#getOwnedUseCase()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_OwnedUseCase();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Classifier#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Case</em>'.
	 * @see uml.classification.Classifier#getUseCase()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_UseCase();

	/**
	 * Returns the meta object for the reference list '{@link uml.classification.Classifier#getRedefinedClassifier <em>Redefined Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Classifier</em>'.
	 * @see uml.classification.Classifier#getRedefinedClassifier()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_RedefinedClassifier();

	/**
	 * Returns the meta object for the reference '{@link uml.classification.Classifier#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see uml.classification.Classifier#getRepresentation()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_Representation();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#allFeatures() <em>All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Features</em>' operation.
	 * @see uml.classification.Classifier#allFeatures()
	 * @generated
	 */
	EOperation getClassifier__AllFeatures();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#allParents() <em>All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Parents</em>' operation.
	 * @see uml.classification.Classifier#allParents()
	 * @generated
	 */
	EOperation getClassifier__AllParents();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#general() <em>General</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>General</em>' operation.
	 * @see uml.classification.Classifier#general()
	 * @generated
	 */
	EOperation getClassifier__General();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#hasVisibilityOf(uml.commonStructure.NamedElement) <em>Has Visibility Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Visibility Of</em>' operation.
	 * @see uml.classification.Classifier#hasVisibilityOf(uml.commonStructure.NamedElement)
	 * @generated
	 */
	EOperation getClassifier__HasVisibilityOf__NamedElement();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inherit</em>' operation.
	 * @see uml.classification.Classifier#inherit(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getClassifier__Inherit__EList();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#inheritableMembers(uml.classification.Classifier) <em>Inheritable Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inheritable Members</em>' operation.
	 * @see uml.classification.Classifier#inheritableMembers(uml.classification.Classifier)
	 * @generated
	 */
	EOperation getClassifier__InheritableMembers__Classifier();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#inheritedMember() <em>Inherited Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inherited Member</em>' operation.
	 * @see uml.classification.Classifier#inheritedMember()
	 * @generated
	 */
	EOperation getClassifier__InheritedMember();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#maySpecializeType(uml.classification.Classifier) <em>May Specialize Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>May Specialize Type</em>' operation.
	 * @see uml.classification.Classifier#maySpecializeType(uml.classification.Classifier)
	 * @generated
	 */
	EOperation getClassifier__MaySpecializeType__Classifier();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#parents() <em>Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parents</em>' operation.
	 * @see uml.classification.Classifier#parents()
	 * @generated
	 */
	EOperation getClassifier__Parents();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#directlyRealizedInterfaces() <em>Directly Realized Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Directly Realized Interfaces</em>' operation.
	 * @see uml.classification.Classifier#directlyRealizedInterfaces()
	 * @generated
	 */
	EOperation getClassifier__DirectlyRealizedInterfaces();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#directlyUsedInterfaces() <em>Directly Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Directly Used Interfaces</em>' operation.
	 * @see uml.classification.Classifier#directlyUsedInterfaces()
	 * @generated
	 */
	EOperation getClassifier__DirectlyUsedInterfaces();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#allRealizedInterfaces() <em>All Realized Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Realized Interfaces</em>' operation.
	 * @see uml.classification.Classifier#allRealizedInterfaces()
	 * @generated
	 */
	EOperation getClassifier__AllRealizedInterfaces();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#allUsedInterfaces() <em>All Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Used Interfaces</em>' operation.
	 * @see uml.classification.Classifier#allUsedInterfaces()
	 * @generated
	 */
	EOperation getClassifier__AllUsedInterfaces();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#isSubstitutableFor(uml.classification.Classifier) <em>Is Substitutable For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Substitutable For</em>' operation.
	 * @see uml.classification.Classifier#isSubstitutableFor(uml.classification.Classifier)
	 * @generated
	 */
	EOperation getClassifier__IsSubstitutableFor__Classifier();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#allAttributes() <em>All Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Attributes</em>' operation.
	 * @see uml.classification.Classifier#allAttributes()
	 * @generated
	 */
	EOperation getClassifier__AllAttributes();

	/**
	 * Returns the meta object for the '{@link uml.classification.Classifier#allSlottableFeatures() <em>All Slottable Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Slottable Features</em>' operation.
	 * @see uml.classification.Classifier#allSlottableFeatures()
	 * @generated
	 */
	EOperation getClassifier__AllSlottableFeatures();

	/**
	 * Returns the meta object for enum '{@link uml.classification.CallConcurrencyKind <em>Call Concurrency Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Call Concurrency Kind</em>'.
	 * @see uml.classification.CallConcurrencyKind
	 * @generated
	 */
	EEnum getCallConcurrencyKind();

	/**
	 * Returns the meta object for enum '{@link uml.classification.AggregationKind <em>Aggregation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Kind</em>'.
	 * @see uml.classification.AggregationKind
	 * @generated
	 */
	EEnum getAggregationKind();

	/**
	 * Returns the meta object for enum '{@link uml.classification.ParameterDirectionKind <em>Parameter Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Direction Kind</em>'.
	 * @see uml.classification.ParameterDirectionKind
	 * @generated
	 */
	EEnum getParameterDirectionKind();

	/**
	 * Returns the meta object for enum '{@link uml.classification.ParameterEffectKind <em>Parameter Effect Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Effect Kind</em>'.
	 * @see uml.classification.ParameterEffectKind
	 * @generated
	 */
	EEnum getParameterEffectKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassificationFactory getClassificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uml.classification.impl.SubstitutionImpl <em>Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.SubstitutionImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getSubstitution()
		 * @generated
		 */
		EClass SUBSTITUTION = eINSTANCE.getSubstitution();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION__CONTRACT = eINSTANCE.getSubstitution_Contract();

		/**
		 * The meta object literal for the '<em><b>Substituting Classifier</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSTITUTION__SUBSTITUTING_CLASSIFIER = eINSTANCE.getSubstitution_SubstitutingClassifier();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.BehavioralFeatureImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getBehavioralFeature()
		 * @generated
		 */
		EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIORAL_FEATURE__CONCURRENCY = eINSTANCE.getBehavioralFeature_Concurrency();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIORAL_FEATURE__IS_ABSTRACT = eINSTANCE.getBehavioralFeature_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__METHOD = eINSTANCE.getBehavioralFeature_Method();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__OWNED_PARAMETER = eINSTANCE.getBehavioralFeature_OwnedParameter();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET = eINSTANCE.getBehavioralFeature_OwnedParameterSet();

		/**
		 * The meta object literal for the '<em><b>Raised Exception</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__RAISED_EXCEPTION = eINSTANCE.getBehavioralFeature_RaisedException();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BEHAVIORAL_FEATURE___INPUT_PARAMETERS = eINSTANCE.getBehavioralFeature__InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BEHAVIORAL_FEATURE___OUTPUT_PARAMETERS = eINSTANCE.getBehavioralFeature__OutputParameters();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.FeatureImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Featuring Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURING_CLASSIFIER = eINSTANCE.getFeature_FeaturingClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IS_STATIC = eINSTANCE.getFeature_IsStatic();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.RedefinableElementImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getRedefinableElement()
		 * @generated
		 */
		EClass REDEFINABLE_ELEMENT = eINSTANCE.getRedefinableElement();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDEFINABLE_ELEMENT__IS_LEAF = eINSTANCE.getRedefinableElement_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Redefined Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINABLE_ELEMENT__REDEFINED_ELEMENT = eINSTANCE.getRedefinableElement_RedefinedElement();

		/**
		 * The meta object literal for the '<em><b>Redefinition Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT = eINSTANCE.getRedefinableElement_RedefinitionContext();

		/**
		 * The meta object literal for the '<em><b>Is Consistent With</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = eINSTANCE.getRedefinableElement__IsConsistentWith__RedefinableElement();

		/**
		 * The meta object literal for the '<em><b>Is Redefinition Context Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = eINSTANCE.getRedefinableElement__IsRedefinitionContextValid__RedefinableElement();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.ParameterImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OPERATION = eINSTANCE.getParameter_Operation();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DIRECTION = eINSTANCE.getParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__EFFECT = eINSTANCE.getParameter_Effect();

		/**
		 * The meta object literal for the '<em><b>Is Exception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__IS_EXCEPTION = eINSTANCE.getParameter_IsException();

		/**
		 * The meta object literal for the '<em><b>Is Stream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__IS_STREAM = eINSTANCE.getParameter_IsStream();

		/**
		 * The meta object literal for the '<em><b>Parameter Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_SET = eINSTANCE.getParameter_ParameterSet();

		/**
		 * The meta object literal for the '<em><b>Default </b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___DEFAULT_ = eINSTANCE.getParameter__Default_();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.PropertyImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__INTERFACE = eINSTANCE.getProperty_Interface();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__AGGREGATION = eINSTANCE.getProperty_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ASSOCIATION = eINSTANCE.getProperty_Association();

		/**
		 * The meta object literal for the '<em><b>Association End</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ASSOCIATION_END = eINSTANCE.getProperty_AssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__QUALIFIER = eINSTANCE.getProperty_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CLASS = eINSTANCE.getProperty_Class();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DATATYPE = eINSTANCE.getProperty_Datatype();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DEFAULT_VALUE = eINSTANCE.getProperty_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_COMPOSITE = eINSTANCE.getProperty_IsComposite();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_DERIVED = eINSTANCE.getProperty_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Derived Union</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_DERIVED_UNION = eINSTANCE.getProperty_IsDerivedUnion();

		/**
		 * The meta object literal for the '<em><b>Is Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_ID = eINSTANCE.getProperty_IsId();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OPPOSITE = eINSTANCE.getProperty_Opposite();

		/**
		 * The meta object literal for the '<em><b>Owning Association</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OWNING_ASSOCIATION = eINSTANCE.getProperty_OwningAssociation();

		/**
		 * The meta object literal for the '<em><b>Redefined Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__REDEFINED_PROPERTY = eINSTANCE.getProperty_RedefinedProperty();

		/**
		 * The meta object literal for the '<em><b>Subsetted Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SUBSETTED_PROPERTY = eINSTANCE.getProperty_SubsettedProperty();

		/**
		 * The meta object literal for the '<em><b>Is Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___IS_ATTRIBUTE = eINSTANCE.getProperty__IsAttribute();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___IS_COMPOSITE = eINSTANCE.getProperty__IsComposite();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___IS_NAVIGABLE = eINSTANCE.getProperty__IsNavigable();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___OPPOSITE = eINSTANCE.getProperty__Opposite();

		/**
		 * The meta object literal for the '<em><b>Subsetting Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___SUBSETTING_CONTEXT = eINSTANCE.getProperty__SubsettingContext();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.OperationImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Body Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BODY_CONDITION = eINSTANCE.getOperation_BodyCondition();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CLASS = eINSTANCE.getOperation_Class();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__DATATYPE = eINSTANCE.getOperation_Datatype();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INTERFACE = eINSTANCE.getOperation_Interface();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_ORDERED = eINSTANCE.getOperation_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_QUERY = eINSTANCE.getOperation_IsQuery();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_UNIQUE = eINSTANCE.getOperation_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__LOWER = eINSTANCE.getOperation_Lower();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__POSTCONDITION = eINSTANCE.getOperation_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PRECONDITION = eINSTANCE.getOperation_Precondition();

		/**
		 * The meta object literal for the '<em><b>Redefined Operation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__REDEFINED_OPERATION = eINSTANCE.getOperation_RedefinedOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__TYPE = eINSTANCE.getOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__UPPER = eINSTANCE.getOperation_Upper();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___IS_ORDERED = eINSTANCE.getOperation__IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___IS_UNIQUE = eINSTANCE.getOperation__IsUnique();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___LOWER = eINSTANCE.getOperation__Lower();

		/**
		 * The meta object literal for the '<em><b>Return Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___RETURN_RESULT = eINSTANCE.getOperation__ReturnResult();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___TYPE = eINSTANCE.getOperation__Type();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___UPPER = eINSTANCE.getOperation__Upper();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.OperationTemplateParameterImpl <em>Operation Template Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.OperationTemplateParameterImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getOperationTemplateParameter()
		 * @generated
		 */
		EClass OPERATION_TEMPLATE_PARAMETER = eINSTANCE.getOperationTemplateParameter();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.StructuralFeatureImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_FEATURE__IS_READ_ONLY = eINSTANCE.getStructuralFeature_IsReadOnly();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.ParameterSetImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getParameterSet()
		 * @generated
		 */
		EClass PARAMETER_SET = eINSTANCE.getParameterSet();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET__CONDITION = eINSTANCE.getParameterSet_Condition();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET__PARAMETER = eINSTANCE.getParameterSet_Parameter();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.ClassifierTemplateParameterImpl <em>Classifier Template Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.ClassifierTemplateParameterImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getClassifierTemplateParameter()
		 * @generated
		 */
		EClass CLASSIFIER_TEMPLATE_PARAMETER = eINSTANCE.getClassifierTemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Allow Substitutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE = eINSTANCE.getClassifierTemplateParameter_AllowSubstitutable();

		/**
		 * The meta object literal for the '<em><b>Constraining Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER = eINSTANCE.getClassifierTemplateParameter_ConstrainingClassifier();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.GeneralizationImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Generalization Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERALIZATION_SET = eINSTANCE.getGeneralization_GeneralizationSet();

		/**
		 * The meta object literal for the '<em><b>Is Substitutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__IS_SUBSTITUTABLE = eINSTANCE.getGeneralization_IsSubstitutable();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.GeneralizationSetImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getGeneralizationSet()
		 * @generated
		 */
		EClass GENERALIZATION_SET = eINSTANCE.getGeneralizationSet();

		/**
		 * The meta object literal for the '<em><b>Is Covering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_COVERING = eINSTANCE.getGeneralizationSet_IsCovering();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_DISJOINT = eINSTANCE.getGeneralizationSet_IsDisjoint();

		/**
		 * The meta object literal for the '<em><b>Powertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__POWERTYPE = eINSTANCE.getGeneralizationSet_Powertype();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__GENERALIZATION = eINSTANCE.getGeneralizationSet_Generalization();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.InstanceSpecificationImpl <em>Instance Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.InstanceSpecificationImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getInstanceSpecification()
		 * @generated
		 */
		EClass INSTANCE_SPECIFICATION = eINSTANCE.getInstanceSpecification();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFICATION__CLASSIFIER = eINSTANCE.getInstanceSpecification_Classifier();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFICATION__SLOT = eINSTANCE.getInstanceSpecification_Slot();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_SPECIFICATION__SPECIFICATION = eINSTANCE.getInstanceSpecification_Specification();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.SlotImpl <em>Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.SlotImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getSlot()
		 * @generated
		 */
		EClass SLOT = eINSTANCE.getSlot();

		/**
		 * The meta object literal for the '<em><b>Defining Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__DEFINING_FEATURE = eINSTANCE.getSlot_DefiningFeature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__VALUE = eINSTANCE.getSlot_Value();

		/**
		 * The meta object literal for the '<em><b>Owning Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLOT__OWNING_INSTANCE = eINSTANCE.getSlot_OwningInstance();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.InstanceValueImpl <em>Instance Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.InstanceValueImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getInstanceValue()
		 * @generated
		 */
		EClass INSTANCE_VALUE = eINSTANCE.getInstanceValue();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_VALUE__INSTANCE = eINSTANCE.getInstanceValue_Instance();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.RedefinableTemplateSignatureImpl <em>Redefinable Template Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.RedefinableTemplateSignatureImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getRedefinableTemplateSignature()
		 * @generated
		 */
		EClass REDEFINABLE_TEMPLATE_SIGNATURE = eINSTANCE.getRedefinableTemplateSignature();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER = eINSTANCE.getRedefinableTemplateSignature_Classifier();

		/**
		 * The meta object literal for the '<em><b>Extended Signature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE = eINSTANCE.getRedefinableTemplateSignature_ExtendedSignature();

		/**
		 * The meta object literal for the '<em><b>Inherited Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER = eINSTANCE.getRedefinableTemplateSignature_InheritedParameter();

		/**
		 * The meta object literal for the '<em><b>Inherited Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REDEFINABLE_TEMPLATE_SIGNATURE___INHERITED_PARAMETER = eINSTANCE.getRedefinableTemplateSignature__InheritedParameter();

		/**
		 * The meta object literal for the '{@link uml.classification.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.impl.ClassifierImpl
		 * @see uml.classification.impl.ClassificationPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Substitution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__SUBSTITUTION = eINSTANCE.getClassifier_Substitution();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__FEATURE = eINSTANCE.getClassifier_Feature();

		/**
		 * The meta object literal for the '<em><b>Powertype Extent</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__POWERTYPE_EXTENT = eINSTANCE.getClassifier_PowertypeExtent();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__GENERALIZATION = eINSTANCE.getClassifier_Generalization();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__ATTRIBUTE = eINSTANCE.getClassifier_Attribute();

		/**
		 * The meta object literal for the '<em><b>Collaboration Use</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__COLLABORATION_USE = eINSTANCE.getClassifier_CollaborationUse();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__GENERAL = eINSTANCE.getClassifier_General();

		/**
		 * The meta object literal for the '<em><b>Inherited Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__INHERITED_MEMBER = eINSTANCE.getClassifier_InheritedMember();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_ABSTRACT = eINSTANCE.getClassifier_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Final Specialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_FINAL_SPECIALIZATION = eINSTANCE.getClassifier_IsFinalSpecialization();

		/**
		 * The meta object literal for the '<em><b>Owned Use Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__OWNED_USE_CASE = eINSTANCE.getClassifier_OwnedUseCase();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__USE_CASE = eINSTANCE.getClassifier_UseCase();

		/**
		 * The meta object literal for the '<em><b>Redefined Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__REDEFINED_CLASSIFIER = eINSTANCE.getClassifier_RedefinedClassifier();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__REPRESENTATION = eINSTANCE.getClassifier_Representation();

		/**
		 * The meta object literal for the '<em><b>All Features</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_FEATURES = eINSTANCE.getClassifier__AllFeatures();

		/**
		 * The meta object literal for the '<em><b>All Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_PARENTS = eINSTANCE.getClassifier__AllParents();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___GENERAL = eINSTANCE.getClassifier__General();

		/**
		 * The meta object literal for the '<em><b>Has Visibility Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT = eINSTANCE.getClassifier__HasVisibilityOf__NamedElement();

		/**
		 * The meta object literal for the '<em><b>Inherit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___INHERIT__ELIST = eINSTANCE.getClassifier__Inherit__EList();

		/**
		 * The meta object literal for the '<em><b>Inheritable Members</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER = eINSTANCE.getClassifier__InheritableMembers__Classifier();

		/**
		 * The meta object literal for the '<em><b>Inherited Member</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___INHERITED_MEMBER = eINSTANCE.getClassifier__InheritedMember();

		/**
		 * The meta object literal for the '<em><b>May Specialize Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER = eINSTANCE.getClassifier__MaySpecializeType__Classifier();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___PARENTS = eINSTANCE.getClassifier__Parents();

		/**
		 * The meta object literal for the '<em><b>Directly Realized Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___DIRECTLY_REALIZED_INTERFACES = eINSTANCE.getClassifier__DirectlyRealizedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Directly Used Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___DIRECTLY_USED_INTERFACES = eINSTANCE.getClassifier__DirectlyUsedInterfaces();

		/**
		 * The meta object literal for the '<em><b>All Realized Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_REALIZED_INTERFACES = eINSTANCE.getClassifier__AllRealizedInterfaces();

		/**
		 * The meta object literal for the '<em><b>All Used Interfaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_USED_INTERFACES = eINSTANCE.getClassifier__AllUsedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Is Substitutable For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER = eINSTANCE.getClassifier__IsSubstitutableFor__Classifier();

		/**
		 * The meta object literal for the '<em><b>All Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_ATTRIBUTES = eINSTANCE.getClassifier__AllAttributes();

		/**
		 * The meta object literal for the '<em><b>All Slottable Features</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_SLOTTABLE_FEATURES = eINSTANCE.getClassifier__AllSlottableFeatures();

		/**
		 * The meta object literal for the '{@link uml.classification.CallConcurrencyKind <em>Call Concurrency Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.CallConcurrencyKind
		 * @see uml.classification.impl.ClassificationPackageImpl#getCallConcurrencyKind()
		 * @generated
		 */
		EEnum CALL_CONCURRENCY_KIND = eINSTANCE.getCallConcurrencyKind();

		/**
		 * The meta object literal for the '{@link uml.classification.AggregationKind <em>Aggregation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.AggregationKind
		 * @see uml.classification.impl.ClassificationPackageImpl#getAggregationKind()
		 * @generated
		 */
		EEnum AGGREGATION_KIND = eINSTANCE.getAggregationKind();

		/**
		 * The meta object literal for the '{@link uml.classification.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.ParameterDirectionKind
		 * @see uml.classification.impl.ClassificationPackageImpl#getParameterDirectionKind()
		 * @generated
		 */
		EEnum PARAMETER_DIRECTION_KIND = eINSTANCE.getParameterDirectionKind();

		/**
		 * The meta object literal for the '{@link uml.classification.ParameterEffectKind <em>Parameter Effect Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.classification.ParameterEffectKind
		 * @see uml.classification.impl.ClassificationPackageImpl#getParameterEffectKind()
		 * @generated
		 */
		EEnum PARAMETER_EFFECT_KIND = eINSTANCE.getParameterEffectKind();

	}

} //ClassificationPackage
