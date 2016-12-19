/**
 */
package uml.packages;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uml.classification.ClassificationPackage;

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
 * @see uml.packages.PackagesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Packages'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface PackagesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "packages";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/packages.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.packages";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PackagesPackage eINSTANCE = uml.packages.impl.PackagesPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.packages.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.packages.impl.ExtensionImpl
	 * @see uml.packages.impl.PackagesPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNED_COMMENT = StructuredClassifiersPackage.ASSOCIATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNED_ELEMENT = StructuredClassifiersPackage.ASSOCIATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNER = StructuredClassifiersPackage.ASSOCIATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = StructuredClassifiersPackage.ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME_EXPRESSION = StructuredClassifiersPackage.ASSOCIATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAMESPACE = StructuredClassifiersPackage.ASSOCIATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__QUALIFIED_NAME = StructuredClassifiersPackage.ASSOCIATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__VISIBILITY = StructuredClassifiersPackage.ASSOCIATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__CLIENT_DEPENDENCY = StructuredClassifiersPackage.ASSOCIATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ELEMENT_IMPORT = StructuredClassifiersPackage.ASSOCIATION__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IMPORTED_MEMBER = StructuredClassifiersPackage.ASSOCIATION__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MEMBER = StructuredClassifiersPackage.ASSOCIATION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNED_MEMBER = StructuredClassifiersPackage.ASSOCIATION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNED_RULE = StructuredClassifiersPackage.ASSOCIATION__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__PACKAGE_IMPORT = StructuredClassifiersPackage.ASSOCIATION__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IS_LEAF = StructuredClassifiersPackage.ASSOCIATION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__REDEFINED_ELEMENT = StructuredClassifiersPackage.ASSOCIATION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__REDEFINITION_CONTEXT = StructuredClassifiersPackage.ASSOCIATION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNING_TEMPLATE_PARAMETER = StructuredClassifiersPackage.ASSOCIATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TEMPLATE_PARAMETER = StructuredClassifiersPackage.ASSOCIATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__PACKAGE = StructuredClassifiersPackage.ASSOCIATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TEMPLATE_BINDING = StructuredClassifiersPackage.ASSOCIATION__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNED_TEMPLATE_SIGNATURE = StructuredClassifiersPackage.ASSOCIATION__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__SUBSTITUTION = StructuredClassifiersPackage.ASSOCIATION__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__FEATURE = StructuredClassifiersPackage.ASSOCIATION__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__POWERTYPE_EXTENT = StructuredClassifiersPackage.ASSOCIATION__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__GENERALIZATION = StructuredClassifiersPackage.ASSOCIATION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ATTRIBUTE = StructuredClassifiersPackage.ASSOCIATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__COLLABORATION_USE = StructuredClassifiersPackage.ASSOCIATION__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__GENERAL = StructuredClassifiersPackage.ASSOCIATION__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__INHERITED_MEMBER = StructuredClassifiersPackage.ASSOCIATION__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IS_ABSTRACT = StructuredClassifiersPackage.ASSOCIATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IS_FINAL_SPECIALIZATION = StructuredClassifiersPackage.ASSOCIATION__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNED_USE_CASE = StructuredClassifiersPackage.ASSOCIATION__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__USE_CASE = StructuredClassifiersPackage.ASSOCIATION__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__REDEFINED_CLASSIFIER = StructuredClassifiersPackage.ASSOCIATION__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__REPRESENTATION = StructuredClassifiersPackage.ASSOCIATION__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__RELATED_ELEMENT = StructuredClassifiersPackage.ASSOCIATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MEMBER_END = StructuredClassifiersPackage.ASSOCIATION__MEMBER_END;

	/**
	 * The feature id for the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__OWNED_END = StructuredClassifiersPackage.ASSOCIATION__OWNED_END;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__END_TYPE = StructuredClassifiersPackage.ASSOCIATION__END_TYPE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IS_DERIVED = StructuredClassifiersPackage.ASSOCIATION__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Navigable Owned End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAVIGABLE_OWNED_END = StructuredClassifiersPackage.ASSOCIATION__NAVIGABLE_OWNED_END;

	/**
	 * The feature id for the '<em><b>Metaclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__METACLASS = StructuredClassifiersPackage.ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IS_REQUIRED = StructuredClassifiersPackage.ASSOCIATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = StructuredClassifiersPackage.ASSOCIATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___ALL_OWNED_ELEMENTS = StructuredClassifiersPackage.ASSOCIATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MUST_BE_OWNED = StructuredClassifiersPackage.ASSOCIATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___ALL_NAMESPACES = StructuredClassifiersPackage.ASSOCIATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___ALL_OWNING_PACKAGES = StructuredClassifiersPackage.ASSOCIATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = StructuredClassifiersPackage.ASSOCIATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___QUALIFIED_NAME = StructuredClassifiersPackage.ASSOCIATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___SEPARATOR = StructuredClassifiersPackage.ASSOCIATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___CLIENT_DEPENDENCY = StructuredClassifiersPackage.ASSOCIATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___EXCLUDE_COLLISIONS__ELIST = StructuredClassifiersPackage.ASSOCIATION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___GET_NAMES_OF_MEMBER__NAMEDELEMENT = StructuredClassifiersPackage.ASSOCIATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IMPORT_MEMBERS__ELIST = StructuredClassifiersPackage.ASSOCIATION___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IMPORTED_MEMBER = StructuredClassifiersPackage.ASSOCIATION___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MEMBERS_ARE_DISTINGUISHABLE = StructuredClassifiersPackage.ASSOCIATION___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = StructuredClassifiersPackage.ASSOCIATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = StructuredClassifiersPackage.ASSOCIATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = StructuredClassifiersPackage.ASSOCIATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IS_TEMPLATE_PARAMETER = StructuredClassifiersPackage.ASSOCIATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___CONFORMS_TO__TYPE = StructuredClassifiersPackage.ASSOCIATION___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IS_TEMPLATE = StructuredClassifiersPackage.ASSOCIATION___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___PARAMETERABLE_ELEMENTS = StructuredClassifiersPackage.ASSOCIATION___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___ALL_FEATURES = StructuredClassifiersPackage.ASSOCIATION___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___ALL_PARENTS = StructuredClassifiersPackage.ASSOCIATION___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___GENERAL = StructuredClassifiersPackage.ASSOCIATION___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___HAS_VISIBILITY_OF__NAMEDELEMENT = StructuredClassifiersPackage.ASSOCIATION___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___INHERIT__ELIST = StructuredClassifiersPackage.ASSOCIATION___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___INHERITABLE_MEMBERS__CLASSIFIER = StructuredClassifiersPackage.ASSOCIATION___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___INHERITED_MEMBER = StructuredClassifiersPackage.ASSOCIATION___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MAY_SPECIALIZE_TYPE__CLASSIFIER = StructuredClassifiersPackage.ASSOCIATION___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___PARENTS = StructuredClassifiersPackage.ASSOCIATION___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___DIRECTLY_REALIZED_INTERFACES = StructuredClassifiersPackage.ASSOCIATION___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___DIRECTLY_USED_INTERFACES = StructuredClassifiersPackage.ASSOCIATION___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___ALL_REALIZED_INTERFACES = StructuredClassifiersPackage.ASSOCIATION___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___ALL_USED_INTERFACES = StructuredClassifiersPackage.ASSOCIATION___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IS_SUBSTITUTABLE_FOR__CLASSIFIER = StructuredClassifiersPackage.ASSOCIATION___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___ALL_ATTRIBUTES = StructuredClassifiersPackage.ASSOCIATION___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___ALL_SLOTTABLE_FEATURES = StructuredClassifiersPackage.ASSOCIATION___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>End Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___END_TYPE = StructuredClassifiersPackage.ASSOCIATION___END_TYPE;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IS_REQUIRED = StructuredClassifiersPackage.ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___METACLASS = StructuredClassifiersPackage.ASSOCIATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Metaclass End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___METACLASS_END = StructuredClassifiersPackage.ASSOCIATION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = StructuredClassifiersPackage.ASSOCIATION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link uml.packages.impl.ExtensionEndImpl <em>Extension End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.packages.impl.ExtensionEndImpl
	 * @see uml.packages.impl.PackagesPackageImpl#getExtensionEnd()
	 * @generated
	 */
	int EXTENSION_END = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__OWNED_COMMENT = ClassificationPackage.PROPERTY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__OWNED_ELEMENT = ClassificationPackage.PROPERTY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__OWNER = ClassificationPackage.PROPERTY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__NAME = ClassificationPackage.PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__NAME_EXPRESSION = ClassificationPackage.PROPERTY__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__NAMESPACE = ClassificationPackage.PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__QUALIFIED_NAME = ClassificationPackage.PROPERTY__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__VISIBILITY = ClassificationPackage.PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__CLIENT_DEPENDENCY = ClassificationPackage.PROPERTY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__IS_LEAF = ClassificationPackage.PROPERTY__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__REDEFINED_ELEMENT = ClassificationPackage.PROPERTY__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__REDEFINITION_CONTEXT = ClassificationPackage.PROPERTY__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__FEATURING_CLASSIFIER = ClassificationPackage.PROPERTY__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__IS_STATIC = ClassificationPackage.PROPERTY__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__TYPE = ClassificationPackage.PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__IS_ORDERED = ClassificationPackage.PROPERTY__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__IS_UNIQUE = ClassificationPackage.PROPERTY__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__LOWER = ClassificationPackage.PROPERTY__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__LOWER_VALUE = ClassificationPackage.PROPERTY__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__UPPER = ClassificationPackage.PROPERTY__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__UPPER_VALUE = ClassificationPackage.PROPERTY__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__IS_READ_ONLY = ClassificationPackage.PROPERTY__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__OWNING_TEMPLATE_PARAMETER = ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__TEMPLATE_PARAMETER = ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__END = ClassificationPackage.PROPERTY__END;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__DEPLOYMENT = ClassificationPackage.PROPERTY__DEPLOYMENT;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__DEPLOYED_ELEMENT = ClassificationPackage.PROPERTY__DEPLOYED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__INTERFACE = ClassificationPackage.PROPERTY__INTERFACE;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__AGGREGATION = ClassificationPackage.PROPERTY__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__ASSOCIATION = ClassificationPackage.PROPERTY__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__ASSOCIATION_END = ClassificationPackage.PROPERTY__ASSOCIATION_END;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__QUALIFIER = ClassificationPackage.PROPERTY__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__CLASS = ClassificationPackage.PROPERTY__CLASS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__DATATYPE = ClassificationPackage.PROPERTY__DATATYPE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__DEFAULT_VALUE = ClassificationPackage.PROPERTY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__IS_COMPOSITE = ClassificationPackage.PROPERTY__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__IS_DERIVED = ClassificationPackage.PROPERTY__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__IS_DERIVED_UNION = ClassificationPackage.PROPERTY__IS_DERIVED_UNION;

	/**
	 * The feature id for the '<em><b>Is Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__IS_ID = ClassificationPackage.PROPERTY__IS_ID;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__OPPOSITE = ClassificationPackage.PROPERTY__OPPOSITE;

	/**
	 * The feature id for the '<em><b>Owning Association</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__OWNING_ASSOCIATION = ClassificationPackage.PROPERTY__OWNING_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Redefined Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__REDEFINED_PROPERTY = ClassificationPackage.PROPERTY__REDEFINED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Subsetted Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END__SUBSETTED_PROPERTY = ClassificationPackage.PROPERTY__SUBSETTED_PROPERTY;

	/**
	 * The number of structural features of the '<em>Extension End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END_FEATURE_COUNT = ClassificationPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___ALL_OWNED_ELEMENTS = ClassificationPackage.PROPERTY___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___MUST_BE_OWNED = ClassificationPackage.PROPERTY___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___ALL_NAMESPACES = ClassificationPackage.PROPERTY___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___ALL_OWNING_PACKAGES = ClassificationPackage.PROPERTY___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ClassificationPackage.PROPERTY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___QUALIFIED_NAME = ClassificationPackage.PROPERTY___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___SEPARATOR = ClassificationPackage.PROPERTY___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___CLIENT_DEPENDENCY = ClassificationPackage.PROPERTY___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ClassificationPackage.PROPERTY___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ClassificationPackage.PROPERTY___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___COMPATIBLE_WITH__MULTIPLICITYELEMENT = ClassificationPackage.PROPERTY___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = ClassificationPackage.PROPERTY___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS__INT_INT = ClassificationPackage.PROPERTY___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS_MULTIVALUED = ClassificationPackage.PROPERTY___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___LOWER = ClassificationPackage.PROPERTY___LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___LOWER_BOUND = ClassificationPackage.PROPERTY___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___UPPER = ClassificationPackage.PROPERTY___UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___UPPER_BOUND = ClassificationPackage.PROPERTY___UPPER_BOUND;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = ClassificationPackage.PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS_TEMPLATE_PARAMETER = ClassificationPackage.PROPERTY___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___END = ClassificationPackage.PROPERTY___END;

	/**
	 * The operation id for the '<em>Deployed Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___DEPLOYED_ELEMENT = ClassificationPackage.PROPERTY___DEPLOYED_ELEMENT;

	/**
	 * The operation id for the '<em>Is Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS_ATTRIBUTE = ClassificationPackage.PROPERTY___IS_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Is Composite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS_COMPOSITE = ClassificationPackage.PROPERTY___IS_COMPOSITE;

	/**
	 * The operation id for the '<em>Is Navigable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___IS_NAVIGABLE = ClassificationPackage.PROPERTY___IS_NAVIGABLE;

	/**
	 * The operation id for the '<em>Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___OPPOSITE = ClassificationPackage.PROPERTY___OPPOSITE;

	/**
	 * The operation id for the '<em>Subsetting Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END___SUBSETTING_CONTEXT = ClassificationPackage.PROPERTY___SUBSETTING_CONTEXT;

	/**
	 * The number of operations of the '<em>Extension End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_END_OPERATION_COUNT = ClassificationPackage.PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.packages.impl.StereotypeImpl <em>Stereotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.packages.impl.StereotypeImpl
	 * @see uml.packages.impl.PackagesPackageImpl#getStereotype()
	 * @generated
	 */
	int STEREOTYPE = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_COMMENT = StructuredClassifiersPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_ELEMENT = StructuredClassifiersPackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNER = StructuredClassifiersPackage.CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__NAME = StructuredClassifiersPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__NAME_EXPRESSION = StructuredClassifiersPackage.CLASS__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__NAMESPACE = StructuredClassifiersPackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__QUALIFIED_NAME = StructuredClassifiersPackage.CLASS__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__VISIBILITY = StructuredClassifiersPackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__CLIENT_DEPENDENCY = StructuredClassifiersPackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ELEMENT_IMPORT = StructuredClassifiersPackage.CLASS__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__IMPORTED_MEMBER = StructuredClassifiersPackage.CLASS__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__MEMBER = StructuredClassifiersPackage.CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_MEMBER = StructuredClassifiersPackage.CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_RULE = StructuredClassifiersPackage.CLASS__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__PACKAGE_IMPORT = StructuredClassifiersPackage.CLASS__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__IS_LEAF = StructuredClassifiersPackage.CLASS__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__REDEFINED_ELEMENT = StructuredClassifiersPackage.CLASS__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__REDEFINITION_CONTEXT = StructuredClassifiersPackage.CLASS__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNING_TEMPLATE_PARAMETER = StructuredClassifiersPackage.CLASS__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__TEMPLATE_PARAMETER = StructuredClassifiersPackage.CLASS__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__PACKAGE = StructuredClassifiersPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__TEMPLATE_BINDING = StructuredClassifiersPackage.CLASS__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_TEMPLATE_SIGNATURE = StructuredClassifiersPackage.CLASS__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__SUBSTITUTION = StructuredClassifiersPackage.CLASS__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__FEATURE = StructuredClassifiersPackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__POWERTYPE_EXTENT = StructuredClassifiersPackage.CLASS__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__GENERALIZATION = StructuredClassifiersPackage.CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ATTRIBUTE = StructuredClassifiersPackage.CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__COLLABORATION_USE = StructuredClassifiersPackage.CLASS__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__GENERAL = StructuredClassifiersPackage.CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__INHERITED_MEMBER = StructuredClassifiersPackage.CLASS__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__IS_ABSTRACT = StructuredClassifiersPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__IS_FINAL_SPECIALIZATION = StructuredClassifiersPackage.CLASS__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_USE_CASE = StructuredClassifiersPackage.CLASS__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__USE_CASE = StructuredClassifiersPackage.CLASS__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__REDEFINED_CLASSIFIER = StructuredClassifiersPackage.CLASS__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__REPRESENTATION = StructuredClassifiersPackage.CLASS__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_ATTRIBUTE = StructuredClassifiersPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_CONNECTOR = StructuredClassifiersPackage.CLASS__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__PART = StructuredClassifiersPackage.CLASS__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ROLE = StructuredClassifiersPackage.CLASS__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_PORT = StructuredClassifiersPackage.CLASS__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__INTERFACE_REALIZATION = StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__CLASSIFIER_BEHAVIOR = StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_BEHAVIOR = StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_OPERATION = StructuredClassifiersPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__EXTENSION = StructuredClassifiersPackage.CLASS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__IS_ACTIVE = StructuredClassifiersPackage.CLASS__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__NESTED_CLASSIFIER = StructuredClassifiersPackage.CLASS__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__OWNED_RECEPTION = StructuredClassifiersPackage.CLASS__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__SUPER_CLASS = StructuredClassifiersPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__ICON = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__PROFILE = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_FEATURE_COUNT = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_OWNED_ELEMENTS = StructuredClassifiersPackage.CLASS___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___MUST_BE_OWNED = StructuredClassifiersPackage.CLASS___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_NAMESPACES = StructuredClassifiersPackage.CLASS___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_OWNING_PACKAGES = StructuredClassifiersPackage.CLASS___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = StructuredClassifiersPackage.CLASS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___QUALIFIED_NAME = StructuredClassifiersPackage.CLASS___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___SEPARATOR = StructuredClassifiersPackage.CLASS___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___CLIENT_DEPENDENCY = StructuredClassifiersPackage.CLASS___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___EXCLUDE_COLLISIONS__ELIST = StructuredClassifiersPackage.CLASS___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = StructuredClassifiersPackage.CLASS___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___IMPORT_MEMBERS__ELIST = StructuredClassifiersPackage.CLASS___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___IMPORTED_MEMBER = StructuredClassifiersPackage.CLASS___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___MEMBERS_ARE_DISTINGUISHABLE = StructuredClassifiersPackage.CLASS___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = StructuredClassifiersPackage.CLASS___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = StructuredClassifiersPackage.CLASS___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = StructuredClassifiersPackage.CLASS___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___IS_TEMPLATE_PARAMETER = StructuredClassifiersPackage.CLASS___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___CONFORMS_TO__TYPE = StructuredClassifiersPackage.CLASS___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___IS_TEMPLATE = StructuredClassifiersPackage.CLASS___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___PARAMETERABLE_ELEMENTS = StructuredClassifiersPackage.CLASS___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_FEATURES = StructuredClassifiersPackage.CLASS___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_PARENTS = StructuredClassifiersPackage.CLASS___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___GENERAL = StructuredClassifiersPackage.CLASS___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___HAS_VISIBILITY_OF__NAMEDELEMENT = StructuredClassifiersPackage.CLASS___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___INHERIT__ELIST = StructuredClassifiersPackage.CLASS___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___INHERITABLE_MEMBERS__CLASSIFIER = StructuredClassifiersPackage.CLASS___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___INHERITED_MEMBER = StructuredClassifiersPackage.CLASS___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___MAY_SPECIALIZE_TYPE__CLASSIFIER = StructuredClassifiersPackage.CLASS___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___PARENTS = StructuredClassifiersPackage.CLASS___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___DIRECTLY_REALIZED_INTERFACES = StructuredClassifiersPackage.CLASS___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___DIRECTLY_USED_INTERFACES = StructuredClassifiersPackage.CLASS___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_REALIZED_INTERFACES = StructuredClassifiersPackage.CLASS___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_USED_INTERFACES = StructuredClassifiersPackage.CLASS___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___IS_SUBSTITUTABLE_FOR__CLASSIFIER = StructuredClassifiersPackage.CLASS___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_ATTRIBUTES = StructuredClassifiersPackage.CLASS___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_SLOTTABLE_FEATURES = StructuredClassifiersPackage.CLASS___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___PART = StructuredClassifiersPackage.CLASS___PART;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___ALL_ROLES = StructuredClassifiersPackage.CLASS___ALL_ROLES;

	/**
	 * The operation id for the '<em>Owned Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___OWNED_PORT = StructuredClassifiersPackage.CLASS___OWNED_PORT;

	/**
	 * The operation id for the '<em>Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___EXTENSION = StructuredClassifiersPackage.CLASS___EXTENSION;

	/**
	 * The operation id for the '<em>Super Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___SUPER_CLASS = StructuredClassifiersPackage.CLASS___SUPER_CLASS;

	/**
	 * The operation id for the '<em>Containing Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___CONTAINING_PROFILE = StructuredClassifiersPackage.CLASS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE___PROFILE = StructuredClassifiersPackage.CLASS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_OPERATION_COUNT = StructuredClassifiersPackage.CLASS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml.packages.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.packages.impl.ImageImpl
	 * @see uml.packages.impl.PackagesPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__OWNED_COMMENT = CommonStructurePackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__OWNED_ELEMENT = CommonStructurePackage.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__OWNER = CommonStructurePackage.ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONTENT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FORMAT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LOCATION = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___ALL_OWNED_ELEMENTS = CommonStructurePackage.ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___MUST_BE_OWNED = CommonStructurePackage.ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = CommonStructurePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.packages.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.packages.impl.PackageImpl
	 * @see uml.packages.impl.PackagesPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_COMMENT = CommonStructurePackage.NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_ELEMENT = CommonStructurePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = CommonStructurePackage.NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = CommonStructurePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME_EXPRESSION = CommonStructurePackage.NAMESPACE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAMESPACE = CommonStructurePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__QUALIFIED_NAME = CommonStructurePackage.NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VISIBILITY = CommonStructurePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENT_IMPORT = CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MEMBER = CommonStructurePackage.NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_MEMBER = CommonStructurePackage.NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_RULE = CommonStructurePackage.NAMESPACE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_IMPORT = CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TEMPLATE_PARAMETER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TEMPLATE_BINDING = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_TEMPLATE_SIGNATURE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_MERGE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Profile Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PROFILE_APPLICATION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__URI = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NESTED_PACKAGE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NESTING_PACKAGE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_STEREOTYPE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGED_ELEMENT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_TYPE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___MUST_BE_OWNED = CommonStructurePackage.NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_NAMESPACES = CommonStructurePackage.NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMESPACE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMESPACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___QUALIFIED_NAME = CommonStructurePackage.NAMESPACE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___SEPARATOR = CommonStructurePackage.NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___EXCLUDE_COLLISIONS__ELIST = CommonStructurePackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonStructurePackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IMPORT_MEMBERS__ELIST = CommonStructurePackage.NAMESPACE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___MEMBERS_ARE_DISTINGUISHABLE = CommonStructurePackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_TEMPLATE_PARAMETER = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_TEMPLATE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___PARAMETERABLE_ELEMENTS = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>All Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_APPLICABLE_STEREOTYPES = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Containing Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CONTAINING_PROFILE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Makes Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___MAKES_VISIBLE__NAMEDELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Nested Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___NESTED_PACKAGE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Owned Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___OWNED_STEREOTYPE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Owned Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___OWNED_TYPE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Visible Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VISIBLE_MEMBERS = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link uml.packages.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.packages.impl.ProfileImpl
	 * @see uml.packages.impl.PackagesPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__OWNED_COMMENT = PACKAGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__OWNED_ELEMENT = PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__OWNER = PACKAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NAME_EXPRESSION = PACKAGE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NAMESPACE = PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__QUALIFIED_NAME = PACKAGE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__CLIENT_DEPENDENCY = PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ELEMENT_IMPORT = PACKAGE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__IMPORTED_MEMBER = PACKAGE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__MEMBER = PACKAGE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__OWNED_MEMBER = PACKAGE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__OWNED_RULE = PACKAGE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PACKAGE_IMPORT = PACKAGE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__OWNING_TEMPLATE_PARAMETER = PACKAGE__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__TEMPLATE_PARAMETER = PACKAGE__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__TEMPLATE_BINDING = PACKAGE__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__OWNED_TEMPLATE_SIGNATURE = PACKAGE__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PACKAGE_MERGE = PACKAGE__PACKAGE_MERGE;

	/**
	 * The feature id for the '<em><b>Profile Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PROFILE_APPLICATION = PACKAGE__PROFILE_APPLICATION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__URI = PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NESTED_PACKAGE = PACKAGE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NESTING_PACKAGE = PACKAGE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__OWNED_STEREOTYPE = PACKAGE__OWNED_STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__OWNED_TYPE = PACKAGE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Metaclass Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__METACLASS_REFERENCE = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__METAMODEL_REFERENCE = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___ALL_OWNED_ELEMENTS = PACKAGE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___MUST_BE_OWNED = PACKAGE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___ALL_NAMESPACES = PACKAGE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___ALL_OWNING_PACKAGES = PACKAGE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = PACKAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___QUALIFIED_NAME = PACKAGE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___SEPARATOR = PACKAGE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___CLIENT_DEPENDENCY = PACKAGE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___EXCLUDE_COLLISIONS__ELIST = PACKAGE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = PACKAGE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___IMPORT_MEMBERS__ELIST = PACKAGE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___IMPORTED_MEMBER = PACKAGE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___MEMBERS_ARE_DISTINGUISHABLE = PACKAGE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___IS_TEMPLATE_PARAMETER = PACKAGE___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___IS_TEMPLATE = PACKAGE___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___PARAMETERABLE_ELEMENTS = PACKAGE___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___ALL_APPLICABLE_STEREOTYPES = PACKAGE___ALL_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Containing Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___CONTAINING_PROFILE = PACKAGE___CONTAINING_PROFILE;

	/**
	 * The operation id for the '<em>Makes Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___MAKES_VISIBLE__NAMEDELEMENT = PACKAGE___MAKES_VISIBLE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Nested Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___NESTED_PACKAGE = PACKAGE___NESTED_PACKAGE;

	/**
	 * The operation id for the '<em>Owned Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___OWNED_STEREOTYPE = PACKAGE___OWNED_STEREOTYPE;

	/**
	 * The operation id for the '<em>Owned Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___OWNED_TYPE = PACKAGE___OWNED_TYPE;

	/**
	 * The operation id for the '<em>Visible Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___VISIBLE_MEMBERS = PACKAGE___VISIBLE_MEMBERS;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.packages.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.packages.impl.ModelImpl
	 * @see uml.packages.impl.PackagesPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_COMMENT = PACKAGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_ELEMENT = PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNER = PACKAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME_EXPRESSION = PACKAGE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAMESPACE = PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__QUALIFIED_NAME = PACKAGE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CLIENT_DEPENDENCY = PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENT_IMPORT = PACKAGE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IMPORTED_MEMBER = PACKAGE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MEMBER = PACKAGE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_MEMBER = PACKAGE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_RULE = PACKAGE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGE_IMPORT = PACKAGE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNING_TEMPLATE_PARAMETER = PACKAGE__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TEMPLATE_PARAMETER = PACKAGE__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TEMPLATE_BINDING = PACKAGE__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_TEMPLATE_SIGNATURE = PACKAGE__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGE_MERGE = PACKAGE__PACKAGE_MERGE;

	/**
	 * The feature id for the '<em><b>Profile Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROFILE_APPLICATION = PACKAGE__PROFILE_APPLICATION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__URI = PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NESTED_PACKAGE = PACKAGE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NESTING_PACKAGE = PACKAGE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_STEREOTYPE = PACKAGE__OWNED_STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_TYPE = PACKAGE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VIEWPOINT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_OWNED_ELEMENTS = PACKAGE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___MUST_BE_OWNED = PACKAGE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_NAMESPACES = PACKAGE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_OWNING_PACKAGES = PACKAGE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = PACKAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___QUALIFIED_NAME = PACKAGE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___SEPARATOR = PACKAGE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___CLIENT_DEPENDENCY = PACKAGE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___EXCLUDE_COLLISIONS__ELIST = PACKAGE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GET_NAMES_OF_MEMBER__NAMEDELEMENT = PACKAGE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___IMPORT_MEMBERS__ELIST = PACKAGE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___IMPORTED_MEMBER = PACKAGE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___MEMBERS_ARE_DISTINGUISHABLE = PACKAGE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___IS_TEMPLATE_PARAMETER = PACKAGE___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___IS_TEMPLATE = PACKAGE___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___PARAMETERABLE_ELEMENTS = PACKAGE___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_APPLICABLE_STEREOTYPES = PACKAGE___ALL_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Containing Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___CONTAINING_PROFILE = PACKAGE___CONTAINING_PROFILE;

	/**
	 * The operation id for the '<em>Makes Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___MAKES_VISIBLE__NAMEDELEMENT = PACKAGE___MAKES_VISIBLE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Nested Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___NESTED_PACKAGE = PACKAGE___NESTED_PACKAGE;

	/**
	 * The operation id for the '<em>Owned Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___OWNED_STEREOTYPE = PACKAGE___OWNED_STEREOTYPE;

	/**
	 * The operation id for the '<em>Owned Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___OWNED_TYPE = PACKAGE___OWNED_TYPE;

	/**
	 * The operation id for the '<em>Visible Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___VISIBLE_MEMBERS = PACKAGE___VISIBLE_MEMBERS;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.packages.impl.PackageMergeImpl <em>Package Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.packages.impl.PackageMergeImpl
	 * @see uml.packages.impl.PackagesPackageImpl#getPackageMerge()
	 * @generated
	 */
	int PACKAGE_MERGE = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE__OWNED_COMMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE__OWNED_ELEMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE__OWNER = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE__RELATED_ELEMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE__SOURCE = CommonStructurePackage.DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE__TARGET = CommonStructurePackage.DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Merged Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE__MERGED_PACKAGE = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiving Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE__RECEIVING_PACKAGE = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_FEATURE_COUNT = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE___ALL_OWNED_ELEMENTS = CommonStructurePackage.DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE___MUST_BE_OWNED = CommonStructurePackage.DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Package Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_MERGE_OPERATION_COUNT = CommonStructurePackage.DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.packages.impl.ProfileApplicationImpl <em>Profile Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.packages.impl.ProfileApplicationImpl
	 * @see uml.packages.impl.PackagesPackageImpl#getProfileApplication()
	 * @generated
	 */
	int PROFILE_APPLICATION = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION__OWNED_COMMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION__OWNED_ELEMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION__OWNER = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION__RELATED_ELEMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION__SOURCE = CommonStructurePackage.DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION__TARGET = CommonStructurePackage.DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Applied Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION__APPLIED_PROFILE = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applying Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION__APPLYING_PACKAGE = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION__IS_STRICT = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Profile Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION_FEATURE_COUNT = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION___ALL_OWNED_ELEMENTS = CommonStructurePackage.DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION___MUST_BE_OWNED = CommonStructurePackage.DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Profile Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_APPLICATION_OPERATION_COUNT = CommonStructurePackage.DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uml.packages.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see uml.packages.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the reference '{@link uml.packages.Extension#getMetaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metaclass</em>'.
	 * @see uml.packages.Extension#getMetaclass()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Metaclass();

	/**
	 * Returns the meta object for the attribute '{@link uml.packages.Extension#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see uml.packages.Extension#isIsRequired()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_IsRequired();

	/**
	 * Returns the meta object for the '{@link uml.packages.Extension#isRequired() <em>Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Required</em>' operation.
	 * @see uml.packages.Extension#isRequired()
	 * @generated
	 */
	EOperation getExtension__IsRequired();

	/**
	 * Returns the meta object for the '{@link uml.packages.Extension#metaclass() <em>Metaclass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Metaclass</em>' operation.
	 * @see uml.packages.Extension#metaclass()
	 * @generated
	 */
	EOperation getExtension__Metaclass();

	/**
	 * Returns the meta object for the '{@link uml.packages.Extension#metaclassEnd() <em>Metaclass End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Metaclass End</em>' operation.
	 * @see uml.packages.Extension#metaclassEnd()
	 * @generated
	 */
	EOperation getExtension__MetaclassEnd();

	/**
	 * Returns the meta object for class '{@link uml.packages.ExtensionEnd <em>Extension End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension End</em>'.
	 * @see uml.packages.ExtensionEnd
	 * @generated
	 */
	EClass getExtensionEnd();

	/**
	 * Returns the meta object for class '{@link uml.packages.Stereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype</em>'.
	 * @see uml.packages.Stereotype
	 * @generated
	 */
	EClass getStereotype();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.packages.Stereotype#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see uml.packages.Stereotype#getIcon()
	 * @see #getStereotype()
	 * @generated
	 */
	EReference getStereotype_Icon();

	/**
	 * Returns the meta object for the reference '{@link uml.packages.Stereotype#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profile</em>'.
	 * @see uml.packages.Stereotype#getProfile()
	 * @see #getStereotype()
	 * @generated
	 */
	EReference getStereotype_Profile();

	/**
	 * Returns the meta object for the '{@link uml.packages.Stereotype#containingProfile() <em>Containing Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Containing Profile</em>' operation.
	 * @see uml.packages.Stereotype#containingProfile()
	 * @generated
	 */
	EOperation getStereotype__ContainingProfile();

	/**
	 * Returns the meta object for the '{@link uml.packages.Stereotype#profile() <em>Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Profile</em>' operation.
	 * @see uml.packages.Stereotype#profile()
	 * @generated
	 */
	EOperation getStereotype__Profile();

	/**
	 * Returns the meta object for class '{@link uml.packages.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see uml.packages.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link uml.packages.Image#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see uml.packages.Image#getContent()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Content();

	/**
	 * Returns the meta object for the attribute '{@link uml.packages.Image#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uml.packages.Image#getFormat()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Format();

	/**
	 * Returns the meta object for the attribute '{@link uml.packages.Image#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see uml.packages.Image#getLocation()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Location();

	/**
	 * Returns the meta object for class '{@link uml.packages.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see uml.packages.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the reference list '{@link uml.packages.Profile#getMetaclassReference <em>Metaclass Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metaclass Reference</em>'.
	 * @see uml.packages.Profile#getMetaclassReference()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_MetaclassReference();

	/**
	 * Returns the meta object for the reference list '{@link uml.packages.Profile#getMetamodelReference <em>Metamodel Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metamodel Reference</em>'.
	 * @see uml.packages.Profile#getMetamodelReference()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_MetamodelReference();

	/**
	 * Returns the meta object for class '{@link uml.packages.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uml.packages.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link uml.packages.Model#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint</em>'.
	 * @see uml.packages.Model#getViewpoint()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Viewpoint();

	/**
	 * Returns the meta object for class '{@link uml.packages.PackageMerge <em>Package Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Merge</em>'.
	 * @see uml.packages.PackageMerge
	 * @generated
	 */
	EClass getPackageMerge();

	/**
	 * Returns the meta object for the reference '{@link uml.packages.PackageMerge#getMergedPackage <em>Merged Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merged Package</em>'.
	 * @see uml.packages.PackageMerge#getMergedPackage()
	 * @see #getPackageMerge()
	 * @generated
	 */
	EReference getPackageMerge_MergedPackage();

	/**
	 * Returns the meta object for the container reference '{@link uml.packages.PackageMerge#getReceivingPackage <em>Receiving Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Receiving Package</em>'.
	 * @see uml.packages.PackageMerge#getReceivingPackage()
	 * @see #getPackageMerge()
	 * @generated
	 */
	EReference getPackageMerge_ReceivingPackage();

	/**
	 * Returns the meta object for class '{@link uml.packages.ProfileApplication <em>Profile Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Application</em>'.
	 * @see uml.packages.ProfileApplication
	 * @generated
	 */
	EClass getProfileApplication();

	/**
	 * Returns the meta object for the reference '{@link uml.packages.ProfileApplication#getAppliedProfile <em>Applied Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applied Profile</em>'.
	 * @see uml.packages.ProfileApplication#getAppliedProfile()
	 * @see #getProfileApplication()
	 * @generated
	 */
	EReference getProfileApplication_AppliedProfile();

	/**
	 * Returns the meta object for the container reference '{@link uml.packages.ProfileApplication#getApplyingPackage <em>Applying Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Applying Package</em>'.
	 * @see uml.packages.ProfileApplication#getApplyingPackage()
	 * @see #getProfileApplication()
	 * @generated
	 */
	EReference getProfileApplication_ApplyingPackage();

	/**
	 * Returns the meta object for the attribute '{@link uml.packages.ProfileApplication#isIsStrict <em>Is Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict</em>'.
	 * @see uml.packages.ProfileApplication#isIsStrict()
	 * @see #getProfileApplication()
	 * @generated
	 */
	EAttribute getProfileApplication_IsStrict();

	/**
	 * Returns the meta object for class '{@link uml.packages.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see uml.packages.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.packages.Package#getPackageMerge <em>Package Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Merge</em>'.
	 * @see uml.packages.Package#getPackageMerge()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackageMerge();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.packages.Package#getProfileApplication <em>Profile Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile Application</em>'.
	 * @see uml.packages.Package#getProfileApplication()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ProfileApplication();

	/**
	 * Returns the meta object for the attribute '{@link uml.packages.Package#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see uml.packages.Package#getUri()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Uri();

	/**
	 * Returns the meta object for the reference list '{@link uml.packages.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nested Package</em>'.
	 * @see uml.packages.Package#getNestedPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_NestedPackage();

	/**
	 * Returns the meta object for the reference '{@link uml.packages.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nesting Package</em>'.
	 * @see uml.packages.Package#getNestingPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_NestingPackage();

	/**
	 * Returns the meta object for the reference list '{@link uml.packages.Package#getOwnedStereotype <em>Owned Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Stereotype</em>'.
	 * @see uml.packages.Package#getOwnedStereotype()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedStereotype();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.packages.Package#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
	 * @see uml.packages.Package#getPackagedElement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackagedElement();

	/**
	 * Returns the meta object for the reference list '{@link uml.packages.Package#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Type</em>'.
	 * @see uml.packages.Package#getOwnedType()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_OwnedType();

	/**
	 * Returns the meta object for the '{@link uml.packages.Package#allApplicableStereotypes() <em>All Applicable Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Applicable Stereotypes</em>' operation.
	 * @see uml.packages.Package#allApplicableStereotypes()
	 * @generated
	 */
	EOperation getPackage__AllApplicableStereotypes();

	/**
	 * Returns the meta object for the '{@link uml.packages.Package#containingProfile() <em>Containing Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Containing Profile</em>' operation.
	 * @see uml.packages.Package#containingProfile()
	 * @generated
	 */
	EOperation getPackage__ContainingProfile();

	/**
	 * Returns the meta object for the '{@link uml.packages.Package#makesVisible(uml.commonStructure.NamedElement) <em>Makes Visible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Makes Visible</em>' operation.
	 * @see uml.packages.Package#makesVisible(uml.commonStructure.NamedElement)
	 * @generated
	 */
	EOperation getPackage__MakesVisible__NamedElement();

	/**
	 * Returns the meta object for the '{@link uml.packages.Package#nestedPackage() <em>Nested Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nested Package</em>' operation.
	 * @see uml.packages.Package#nestedPackage()
	 * @generated
	 */
	EOperation getPackage__NestedPackage();

	/**
	 * Returns the meta object for the '{@link uml.packages.Package#ownedStereotype() <em>Owned Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Owned Stereotype</em>' operation.
	 * @see uml.packages.Package#ownedStereotype()
	 * @generated
	 */
	EOperation getPackage__OwnedStereotype();

	/**
	 * Returns the meta object for the '{@link uml.packages.Package#ownedType() <em>Owned Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Owned Type</em>' operation.
	 * @see uml.packages.Package#ownedType()
	 * @generated
	 */
	EOperation getPackage__OwnedType();

	/**
	 * Returns the meta object for the '{@link uml.packages.Package#visibleMembers() <em>Visible Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visible Members</em>' operation.
	 * @see uml.packages.Package#visibleMembers()
	 * @generated
	 */
	EOperation getPackage__VisibleMembers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PackagesFactory getPackagesFactory();

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
		 * The meta object literal for the '{@link uml.packages.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.packages.impl.ExtensionImpl
		 * @see uml.packages.impl.PackagesPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Metaclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__METACLASS = eINSTANCE.getExtension_Metaclass();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__IS_REQUIRED = eINSTANCE.getExtension_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___IS_REQUIRED = eINSTANCE.getExtension__IsRequired();

		/**
		 * The meta object literal for the '<em><b>Metaclass</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___METACLASS = eINSTANCE.getExtension__Metaclass();

		/**
		 * The meta object literal for the '<em><b>Metaclass End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___METACLASS_END = eINSTANCE.getExtension__MetaclassEnd();

		/**
		 * The meta object literal for the '{@link uml.packages.impl.ExtensionEndImpl <em>Extension End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.packages.impl.ExtensionEndImpl
		 * @see uml.packages.impl.PackagesPackageImpl#getExtensionEnd()
		 * @generated
		 */
		EClass EXTENSION_END = eINSTANCE.getExtensionEnd();

		/**
		 * The meta object literal for the '{@link uml.packages.impl.StereotypeImpl <em>Stereotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.packages.impl.StereotypeImpl
		 * @see uml.packages.impl.PackagesPackageImpl#getStereotype()
		 * @generated
		 */
		EClass STEREOTYPE = eINSTANCE.getStereotype();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEREOTYPE__ICON = eINSTANCE.getStereotype_Icon();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEREOTYPE__PROFILE = eINSTANCE.getStereotype_Profile();

		/**
		 * The meta object literal for the '<em><b>Containing Profile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STEREOTYPE___CONTAINING_PROFILE = eINSTANCE.getStereotype__ContainingProfile();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STEREOTYPE___PROFILE = eINSTANCE.getStereotype__Profile();

		/**
		 * The meta object literal for the '{@link uml.packages.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.packages.impl.ImageImpl
		 * @see uml.packages.impl.PackagesPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__CONTENT = eINSTANCE.getImage_Content();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__FORMAT = eINSTANCE.getImage_Format();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__LOCATION = eINSTANCE.getImage_Location();

		/**
		 * The meta object literal for the '{@link uml.packages.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.packages.impl.ProfileImpl
		 * @see uml.packages.impl.PackagesPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Metaclass Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__METACLASS_REFERENCE = eINSTANCE.getProfile_MetaclassReference();

		/**
		 * The meta object literal for the '<em><b>Metamodel Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__METAMODEL_REFERENCE = eINSTANCE.getProfile_MetamodelReference();

		/**
		 * The meta object literal for the '{@link uml.packages.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.packages.impl.ModelImpl
		 * @see uml.packages.impl.PackagesPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__VIEWPOINT = eINSTANCE.getModel_Viewpoint();

		/**
		 * The meta object literal for the '{@link uml.packages.impl.PackageMergeImpl <em>Package Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.packages.impl.PackageMergeImpl
		 * @see uml.packages.impl.PackagesPackageImpl#getPackageMerge()
		 * @generated
		 */
		EClass PACKAGE_MERGE = eINSTANCE.getPackageMerge();

		/**
		 * The meta object literal for the '<em><b>Merged Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_MERGE__MERGED_PACKAGE = eINSTANCE.getPackageMerge_MergedPackage();

		/**
		 * The meta object literal for the '<em><b>Receiving Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_MERGE__RECEIVING_PACKAGE = eINSTANCE.getPackageMerge_ReceivingPackage();

		/**
		 * The meta object literal for the '{@link uml.packages.impl.ProfileApplicationImpl <em>Profile Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.packages.impl.ProfileApplicationImpl
		 * @see uml.packages.impl.PackagesPackageImpl#getProfileApplication()
		 * @generated
		 */
		EClass PROFILE_APPLICATION = eINSTANCE.getProfileApplication();

		/**
		 * The meta object literal for the '<em><b>Applied Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE_APPLICATION__APPLIED_PROFILE = eINSTANCE.getProfileApplication_AppliedProfile();

		/**
		 * The meta object literal for the '<em><b>Applying Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE_APPLICATION__APPLYING_PACKAGE = eINSTANCE.getProfileApplication_ApplyingPackage();

		/**
		 * The meta object literal for the '<em><b>Is Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE_APPLICATION__IS_STRICT = eINSTANCE.getProfileApplication_IsStrict();

		/**
		 * The meta object literal for the '{@link uml.packages.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.packages.impl.PackageImpl
		 * @see uml.packages.impl.PackagesPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Package Merge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGE_MERGE = eINSTANCE.getPackage_PackageMerge();

		/**
		 * The meta object literal for the '<em><b>Profile Application</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PROFILE_APPLICATION = eINSTANCE.getPackage_ProfileApplication();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__URI = eINSTANCE.getPackage_Uri();

		/**
		 * The meta object literal for the '<em><b>Nested Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NESTED_PACKAGE = eINSTANCE.getPackage_NestedPackage();

		/**
		 * The meta object literal for the '<em><b>Nesting Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__NESTING_PACKAGE = eINSTANCE.getPackage_NestingPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Stereotype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNED_STEREOTYPE = eINSTANCE.getPackage_OwnedStereotype();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGED_ELEMENT = eINSTANCE.getPackage_PackagedElement();

		/**
		 * The meta object literal for the '<em><b>Owned Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OWNED_TYPE = eINSTANCE.getPackage_OwnedType();

		/**
		 * The meta object literal for the '<em><b>All Applicable Stereotypes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___ALL_APPLICABLE_STEREOTYPES = eINSTANCE.getPackage__AllApplicableStereotypes();

		/**
		 * The meta object literal for the '<em><b>Containing Profile</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___CONTAINING_PROFILE = eINSTANCE.getPackage__ContainingProfile();

		/**
		 * The meta object literal for the '<em><b>Makes Visible</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___MAKES_VISIBLE__NAMEDELEMENT = eINSTANCE.getPackage__MakesVisible__NamedElement();

		/**
		 * The meta object literal for the '<em><b>Nested Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___NESTED_PACKAGE = eINSTANCE.getPackage__NestedPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Stereotype</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___OWNED_STEREOTYPE = eINSTANCE.getPackage__OwnedStereotype();

		/**
		 * The meta object literal for the '<em><b>Owned Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___OWNED_TYPE = eINSTANCE.getPackage__OwnedType();

		/**
		 * The meta object literal for the '<em><b>Visible Members</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___VISIBLE_MEMBERS = eINSTANCE.getPackage__VisibleMembers();

	}

} //PackagesPackage
