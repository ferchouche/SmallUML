/**
 */
package uml.activities;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uml.classification.ClassificationPackage;

import uml.commonBehavior.CommonBehaviorPackage;

import uml.commonStructure.CommonStructurePackage;

import uml.structuredClassifiers.StructuredClassifiersPackage;

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
 * @see uml.activities.ActivitiesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Activities'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ActivitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/activities.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.activities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitiesPackage eINSTANCE = uml.activities.impl.ActivitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.activities.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ActivityImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_COMMENT = CommonBehaviorPackage.BEHAVIOR__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_ELEMENT = CommonBehaviorPackage.BEHAVIOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNER = CommonBehaviorPackage.BEHAVIOR__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = CommonBehaviorPackage.BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME_EXPRESSION = CommonBehaviorPackage.BEHAVIOR__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAMESPACE = CommonBehaviorPackage.BEHAVIOR__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__QUALIFIED_NAME = CommonBehaviorPackage.BEHAVIOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VISIBILITY = CommonBehaviorPackage.BEHAVIOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CLIENT_DEPENDENCY = CommonBehaviorPackage.BEHAVIOR__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ELEMENT_IMPORT = CommonBehaviorPackage.BEHAVIOR__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IMPORTED_MEMBER = CommonBehaviorPackage.BEHAVIOR__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MEMBER = CommonBehaviorPackage.BEHAVIOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_MEMBER = CommonBehaviorPackage.BEHAVIOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_RULE = CommonBehaviorPackage.BEHAVIOR__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PACKAGE_IMPORT = CommonBehaviorPackage.BEHAVIOR__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_LEAF = CommonBehaviorPackage.BEHAVIOR__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REDEFINED_ELEMENT = CommonBehaviorPackage.BEHAVIOR__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REDEFINITION_CONTEXT = CommonBehaviorPackage.BEHAVIOR__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNING_TEMPLATE_PARAMETER = CommonBehaviorPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TEMPLATE_PARAMETER = CommonBehaviorPackage.BEHAVIOR__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PACKAGE = CommonBehaviorPackage.BEHAVIOR__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TEMPLATE_BINDING = CommonBehaviorPackage.BEHAVIOR__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_TEMPLATE_SIGNATURE = CommonBehaviorPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUBSTITUTION = CommonBehaviorPackage.BEHAVIOR__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FEATURE = CommonBehaviorPackage.BEHAVIOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__POWERTYPE_EXTENT = CommonBehaviorPackage.BEHAVIOR__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GENERALIZATION = CommonBehaviorPackage.BEHAVIOR__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ATTRIBUTE = CommonBehaviorPackage.BEHAVIOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COLLABORATION_USE = CommonBehaviorPackage.BEHAVIOR__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GENERAL = CommonBehaviorPackage.BEHAVIOR__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INHERITED_MEMBER = CommonBehaviorPackage.BEHAVIOR__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_ABSTRACT = CommonBehaviorPackage.BEHAVIOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_FINAL_SPECIALIZATION = CommonBehaviorPackage.BEHAVIOR__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_USE_CASE = CommonBehaviorPackage.BEHAVIOR__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__USE_CASE = CommonBehaviorPackage.BEHAVIOR__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REDEFINED_CLASSIFIER = CommonBehaviorPackage.BEHAVIOR__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REPRESENTATION = CommonBehaviorPackage.BEHAVIOR__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_ATTRIBUTE = CommonBehaviorPackage.BEHAVIOR__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_CONNECTOR = CommonBehaviorPackage.BEHAVIOR__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PART = CommonBehaviorPackage.BEHAVIOR__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ROLE = CommonBehaviorPackage.BEHAVIOR__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_PORT = CommonBehaviorPackage.BEHAVIOR__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INTERFACE_REALIZATION = CommonBehaviorPackage.BEHAVIOR__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CLASSIFIER_BEHAVIOR = CommonBehaviorPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_BEHAVIOR = CommonBehaviorPackage.BEHAVIOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_OPERATION = CommonBehaviorPackage.BEHAVIOR__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXTENSION = CommonBehaviorPackage.BEHAVIOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_ACTIVE = CommonBehaviorPackage.BEHAVIOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NESTED_CLASSIFIER = CommonBehaviorPackage.BEHAVIOR__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_RECEPTION = CommonBehaviorPackage.BEHAVIOR__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUPER_CLASS = CommonBehaviorPackage.BEHAVIOR__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SPECIFICATION = CommonBehaviorPackage.BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONTEXT = CommonBehaviorPackage.BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_REENTRANT = CommonBehaviorPackage.BEHAVIOR__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_PARAMETER = CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNED_PARAMETER_SET = CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__POSTCONDITION = CommonBehaviorPackage.BEHAVIOR__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRECONDITION = CommonBehaviorPackage.BEHAVIOR__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__REDEFINED_BEHAVIOR = CommonBehaviorPackage.BEHAVIOR__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EDGE = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NODE = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VARIABLE = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Structured Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STRUCTURED_NODE = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GROUP = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_READ_ONLY = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Single Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_SINGLE_EXECUTION = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PARTITION = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_OWNED_ELEMENTS = CommonBehaviorPackage.BEHAVIOR___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___MUST_BE_OWNED = CommonBehaviorPackage.BEHAVIOR___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_NAMESPACES = CommonBehaviorPackage.BEHAVIOR___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_OWNING_PACKAGES = CommonBehaviorPackage.BEHAVIOR___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonBehaviorPackage.BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___QUALIFIED_NAME = CommonBehaviorPackage.BEHAVIOR___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___SEPARATOR = CommonBehaviorPackage.BEHAVIOR___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___CLIENT_DEPENDENCY = CommonBehaviorPackage.BEHAVIOR___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___EXCLUDE_COLLISIONS__ELIST = CommonBehaviorPackage.BEHAVIOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonBehaviorPackage.BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___IMPORT_MEMBERS__ELIST = CommonBehaviorPackage.BEHAVIOR___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___IMPORTED_MEMBER = CommonBehaviorPackage.BEHAVIOR___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___MEMBERS_ARE_DISTINGUISHABLE = CommonBehaviorPackage.BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CommonBehaviorPackage.BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CommonBehaviorPackage.BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonBehaviorPackage.BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___IS_TEMPLATE_PARAMETER = CommonBehaviorPackage.BEHAVIOR___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___CONFORMS_TO__TYPE = CommonBehaviorPackage.BEHAVIOR___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___IS_TEMPLATE = CommonBehaviorPackage.BEHAVIOR___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___PARAMETERABLE_ELEMENTS = CommonBehaviorPackage.BEHAVIOR___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_FEATURES = CommonBehaviorPackage.BEHAVIOR___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_PARENTS = CommonBehaviorPackage.BEHAVIOR___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___GENERAL = CommonBehaviorPackage.BEHAVIOR___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___HAS_VISIBILITY_OF__NAMEDELEMENT = CommonBehaviorPackage.BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___INHERIT__ELIST = CommonBehaviorPackage.BEHAVIOR___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___INHERITABLE_MEMBERS__CLASSIFIER = CommonBehaviorPackage.BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___INHERITED_MEMBER = CommonBehaviorPackage.BEHAVIOR___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___MAY_SPECIALIZE_TYPE__CLASSIFIER = CommonBehaviorPackage.BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___PARENTS = CommonBehaviorPackage.BEHAVIOR___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___DIRECTLY_REALIZED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___DIRECTLY_USED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_REALIZED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_USED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___IS_SUBSTITUTABLE_FOR__CLASSIFIER = CommonBehaviorPackage.BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_ATTRIBUTES = CommonBehaviorPackage.BEHAVIOR___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_SLOTTABLE_FEATURES = CommonBehaviorPackage.BEHAVIOR___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___PART = CommonBehaviorPackage.BEHAVIOR___PART;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___ALL_ROLES = CommonBehaviorPackage.BEHAVIOR___ALL_ROLES;

	/**
	 * The operation id for the '<em>Owned Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___OWNED_PORT = CommonBehaviorPackage.BEHAVIOR___OWNED_PORT;

	/**
	 * The operation id for the '<em>Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___EXTENSION = CommonBehaviorPackage.BEHAVIOR___EXTENSION;

	/**
	 * The operation id for the '<em>Super Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___SUPER_CLASS = CommonBehaviorPackage.BEHAVIOR___SUPER_CLASS;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___CONTEXT = CommonBehaviorPackage.BEHAVIOR___CONTEXT;

	/**
	 * The operation id for the '<em>Behaviored Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___BEHAVIORED_CLASSIFIER__ELEMENT = CommonBehaviorPackage.BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___INPUT_PARAMETERS = CommonBehaviorPackage.BEHAVIOR___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___OUTPUT_PARAMETERS = CommonBehaviorPackage.BEHAVIOR___OUTPUT_PARAMETERS;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = CommonBehaviorPackage.BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ActivityEdgeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__OWNED_COMMENT = ClassificationPackage.REDEFINABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__OWNED_ELEMENT = ClassificationPackage.REDEFINABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__OWNER = ClassificationPackage.REDEFINABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME = ClassificationPackage.REDEFINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME_EXPRESSION = ClassificationPackage.REDEFINABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAMESPACE = ClassificationPackage.REDEFINABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__QUALIFIED_NAME = ClassificationPackage.REDEFINABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__VISIBILITY = ClassificationPackage.REDEFINABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__CLIENT_DEPENDENCY = ClassificationPackage.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__IS_LEAF = ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__REDEFINED_ELEMENT = ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__REDEFINITION_CONTEXT = ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__GUARD = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__IN_GROUP = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interrupts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__INTERRUPTS = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__IN_PARTITION = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__IN_STRUCTURED_NODE = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Redefined Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__REDEFINED_EDGE = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__WEIGHT = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__ACTIVITY = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___ALL_OWNED_ELEMENTS = ClassificationPackage.REDEFINABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___MUST_BE_OWNED = ClassificationPackage.REDEFINABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___ALL_NAMESPACES = ClassificationPackage.REDEFINABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___ALL_OWNING_PACKAGES = ClassificationPackage.REDEFINABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ClassificationPackage.REDEFINABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___QUALIFIED_NAME = ClassificationPackage.REDEFINABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___SEPARATOR = ClassificationPackage.REDEFINABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___CLIENT_DEPENDENCY = ClassificationPackage.REDEFINABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ClassificationPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ClassificationPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The number of operations of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OPERATION_COUNT = ClassificationPackage.REDEFINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ActivityGroupImpl <em>Activity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ActivityGroupImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityGroup()
	 * @generated
	 */
	int ACTIVITY_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__CONTAINED_NODE = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__IN_ACTIVITY = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__SUBGROUP = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__SUPER_GROUP = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__CONTAINED_EDGE = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP___CONTAINING_ACTIVITY = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ActivityNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OWNED_COMMENT = ClassificationPackage.REDEFINABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OWNED_ELEMENT = ClassificationPackage.REDEFINABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OWNER = ClassificationPackage.REDEFINABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = ClassificationPackage.REDEFINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME_EXPRESSION = ClassificationPackage.REDEFINABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAMESPACE = ClassificationPackage.REDEFINABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__QUALIFIED_NAME = ClassificationPackage.REDEFINABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__VISIBILITY = ClassificationPackage.REDEFINABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__CLIENT_DEPENDENCY = ClassificationPackage.REDEFINABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__IS_LEAF = ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__REDEFINED_ELEMENT = ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__REDEFINITION_CONTEXT = ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ACTIVITY = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__IN_PARTITION = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__IN_STRUCTURED_NODE = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INCOMING = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OUTGOING = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__REDEFINED_NODE = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__IN_GROUP = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = ClassificationPackage.REDEFINABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___ALL_OWNED_ELEMENTS = ClassificationPackage.REDEFINABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___MUST_BE_OWNED = ClassificationPackage.REDEFINABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___ALL_NAMESPACES = ClassificationPackage.REDEFINABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___ALL_OWNING_PACKAGES = ClassificationPackage.REDEFINABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ClassificationPackage.REDEFINABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___QUALIFIED_NAME = ClassificationPackage.REDEFINABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___SEPARATOR = ClassificationPackage.REDEFINABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___CLIENT_DEPENDENCY = ClassificationPackage.REDEFINABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ClassificationPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ClassificationPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = ClassificationPackage.REDEFINABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OPERATION_COUNT = ClassificationPackage.REDEFINABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.activities.impl.InterruptibleActivityRegionImpl <em>Interruptible Activity Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.InterruptibleActivityRegionImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getInterruptibleActivityRegion()
	 * @generated
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__OWNED_COMMENT = ACTIVITY_GROUP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__OWNED_ELEMENT = ACTIVITY_GROUP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__OWNER = ACTIVITY_GROUP__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__NAME = ACTIVITY_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__NAME_EXPRESSION = ACTIVITY_GROUP__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__NAMESPACE = ACTIVITY_GROUP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__QUALIFIED_NAME = ACTIVITY_GROUP__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__VISIBILITY = ACTIVITY_GROUP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__CLIENT_DEPENDENCY = ACTIVITY_GROUP__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_NODE = ACTIVITY_GROUP__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__IN_ACTIVITY = ACTIVITY_GROUP__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__SUBGROUP = ACTIVITY_GROUP__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP = ACTIVITY_GROUP__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__CONTAINED_EDGE = ACTIVITY_GROUP__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Interrupting Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE = ACTIVITY_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__NODE = ACTIVITY_GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interruptible Activity Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION_FEATURE_COUNT = ACTIVITY_GROUP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION___ALL_OWNED_ELEMENTS = ACTIVITY_GROUP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION___MUST_BE_OWNED = ACTIVITY_GROUP___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION___ALL_NAMESPACES = ACTIVITY_GROUP___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION___ALL_OWNING_PACKAGES = ACTIVITY_GROUP___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTIVITY_GROUP___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION___QUALIFIED_NAME = ACTIVITY_GROUP___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION___SEPARATOR = ACTIVITY_GROUP___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION___CLIENT_DEPENDENCY = ACTIVITY_GROUP___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION___CONTAINING_ACTIVITY = ACTIVITY_GROUP___CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Interruptible Activity Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION_OPERATION_COUNT = ACTIVITY_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ActivityPartitionImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityPartition()
	 * @generated
	 */
	int ACTIVITY_PARTITION = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__OWNED_COMMENT = ACTIVITY_GROUP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__OWNED_ELEMENT = ACTIVITY_GROUP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__OWNER = ACTIVITY_GROUP__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__NAME = ACTIVITY_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__NAME_EXPRESSION = ACTIVITY_GROUP__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__NAMESPACE = ACTIVITY_GROUP__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__QUALIFIED_NAME = ACTIVITY_GROUP__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__VISIBILITY = ACTIVITY_GROUP__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__CLIENT_DEPENDENCY = ACTIVITY_GROUP__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__CONTAINED_NODE = ACTIVITY_GROUP__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__IN_ACTIVITY = ACTIVITY_GROUP__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUBGROUP = ACTIVITY_GROUP__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUPER_GROUP = ACTIVITY_GROUP__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__CONTAINED_EDGE = ACTIVITY_GROUP__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__EDGE = ACTIVITY_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__IS_DIMENSION = ACTIVITY_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__IS_EXTERNAL = ACTIVITY_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__REPRESENTS = ACTIVITY_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subpartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUBPARTITION = ACTIVITY_GROUP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Super Partition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUPER_PARTITION = ACTIVITY_GROUP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__NODE = ACTIVITY_GROUP_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Activity Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION_FEATURE_COUNT = ACTIVITY_GROUP_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION___ALL_OWNED_ELEMENTS = ACTIVITY_GROUP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION___MUST_BE_OWNED = ACTIVITY_GROUP___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION___ALL_NAMESPACES = ACTIVITY_GROUP___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION___ALL_OWNING_PACKAGES = ACTIVITY_GROUP___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTIVITY_GROUP___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION___QUALIFIED_NAME = ACTIVITY_GROUP___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION___SEPARATOR = ACTIVITY_GROUP___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION___CLIENT_DEPENDENCY = ACTIVITY_GROUP___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION___CONTAINING_ACTIVITY = ACTIVITY_GROUP___CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Activity Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION_OPERATION_COUNT = ACTIVITY_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ExecutableNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OWNED_COMMENT = ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OWNED_ELEMENT = ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OWNER = ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME_EXPRESSION = ACTIVITY_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAMESPACE = ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__QUALIFIED_NAME = ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__VISIBILITY = ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__CLIENT_DEPENDENCY = ACTIVITY_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IS_LEAF = ACTIVITY_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__REDEFINED_ELEMENT = ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__REDEFINITION_CONTEXT = ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION = ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_PARTITION = ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_STRUCTURED_NODE = ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__REDEFINED_NODE = ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_GROUP = ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__HANDLER = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___ALL_OWNED_ELEMENTS = ACTIVITY_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___MUST_BE_OWNED = ACTIVITY_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___ALL_NAMESPACES = ACTIVITY_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___ALL_OWNING_PACKAGES = ACTIVITY_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___QUALIFIED_NAME = ACTIVITY_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___SEPARATOR = ACTIVITY_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___CLIENT_DEPENDENCY = ACTIVITY_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ExceptionHandlerImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getExceptionHandler()
	 * @generated
	 */
	int EXCEPTION_HANDLER = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__OWNED_COMMENT = CommonStructurePackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__OWNED_ELEMENT = CommonStructurePackage.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__OWNER = CommonStructurePackage.ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Exception Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__EXCEPTION_INPUT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__EXCEPTION_TYPE = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Handler Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__HANDLER_BODY = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protected Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__PROTECTED_NODE = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_FEATURE_COUNT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER___ALL_OWNED_ELEMENTS = CommonStructurePackage.ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER___MUST_BE_OWNED = CommonStructurePackage.ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_OPERATION_COUNT = CommonStructurePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ObjectNodeImpl <em>Object Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ObjectNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getObjectNode()
	 * @generated
	 */
	int OBJECT_NODE = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OWNED_COMMENT = ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OWNED_ELEMENT = ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OWNER = ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__NAME_EXPRESSION = ACTIVITY_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__NAMESPACE = ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__QUALIFIED_NAME = ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__VISIBILITY = ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__CLIENT_DEPENDENCY = ACTIVITY_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IS_LEAF = ACTIVITY_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__REDEFINED_ELEMENT = ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__REDEFINITION_CONTEXT = ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IN_INTERRUPTIBLE_REGION = ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IN_PARTITION = ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IN_STRUCTURED_NODE = ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__REDEFINED_NODE = ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IN_GROUP = ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__TYPE = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IN_STATE = ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IS_CONTROL_TYPE = ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ORDERING = ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__SELECTION = ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__UPPER_BOUND = ACTIVITY_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___ALL_OWNED_ELEMENTS = ACTIVITY_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___MUST_BE_OWNED = ACTIVITY_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___ALL_NAMESPACES = ACTIVITY_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___ALL_OWNING_PACKAGES = ACTIVITY_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___QUALIFIED_NAME = ACTIVITY_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___SEPARATOR = ACTIVITY_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___CLIENT_DEPENDENCY = ACTIVITY_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.VariableImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OWNED_COMMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OWNED_ELEMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OWNER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME_EXPRESSION = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAMESPACE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__QUALIFIED_NAME = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VISIBILITY = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CLIENT_DEPENDENCY = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OWNING_TEMPLATE_PARAMETER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TEMPLATE_PARAMETER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__END = StructuredClassifiersPackage.CONNECTABLE_ELEMENT__END;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_ORDERED = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_UNIQUE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LOWER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LOWER_VALUE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UPPER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UPPER_VALUE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Activity Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ACTIVITY_SCOPE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SCOPE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___ALL_OWNED_ELEMENTS = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___MUST_BE_OWNED = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___ALL_NAMESPACES = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___ALL_OWNING_PACKAGES = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___QUALIFIED_NAME = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___SEPARATOR = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___CLIENT_DEPENDENCY = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___IS_TEMPLATE_PARAMETER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___END = StructuredClassifiersPackage.CONNECTABLE_ELEMENT___END;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___COMPATIBLE_WITH__MULTIPLICITYELEMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___IS__INT_INT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___IS_MULTIVALUED = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___LOWER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___LOWER_BOUND = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___UPPER = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___UPPER_BOUND = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Accessible By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___IS_ACCESSIBLE_BY__ACTION = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = StructuredClassifiersPackage.CONNECTABLE_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ControlNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OWNED_COMMENT = ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OWNED_ELEMENT = ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OWNER = ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME_EXPRESSION = ACTIVITY_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAMESPACE = ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__QUALIFIED_NAME = ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__VISIBILITY = ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__CLIENT_DEPENDENCY = ACTIVITY_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__IS_LEAF = ACTIVITY_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__REDEFINED_ELEMENT = ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__REDEFINITION_CONTEXT = ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__IN_INTERRUPTIBLE_REGION = ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__IN_PARTITION = ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__IN_STRUCTURED_NODE = ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__REDEFINED_NODE = ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__IN_GROUP = ACTIVITY_NODE__IN_GROUP;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___ALL_OWNED_ELEMENTS = ACTIVITY_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___MUST_BE_OWNED = ACTIVITY_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___ALL_NAMESPACES = ACTIVITY_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___ALL_OWNING_PACKAGES = ACTIVITY_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___QUALIFIED_NAME = ACTIVITY_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___SEPARATOR = ACTIVITY_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___CLIENT_DEPENDENCY = ACTIVITY_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.FinalNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 11;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OWNED_ELEMENT = CONTROL_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OWNER = CONTROL_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__NAME_EXPRESSION = CONTROL_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__NAMESPACE = CONTROL_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__QUALIFIED_NAME = CONTROL_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__VISIBILITY = CONTROL_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__CLIENT_DEPENDENCY = CONTROL_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IS_LEAF = CONTROL_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__REDEFINED_ELEMENT = CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__REDEFINITION_CONTEXT = CONTROL_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IN_INTERRUPTIBLE_REGION = CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IN_PARTITION = CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IN_STRUCTURED_NODE = CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__REDEFINED_NODE = CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__IN_GROUP = CONTROL_NODE__IN_GROUP;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___ALL_OWNED_ELEMENTS = CONTROL_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___MUST_BE_OWNED = CONTROL_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___ALL_NAMESPACES = CONTROL_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___ALL_OWNING_PACKAGES = CONTROL_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTROL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___QUALIFIED_NAME = CONTROL_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___SEPARATOR = CONTROL_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___CLIENT_DEPENDENCY = CONTROL_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CONTROL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CONTROL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = CONTROL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ActivityFinalNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityFinalNode()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__OWNED_COMMENT = FINAL_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__OWNED_ELEMENT = FINAL_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__OWNER = FINAL_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__NAME = FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__NAME_EXPRESSION = FINAL_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__NAMESPACE = FINAL_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__QUALIFIED_NAME = FINAL_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__VISIBILITY = FINAL_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__CLIENT_DEPENDENCY = FINAL_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__IS_LEAF = FINAL_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__REDEFINED_ELEMENT = FINAL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__REDEFINITION_CONTEXT = FINAL_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__ACTIVITY = FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__IN_INTERRUPTIBLE_REGION = FINAL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__IN_PARTITION = FINAL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__IN_STRUCTURED_NODE = FINAL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__INCOMING = FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__OUTGOING = FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__REDEFINED_NODE = FINAL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__IN_GROUP = FINAL_NODE__IN_GROUP;

	/**
	 * The number of structural features of the '<em>Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_FEATURE_COUNT = FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___ALL_OWNED_ELEMENTS = FINAL_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___MUST_BE_OWNED = FINAL_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___ALL_NAMESPACES = FINAL_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___ALL_OWNING_PACKAGES = FINAL_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = FINAL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___QUALIFIED_NAME = FINAL_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___SEPARATOR = FINAL_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___CLIENT_DEPENDENCY = FINAL_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = FINAL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = FINAL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = FINAL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_OPERATION_COUNT = FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ActivityParameterNodeImpl <em>Activity Parameter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ActivityParameterNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityParameterNode()
	 * @generated
	 */
	int ACTIVITY_PARAMETER_NODE = 13;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__OWNED_COMMENT = OBJECT_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__OWNED_ELEMENT = OBJECT_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__OWNER = OBJECT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__NAME_EXPRESSION = OBJECT_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__NAMESPACE = OBJECT_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__QUALIFIED_NAME = OBJECT_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__VISIBILITY = OBJECT_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__CLIENT_DEPENDENCY = OBJECT_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__IS_LEAF = OBJECT_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__REDEFINED_ELEMENT = OBJECT_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__REDEFINITION_CONTEXT = OBJECT_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__ACTIVITY = OBJECT_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__IN_INTERRUPTIBLE_REGION = OBJECT_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__IN_PARTITION = OBJECT_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__IN_STRUCTURED_NODE = OBJECT_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__INCOMING = OBJECT_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__OUTGOING = OBJECT_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__REDEFINED_NODE = OBJECT_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__IN_GROUP = OBJECT_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__TYPE = OBJECT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__IN_STATE = OBJECT_NODE__IN_STATE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__ORDERING = OBJECT_NODE__ORDERING;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__SELECTION = OBJECT_NODE__SELECTION;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__PARAMETER = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Parameter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___ALL_OWNED_ELEMENTS = OBJECT_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___MUST_BE_OWNED = OBJECT_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___ALL_NAMESPACES = OBJECT_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___ALL_OWNING_PACKAGES = OBJECT_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = OBJECT_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___QUALIFIED_NAME = OBJECT_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___SEPARATOR = OBJECT_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___CLIENT_DEPENDENCY = OBJECT_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = OBJECT_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = OBJECT_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = OBJECT_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Activity Parameter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_OPERATION_COUNT = OBJECT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.CentralBufferNodeImpl <em>Central Buffer Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.CentralBufferNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getCentralBufferNode()
	 * @generated
	 */
	int CENTRAL_BUFFER_NODE = 14;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__OWNED_COMMENT = OBJECT_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__OWNED_ELEMENT = OBJECT_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__OWNER = OBJECT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__NAME_EXPRESSION = OBJECT_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__NAMESPACE = OBJECT_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__QUALIFIED_NAME = OBJECT_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__VISIBILITY = OBJECT_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__CLIENT_DEPENDENCY = OBJECT_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IS_LEAF = OBJECT_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__REDEFINED_ELEMENT = OBJECT_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__REDEFINITION_CONTEXT = OBJECT_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__ACTIVITY = OBJECT_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IN_INTERRUPTIBLE_REGION = OBJECT_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IN_PARTITION = OBJECT_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IN_STRUCTURED_NODE = OBJECT_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__INCOMING = OBJECT_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__OUTGOING = OBJECT_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__REDEFINED_NODE = OBJECT_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IN_GROUP = OBJECT_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__TYPE = OBJECT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IN_STATE = OBJECT_NODE__IN_STATE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__ORDERING = OBJECT_NODE__ORDERING;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__SELECTION = OBJECT_NODE__SELECTION;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>Central Buffer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___ALL_OWNED_ELEMENTS = OBJECT_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___MUST_BE_OWNED = OBJECT_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___ALL_NAMESPACES = OBJECT_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___ALL_OWNING_PACKAGES = OBJECT_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = OBJECT_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___QUALIFIED_NAME = OBJECT_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___SEPARATOR = OBJECT_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___CLIENT_DEPENDENCY = OBJECT_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = OBJECT_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = OBJECT_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = OBJECT_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Central Buffer Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTRAL_BUFFER_NODE_OPERATION_COUNT = OBJECT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ControlFlowImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__OWNED_COMMENT = ACTIVITY_EDGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__OWNED_ELEMENT = ACTIVITY_EDGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__OWNER = ACTIVITY_EDGE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME_EXPRESSION = ACTIVITY_EDGE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAMESPACE = ACTIVITY_EDGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__QUALIFIED_NAME = ACTIVITY_EDGE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__VISIBILITY = ACTIVITY_EDGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__CLIENT_DEPENDENCY = ACTIVITY_EDGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__IS_LEAF = ACTIVITY_EDGE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__REDEFINED_ELEMENT = ACTIVITY_EDGE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__REDEFINITION_CONTEXT = ACTIVITY_EDGE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__GUARD = ACTIVITY_EDGE__GUARD;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__IN_GROUP = ACTIVITY_EDGE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Interrupts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__INTERRUPTS = ACTIVITY_EDGE__INTERRUPTS;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__IN_PARTITION = ACTIVITY_EDGE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__IN_STRUCTURED_NODE = ACTIVITY_EDGE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Redefined Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__REDEFINED_EDGE = ACTIVITY_EDGE__REDEFINED_EDGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__WEIGHT = ACTIVITY_EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__ACTIVITY = ACTIVITY_EDGE__ACTIVITY;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___ALL_OWNED_ELEMENTS = ACTIVITY_EDGE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___MUST_BE_OWNED = ACTIVITY_EDGE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___ALL_NAMESPACES = ACTIVITY_EDGE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___ALL_OWNING_PACKAGES = ACTIVITY_EDGE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTIVITY_EDGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___QUALIFIED_NAME = ACTIVITY_EDGE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___SEPARATOR = ACTIVITY_EDGE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___CLIENT_DEPENDENCY = ACTIVITY_EDGE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTIVITY_EDGE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTIVITY_EDGE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = ACTIVITY_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.DataStoreNodeImpl <em>Data Store Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.DataStoreNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getDataStoreNode()
	 * @generated
	 */
	int DATA_STORE_NODE = 16;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__OWNED_COMMENT = CENTRAL_BUFFER_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__OWNED_ELEMENT = CENTRAL_BUFFER_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__OWNER = CENTRAL_BUFFER_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__NAME = CENTRAL_BUFFER_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__NAME_EXPRESSION = CENTRAL_BUFFER_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__NAMESPACE = CENTRAL_BUFFER_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__QUALIFIED_NAME = CENTRAL_BUFFER_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__VISIBILITY = CENTRAL_BUFFER_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__CLIENT_DEPENDENCY = CENTRAL_BUFFER_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IS_LEAF = CENTRAL_BUFFER_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__REDEFINED_ELEMENT = CENTRAL_BUFFER_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__REDEFINITION_CONTEXT = CENTRAL_BUFFER_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__ACTIVITY = CENTRAL_BUFFER_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IN_INTERRUPTIBLE_REGION = CENTRAL_BUFFER_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IN_PARTITION = CENTRAL_BUFFER_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IN_STRUCTURED_NODE = CENTRAL_BUFFER_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__INCOMING = CENTRAL_BUFFER_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__OUTGOING = CENTRAL_BUFFER_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__REDEFINED_NODE = CENTRAL_BUFFER_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IN_GROUP = CENTRAL_BUFFER_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__TYPE = CENTRAL_BUFFER_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IN_STATE = CENTRAL_BUFFER_NODE__IN_STATE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__IS_CONTROL_TYPE = CENTRAL_BUFFER_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__ORDERING = CENTRAL_BUFFER_NODE__ORDERING;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__SELECTION = CENTRAL_BUFFER_NODE__SELECTION;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE__UPPER_BOUND = CENTRAL_BUFFER_NODE__UPPER_BOUND;

	/**
	 * The number of structural features of the '<em>Data Store Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE_FEATURE_COUNT = CENTRAL_BUFFER_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___ALL_OWNED_ELEMENTS = CENTRAL_BUFFER_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___MUST_BE_OWNED = CENTRAL_BUFFER_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___ALL_NAMESPACES = CENTRAL_BUFFER_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___ALL_OWNING_PACKAGES = CENTRAL_BUFFER_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CENTRAL_BUFFER_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___QUALIFIED_NAME = CENTRAL_BUFFER_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___SEPARATOR = CENTRAL_BUFFER_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___CLIENT_DEPENDENCY = CENTRAL_BUFFER_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CENTRAL_BUFFER_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CENTRAL_BUFFER_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = CENTRAL_BUFFER_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Data Store Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_NODE_OPERATION_COUNT = CENTRAL_BUFFER_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.DecisionNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OWNED_ELEMENT = CONTROL_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OWNER = CONTROL_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__NAME_EXPRESSION = CONTROL_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__NAMESPACE = CONTROL_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__QUALIFIED_NAME = CONTROL_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__VISIBILITY = CONTROL_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__CLIENT_DEPENDENCY = CONTROL_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IS_LEAF = CONTROL_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__REDEFINED_ELEMENT = CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__REDEFINITION_CONTEXT = CONTROL_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IN_INTERRUPTIBLE_REGION = CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IN_PARTITION = CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IN_STRUCTURED_NODE = CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__REDEFINED_NODE = CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__IN_GROUP = CONTROL_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Decision Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__DECISION_INPUT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Input Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__DECISION_INPUT_FLOW = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___ALL_OWNED_ELEMENTS = CONTROL_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___MUST_BE_OWNED = CONTROL_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___ALL_NAMESPACES = CONTROL_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___ALL_OWNING_PACKAGES = CONTROL_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTROL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___QUALIFIED_NAME = CONTROL_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___SEPARATOR = CONTROL_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___CLIENT_DEPENDENCY = CONTROL_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CONTROL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CONTROL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = CONTROL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ObjectFlowImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getObjectFlow()
	 * @generated
	 */
	int OBJECT_FLOW = 18;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__OWNED_COMMENT = ACTIVITY_EDGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__OWNED_ELEMENT = ACTIVITY_EDGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__OWNER = ACTIVITY_EDGE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__NAME_EXPRESSION = ACTIVITY_EDGE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__NAMESPACE = ACTIVITY_EDGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__QUALIFIED_NAME = ACTIVITY_EDGE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__VISIBILITY = ACTIVITY_EDGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__CLIENT_DEPENDENCY = ACTIVITY_EDGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IS_LEAF = ACTIVITY_EDGE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__REDEFINED_ELEMENT = ACTIVITY_EDGE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__REDEFINITION_CONTEXT = ACTIVITY_EDGE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__GUARD = ACTIVITY_EDGE__GUARD;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IN_GROUP = ACTIVITY_EDGE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Interrupts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__INTERRUPTS = ACTIVITY_EDGE__INTERRUPTS;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IN_PARTITION = ACTIVITY_EDGE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IN_STRUCTURED_NODE = ACTIVITY_EDGE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Redefined Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__REDEFINED_EDGE = ACTIVITY_EDGE__REDEFINED_EDGE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__WEIGHT = ACTIVITY_EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__ACTIVITY = ACTIVITY_EDGE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Is Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IS_MULTICAST = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Multireceive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IS_MULTIRECEIVE = ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__SELECTION = ACTIVITY_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__TRANSFORMATION = ACTIVITY_EDGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___ALL_OWNED_ELEMENTS = ACTIVITY_EDGE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___MUST_BE_OWNED = ACTIVITY_EDGE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___ALL_NAMESPACES = ACTIVITY_EDGE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___ALL_OWNING_PACKAGES = ACTIVITY_EDGE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTIVITY_EDGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___QUALIFIED_NAME = ACTIVITY_EDGE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___SEPARATOR = ACTIVITY_EDGE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___CLIENT_DEPENDENCY = ACTIVITY_EDGE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTIVITY_EDGE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTIVITY_EDGE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The number of operations of the '<em>Object Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW_OPERATION_COUNT = ACTIVITY_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.FlowFinalNodeImpl <em>Flow Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.FlowFinalNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getFlowFinalNode()
	 * @generated
	 */
	int FLOW_FINAL_NODE = 19;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__OWNED_COMMENT = FINAL_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__OWNED_ELEMENT = FINAL_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__OWNER = FINAL_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__NAME = FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__NAME_EXPRESSION = FINAL_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__NAMESPACE = FINAL_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__QUALIFIED_NAME = FINAL_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__VISIBILITY = FINAL_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__CLIENT_DEPENDENCY = FINAL_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__IS_LEAF = FINAL_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__REDEFINED_ELEMENT = FINAL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__REDEFINITION_CONTEXT = FINAL_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__ACTIVITY = FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__IN_INTERRUPTIBLE_REGION = FINAL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__IN_PARTITION = FINAL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__IN_STRUCTURED_NODE = FINAL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__INCOMING = FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__OUTGOING = FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__REDEFINED_NODE = FINAL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE__IN_GROUP = FINAL_NODE__IN_GROUP;

	/**
	 * The number of structural features of the '<em>Flow Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_FEATURE_COUNT = FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___ALL_OWNED_ELEMENTS = FINAL_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___MUST_BE_OWNED = FINAL_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___ALL_NAMESPACES = FINAL_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___ALL_OWNING_PACKAGES = FINAL_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = FINAL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___QUALIFIED_NAME = FINAL_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___SEPARATOR = FINAL_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___CLIENT_DEPENDENCY = FINAL_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = FINAL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = FINAL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = FINAL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Flow Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FINAL_NODE_OPERATION_COUNT = FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.ForkNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 20;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OWNED_ELEMENT = CONTROL_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OWNER = CONTROL_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__NAME_EXPRESSION = CONTROL_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__NAMESPACE = CONTROL_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__QUALIFIED_NAME = CONTROL_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__VISIBILITY = CONTROL_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__CLIENT_DEPENDENCY = CONTROL_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IS_LEAF = CONTROL_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__REDEFINED_ELEMENT = CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__REDEFINITION_CONTEXT = CONTROL_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IN_INTERRUPTIBLE_REGION = CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IN_PARTITION = CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IN_STRUCTURED_NODE = CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__REDEFINED_NODE = CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__IN_GROUP = CONTROL_NODE__IN_GROUP;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___ALL_OWNED_ELEMENTS = CONTROL_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___MUST_BE_OWNED = CONTROL_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___ALL_NAMESPACES = CONTROL_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___ALL_OWNING_PACKAGES = CONTROL_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTROL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___QUALIFIED_NAME = CONTROL_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___SEPARATOR = CONTROL_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___CLIENT_DEPENDENCY = CONTROL_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CONTROL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CONTROL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = CONTROL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.InitialNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 21;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OWNED_ELEMENT = CONTROL_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OWNER = CONTROL_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NAME_EXPRESSION = CONTROL_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NAMESPACE = CONTROL_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__QUALIFIED_NAME = CONTROL_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__VISIBILITY = CONTROL_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__CLIENT_DEPENDENCY = CONTROL_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__IS_LEAF = CONTROL_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__REDEFINED_ELEMENT = CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__REDEFINITION_CONTEXT = CONTROL_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__IN_INTERRUPTIBLE_REGION = CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__IN_PARTITION = CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__IN_STRUCTURED_NODE = CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__REDEFINED_NODE = CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__IN_GROUP = CONTROL_NODE__IN_GROUP;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___ALL_OWNED_ELEMENTS = CONTROL_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___MUST_BE_OWNED = CONTROL_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___ALL_NAMESPACES = CONTROL_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___ALL_OWNING_PACKAGES = CONTROL_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTROL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___QUALIFIED_NAME = CONTROL_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___SEPARATOR = CONTROL_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___CLIENT_DEPENDENCY = CONTROL_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CONTROL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CONTROL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = CONTROL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.JoinNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 22;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OWNED_ELEMENT = CONTROL_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OWNER = CONTROL_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__NAME_EXPRESSION = CONTROL_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__NAMESPACE = CONTROL_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__QUALIFIED_NAME = CONTROL_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__VISIBILITY = CONTROL_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__CLIENT_DEPENDENCY = CONTROL_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IS_LEAF = CONTROL_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__REDEFINED_ELEMENT = CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__REDEFINITION_CONTEXT = CONTROL_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IN_INTERRUPTIBLE_REGION = CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IN_PARTITION = CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IN_STRUCTURED_NODE = CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__REDEFINED_NODE = CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IN_GROUP = CONTROL_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__IS_COMBINE_DUPLICATE = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__JOIN_SPEC = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___ALL_OWNED_ELEMENTS = CONTROL_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___MUST_BE_OWNED = CONTROL_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___ALL_NAMESPACES = CONTROL_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___ALL_OWNING_PACKAGES = CONTROL_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTROL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___QUALIFIED_NAME = CONTROL_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___SEPARATOR = CONTROL_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___CLIENT_DEPENDENCY = CONTROL_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CONTROL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CONTROL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = CONTROL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.impl.MergeNodeImpl
	 * @see uml.activities.impl.ActivitiesPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 23;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OWNED_COMMENT = CONTROL_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OWNED_ELEMENT = CONTROL_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OWNER = CONTROL_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__NAME_EXPRESSION = CONTROL_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__NAMESPACE = CONTROL_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__QUALIFIED_NAME = CONTROL_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__VISIBILITY = CONTROL_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__CLIENT_DEPENDENCY = CONTROL_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IS_LEAF = CONTROL_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__REDEFINED_ELEMENT = CONTROL_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__REDEFINITION_CONTEXT = CONTROL_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IN_INTERRUPTIBLE_REGION = CONTROL_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IN_PARTITION = CONTROL_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IN_STRUCTURED_NODE = CONTROL_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__REDEFINED_NODE = CONTROL_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__IN_GROUP = CONTROL_NODE__IN_GROUP;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___ALL_OWNED_ELEMENTS = CONTROL_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___MUST_BE_OWNED = CONTROL_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___ALL_NAMESPACES = CONTROL_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___ALL_OWNING_PACKAGES = CONTROL_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTROL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___QUALIFIED_NAME = CONTROL_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___SEPARATOR = CONTROL_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___CLIENT_DEPENDENCY = CONTROL_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CONTROL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CONTROL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = CONTROL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.activities.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.activities.ObjectNodeOrderingKind
	 * @see uml.activities.impl.ActivitiesPackageImpl#getObjectNodeOrderingKind()
	 * @generated
	 */
	int OBJECT_NODE_ORDERING_KIND = 24;


	/**
	 * Returns the meta object for class '{@link uml.activities.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see uml.activities.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.activities.Activity#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see uml.activities.Activity#getEdge()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Edge();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.activities.Activity#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see uml.activities.Activity#getNode()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.activities.Activity#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see uml.activities.Activity#getVariable()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Variable();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.Activity#getStructuredNode <em>Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structured Node</em>'.
	 * @see uml.activities.Activity#getStructuredNode()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_StructuredNode();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.activities.Activity#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see uml.activities.Activity#getGroup()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Group();

	/**
	 * Returns the meta object for the attribute '{@link uml.activities.Activity#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see uml.activities.Activity#isIsReadOnly()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link uml.activities.Activity#isIsSingleExecution <em>Is Single Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Single Execution</em>'.
	 * @see uml.activities.Activity#isIsSingleExecution()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsSingleExecution();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.Activity#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partition</em>'.
	 * @see uml.activities.Activity#getPartition()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Partition();

	/**
	 * Returns the meta object for class '{@link uml.activities.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see uml.activities.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the containment reference '{@link uml.activities.ActivityEdge#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see uml.activities.ActivityEdge#getGuard()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Guard();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityEdge#getInGroup <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Group</em>'.
	 * @see uml.activities.ActivityEdge#getInGroup()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_InGroup();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ActivityEdge#getInterrupts <em>Interrupts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interrupts</em>'.
	 * @see uml.activities.ActivityEdge#getInterrupts()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Interrupts();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityEdge#getInPartition <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Partition</em>'.
	 * @see uml.activities.ActivityEdge#getInPartition()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_InPartition();

	/**
	 * Returns the meta object for the container reference '{@link uml.activities.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Structured Node</em>'.
	 * @see uml.activities.ActivityEdge#getInStructuredNode()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_InStructuredNode();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uml.activities.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see uml.activities.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityEdge#getRedefinedEdge <em>Redefined Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Edge</em>'.
	 * @see uml.activities.ActivityEdge#getRedefinedEdge()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_RedefinedEdge();

	/**
	 * Returns the meta object for the containment reference '{@link uml.activities.ActivityEdge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weight</em>'.
	 * @see uml.activities.ActivityEdge#getWeight()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Weight();

	/**
	 * Returns the meta object for the container reference '{@link uml.activities.ActivityEdge#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see uml.activities.ActivityEdge#getActivity()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Activity();

	/**
	 * Returns the meta object for class '{@link uml.activities.ActivityGroup <em>Activity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Group</em>'.
	 * @see uml.activities.ActivityGroup
	 * @generated
	 */
	EClass getActivityGroup();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityGroup#getContainedNode <em>Contained Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Node</em>'.
	 * @see uml.activities.ActivityGroup#getContainedNode()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_ContainedNode();

	/**
	 * Returns the meta object for the container reference '{@link uml.activities.ActivityGroup#getInActivity <em>In Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Activity</em>'.
	 * @see uml.activities.ActivityGroup#getInActivity()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_InActivity();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityGroup#getSubgroup <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subgroup</em>'.
	 * @see uml.activities.ActivityGroup#getSubgroup()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_Subgroup();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ActivityGroup#getSuperGroup <em>Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Group</em>'.
	 * @see uml.activities.ActivityGroup#getSuperGroup()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_SuperGroup();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityGroup#getContainedEdge <em>Contained Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Edge</em>'.
	 * @see uml.activities.ActivityGroup#getContainedEdge()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_ContainedEdge();

	/**
	 * Returns the meta object for the '{@link uml.activities.ActivityGroup#containingActivity() <em>Containing Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Containing Activity</em>' operation.
	 * @see uml.activities.ActivityGroup#containingActivity()
	 * @generated
	 */
	EOperation getActivityGroup__ContainingActivity();

	/**
	 * Returns the meta object for class '{@link uml.activities.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see uml.activities.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the container reference '{@link uml.activities.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see uml.activities.ActivityNode#getActivity()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Activity();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Interruptible Region</em>'.
	 * @see uml.activities.ActivityNode#getInInterruptibleRegion()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_InInterruptibleRegion();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityNode#getInPartition <em>In Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Partition</em>'.
	 * @see uml.activities.ActivityNode#getInPartition()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_InPartition();

	/**
	 * Returns the meta object for the container reference '{@link uml.activities.ActivityNode#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>In Structured Node</em>'.
	 * @see uml.activities.ActivityNode#getInStructuredNode()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_InStructuredNode();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see uml.activities.ActivityNode#getIncoming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see uml.activities.ActivityNode#getOutgoing()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityNode#getRedefinedNode <em>Redefined Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Node</em>'.
	 * @see uml.activities.ActivityNode#getRedefinedNode()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_RedefinedNode();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityNode#getInGroup <em>In Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Group</em>'.
	 * @see uml.activities.ActivityNode#getInGroup()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_InGroup();

	/**
	 * Returns the meta object for the '{@link uml.activities.ActivityNode#ActivityNode_containingActivity() <em>Activity Node containing Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activity Node containing Activity</em>' operation.
	 * @see uml.activities.ActivityNode#ActivityNode_containingActivity()
	 * @generated
	 */
	EOperation getActivityNode__ActivityNode_containingActivity();

	/**
	 * Returns the meta object for class '{@link uml.activities.InterruptibleActivityRegion <em>Interruptible Activity Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interruptible Activity Region</em>'.
	 * @see uml.activities.InterruptibleActivityRegion
	 * @generated
	 */
	EClass getInterruptibleActivityRegion();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interrupting Edge</em>'.
	 * @see uml.activities.InterruptibleActivityRegion#getInterruptingEdge()
	 * @see #getInterruptibleActivityRegion()
	 * @generated
	 */
	EReference getInterruptibleActivityRegion_InterruptingEdge();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.InterruptibleActivityRegion#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see uml.activities.InterruptibleActivityRegion#getNode()
	 * @see #getInterruptibleActivityRegion()
	 * @generated
	 */
	EReference getInterruptibleActivityRegion_Node();

	/**
	 * Returns the meta object for class '{@link uml.activities.ActivityPartition <em>Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Partition</em>'.
	 * @see uml.activities.ActivityPartition
	 * @generated
	 */
	EClass getActivityPartition();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityPartition#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edge</em>'.
	 * @see uml.activities.ActivityPartition#getEdge()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Edge();

	/**
	 * Returns the meta object for the attribute '{@link uml.activities.ActivityPartition#isIsDimension <em>Is Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dimension</em>'.
	 * @see uml.activities.ActivityPartition#isIsDimension()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EAttribute getActivityPartition_IsDimension();

	/**
	 * Returns the meta object for the attribute '{@link uml.activities.ActivityPartition#isIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see uml.activities.ActivityPartition#isIsExternal()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EAttribute getActivityPartition_IsExternal();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ActivityPartition#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see uml.activities.ActivityPartition#getRepresents()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Represents();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.activities.ActivityPartition#getSubpartition <em>Subpartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpartition</em>'.
	 * @see uml.activities.ActivityPartition#getSubpartition()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Subpartition();

	/**
	 * Returns the meta object for the container reference '{@link uml.activities.ActivityPartition#getSuperPartition <em>Super Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Partition</em>'.
	 * @see uml.activities.ActivityPartition#getSuperPartition()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_SuperPartition();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ActivityPartition#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see uml.activities.ActivityPartition#getNode()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Node();

	/**
	 * Returns the meta object for class '{@link uml.activities.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see uml.activities.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.activities.ExecutableNode#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see uml.activities.ExecutableNode#getHandler()
	 * @see #getExecutableNode()
	 * @generated
	 */
	EReference getExecutableNode_Handler();

	/**
	 * Returns the meta object for class '{@link uml.activities.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Handler</em>'.
	 * @see uml.activities.ExceptionHandler
	 * @generated
	 */
	EClass getExceptionHandler();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ExceptionHandler#getExceptionInput <em>Exception Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception Input</em>'.
	 * @see uml.activities.ExceptionHandler#getExceptionInput()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_ExceptionInput();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ExceptionHandler#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exception Type</em>'.
	 * @see uml.activities.ExceptionHandler#getExceptionType()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_ExceptionType();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ExceptionHandler#getHandlerBody <em>Handler Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler Body</em>'.
	 * @see uml.activities.ExceptionHandler#getHandlerBody()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_HandlerBody();

	/**
	 * Returns the meta object for the container reference '{@link uml.activities.ExceptionHandler#getProtectedNode <em>Protected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Protected Node</em>'.
	 * @see uml.activities.ExceptionHandler#getProtectedNode()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_ProtectedNode();

	/**
	 * Returns the meta object for class '{@link uml.activities.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Node</em>'.
	 * @see uml.activities.ObjectNode
	 * @generated
	 */
	EClass getObjectNode();

	/**
	 * Returns the meta object for the reference list '{@link uml.activities.ObjectNode#getInState <em>In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In State</em>'.
	 * @see uml.activities.ObjectNode#getInState()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_InState();

	/**
	 * Returns the meta object for the attribute '{@link uml.activities.ObjectNode#isIsControlType <em>Is Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Control Type</em>'.
	 * @see uml.activities.ObjectNode#isIsControlType()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_IsControlType();

	/**
	 * Returns the meta object for the attribute '{@link uml.activities.ObjectNode#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see uml.activities.ObjectNode#getOrdering()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_Ordering();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ObjectNode#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uml.activities.ObjectNode#getSelection()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_Selection();

	/**
	 * Returns the meta object for the containment reference '{@link uml.activities.ObjectNode#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see uml.activities.ObjectNode#getUpperBound()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_UpperBound();

	/**
	 * Returns the meta object for class '{@link uml.activities.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see uml.activities.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the container reference '{@link uml.activities.Variable#getActivityScope <em>Activity Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity Scope</em>'.
	 * @see uml.activities.Variable#getActivityScope()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_ActivityScope();

	/**
	 * Returns the meta object for the container reference '{@link uml.activities.Variable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scope</em>'.
	 * @see uml.activities.Variable#getScope()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Scope();

	/**
	 * Returns the meta object for the '{@link uml.activities.Variable#isAccessibleBy(uml.actions.Action) <em>Is Accessible By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Accessible By</em>' operation.
	 * @see uml.activities.Variable#isAccessibleBy(uml.actions.Action)
	 * @generated
	 */
	EOperation getVariable__IsAccessibleBy__Action();

	/**
	 * Returns the meta object for class '{@link uml.activities.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node</em>'.
	 * @see uml.activities.ActivityFinalNode
	 * @generated
	 */
	EClass getActivityFinalNode();

	/**
	 * Returns the meta object for class '{@link uml.activities.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see uml.activities.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link uml.activities.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see uml.activities.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link uml.activities.ActivityParameterNode <em>Activity Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Parameter Node</em>'.
	 * @see uml.activities.ActivityParameterNode
	 * @generated
	 */
	EClass getActivityParameterNode();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ActivityParameterNode#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see uml.activities.ActivityParameterNode#getParameter()
	 * @see #getActivityParameterNode()
	 * @generated
	 */
	EReference getActivityParameterNode_Parameter();

	/**
	 * Returns the meta object for class '{@link uml.activities.CentralBufferNode <em>Central Buffer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Central Buffer Node</em>'.
	 * @see uml.activities.CentralBufferNode
	 * @generated
	 */
	EClass getCentralBufferNode();

	/**
	 * Returns the meta object for class '{@link uml.activities.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see uml.activities.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for class '{@link uml.activities.DataStoreNode <em>Data Store Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store Node</em>'.
	 * @see uml.activities.DataStoreNode
	 * @generated
	 */
	EClass getDataStoreNode();

	/**
	 * Returns the meta object for class '{@link uml.activities.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see uml.activities.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.DecisionNode#getDecisionInput <em>Decision Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision Input</em>'.
	 * @see uml.activities.DecisionNode#getDecisionInput()
	 * @see #getDecisionNode()
	 * @generated
	 */
	EReference getDecisionNode_DecisionInput();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.DecisionNode#getDecisionInputFlow <em>Decision Input Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decision Input Flow</em>'.
	 * @see uml.activities.DecisionNode#getDecisionInputFlow()
	 * @see #getDecisionNode()
	 * @generated
	 */
	EReference getDecisionNode_DecisionInputFlow();

	/**
	 * Returns the meta object for class '{@link uml.activities.ObjectFlow <em>Object Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Flow</em>'.
	 * @see uml.activities.ObjectFlow
	 * @generated
	 */
	EClass getObjectFlow();

	/**
	 * Returns the meta object for the attribute '{@link uml.activities.ObjectFlow#isIsMulticast <em>Is Multicast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multicast</em>'.
	 * @see uml.activities.ObjectFlow#isIsMulticast()
	 * @see #getObjectFlow()
	 * @generated
	 */
	EAttribute getObjectFlow_IsMulticast();

	/**
	 * Returns the meta object for the attribute '{@link uml.activities.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multireceive</em>'.
	 * @see uml.activities.ObjectFlow#isIsMultireceive()
	 * @see #getObjectFlow()
	 * @generated
	 */
	EAttribute getObjectFlow_IsMultireceive();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ObjectFlow#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see uml.activities.ObjectFlow#getSelection()
	 * @see #getObjectFlow()
	 * @generated
	 */
	EReference getObjectFlow_Selection();

	/**
	 * Returns the meta object for the reference '{@link uml.activities.ObjectFlow#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see uml.activities.ObjectFlow#getTransformation()
	 * @see #getObjectFlow()
	 * @generated
	 */
	EReference getObjectFlow_Transformation();

	/**
	 * Returns the meta object for class '{@link uml.activities.FlowFinalNode <em>Flow Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Final Node</em>'.
	 * @see uml.activities.FlowFinalNode
	 * @generated
	 */
	EClass getFlowFinalNode();

	/**
	 * Returns the meta object for class '{@link uml.activities.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see uml.activities.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for class '{@link uml.activities.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see uml.activities.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link uml.activities.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see uml.activities.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for the attribute '{@link uml.activities.JoinNode#isIsCombineDuplicate <em>Is Combine Duplicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Combine Duplicate</em>'.
	 * @see uml.activities.JoinNode#isIsCombineDuplicate()
	 * @see #getJoinNode()
	 * @generated
	 */
	EAttribute getJoinNode_IsCombineDuplicate();

	/**
	 * Returns the meta object for the containment reference '{@link uml.activities.JoinNode#getJoinSpec <em>Join Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Spec</em>'.
	 * @see uml.activities.JoinNode#getJoinSpec()
	 * @see #getJoinNode()
	 * @generated
	 */
	EReference getJoinNode_JoinSpec();

	/**
	 * Returns the meta object for class '{@link uml.activities.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see uml.activities.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for enum '{@link uml.activities.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Node Ordering Kind</em>'.
	 * @see uml.activities.ObjectNodeOrderingKind
	 * @generated
	 */
	EEnum getObjectNodeOrderingKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivitiesFactory getActivitiesFactory();

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
		 * The meta object literal for the '{@link uml.activities.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ActivityImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EDGE = eINSTANCE.getActivity_Edge();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NODE = eINSTANCE.getActivity_Node();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__VARIABLE = eINSTANCE.getActivity_Variable();

		/**
		 * The meta object literal for the '<em><b>Structured Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__STRUCTURED_NODE = eINSTANCE.getActivity_StructuredNode();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__GROUP = eINSTANCE.getActivity_Group();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IS_READ_ONLY = eINSTANCE.getActivity_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Single Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IS_SINGLE_EXECUTION = eINSTANCE.getActivity_IsSingleExecution();

		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PARTITION = eINSTANCE.getActivity_Partition();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ActivityEdgeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__GUARD = eINSTANCE.getActivityEdge_Guard();

		/**
		 * The meta object literal for the '<em><b>In Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__IN_GROUP = eINSTANCE.getActivityEdge_InGroup();

		/**
		 * The meta object literal for the '<em><b>Interrupts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__INTERRUPTS = eINSTANCE.getActivityEdge_Interrupts();

		/**
		 * The meta object literal for the '<em><b>In Partition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__IN_PARTITION = eINSTANCE.getActivityEdge_InPartition();

		/**
		 * The meta object literal for the '<em><b>In Structured Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__IN_STRUCTURED_NODE = eINSTANCE.getActivityEdge_InStructuredNode();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Redefined Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__REDEFINED_EDGE = eINSTANCE.getActivityEdge_RedefinedEdge();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__WEIGHT = eINSTANCE.getActivityEdge_Weight();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__ACTIVITY = eINSTANCE.getActivityEdge_Activity();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ActivityGroupImpl <em>Activity Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ActivityGroupImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityGroup()
		 * @generated
		 */
		EClass ACTIVITY_GROUP = eINSTANCE.getActivityGroup();

		/**
		 * The meta object literal for the '<em><b>Contained Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__CONTAINED_NODE = eINSTANCE.getActivityGroup_ContainedNode();

		/**
		 * The meta object literal for the '<em><b>In Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__IN_ACTIVITY = eINSTANCE.getActivityGroup_InActivity();

		/**
		 * The meta object literal for the '<em><b>Subgroup</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__SUBGROUP = eINSTANCE.getActivityGroup_Subgroup();

		/**
		 * The meta object literal for the '<em><b>Super Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__SUPER_GROUP = eINSTANCE.getActivityGroup_SuperGroup();

		/**
		 * The meta object literal for the '<em><b>Contained Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__CONTAINED_EDGE = eINSTANCE.getActivityGroup_ContainedEdge();

		/**
		 * The meta object literal for the '<em><b>Containing Activity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_GROUP___CONTAINING_ACTIVITY = eINSTANCE.getActivityGroup__ContainingActivity();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ActivityNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__ACTIVITY = eINSTANCE.getActivityNode_Activity();

		/**
		 * The meta object literal for the '<em><b>In Interruptible Region</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION = eINSTANCE.getActivityNode_InInterruptibleRegion();

		/**
		 * The meta object literal for the '<em><b>In Partition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__IN_PARTITION = eINSTANCE.getActivityNode_InPartition();

		/**
		 * The meta object literal for the '<em><b>In Structured Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__IN_STRUCTURED_NODE = eINSTANCE.getActivityNode_InStructuredNode();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Redefined Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__REDEFINED_NODE = eINSTANCE.getActivityNode_RedefinedNode();

		/**
		 * The meta object literal for the '<em><b>In Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__IN_GROUP = eINSTANCE.getActivityNode_InGroup();

		/**
		 * The meta object literal for the '<em><b>Activity Node containing Activity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = eINSTANCE.getActivityNode__ActivityNode_containingActivity();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.InterruptibleActivityRegionImpl <em>Interruptible Activity Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.InterruptibleActivityRegionImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getInterruptibleActivityRegion()
		 * @generated
		 */
		EClass INTERRUPTIBLE_ACTIVITY_REGION = eINSTANCE.getInterruptibleActivityRegion();

		/**
		 * The meta object literal for the '<em><b>Interrupting Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE = eINSTANCE.getInterruptibleActivityRegion_InterruptingEdge();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERRUPTIBLE_ACTIVITY_REGION__NODE = eINSTANCE.getInterruptibleActivityRegion_Node();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ActivityPartitionImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityPartition()
		 * @generated
		 */
		EClass ACTIVITY_PARTITION = eINSTANCE.getActivityPartition();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__EDGE = eINSTANCE.getActivityPartition_Edge();

		/**
		 * The meta object literal for the '<em><b>Is Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PARTITION__IS_DIMENSION = eINSTANCE.getActivityPartition_IsDimension();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PARTITION__IS_EXTERNAL = eINSTANCE.getActivityPartition_IsExternal();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__REPRESENTS = eINSTANCE.getActivityPartition_Represents();

		/**
		 * The meta object literal for the '<em><b>Subpartition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__SUBPARTITION = eINSTANCE.getActivityPartition_Subpartition();

		/**
		 * The meta object literal for the '<em><b>Super Partition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__SUPER_PARTITION = eINSTANCE.getActivityPartition_SuperPartition();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__NODE = eINSTANCE.getActivityPartition_Node();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ExecutableNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_NODE__HANDLER = eINSTANCE.getExecutableNode_Handler();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ExceptionHandlerImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getExceptionHandler()
		 * @generated
		 */
		EClass EXCEPTION_HANDLER = eINSTANCE.getExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Exception Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__EXCEPTION_INPUT = eINSTANCE.getExceptionHandler_ExceptionInput();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__EXCEPTION_TYPE = eINSTANCE.getExceptionHandler_ExceptionType();

		/**
		 * The meta object literal for the '<em><b>Handler Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__HANDLER_BODY = eINSTANCE.getExceptionHandler_HandlerBody();

		/**
		 * The meta object literal for the '<em><b>Protected Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__PROTECTED_NODE = eINSTANCE.getExceptionHandler_ProtectedNode();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ObjectNodeImpl <em>Object Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ObjectNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getObjectNode()
		 * @generated
		 */
		EClass OBJECT_NODE = eINSTANCE.getObjectNode();

		/**
		 * The meta object literal for the '<em><b>In State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__IN_STATE = eINSTANCE.getObjectNode_InState();

		/**
		 * The meta object literal for the '<em><b>Is Control Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__IS_CONTROL_TYPE = eINSTANCE.getObjectNode_IsControlType();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__ORDERING = eINSTANCE.getObjectNode_Ordering();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__SELECTION = eINSTANCE.getObjectNode_Selection();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__UPPER_BOUND = eINSTANCE.getObjectNode_UpperBound();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.VariableImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Activity Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ACTIVITY_SCOPE = eINSTANCE.getVariable_ActivityScope();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__SCOPE = eINSTANCE.getVariable_Scope();

		/**
		 * The meta object literal for the '<em><b>Is Accessible By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE___IS_ACCESSIBLE_BY__ACTION = eINSTANCE.getVariable__IsAccessibleBy__Action();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ActivityFinalNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityFinalNode()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE = eINSTANCE.getActivityFinalNode();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.FinalNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ControlNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ActivityParameterNodeImpl <em>Activity Parameter Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ActivityParameterNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getActivityParameterNode()
		 * @generated
		 */
		EClass ACTIVITY_PARAMETER_NODE = eINSTANCE.getActivityParameterNode();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARAMETER_NODE__PARAMETER = eINSTANCE.getActivityParameterNode_Parameter();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.CentralBufferNodeImpl <em>Central Buffer Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.CentralBufferNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getCentralBufferNode()
		 * @generated
		 */
		EClass CENTRAL_BUFFER_NODE = eINSTANCE.getCentralBufferNode();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ControlFlowImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.DataStoreNodeImpl <em>Data Store Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.DataStoreNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getDataStoreNode()
		 * @generated
		 */
		EClass DATA_STORE_NODE = eINSTANCE.getDataStoreNode();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.DecisionNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '<em><b>Decision Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_NODE__DECISION_INPUT = eINSTANCE.getDecisionNode_DecisionInput();

		/**
		 * The meta object literal for the '<em><b>Decision Input Flow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_NODE__DECISION_INPUT_FLOW = eINSTANCE.getDecisionNode_DecisionInputFlow();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ObjectFlowImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getObjectFlow()
		 * @generated
		 */
		EClass OBJECT_FLOW = eINSTANCE.getObjectFlow();

		/**
		 * The meta object literal for the '<em><b>Is Multicast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_FLOW__IS_MULTICAST = eINSTANCE.getObjectFlow_IsMulticast();

		/**
		 * The meta object literal for the '<em><b>Is Multireceive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_FLOW__IS_MULTIRECEIVE = eINSTANCE.getObjectFlow_IsMultireceive();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_FLOW__SELECTION = eINSTANCE.getObjectFlow_Selection();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_FLOW__TRANSFORMATION = eINSTANCE.getObjectFlow_Transformation();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.FlowFinalNodeImpl <em>Flow Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.FlowFinalNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getFlowFinalNode()
		 * @generated
		 */
		EClass FLOW_FINAL_NODE = eINSTANCE.getFlowFinalNode();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.ForkNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.InitialNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.JoinNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '<em><b>Is Combine Duplicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_NODE__IS_COMBINE_DUPLICATE = eINSTANCE.getJoinNode_IsCombineDuplicate();

		/**
		 * The meta object literal for the '<em><b>Join Spec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_NODE__JOIN_SPEC = eINSTANCE.getJoinNode_JoinSpec();

		/**
		 * The meta object literal for the '{@link uml.activities.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.impl.MergeNodeImpl
		 * @see uml.activities.impl.ActivitiesPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '{@link uml.activities.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.activities.ObjectNodeOrderingKind
		 * @see uml.activities.impl.ActivitiesPackageImpl#getObjectNodeOrderingKind()
		 * @generated
		 */
		EEnum OBJECT_NODE_ORDERING_KIND = eINSTANCE.getObjectNodeOrderingKind();

	}

} //ActivitiesPackage
