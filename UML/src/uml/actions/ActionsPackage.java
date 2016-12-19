/**
 */
package uml.actions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uml.activities.ActivitiesPackage;

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
 * @see uml.actions.ActionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Actions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ActionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "actions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/actions.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.actions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionsPackage eINSTANCE = uml.actions.impl.ActionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.actions.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_COMMENT = ActivitiesPackage.EXECUTABLE_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_ELEMENT = ActivitiesPackage.EXECUTABLE_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNER = ActivitiesPackage.EXECUTABLE_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ActivitiesPackage.EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME_EXPRESSION = ActivitiesPackage.EXECUTABLE_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAMESPACE = ActivitiesPackage.EXECUTABLE_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__QUALIFIED_NAME = ActivitiesPackage.EXECUTABLE_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VISIBILITY = ActivitiesPackage.EXECUTABLE_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CLIENT_DEPENDENCY = ActivitiesPackage.EXECUTABLE_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IS_LEAF = ActivitiesPackage.EXECUTABLE_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REDEFINED_ELEMENT = ActivitiesPackage.EXECUTABLE_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REDEFINITION_CONTEXT = ActivitiesPackage.EXECUTABLE_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVITY = ActivitiesPackage.EXECUTABLE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IN_INTERRUPTIBLE_REGION = ActivitiesPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IN_PARTITION = ActivitiesPackage.EXECUTABLE_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IN_STRUCTURED_NODE = ActivitiesPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING = ActivitiesPackage.EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = ActivitiesPackage.EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REDEFINED_NODE = ActivitiesPackage.EXECUTABLE_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IN_GROUP = ActivitiesPackage.EXECUTABLE_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__HANDLER = ActivitiesPackage.EXECUTABLE_NODE__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTEXT = ActivitiesPackage.EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INPUT = ActivitiesPackage.EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IS_LOCALLY_REENTRANT = ActivitiesPackage.EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LOCAL_POSTCONDITION = ActivitiesPackage.EXECUTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LOCAL_PRECONDITION = ActivitiesPackage.EXECUTABLE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTPUT = ActivitiesPackage.EXECUTABLE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ActivitiesPackage.EXECUTABLE_NODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ALL_OWNED_ELEMENTS = ActivitiesPackage.EXECUTABLE_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___MUST_BE_OWNED = ActivitiesPackage.EXECUTABLE_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ALL_NAMESPACES = ActivitiesPackage.EXECUTABLE_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ALL_OWNING_PACKAGES = ActivitiesPackage.EXECUTABLE_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ActivitiesPackage.EXECUTABLE_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___QUALIFIED_NAME = ActivitiesPackage.EXECUTABLE_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___SEPARATOR = ActivitiesPackage.EXECUTABLE_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CLIENT_DEPENDENCY = ActivitiesPackage.EXECUTABLE_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ActivitiesPackage.EXECUTABLE_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ActivitiesPackage.EXECUTABLE_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ActivitiesPackage.EXECUTABLE_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CONTEXT = ActivitiesPackage.EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ALL_ACTIONS = ActivitiesPackage.EXECUTABLE_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ALL_OWNED_NODES = ActivitiesPackage.EXECUTABLE_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CONTAINING_BEHAVIOR = ActivitiesPackage.EXECUTABLE_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ActivitiesPackage.EXECUTABLE_NODE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ValueSpecificationActionImpl <em>Value Specification Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ValueSpecificationActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getValueSpecificationAction()
	 * @generated
	 */
	int VALUE_SPECIFICATION_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__RESULT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION__VALUE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Specification Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Value Specification Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.PinImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OWNED_COMMENT = ActivitiesPackage.OBJECT_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OWNED_ELEMENT = ActivitiesPackage.OBJECT_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OWNER = ActivitiesPackage.OBJECT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = ActivitiesPackage.OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME_EXPRESSION = ActivitiesPackage.OBJECT_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAMESPACE = ActivitiesPackage.OBJECT_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__QUALIFIED_NAME = ActivitiesPackage.OBJECT_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__VISIBILITY = ActivitiesPackage.OBJECT_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__CLIENT_DEPENDENCY = ActivitiesPackage.OBJECT_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_LEAF = ActivitiesPackage.OBJECT_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__REDEFINED_ELEMENT = ActivitiesPackage.OBJECT_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__REDEFINITION_CONTEXT = ActivitiesPackage.OBJECT_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ACTIVITY = ActivitiesPackage.OBJECT_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IN_INTERRUPTIBLE_REGION = ActivitiesPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IN_PARTITION = ActivitiesPackage.OBJECT_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IN_STRUCTURED_NODE = ActivitiesPackage.OBJECT_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__INCOMING = ActivitiesPackage.OBJECT_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OUTGOING = ActivitiesPackage.OBJECT_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__REDEFINED_NODE = ActivitiesPackage.OBJECT_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IN_GROUP = ActivitiesPackage.OBJECT_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__TYPE = ActivitiesPackage.OBJECT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IN_STATE = ActivitiesPackage.OBJECT_NODE__IN_STATE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_CONTROL_TYPE = ActivitiesPackage.OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ORDERING = ActivitiesPackage.OBJECT_NODE__ORDERING;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__SELECTION = ActivitiesPackage.OBJECT_NODE__SELECTION;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__UPPER_BOUND = ActivitiesPackage.OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_ORDERED = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_UNIQUE = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__LOWER = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__LOWER_VALUE = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__UPPER = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__UPPER_VALUE = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_CONTROL = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___ALL_OWNED_ELEMENTS = ActivitiesPackage.OBJECT_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___MUST_BE_OWNED = ActivitiesPackage.OBJECT_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___ALL_NAMESPACES = ActivitiesPackage.OBJECT_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___ALL_OWNING_PACKAGES = ActivitiesPackage.OBJECT_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ActivitiesPackage.OBJECT_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___QUALIFIED_NAME = ActivitiesPackage.OBJECT_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___SEPARATOR = ActivitiesPackage.OBJECT_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___CLIENT_DEPENDENCY = ActivitiesPackage.OBJECT_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ActivitiesPackage.OBJECT_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ActivitiesPackage.OBJECT_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___ACTIVITY_NODE_CONTAINING_ACTIVITY = ActivitiesPackage.OBJECT_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___IS__INT_INT = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___IS_MULTIVALUED = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___LOWER = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___LOWER_BOUND = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___UPPER = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN___UPPER_BOUND = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link uml.actions.impl.InputPinImpl <em>Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.InputPinImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getInputPin()
	 * @generated
	 */
	int INPUT_PIN = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OWNED_COMMENT = PIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OWNED_ELEMENT = PIN__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OWNER = PIN__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__NAME_EXPRESSION = PIN__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__NAMESPACE = PIN__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__QUALIFIED_NAME = PIN__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__VISIBILITY = PIN__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__CLIENT_DEPENDENCY = PIN__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IS_LEAF = PIN__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__REDEFINED_ELEMENT = PIN__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__REDEFINITION_CONTEXT = PIN__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ACTIVITY = PIN__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IN_INTERRUPTIBLE_REGION = PIN__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IN_PARTITION = PIN__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IN_STRUCTURED_NODE = PIN__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__INCOMING = PIN__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OUTGOING = PIN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__REDEFINED_NODE = PIN__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IN_GROUP = PIN__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__TYPE = PIN__TYPE;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IN_STATE = PIN__IN_STATE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IS_CONTROL_TYPE = PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ORDERING = PIN__ORDERING;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__SELECTION = PIN__SELECTION;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__UPPER_BOUND = PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IS_ORDERED = PIN__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IS_UNIQUE = PIN__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__LOWER = PIN__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__LOWER_VALUE = PIN__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__UPPER = PIN__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__UPPER_VALUE = PIN__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IS_CONTROL = PIN__IS_CONTROL;

	/**
	 * The number of structural features of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___ALL_OWNED_ELEMENTS = PIN___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___MUST_BE_OWNED = PIN___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___ALL_NAMESPACES = PIN___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___ALL_OWNING_PACKAGES = PIN___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___QUALIFIED_NAME = PIN___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___SEPARATOR = PIN___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___CLIENT_DEPENDENCY = PIN___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___ACTIVITY_NODE_CONTAINING_ACTIVITY = PIN___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT = PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___IS__INT_INT = PIN___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___IS_MULTIVALUED = PIN___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___LOWER = PIN___LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___LOWER_BOUND = PIN___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___UPPER = PIN___UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN___UPPER_BOUND = PIN___UPPER_BOUND;

	/**
	 * The number of operations of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_OPERATION_COUNT = PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.OutputPinImpl <em>Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.OutputPinImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OWNED_COMMENT = PIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OWNED_ELEMENT = PIN__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OWNER = PIN__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__NAME_EXPRESSION = PIN__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__NAMESPACE = PIN__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__QUALIFIED_NAME = PIN__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__VISIBILITY = PIN__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__CLIENT_DEPENDENCY = PIN__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IS_LEAF = PIN__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__REDEFINED_ELEMENT = PIN__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__REDEFINITION_CONTEXT = PIN__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ACTIVITY = PIN__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IN_INTERRUPTIBLE_REGION = PIN__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IN_PARTITION = PIN__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IN_STRUCTURED_NODE = PIN__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__INCOMING = PIN__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OUTGOING = PIN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__REDEFINED_NODE = PIN__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IN_GROUP = PIN__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__TYPE = PIN__TYPE;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IN_STATE = PIN__IN_STATE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IS_CONTROL_TYPE = PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ORDERING = PIN__ORDERING;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__SELECTION = PIN__SELECTION;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__UPPER_BOUND = PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IS_ORDERED = PIN__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IS_UNIQUE = PIN__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__LOWER = PIN__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__LOWER_VALUE = PIN__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__UPPER = PIN__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__UPPER_VALUE = PIN__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IS_CONTROL = PIN__IS_CONTROL;

	/**
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___ALL_OWNED_ELEMENTS = PIN___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___MUST_BE_OWNED = PIN___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___ALL_NAMESPACES = PIN___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___ALL_OWNING_PACKAGES = PIN___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___QUALIFIED_NAME = PIN___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___SEPARATOR = PIN___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___CLIENT_DEPENDENCY = PIN___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___ACTIVITY_NODE_CONTAINING_ACTIVITY = PIN___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT = PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___IS__INT_INT = PIN___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___IS_MULTIVALUED = PIN___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___LOWER = PIN___LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___LOWER_BOUND = PIN___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___UPPER = PIN___UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN___UPPER_BOUND = PIN___UPPER_BOUND;

	/**
	 * The number of operations of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_OPERATION_COUNT = PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.VariableActionImpl <em>Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.VariableActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getVariableAction()
	 * @generated
	 */
	int VARIABLE_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__VARIABLE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.LinkActionImpl <em>Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.LinkActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getLinkAction()
	 * @generated
	 */
	int LINK_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__END_DATA = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION__INPUT_VALUE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION___ASSOCIATION = ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.actions.impl.WriteLinkActionImpl <em>Write Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.WriteLinkActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getWriteLinkAction()
	 * @generated
	 */
	int WRITE_LINK_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OWNED_COMMENT = LINK_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OWNED_ELEMENT = LINK_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OWNER = LINK_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__NAME = LINK_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__NAME_EXPRESSION = LINK_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__NAMESPACE = LINK_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__QUALIFIED_NAME = LINK_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__VISIBILITY = LINK_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__CLIENT_DEPENDENCY = LINK_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__IS_LEAF = LINK_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__REDEFINED_ELEMENT = LINK_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__REDEFINITION_CONTEXT = LINK_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__ACTIVITY = LINK_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__IN_INTERRUPTIBLE_REGION = LINK_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__IN_PARTITION = LINK_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__IN_STRUCTURED_NODE = LINK_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__INCOMING = LINK_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OUTGOING = LINK_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__REDEFINED_NODE = LINK_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__IN_GROUP = LINK_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__HANDLER = LINK_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__CONTEXT = LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__INPUT = LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__IS_LOCALLY_REENTRANT = LINK_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__LOCAL_POSTCONDITION = LINK_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__LOCAL_PRECONDITION = LINK_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__OUTPUT = LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__END_DATA = LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION__INPUT_VALUE = LINK_ACTION__INPUT_VALUE;

	/**
	 * The number of structural features of the '<em>Write Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION_FEATURE_COUNT = LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___ALL_OWNED_ELEMENTS = LINK_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___MUST_BE_OWNED = LINK_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___ALL_NAMESPACES = LINK_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___ALL_OWNING_PACKAGES = LINK_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___QUALIFIED_NAME = LINK_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___SEPARATOR = LINK_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___CLIENT_DEPENDENCY = LINK_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___CONTEXT = LINK_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___ALL_ACTIONS = LINK_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___ALL_OWNED_NODES = LINK_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___CONTAINING_BEHAVIOR = LINK_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION___ASSOCIATION = LINK_ACTION___ASSOCIATION;

	/**
	 * The number of operations of the '<em>Write Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINK_ACTION_OPERATION_COUNT = LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.LinkEndDataImpl <em>Link End Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.LinkEndDataImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getLinkEndData()
	 * @generated
	 */
	int LINK_END_DATA = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__OWNED_COMMENT = CommonStructurePackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__OWNED_ELEMENT = CommonStructurePackage.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__OWNER = CommonStructurePackage.ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__END = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__QUALIFIER = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA__VALUE = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link End Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA_FEATURE_COUNT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA___ALL_OWNED_ELEMENTS = CommonStructurePackage.ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA___MUST_BE_OWNED = CommonStructurePackage.ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA___ALL_PINS = CommonStructurePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link End Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DATA_OPERATION_COUNT = CommonStructurePackage.ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.actions.impl.QualifierValueImpl <em>Qualifier Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.QualifierValueImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getQualifierValue()
	 * @generated
	 */
	int QUALIFIER_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE__OWNED_COMMENT = CommonStructurePackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE__OWNED_ELEMENT = CommonStructurePackage.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE__OWNER = CommonStructurePackage.ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE__QUALIFIER = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE__VALUE = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualifier Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE_FEATURE_COUNT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE___ALL_OWNED_ELEMENTS = CommonStructurePackage.ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE___MUST_BE_OWNED = CommonStructurePackage.ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Qualifier Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIER_VALUE_OPERATION_COUNT = CommonStructurePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.StructuralFeatureActionImpl <em>Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.StructuralFeatureActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getStructuralFeatureAction()
	 * @generated
	 */
	int STRUCTURAL_FEATURE_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__OBJECT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.WriteStructuralFeatureActionImpl <em>Write Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.WriteStructuralFeatureActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getWriteStructuralFeatureAction()
	 * @generated
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT = STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT = STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OWNER = STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__NAME = STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION = STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__NAMESPACE = STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME = STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY = STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY = STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__IS_LEAF = STRUCTURAL_FEATURE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT = STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT = STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY = STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION = STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__IN_PARTITION = STRUCTURAL_FEATURE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE = STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING = STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING = STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE = STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__IN_GROUP = STRUCTURAL_FEATURE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__HANDLER = STRUCTURAL_FEATURE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT = STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__INPUT = STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__IS_LOCALLY_REENTRANT = STRUCTURAL_FEATURE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION = STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION = STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT = STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT = STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__RESULT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION__VALUE = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Write Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_ELEMENTS = STRUCTURAL_FEATURE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___MUST_BE_OWNED = STRUCTURAL_FEATURE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___ALL_NAMESPACES = STRUCTURAL_FEATURE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___ALL_OWNING_PACKAGES = STRUCTURAL_FEATURE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STRUCTURAL_FEATURE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___QUALIFIED_NAME = STRUCTURAL_FEATURE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___SEPARATOR = STRUCTURAL_FEATURE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___CLIENT_DEPENDENCY = STRUCTURAL_FEATURE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STRUCTURAL_FEATURE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STRUCTURAL_FEATURE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = STRUCTURAL_FEATURE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___CONTEXT = STRUCTURAL_FEATURE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___ALL_ACTIONS = STRUCTURAL_FEATURE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_NODES = STRUCTURAL_FEATURE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION___CONTAINING_BEHAVIOR = STRUCTURAL_FEATURE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Write Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT = STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.WriteVariableActionImpl <em>Write Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.WriteVariableActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getWriteVariableAction()
	 * @generated
	 */
	int WRITE_VARIABLE_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__OWNED_COMMENT = VARIABLE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__OWNED_ELEMENT = VARIABLE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__OWNER = VARIABLE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__NAME = VARIABLE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__NAME_EXPRESSION = VARIABLE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__NAMESPACE = VARIABLE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__QUALIFIED_NAME = VARIABLE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__VISIBILITY = VARIABLE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY = VARIABLE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__IS_LEAF = VARIABLE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__REDEFINED_ELEMENT = VARIABLE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__REDEFINITION_CONTEXT = VARIABLE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__ACTIVITY = VARIABLE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION = VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__IN_PARTITION = VARIABLE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE = VARIABLE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__INCOMING = VARIABLE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__OUTGOING = VARIABLE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__REDEFINED_NODE = VARIABLE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__IN_GROUP = VARIABLE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__HANDLER = VARIABLE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__CONTEXT = VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__INPUT = VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__IS_LOCALLY_REENTRANT = VARIABLE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION = VARIABLE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION = VARIABLE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__OUTPUT = VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__VARIABLE = VARIABLE_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION__VALUE = VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Write Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION_FEATURE_COUNT = VARIABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___ALL_OWNED_ELEMENTS = VARIABLE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___MUST_BE_OWNED = VARIABLE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___ALL_NAMESPACES = VARIABLE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___ALL_OWNING_PACKAGES = VARIABLE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VARIABLE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___QUALIFIED_NAME = VARIABLE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___SEPARATOR = VARIABLE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___CLIENT_DEPENDENCY = VARIABLE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = VARIABLE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = VARIABLE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = VARIABLE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___CONTEXT = VARIABLE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___ALL_ACTIONS = VARIABLE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___ALL_OWNED_NODES = VARIABLE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION___CONTAINING_BEHAVIOR = VARIABLE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Write Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_VARIABLE_ACTION_OPERATION_COUNT = VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.AcceptEventActionImpl <em>Accept Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.AcceptEventActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getAcceptEventAction()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Unmarshall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IS_UNMARSHALL = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__RESULT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__TRIGGER = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accept Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Accept Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.AcceptCallActionImpl <em>Accept Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.AcceptCallActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getAcceptCallAction()
	 * @generated
	 */
	int ACCEPT_CALL_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__OWNED_COMMENT = ACCEPT_EVENT_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__OWNED_ELEMENT = ACCEPT_EVENT_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__OWNER = ACCEPT_EVENT_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__NAME = ACCEPT_EVENT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__NAME_EXPRESSION = ACCEPT_EVENT_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__NAMESPACE = ACCEPT_EVENT_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__QUALIFIED_NAME = ACCEPT_EVENT_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__VISIBILITY = ACCEPT_EVENT_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__CLIENT_DEPENDENCY = ACCEPT_EVENT_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__IS_LEAF = ACCEPT_EVENT_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__REDEFINED_ELEMENT = ACCEPT_EVENT_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__REDEFINITION_CONTEXT = ACCEPT_EVENT_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__ACTIVITY = ACCEPT_EVENT_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__IN_INTERRUPTIBLE_REGION = ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__IN_PARTITION = ACCEPT_EVENT_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__IN_STRUCTURED_NODE = ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__INCOMING = ACCEPT_EVENT_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__OUTGOING = ACCEPT_EVENT_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__REDEFINED_NODE = ACCEPT_EVENT_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__IN_GROUP = ACCEPT_EVENT_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__HANDLER = ACCEPT_EVENT_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__CONTEXT = ACCEPT_EVENT_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__INPUT = ACCEPT_EVENT_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__IS_LOCALLY_REENTRANT = ACCEPT_EVENT_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__LOCAL_POSTCONDITION = ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__LOCAL_PRECONDITION = ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__OUTPUT = ACCEPT_EVENT_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Unmarshall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__IS_UNMARSHALL = ACCEPT_EVENT_ACTION__IS_UNMARSHALL;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__RESULT = ACCEPT_EVENT_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__TRIGGER = ACCEPT_EVENT_ACTION__TRIGGER;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION__RETURN_INFORMATION = ACCEPT_EVENT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accept Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION_FEATURE_COUNT = ACCEPT_EVENT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___ALL_OWNED_ELEMENTS = ACCEPT_EVENT_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___MUST_BE_OWNED = ACCEPT_EVENT_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___ALL_NAMESPACES = ACCEPT_EVENT_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___ALL_OWNING_PACKAGES = ACCEPT_EVENT_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACCEPT_EVENT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___QUALIFIED_NAME = ACCEPT_EVENT_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___SEPARATOR = ACCEPT_EVENT_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___CLIENT_DEPENDENCY = ACCEPT_EVENT_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACCEPT_EVENT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACCEPT_EVENT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACCEPT_EVENT_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___CONTEXT = ACCEPT_EVENT_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___ALL_ACTIONS = ACCEPT_EVENT_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___ALL_OWNED_NODES = ACCEPT_EVENT_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION___CONTAINING_BEHAVIOR = ACCEPT_EVENT_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Accept Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CALL_ACTION_OPERATION_COUNT = ACCEPT_EVENT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ActionInputPinImpl <em>Action Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ActionInputPinImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getActionInputPin()
	 * @generated
	 */
	int ACTION_INPUT_PIN = 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__OWNED_COMMENT = INPUT_PIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__OWNED_ELEMENT = INPUT_PIN__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__OWNER = INPUT_PIN__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__NAME = INPUT_PIN__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__NAME_EXPRESSION = INPUT_PIN__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__NAMESPACE = INPUT_PIN__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__QUALIFIED_NAME = INPUT_PIN__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__VISIBILITY = INPUT_PIN__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__CLIENT_DEPENDENCY = INPUT_PIN__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IS_LEAF = INPUT_PIN__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__REDEFINED_ELEMENT = INPUT_PIN__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__REDEFINITION_CONTEXT = INPUT_PIN__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__ACTIVITY = INPUT_PIN__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IN_INTERRUPTIBLE_REGION = INPUT_PIN__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IN_PARTITION = INPUT_PIN__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IN_STRUCTURED_NODE = INPUT_PIN__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__INCOMING = INPUT_PIN__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__OUTGOING = INPUT_PIN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__REDEFINED_NODE = INPUT_PIN__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IN_GROUP = INPUT_PIN__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__TYPE = INPUT_PIN__TYPE;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IN_STATE = INPUT_PIN__IN_STATE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IS_CONTROL_TYPE = INPUT_PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__ORDERING = INPUT_PIN__ORDERING;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__SELECTION = INPUT_PIN__SELECTION;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__UPPER_BOUND = INPUT_PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IS_ORDERED = INPUT_PIN__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IS_UNIQUE = INPUT_PIN__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__LOWER = INPUT_PIN__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__LOWER_VALUE = INPUT_PIN__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__UPPER = INPUT_PIN__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__UPPER_VALUE = INPUT_PIN__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__IS_CONTROL = INPUT_PIN__IS_CONTROL;

	/**
	 * The feature id for the '<em><b>From Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN__FROM_ACTION = INPUT_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN_FEATURE_COUNT = INPUT_PIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___ALL_OWNED_ELEMENTS = INPUT_PIN___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___MUST_BE_OWNED = INPUT_PIN___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___ALL_NAMESPACES = INPUT_PIN___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___ALL_OWNING_PACKAGES = INPUT_PIN___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INPUT_PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___QUALIFIED_NAME = INPUT_PIN___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___SEPARATOR = INPUT_PIN___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___CLIENT_DEPENDENCY = INPUT_PIN___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = INPUT_PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = INPUT_PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___ACTIVITY_NODE_CONTAINING_ACTIVITY = INPUT_PIN___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT = INPUT_PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = INPUT_PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___IS__INT_INT = INPUT_PIN___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___IS_MULTIVALUED = INPUT_PIN___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___LOWER = INPUT_PIN___LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___LOWER_BOUND = INPUT_PIN___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___UPPER = INPUT_PIN___UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN___UPPER_BOUND = INPUT_PIN___UPPER_BOUND;

	/**
	 * The number of operations of the '<em>Action Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INPUT_PIN_OPERATION_COUNT = INPUT_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.AddStructuralFeatureValueActionImpl <em>Add Structural Feature Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.AddStructuralFeatureValueActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getAddStructuralFeatureValueAction()
	 * @generated
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT = WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER = WRITE_STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME = WRITE_STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION = WRITE_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE = WRITE_STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME = WRITE_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY = WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY = WRITE_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF = WRITE_STRUCTURAL_FEATURE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY = WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION = WRITE_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION = WRITE_STRUCTURAL_FEATURE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE = WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING = WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING = WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IN_GROUP = WRITE_STRUCTURAL_FEATURE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER = WRITE_STRUCTURAL_FEATURE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT = WRITE_STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LOCALLY_REENTRANT = WRITE_STRUCTURAL_FEATURE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION = WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION = WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT = WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT = WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE = WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__RESULT = WRITE_STRUCTURAL_FEATURE_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE = WRITE_STRUCTURAL_FEATURE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Insert At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_FEATURE_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_OWNED_ELEMENTS = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___MUST_BE_OWNED = WRITE_STRUCTURAL_FEATURE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_NAMESPACES = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_OWNING_PACKAGES = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = WRITE_STRUCTURAL_FEATURE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___QUALIFIED_NAME = WRITE_STRUCTURAL_FEATURE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___SEPARATOR = WRITE_STRUCTURAL_FEATURE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___CLIENT_DEPENDENCY = WRITE_STRUCTURAL_FEATURE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = WRITE_STRUCTURAL_FEATURE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_ACTIONS = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_OWNED_NODES = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION___CONTAINING_BEHAVIOR = WRITE_STRUCTURAL_FEATURE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Add Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRUCTURAL_FEATURE_VALUE_ACTION_OPERATION_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.AddVariableValueActionImpl <em>Add Variable Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.AddVariableValueActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getAddVariableValueAction()
	 * @generated
	 */
	int ADD_VARIABLE_VALUE_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__OWNED_COMMENT = WRITE_VARIABLE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__OWNED_ELEMENT = WRITE_VARIABLE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__OWNER = WRITE_VARIABLE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__NAME = WRITE_VARIABLE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__NAME_EXPRESSION = WRITE_VARIABLE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__NAMESPACE = WRITE_VARIABLE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__QUALIFIED_NAME = WRITE_VARIABLE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__VISIBILITY = WRITE_VARIABLE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__CLIENT_DEPENDENCY = WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__IS_LEAF = WRITE_VARIABLE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__REDEFINED_ELEMENT = WRITE_VARIABLE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__REDEFINITION_CONTEXT = WRITE_VARIABLE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__ACTIVITY = WRITE_VARIABLE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION = WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__IN_PARTITION = WRITE_VARIABLE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE = WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__INCOMING = WRITE_VARIABLE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__OUTGOING = WRITE_VARIABLE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__REDEFINED_NODE = WRITE_VARIABLE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__IN_GROUP = WRITE_VARIABLE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__HANDLER = WRITE_VARIABLE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__CONTEXT = WRITE_VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__INPUT = WRITE_VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__IS_LOCALLY_REENTRANT = WRITE_VARIABLE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION = WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION = WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__OUTPUT = WRITE_VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__VARIABLE = WRITE_VARIABLE_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__VALUE = WRITE_VARIABLE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Insert At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__INSERT_AT = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Variable Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION_FEATURE_COUNT = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___ALL_OWNED_ELEMENTS = WRITE_VARIABLE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___MUST_BE_OWNED = WRITE_VARIABLE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___ALL_NAMESPACES = WRITE_VARIABLE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___ALL_OWNING_PACKAGES = WRITE_VARIABLE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = WRITE_VARIABLE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___QUALIFIED_NAME = WRITE_VARIABLE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___SEPARATOR = WRITE_VARIABLE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___CLIENT_DEPENDENCY = WRITE_VARIABLE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = WRITE_VARIABLE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = WRITE_VARIABLE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = WRITE_VARIABLE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___CONTEXT = WRITE_VARIABLE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___ALL_ACTIONS = WRITE_VARIABLE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___ALL_OWNED_NODES = WRITE_VARIABLE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION___CONTAINING_BEHAVIOR = WRITE_VARIABLE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Add Variable Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_VARIABLE_VALUE_ACTION_OPERATION_COUNT = WRITE_VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.InvocationActionImpl <em>Invocation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.InvocationActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getInvocationAction()
	 * @generated
	 */
	int INVOCATION_ACTION = 19;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__ARGUMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__ON_PORT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invocation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Invocation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.BroadcastSignalActionImpl <em>Broadcast Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.BroadcastSignalActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getBroadcastSignalAction()
	 * @generated
	 */
	int BROADCAST_SIGNAL_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__OWNED_COMMENT = INVOCATION_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__OWNED_ELEMENT = INVOCATION_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__OWNER = INVOCATION_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__NAME = INVOCATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__NAME_EXPRESSION = INVOCATION_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__NAMESPACE = INVOCATION_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__QUALIFIED_NAME = INVOCATION_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__VISIBILITY = INVOCATION_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__CLIENT_DEPENDENCY = INVOCATION_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__IS_LEAF = INVOCATION_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__REDEFINED_ELEMENT = INVOCATION_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__REDEFINITION_CONTEXT = INVOCATION_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__ACTIVITY = INVOCATION_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION = INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__IN_PARTITION = INVOCATION_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__IN_STRUCTURED_NODE = INVOCATION_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__INCOMING = INVOCATION_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__OUTGOING = INVOCATION_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__REDEFINED_NODE = INVOCATION_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__IN_GROUP = INVOCATION_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__HANDLER = INVOCATION_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__CONTEXT = INVOCATION_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__INPUT = INVOCATION_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__IS_LOCALLY_REENTRANT = INVOCATION_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__LOCAL_POSTCONDITION = INVOCATION_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__LOCAL_PRECONDITION = INVOCATION_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__OUTPUT = INVOCATION_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__ARGUMENT = INVOCATION_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__ON_PORT = INVOCATION_ACTION__ON_PORT;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION__SIGNAL = INVOCATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Broadcast Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION_FEATURE_COUNT = INVOCATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___ALL_OWNED_ELEMENTS = INVOCATION_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___MUST_BE_OWNED = INVOCATION_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___ALL_NAMESPACES = INVOCATION_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___ALL_OWNING_PACKAGES = INVOCATION_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INVOCATION_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___QUALIFIED_NAME = INVOCATION_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___SEPARATOR = INVOCATION_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___CLIENT_DEPENDENCY = INVOCATION_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = INVOCATION_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = INVOCATION_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = INVOCATION_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___CONTEXT = INVOCATION_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___ALL_ACTIONS = INVOCATION_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___ALL_OWNED_NODES = INVOCATION_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION___CONTAINING_BEHAVIOR = INVOCATION_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Broadcast Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROADCAST_SIGNAL_ACTION_OPERATION_COUNT = INVOCATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.CallActionImpl <em>Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.CallActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getCallAction()
	 * @generated
	 */
	int CALL_ACTION = 20;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OWNED_COMMENT = INVOCATION_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OWNED_ELEMENT = INVOCATION_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OWNER = INVOCATION_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__NAME = INVOCATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__NAME_EXPRESSION = INVOCATION_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__NAMESPACE = INVOCATION_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__QUALIFIED_NAME = INVOCATION_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__VISIBILITY = INVOCATION_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__CLIENT_DEPENDENCY = INVOCATION_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IS_LEAF = INVOCATION_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__REDEFINED_ELEMENT = INVOCATION_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__REDEFINITION_CONTEXT = INVOCATION_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ACTIVITY = INVOCATION_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IN_INTERRUPTIBLE_REGION = INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IN_PARTITION = INVOCATION_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IN_STRUCTURED_NODE = INVOCATION_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INCOMING = INVOCATION_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OUTGOING = INVOCATION_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__REDEFINED_NODE = INVOCATION_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IN_GROUP = INVOCATION_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__HANDLER = INVOCATION_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__CONTEXT = INVOCATION_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INPUT = INVOCATION_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IS_LOCALLY_REENTRANT = INVOCATION_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__LOCAL_POSTCONDITION = INVOCATION_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__LOCAL_PRECONDITION = INVOCATION_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OUTPUT = INVOCATION_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ARGUMENT = INVOCATION_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ON_PORT = INVOCATION_ACTION__ON_PORT;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IS_SYNCHRONOUS = INVOCATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__RESULT = INVOCATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_FEATURE_COUNT = INVOCATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ALL_OWNED_ELEMENTS = INVOCATION_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___MUST_BE_OWNED = INVOCATION_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ALL_NAMESPACES = INVOCATION_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ALL_OWNING_PACKAGES = INVOCATION_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INVOCATION_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___QUALIFIED_NAME = INVOCATION_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___SEPARATOR = INVOCATION_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___CLIENT_DEPENDENCY = INVOCATION_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = INVOCATION_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = INVOCATION_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = INVOCATION_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___CONTEXT = INVOCATION_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ALL_ACTIONS = INVOCATION_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___ALL_OWNED_NODES = INVOCATION_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___CONTAINING_BEHAVIOR = INVOCATION_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___INPUT_PARAMETERS = INVOCATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION___OUTPUT_PARAMETERS = INVOCATION_ACTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_OPERATION_COUNT = INVOCATION_ACTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml.actions.impl.CallBehaviorActionImpl <em>Call Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.CallBehaviorActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getCallBehaviorAction()
	 * @generated
	 */
	int CALL_BEHAVIOR_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OWNED_COMMENT = CALL_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OWNED_ELEMENT = CALL_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OWNER = CALL_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__NAME_EXPRESSION = CALL_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__NAMESPACE = CALL_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__QUALIFIED_NAME = CALL_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__VISIBILITY = CALL_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__CLIENT_DEPENDENCY = CALL_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IS_LEAF = CALL_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__REDEFINED_ELEMENT = CALL_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__REDEFINITION_CONTEXT = CALL_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__ACTIVITY = CALL_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION = CALL_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IN_PARTITION = CALL_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE = CALL_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__INCOMING = CALL_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OUTGOING = CALL_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__REDEFINED_NODE = CALL_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IN_GROUP = CALL_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__HANDLER = CALL_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__CONTEXT = CALL_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__INPUT = CALL_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IS_LOCALLY_REENTRANT = CALL_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION = CALL_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION = CALL_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OUTPUT = CALL_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__ARGUMENT = CALL_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__ON_PORT = CALL_ACTION__ON_PORT;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IS_SYNCHRONOUS = CALL_ACTION__IS_SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__RESULT = CALL_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__BEHAVIOR = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___ALL_OWNED_ELEMENTS = CALL_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___MUST_BE_OWNED = CALL_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___ALL_NAMESPACES = CALL_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___ALL_OWNING_PACKAGES = CALL_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CALL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___QUALIFIED_NAME = CALL_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___SEPARATOR = CALL_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___CLIENT_DEPENDENCY = CALL_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CALL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CALL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = CALL_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___CONTEXT = CALL_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___ALL_ACTIONS = CALL_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___ALL_OWNED_NODES = CALL_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___CONTAINING_BEHAVIOR = CALL_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___INPUT_PARAMETERS = CALL_ACTION___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION___OUTPUT_PARAMETERS = CALL_ACTION___OUTPUT_PARAMETERS;

	/**
	 * The number of operations of the '<em>Call Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_OPERATION_COUNT = CALL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.CallOperationActionImpl <em>Call Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.CallOperationActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getCallOperationAction()
	 * @generated
	 */
	int CALL_OPERATION_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OWNED_COMMENT = CALL_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OWNED_ELEMENT = CALL_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OWNER = CALL_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__NAME_EXPRESSION = CALL_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__NAMESPACE = CALL_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__QUALIFIED_NAME = CALL_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__VISIBILITY = CALL_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__CLIENT_DEPENDENCY = CALL_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__IS_LEAF = CALL_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__REDEFINED_ELEMENT = CALL_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__REDEFINITION_CONTEXT = CALL_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__ACTIVITY = CALL_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__IN_INTERRUPTIBLE_REGION = CALL_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__IN_PARTITION = CALL_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__IN_STRUCTURED_NODE = CALL_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__INCOMING = CALL_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OUTGOING = CALL_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__REDEFINED_NODE = CALL_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__IN_GROUP = CALL_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__HANDLER = CALL_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__CONTEXT = CALL_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__INPUT = CALL_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__IS_LOCALLY_REENTRANT = CALL_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__LOCAL_POSTCONDITION = CALL_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__LOCAL_PRECONDITION = CALL_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OUTPUT = CALL_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__ARGUMENT = CALL_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__ON_PORT = CALL_ACTION__ON_PORT;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__IS_SYNCHRONOUS = CALL_ACTION__IS_SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__RESULT = CALL_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OPERATION = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__TARGET = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___ALL_OWNED_ELEMENTS = CALL_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___MUST_BE_OWNED = CALL_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___ALL_NAMESPACES = CALL_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___ALL_OWNING_PACKAGES = CALL_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CALL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___QUALIFIED_NAME = CALL_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___SEPARATOR = CALL_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___CLIENT_DEPENDENCY = CALL_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CALL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CALL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = CALL_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___CONTEXT = CALL_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___ALL_ACTIONS = CALL_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___ALL_OWNED_NODES = CALL_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___CONTAINING_BEHAVIOR = CALL_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___INPUT_PARAMETERS = CALL_ACTION___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION___OUTPUT_PARAMETERS = CALL_ACTION___OUTPUT_PARAMETERS;

	/**
	 * The number of operations of the '<em>Call Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION_OPERATION_COUNT = CALL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ClauseImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 23;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__OWNED_COMMENT = CommonStructurePackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__OWNED_ELEMENT = CommonStructurePackage.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__OWNER = CommonStructurePackage.ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__BODY = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__BODY_OUTPUT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__DECIDER = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Predecessor Clause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__PREDECESSOR_CLAUSE = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Successor Clause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__SUCCESSOR_CLAUSE = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__TEST = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = CommonStructurePackage.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE___ALL_OWNED_ELEMENTS = CommonStructurePackage.ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE___MUST_BE_OWNED = CommonStructurePackage.ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = CommonStructurePackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ClearAssociationActionImpl <em>Clear Association Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ClearAssociationActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getClearAssociationAction()
	 * @generated
	 */
	int CLEAR_ASSOCIATION_ACTION = 24;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__ASSOCIATION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION__OBJECT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clear Association Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Clear Association Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_ASSOCIATION_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ClearStructuralFeatureActionImpl <em>Clear Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ClearStructuralFeatureActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getClearStructuralFeatureAction()
	 * @generated
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT = STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT = STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OWNER = STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__NAME = STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION = STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__NAMESPACE = STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME = STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__VISIBILITY = STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY = STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__IS_LEAF = STRUCTURAL_FEATURE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT = STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT = STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__ACTIVITY = STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION = STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__IN_PARTITION = STRUCTURAL_FEATURE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE = STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__INCOMING = STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OUTGOING = STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE = STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__IN_GROUP = STRUCTURAL_FEATURE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__HANDLER = STRUCTURAL_FEATURE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__CONTEXT = STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__INPUT = STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__IS_LOCALLY_REENTRANT = STRUCTURAL_FEATURE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION = STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION = STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OUTPUT = STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__OBJECT = STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clear Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_ELEMENTS = STRUCTURAL_FEATURE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___MUST_BE_OWNED = STRUCTURAL_FEATURE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___ALL_NAMESPACES = STRUCTURAL_FEATURE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___ALL_OWNING_PACKAGES = STRUCTURAL_FEATURE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STRUCTURAL_FEATURE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___QUALIFIED_NAME = STRUCTURAL_FEATURE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___SEPARATOR = STRUCTURAL_FEATURE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___CLIENT_DEPENDENCY = STRUCTURAL_FEATURE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STRUCTURAL_FEATURE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STRUCTURAL_FEATURE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = STRUCTURAL_FEATURE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___CONTEXT = STRUCTURAL_FEATURE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___ALL_ACTIONS = STRUCTURAL_FEATURE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_NODES = STRUCTURAL_FEATURE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION___CONTAINING_BEHAVIOR = STRUCTURAL_FEATURE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Clear Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT = STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ClearVariableActionImpl <em>Clear Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ClearVariableActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getClearVariableAction()
	 * @generated
	 */
	int CLEAR_VARIABLE_ACTION = 26;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__OWNED_COMMENT = VARIABLE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__OWNED_ELEMENT = VARIABLE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__OWNER = VARIABLE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__NAME = VARIABLE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__NAME_EXPRESSION = VARIABLE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__NAMESPACE = VARIABLE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__QUALIFIED_NAME = VARIABLE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__VISIBILITY = VARIABLE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__CLIENT_DEPENDENCY = VARIABLE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__IS_LEAF = VARIABLE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__REDEFINED_ELEMENT = VARIABLE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__REDEFINITION_CONTEXT = VARIABLE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__ACTIVITY = VARIABLE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION = VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__IN_PARTITION = VARIABLE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__IN_STRUCTURED_NODE = VARIABLE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__INCOMING = VARIABLE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__OUTGOING = VARIABLE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__REDEFINED_NODE = VARIABLE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__IN_GROUP = VARIABLE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__HANDLER = VARIABLE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__CONTEXT = VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__INPUT = VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__IS_LOCALLY_REENTRANT = VARIABLE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__LOCAL_POSTCONDITION = VARIABLE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__LOCAL_PRECONDITION = VARIABLE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__OUTPUT = VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION__VARIABLE = VARIABLE_ACTION__VARIABLE;

	/**
	 * The number of structural features of the '<em>Clear Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION_FEATURE_COUNT = VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___ALL_OWNED_ELEMENTS = VARIABLE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___MUST_BE_OWNED = VARIABLE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___ALL_NAMESPACES = VARIABLE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___ALL_OWNING_PACKAGES = VARIABLE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VARIABLE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___QUALIFIED_NAME = VARIABLE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___SEPARATOR = VARIABLE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___CLIENT_DEPENDENCY = VARIABLE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = VARIABLE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = VARIABLE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = VARIABLE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___CONTEXT = VARIABLE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___ALL_ACTIONS = VARIABLE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___ALL_OWNED_NODES = VARIABLE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION___CONTAINING_BEHAVIOR = VARIABLE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Clear Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_VARIABLE_ACTION_OPERATION_COUNT = VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.StructuredActivityNodeImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getStructuredActivityNode()
	 * @generated
	 */
	int STRUCTURED_ACTIVITY_NODE = 61;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__MEMBER = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_RULE = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT = ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE = ACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY = ACTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__SUBGROUP = ACTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__SUPER_GROUP = ACTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE = ACTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__VARIABLE = ACTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__EDGE = ACTION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE = ACTION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT = ACTION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT = ACTION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NODE = ACTION_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Structured Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___EXCLUDE_COLLISIONS__ELIST = ACTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = ACTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___IMPORT_MEMBERS__ELIST = ACTION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___IMPORTED_MEMBER = ACTION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___MEMBERS_ARE_DISTINGUISHABLE = ACTION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___CONTAINING_ACTIVITY = ACTION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Source Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___SOURCE_NODES = ACTION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Target Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE___TARGET_NODES = ACTION_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Structured Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ConditionalNodeImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getConditionalNode()
	 * @generated
	 */
	int CONDITIONAL_NODE = 27;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OWNED_COMMENT = STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OWNED_ELEMENT = STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OWNER = STRUCTURED_ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NAME = STRUCTURED_ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NAME_EXPRESSION = STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NAMESPACE = STRUCTURED_ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__VISIBILITY = STRUCTURED_ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CLIENT_DEPENDENCY = STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IS_LEAF = STRUCTURED_ACTIVITY_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__REDEFINED_ELEMENT = STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__REDEFINITION_CONTEXT = STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__ACTIVITY = STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_INTERRUPTIBLE_REGION = STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_PARTITION = STRUCTURED_ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_STRUCTURED_NODE = STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__INCOMING = STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OUTGOING = STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__REDEFINED_NODE = STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_GROUP = STRUCTURED_ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__HANDLER = STRUCTURED_ACTIVITY_NODE__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CONTEXT = STRUCTURED_ACTIVITY_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__INPUT = STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IS_LOCALLY_REENTRANT = STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__LOCAL_POSTCONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__LOCAL_PRECONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OUTPUT = STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__ELEMENT_IMPORT = STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IMPORTED_MEMBER = STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__MEMBER = STRUCTURED_ACTIVITY_NODE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OWNED_MEMBER = STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__OWNED_RULE = STRUCTURED_ACTIVITY_NODE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__PACKAGE_IMPORT = STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CONTAINED_NODE = STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IN_ACTIVITY = STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__SUBGROUP = STRUCTURED_ACTIVITY_NODE__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__SUPER_GROUP = STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CONTAINED_EDGE = STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__VARIABLE = STRUCTURED_ACTIVITY_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__EDGE = STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__MUST_ISOLATE = STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__STRUCTURED_NODE_INPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__STRUCTURED_NODE_OUTPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NODE = STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__CLAUSE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Assured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IS_ASSURED = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Determinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__IS_DETERMINATE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__RESULT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___ALL_OWNED_ELEMENTS = STRUCTURED_ACTIVITY_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___MUST_BE_OWNED = STRUCTURED_ACTIVITY_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___ALL_NAMESPACES = STRUCTURED_ACTIVITY_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___ALL_OWNING_PACKAGES = STRUCTURED_ACTIVITY_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STRUCTURED_ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___SEPARATOR = STRUCTURED_ACTIVITY_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___CLIENT_DEPENDENCY = STRUCTURED_ACTIVITY_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STRUCTURED_ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STRUCTURED_ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = STRUCTURED_ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___CONTEXT = STRUCTURED_ACTIVITY_NODE___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___ALL_ACTIONS = STRUCTURED_ACTIVITY_NODE___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___ALL_OWNED_NODES = STRUCTURED_ACTIVITY_NODE___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___CONTAINING_BEHAVIOR = STRUCTURED_ACTIVITY_NODE___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___EXCLUDE_COLLISIONS__ELIST = STRUCTURED_ACTIVITY_NODE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = STRUCTURED_ACTIVITY_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___IMPORT_MEMBERS__ELIST = STRUCTURED_ACTIVITY_NODE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___IMPORTED_MEMBER = STRUCTURED_ACTIVITY_NODE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___MEMBERS_ARE_DISTINGUISHABLE = STRUCTURED_ACTIVITY_NODE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___CONTAINING_ACTIVITY = STRUCTURED_ACTIVITY_NODE___CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Source Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___SOURCE_NODES = STRUCTURED_ACTIVITY_NODE___SOURCE_NODES;

	/**
	 * The operation id for the '<em>Target Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE___TARGET_NODES = STRUCTURED_ACTIVITY_NODE___TARGET_NODES;

	/**
	 * The number of operations of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_OPERATION_COUNT = STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.CreateLinkActionImpl <em>Create Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.CreateLinkActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getCreateLinkAction()
	 * @generated
	 */
	int CREATE_LINK_ACTION = 28;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OWNED_COMMENT = WRITE_LINK_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OWNED_ELEMENT = WRITE_LINK_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OWNER = WRITE_LINK_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__NAME = WRITE_LINK_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__NAME_EXPRESSION = WRITE_LINK_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__NAMESPACE = WRITE_LINK_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__QUALIFIED_NAME = WRITE_LINK_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__VISIBILITY = WRITE_LINK_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__CLIENT_DEPENDENCY = WRITE_LINK_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__IS_LEAF = WRITE_LINK_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__REDEFINED_ELEMENT = WRITE_LINK_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__REDEFINITION_CONTEXT = WRITE_LINK_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__ACTIVITY = WRITE_LINK_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION = WRITE_LINK_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__IN_PARTITION = WRITE_LINK_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__IN_STRUCTURED_NODE = WRITE_LINK_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__INCOMING = WRITE_LINK_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OUTGOING = WRITE_LINK_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__REDEFINED_NODE = WRITE_LINK_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__IN_GROUP = WRITE_LINK_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__HANDLER = WRITE_LINK_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__CONTEXT = WRITE_LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__INPUT = WRITE_LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__IS_LOCALLY_REENTRANT = WRITE_LINK_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__LOCAL_POSTCONDITION = WRITE_LINK_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__LOCAL_PRECONDITION = WRITE_LINK_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__OUTPUT = WRITE_LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__END_DATA = WRITE_LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION__INPUT_VALUE = WRITE_LINK_ACTION__INPUT_VALUE;

	/**
	 * The number of structural features of the '<em>Create Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION_FEATURE_COUNT = WRITE_LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___ALL_OWNED_ELEMENTS = WRITE_LINK_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___MUST_BE_OWNED = WRITE_LINK_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___ALL_NAMESPACES = WRITE_LINK_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___ALL_OWNING_PACKAGES = WRITE_LINK_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = WRITE_LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___QUALIFIED_NAME = WRITE_LINK_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___SEPARATOR = WRITE_LINK_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___CLIENT_DEPENDENCY = WRITE_LINK_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = WRITE_LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = WRITE_LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = WRITE_LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___CONTEXT = WRITE_LINK_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___ALL_ACTIONS = WRITE_LINK_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___ALL_OWNED_NODES = WRITE_LINK_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___CONTAINING_BEHAVIOR = WRITE_LINK_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION___ASSOCIATION = WRITE_LINK_ACTION___ASSOCIATION;

	/**
	 * The number of operations of the '<em>Create Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_ACTION_OPERATION_COUNT = WRITE_LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.LinkEndCreationDataImpl <em>Link End Creation Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.LinkEndCreationDataImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getLinkEndCreationData()
	 * @generated
	 */
	int LINK_END_CREATION_DATA = 29;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__OWNED_COMMENT = LINK_END_DATA__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__OWNED_ELEMENT = LINK_END_DATA__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__OWNER = LINK_END_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__END = LINK_END_DATA__END;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__QUALIFIER = LINK_END_DATA__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__VALUE = LINK_END_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Insert At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__INSERT_AT = LINK_END_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA__IS_REPLACE_ALL = LINK_END_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link End Creation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA_FEATURE_COUNT = LINK_END_DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA___ALL_OWNED_ELEMENTS = LINK_END_DATA___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA___MUST_BE_OWNED = LINK_END_DATA___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA___ALL_PINS = LINK_END_DATA___ALL_PINS;

	/**
	 * The number of operations of the '<em>Link End Creation Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_CREATION_DATA_OPERATION_COUNT = LINK_END_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.CreateLinkObjectActionImpl <em>Create Link Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.CreateLinkObjectActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getCreateLinkObjectAction()
	 * @generated
	 */
	int CREATE_LINK_OBJECT_ACTION = 30;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__OWNED_COMMENT = CREATE_LINK_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__OWNED_ELEMENT = CREATE_LINK_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__OWNER = CREATE_LINK_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__NAME = CREATE_LINK_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__NAME_EXPRESSION = CREATE_LINK_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__NAMESPACE = CREATE_LINK_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__QUALIFIED_NAME = CREATE_LINK_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__VISIBILITY = CREATE_LINK_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__CLIENT_DEPENDENCY = CREATE_LINK_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__IS_LEAF = CREATE_LINK_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__REDEFINED_ELEMENT = CREATE_LINK_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__REDEFINITION_CONTEXT = CREATE_LINK_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__ACTIVITY = CREATE_LINK_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION = CREATE_LINK_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__IN_PARTITION = CREATE_LINK_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__IN_STRUCTURED_NODE = CREATE_LINK_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__INCOMING = CREATE_LINK_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__OUTGOING = CREATE_LINK_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__REDEFINED_NODE = CREATE_LINK_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__IN_GROUP = CREATE_LINK_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__HANDLER = CREATE_LINK_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__CONTEXT = CREATE_LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__INPUT = CREATE_LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__IS_LOCALLY_REENTRANT = CREATE_LINK_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__LOCAL_POSTCONDITION = CREATE_LINK_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__LOCAL_PRECONDITION = CREATE_LINK_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__OUTPUT = CREATE_LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__END_DATA = CREATE_LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__INPUT_VALUE = CREATE_LINK_ACTION__INPUT_VALUE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION__RESULT = CREATE_LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Link Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION_FEATURE_COUNT = CREATE_LINK_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___ALL_OWNED_ELEMENTS = CREATE_LINK_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___MUST_BE_OWNED = CREATE_LINK_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___ALL_NAMESPACES = CREATE_LINK_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___ALL_OWNING_PACKAGES = CREATE_LINK_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CREATE_LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___QUALIFIED_NAME = CREATE_LINK_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___SEPARATOR = CREATE_LINK_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___CLIENT_DEPENDENCY = CREATE_LINK_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CREATE_LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CREATE_LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = CREATE_LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___CONTEXT = CREATE_LINK_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___ALL_ACTIONS = CREATE_LINK_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___ALL_OWNED_NODES = CREATE_LINK_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___CONTAINING_BEHAVIOR = CREATE_LINK_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION___ASSOCIATION = CREATE_LINK_ACTION___ASSOCIATION;

	/**
	 * The number of operations of the '<em>Create Link Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_LINK_OBJECT_ACTION_OPERATION_COUNT = CREATE_LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.CreateObjectActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getCreateObjectAction()
	 * @generated
	 */
	int CREATE_OBJECT_ACTION = 31;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__CLASSIFIER = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION__RESULT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Create Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OBJECT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.DestroyLinkActionImpl <em>Destroy Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.DestroyLinkActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getDestroyLinkAction()
	 * @generated
	 */
	int DESTROY_LINK_ACTION = 32;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OWNED_COMMENT = WRITE_LINK_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OWNED_ELEMENT = WRITE_LINK_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OWNER = WRITE_LINK_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__NAME = WRITE_LINK_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__NAME_EXPRESSION = WRITE_LINK_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__NAMESPACE = WRITE_LINK_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__QUALIFIED_NAME = WRITE_LINK_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__VISIBILITY = WRITE_LINK_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__CLIENT_DEPENDENCY = WRITE_LINK_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__IS_LEAF = WRITE_LINK_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__REDEFINED_ELEMENT = WRITE_LINK_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__REDEFINITION_CONTEXT = WRITE_LINK_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__ACTIVITY = WRITE_LINK_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__IN_INTERRUPTIBLE_REGION = WRITE_LINK_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__IN_PARTITION = WRITE_LINK_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__IN_STRUCTURED_NODE = WRITE_LINK_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__INCOMING = WRITE_LINK_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OUTGOING = WRITE_LINK_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__REDEFINED_NODE = WRITE_LINK_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__IN_GROUP = WRITE_LINK_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__HANDLER = WRITE_LINK_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__CONTEXT = WRITE_LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__INPUT = WRITE_LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__IS_LOCALLY_REENTRANT = WRITE_LINK_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__LOCAL_POSTCONDITION = WRITE_LINK_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__LOCAL_PRECONDITION = WRITE_LINK_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__OUTPUT = WRITE_LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__END_DATA = WRITE_LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION__INPUT_VALUE = WRITE_LINK_ACTION__INPUT_VALUE;

	/**
	 * The number of structural features of the '<em>Destroy Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION_FEATURE_COUNT = WRITE_LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___ALL_OWNED_ELEMENTS = WRITE_LINK_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___MUST_BE_OWNED = WRITE_LINK_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___ALL_NAMESPACES = WRITE_LINK_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___ALL_OWNING_PACKAGES = WRITE_LINK_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = WRITE_LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___QUALIFIED_NAME = WRITE_LINK_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___SEPARATOR = WRITE_LINK_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___CLIENT_DEPENDENCY = WRITE_LINK_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = WRITE_LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = WRITE_LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = WRITE_LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___CONTEXT = WRITE_LINK_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___ALL_ACTIONS = WRITE_LINK_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___ALL_OWNED_NODES = WRITE_LINK_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___CONTAINING_BEHAVIOR = WRITE_LINK_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION___ASSOCIATION = WRITE_LINK_ACTION___ASSOCIATION;

	/**
	 * The number of operations of the '<em>Destroy Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_LINK_ACTION_OPERATION_COUNT = WRITE_LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.LinkEndDestructionDataImpl <em>Link End Destruction Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.LinkEndDestructionDataImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getLinkEndDestructionData()
	 * @generated
	 */
	int LINK_END_DESTRUCTION_DATA = 33;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__OWNED_COMMENT = LINK_END_DATA__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__OWNED_ELEMENT = LINK_END_DATA__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__OWNER = LINK_END_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__END = LINK_END_DATA__END;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__QUALIFIER = LINK_END_DATA__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__VALUE = LINK_END_DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Destroy At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__DESTROY_AT = LINK_END_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Destroy Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES = LINK_END_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link End Destruction Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA_FEATURE_COUNT = LINK_END_DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA___ALL_OWNED_ELEMENTS = LINK_END_DATA___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA___MUST_BE_OWNED = LINK_END_DATA___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA___ALL_PINS = LINK_END_DATA___ALL_PINS;

	/**
	 * The number of operations of the '<em>Link End Destruction Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_END_DESTRUCTION_DATA_OPERATION_COUNT = LINK_END_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.DestroyObjectActionImpl <em>Destroy Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.DestroyObjectActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getDestroyObjectAction()
	 * @generated
	 */
	int DESTROY_OBJECT_ACTION = 34;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Destroy Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Destroy Owned Objects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION__TARGET = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Destroy Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Destroy Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_OBJECT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ExpansionNodeImpl <em>Expansion Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ExpansionNodeImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getExpansionNode()
	 * @generated
	 */
	int EXPANSION_NODE = 35;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__OWNED_COMMENT = ActivitiesPackage.OBJECT_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__OWNED_ELEMENT = ActivitiesPackage.OBJECT_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__OWNER = ActivitiesPackage.OBJECT_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__NAME = ActivitiesPackage.OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__NAME_EXPRESSION = ActivitiesPackage.OBJECT_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__NAMESPACE = ActivitiesPackage.OBJECT_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__QUALIFIED_NAME = ActivitiesPackage.OBJECT_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__VISIBILITY = ActivitiesPackage.OBJECT_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__CLIENT_DEPENDENCY = ActivitiesPackage.OBJECT_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IS_LEAF = ActivitiesPackage.OBJECT_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REDEFINED_ELEMENT = ActivitiesPackage.OBJECT_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REDEFINITION_CONTEXT = ActivitiesPackage.OBJECT_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__ACTIVITY = ActivitiesPackage.OBJECT_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_INTERRUPTIBLE_REGION = ActivitiesPackage.OBJECT_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_PARTITION = ActivitiesPackage.OBJECT_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_STRUCTURED_NODE = ActivitiesPackage.OBJECT_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__INCOMING = ActivitiesPackage.OBJECT_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__OUTGOING = ActivitiesPackage.OBJECT_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REDEFINED_NODE = ActivitiesPackage.OBJECT_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_GROUP = ActivitiesPackage.OBJECT_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__TYPE = ActivitiesPackage.OBJECT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IN_STATE = ActivitiesPackage.OBJECT_NODE__IN_STATE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__IS_CONTROL_TYPE = ActivitiesPackage.OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__ORDERING = ActivitiesPackage.OBJECT_NODE__ORDERING;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__SELECTION = ActivitiesPackage.OBJECT_NODE__SELECTION;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__UPPER_BOUND = ActivitiesPackage.OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Region As Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REGION_AS_INPUT = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region As Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE__REGION_AS_OUTPUT = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expansion Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE_FEATURE_COUNT = ActivitiesPackage.OBJECT_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___ALL_OWNED_ELEMENTS = ActivitiesPackage.OBJECT_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___MUST_BE_OWNED = ActivitiesPackage.OBJECT_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___ALL_NAMESPACES = ActivitiesPackage.OBJECT_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___ALL_OWNING_PACKAGES = ActivitiesPackage.OBJECT_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ActivitiesPackage.OBJECT_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___QUALIFIED_NAME = ActivitiesPackage.OBJECT_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___SEPARATOR = ActivitiesPackage.OBJECT_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___CLIENT_DEPENDENCY = ActivitiesPackage.OBJECT_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ActivitiesPackage.OBJECT_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ActivitiesPackage.OBJECT_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = ActivitiesPackage.OBJECT_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The number of operations of the '<em>Expansion Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_NODE_OPERATION_COUNT = ActivitiesPackage.OBJECT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ExpansionRegionImpl <em>Expansion Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ExpansionRegionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getExpansionRegion()
	 * @generated
	 */
	int EXPANSION_REGION = 36;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OWNED_COMMENT = STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OWNED_ELEMENT = STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OWNER = STRUCTURED_ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__NAME = STRUCTURED_ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__NAME_EXPRESSION = STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__NAMESPACE = STRUCTURED_ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__VISIBILITY = STRUCTURED_ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__CLIENT_DEPENDENCY = STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IS_LEAF = STRUCTURED_ACTIVITY_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__REDEFINED_ELEMENT = STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__REDEFINITION_CONTEXT = STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__ACTIVITY = STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_INTERRUPTIBLE_REGION = STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_PARTITION = STRUCTURED_ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_STRUCTURED_NODE = STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__INCOMING = STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OUTGOING = STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__REDEFINED_NODE = STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_GROUP = STRUCTURED_ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__HANDLER = STRUCTURED_ACTIVITY_NODE__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__CONTEXT = STRUCTURED_ACTIVITY_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__INPUT = STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IS_LOCALLY_REENTRANT = STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__LOCAL_POSTCONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__LOCAL_PRECONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OUTPUT = STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__ELEMENT_IMPORT = STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IMPORTED_MEMBER = STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__MEMBER = STRUCTURED_ACTIVITY_NODE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OWNED_MEMBER = STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OWNED_RULE = STRUCTURED_ACTIVITY_NODE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__PACKAGE_IMPORT = STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__CONTAINED_NODE = STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__IN_ACTIVITY = STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__SUBGROUP = STRUCTURED_ACTIVITY_NODE__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__SUPER_GROUP = STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__CONTAINED_EDGE = STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__VARIABLE = STRUCTURED_ACTIVITY_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__EDGE = STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__MUST_ISOLATE = STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__STRUCTURED_NODE_INPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__STRUCTURED_NODE_OUTPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__NODE = STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__MODE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__OUTPUT_ELEMENT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION__INPUT_ELEMENT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expansion Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___ALL_OWNED_ELEMENTS = STRUCTURED_ACTIVITY_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___MUST_BE_OWNED = STRUCTURED_ACTIVITY_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___ALL_NAMESPACES = STRUCTURED_ACTIVITY_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___ALL_OWNING_PACKAGES = STRUCTURED_ACTIVITY_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STRUCTURED_ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___SEPARATOR = STRUCTURED_ACTIVITY_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___CLIENT_DEPENDENCY = STRUCTURED_ACTIVITY_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STRUCTURED_ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STRUCTURED_ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___ACTIVITY_NODE_CONTAINING_ACTIVITY = STRUCTURED_ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___CONTEXT = STRUCTURED_ACTIVITY_NODE___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___ALL_ACTIONS = STRUCTURED_ACTIVITY_NODE___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___ALL_OWNED_NODES = STRUCTURED_ACTIVITY_NODE___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___CONTAINING_BEHAVIOR = STRUCTURED_ACTIVITY_NODE___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___EXCLUDE_COLLISIONS__ELIST = STRUCTURED_ACTIVITY_NODE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___GET_NAMES_OF_MEMBER__NAMEDELEMENT = STRUCTURED_ACTIVITY_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___IMPORT_MEMBERS__ELIST = STRUCTURED_ACTIVITY_NODE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___IMPORTED_MEMBER = STRUCTURED_ACTIVITY_NODE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___MEMBERS_ARE_DISTINGUISHABLE = STRUCTURED_ACTIVITY_NODE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___CONTAINING_ACTIVITY = STRUCTURED_ACTIVITY_NODE___CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Source Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___SOURCE_NODES = STRUCTURED_ACTIVITY_NODE___SOURCE_NODES;

	/**
	 * The operation id for the '<em>Target Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION___TARGET_NODES = STRUCTURED_ACTIVITY_NODE___TARGET_NODES;

	/**
	 * The number of operations of the '<em>Expansion Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPANSION_REGION_OPERATION_COUNT = STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.LoopNodeImpl <em>Loop Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.LoopNodeImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getLoopNode()
	 * @generated
	 */
	int LOOP_NODE = 37;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OWNED_COMMENT = STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OWNED_ELEMENT = STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OWNER = STRUCTURED_ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NAME = STRUCTURED_ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NAME_EXPRESSION = STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NAMESPACE = STRUCTURED_ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__VISIBILITY = STRUCTURED_ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__CLIENT_DEPENDENCY = STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IS_LEAF = STRUCTURED_ACTIVITY_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__REDEFINED_ELEMENT = STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__REDEFINITION_CONTEXT = STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__ACTIVITY = STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_INTERRUPTIBLE_REGION = STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_PARTITION = STRUCTURED_ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_STRUCTURED_NODE = STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__INCOMING = STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OUTGOING = STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__REDEFINED_NODE = STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_GROUP = STRUCTURED_ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__HANDLER = STRUCTURED_ACTIVITY_NODE__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__CONTEXT = STRUCTURED_ACTIVITY_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__INPUT = STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IS_LOCALLY_REENTRANT = STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOCAL_POSTCONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOCAL_PRECONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OUTPUT = STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__ELEMENT_IMPORT = STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IMPORTED_MEMBER = STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__MEMBER = STRUCTURED_ACTIVITY_NODE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OWNED_MEMBER = STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__OWNED_RULE = STRUCTURED_ACTIVITY_NODE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__PACKAGE_IMPORT = STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__CONTAINED_NODE = STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IN_ACTIVITY = STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SUBGROUP = STRUCTURED_ACTIVITY_NODE__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SUPER_GROUP = STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__CONTAINED_EDGE = STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__VARIABLE = STRUCTURED_ACTIVITY_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__EDGE = STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__MUST_ISOLATE = STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__STRUCTURED_NODE_INPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__STRUCTURED_NODE_OUTPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NODE = STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Body Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__BODY_OUTPUT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__BODY_PART = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__DECIDER = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Tested First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__IS_TESTED_FIRST = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Loop Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOOP_VARIABLE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Loop Variable Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__LOOP_VARIABLE_INPUT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__RESULT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Setup Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SETUP_PART = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__TEST = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Loop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___ALL_OWNED_ELEMENTS = STRUCTURED_ACTIVITY_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___MUST_BE_OWNED = STRUCTURED_ACTIVITY_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___ALL_NAMESPACES = STRUCTURED_ACTIVITY_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___ALL_OWNING_PACKAGES = STRUCTURED_ACTIVITY_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STRUCTURED_ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___SEPARATOR = STRUCTURED_ACTIVITY_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___CLIENT_DEPENDENCY = STRUCTURED_ACTIVITY_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STRUCTURED_ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STRUCTURED_ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = STRUCTURED_ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___CONTEXT = STRUCTURED_ACTIVITY_NODE___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___ALL_ACTIONS = STRUCTURED_ACTIVITY_NODE___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___ALL_OWNED_NODES = STRUCTURED_ACTIVITY_NODE___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___CONTAINING_BEHAVIOR = STRUCTURED_ACTIVITY_NODE___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___EXCLUDE_COLLISIONS__ELIST = STRUCTURED_ACTIVITY_NODE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = STRUCTURED_ACTIVITY_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___IMPORT_MEMBERS__ELIST = STRUCTURED_ACTIVITY_NODE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___IMPORTED_MEMBER = STRUCTURED_ACTIVITY_NODE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___MEMBERS_ARE_DISTINGUISHABLE = STRUCTURED_ACTIVITY_NODE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___CONTAINING_ACTIVITY = STRUCTURED_ACTIVITY_NODE___CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Source Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___SOURCE_NODES = STRUCTURED_ACTIVITY_NODE___SOURCE_NODES;

	/**
	 * The operation id for the '<em>Target Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE___TARGET_NODES = STRUCTURED_ACTIVITY_NODE___TARGET_NODES;

	/**
	 * The number of operations of the '<em>Loop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE_OPERATION_COUNT = STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.OpaqueActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getOpaqueAction()
	 * @generated
	 */
	int OPAQUE_ACTION = 38;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__BODY = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__INPUT_VALUE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__LANGUAGE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OUTPUT_VALUE = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.RaiseExceptionActionImpl <em>Raise Exception Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.RaiseExceptionActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getRaiseExceptionAction()
	 * @generated
	 */
	int RAISE_EXCEPTION_ACTION = 39;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION__EXCEPTION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raise Exception Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Raise Exception Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReadExtentActionImpl <em>Read Extent Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReadExtentActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReadExtentAction()
	 * @generated
	 */
	int READ_EXTENT_ACTION = 40;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__CLASSIFIER = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION__RESULT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Read Extent Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Read Extent Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_EXTENT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReadIsClassifiedObjectActionImpl <em>Read Is Classified Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReadIsClassifiedObjectActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReadIsClassifiedObjectAction()
	 * @generated
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION = 41;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Direct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Read Is Classified Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Read Is Classified Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_IS_CLASSIFIED_OBJECT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReadLinkActionImpl <em>Read Link Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReadLinkActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReadLinkAction()
	 * @generated
	 */
	int READ_LINK_ACTION = 42;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OWNED_COMMENT = LINK_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OWNED_ELEMENT = LINK_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OWNER = LINK_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__NAME = LINK_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__NAME_EXPRESSION = LINK_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__NAMESPACE = LINK_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__QUALIFIED_NAME = LINK_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__VISIBILITY = LINK_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__CLIENT_DEPENDENCY = LINK_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__IS_LEAF = LINK_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__REDEFINED_ELEMENT = LINK_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__REDEFINITION_CONTEXT = LINK_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__ACTIVITY = LINK_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__IN_INTERRUPTIBLE_REGION = LINK_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__IN_PARTITION = LINK_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__IN_STRUCTURED_NODE = LINK_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__INCOMING = LINK_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OUTGOING = LINK_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__REDEFINED_NODE = LINK_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__IN_GROUP = LINK_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__HANDLER = LINK_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__CONTEXT = LINK_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__INPUT = LINK_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__IS_LOCALLY_REENTRANT = LINK_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__LOCAL_POSTCONDITION = LINK_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__LOCAL_PRECONDITION = LINK_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__OUTPUT = LINK_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>End Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__END_DATA = LINK_ACTION__END_DATA;

	/**
	 * The feature id for the '<em><b>Input Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__INPUT_VALUE = LINK_ACTION__INPUT_VALUE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION__RESULT = LINK_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION_FEATURE_COUNT = LINK_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___ALL_OWNED_ELEMENTS = LINK_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___MUST_BE_OWNED = LINK_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___ALL_NAMESPACES = LINK_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___ALL_OWNING_PACKAGES = LINK_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = LINK_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___QUALIFIED_NAME = LINK_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___SEPARATOR = LINK_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___CLIENT_DEPENDENCY = LINK_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = LINK_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = LINK_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = LINK_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___CONTEXT = LINK_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___ALL_ACTIONS = LINK_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___ALL_OWNED_NODES = LINK_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___CONTAINING_BEHAVIOR = LINK_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___ASSOCIATION = LINK_ACTION___ASSOCIATION;

	/**
	 * The operation id for the '<em>Open End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION___OPEN_END = LINK_ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Link Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_ACTION_OPERATION_COUNT = LINK_ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReadLinkObjectEndActionImpl <em>Read Link Object End Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReadLinkObjectEndActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReadLinkObjectEndAction()
	 * @generated
	 */
	int READ_LINK_OBJECT_END_ACTION = 43;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__END = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__OBJECT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION__RESULT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Read Link Object End Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Read Link Object End Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReadLinkObjectEndQualifierActionImpl <em>Read Link Object End Qualifier Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReadLinkObjectEndQualifierActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReadLinkObjectEndQualifierAction()
	 * @generated
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION = 44;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Read Link Object End Qualifier Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Read Link Object End Qualifier Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINK_OBJECT_END_QUALIFIER_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReadSelfActionImpl <em>Read Self Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReadSelfActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReadSelfAction()
	 * @generated
	 */
	int READ_SELF_ACTION = 45;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION__RESULT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Self Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Read Self Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SELF_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReadStructuralFeatureActionImpl <em>Read Structural Feature Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReadStructuralFeatureActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReadStructuralFeatureAction()
	 * @generated
	 */
	int READ_STRUCTURAL_FEATURE_ACTION = 46;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT = STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT = STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OWNER = STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__NAME = STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION = STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__NAMESPACE = STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME = STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__VISIBILITY = STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY = STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__IS_LEAF = STRUCTURAL_FEATURE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT = STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT = STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__ACTIVITY = STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION = STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__IN_PARTITION = STRUCTURAL_FEATURE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE = STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__INCOMING = STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OUTGOING = STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE = STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__IN_GROUP = STRUCTURAL_FEATURE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__HANDLER = STRUCTURAL_FEATURE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__CONTEXT = STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__INPUT = STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__IS_LOCALLY_REENTRANT = STRUCTURAL_FEATURE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION = STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION = STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OUTPUT = STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__OBJECT = STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION__RESULT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT = STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_ELEMENTS = STRUCTURAL_FEATURE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___MUST_BE_OWNED = STRUCTURAL_FEATURE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___ALL_NAMESPACES = STRUCTURAL_FEATURE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___ALL_OWNING_PACKAGES = STRUCTURAL_FEATURE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STRUCTURAL_FEATURE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___QUALIFIED_NAME = STRUCTURAL_FEATURE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___SEPARATOR = STRUCTURAL_FEATURE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___CLIENT_DEPENDENCY = STRUCTURAL_FEATURE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STRUCTURAL_FEATURE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STRUCTURAL_FEATURE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = STRUCTURAL_FEATURE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___CONTEXT = STRUCTURAL_FEATURE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___ALL_ACTIONS = STRUCTURAL_FEATURE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_NODES = STRUCTURAL_FEATURE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION___CONTAINING_BEHAVIOR = STRUCTURAL_FEATURE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Read Structural Feature Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT = STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReadVariableActionImpl <em>Read Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReadVariableActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReadVariableAction()
	 * @generated
	 */
	int READ_VARIABLE_ACTION = 47;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__OWNED_COMMENT = VARIABLE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__OWNED_ELEMENT = VARIABLE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__OWNER = VARIABLE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__NAME = VARIABLE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__NAME_EXPRESSION = VARIABLE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__NAMESPACE = VARIABLE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__QUALIFIED_NAME = VARIABLE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__VISIBILITY = VARIABLE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__CLIENT_DEPENDENCY = VARIABLE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__IS_LEAF = VARIABLE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__REDEFINED_ELEMENT = VARIABLE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__REDEFINITION_CONTEXT = VARIABLE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__ACTIVITY = VARIABLE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION = VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__IN_PARTITION = VARIABLE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__IN_STRUCTURED_NODE = VARIABLE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__INCOMING = VARIABLE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__OUTGOING = VARIABLE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__REDEFINED_NODE = VARIABLE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__IN_GROUP = VARIABLE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__HANDLER = VARIABLE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__CONTEXT = VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__INPUT = VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__IS_LOCALLY_REENTRANT = VARIABLE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__LOCAL_POSTCONDITION = VARIABLE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__LOCAL_PRECONDITION = VARIABLE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__OUTPUT = VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__VARIABLE = VARIABLE_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION__RESULT = VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION_FEATURE_COUNT = VARIABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___ALL_OWNED_ELEMENTS = VARIABLE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___MUST_BE_OWNED = VARIABLE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___ALL_NAMESPACES = VARIABLE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___ALL_OWNING_PACKAGES = VARIABLE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VARIABLE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___QUALIFIED_NAME = VARIABLE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___SEPARATOR = VARIABLE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___CLIENT_DEPENDENCY = VARIABLE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = VARIABLE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = VARIABLE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = VARIABLE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___CONTEXT = VARIABLE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___ALL_ACTIONS = VARIABLE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___ALL_OWNED_NODES = VARIABLE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION___CONTAINING_BEHAVIOR = VARIABLE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Read Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_VARIABLE_ACTION_OPERATION_COUNT = VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReclassifyObjectActionImpl <em>Reclassify Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReclassifyObjectActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReclassifyObjectAction()
	 * @generated
	 */
	int RECLASSIFY_OBJECT_ACTION = 48;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Replace All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OBJECT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Old Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reclassify Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Reclassify Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECLASSIFY_OBJECT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReduceActionImpl <em>Reduce Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReduceActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReduceAction()
	 * @generated
	 */
	int REDUCE_ACTION = 49;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__COLLECTION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__IS_ORDERED = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reducer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__REDUCER = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION__RESULT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reduce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Reduce Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.RemoveStructuralFeatureValueActionImpl <em>Remove Structural Feature Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.RemoveStructuralFeatureValueActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getRemoveStructuralFeatureValueAction()
	 * @generated
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION = 50;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_COMMENT = WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNED_ELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OWNER = WRITE_STRUCTURAL_FEATURE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME = WRITE_STRUCTURAL_FEATURE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAME_EXPRESSION = WRITE_STRUCTURAL_FEATURE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__NAMESPACE = WRITE_STRUCTURAL_FEATURE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__QUALIFIED_NAME = WRITE_STRUCTURAL_FEATURE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VISIBILITY = WRITE_STRUCTURAL_FEATURE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CLIENT_DEPENDENCY = WRITE_STRUCTURAL_FEATURE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LEAF = WRITE_STRUCTURAL_FEATURE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_ELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINITION_CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__ACTIVITY = WRITE_STRUCTURAL_FEATURE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION = WRITE_STRUCTURAL_FEATURE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_PARTITION = WRITE_STRUCTURAL_FEATURE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_STRUCTURED_NODE = WRITE_STRUCTURAL_FEATURE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INCOMING = WRITE_STRUCTURAL_FEATURE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTGOING = WRITE_STRUCTURAL_FEATURE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REDEFINED_NODE = WRITE_STRUCTURAL_FEATURE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IN_GROUP = WRITE_STRUCTURAL_FEATURE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__HANDLER = WRITE_STRUCTURAL_FEATURE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__INPUT = WRITE_STRUCTURAL_FEATURE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_LOCALLY_REENTRANT = WRITE_STRUCTURAL_FEATURE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_POSTCONDITION = WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__LOCAL_PRECONDITION = WRITE_STRUCTURAL_FEATURE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OUTPUT = WRITE_STRUCTURAL_FEATURE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__OBJECT = WRITE_STRUCTURAL_FEATURE_ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__STRUCTURAL_FEATURE = WRITE_STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__RESULT = WRITE_STRUCTURAL_FEATURE_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__VALUE = WRITE_STRUCTURAL_FEATURE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Is Remove Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_FEATURE_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_OWNED_ELEMENTS = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___MUST_BE_OWNED = WRITE_STRUCTURAL_FEATURE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_NAMESPACES = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_OWNING_PACKAGES = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = WRITE_STRUCTURAL_FEATURE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___QUALIFIED_NAME = WRITE_STRUCTURAL_FEATURE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___SEPARATOR = WRITE_STRUCTURAL_FEATURE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___CLIENT_DEPENDENCY = WRITE_STRUCTURAL_FEATURE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = WRITE_STRUCTURAL_FEATURE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = WRITE_STRUCTURAL_FEATURE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___CONTEXT = WRITE_STRUCTURAL_FEATURE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_ACTIONS = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___ALL_OWNED_NODES = WRITE_STRUCTURAL_FEATURE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___CONTAINING_BEHAVIOR = WRITE_STRUCTURAL_FEATURE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Remove Structural Feature Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION_OPERATION_COUNT = WRITE_STRUCTURAL_FEATURE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.RemoveVariableValueActionImpl <em>Remove Variable Value Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.RemoveVariableValueActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getRemoveVariableValueAction()
	 * @generated
	 */
	int REMOVE_VARIABLE_VALUE_ACTION = 51;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__OWNED_COMMENT = WRITE_VARIABLE_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__OWNED_ELEMENT = WRITE_VARIABLE_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__OWNER = WRITE_VARIABLE_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__NAME = WRITE_VARIABLE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__NAME_EXPRESSION = WRITE_VARIABLE_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__NAMESPACE = WRITE_VARIABLE_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__QUALIFIED_NAME = WRITE_VARIABLE_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__VISIBILITY = WRITE_VARIABLE_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__CLIENT_DEPENDENCY = WRITE_VARIABLE_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__IS_LEAF = WRITE_VARIABLE_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_ELEMENT = WRITE_VARIABLE_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__REDEFINITION_CONTEXT = WRITE_VARIABLE_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__ACTIVITY = WRITE_VARIABLE_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__IN_INTERRUPTIBLE_REGION = WRITE_VARIABLE_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__IN_PARTITION = WRITE_VARIABLE_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__IN_STRUCTURED_NODE = WRITE_VARIABLE_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__INCOMING = WRITE_VARIABLE_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__OUTGOING = WRITE_VARIABLE_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__REDEFINED_NODE = WRITE_VARIABLE_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__IN_GROUP = WRITE_VARIABLE_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__HANDLER = WRITE_VARIABLE_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__CONTEXT = WRITE_VARIABLE_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__INPUT = WRITE_VARIABLE_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__IS_LOCALLY_REENTRANT = WRITE_VARIABLE_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__LOCAL_POSTCONDITION = WRITE_VARIABLE_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__LOCAL_PRECONDITION = WRITE_VARIABLE_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__OUTPUT = WRITE_VARIABLE_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__VARIABLE = WRITE_VARIABLE_ACTION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__VALUE = WRITE_VARIABLE_ACTION__VALUE;

	/**
	 * The feature id for the '<em><b>Is Remove Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remove At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Variable Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION_FEATURE_COUNT = WRITE_VARIABLE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___ALL_OWNED_ELEMENTS = WRITE_VARIABLE_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___MUST_BE_OWNED = WRITE_VARIABLE_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___ALL_NAMESPACES = WRITE_VARIABLE_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___ALL_OWNING_PACKAGES = WRITE_VARIABLE_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = WRITE_VARIABLE_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___QUALIFIED_NAME = WRITE_VARIABLE_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___SEPARATOR = WRITE_VARIABLE_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___CLIENT_DEPENDENCY = WRITE_VARIABLE_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = WRITE_VARIABLE_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = WRITE_VARIABLE_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = WRITE_VARIABLE_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___CONTEXT = WRITE_VARIABLE_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___ALL_ACTIONS = WRITE_VARIABLE_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___ALL_OWNED_NODES = WRITE_VARIABLE_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION___CONTAINING_BEHAVIOR = WRITE_VARIABLE_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Remove Variable Value Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_VARIABLE_VALUE_ACTION_OPERATION_COUNT = WRITE_VARIABLE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ReplyActionImpl <em>Reply Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ReplyActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getReplyAction()
	 * @generated
	 */
	int REPLY_ACTION = 52;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Reply To Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__REPLY_TO_CALL = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reply Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__REPLY_VALUE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION__RETURN_INFORMATION = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reply Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Reply Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.SendObjectActionImpl <em>Send Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.SendObjectActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getSendObjectAction()
	 * @generated
	 */
	int SEND_OBJECT_ACTION = 53;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__OWNED_COMMENT = INVOCATION_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__OWNED_ELEMENT = INVOCATION_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__OWNER = INVOCATION_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__NAME = INVOCATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__NAME_EXPRESSION = INVOCATION_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__NAMESPACE = INVOCATION_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__QUALIFIED_NAME = INVOCATION_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__VISIBILITY = INVOCATION_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__CLIENT_DEPENDENCY = INVOCATION_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__IS_LEAF = INVOCATION_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__REDEFINED_ELEMENT = INVOCATION_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__REDEFINITION_CONTEXT = INVOCATION_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__ACTIVITY = INVOCATION_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__IN_INTERRUPTIBLE_REGION = INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__IN_PARTITION = INVOCATION_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__IN_STRUCTURED_NODE = INVOCATION_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__INCOMING = INVOCATION_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__OUTGOING = INVOCATION_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__REDEFINED_NODE = INVOCATION_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__IN_GROUP = INVOCATION_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__HANDLER = INVOCATION_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__CONTEXT = INVOCATION_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__INPUT = INVOCATION_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__IS_LOCALLY_REENTRANT = INVOCATION_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__LOCAL_POSTCONDITION = INVOCATION_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__LOCAL_PRECONDITION = INVOCATION_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__OUTPUT = INVOCATION_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__ARGUMENT = INVOCATION_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__ON_PORT = INVOCATION_ACTION__ON_PORT;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__REQUEST = INVOCATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION__TARGET = INVOCATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION_FEATURE_COUNT = INVOCATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___ALL_OWNED_ELEMENTS = INVOCATION_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___MUST_BE_OWNED = INVOCATION_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___ALL_NAMESPACES = INVOCATION_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___ALL_OWNING_PACKAGES = INVOCATION_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INVOCATION_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___QUALIFIED_NAME = INVOCATION_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___SEPARATOR = INVOCATION_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___CLIENT_DEPENDENCY = INVOCATION_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = INVOCATION_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = INVOCATION_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = INVOCATION_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___CONTEXT = INVOCATION_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___ALL_ACTIONS = INVOCATION_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___ALL_OWNED_NODES = INVOCATION_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION___CONTAINING_BEHAVIOR = INVOCATION_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Send Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_OBJECT_ACTION_OPERATION_COUNT = INVOCATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.SendSignalActionImpl <em>Send Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.SendSignalActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getSendSignalAction()
	 * @generated
	 */
	int SEND_SIGNAL_ACTION = 54;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OWNED_COMMENT = INVOCATION_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OWNED_ELEMENT = INVOCATION_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OWNER = INVOCATION_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__NAME = INVOCATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__NAME_EXPRESSION = INVOCATION_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__NAMESPACE = INVOCATION_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__QUALIFIED_NAME = INVOCATION_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__VISIBILITY = INVOCATION_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__CLIENT_DEPENDENCY = INVOCATION_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IS_LEAF = INVOCATION_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__REDEFINED_ELEMENT = INVOCATION_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__REDEFINITION_CONTEXT = INVOCATION_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__ACTIVITY = INVOCATION_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION = INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IN_PARTITION = INVOCATION_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE = INVOCATION_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__INCOMING = INVOCATION_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OUTGOING = INVOCATION_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__REDEFINED_NODE = INVOCATION_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IN_GROUP = INVOCATION_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__HANDLER = INVOCATION_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__CONTEXT = INVOCATION_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__INPUT = INVOCATION_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IS_LOCALLY_REENTRANT = INVOCATION_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION = INVOCATION_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__LOCAL_PRECONDITION = INVOCATION_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OUTPUT = INVOCATION_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__ARGUMENT = INVOCATION_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__ON_PORT = INVOCATION_ACTION__ON_PORT;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__SIGNAL = INVOCATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__TARGET = INVOCATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION_FEATURE_COUNT = INVOCATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___ALL_OWNED_ELEMENTS = INVOCATION_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___MUST_BE_OWNED = INVOCATION_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___ALL_NAMESPACES = INVOCATION_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___ALL_OWNING_PACKAGES = INVOCATION_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INVOCATION_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___QUALIFIED_NAME = INVOCATION_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___SEPARATOR = INVOCATION_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___CLIENT_DEPENDENCY = INVOCATION_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = INVOCATION_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = INVOCATION_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = INVOCATION_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___CONTEXT = INVOCATION_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___ALL_ACTIONS = INVOCATION_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___ALL_OWNED_NODES = INVOCATION_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION___CONTAINING_BEHAVIOR = INVOCATION_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Send Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION_OPERATION_COUNT = INVOCATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.SequenceNodeImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getSequenceNode()
	 * @generated
	 */
	int SEQUENCE_NODE = 55;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__OWNED_COMMENT = STRUCTURED_ACTIVITY_NODE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__OWNED_ELEMENT = STRUCTURED_ACTIVITY_NODE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__OWNER = STRUCTURED_ACTIVITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__NAME = STRUCTURED_ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__NAME_EXPRESSION = STRUCTURED_ACTIVITY_NODE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__NAMESPACE = STRUCTURED_ACTIVITY_NODE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__VISIBILITY = STRUCTURED_ACTIVITY_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CLIENT_DEPENDENCY = STRUCTURED_ACTIVITY_NODE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IS_LEAF = STRUCTURED_ACTIVITY_NODE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__REDEFINED_ELEMENT = STRUCTURED_ACTIVITY_NODE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__REDEFINITION_CONTEXT = STRUCTURED_ACTIVITY_NODE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__ACTIVITY = STRUCTURED_ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_INTERRUPTIBLE_REGION = STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_PARTITION = STRUCTURED_ACTIVITY_NODE__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_STRUCTURED_NODE = STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__INCOMING = STRUCTURED_ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__OUTGOING = STRUCTURED_ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__REDEFINED_NODE = STRUCTURED_ACTIVITY_NODE__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_GROUP = STRUCTURED_ACTIVITY_NODE__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__HANDLER = STRUCTURED_ACTIVITY_NODE__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CONTEXT = STRUCTURED_ACTIVITY_NODE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__INPUT = STRUCTURED_ACTIVITY_NODE__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IS_LOCALLY_REENTRANT = STRUCTURED_ACTIVITY_NODE__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__LOCAL_POSTCONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__LOCAL_PRECONDITION = STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__OUTPUT = STRUCTURED_ACTIVITY_NODE__OUTPUT;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__ELEMENT_IMPORT = STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IMPORTED_MEMBER = STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__MEMBER = STRUCTURED_ACTIVITY_NODE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__OWNED_MEMBER = STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__OWNED_RULE = STRUCTURED_ACTIVITY_NODE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__PACKAGE_IMPORT = STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Contained Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CONTAINED_NODE = STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;

	/**
	 * The feature id for the '<em><b>In Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__IN_ACTIVITY = STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__SUBGROUP = STRUCTURED_ACTIVITY_NODE__SUBGROUP;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__SUPER_GROUP = STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>Contained Edge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CONTAINED_EDGE = STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__VARIABLE = STRUCTURED_ACTIVITY_NODE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__EDGE = STRUCTURED_ACTIVITY_NODE__EDGE;

	/**
	 * The feature id for the '<em><b>Must Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__MUST_ISOLATE = STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE;

	/**
	 * The feature id for the '<em><b>Structured Node Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__STRUCTURED_NODE_INPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT;

	/**
	 * The feature id for the '<em><b>Structured Node Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__STRUCTURED_NODE_OUTPUT = STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__NODE = STRUCTURED_ACTIVITY_NODE__NODE;

	/**
	 * The feature id for the '<em><b>Executable Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__EXECUTABLE_NODE = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_FEATURE_COUNT = STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___ALL_OWNED_ELEMENTS = STRUCTURED_ACTIVITY_NODE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___MUST_BE_OWNED = STRUCTURED_ACTIVITY_NODE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___ALL_NAMESPACES = STRUCTURED_ACTIVITY_NODE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___ALL_OWNING_PACKAGES = STRUCTURED_ACTIVITY_NODE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STRUCTURED_ACTIVITY_NODE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___QUALIFIED_NAME = STRUCTURED_ACTIVITY_NODE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___SEPARATOR = STRUCTURED_ACTIVITY_NODE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___CLIENT_DEPENDENCY = STRUCTURED_ACTIVITY_NODE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STRUCTURED_ACTIVITY_NODE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STRUCTURED_ACTIVITY_NODE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY = STRUCTURED_ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___CONTEXT = STRUCTURED_ACTIVITY_NODE___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___ALL_ACTIONS = STRUCTURED_ACTIVITY_NODE___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___ALL_OWNED_NODES = STRUCTURED_ACTIVITY_NODE___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___CONTAINING_BEHAVIOR = STRUCTURED_ACTIVITY_NODE___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___EXCLUDE_COLLISIONS__ELIST = STRUCTURED_ACTIVITY_NODE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = STRUCTURED_ACTIVITY_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___IMPORT_MEMBERS__ELIST = STRUCTURED_ACTIVITY_NODE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___IMPORTED_MEMBER = STRUCTURED_ACTIVITY_NODE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___MEMBERS_ARE_DISTINGUISHABLE = STRUCTURED_ACTIVITY_NODE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___CONTAINING_ACTIVITY = STRUCTURED_ACTIVITY_NODE___CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Source Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___SOURCE_NODES = STRUCTURED_ACTIVITY_NODE___SOURCE_NODES;

	/**
	 * The operation id for the '<em>Target Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE___TARGET_NODES = STRUCTURED_ACTIVITY_NODE___TARGET_NODES;

	/**
	 * The number of operations of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_OPERATION_COUNT = STRUCTURED_ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.StartClassifierBehaviorActionImpl <em>Start Classifier Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.StartClassifierBehaviorActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getStartClassifierBehaviorAction()
	 * @generated
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION = 56;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Classifier Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Start Classifier Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CLASSIFIER_BEHAVIOR_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.StartObjectBehaviorActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getStartObjectBehaviorAction()
	 * @generated
	 */
	int START_OBJECT_BEHAVIOR_ACTION = 57;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OWNED_COMMENT = CALL_ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OWNED_ELEMENT = CALL_ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OWNER = CALL_ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__NAME_EXPRESSION = CALL_ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__NAMESPACE = CALL_ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__QUALIFIED_NAME = CALL_ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__VISIBILITY = CALL_ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__CLIENT_DEPENDENCY = CALL_ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__IS_LEAF = CALL_ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__REDEFINED_ELEMENT = CALL_ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__REDEFINITION_CONTEXT = CALL_ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__ACTIVITY = CALL_ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION = CALL_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__IN_PARTITION = CALL_ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__IN_STRUCTURED_NODE = CALL_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__INCOMING = CALL_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OUTGOING = CALL_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__REDEFINED_NODE = CALL_ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__IN_GROUP = CALL_ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__HANDLER = CALL_ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__CONTEXT = CALL_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__INPUT = CALL_ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__IS_LOCALLY_REENTRANT = CALL_ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__LOCAL_POSTCONDITION = CALL_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__LOCAL_PRECONDITION = CALL_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OUTPUT = CALL_ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__ARGUMENT = CALL_ACTION__ARGUMENT;

	/**
	 * The feature id for the '<em><b>On Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__ON_PORT = CALL_ACTION__ON_PORT;

	/**
	 * The feature id for the '<em><b>Is Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__IS_SYNCHRONOUS = CALL_ACTION__IS_SYNCHRONOUS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__RESULT = CALL_ACTION__RESULT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OBJECT = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Object Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___ALL_OWNED_ELEMENTS = CALL_ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___MUST_BE_OWNED = CALL_ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___ALL_NAMESPACES = CALL_ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___ALL_OWNING_PACKAGES = CALL_ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CALL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___QUALIFIED_NAME = CALL_ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___SEPARATOR = CALL_ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___CLIENT_DEPENDENCY = CALL_ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CALL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CALL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = CALL_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___CONTEXT = CALL_ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___ALL_ACTIONS = CALL_ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___ALL_OWNED_NODES = CALL_ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___CONTAINING_BEHAVIOR = CALL_ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___INPUT_PARAMETERS = CALL_ACTION___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___OUTPUT_PARAMETERS = CALL_ACTION___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION___BEHAVIOR = CALL_ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Object Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION_OPERATION_COUNT = CALL_ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.actions.impl.TestIdentityActionImpl <em>Test Identity Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.TestIdentityActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getTestIdentityAction()
	 * @generated
	 */
	int TEST_IDENTITY_ACTION = 58;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__FIRST = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__RESULT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION__SECOND = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test Identity Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Test Identity Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_IDENTITY_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.UnmarshallActionImpl <em>Unmarshall Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.UnmarshallActionImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getUnmarshallAction()
	 * @generated
	 */
	int UNMARSHALL_ACTION = 59;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__OWNED_COMMENT = ACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__OWNED_ELEMENT = ACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__OWNER = ACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__NAME_EXPRESSION = ACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__NAMESPACE = ACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__QUALIFIED_NAME = ACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__VISIBILITY = ACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__CLIENT_DEPENDENCY = ACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__IS_LEAF = ACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__REDEFINED_ELEMENT = ACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__REDEFINITION_CONTEXT = ACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__IN_INTERRUPTIBLE_REGION = ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__IN_PARTITION = ACTION__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__IN_STRUCTURED_NODE = ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__REDEFINED_NODE = ACTION__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__IN_GROUP = ACTION__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__HANDLER = ACTION__HANDLER;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__CONTEXT = ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__INPUT = ACTION__INPUT;

	/**
	 * The feature id for the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__IS_LOCALLY_REENTRANT = ACTION__IS_LOCALLY_REENTRANT;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__LOCAL_POSTCONDITION = ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__LOCAL_PRECONDITION = ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__OUTPUT = ACTION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__OBJECT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__RESULT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unmarshall Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION__UNMARSHALL_TYPE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unmarshall Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___ALL_OWNED_ELEMENTS = ACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___MUST_BE_OWNED = ACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___ALL_NAMESPACES = ACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___ALL_OWNING_PACKAGES = ACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___QUALIFIED_NAME = ACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___SEPARATOR = ACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___CLIENT_DEPENDENCY = ACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = ACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = ACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY = ACTION___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___CONTEXT = ACTION___CONTEXT;

	/**
	 * The operation id for the '<em>All Actions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___ALL_ACTIONS = ACTION___ALL_ACTIONS;

	/**
	 * The operation id for the '<em>All Owned Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___ALL_OWNED_NODES = ACTION___ALL_OWNED_NODES;

	/**
	 * The operation id for the '<em>Containing Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION___CONTAINING_BEHAVIOR = ACTION___CONTAINING_BEHAVIOR;

	/**
	 * The number of operations of the '<em>Unmarshall Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMARSHALL_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.impl.ValuePinImpl <em>Value Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.impl.ValuePinImpl
	 * @see uml.actions.impl.ActionsPackageImpl#getValuePin()
	 * @generated
	 */
	int VALUE_PIN = 60;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__OWNED_COMMENT = INPUT_PIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__OWNED_ELEMENT = INPUT_PIN__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__OWNER = INPUT_PIN__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__NAME = INPUT_PIN__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__NAME_EXPRESSION = INPUT_PIN__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__NAMESPACE = INPUT_PIN__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__QUALIFIED_NAME = INPUT_PIN__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__VISIBILITY = INPUT_PIN__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__CLIENT_DEPENDENCY = INPUT_PIN__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IS_LEAF = INPUT_PIN__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__REDEFINED_ELEMENT = INPUT_PIN__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__REDEFINITION_CONTEXT = INPUT_PIN__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__ACTIVITY = INPUT_PIN__ACTIVITY;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IN_INTERRUPTIBLE_REGION = INPUT_PIN__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IN_PARTITION = INPUT_PIN__IN_PARTITION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IN_STRUCTURED_NODE = INPUT_PIN__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__INCOMING = INPUT_PIN__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__OUTGOING = INPUT_PIN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Redefined Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__REDEFINED_NODE = INPUT_PIN__REDEFINED_NODE;

	/**
	 * The feature id for the '<em><b>In Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IN_GROUP = INPUT_PIN__IN_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__TYPE = INPUT_PIN__TYPE;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IN_STATE = INPUT_PIN__IN_STATE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IS_CONTROL_TYPE = INPUT_PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__ORDERING = INPUT_PIN__ORDERING;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__SELECTION = INPUT_PIN__SELECTION;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__UPPER_BOUND = INPUT_PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IS_ORDERED = INPUT_PIN__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IS_UNIQUE = INPUT_PIN__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__LOWER = INPUT_PIN__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__LOWER_VALUE = INPUT_PIN__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__UPPER = INPUT_PIN__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__UPPER_VALUE = INPUT_PIN__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IS_CONTROL = INPUT_PIN__IS_CONTROL;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__VALUE = INPUT_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN_FEATURE_COUNT = INPUT_PIN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___ALL_OWNED_ELEMENTS = INPUT_PIN___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___MUST_BE_OWNED = INPUT_PIN___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___ALL_NAMESPACES = INPUT_PIN___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___ALL_OWNING_PACKAGES = INPUT_PIN___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INPUT_PIN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___QUALIFIED_NAME = INPUT_PIN___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___SEPARATOR = INPUT_PIN___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___CLIENT_DEPENDENCY = INPUT_PIN___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = INPUT_PIN___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = INPUT_PIN___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Activity Node containing Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___ACTIVITY_NODE_CONTAINING_ACTIVITY = INPUT_PIN___ACTIVITY_NODE_CONTAINING_ACTIVITY;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT = INPUT_PIN___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = INPUT_PIN___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___IS__INT_INT = INPUT_PIN___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___IS_MULTIVALUED = INPUT_PIN___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___LOWER = INPUT_PIN___LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___LOWER_BOUND = INPUT_PIN___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___UPPER = INPUT_PIN___UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN___UPPER_BOUND = INPUT_PIN___UPPER_BOUND;

	/**
	 * The number of operations of the '<em>Value Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN_OPERATION_COUNT = INPUT_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.actions.ExpansionKind <em>Expansion Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.actions.ExpansionKind
	 * @see uml.actions.impl.ActionsPackageImpl#getExpansionKind()
	 * @generated
	 */
	int EXPANSION_KIND = 62;


	/**
	 * Returns the meta object for class '{@link uml.actions.ValueSpecificationAction <em>Value Specification Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification Action</em>'.
	 * @see uml.actions.ValueSpecificationAction
	 * @generated
	 */
	EClass getValueSpecificationAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ValueSpecificationAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ValueSpecificationAction#getResult()
	 * @see #getValueSpecificationAction()
	 * @generated
	 */
	EReference getValueSpecificationAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ValueSpecificationAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see uml.actions.ValueSpecificationAction#getValue()
	 * @see #getValueSpecificationAction()
	 * @generated
	 */
	EReference getValueSpecificationAction_Value();

	/**
	 * Returns the meta object for class '{@link uml.actions.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see uml.actions.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.Action#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see uml.actions.Action#getContext()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Context();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.Action#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see uml.actions.Action#getInput()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Input();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.Action#isIsLocallyReentrant <em>Is Locally Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Locally Reentrant</em>'.
	 * @see uml.actions.Action#isIsLocallyReentrant()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_IsLocallyReentrant();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.Action#getLocalPostcondition <em>Local Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Postcondition</em>'.
	 * @see uml.actions.Action#getLocalPostcondition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_LocalPostcondition();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.Action#getLocalPrecondition <em>Local Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Precondition</em>'.
	 * @see uml.actions.Action#getLocalPrecondition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_LocalPrecondition();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.Action#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see uml.actions.Action#getOutput()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Output();

	/**
	 * Returns the meta object for the '{@link uml.actions.Action#context() <em>Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context</em>' operation.
	 * @see uml.actions.Action#context()
	 * @generated
	 */
	EOperation getAction__Context();

	/**
	 * Returns the meta object for the '{@link uml.actions.Action#allActions() <em>All Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Actions</em>' operation.
	 * @see uml.actions.Action#allActions()
	 * @generated
	 */
	EOperation getAction__AllActions();

	/**
	 * Returns the meta object for the '{@link uml.actions.Action#allOwnedNodes() <em>All Owned Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Owned Nodes</em>' operation.
	 * @see uml.actions.Action#allOwnedNodes()
	 * @generated
	 */
	EOperation getAction__AllOwnedNodes();

	/**
	 * Returns the meta object for the '{@link uml.actions.Action#containingBehavior() <em>Containing Behavior</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Containing Behavior</em>' operation.
	 * @see uml.actions.Action#containingBehavior()
	 * @generated
	 */
	EOperation getAction__ContainingBehavior();

	/**
	 * Returns the meta object for class '{@link uml.actions.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pin</em>'.
	 * @see uml.actions.InputPin
	 * @generated
	 */
	EClass getInputPin();

	/**
	 * Returns the meta object for class '{@link uml.actions.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see uml.actions.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.Pin#isIsControl <em>Is Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Control</em>'.
	 * @see uml.actions.Pin#isIsControl()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_IsControl();

	/**
	 * Returns the meta object for class '{@link uml.actions.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin</em>'.
	 * @see uml.actions.OutputPin
	 * @generated
	 */
	EClass getOutputPin();

	/**
	 * Returns the meta object for class '{@link uml.actions.VariableAction <em>Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Action</em>'.
	 * @see uml.actions.VariableAction
	 * @generated
	 */
	EClass getVariableAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.VariableAction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see uml.actions.VariableAction#getVariable()
	 * @see #getVariableAction()
	 * @generated
	 */
	EReference getVariableAction_Variable();

	/**
	 * Returns the meta object for class '{@link uml.actions.WriteLinkAction <em>Write Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Link Action</em>'.
	 * @see uml.actions.WriteLinkAction
	 * @generated
	 */
	EClass getWriteLinkAction();

	/**
	 * Returns the meta object for class '{@link uml.actions.LinkAction <em>Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Action</em>'.
	 * @see uml.actions.LinkAction
	 * @generated
	 */
	EClass getLinkAction();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.LinkAction#getEndData <em>End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Data</em>'.
	 * @see uml.actions.LinkAction#getEndData()
	 * @see #getLinkAction()
	 * @generated
	 */
	EReference getLinkAction_EndData();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.LinkAction#getInputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Value</em>'.
	 * @see uml.actions.LinkAction#getInputValue()
	 * @see #getLinkAction()
	 * @generated
	 */
	EReference getLinkAction_InputValue();

	/**
	 * Returns the meta object for the '{@link uml.actions.LinkAction#association() <em>Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Association</em>' operation.
	 * @see uml.actions.LinkAction#association()
	 * @generated
	 */
	EOperation getLinkAction__Association();

	/**
	 * Returns the meta object for class '{@link uml.actions.LinkEndData <em>Link End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link End Data</em>'.
	 * @see uml.actions.LinkEndData
	 * @generated
	 */
	EClass getLinkEndData();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.LinkEndData#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see uml.actions.LinkEndData#getEnd()
	 * @see #getLinkEndData()
	 * @generated
	 */
	EReference getLinkEndData_End();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.LinkEndData#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see uml.actions.LinkEndData#getQualifier()
	 * @see #getLinkEndData()
	 * @generated
	 */
	EReference getLinkEndData_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.LinkEndData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see uml.actions.LinkEndData#getValue()
	 * @see #getLinkEndData()
	 * @generated
	 */
	EReference getLinkEndData_Value();

	/**
	 * Returns the meta object for the '{@link uml.actions.LinkEndData#allPins() <em>All Pins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Pins</em>' operation.
	 * @see uml.actions.LinkEndData#allPins()
	 * @generated
	 */
	EOperation getLinkEndData__AllPins();

	/**
	 * Returns the meta object for class '{@link uml.actions.QualifierValue <em>Qualifier Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualifier Value</em>'.
	 * @see uml.actions.QualifierValue
	 * @generated
	 */
	EClass getQualifierValue();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.QualifierValue#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see uml.actions.QualifierValue#getQualifier()
	 * @see #getQualifierValue()
	 * @generated
	 */
	EReference getQualifierValue_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.QualifierValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see uml.actions.QualifierValue#getValue()
	 * @see #getQualifierValue()
	 * @generated
	 */
	EReference getQualifierValue_Value();

	/**
	 * Returns the meta object for class '{@link uml.actions.WriteStructuralFeatureAction <em>Write Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Structural Feature Action</em>'.
	 * @see uml.actions.WriteStructuralFeatureAction
	 * @generated
	 */
	EClass getWriteStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.WriteStructuralFeatureAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.WriteStructuralFeatureAction#getResult()
	 * @see #getWriteStructuralFeatureAction()
	 * @generated
	 */
	EReference getWriteStructuralFeatureAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.WriteStructuralFeatureAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see uml.actions.WriteStructuralFeatureAction#getValue()
	 * @see #getWriteStructuralFeatureAction()
	 * @generated
	 */
	EReference getWriteStructuralFeatureAction_Value();

	/**
	 * Returns the meta object for class '{@link uml.actions.StructuralFeatureAction <em>Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature Action</em>'.
	 * @see uml.actions.StructuralFeatureAction
	 * @generated
	 */
	EClass getStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.StructuralFeatureAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see uml.actions.StructuralFeatureAction#getObject()
	 * @see #getStructuralFeatureAction()
	 * @generated
	 */
	EReference getStructuralFeatureAction_Object();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.StructuralFeatureAction#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see uml.actions.StructuralFeatureAction#getStructuralFeature()
	 * @see #getStructuralFeatureAction()
	 * @generated
	 */
	EReference getStructuralFeatureAction_StructuralFeature();

	/**
	 * Returns the meta object for class '{@link uml.actions.WriteVariableAction <em>Write Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Variable Action</em>'.
	 * @see uml.actions.WriteVariableAction
	 * @generated
	 */
	EClass getWriteVariableAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.WriteVariableAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see uml.actions.WriteVariableAction#getValue()
	 * @see #getWriteVariableAction()
	 * @generated
	 */
	EReference getWriteVariableAction_Value();

	/**
	 * Returns the meta object for class '{@link uml.actions.AcceptCallAction <em>Accept Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Call Action</em>'.
	 * @see uml.actions.AcceptCallAction
	 * @generated
	 */
	EClass getAcceptCallAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.AcceptCallAction#getReturnInformation <em>Return Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Information</em>'.
	 * @see uml.actions.AcceptCallAction#getReturnInformation()
	 * @see #getAcceptCallAction()
	 * @generated
	 */
	EReference getAcceptCallAction_ReturnInformation();

	/**
	 * Returns the meta object for class '{@link uml.actions.AcceptEventAction <em>Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action</em>'.
	 * @see uml.actions.AcceptEventAction
	 * @generated
	 */
	EClass getAcceptEventAction();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.AcceptEventAction#isIsUnmarshall <em>Is Unmarshall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unmarshall</em>'.
	 * @see uml.actions.AcceptEventAction#isIsUnmarshall()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EAttribute getAcceptEventAction_IsUnmarshall();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.AcceptEventAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see uml.actions.AcceptEventAction#getResult()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EReference getAcceptEventAction_Result();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.AcceptEventAction#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see uml.actions.AcceptEventAction#getTrigger()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EReference getAcceptEventAction_Trigger();

	/**
	 * Returns the meta object for class '{@link uml.actions.ActionInputPin <em>Action Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Input Pin</em>'.
	 * @see uml.actions.ActionInputPin
	 * @generated
	 */
	EClass getActionInputPin();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ActionInputPin#getFromAction <em>From Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Action</em>'.
	 * @see uml.actions.ActionInputPin#getFromAction()
	 * @see #getActionInputPin()
	 * @generated
	 */
	EReference getActionInputPin_FromAction();

	/**
	 * Returns the meta object for class '{@link uml.actions.AddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Structural Feature Value Action</em>'.
	 * @see uml.actions.AddStructuralFeatureValueAction
	 * @generated
	 */
	EClass getAddStructuralFeatureValueAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.AddStructuralFeatureValueAction#getInsertAt <em>Insert At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert At</em>'.
	 * @see uml.actions.AddStructuralFeatureValueAction#getInsertAt()
	 * @see #getAddStructuralFeatureValueAction()
	 * @generated
	 */
	EReference getAddStructuralFeatureValueAction_InsertAt();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.AddStructuralFeatureValueAction#isIsReplaceAll <em>Is Replace All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replace All</em>'.
	 * @see uml.actions.AddStructuralFeatureValueAction#isIsReplaceAll()
	 * @see #getAddStructuralFeatureValueAction()
	 * @generated
	 */
	EAttribute getAddStructuralFeatureValueAction_IsReplaceAll();

	/**
	 * Returns the meta object for class '{@link uml.actions.AddVariableValueAction <em>Add Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Variable Value Action</em>'.
	 * @see uml.actions.AddVariableValueAction
	 * @generated
	 */
	EClass getAddVariableValueAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.AddVariableValueAction#getInsertAt <em>Insert At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert At</em>'.
	 * @see uml.actions.AddVariableValueAction#getInsertAt()
	 * @see #getAddVariableValueAction()
	 * @generated
	 */
	EReference getAddVariableValueAction_InsertAt();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.AddVariableValueAction#isIsReplaceAll <em>Is Replace All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replace All</em>'.
	 * @see uml.actions.AddVariableValueAction#isIsReplaceAll()
	 * @see #getAddVariableValueAction()
	 * @generated
	 */
	EAttribute getAddVariableValueAction_IsReplaceAll();

	/**
	 * Returns the meta object for class '{@link uml.actions.BroadcastSignalAction <em>Broadcast Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broadcast Signal Action</em>'.
	 * @see uml.actions.BroadcastSignalAction
	 * @generated
	 */
	EClass getBroadcastSignalAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.BroadcastSignalAction#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see uml.actions.BroadcastSignalAction#getSignal()
	 * @see #getBroadcastSignalAction()
	 * @generated
	 */
	EReference getBroadcastSignalAction_Signal();

	/**
	 * Returns the meta object for class '{@link uml.actions.InvocationAction <em>Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Action</em>'.
	 * @see uml.actions.InvocationAction
	 * @generated
	 */
	EClass getInvocationAction();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.InvocationAction#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see uml.actions.InvocationAction#getArgument()
	 * @see #getInvocationAction()
	 * @generated
	 */
	EReference getInvocationAction_Argument();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.InvocationAction#getOnPort <em>On Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Port</em>'.
	 * @see uml.actions.InvocationAction#getOnPort()
	 * @see #getInvocationAction()
	 * @generated
	 */
	EReference getInvocationAction_OnPort();

	/**
	 * Returns the meta object for class '{@link uml.actions.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action</em>'.
	 * @see uml.actions.CallAction
	 * @generated
	 */
	EClass getCallAction();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.CallAction#isIsSynchronous <em>Is Synchronous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Synchronous</em>'.
	 * @see uml.actions.CallAction#isIsSynchronous()
	 * @see #getCallAction()
	 * @generated
	 */
	EAttribute getCallAction_IsSynchronous();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.CallAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see uml.actions.CallAction#getResult()
	 * @see #getCallAction()
	 * @generated
	 */
	EReference getCallAction_Result();

	/**
	 * Returns the meta object for the '{@link uml.actions.CallAction#inputParameters() <em>Input Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Parameters</em>' operation.
	 * @see uml.actions.CallAction#inputParameters()
	 * @generated
	 */
	EOperation getCallAction__InputParameters();

	/**
	 * Returns the meta object for the '{@link uml.actions.CallAction#outputParameters() <em>Output Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Parameters</em>' operation.
	 * @see uml.actions.CallAction#outputParameters()
	 * @generated
	 */
	EOperation getCallAction__OutputParameters();

	/**
	 * Returns the meta object for class '{@link uml.actions.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Behavior Action</em>'.
	 * @see uml.actions.CallBehaviorAction
	 * @generated
	 */
	EClass getCallBehaviorAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.CallBehaviorAction#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see uml.actions.CallBehaviorAction#getBehavior()
	 * @see #getCallBehaviorAction()
	 * @generated
	 */
	EReference getCallBehaviorAction_Behavior();

	/**
	 * Returns the meta object for class '{@link uml.actions.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Operation Action</em>'.
	 * @see uml.actions.CallOperationAction
	 * @generated
	 */
	EClass getCallOperationAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.CallOperationAction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see uml.actions.CallOperationAction#getOperation()
	 * @see #getCallOperationAction()
	 * @generated
	 */
	EReference getCallOperationAction_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.CallOperationAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see uml.actions.CallOperationAction#getTarget()
	 * @see #getCallOperationAction()
	 * @generated
	 */
	EReference getCallOperationAction_Target();

	/**
	 * Returns the meta object for class '{@link uml.actions.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see uml.actions.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.Clause#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body</em>'.
	 * @see uml.actions.Clause#getBody()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Body();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.Clause#getBodyOutput <em>Body Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Output</em>'.
	 * @see uml.actions.Clause#getBodyOutput()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_BodyOutput();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.Clause#getDecider <em>Decider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decider</em>'.
	 * @see uml.actions.Clause#getDecider()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Decider();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.Clause#getPredecessorClause <em>Predecessor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessor Clause</em>'.
	 * @see uml.actions.Clause#getPredecessorClause()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_PredecessorClause();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.Clause#getSuccessorClause <em>Successor Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successor Clause</em>'.
	 * @see uml.actions.Clause#getSuccessorClause()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_SuccessorClause();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.Clause#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test</em>'.
	 * @see uml.actions.Clause#getTest()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Test();

	/**
	 * Returns the meta object for class '{@link uml.actions.ClearAssociationAction <em>Clear Association Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Association Action</em>'.
	 * @see uml.actions.ClearAssociationAction
	 * @generated
	 */
	EClass getClearAssociationAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.ClearAssociationAction#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see uml.actions.ClearAssociationAction#getAssociation()
	 * @see #getClearAssociationAction()
	 * @generated
	 */
	EReference getClearAssociationAction_Association();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ClearAssociationAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see uml.actions.ClearAssociationAction#getObject()
	 * @see #getClearAssociationAction()
	 * @generated
	 */
	EReference getClearAssociationAction_Object();

	/**
	 * Returns the meta object for class '{@link uml.actions.ClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Structural Feature Action</em>'.
	 * @see uml.actions.ClearStructuralFeatureAction
	 * @generated
	 */
	EClass getClearStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ClearStructuralFeatureAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ClearStructuralFeatureAction#getResult()
	 * @see #getClearStructuralFeatureAction()
	 * @generated
	 */
	EReference getClearStructuralFeatureAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.ClearVariableAction <em>Clear Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Variable Action</em>'.
	 * @see uml.actions.ClearVariableAction
	 * @generated
	 */
	EClass getClearVariableAction();

	/**
	 * Returns the meta object for class '{@link uml.actions.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Node</em>'.
	 * @see uml.actions.ConditionalNode
	 * @generated
	 */
	EClass getConditionalNode();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.ConditionalNode#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clause</em>'.
	 * @see uml.actions.ConditionalNode#getClause()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_Clause();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.ConditionalNode#isIsAssured <em>Is Assured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Assured</em>'.
	 * @see uml.actions.ConditionalNode#isIsAssured()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EAttribute getConditionalNode_IsAssured();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.ConditionalNode#isIsDeterminate <em>Is Determinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Determinate</em>'.
	 * @see uml.actions.ConditionalNode#isIsDeterminate()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EAttribute getConditionalNode_IsDeterminate();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.ConditionalNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see uml.actions.ConditionalNode#getResult()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.CreateLinkAction <em>Create Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Link Action</em>'.
	 * @see uml.actions.CreateLinkAction
	 * @generated
	 */
	EClass getCreateLinkAction();

	/**
	 * Returns the meta object for class '{@link uml.actions.LinkEndCreationData <em>Link End Creation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link End Creation Data</em>'.
	 * @see uml.actions.LinkEndCreationData
	 * @generated
	 */
	EClass getLinkEndCreationData();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.LinkEndCreationData#getInsertAt <em>Insert At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Insert At</em>'.
	 * @see uml.actions.LinkEndCreationData#getInsertAt()
	 * @see #getLinkEndCreationData()
	 * @generated
	 */
	EReference getLinkEndCreationData_InsertAt();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.LinkEndCreationData#isIsReplaceAll <em>Is Replace All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replace All</em>'.
	 * @see uml.actions.LinkEndCreationData#isIsReplaceAll()
	 * @see #getLinkEndCreationData()
	 * @generated
	 */
	EAttribute getLinkEndCreationData_IsReplaceAll();

	/**
	 * Returns the meta object for class '{@link uml.actions.CreateLinkObjectAction <em>Create Link Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Link Object Action</em>'.
	 * @see uml.actions.CreateLinkObjectAction
	 * @generated
	 */
	EClass getCreateLinkObjectAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.CreateLinkObjectAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.CreateLinkObjectAction#getResult()
	 * @see #getCreateLinkObjectAction()
	 * @generated
	 */
	EReference getCreateLinkObjectAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Object Action</em>'.
	 * @see uml.actions.CreateObjectAction
	 * @generated
	 */
	EClass getCreateObjectAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.CreateObjectAction#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see uml.actions.CreateObjectAction#getClassifier()
	 * @see #getCreateObjectAction()
	 * @generated
	 */
	EReference getCreateObjectAction_Classifier();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.CreateObjectAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.CreateObjectAction#getResult()
	 * @see #getCreateObjectAction()
	 * @generated
	 */
	EReference getCreateObjectAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.DestroyLinkAction <em>Destroy Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy Link Action</em>'.
	 * @see uml.actions.DestroyLinkAction
	 * @generated
	 */
	EClass getDestroyLinkAction();

	/**
	 * Returns the meta object for class '{@link uml.actions.LinkEndDestructionData <em>Link End Destruction Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link End Destruction Data</em>'.
	 * @see uml.actions.LinkEndDestructionData
	 * @generated
	 */
	EClass getLinkEndDestructionData();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.LinkEndDestructionData#getDestroyAt <em>Destroy At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destroy At</em>'.
	 * @see uml.actions.LinkEndDestructionData#getDestroyAt()
	 * @see #getLinkEndDestructionData()
	 * @generated
	 */
	EReference getLinkEndDestructionData_DestroyAt();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.LinkEndDestructionData#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Destroy Duplicates</em>'.
	 * @see uml.actions.LinkEndDestructionData#isIsDestroyDuplicates()
	 * @see #getLinkEndDestructionData()
	 * @generated
	 */
	EAttribute getLinkEndDestructionData_IsDestroyDuplicates();

	/**
	 * Returns the meta object for class '{@link uml.actions.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy Object Action</em>'.
	 * @see uml.actions.DestroyObjectAction
	 * @generated
	 */
	EClass getDestroyObjectAction();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.DestroyObjectAction#isIsDestroyLinks <em>Is Destroy Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Destroy Links</em>'.
	 * @see uml.actions.DestroyObjectAction#isIsDestroyLinks()
	 * @see #getDestroyObjectAction()
	 * @generated
	 */
	EAttribute getDestroyObjectAction_IsDestroyLinks();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.DestroyObjectAction#isIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Destroy Owned Objects</em>'.
	 * @see uml.actions.DestroyObjectAction#isIsDestroyOwnedObjects()
	 * @see #getDestroyObjectAction()
	 * @generated
	 */
	EAttribute getDestroyObjectAction_IsDestroyOwnedObjects();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.DestroyObjectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see uml.actions.DestroyObjectAction#getTarget()
	 * @see #getDestroyObjectAction()
	 * @generated
	 */
	EReference getDestroyObjectAction_Target();

	/**
	 * Returns the meta object for class '{@link uml.actions.ExpansionNode <em>Expansion Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expansion Node</em>'.
	 * @see uml.actions.ExpansionNode
	 * @generated
	 */
	EClass getExpansionNode();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region As Input</em>'.
	 * @see uml.actions.ExpansionNode#getRegionAsInput()
	 * @see #getExpansionNode()
	 * @generated
	 */
	EReference getExpansionNode_RegionAsInput();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region As Output</em>'.
	 * @see uml.actions.ExpansionNode#getRegionAsOutput()
	 * @see #getExpansionNode()
	 * @generated
	 */
	EReference getExpansionNode_RegionAsOutput();

	/**
	 * Returns the meta object for class '{@link uml.actions.ExpansionRegion <em>Expansion Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expansion Region</em>'.
	 * @see uml.actions.ExpansionRegion
	 * @generated
	 */
	EClass getExpansionRegion();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.ExpansionRegion#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see uml.actions.ExpansionRegion#getMode()
	 * @see #getExpansionRegion()
	 * @generated
	 */
	EAttribute getExpansionRegion_Mode();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.ExpansionRegion#getOutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Element</em>'.
	 * @see uml.actions.ExpansionRegion#getOutputElement()
	 * @see #getExpansionRegion()
	 * @generated
	 */
	EReference getExpansionRegion_OutputElement();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.ExpansionRegion#getInputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Element</em>'.
	 * @see uml.actions.ExpansionRegion#getInputElement()
	 * @see #getExpansionRegion()
	 * @generated
	 */
	EReference getExpansionRegion_InputElement();

	/**
	 * Returns the meta object for class '{@link uml.actions.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Node</em>'.
	 * @see uml.actions.LoopNode
	 * @generated
	 */
	EClass getLoopNode();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.LoopNode#getBodyOutput <em>Body Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Output</em>'.
	 * @see uml.actions.LoopNode#getBodyOutput()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_BodyOutput();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.LoopNode#getBodyPart <em>Body Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Body Part</em>'.
	 * @see uml.actions.LoopNode#getBodyPart()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_BodyPart();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.LoopNode#getDecider <em>Decider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decider</em>'.
	 * @see uml.actions.LoopNode#getDecider()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Decider();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.LoopNode#isIsTestedFirst <em>Is Tested First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tested First</em>'.
	 * @see uml.actions.LoopNode#isIsTestedFirst()
	 * @see #getLoopNode()
	 * @generated
	 */
	EAttribute getLoopNode_IsTestedFirst();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.LoopNode#getLoopVariable <em>Loop Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Variable</em>'.
	 * @see uml.actions.LoopNode#getLoopVariable()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_LoopVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.LoopNode#getLoopVariableInput <em>Loop Variable Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Variable Input</em>'.
	 * @see uml.actions.LoopNode#getLoopVariableInput()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_LoopVariableInput();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.LoopNode#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see uml.actions.LoopNode#getResult()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Result();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.LoopNode#getSetupPart <em>Setup Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Setup Part</em>'.
	 * @see uml.actions.LoopNode#getSetupPart()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_SetupPart();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.LoopNode#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test</em>'.
	 * @see uml.actions.LoopNode#getTest()
	 * @see #getLoopNode()
	 * @generated
	 */
	EReference getLoopNode_Test();

	/**
	 * Returns the meta object for class '{@link uml.actions.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action</em>'.
	 * @see uml.actions.OpaqueAction
	 * @generated
	 */
	EClass getOpaqueAction();

	/**
	 * Returns the meta object for the attribute list '{@link uml.actions.OpaqueAction#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Body</em>'.
	 * @see uml.actions.OpaqueAction#getBody()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EAttribute getOpaqueAction_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.OpaqueAction#getInputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Value</em>'.
	 * @see uml.actions.OpaqueAction#getInputValue()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EReference getOpaqueAction_InputValue();

	/**
	 * Returns the meta object for the attribute list '{@link uml.actions.OpaqueAction#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see uml.actions.OpaqueAction#getLanguage()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EAttribute getOpaqueAction_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.OpaqueAction#getOutputValue <em>Output Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Value</em>'.
	 * @see uml.actions.OpaqueAction#getOutputValue()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EReference getOpaqueAction_OutputValue();

	/**
	 * Returns the meta object for class '{@link uml.actions.RaiseExceptionAction <em>Raise Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Exception Action</em>'.
	 * @see uml.actions.RaiseExceptionAction
	 * @generated
	 */
	EClass getRaiseExceptionAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.RaiseExceptionAction#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see uml.actions.RaiseExceptionAction#getException()
	 * @see #getRaiseExceptionAction()
	 * @generated
	 */
	EReference getRaiseExceptionAction_Exception();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReadExtentAction <em>Read Extent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Extent Action</em>'.
	 * @see uml.actions.ReadExtentAction
	 * @generated
	 */
	EClass getReadExtentAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.ReadExtentAction#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see uml.actions.ReadExtentAction#getClassifier()
	 * @see #getReadExtentAction()
	 * @generated
	 */
	EReference getReadExtentAction_Classifier();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadExtentAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ReadExtentAction#getResult()
	 * @see #getReadExtentAction()
	 * @generated
	 */
	EReference getReadExtentAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReadIsClassifiedObjectAction <em>Read Is Classified Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Is Classified Object Action</em>'.
	 * @see uml.actions.ReadIsClassifiedObjectAction
	 * @generated
	 */
	EClass getReadIsClassifiedObjectAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.ReadIsClassifiedObjectAction#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see uml.actions.ReadIsClassifiedObjectAction#getClassifier()
	 * @see #getReadIsClassifiedObjectAction()
	 * @generated
	 */
	EReference getReadIsClassifiedObjectAction_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.ReadIsClassifiedObjectAction#isIsDirect <em>Is Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Direct</em>'.
	 * @see uml.actions.ReadIsClassifiedObjectAction#isIsDirect()
	 * @see #getReadIsClassifiedObjectAction()
	 * @generated
	 */
	EAttribute getReadIsClassifiedObjectAction_IsDirect();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadIsClassifiedObjectAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see uml.actions.ReadIsClassifiedObjectAction#getObject()
	 * @see #getReadIsClassifiedObjectAction()
	 * @generated
	 */
	EReference getReadIsClassifiedObjectAction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadIsClassifiedObjectAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ReadIsClassifiedObjectAction#getResult()
	 * @see #getReadIsClassifiedObjectAction()
	 * @generated
	 */
	EReference getReadIsClassifiedObjectAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReadLinkAction <em>Read Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Link Action</em>'.
	 * @see uml.actions.ReadLinkAction
	 * @generated
	 */
	EClass getReadLinkAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadLinkAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ReadLinkAction#getResult()
	 * @see #getReadLinkAction()
	 * @generated
	 */
	EReference getReadLinkAction_Result();

	/**
	 * Returns the meta object for the '{@link uml.actions.ReadLinkAction#openEnd() <em>Open End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open End</em>' operation.
	 * @see uml.actions.ReadLinkAction#openEnd()
	 * @generated
	 */
	EOperation getReadLinkAction__OpenEnd();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReadLinkObjectEndAction <em>Read Link Object End Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Link Object End Action</em>'.
	 * @see uml.actions.ReadLinkObjectEndAction
	 * @generated
	 */
	EClass getReadLinkObjectEndAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.ReadLinkObjectEndAction#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see uml.actions.ReadLinkObjectEndAction#getEnd()
	 * @see #getReadLinkObjectEndAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndAction_End();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadLinkObjectEndAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see uml.actions.ReadLinkObjectEndAction#getObject()
	 * @see #getReadLinkObjectEndAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndAction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadLinkObjectEndAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ReadLinkObjectEndAction#getResult()
	 * @see #getReadLinkObjectEndAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReadLinkObjectEndQualifierAction <em>Read Link Object End Qualifier Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Link Object End Qualifier Action</em>'.
	 * @see uml.actions.ReadLinkObjectEndQualifierAction
	 * @generated
	 */
	EClass getReadLinkObjectEndQualifierAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see uml.actions.ReadLinkObjectEndQualifierAction#getObject()
	 * @see #getReadLinkObjectEndQualifierAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndQualifierAction_Object();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualifier</em>'.
	 * @see uml.actions.ReadLinkObjectEndQualifierAction#getQualifier()
	 * @see #getReadLinkObjectEndQualifierAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndQualifierAction_Qualifier();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ReadLinkObjectEndQualifierAction#getResult()
	 * @see #getReadLinkObjectEndQualifierAction()
	 * @generated
	 */
	EReference getReadLinkObjectEndQualifierAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Self Action</em>'.
	 * @see uml.actions.ReadSelfAction
	 * @generated
	 */
	EClass getReadSelfAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadSelfAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ReadSelfAction#getResult()
	 * @see #getReadSelfAction()
	 * @generated
	 */
	EReference getReadSelfAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReadStructuralFeatureAction <em>Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Structural Feature Action</em>'.
	 * @see uml.actions.ReadStructuralFeatureAction
	 * @generated
	 */
	EClass getReadStructuralFeatureAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadStructuralFeatureAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ReadStructuralFeatureAction#getResult()
	 * @see #getReadStructuralFeatureAction()
	 * @generated
	 */
	EReference getReadStructuralFeatureAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReadVariableAction <em>Read Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Variable Action</em>'.
	 * @see uml.actions.ReadVariableAction
	 * @generated
	 */
	EClass getReadVariableAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReadVariableAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ReadVariableAction#getResult()
	 * @see #getReadVariableAction()
	 * @generated
	 */
	EReference getReadVariableAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReclassifyObjectAction <em>Reclassify Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reclassify Object Action</em>'.
	 * @see uml.actions.ReclassifyObjectAction
	 * @generated
	 */
	EClass getReclassifyObjectAction();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replace All</em>'.
	 * @see uml.actions.ReclassifyObjectAction#isIsReplaceAll()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EAttribute getReclassifyObjectAction_IsReplaceAll();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.ReclassifyObjectAction#getNewClassifier <em>New Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Classifier</em>'.
	 * @see uml.actions.ReclassifyObjectAction#getNewClassifier()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EReference getReclassifyObjectAction_NewClassifier();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReclassifyObjectAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see uml.actions.ReclassifyObjectAction#getObject()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EReference getReclassifyObjectAction_Object();

	/**
	 * Returns the meta object for the reference list '{@link uml.actions.ReclassifyObjectAction#getOldClassifier <em>Old Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Classifier</em>'.
	 * @see uml.actions.ReclassifyObjectAction#getOldClassifier()
	 * @see #getReclassifyObjectAction()
	 * @generated
	 */
	EReference getReclassifyObjectAction_OldClassifier();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReduceAction <em>Reduce Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduce Action</em>'.
	 * @see uml.actions.ReduceAction
	 * @generated
	 */
	EClass getReduceAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReduceAction#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see uml.actions.ReduceAction#getCollection()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Collection();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.ReduceAction#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see uml.actions.ReduceAction#isIsOrdered()
	 * @see #getReduceAction()
	 * @generated
	 */
	EAttribute getReduceAction_IsOrdered();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.ReduceAction#getReducer <em>Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reducer</em>'.
	 * @see uml.actions.ReduceAction#getReducer()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Reducer();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReduceAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.ReduceAction#getResult()
	 * @see #getReduceAction()
	 * @generated
	 */
	EReference getReduceAction_Result();

	/**
	 * Returns the meta object for class '{@link uml.actions.RemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Structural Feature Value Action</em>'.
	 * @see uml.actions.RemoveStructuralFeatureValueAction
	 * @generated
	 */
	EClass getRemoveStructuralFeatureValueAction();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.RemoveStructuralFeatureValueAction#isIsRemoveDuplicates <em>Is Remove Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Remove Duplicates</em>'.
	 * @see uml.actions.RemoveStructuralFeatureValueAction#isIsRemoveDuplicates()
	 * @see #getRemoveStructuralFeatureValueAction()
	 * @generated
	 */
	EAttribute getRemoveStructuralFeatureValueAction_IsRemoveDuplicates();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.RemoveStructuralFeatureValueAction#getRemoveAt <em>Remove At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove At</em>'.
	 * @see uml.actions.RemoveStructuralFeatureValueAction#getRemoveAt()
	 * @see #getRemoveStructuralFeatureValueAction()
	 * @generated
	 */
	EReference getRemoveStructuralFeatureValueAction_RemoveAt();

	/**
	 * Returns the meta object for class '{@link uml.actions.RemoveVariableValueAction <em>Remove Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Variable Value Action</em>'.
	 * @see uml.actions.RemoveVariableValueAction
	 * @generated
	 */
	EClass getRemoveVariableValueAction();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.RemoveVariableValueAction#isIsRemoveDuplicates <em>Is Remove Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Remove Duplicates</em>'.
	 * @see uml.actions.RemoveVariableValueAction#isIsRemoveDuplicates()
	 * @see #getRemoveVariableValueAction()
	 * @generated
	 */
	EAttribute getRemoveVariableValueAction_IsRemoveDuplicates();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.RemoveVariableValueAction#getRemoveAt <em>Remove At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove At</em>'.
	 * @see uml.actions.RemoveVariableValueAction#getRemoveAt()
	 * @see #getRemoveVariableValueAction()
	 * @generated
	 */
	EReference getRemoveVariableValueAction_RemoveAt();

	/**
	 * Returns the meta object for class '{@link uml.actions.ReplyAction <em>Reply Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply Action</em>'.
	 * @see uml.actions.ReplyAction
	 * @generated
	 */
	EClass getReplyAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.ReplyAction#getReplyToCall <em>Reply To Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reply To Call</em>'.
	 * @see uml.actions.ReplyAction#getReplyToCall()
	 * @see #getReplyAction()
	 * @generated
	 */
	EReference getReplyAction_ReplyToCall();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.ReplyAction#getReplyValue <em>Reply Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply Value</em>'.
	 * @see uml.actions.ReplyAction#getReplyValue()
	 * @see #getReplyAction()
	 * @generated
	 */
	EReference getReplyAction_ReplyValue();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ReplyAction#getReturnInformation <em>Return Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Information</em>'.
	 * @see uml.actions.ReplyAction#getReturnInformation()
	 * @see #getReplyAction()
	 * @generated
	 */
	EReference getReplyAction_ReturnInformation();

	/**
	 * Returns the meta object for class '{@link uml.actions.SendObjectAction <em>Send Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Object Action</em>'.
	 * @see uml.actions.SendObjectAction
	 * @generated
	 */
	EClass getSendObjectAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.SendObjectAction#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see uml.actions.SendObjectAction#getRequest()
	 * @see #getSendObjectAction()
	 * @generated
	 */
	EReference getSendObjectAction_Request();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.SendObjectAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see uml.actions.SendObjectAction#getTarget()
	 * @see #getSendObjectAction()
	 * @generated
	 */
	EReference getSendObjectAction_Target();

	/**
	 * Returns the meta object for class '{@link uml.actions.SendSignalAction <em>Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Signal Action</em>'.
	 * @see uml.actions.SendSignalAction
	 * @generated
	 */
	EClass getSendSignalAction();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.SendSignalAction#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see uml.actions.SendSignalAction#getSignal()
	 * @see #getSendSignalAction()
	 * @generated
	 */
	EReference getSendSignalAction_Signal();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.SendSignalAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see uml.actions.SendSignalAction#getTarget()
	 * @see #getSendSignalAction()
	 * @generated
	 */
	EReference getSendSignalAction_Target();

	/**
	 * Returns the meta object for class '{@link uml.actions.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Node</em>'.
	 * @see uml.actions.SequenceNode
	 * @generated
	 */
	EClass getSequenceNode();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.SequenceNode#getExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executable Node</em>'.
	 * @see uml.actions.SequenceNode#getExecutableNode()
	 * @see #getSequenceNode()
	 * @generated
	 */
	EReference getSequenceNode_ExecutableNode();

	/**
	 * Returns the meta object for class '{@link uml.actions.StartClassifierBehaviorAction <em>Start Classifier Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Classifier Behavior Action</em>'.
	 * @see uml.actions.StartClassifierBehaviorAction
	 * @generated
	 */
	EClass getStartClassifierBehaviorAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.StartClassifierBehaviorAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see uml.actions.StartClassifierBehaviorAction#getObject()
	 * @see #getStartClassifierBehaviorAction()
	 * @generated
	 */
	EReference getStartClassifierBehaviorAction_Object();

	/**
	 * Returns the meta object for class '{@link uml.actions.StartObjectBehaviorAction <em>Start Object Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Object Behavior Action</em>'.
	 * @see uml.actions.StartObjectBehaviorAction
	 * @generated
	 */
	EClass getStartObjectBehaviorAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.StartObjectBehaviorAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see uml.actions.StartObjectBehaviorAction#getObject()
	 * @see #getStartObjectBehaviorAction()
	 * @generated
	 */
	EReference getStartObjectBehaviorAction_Object();

	/**
	 * Returns the meta object for the '{@link uml.actions.StartObjectBehaviorAction#behavior() <em>Behavior</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Behavior</em>' operation.
	 * @see uml.actions.StartObjectBehaviorAction#behavior()
	 * @generated
	 */
	EOperation getStartObjectBehaviorAction__Behavior();

	/**
	 * Returns the meta object for class '{@link uml.actions.TestIdentityAction <em>Test Identity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Identity Action</em>'.
	 * @see uml.actions.TestIdentityAction
	 * @generated
	 */
	EClass getTestIdentityAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.TestIdentityAction#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First</em>'.
	 * @see uml.actions.TestIdentityAction#getFirst()
	 * @see #getTestIdentityAction()
	 * @generated
	 */
	EReference getTestIdentityAction_First();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.TestIdentityAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see uml.actions.TestIdentityAction#getResult()
	 * @see #getTestIdentityAction()
	 * @generated
	 */
	EReference getTestIdentityAction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.TestIdentityAction#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second</em>'.
	 * @see uml.actions.TestIdentityAction#getSecond()
	 * @see #getTestIdentityAction()
	 * @generated
	 */
	EReference getTestIdentityAction_Second();

	/**
	 * Returns the meta object for class '{@link uml.actions.UnmarshallAction <em>Unmarshall Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unmarshall Action</em>'.
	 * @see uml.actions.UnmarshallAction
	 * @generated
	 */
	EClass getUnmarshallAction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.UnmarshallAction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see uml.actions.UnmarshallAction#getObject()
	 * @see #getUnmarshallAction()
	 * @generated
	 */
	EReference getUnmarshallAction_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.UnmarshallAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see uml.actions.UnmarshallAction#getResult()
	 * @see #getUnmarshallAction()
	 * @generated
	 */
	EReference getUnmarshallAction_Result();

	/**
	 * Returns the meta object for the reference '{@link uml.actions.UnmarshallAction#getUnmarshallType <em>Unmarshall Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unmarshall Type</em>'.
	 * @see uml.actions.UnmarshallAction#getUnmarshallType()
	 * @see #getUnmarshallAction()
	 * @generated
	 */
	EReference getUnmarshallAction_UnmarshallType();

	/**
	 * Returns the meta object for class '{@link uml.actions.ValuePin <em>Value Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Pin</em>'.
	 * @see uml.actions.ValuePin
	 * @generated
	 */
	EClass getValuePin();

	/**
	 * Returns the meta object for the containment reference '{@link uml.actions.ValuePin#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see uml.actions.ValuePin#getValue()
	 * @see #getValuePin()
	 * @generated
	 */
	EReference getValuePin_Value();

	/**
	 * Returns the meta object for class '{@link uml.actions.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Activity Node</em>'.
	 * @see uml.actions.StructuredActivityNode
	 * @generated
	 */
	EClass getStructuredActivityNode();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.StructuredActivityNode#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see uml.actions.StructuredActivityNode#getVariable()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.StructuredActivityNode#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see uml.actions.StructuredActivityNode#getEdge()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Edge();

	/**
	 * Returns the meta object for the attribute '{@link uml.actions.StructuredActivityNode#isMustIsolate <em>Must Isolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Isolate</em>'.
	 * @see uml.actions.StructuredActivityNode#isMustIsolate()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EAttribute getStructuredActivityNode_MustIsolate();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.StructuredActivityNode#getStructuredNodeInput <em>Structured Node Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structured Node Input</em>'.
	 * @see uml.actions.StructuredActivityNode#getStructuredNodeInput()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_StructuredNodeInput();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.StructuredActivityNode#getStructuredNodeOutput <em>Structured Node Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structured Node Output</em>'.
	 * @see uml.actions.StructuredActivityNode#getStructuredNodeOutput()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_StructuredNodeOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.actions.StructuredActivityNode#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see uml.actions.StructuredActivityNode#getNode()
	 * @see #getStructuredActivityNode()
	 * @generated
	 */
	EReference getStructuredActivityNode_Node();

	/**
	 * Returns the meta object for the '{@link uml.actions.StructuredActivityNode#sourceNodes() <em>Source Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Nodes</em>' operation.
	 * @see uml.actions.StructuredActivityNode#sourceNodes()
	 * @generated
	 */
	EOperation getStructuredActivityNode__SourceNodes();

	/**
	 * Returns the meta object for the '{@link uml.actions.StructuredActivityNode#targetNodes() <em>Target Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Nodes</em>' operation.
	 * @see uml.actions.StructuredActivityNode#targetNodes()
	 * @generated
	 */
	EOperation getStructuredActivityNode__TargetNodes();

	/**
	 * Returns the meta object for enum '{@link uml.actions.ExpansionKind <em>Expansion Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expansion Kind</em>'.
	 * @see uml.actions.ExpansionKind
	 * @generated
	 */
	EEnum getExpansionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActionsFactory getActionsFactory();

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
		 * The meta object literal for the '{@link uml.actions.impl.ValueSpecificationActionImpl <em>Value Specification Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ValueSpecificationActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getValueSpecificationAction()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION_ACTION = eINSTANCE.getValueSpecificationAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SPECIFICATION_ACTION__RESULT = eINSTANCE.getValueSpecificationAction_Result();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SPECIFICATION_ACTION__VALUE = eINSTANCE.getValueSpecificationAction_Value();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTEXT = eINSTANCE.getAction_Context();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INPUT = eINSTANCE.getAction_Input();

		/**
		 * The meta object literal for the '<em><b>Is Locally Reentrant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__IS_LOCALLY_REENTRANT = eINSTANCE.getAction_IsLocallyReentrant();

		/**
		 * The meta object literal for the '<em><b>Local Postcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__LOCAL_POSTCONDITION = eINSTANCE.getAction_LocalPostcondition();

		/**
		 * The meta object literal for the '<em><b>Local Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__LOCAL_PRECONDITION = eINSTANCE.getAction_LocalPrecondition();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OUTPUT = eINSTANCE.getAction_Output();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___CONTEXT = eINSTANCE.getAction__Context();

		/**
		 * The meta object literal for the '<em><b>All Actions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___ALL_ACTIONS = eINSTANCE.getAction__AllActions();

		/**
		 * The meta object literal for the '<em><b>All Owned Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___ALL_OWNED_NODES = eINSTANCE.getAction__AllOwnedNodes();

		/**
		 * The meta object literal for the '<em><b>Containing Behavior</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___CONTAINING_BEHAVIOR = eINSTANCE.getAction__ContainingBehavior();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.InputPinImpl <em>Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.InputPinImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getInputPin()
		 * @generated
		 */
		EClass INPUT_PIN = eINSTANCE.getInputPin();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.PinImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Is Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__IS_CONTROL = eINSTANCE.getPin_IsControl();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.OutputPinImpl <em>Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.OutputPinImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getOutputPin()
		 * @generated
		 */
		EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.VariableActionImpl <em>Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.VariableActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getVariableAction()
		 * @generated
		 */
		EClass VARIABLE_ACTION = eINSTANCE.getVariableAction();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ACTION__VARIABLE = eINSTANCE.getVariableAction_Variable();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.WriteLinkActionImpl <em>Write Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.WriteLinkActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getWriteLinkAction()
		 * @generated
		 */
		EClass WRITE_LINK_ACTION = eINSTANCE.getWriteLinkAction();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.LinkActionImpl <em>Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.LinkActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getLinkAction()
		 * @generated
		 */
		EClass LINK_ACTION = eINSTANCE.getLinkAction();

		/**
		 * The meta object literal for the '<em><b>End Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ACTION__END_DATA = eINSTANCE.getLinkAction_EndData();

		/**
		 * The meta object literal for the '<em><b>Input Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ACTION__INPUT_VALUE = eINSTANCE.getLinkAction_InputValue();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK_ACTION___ASSOCIATION = eINSTANCE.getLinkAction__Association();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.LinkEndDataImpl <em>Link End Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.LinkEndDataImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getLinkEndData()
		 * @generated
		 */
		EClass LINK_END_DATA = eINSTANCE.getLinkEndData();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DATA__END = eINSTANCE.getLinkEndData_End();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DATA__QUALIFIER = eINSTANCE.getLinkEndData_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DATA__VALUE = eINSTANCE.getLinkEndData_Value();

		/**
		 * The meta object literal for the '<em><b>All Pins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK_END_DATA___ALL_PINS = eINSTANCE.getLinkEndData__AllPins();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.QualifierValueImpl <em>Qualifier Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.QualifierValueImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getQualifierValue()
		 * @generated
		 */
		EClass QUALIFIER_VALUE = eINSTANCE.getQualifierValue();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER_VALUE__QUALIFIER = eINSTANCE.getQualifierValue_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIER_VALUE__VALUE = eINSTANCE.getQualifierValue_Value();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.WriteStructuralFeatureActionImpl <em>Write Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.WriteStructuralFeatureActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getWriteStructuralFeatureAction()
		 * @generated
		 */
		EClass WRITE_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getWriteStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_STRUCTURAL_FEATURE_ACTION__RESULT = eINSTANCE.getWriteStructuralFeatureAction_Result();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_STRUCTURAL_FEATURE_ACTION__VALUE = eINSTANCE.getWriteStructuralFeatureAction_Value();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.StructuralFeatureActionImpl <em>Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.StructuralFeatureActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getStructuralFeatureAction()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE_ACTION = eINSTANCE.getStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_FEATURE_ACTION__OBJECT = eINSTANCE.getStructuralFeatureAction_Object();

		/**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeatureAction_StructuralFeature();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.WriteVariableActionImpl <em>Write Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.WriteVariableActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getWriteVariableAction()
		 * @generated
		 */
		EClass WRITE_VARIABLE_ACTION = eINSTANCE.getWriteVariableAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_VARIABLE_ACTION__VALUE = eINSTANCE.getWriteVariableAction_Value();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.AcceptCallActionImpl <em>Accept Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.AcceptCallActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getAcceptCallAction()
		 * @generated
		 */
		EClass ACCEPT_CALL_ACTION = eINSTANCE.getAcceptCallAction();

		/**
		 * The meta object literal for the '<em><b>Return Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_CALL_ACTION__RETURN_INFORMATION = eINSTANCE.getAcceptCallAction_ReturnInformation();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.AcceptEventActionImpl <em>Accept Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.AcceptEventActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getAcceptEventAction()
		 * @generated
		 */
		EClass ACCEPT_EVENT_ACTION = eINSTANCE.getAcceptEventAction();

		/**
		 * The meta object literal for the '<em><b>Is Unmarshall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_EVENT_ACTION__IS_UNMARSHALL = eINSTANCE.getAcceptEventAction_IsUnmarshall();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_EVENT_ACTION__RESULT = eINSTANCE.getAcceptEventAction_Result();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_EVENT_ACTION__TRIGGER = eINSTANCE.getAcceptEventAction_Trigger();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ActionInputPinImpl <em>Action Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ActionInputPinImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getActionInputPin()
		 * @generated
		 */
		EClass ACTION_INPUT_PIN = eINSTANCE.getActionInputPin();

		/**
		 * The meta object literal for the '<em><b>From Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_INPUT_PIN__FROM_ACTION = eINSTANCE.getActionInputPin_FromAction();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.AddStructuralFeatureValueActionImpl <em>Add Structural Feature Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.AddStructuralFeatureValueActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getAddStructuralFeatureValueAction()
		 * @generated
		 */
		EClass ADD_STRUCTURAL_FEATURE_VALUE_ACTION = eINSTANCE.getAddStructuralFeatureValueAction();

		/**
		 * The meta object literal for the '<em><b>Insert At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT = eINSTANCE.getAddStructuralFeatureValueAction_InsertAt();

		/**
		 * The meta object literal for the '<em><b>Is Replace All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL = eINSTANCE.getAddStructuralFeatureValueAction_IsReplaceAll();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.AddVariableValueActionImpl <em>Add Variable Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.AddVariableValueActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getAddVariableValueAction()
		 * @generated
		 */
		EClass ADD_VARIABLE_VALUE_ACTION = eINSTANCE.getAddVariableValueAction();

		/**
		 * The meta object literal for the '<em><b>Insert At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_VARIABLE_VALUE_ACTION__INSERT_AT = eINSTANCE.getAddVariableValueAction_InsertAt();

		/**
		 * The meta object literal for the '<em><b>Is Replace All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL = eINSTANCE.getAddVariableValueAction_IsReplaceAll();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.BroadcastSignalActionImpl <em>Broadcast Signal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.BroadcastSignalActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getBroadcastSignalAction()
		 * @generated
		 */
		EClass BROADCAST_SIGNAL_ACTION = eINSTANCE.getBroadcastSignalAction();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROADCAST_SIGNAL_ACTION__SIGNAL = eINSTANCE.getBroadcastSignalAction_Signal();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.InvocationActionImpl <em>Invocation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.InvocationActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getInvocationAction()
		 * @generated
		 */
		EClass INVOCATION_ACTION = eINSTANCE.getInvocationAction();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_ACTION__ARGUMENT = eINSTANCE.getInvocationAction_Argument();

		/**
		 * The meta object literal for the '<em><b>On Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_ACTION__ON_PORT = eINSTANCE.getInvocationAction_OnPort();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.CallActionImpl <em>Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.CallActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getCallAction()
		 * @generated
		 */
		EClass CALL_ACTION = eINSTANCE.getCallAction();

		/**
		 * The meta object literal for the '<em><b>Is Synchronous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_ACTION__IS_SYNCHRONOUS = eINSTANCE.getCallAction_IsSynchronous();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTION__RESULT = eINSTANCE.getCallAction_Result();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALL_ACTION___INPUT_PARAMETERS = eINSTANCE.getCallAction__InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CALL_ACTION___OUTPUT_PARAMETERS = eINSTANCE.getCallAction__OutputParameters();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.CallBehaviorActionImpl <em>Call Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.CallBehaviorActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getCallBehaviorAction()
		 * @generated
		 */
		EClass CALL_BEHAVIOR_ACTION = eINSTANCE.getCallBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_BEHAVIOR_ACTION__BEHAVIOR = eINSTANCE.getCallBehaviorAction_Behavior();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.CallOperationActionImpl <em>Call Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.CallOperationActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getCallOperationAction()
		 * @generated
		 */
		EClass CALL_OPERATION_ACTION = eINSTANCE.getCallOperationAction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_OPERATION_ACTION__OPERATION = eINSTANCE.getCallOperationAction_Operation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_OPERATION_ACTION__TARGET = eINSTANCE.getCallOperationAction_Target();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ClauseImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__BODY = eINSTANCE.getClause_Body();

		/**
		 * The meta object literal for the '<em><b>Body Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__BODY_OUTPUT = eINSTANCE.getClause_BodyOutput();

		/**
		 * The meta object literal for the '<em><b>Decider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__DECIDER = eINSTANCE.getClause_Decider();

		/**
		 * The meta object literal for the '<em><b>Predecessor Clause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__PREDECESSOR_CLAUSE = eINSTANCE.getClause_PredecessorClause();

		/**
		 * The meta object literal for the '<em><b>Successor Clause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__SUCCESSOR_CLAUSE = eINSTANCE.getClause_SuccessorClause();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__TEST = eINSTANCE.getClause_Test();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ClearAssociationActionImpl <em>Clear Association Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ClearAssociationActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getClearAssociationAction()
		 * @generated
		 */
		EClass CLEAR_ASSOCIATION_ACTION = eINSTANCE.getClearAssociationAction();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEAR_ASSOCIATION_ACTION__ASSOCIATION = eINSTANCE.getClearAssociationAction_Association();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEAR_ASSOCIATION_ACTION__OBJECT = eINSTANCE.getClearAssociationAction_Object();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ClearStructuralFeatureActionImpl <em>Clear Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ClearStructuralFeatureActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getClearStructuralFeatureAction()
		 * @generated
		 */
		EClass CLEAR_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getClearStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT = eINSTANCE.getClearStructuralFeatureAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ClearVariableActionImpl <em>Clear Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ClearVariableActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getClearVariableAction()
		 * @generated
		 */
		EClass CLEAR_VARIABLE_ACTION = eINSTANCE.getClearVariableAction();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ConditionalNodeImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getConditionalNode()
		 * @generated
		 */
		EClass CONDITIONAL_NODE = eINSTANCE.getConditionalNode();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__CLAUSE = eINSTANCE.getConditionalNode_Clause();

		/**
		 * The meta object literal for the '<em><b>Is Assured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_NODE__IS_ASSURED = eINSTANCE.getConditionalNode_IsAssured();

		/**
		 * The meta object literal for the '<em><b>Is Determinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_NODE__IS_DETERMINATE = eINSTANCE.getConditionalNode_IsDeterminate();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__RESULT = eINSTANCE.getConditionalNode_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.CreateLinkActionImpl <em>Create Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.CreateLinkActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getCreateLinkAction()
		 * @generated
		 */
		EClass CREATE_LINK_ACTION = eINSTANCE.getCreateLinkAction();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.LinkEndCreationDataImpl <em>Link End Creation Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.LinkEndCreationDataImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getLinkEndCreationData()
		 * @generated
		 */
		EClass LINK_END_CREATION_DATA = eINSTANCE.getLinkEndCreationData();

		/**
		 * The meta object literal for the '<em><b>Insert At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_CREATION_DATA__INSERT_AT = eINSTANCE.getLinkEndCreationData_InsertAt();

		/**
		 * The meta object literal for the '<em><b>Is Replace All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_END_CREATION_DATA__IS_REPLACE_ALL = eINSTANCE.getLinkEndCreationData_IsReplaceAll();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.CreateLinkObjectActionImpl <em>Create Link Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.CreateLinkObjectActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getCreateLinkObjectAction()
		 * @generated
		 */
		EClass CREATE_LINK_OBJECT_ACTION = eINSTANCE.getCreateLinkObjectAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_LINK_OBJECT_ACTION__RESULT = eINSTANCE.getCreateLinkObjectAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.CreateObjectActionImpl <em>Create Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.CreateObjectActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getCreateObjectAction()
		 * @generated
		 */
		EClass CREATE_OBJECT_ACTION = eINSTANCE.getCreateObjectAction();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_OBJECT_ACTION__CLASSIFIER = eINSTANCE.getCreateObjectAction_Classifier();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_OBJECT_ACTION__RESULT = eINSTANCE.getCreateObjectAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.DestroyLinkActionImpl <em>Destroy Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.DestroyLinkActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getDestroyLinkAction()
		 * @generated
		 */
		EClass DESTROY_LINK_ACTION = eINSTANCE.getDestroyLinkAction();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.LinkEndDestructionDataImpl <em>Link End Destruction Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.LinkEndDestructionDataImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getLinkEndDestructionData()
		 * @generated
		 */
		EClass LINK_END_DESTRUCTION_DATA = eINSTANCE.getLinkEndDestructionData();

		/**
		 * The meta object literal for the '<em><b>Destroy At</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_END_DESTRUCTION_DATA__DESTROY_AT = eINSTANCE.getLinkEndDestructionData_DestroyAt();

		/**
		 * The meta object literal for the '<em><b>Is Destroy Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES = eINSTANCE.getLinkEndDestructionData_IsDestroyDuplicates();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.DestroyObjectActionImpl <em>Destroy Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.DestroyObjectActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getDestroyObjectAction()
		 * @generated
		 */
		EClass DESTROY_OBJECT_ACTION = eINSTANCE.getDestroyObjectAction();

		/**
		 * The meta object literal for the '<em><b>Is Destroy Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS = eINSTANCE.getDestroyObjectAction_IsDestroyLinks();

		/**
		 * The meta object literal for the '<em><b>Is Destroy Owned Objects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS = eINSTANCE.getDestroyObjectAction_IsDestroyOwnedObjects();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTROY_OBJECT_ACTION__TARGET = eINSTANCE.getDestroyObjectAction_Target();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ExpansionNodeImpl <em>Expansion Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ExpansionNodeImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getExpansionNode()
		 * @generated
		 */
		EClass EXPANSION_NODE = eINSTANCE.getExpansionNode();

		/**
		 * The meta object literal for the '<em><b>Region As Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_NODE__REGION_AS_INPUT = eINSTANCE.getExpansionNode_RegionAsInput();

		/**
		 * The meta object literal for the '<em><b>Region As Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_NODE__REGION_AS_OUTPUT = eINSTANCE.getExpansionNode_RegionAsOutput();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ExpansionRegionImpl <em>Expansion Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ExpansionRegionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getExpansionRegion()
		 * @generated
		 */
		EClass EXPANSION_REGION = eINSTANCE.getExpansionRegion();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPANSION_REGION__MODE = eINSTANCE.getExpansionRegion_Mode();

		/**
		 * The meta object literal for the '<em><b>Output Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_REGION__OUTPUT_ELEMENT = eINSTANCE.getExpansionRegion_OutputElement();

		/**
		 * The meta object literal for the '<em><b>Input Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPANSION_REGION__INPUT_ELEMENT = eINSTANCE.getExpansionRegion_InputElement();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.LoopNodeImpl <em>Loop Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.LoopNodeImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getLoopNode()
		 * @generated
		 */
		EClass LOOP_NODE = eINSTANCE.getLoopNode();

		/**
		 * The meta object literal for the '<em><b>Body Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__BODY_OUTPUT = eINSTANCE.getLoopNode_BodyOutput();

		/**
		 * The meta object literal for the '<em><b>Body Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__BODY_PART = eINSTANCE.getLoopNode_BodyPart();

		/**
		 * The meta object literal for the '<em><b>Decider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__DECIDER = eINSTANCE.getLoopNode_Decider();

		/**
		 * The meta object literal for the '<em><b>Is Tested First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_NODE__IS_TESTED_FIRST = eINSTANCE.getLoopNode_IsTestedFirst();

		/**
		 * The meta object literal for the '<em><b>Loop Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__LOOP_VARIABLE = eINSTANCE.getLoopNode_LoopVariable();

		/**
		 * The meta object literal for the '<em><b>Loop Variable Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__LOOP_VARIABLE_INPUT = eINSTANCE.getLoopNode_LoopVariableInput();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__RESULT = eINSTANCE.getLoopNode_Result();

		/**
		 * The meta object literal for the '<em><b>Setup Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__SETUP_PART = eINSTANCE.getLoopNode_SetupPart();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_NODE__TEST = eINSTANCE.getLoopNode_Test();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.OpaqueActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getOpaqueAction()
		 * @generated
		 */
		EClass OPAQUE_ACTION = eINSTANCE.getOpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_ACTION__BODY = eINSTANCE.getOpaqueAction_Body();

		/**
		 * The meta object literal for the '<em><b>Input Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION__INPUT_VALUE = eINSTANCE.getOpaqueAction_InputValue();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_ACTION__LANGUAGE = eINSTANCE.getOpaqueAction_Language();

		/**
		 * The meta object literal for the '<em><b>Output Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION__OUTPUT_VALUE = eINSTANCE.getOpaqueAction_OutputValue();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.RaiseExceptionActionImpl <em>Raise Exception Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.RaiseExceptionActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getRaiseExceptionAction()
		 * @generated
		 */
		EClass RAISE_EXCEPTION_ACTION = eINSTANCE.getRaiseExceptionAction();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXCEPTION_ACTION__EXCEPTION = eINSTANCE.getRaiseExceptionAction_Exception();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReadExtentActionImpl <em>Read Extent Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReadExtentActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReadExtentAction()
		 * @generated
		 */
		EClass READ_EXTENT_ACTION = eINSTANCE.getReadExtentAction();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_EXTENT_ACTION__CLASSIFIER = eINSTANCE.getReadExtentAction_Classifier();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_EXTENT_ACTION__RESULT = eINSTANCE.getReadExtentAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReadIsClassifiedObjectActionImpl <em>Read Is Classified Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReadIsClassifiedObjectActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReadIsClassifiedObjectAction()
		 * @generated
		 */
		EClass READ_IS_CLASSIFIED_OBJECT_ACTION = eINSTANCE.getReadIsClassifiedObjectAction();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER = eINSTANCE.getReadIsClassifiedObjectAction_Classifier();

		/**
		 * The meta object literal for the '<em><b>Is Direct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT = eINSTANCE.getReadIsClassifiedObjectAction_IsDirect();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT = eINSTANCE.getReadIsClassifiedObjectAction_Object();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT = eINSTANCE.getReadIsClassifiedObjectAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReadLinkActionImpl <em>Read Link Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReadLinkActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReadLinkAction()
		 * @generated
		 */
		EClass READ_LINK_ACTION = eINSTANCE.getReadLinkAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_ACTION__RESULT = eINSTANCE.getReadLinkAction_Result();

		/**
		 * The meta object literal for the '<em><b>Open End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation READ_LINK_ACTION___OPEN_END = eINSTANCE.getReadLinkAction__OpenEnd();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReadLinkObjectEndActionImpl <em>Read Link Object End Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReadLinkObjectEndActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReadLinkObjectEndAction()
		 * @generated
		 */
		EClass READ_LINK_OBJECT_END_ACTION = eINSTANCE.getReadLinkObjectEndAction();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_ACTION__END = eINSTANCE.getReadLinkObjectEndAction_End();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_ACTION__OBJECT = eINSTANCE.getReadLinkObjectEndAction_Object();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_ACTION__RESULT = eINSTANCE.getReadLinkObjectEndAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReadLinkObjectEndQualifierActionImpl <em>Read Link Object End Qualifier Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReadLinkObjectEndQualifierActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReadLinkObjectEndQualifierAction()
		 * @generated
		 */
		EClass READ_LINK_OBJECT_END_QUALIFIER_ACTION = eINSTANCE.getReadLinkObjectEndQualifierAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT = eINSTANCE.getReadLinkObjectEndQualifierAction_Object();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER = eINSTANCE.getReadLinkObjectEndQualifierAction_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT = eINSTANCE.getReadLinkObjectEndQualifierAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReadSelfActionImpl <em>Read Self Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReadSelfActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReadSelfAction()
		 * @generated
		 */
		EClass READ_SELF_ACTION = eINSTANCE.getReadSelfAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_SELF_ACTION__RESULT = eINSTANCE.getReadSelfAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReadStructuralFeatureActionImpl <em>Read Structural Feature Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReadStructuralFeatureActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReadStructuralFeatureAction()
		 * @generated
		 */
		EClass READ_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getReadStructuralFeatureAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_STRUCTURAL_FEATURE_ACTION__RESULT = eINSTANCE.getReadStructuralFeatureAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReadVariableActionImpl <em>Read Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReadVariableActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReadVariableAction()
		 * @generated
		 */
		EClass READ_VARIABLE_ACTION = eINSTANCE.getReadVariableAction();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_VARIABLE_ACTION__RESULT = eINSTANCE.getReadVariableAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReclassifyObjectActionImpl <em>Reclassify Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReclassifyObjectActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReclassifyObjectAction()
		 * @generated
		 */
		EClass RECLASSIFY_OBJECT_ACTION = eINSTANCE.getReclassifyObjectAction();

		/**
		 * The meta object literal for the '<em><b>Is Replace All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL = eINSTANCE.getReclassifyObjectAction_IsReplaceAll();

		/**
		 * The meta object literal for the '<em><b>New Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER = eINSTANCE.getReclassifyObjectAction_NewClassifier();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLASSIFY_OBJECT_ACTION__OBJECT = eINSTANCE.getReclassifyObjectAction_Object();

		/**
		 * The meta object literal for the '<em><b>Old Classifier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER = eINSTANCE.getReclassifyObjectAction_OldClassifier();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReduceActionImpl <em>Reduce Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReduceActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReduceAction()
		 * @generated
		 */
		EClass REDUCE_ACTION = eINSTANCE.getReduceAction();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__COLLECTION = eINSTANCE.getReduceAction_Collection();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCE_ACTION__IS_ORDERED = eINSTANCE.getReduceAction_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Reducer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__REDUCER = eINSTANCE.getReduceAction_Reducer();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCE_ACTION__RESULT = eINSTANCE.getReduceAction_Result();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.RemoveStructuralFeatureValueActionImpl <em>Remove Structural Feature Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.RemoveStructuralFeatureValueActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getRemoveStructuralFeatureValueAction()
		 * @generated
		 */
		EClass REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION = eINSTANCE.getRemoveStructuralFeatureValueAction();

		/**
		 * The meta object literal for the '<em><b>Is Remove Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES = eINSTANCE.getRemoveStructuralFeatureValueAction_IsRemoveDuplicates();

		/**
		 * The meta object literal for the '<em><b>Remove At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT = eINSTANCE.getRemoveStructuralFeatureValueAction_RemoveAt();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.RemoveVariableValueActionImpl <em>Remove Variable Value Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.RemoveVariableValueActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getRemoveVariableValueAction()
		 * @generated
		 */
		EClass REMOVE_VARIABLE_VALUE_ACTION = eINSTANCE.getRemoveVariableValueAction();

		/**
		 * The meta object literal for the '<em><b>Is Remove Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES = eINSTANCE.getRemoveVariableValueAction_IsRemoveDuplicates();

		/**
		 * The meta object literal for the '<em><b>Remove At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT = eINSTANCE.getRemoveVariableValueAction_RemoveAt();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ReplyActionImpl <em>Reply Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ReplyActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getReplyAction()
		 * @generated
		 */
		EClass REPLY_ACTION = eINSTANCE.getReplyAction();

		/**
		 * The meta object literal for the '<em><b>Reply To Call</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_ACTION__REPLY_TO_CALL = eINSTANCE.getReplyAction_ReplyToCall();

		/**
		 * The meta object literal for the '<em><b>Reply Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_ACTION__REPLY_VALUE = eINSTANCE.getReplyAction_ReplyValue();

		/**
		 * The meta object literal for the '<em><b>Return Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLY_ACTION__RETURN_INFORMATION = eINSTANCE.getReplyAction_ReturnInformation();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.SendObjectActionImpl <em>Send Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.SendObjectActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getSendObjectAction()
		 * @generated
		 */
		EClass SEND_OBJECT_ACTION = eINSTANCE.getSendObjectAction();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_OBJECT_ACTION__REQUEST = eINSTANCE.getSendObjectAction_Request();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_OBJECT_ACTION__TARGET = eINSTANCE.getSendObjectAction_Target();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.SendSignalActionImpl <em>Send Signal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.SendSignalActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getSendSignalAction()
		 * @generated
		 */
		EClass SEND_SIGNAL_ACTION = eINSTANCE.getSendSignalAction();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_SIGNAL_ACTION__SIGNAL = eINSTANCE.getSendSignalAction_Signal();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_SIGNAL_ACTION__TARGET = eINSTANCE.getSendSignalAction_Target();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.SequenceNodeImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getSequenceNode()
		 * @generated
		 */
		EClass SEQUENCE_NODE = eINSTANCE.getSequenceNode();

		/**
		 * The meta object literal for the '<em><b>Executable Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_NODE__EXECUTABLE_NODE = eINSTANCE.getSequenceNode_ExecutableNode();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.StartClassifierBehaviorActionImpl <em>Start Classifier Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.StartClassifierBehaviorActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getStartClassifierBehaviorAction()
		 * @generated
		 */
		EClass START_CLASSIFIER_BEHAVIOR_ACTION = eINSTANCE.getStartClassifierBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT = eINSTANCE.getStartClassifierBehaviorAction_Object();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.StartObjectBehaviorActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getStartObjectBehaviorAction()
		 * @generated
		 */
		EClass START_OBJECT_BEHAVIOR_ACTION = eINSTANCE.getStartObjectBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_OBJECT_BEHAVIOR_ACTION__OBJECT = eINSTANCE.getStartObjectBehaviorAction_Object();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation START_OBJECT_BEHAVIOR_ACTION___BEHAVIOR = eINSTANCE.getStartObjectBehaviorAction__Behavior();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.TestIdentityActionImpl <em>Test Identity Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.TestIdentityActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getTestIdentityAction()
		 * @generated
		 */
		EClass TEST_IDENTITY_ACTION = eINSTANCE.getTestIdentityAction();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IDENTITY_ACTION__FIRST = eINSTANCE.getTestIdentityAction_First();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IDENTITY_ACTION__RESULT = eINSTANCE.getTestIdentityAction_Result();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_IDENTITY_ACTION__SECOND = eINSTANCE.getTestIdentityAction_Second();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.UnmarshallActionImpl <em>Unmarshall Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.UnmarshallActionImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getUnmarshallAction()
		 * @generated
		 */
		EClass UNMARSHALL_ACTION = eINSTANCE.getUnmarshallAction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNMARSHALL_ACTION__OBJECT = eINSTANCE.getUnmarshallAction_Object();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNMARSHALL_ACTION__RESULT = eINSTANCE.getUnmarshallAction_Result();

		/**
		 * The meta object literal for the '<em><b>Unmarshall Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNMARSHALL_ACTION__UNMARSHALL_TYPE = eINSTANCE.getUnmarshallAction_UnmarshallType();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.ValuePinImpl <em>Value Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.ValuePinImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getValuePin()
		 * @generated
		 */
		EClass VALUE_PIN = eINSTANCE.getValuePin();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PIN__VALUE = eINSTANCE.getValuePin_Value();

		/**
		 * The meta object literal for the '{@link uml.actions.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.impl.StructuredActivityNodeImpl
		 * @see uml.actions.impl.ActionsPackageImpl#getStructuredActivityNode()
		 * @generated
		 */
		EClass STRUCTURED_ACTIVITY_NODE = eINSTANCE.getStructuredActivityNode();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__VARIABLE = eINSTANCE.getStructuredActivityNode_Variable();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__EDGE = eINSTANCE.getStructuredActivityNode_Edge();

		/**
		 * The meta object literal for the '<em><b>Must Isolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE = eINSTANCE.getStructuredActivityNode_MustIsolate();

		/**
		 * The meta object literal for the '<em><b>Structured Node Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT = eINSTANCE.getStructuredActivityNode_StructuredNodeInput();

		/**
		 * The meta object literal for the '<em><b>Structured Node Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT = eINSTANCE.getStructuredActivityNode_StructuredNodeOutput();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_ACTIVITY_NODE__NODE = eINSTANCE.getStructuredActivityNode_Node();

		/**
		 * The meta object literal for the '<em><b>Source Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURED_ACTIVITY_NODE___SOURCE_NODES = eINSTANCE.getStructuredActivityNode__SourceNodes();

		/**
		 * The meta object literal for the '<em><b>Target Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRUCTURED_ACTIVITY_NODE___TARGET_NODES = eINSTANCE.getStructuredActivityNode__TargetNodes();

		/**
		 * The meta object literal for the '{@link uml.actions.ExpansionKind <em>Expansion Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.actions.ExpansionKind
		 * @see uml.actions.impl.ActionsPackageImpl#getExpansionKind()
		 * @generated
		 */
		EEnum EXPANSION_KIND = eINSTANCE.getExpansionKind();

	}

} //ActionsPackage
