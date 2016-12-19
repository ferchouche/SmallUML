/**
 */
package uml.informationFlows;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uml.classification.ClassificationPackage;

import uml.commonStructure.CommonStructurePackage;

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
 * @see uml.informationFlows.InformationFlowsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='InformationFlows'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface InformationFlowsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "informationFlows";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/informationFlows.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.informationFlows";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InformationFlowsPackage eINSTANCE = uml.informationFlows.impl.InformationFlowsPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.informationFlows.impl.InformationFlowImpl <em>Information Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.informationFlows.impl.InformationFlowImpl
	 * @see uml.informationFlows.impl.InformationFlowsPackageImpl#getInformationFlow()
	 * @generated
	 */
	int INFORMATION_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__OWNED_COMMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__OWNED_ELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__OWNER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__NAME_EXPRESSION = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__VISIBILITY = CommonStructurePackage.PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__RELATED_ELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__SOURCE = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__TARGET = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conveyed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__CONVEYED = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Information Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__INFORMATION_SOURCE = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Information Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__INFORMATION_TARGET = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Realization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__REALIZATION = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Realizing Activity Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Realizing Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__REALIZING_CONNECTOR = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Realizing Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW__REALIZING_MESSAGE = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_FEATURE_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___ALL_OWNED_ELEMENTS = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___MUST_BE_OWNED = CommonStructurePackage.PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___ALL_NAMESPACES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___ALL_OWNING_PACKAGES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___SEPARATOR = CommonStructurePackage.PACKAGEABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW___IS_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Information Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FLOW_OPERATION_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.informationFlows.impl.InformationItemImpl <em>Information Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.informationFlows.impl.InformationItemImpl
	 * @see uml.informationFlows.impl.InformationFlowsPackageImpl#getInformationItem()
	 * @generated
	 */
	int INFORMATION_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__OWNED_COMMENT = ClassificationPackage.CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__OWNED_ELEMENT = ClassificationPackage.CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__OWNER = ClassificationPackage.CLASSIFIER__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__NAME = ClassificationPackage.CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__NAME_EXPRESSION = ClassificationPackage.CLASSIFIER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__NAMESPACE = ClassificationPackage.CLASSIFIER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__QUALIFIED_NAME = ClassificationPackage.CLASSIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__VISIBILITY = ClassificationPackage.CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__CLIENT_DEPENDENCY = ClassificationPackage.CLASSIFIER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__ELEMENT_IMPORT = ClassificationPackage.CLASSIFIER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__IMPORTED_MEMBER = ClassificationPackage.CLASSIFIER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__MEMBER = ClassificationPackage.CLASSIFIER__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__OWNED_MEMBER = ClassificationPackage.CLASSIFIER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__OWNED_RULE = ClassificationPackage.CLASSIFIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__PACKAGE_IMPORT = ClassificationPackage.CLASSIFIER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__IS_LEAF = ClassificationPackage.CLASSIFIER__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__REDEFINED_ELEMENT = ClassificationPackage.CLASSIFIER__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__REDEFINITION_CONTEXT = ClassificationPackage.CLASSIFIER__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__OWNING_TEMPLATE_PARAMETER = ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__TEMPLATE_PARAMETER = ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__PACKAGE = ClassificationPackage.CLASSIFIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__TEMPLATE_BINDING = ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__OWNED_TEMPLATE_SIGNATURE = ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__SUBSTITUTION = ClassificationPackage.CLASSIFIER__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__FEATURE = ClassificationPackage.CLASSIFIER__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__POWERTYPE_EXTENT = ClassificationPackage.CLASSIFIER__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__GENERALIZATION = ClassificationPackage.CLASSIFIER__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__ATTRIBUTE = ClassificationPackage.CLASSIFIER__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__COLLABORATION_USE = ClassificationPackage.CLASSIFIER__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__GENERAL = ClassificationPackage.CLASSIFIER__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__INHERITED_MEMBER = ClassificationPackage.CLASSIFIER__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__IS_ABSTRACT = ClassificationPackage.CLASSIFIER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__IS_FINAL_SPECIALIZATION = ClassificationPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__OWNED_USE_CASE = ClassificationPackage.CLASSIFIER__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__USE_CASE = ClassificationPackage.CLASSIFIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__REDEFINED_CLASSIFIER = ClassificationPackage.CLASSIFIER__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__REPRESENTATION = ClassificationPackage.CLASSIFIER__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Represented</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM__REPRESENTED = ClassificationPackage.CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Information Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_FEATURE_COUNT = ClassificationPackage.CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___ALL_OWNED_ELEMENTS = ClassificationPackage.CLASSIFIER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___MUST_BE_OWNED = ClassificationPackage.CLASSIFIER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___ALL_NAMESPACES = ClassificationPackage.CLASSIFIER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___ALL_OWNING_PACKAGES = ClassificationPackage.CLASSIFIER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ClassificationPackage.CLASSIFIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___QUALIFIED_NAME = ClassificationPackage.CLASSIFIER___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___SEPARATOR = ClassificationPackage.CLASSIFIER___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___CLIENT_DEPENDENCY = ClassificationPackage.CLASSIFIER___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___EXCLUDE_COLLISIONS__ELIST = ClassificationPackage.CLASSIFIER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___GET_NAMES_OF_MEMBER__NAMEDELEMENT = ClassificationPackage.CLASSIFIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___IMPORT_MEMBERS__ELIST = ClassificationPackage.CLASSIFIER___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___IMPORTED_MEMBER = ClassificationPackage.CLASSIFIER___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___MEMBERS_ARE_DISTINGUISHABLE = ClassificationPackage.CLASSIFIER___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ClassificationPackage.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ClassificationPackage.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = ClassificationPackage.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___IS_TEMPLATE_PARAMETER = ClassificationPackage.CLASSIFIER___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___CONFORMS_TO__TYPE = ClassificationPackage.CLASSIFIER___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___IS_TEMPLATE = ClassificationPackage.CLASSIFIER___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___PARAMETERABLE_ELEMENTS = ClassificationPackage.CLASSIFIER___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___ALL_FEATURES = ClassificationPackage.CLASSIFIER___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___ALL_PARENTS = ClassificationPackage.CLASSIFIER___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___GENERAL = ClassificationPackage.CLASSIFIER___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___HAS_VISIBILITY_OF__NAMEDELEMENT = ClassificationPackage.CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___INHERIT__ELIST = ClassificationPackage.CLASSIFIER___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___INHERITABLE_MEMBERS__CLASSIFIER = ClassificationPackage.CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___INHERITED_MEMBER = ClassificationPackage.CLASSIFIER___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___MAY_SPECIALIZE_TYPE__CLASSIFIER = ClassificationPackage.CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___PARENTS = ClassificationPackage.CLASSIFIER___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___DIRECTLY_REALIZED_INTERFACES = ClassificationPackage.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___DIRECTLY_USED_INTERFACES = ClassificationPackage.CLASSIFIER___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___ALL_REALIZED_INTERFACES = ClassificationPackage.CLASSIFIER___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___ALL_USED_INTERFACES = ClassificationPackage.CLASSIFIER___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___IS_SUBSTITUTABLE_FOR__CLASSIFIER = ClassificationPackage.CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___ALL_ATTRIBUTES = ClassificationPackage.CLASSIFIER___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM___ALL_SLOTTABLE_FEATURES = ClassificationPackage.CLASSIFIER___ALL_SLOTTABLE_FEATURES;

	/**
	 * The number of operations of the '<em>Information Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ITEM_OPERATION_COUNT = ClassificationPackage.CLASSIFIER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uml.informationFlows.InformationFlow <em>Information Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Flow</em>'.
	 * @see uml.informationFlows.InformationFlow
	 * @generated
	 */
	EClass getInformationFlow();

	/**
	 * Returns the meta object for the reference list '{@link uml.informationFlows.InformationFlow#getConveyed <em>Conveyed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conveyed</em>'.
	 * @see uml.informationFlows.InformationFlow#getConveyed()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_Conveyed();

	/**
	 * Returns the meta object for the reference list '{@link uml.informationFlows.InformationFlow#getInformationSource <em>Information Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information Source</em>'.
	 * @see uml.informationFlows.InformationFlow#getInformationSource()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_InformationSource();

	/**
	 * Returns the meta object for the reference list '{@link uml.informationFlows.InformationFlow#getInformationTarget <em>Information Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information Target</em>'.
	 * @see uml.informationFlows.InformationFlow#getInformationTarget()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_InformationTarget();

	/**
	 * Returns the meta object for the reference list '{@link uml.informationFlows.InformationFlow#getRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realization</em>'.
	 * @see uml.informationFlows.InformationFlow#getRealization()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_Realization();

	/**
	 * Returns the meta object for the reference list '{@link uml.informationFlows.InformationFlow#getRealizingActivityEdge <em>Realizing Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizing Activity Edge</em>'.
	 * @see uml.informationFlows.InformationFlow#getRealizingActivityEdge()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_RealizingActivityEdge();

	/**
	 * Returns the meta object for the reference list '{@link uml.informationFlows.InformationFlow#getRealizingConnector <em>Realizing Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizing Connector</em>'.
	 * @see uml.informationFlows.InformationFlow#getRealizingConnector()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_RealizingConnector();

	/**
	 * Returns the meta object for the reference list '{@link uml.informationFlows.InformationFlow#getRealizingMessage <em>Realizing Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizing Message</em>'.
	 * @see uml.informationFlows.InformationFlow#getRealizingMessage()
	 * @see #getInformationFlow()
	 * @generated
	 */
	EReference getInformationFlow_RealizingMessage();

	/**
	 * Returns the meta object for class '{@link uml.informationFlows.InformationItem <em>Information Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Item</em>'.
	 * @see uml.informationFlows.InformationItem
	 * @generated
	 */
	EClass getInformationItem();

	/**
	 * Returns the meta object for the reference list '{@link uml.informationFlows.InformationItem#getRepresented <em>Represented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Represented</em>'.
	 * @see uml.informationFlows.InformationItem#getRepresented()
	 * @see #getInformationItem()
	 * @generated
	 */
	EReference getInformationItem_Represented();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InformationFlowsFactory getInformationFlowsFactory();

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
		 * The meta object literal for the '{@link uml.informationFlows.impl.InformationFlowImpl <em>Information Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.informationFlows.impl.InformationFlowImpl
		 * @see uml.informationFlows.impl.InformationFlowsPackageImpl#getInformationFlow()
		 * @generated
		 */
		EClass INFORMATION_FLOW = eINSTANCE.getInformationFlow();

		/**
		 * The meta object literal for the '<em><b>Conveyed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__CONVEYED = eINSTANCE.getInformationFlow_Conveyed();

		/**
		 * The meta object literal for the '<em><b>Information Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__INFORMATION_SOURCE = eINSTANCE.getInformationFlow_InformationSource();

		/**
		 * The meta object literal for the '<em><b>Information Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__INFORMATION_TARGET = eINSTANCE.getInformationFlow_InformationTarget();

		/**
		 * The meta object literal for the '<em><b>Realization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__REALIZATION = eINSTANCE.getInformationFlow_Realization();

		/**
		 * The meta object literal for the '<em><b>Realizing Activity Edge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE = eINSTANCE.getInformationFlow_RealizingActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Realizing Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__REALIZING_CONNECTOR = eINSTANCE.getInformationFlow_RealizingConnector();

		/**
		 * The meta object literal for the '<em><b>Realizing Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_FLOW__REALIZING_MESSAGE = eINSTANCE.getInformationFlow_RealizingMessage();

		/**
		 * The meta object literal for the '{@link uml.informationFlows.impl.InformationItemImpl <em>Information Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.informationFlows.impl.InformationItemImpl
		 * @see uml.informationFlows.impl.InformationFlowsPackageImpl#getInformationItem()
		 * @generated
		 */
		EClass INFORMATION_ITEM = eINSTANCE.getInformationItem();

		/**
		 * The meta object literal for the '<em><b>Represented</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_ITEM__REPRESENTED = eINSTANCE.getInformationItem_Represented();

	}

} //InformationFlowsPackage
