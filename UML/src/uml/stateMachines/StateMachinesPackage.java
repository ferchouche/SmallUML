/**
 */
package uml.stateMachines;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uml.commonBehavior.CommonBehaviorPackage;

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
 * @see uml.stateMachines.StateMachinesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StateMachines'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface StateMachinesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stateMachines";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/stateMachines.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.stateMachines";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateMachinesPackage eINSTANCE = uml.stateMachines.impl.StateMachinesPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.VertexImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__CONTAINER = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Containing State Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___CONTAINING_STATE_MACHINE = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___INCOMING = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___OUTGOING = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Contained In State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___IS_CONTAINED_IN_STATE__STATE = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Contained In Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___IS_CONTAINED_IN_REGION__REGION = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.ConnectionPointReferenceImpl <em>Connection Point Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.ConnectionPointReferenceImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getConnectionPointReference()
	 * @generated
	 */
	int CONNECTION_POINT_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__OWNED_COMMENT = VERTEX__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__OWNED_ELEMENT = VERTEX__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__OWNER = VERTEX__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__NAME_EXPRESSION = VERTEX__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__NAMESPACE = VERTEX__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__QUALIFIED_NAME = VERTEX__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__VISIBILITY = VERTEX__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__CLIENT_DEPENDENCY = VERTEX__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__CONTAINER = VERTEX__CONTAINER;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__OUTGOING = VERTEX__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__INCOMING = VERTEX__INCOMING;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__STATE = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__ENTRY = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE__EXIT = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Point Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___ALL_OWNED_ELEMENTS = VERTEX___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___MUST_BE_OWNED = VERTEX___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___ALL_NAMESPACES = VERTEX___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___ALL_OWNING_PACKAGES = VERTEX___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VERTEX___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___QUALIFIED_NAME = VERTEX___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___SEPARATOR = VERTEX___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___CLIENT_DEPENDENCY = VERTEX___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Containing State Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___CONTAINING_STATE_MACHINE = VERTEX___CONTAINING_STATE_MACHINE;

	/**
	 * The operation id for the '<em>Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___INCOMING = VERTEX___INCOMING;

	/**
	 * The operation id for the '<em>Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___OUTGOING = VERTEX___OUTGOING;

	/**
	 * The operation id for the '<em>Is Contained In State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___IS_CONTAINED_IN_STATE__STATE = VERTEX___IS_CONTAINED_IN_STATE__STATE;

	/**
	 * The operation id for the '<em>Is Contained In Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE___IS_CONTAINED_IN_REGION__REGION = VERTEX___IS_CONTAINED_IN_REGION__REGION;

	/**
	 * The number of operations of the '<em>Connection Point Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_REFERENCE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.RegionImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__OWNED_COMMENT = CommonStructurePackage.NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__OWNED_ELEMENT = CommonStructurePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__OWNER = CommonStructurePackage.NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = CommonStructurePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME_EXPRESSION = CommonStructurePackage.NAMESPACE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAMESPACE = CommonStructurePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__QUALIFIED_NAME = CommonStructurePackage.NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__VISIBILITY = CommonStructurePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ELEMENT_IMPORT = CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__MEMBER = CommonStructurePackage.NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__OWNED_MEMBER = CommonStructurePackage.NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__OWNED_RULE = CommonStructurePackage.NAMESPACE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PACKAGE_IMPORT = CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__IS_LEAF = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__REDEFINED_ELEMENT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__REDEFINITION_CONTEXT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extended Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__EXTENDED_REGION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__STATE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__STATE_MACHINE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TRANSITION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SUBVERTEX = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___MUST_BE_OWNED = CommonStructurePackage.NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ALL_NAMESPACES = CommonStructurePackage.NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMESPACE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMESPACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___QUALIFIED_NAME = CommonStructurePackage.NAMESPACE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___SEPARATOR = CommonStructurePackage.NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___EXCLUDE_COLLISIONS__ELIST = CommonStructurePackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonStructurePackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IMPORT_MEMBERS__ELIST = CommonStructurePackage.NAMESPACE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___MEMBERS_ARE_DISTINGUISHABLE = CommonStructurePackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Belongs To Psm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___BELONGS_TO_PSM = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Containing State Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___CONTAINING_STATE_MACHINE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Redefinition Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION___REDEFINITION_CONTEXT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.StateImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNED_COMMENT = CommonStructurePackage.NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNED_ELEMENT = CommonStructurePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNER = CommonStructurePackage.NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = CommonStructurePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME_EXPRESSION = CommonStructurePackage.NAMESPACE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAMESPACE = CommonStructurePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__QUALIFIED_NAME = CommonStructurePackage.NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VISIBILITY = CommonStructurePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ELEMENT_IMPORT = CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__MEMBER = CommonStructurePackage.NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNED_MEMBER = CommonStructurePackage.NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNED_RULE = CommonStructurePackage.NAMESPACE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PACKAGE_IMPORT = CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_LEAF = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REDEFINED_ELEMENT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REDEFINITION_CONTEXT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONTAINER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONNECTION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONNECTION_POINT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Submachine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUBMACHINE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DEFERRABLE_TRIGGER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DO_ACTIVITY = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_COMPOSITE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_ORTHOGONAL = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_SIMPLE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_SUBMACHINE_STATE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Redefined State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REDEFINED_STATE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>State Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_INVARIANT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REGION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 20;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___MUST_BE_OWNED = CommonStructurePackage.NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ALL_NAMESPACES = CommonStructurePackage.NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMESPACE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMESPACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___QUALIFIED_NAME = CommonStructurePackage.NAMESPACE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___SEPARATOR = CommonStructurePackage.NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___EXCLUDE_COLLISIONS__ELIST = CommonStructurePackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonStructurePackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IMPORT_MEMBERS__ELIST = CommonStructurePackage.NAMESPACE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___MEMBERS_ARE_DISTINGUISHABLE = CommonStructurePackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Containing State Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___CONTAINING_STATE_MACHINE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___INCOMING = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___OUTGOING = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Contained In State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_CONTAINED_IN_STATE__STATE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Contained In Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_CONTAINED_IN_REGION__REGION = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Composite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_COMPOSITE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Orthogonal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_ORTHOGONAL = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_SIMPLE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Submachine State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___IS_SUBMACHINE_STATE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Redefinition Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___REDEFINITION_CONTEXT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 11;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 12;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.PseudostateImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getPseudostate()
	 * @generated
	 */
	int PSEUDOSTATE = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OWNED_COMMENT = VERTEX__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OWNED_ELEMENT = VERTEX__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OWNER = VERTEX__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__NAME_EXPRESSION = VERTEX__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__NAMESPACE = VERTEX__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__QUALIFIED_NAME = VERTEX__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__VISIBILITY = VERTEX__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__CLIENT_DEPENDENCY = VERTEX__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__CONTAINER = VERTEX__CONTAINER;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OUTGOING = VERTEX__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__INCOMING = VERTEX__INCOMING;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__KIND = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__STATE_MACHINE = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__STATE = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___ALL_OWNED_ELEMENTS = VERTEX___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___MUST_BE_OWNED = VERTEX___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___ALL_NAMESPACES = VERTEX___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___ALL_OWNING_PACKAGES = VERTEX___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VERTEX___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___QUALIFIED_NAME = VERTEX___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___SEPARATOR = VERTEX___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___CLIENT_DEPENDENCY = VERTEX___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Containing State Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___CONTAINING_STATE_MACHINE = VERTEX___CONTAINING_STATE_MACHINE;

	/**
	 * The operation id for the '<em>Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___INCOMING = VERTEX___INCOMING;

	/**
	 * The operation id for the '<em>Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___OUTGOING = VERTEX___OUTGOING;

	/**
	 * The operation id for the '<em>Is Contained In State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___IS_CONTAINED_IN_STATE__STATE = VERTEX___IS_CONTAINED_IN_STATE__STATE;

	/**
	 * The operation id for the '<em>Is Contained In Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE___IS_CONTAINED_IN_REGION__REGION = VERTEX___IS_CONTAINED_IN_REGION__REGION;

	/**
	 * The number of operations of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.StateMachineImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_COMMENT = CommonBehaviorPackage.BEHAVIOR__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_ELEMENT = CommonBehaviorPackage.BEHAVIOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNER = CommonBehaviorPackage.BEHAVIOR__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = CommonBehaviorPackage.BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME_EXPRESSION = CommonBehaviorPackage.BEHAVIOR__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAMESPACE = CommonBehaviorPackage.BEHAVIOR__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__QUALIFIED_NAME = CommonBehaviorPackage.BEHAVIOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__VISIBILITY = CommonBehaviorPackage.BEHAVIOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CLIENT_DEPENDENCY = CommonBehaviorPackage.BEHAVIOR__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__ELEMENT_IMPORT = CommonBehaviorPackage.BEHAVIOR__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__IMPORTED_MEMBER = CommonBehaviorPackage.BEHAVIOR__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__MEMBER = CommonBehaviorPackage.BEHAVIOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_MEMBER = CommonBehaviorPackage.BEHAVIOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_RULE = CommonBehaviorPackage.BEHAVIOR__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PACKAGE_IMPORT = CommonBehaviorPackage.BEHAVIOR__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__IS_LEAF = CommonBehaviorPackage.BEHAVIOR__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REDEFINED_ELEMENT = CommonBehaviorPackage.BEHAVIOR__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REDEFINITION_CONTEXT = CommonBehaviorPackage.BEHAVIOR__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNING_TEMPLATE_PARAMETER = CommonBehaviorPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TEMPLATE_PARAMETER = CommonBehaviorPackage.BEHAVIOR__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PACKAGE = CommonBehaviorPackage.BEHAVIOR__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TEMPLATE_BINDING = CommonBehaviorPackage.BEHAVIOR__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE = CommonBehaviorPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__SUBSTITUTION = CommonBehaviorPackage.BEHAVIOR__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__FEATURE = CommonBehaviorPackage.BEHAVIOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__POWERTYPE_EXTENT = CommonBehaviorPackage.BEHAVIOR__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__GENERALIZATION = CommonBehaviorPackage.BEHAVIOR__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__ATTRIBUTE = CommonBehaviorPackage.BEHAVIOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__COLLABORATION_USE = CommonBehaviorPackage.BEHAVIOR__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__GENERAL = CommonBehaviorPackage.BEHAVIOR__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INHERITED_MEMBER = CommonBehaviorPackage.BEHAVIOR__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__IS_ABSTRACT = CommonBehaviorPackage.BEHAVIOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__IS_FINAL_SPECIALIZATION = CommonBehaviorPackage.BEHAVIOR__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_USE_CASE = CommonBehaviorPackage.BEHAVIOR__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__USE_CASE = CommonBehaviorPackage.BEHAVIOR__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REDEFINED_CLASSIFIER = CommonBehaviorPackage.BEHAVIOR__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REPRESENTATION = CommonBehaviorPackage.BEHAVIOR__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_ATTRIBUTE = CommonBehaviorPackage.BEHAVIOR__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_CONNECTOR = CommonBehaviorPackage.BEHAVIOR__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PART = CommonBehaviorPackage.BEHAVIOR__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__ROLE = CommonBehaviorPackage.BEHAVIOR__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_PORT = CommonBehaviorPackage.BEHAVIOR__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INTERFACE_REALIZATION = CommonBehaviorPackage.BEHAVIOR__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CLASSIFIER_BEHAVIOR = CommonBehaviorPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_BEHAVIOR = CommonBehaviorPackage.BEHAVIOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_OPERATION = CommonBehaviorPackage.BEHAVIOR__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__EXTENSION = CommonBehaviorPackage.BEHAVIOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__IS_ACTIVE = CommonBehaviorPackage.BEHAVIOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NESTED_CLASSIFIER = CommonBehaviorPackage.BEHAVIOR__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_RECEPTION = CommonBehaviorPackage.BEHAVIOR__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__SUPER_CLASS = CommonBehaviorPackage.BEHAVIOR__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__SPECIFICATION = CommonBehaviorPackage.BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CONTEXT = CommonBehaviorPackage.BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__IS_REENTRANT = CommonBehaviorPackage.BEHAVIOR__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_PARAMETER = CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__OWNED_PARAMETER_SET = CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__POSTCONDITION = CommonBehaviorPackage.BEHAVIOR__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PRECONDITION = CommonBehaviorPackage.BEHAVIOR__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REDEFINED_BEHAVIOR = CommonBehaviorPackage.BEHAVIOR__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Extended State Machine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__EXTENDED_STATE_MACHINE = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REGION = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Submachine State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__SUBMACHINE_STATE = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__CONNECTION_POINT = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_OWNED_ELEMENTS = CommonBehaviorPackage.BEHAVIOR___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___MUST_BE_OWNED = CommonBehaviorPackage.BEHAVIOR___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_NAMESPACES = CommonBehaviorPackage.BEHAVIOR___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_OWNING_PACKAGES = CommonBehaviorPackage.BEHAVIOR___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonBehaviorPackage.BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___QUALIFIED_NAME = CommonBehaviorPackage.BEHAVIOR___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___SEPARATOR = CommonBehaviorPackage.BEHAVIOR___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___CLIENT_DEPENDENCY = CommonBehaviorPackage.BEHAVIOR___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___EXCLUDE_COLLISIONS__ELIST = CommonBehaviorPackage.BEHAVIOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonBehaviorPackage.BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___IMPORT_MEMBERS__ELIST = CommonBehaviorPackage.BEHAVIOR___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___IMPORTED_MEMBER = CommonBehaviorPackage.BEHAVIOR___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___MEMBERS_ARE_DISTINGUISHABLE = CommonBehaviorPackage.BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CommonBehaviorPackage.BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CommonBehaviorPackage.BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonBehaviorPackage.BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___IS_TEMPLATE_PARAMETER = CommonBehaviorPackage.BEHAVIOR___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___CONFORMS_TO__TYPE = CommonBehaviorPackage.BEHAVIOR___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___IS_TEMPLATE = CommonBehaviorPackage.BEHAVIOR___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___PARAMETERABLE_ELEMENTS = CommonBehaviorPackage.BEHAVIOR___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_FEATURES = CommonBehaviorPackage.BEHAVIOR___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_PARENTS = CommonBehaviorPackage.BEHAVIOR___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___GENERAL = CommonBehaviorPackage.BEHAVIOR___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___HAS_VISIBILITY_OF__NAMEDELEMENT = CommonBehaviorPackage.BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___INHERIT__ELIST = CommonBehaviorPackage.BEHAVIOR___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___INHERITABLE_MEMBERS__CLASSIFIER = CommonBehaviorPackage.BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___INHERITED_MEMBER = CommonBehaviorPackage.BEHAVIOR___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___MAY_SPECIALIZE_TYPE__CLASSIFIER = CommonBehaviorPackage.BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___PARENTS = CommonBehaviorPackage.BEHAVIOR___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___DIRECTLY_REALIZED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___DIRECTLY_USED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_REALIZED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_USED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___IS_SUBSTITUTABLE_FOR__CLASSIFIER = CommonBehaviorPackage.BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_ATTRIBUTES = CommonBehaviorPackage.BEHAVIOR___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_SLOTTABLE_FEATURES = CommonBehaviorPackage.BEHAVIOR___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___PART = CommonBehaviorPackage.BEHAVIOR___PART;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ALL_ROLES = CommonBehaviorPackage.BEHAVIOR___ALL_ROLES;

	/**
	 * The operation id for the '<em>Owned Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___OWNED_PORT = CommonBehaviorPackage.BEHAVIOR___OWNED_PORT;

	/**
	 * The operation id for the '<em>Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___EXTENSION = CommonBehaviorPackage.BEHAVIOR___EXTENSION;

	/**
	 * The operation id for the '<em>Super Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___SUPER_CLASS = CommonBehaviorPackage.BEHAVIOR___SUPER_CLASS;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___CONTEXT = CommonBehaviorPackage.BEHAVIOR___CONTEXT;

	/**
	 * The operation id for the '<em>Behaviored Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___BEHAVIORED_CLASSIFIER__ELEMENT = CommonBehaviorPackage.BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___INPUT_PARAMETERS = CommonBehaviorPackage.BEHAVIOR___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___OUTPUT_PARAMETERS = CommonBehaviorPackage.BEHAVIOR___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Lca</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___LCA__VERTEX_VERTEX = CommonBehaviorPackage.BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___ANCESTOR__VERTEX_VERTEX = CommonBehaviorPackage.BEHAVIOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Lca State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE___LCA_STATE__VERTEX_VERTEX = CommonBehaviorPackage.BEHAVIOR_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = CommonBehaviorPackage.BEHAVIOR_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.TransitionImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNED_COMMENT = CommonStructurePackage.NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNED_ELEMENT = CommonStructurePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNER = CommonStructurePackage.NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = CommonStructurePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME_EXPRESSION = CommonStructurePackage.NAMESPACE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAMESPACE = CommonStructurePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__QUALIFIED_NAME = CommonStructurePackage.NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__VISIBILITY = CommonStructurePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ELEMENT_IMPORT = CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__MEMBER = CommonStructurePackage.NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNED_MEMBER = CommonStructurePackage.NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OWNED_RULE = CommonStructurePackage.NAMESPACE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PACKAGE_IMPORT = CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IS_LEAF = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REDEFINED_ELEMENT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REDEFINITION_CONTEXT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EFFECT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__KIND = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Redefined Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REDEFINED_TRANSITION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONTAINER = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___MUST_BE_OWNED = CommonStructurePackage.NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ALL_NAMESPACES = CommonStructurePackage.NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMESPACE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMESPACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___QUALIFIED_NAME = CommonStructurePackage.NAMESPACE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___SEPARATOR = CommonStructurePackage.NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___EXCLUDE_COLLISIONS__ELIST = CommonStructurePackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonStructurePackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IMPORT_MEMBERS__ELIST = CommonStructurePackage.NAMESPACE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___MEMBERS_ARE_DISTINGUISHABLE = CommonStructurePackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Containing State Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___CONTAINING_STATE_MACHINE = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Redefinition Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___REDEFINITION_CONTEXT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.FinalStateImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OWNED_COMMENT = STATE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OWNED_ELEMENT = STATE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OWNER = STATE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME_EXPRESSION = STATE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAMESPACE = STATE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__QUALIFIED_NAME = STATE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__VISIBILITY = STATE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CLIENT_DEPENDENCY = STATE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ELEMENT_IMPORT = STATE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IMPORTED_MEMBER = STATE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__MEMBER = STATE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OWNED_MEMBER = STATE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OWNED_RULE = STATE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__PACKAGE_IMPORT = STATE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_LEAF = STATE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__REDEFINED_ELEMENT = STATE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__REDEFINITION_CONTEXT = STATE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CONTAINER = STATE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CONNECTION = STATE__CONNECTION;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__CONNECTION_POINT = STATE__CONNECTION_POINT;

	/**
	 * The feature id for the '<em><b>Submachine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__SUBMACHINE = STATE__SUBMACHINE;

	/**
	 * The feature id for the '<em><b>Deferrable Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DEFERRABLE_TRIGGER = STATE__DEFERRABLE_TRIGGER;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DO_ACTIVITY = STATE__DO_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__EXIT = STATE__EXIT;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_COMPOSITE = STATE__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Is Orthogonal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_ORTHOGONAL = STATE__IS_ORTHOGONAL;

	/**
	 * The feature id for the '<em><b>Is Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_SIMPLE = STATE__IS_SIMPLE;

	/**
	 * The feature id for the '<em><b>Is Submachine State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__IS_SUBMACHINE_STATE = STATE__IS_SUBMACHINE_STATE;

	/**
	 * The feature id for the '<em><b>Redefined State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__REDEFINED_STATE = STATE__REDEFINED_STATE;

	/**
	 * The feature id for the '<em><b>State Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__STATE_INVARIANT = STATE__STATE_INVARIANT;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__REGION = STATE__REGION;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ALL_OWNED_ELEMENTS = STATE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___MUST_BE_OWNED = STATE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ALL_NAMESPACES = STATE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___ALL_OWNING_PACKAGES = STATE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STATE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___QUALIFIED_NAME = STATE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___SEPARATOR = STATE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___CLIENT_DEPENDENCY = STATE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___EXCLUDE_COLLISIONS__ELIST = STATE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = STATE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IMPORT_MEMBERS__ELIST = STATE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IMPORTED_MEMBER = STATE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___MEMBERS_ARE_DISTINGUISHABLE = STATE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STATE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STATE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Containing State Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___CONTAINING_STATE_MACHINE = STATE___CONTAINING_STATE_MACHINE;

	/**
	 * The operation id for the '<em>Incoming</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___INCOMING = STATE___INCOMING;

	/**
	 * The operation id for the '<em>Outgoing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___OUTGOING = STATE___OUTGOING;

	/**
	 * The operation id for the '<em>Is Contained In State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_CONTAINED_IN_STATE__STATE = STATE___IS_CONTAINED_IN_STATE__STATE;

	/**
	 * The operation id for the '<em>Is Contained In Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_CONTAINED_IN_REGION__REGION = STATE___IS_CONTAINED_IN_REGION__REGION;

	/**
	 * The operation id for the '<em>Is Composite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_COMPOSITE = STATE___IS_COMPOSITE;

	/**
	 * The operation id for the '<em>Is Orthogonal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_ORTHOGONAL = STATE___IS_ORTHOGONAL;

	/**
	 * The operation id for the '<em>Is Simple</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_SIMPLE = STATE___IS_SIMPLE;

	/**
	 * The operation id for the '<em>Is Submachine State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___IS_SUBMACHINE_STATE = STATE___IS_SUBMACHINE_STATE;

	/**
	 * The operation id for the '<em>Redefinition Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE___REDEFINITION_CONTEXT = STATE___REDEFINITION_CONTEXT;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.ProtocolConformanceImpl <em>Protocol Conformance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.ProtocolConformanceImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getProtocolConformance()
	 * @generated
	 */
	int PROTOCOL_CONFORMANCE = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE__OWNED_COMMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE__OWNED_ELEMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE__OWNER = CommonStructurePackage.DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE__RELATED_ELEMENT = CommonStructurePackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE__SOURCE = CommonStructurePackage.DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE__TARGET = CommonStructurePackage.DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>General Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE__GENERAL_MACHINE = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Protocol Conformance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE_FEATURE_COUNT = CommonStructurePackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE___ALL_OWNED_ELEMENTS = CommonStructurePackage.DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE___MUST_BE_OWNED = CommonStructurePackage.DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Protocol Conformance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CONFORMANCE_OPERATION_COUNT = CommonStructurePackage.DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.ProtocolTransitionImpl <em>Protocol Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.ProtocolTransitionImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getProtocolTransition()
	 * @generated
	 */
	int PROTOCOL_TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__OWNED_COMMENT = TRANSITION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__OWNED_ELEMENT = TRANSITION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__OWNER = TRANSITION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__NAME_EXPRESSION = TRANSITION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__NAMESPACE = TRANSITION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__QUALIFIED_NAME = TRANSITION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__VISIBILITY = TRANSITION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__CLIENT_DEPENDENCY = TRANSITION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__ELEMENT_IMPORT = TRANSITION__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__IMPORTED_MEMBER = TRANSITION__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__MEMBER = TRANSITION__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__OWNED_MEMBER = TRANSITION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__OWNED_RULE = TRANSITION__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__PACKAGE_IMPORT = TRANSITION__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__IS_LEAF = TRANSITION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__REDEFINED_ELEMENT = TRANSITION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__REDEFINITION_CONTEXT = TRANSITION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__EFFECT = TRANSITION__EFFECT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__GUARD = TRANSITION__GUARD;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__KIND = TRANSITION__KIND;

	/**
	 * The feature id for the '<em><b>Redefined Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__REDEFINED_TRANSITION = TRANSITION__REDEFINED_TRANSITION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__TRIGGER = TRANSITION__TRIGGER;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__CONTAINER = TRANSITION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__POST_CONDITION = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__PRE_CONDITION = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referred</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION__REFERRED = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Protocol Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___ALL_OWNED_ELEMENTS = TRANSITION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___MUST_BE_OWNED = TRANSITION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___ALL_NAMESPACES = TRANSITION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___ALL_OWNING_PACKAGES = TRANSITION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = TRANSITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___QUALIFIED_NAME = TRANSITION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___SEPARATOR = TRANSITION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___CLIENT_DEPENDENCY = TRANSITION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___EXCLUDE_COLLISIONS__ELIST = TRANSITION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___GET_NAMES_OF_MEMBER__NAMEDELEMENT = TRANSITION___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___IMPORT_MEMBERS__ELIST = TRANSITION___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___IMPORTED_MEMBER = TRANSITION___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___MEMBERS_ARE_DISTINGUISHABLE = TRANSITION___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = TRANSITION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = TRANSITION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Containing State Machine</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___CONTAINING_STATE_MACHINE = TRANSITION___CONTAINING_STATE_MACHINE;

	/**
	 * The operation id for the '<em>Redefinition Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___REDEFINITION_CONTEXT = TRANSITION___REDEFINITION_CONTEXT;

	/**
	 * The operation id for the '<em>Referred</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION___REFERRED = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Protocol Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.stateMachines.impl.ProtocolStateMachineImpl <em>Protocol State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.impl.ProtocolStateMachineImpl
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getProtocolStateMachine()
	 * @generated
	 */
	int PROTOCOL_STATE_MACHINE = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_COMMENT = STATE_MACHINE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_ELEMENT = STATE_MACHINE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNER = STATE_MACHINE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__NAME = STATE_MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__NAME_EXPRESSION = STATE_MACHINE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__NAMESPACE = STATE_MACHINE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__QUALIFIED_NAME = STATE_MACHINE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__VISIBILITY = STATE_MACHINE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__CLIENT_DEPENDENCY = STATE_MACHINE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__ELEMENT_IMPORT = STATE_MACHINE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__IMPORTED_MEMBER = STATE_MACHINE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__MEMBER = STATE_MACHINE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_MEMBER = STATE_MACHINE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_RULE = STATE_MACHINE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__PACKAGE_IMPORT = STATE_MACHINE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__IS_LEAF = STATE_MACHINE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__REDEFINED_ELEMENT = STATE_MACHINE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__REDEFINITION_CONTEXT = STATE_MACHINE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNING_TEMPLATE_PARAMETER = STATE_MACHINE__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__TEMPLATE_PARAMETER = STATE_MACHINE__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__PACKAGE = STATE_MACHINE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__TEMPLATE_BINDING = STATE_MACHINE__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE = STATE_MACHINE__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__SUBSTITUTION = STATE_MACHINE__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__FEATURE = STATE_MACHINE__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__POWERTYPE_EXTENT = STATE_MACHINE__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__GENERALIZATION = STATE_MACHINE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__ATTRIBUTE = STATE_MACHINE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__COLLABORATION_USE = STATE_MACHINE__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__GENERAL = STATE_MACHINE__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__INHERITED_MEMBER = STATE_MACHINE__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__IS_ABSTRACT = STATE_MACHINE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__IS_FINAL_SPECIALIZATION = STATE_MACHINE__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_USE_CASE = STATE_MACHINE__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__USE_CASE = STATE_MACHINE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__REDEFINED_CLASSIFIER = STATE_MACHINE__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__REPRESENTATION = STATE_MACHINE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_ATTRIBUTE = STATE_MACHINE__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_CONNECTOR = STATE_MACHINE__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__PART = STATE_MACHINE__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__ROLE = STATE_MACHINE__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_PORT = STATE_MACHINE__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__INTERFACE_REALIZATION = STATE_MACHINE__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__CLASSIFIER_BEHAVIOR = STATE_MACHINE__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_BEHAVIOR = STATE_MACHINE__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_OPERATION = STATE_MACHINE__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__EXTENSION = STATE_MACHINE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__IS_ACTIVE = STATE_MACHINE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__NESTED_CLASSIFIER = STATE_MACHINE__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_RECEPTION = STATE_MACHINE__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__SUPER_CLASS = STATE_MACHINE__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__SPECIFICATION = STATE_MACHINE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__CONTEXT = STATE_MACHINE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__IS_REENTRANT = STATE_MACHINE__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_PARAMETER = STATE_MACHINE__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__OWNED_PARAMETER_SET = STATE_MACHINE__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__POSTCONDITION = STATE_MACHINE__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__PRECONDITION = STATE_MACHINE__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__REDEFINED_BEHAVIOR = STATE_MACHINE__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Extended State Machine</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__EXTENDED_STATE_MACHINE = STATE_MACHINE__EXTENDED_STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__REGION = STATE_MACHINE__REGION;

	/**
	 * The feature id for the '<em><b>Submachine State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__SUBMACHINE_STATE = STATE_MACHINE__SUBMACHINE_STATE;

	/**
	 * The feature id for the '<em><b>Connection Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__CONNECTION_POINT = STATE_MACHINE__CONNECTION_POINT;

	/**
	 * The feature id for the '<em><b>Conformance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE__CONFORMANCE = STATE_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protocol State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE_FEATURE_COUNT = STATE_MACHINE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_OWNED_ELEMENTS = STATE_MACHINE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___MUST_BE_OWNED = STATE_MACHINE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_NAMESPACES = STATE_MACHINE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_OWNING_PACKAGES = STATE_MACHINE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = STATE_MACHINE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___QUALIFIED_NAME = STATE_MACHINE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___SEPARATOR = STATE_MACHINE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___CLIENT_DEPENDENCY = STATE_MACHINE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___EXCLUDE_COLLISIONS__ELIST = STATE_MACHINE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = STATE_MACHINE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___IMPORT_MEMBERS__ELIST = STATE_MACHINE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___IMPORTED_MEMBER = STATE_MACHINE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___MEMBERS_ARE_DISTINGUISHABLE = STATE_MACHINE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = STATE_MACHINE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = STATE_MACHINE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = STATE_MACHINE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___IS_TEMPLATE_PARAMETER = STATE_MACHINE___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___CONFORMS_TO__TYPE = STATE_MACHINE___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___IS_TEMPLATE = STATE_MACHINE___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___PARAMETERABLE_ELEMENTS = STATE_MACHINE___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_FEATURES = STATE_MACHINE___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_PARENTS = STATE_MACHINE___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___GENERAL = STATE_MACHINE___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___HAS_VISIBILITY_OF__NAMEDELEMENT = STATE_MACHINE___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___INHERIT__ELIST = STATE_MACHINE___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___INHERITABLE_MEMBERS__CLASSIFIER = STATE_MACHINE___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___INHERITED_MEMBER = STATE_MACHINE___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___MAY_SPECIALIZE_TYPE__CLASSIFIER = STATE_MACHINE___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___PARENTS = STATE_MACHINE___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___DIRECTLY_REALIZED_INTERFACES = STATE_MACHINE___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___DIRECTLY_USED_INTERFACES = STATE_MACHINE___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_REALIZED_INTERFACES = STATE_MACHINE___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_USED_INTERFACES = STATE_MACHINE___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___IS_SUBSTITUTABLE_FOR__CLASSIFIER = STATE_MACHINE___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_ATTRIBUTES = STATE_MACHINE___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_SLOTTABLE_FEATURES = STATE_MACHINE___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___PART = STATE_MACHINE___PART;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ALL_ROLES = STATE_MACHINE___ALL_ROLES;

	/**
	 * The operation id for the '<em>Owned Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___OWNED_PORT = STATE_MACHINE___OWNED_PORT;

	/**
	 * The operation id for the '<em>Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___EXTENSION = STATE_MACHINE___EXTENSION;

	/**
	 * The operation id for the '<em>Super Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___SUPER_CLASS = STATE_MACHINE___SUPER_CLASS;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___CONTEXT = STATE_MACHINE___CONTEXT;

	/**
	 * The operation id for the '<em>Behaviored Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___BEHAVIORED_CLASSIFIER__ELEMENT = STATE_MACHINE___BEHAVIORED_CLASSIFIER__ELEMENT;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___INPUT_PARAMETERS = STATE_MACHINE___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___OUTPUT_PARAMETERS = STATE_MACHINE___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Lca</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___LCA__VERTEX_VERTEX = STATE_MACHINE___LCA__VERTEX_VERTEX;

	/**
	 * The operation id for the '<em>Ancestor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___ANCESTOR__VERTEX_VERTEX = STATE_MACHINE___ANCESTOR__VERTEX_VERTEX;

	/**
	 * The operation id for the '<em>Lca State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE___LCA_STATE__VERTEX_VERTEX = STATE_MACHINE___LCA_STATE__VERTEX_VERTEX;

	/**
	 * The number of operations of the '<em>Protocol State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_STATE_MACHINE_OPERATION_COUNT = STATE_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.stateMachines.PseudostateKind <em>Pseudostate Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.PseudostateKind
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getPseudostateKind()
	 * @generated
	 */
	int PSEUDOSTATE_KIND = 11;

	/**
	 * The meta object id for the '{@link uml.stateMachines.TransitionKind <em>Transition Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.stateMachines.TransitionKind
	 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getTransitionKind()
	 * @generated
	 */
	int TRANSITION_KIND = 12;


	/**
	 * Returns the meta object for class '{@link uml.stateMachines.ConnectionPointReference <em>Connection Point Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point Reference</em>'.
	 * @see uml.stateMachines.ConnectionPointReference
	 * @generated
	 */
	EClass getConnectionPointReference();

	/**
	 * Returns the meta object for the container reference '{@link uml.stateMachines.ConnectionPointReference#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see uml.stateMachines.ConnectionPointReference#getState()
	 * @see #getConnectionPointReference()
	 * @generated
	 */
	EReference getConnectionPointReference_State();

	/**
	 * Returns the meta object for the reference list '{@link uml.stateMachines.ConnectionPointReference#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entry</em>'.
	 * @see uml.stateMachines.ConnectionPointReference#getEntry()
	 * @see #getConnectionPointReference()
	 * @generated
	 */
	EReference getConnectionPointReference_Entry();

	/**
	 * Returns the meta object for the reference list '{@link uml.stateMachines.ConnectionPointReference#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exit</em>'.
	 * @see uml.stateMachines.ConnectionPointReference#getExit()
	 * @see #getConnectionPointReference()
	 * @generated
	 */
	EReference getConnectionPointReference_Exit();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see uml.stateMachines.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the container reference '{@link uml.stateMachines.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see uml.stateMachines.Vertex#getContainer()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Container();

	/**
	 * Returns the meta object for the reference list '{@link uml.stateMachines.Vertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see uml.stateMachines.Vertex#getOutgoing()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link uml.stateMachines.Vertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see uml.stateMachines.Vertex#getIncoming()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Incoming();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Vertex#containingStateMachine() <em>Containing State Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Containing State Machine</em>' operation.
	 * @see uml.stateMachines.Vertex#containingStateMachine()
	 * @generated
	 */
	EOperation getVertex__ContainingStateMachine();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Vertex#incoming() <em>Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incoming</em>' operation.
	 * @see uml.stateMachines.Vertex#incoming()
	 * @generated
	 */
	EOperation getVertex__Incoming();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Vertex#outgoing() <em>Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Outgoing</em>' operation.
	 * @see uml.stateMachines.Vertex#outgoing()
	 * @generated
	 */
	EOperation getVertex__Outgoing();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Vertex#isContainedInState(uml.stateMachines.State) <em>Is Contained In State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Contained In State</em>' operation.
	 * @see uml.stateMachines.Vertex#isContainedInState(uml.stateMachines.State)
	 * @generated
	 */
	EOperation getVertex__IsContainedInState__State();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Vertex#isContainedInRegion(uml.stateMachines.Region) <em>Is Contained In Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Contained In Region</em>' operation.
	 * @see uml.stateMachines.Vertex#isContainedInRegion(uml.stateMachines.Region)
	 * @generated
	 */
	EOperation getVertex__IsContainedInRegion__Region();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see uml.stateMachines.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.Region#getExtendedRegion <em>Extended Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Region</em>'.
	 * @see uml.stateMachines.Region#getExtendedRegion()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_ExtendedRegion();

	/**
	 * Returns the meta object for the container reference '{@link uml.stateMachines.Region#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see uml.stateMachines.Region#getState()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_State();

	/**
	 * Returns the meta object for the container reference '{@link uml.stateMachines.Region#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Machine</em>'.
	 * @see uml.stateMachines.Region#getStateMachine()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_StateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see uml.stateMachines.Region#getTransition()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see uml.stateMachines.Region#getSubvertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Subvertex();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Region#belongsToPsm() <em>Belongs To Psm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Belongs To Psm</em>' operation.
	 * @see uml.stateMachines.Region#belongsToPsm()
	 * @generated
	 */
	EOperation getRegion__BelongsToPsm();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Region#containingStateMachine() <em>Containing State Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Containing State Machine</em>' operation.
	 * @see uml.stateMachines.Region#containingStateMachine()
	 * @generated
	 */
	EOperation getRegion__ContainingStateMachine();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Region#redefinitionContext() <em>Redefinition Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redefinition Context</em>' operation.
	 * @see uml.stateMachines.Region#redefinitionContext()
	 * @generated
	 */
	EOperation getRegion__RedefinitionContext();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see uml.stateMachines.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.State#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see uml.stateMachines.State#getConnection()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.State#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point</em>'.
	 * @see uml.stateMachines.State#getConnectionPoint()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ConnectionPoint();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.State#getSubmachine <em>Submachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Submachine</em>'.
	 * @see uml.stateMachines.State#getSubmachine()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Submachine();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.State#getDeferrableTrigger <em>Deferrable Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deferrable Trigger</em>'.
	 * @see uml.stateMachines.State#getDeferrableTrigger()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DeferrableTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link uml.stateMachines.State#getDoActivity <em>Do Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Activity</em>'.
	 * @see uml.stateMachines.State#getDoActivity()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoActivity();

	/**
	 * Returns the meta object for the containment reference '{@link uml.stateMachines.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see uml.stateMachines.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link uml.stateMachines.State#getExit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit</em>'.
	 * @see uml.stateMachines.State#getExit()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Exit();

	/**
	 * Returns the meta object for the attribute '{@link uml.stateMachines.State#isIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see uml.stateMachines.State#isIsComposite()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsComposite();

	/**
	 * Returns the meta object for the attribute '{@link uml.stateMachines.State#isIsOrthogonal <em>Is Orthogonal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Orthogonal</em>'.
	 * @see uml.stateMachines.State#isIsOrthogonal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsOrthogonal();

	/**
	 * Returns the meta object for the attribute '{@link uml.stateMachines.State#isIsSimple <em>Is Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Simple</em>'.
	 * @see uml.stateMachines.State#isIsSimple()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsSimple();

	/**
	 * Returns the meta object for the attribute '{@link uml.stateMachines.State#isIsSubmachineState <em>Is Submachine State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Submachine State</em>'.
	 * @see uml.stateMachines.State#isIsSubmachineState()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsSubmachineState();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.State#getRedefinedState <em>Redefined State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefined State</em>'.
	 * @see uml.stateMachines.State#getRedefinedState()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_RedefinedState();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.State#getStateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Invariant</em>'.
	 * @see uml.stateMachines.State#getStateInvariant()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateInvariant();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.State#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see uml.stateMachines.State#getRegion()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Region();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.State#isComposite() <em>Is Composite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Composite</em>' operation.
	 * @see uml.stateMachines.State#isComposite()
	 * @generated
	 */
	EOperation getState__IsComposite();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.State#isOrthogonal() <em>Is Orthogonal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Orthogonal</em>' operation.
	 * @see uml.stateMachines.State#isOrthogonal()
	 * @generated
	 */
	EOperation getState__IsOrthogonal();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.State#isSimple() <em>Is Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Simple</em>' operation.
	 * @see uml.stateMachines.State#isSimple()
	 * @generated
	 */
	EOperation getState__IsSimple();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.State#isSubmachineState() <em>Is Submachine State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Submachine State</em>' operation.
	 * @see uml.stateMachines.State#isSubmachineState()
	 * @generated
	 */
	EOperation getState__IsSubmachineState();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.State#redefinitionContext() <em>Redefinition Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redefinition Context</em>' operation.
	 * @see uml.stateMachines.State#redefinitionContext()
	 * @generated
	 */
	EOperation getState__RedefinitionContext();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see uml.stateMachines.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for the attribute '{@link uml.stateMachines.Pseudostate#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see uml.stateMachines.Pseudostate#getKind()
	 * @see #getPseudostate()
	 * @generated
	 */
	EAttribute getPseudostate_Kind();

	/**
	 * Returns the meta object for the container reference '{@link uml.stateMachines.Pseudostate#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Machine</em>'.
	 * @see uml.stateMachines.Pseudostate#getStateMachine()
	 * @see #getPseudostate()
	 * @generated
	 */
	EReference getPseudostate_StateMachine();

	/**
	 * Returns the meta object for the container reference '{@link uml.stateMachines.Pseudostate#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State</em>'.
	 * @see uml.stateMachines.Pseudostate#getState()
	 * @see #getPseudostate()
	 * @generated
	 */
	EReference getPseudostate_State();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see uml.stateMachines.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the reference list '{@link uml.stateMachines.StateMachine#getExtendedStateMachine <em>Extended State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extended State Machine</em>'.
	 * @see uml.stateMachines.StateMachine#getExtendedStateMachine()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_ExtendedStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see uml.stateMachines.StateMachine#getRegion()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Region();

	/**
	 * Returns the meta object for the reference list '{@link uml.stateMachines.StateMachine#getSubmachineState <em>Submachine State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Submachine State</em>'.
	 * @see uml.stateMachines.StateMachine#getSubmachineState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_SubmachineState();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.StateMachine#getConnectionPoint <em>Connection Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point</em>'.
	 * @see uml.stateMachines.StateMachine#getConnectionPoint()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_ConnectionPoint();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.StateMachine#lca(uml.stateMachines.Vertex, uml.stateMachines.Vertex) <em>Lca</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lca</em>' operation.
	 * @see uml.stateMachines.StateMachine#lca(uml.stateMachines.Vertex, uml.stateMachines.Vertex)
	 * @generated
	 */
	EOperation getStateMachine__Lca__Vertex_Vertex();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.StateMachine#ancestor(uml.stateMachines.Vertex, uml.stateMachines.Vertex) <em>Ancestor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ancestor</em>' operation.
	 * @see uml.stateMachines.StateMachine#ancestor(uml.stateMachines.Vertex, uml.stateMachines.Vertex)
	 * @generated
	 */
	EOperation getStateMachine__Ancestor__Vertex_Vertex();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.StateMachine#lcaState(uml.stateMachines.Vertex, uml.stateMachines.Vertex) <em>Lca State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lca State</em>' operation.
	 * @see uml.stateMachines.StateMachine#lcaState(uml.stateMachines.Vertex, uml.stateMachines.Vertex)
	 * @generated
	 */
	EOperation getStateMachine__LcaState__Vertex_Vertex();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see uml.stateMachines.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link uml.stateMachines.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see uml.stateMachines.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Effect();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see uml.stateMachines.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the attribute '{@link uml.stateMachines.Transition#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see uml.stateMachines.Transition#getKind()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Kind();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.Transition#getRedefinedTransition <em>Redefined Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefined Transition</em>'.
	 * @see uml.stateMachines.Transition#getRedefinedTransition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RedefinedTransition();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see uml.stateMachines.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uml.stateMachines.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see uml.stateMachines.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for the container reference '{@link uml.stateMachines.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see uml.stateMachines.Transition#getContainer()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Container();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Transition#containingStateMachine() <em>Containing State Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Containing State Machine</em>' operation.
	 * @see uml.stateMachines.Transition#containingStateMachine()
	 * @generated
	 */
	EOperation getTransition__ContainingStateMachine();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.Transition#redefinitionContext() <em>Redefinition Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redefinition Context</em>' operation.
	 * @see uml.stateMachines.Transition#redefinitionContext()
	 * @generated
	 */
	EOperation getTransition__RedefinitionContext();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see uml.stateMachines.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.ProtocolConformance <em>Protocol Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Conformance</em>'.
	 * @see uml.stateMachines.ProtocolConformance
	 * @generated
	 */
	EClass getProtocolConformance();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.ProtocolConformance#getGeneralMachine <em>General Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General Machine</em>'.
	 * @see uml.stateMachines.ProtocolConformance#getGeneralMachine()
	 * @see #getProtocolConformance()
	 * @generated
	 */
	EReference getProtocolConformance_GeneralMachine();

	/**
	 * Returns the meta object for the container reference '{@link uml.stateMachines.ProtocolConformance#getSpecificMachine <em>Specific Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specific Machine</em>'.
	 * @see uml.stateMachines.ProtocolConformance#getSpecificMachine()
	 * @see #getProtocolConformance()
	 * @generated
	 */
	EReference getProtocolConformance_SpecificMachine();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.ProtocolTransition <em>Protocol Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Transition</em>'.
	 * @see uml.stateMachines.ProtocolTransition
	 * @generated
	 */
	EClass getProtocolTransition();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.ProtocolTransition#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post Condition</em>'.
	 * @see uml.stateMachines.ProtocolTransition#getPostCondition()
	 * @see #getProtocolTransition()
	 * @generated
	 */
	EReference getProtocolTransition_PostCondition();

	/**
	 * Returns the meta object for the reference '{@link uml.stateMachines.ProtocolTransition#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Condition</em>'.
	 * @see uml.stateMachines.ProtocolTransition#getPreCondition()
	 * @see #getProtocolTransition()
	 * @generated
	 */
	EReference getProtocolTransition_PreCondition();

	/**
	 * Returns the meta object for the reference list '{@link uml.stateMachines.ProtocolTransition#getReferred <em>Referred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referred</em>'.
	 * @see uml.stateMachines.ProtocolTransition#getReferred()
	 * @see #getProtocolTransition()
	 * @generated
	 */
	EReference getProtocolTransition_Referred();

	/**
	 * Returns the meta object for the '{@link uml.stateMachines.ProtocolTransition#referred() <em>Referred</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Referred</em>' operation.
	 * @see uml.stateMachines.ProtocolTransition#referred()
	 * @generated
	 */
	EOperation getProtocolTransition__Referred();

	/**
	 * Returns the meta object for class '{@link uml.stateMachines.ProtocolStateMachine <em>Protocol State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol State Machine</em>'.
	 * @see uml.stateMachines.ProtocolStateMachine
	 * @generated
	 */
	EClass getProtocolStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.stateMachines.ProtocolStateMachine#getConformance <em>Conformance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conformance</em>'.
	 * @see uml.stateMachines.ProtocolStateMachine#getConformance()
	 * @see #getProtocolStateMachine()
	 * @generated
	 */
	EReference getProtocolStateMachine_Conformance();

	/**
	 * Returns the meta object for enum '{@link uml.stateMachines.PseudostateKind <em>Pseudostate Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pseudostate Kind</em>'.
	 * @see uml.stateMachines.PseudostateKind
	 * @generated
	 */
	EEnum getPseudostateKind();

	/**
	 * Returns the meta object for enum '{@link uml.stateMachines.TransitionKind <em>Transition Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Kind</em>'.
	 * @see uml.stateMachines.TransitionKind
	 * @generated
	 */
	EEnum getTransitionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateMachinesFactory getStateMachinesFactory();

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
		 * The meta object literal for the '{@link uml.stateMachines.impl.ConnectionPointReferenceImpl <em>Connection Point Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.ConnectionPointReferenceImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getConnectionPointReference()
		 * @generated
		 */
		EClass CONNECTION_POINT_REFERENCE = eINSTANCE.getConnectionPointReference();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT_REFERENCE__STATE = eINSTANCE.getConnectionPointReference_State();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT_REFERENCE__ENTRY = eINSTANCE.getConnectionPointReference_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_POINT_REFERENCE__EXIT = eINSTANCE.getConnectionPointReference_Exit();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.VertexImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__CONTAINER = eINSTANCE.getVertex_Container();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__OUTGOING = eINSTANCE.getVertex_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__INCOMING = eINSTANCE.getVertex_Incoming();

		/**
		 * The meta object literal for the '<em><b>Containing State Machine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___CONTAINING_STATE_MACHINE = eINSTANCE.getVertex__ContainingStateMachine();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___INCOMING = eINSTANCE.getVertex__Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___OUTGOING = eINSTANCE.getVertex__Outgoing();

		/**
		 * The meta object literal for the '<em><b>Is Contained In State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___IS_CONTAINED_IN_STATE__STATE = eINSTANCE.getVertex__IsContainedInState__State();

		/**
		 * The meta object literal for the '<em><b>Is Contained In Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERTEX___IS_CONTAINED_IN_REGION__REGION = eINSTANCE.getVertex__IsContainedInRegion__Region();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.RegionImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Extended Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__EXTENDED_REGION = eINSTANCE.getRegion_ExtendedRegion();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__STATE = eINSTANCE.getRegion_State();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__STATE_MACHINE = eINSTANCE.getRegion_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TRANSITION = eINSTANCE.getRegion_Transition();

		/**
		 * The meta object literal for the '<em><b>Subvertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__SUBVERTEX = eINSTANCE.getRegion_Subvertex();

		/**
		 * The meta object literal for the '<em><b>Belongs To Psm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___BELONGS_TO_PSM = eINSTANCE.getRegion__BelongsToPsm();

		/**
		 * The meta object literal for the '<em><b>Containing State Machine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___CONTAINING_STATE_MACHINE = eINSTANCE.getRegion__ContainingStateMachine();

		/**
		 * The meta object literal for the '<em><b>Redefinition Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGION___REDEFINITION_CONTEXT = eINSTANCE.getRegion__RedefinitionContext();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.StateImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONNECTION = eINSTANCE.getState_Connection();

		/**
		 * The meta object literal for the '<em><b>Connection Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONNECTION_POINT = eINSTANCE.getState_ConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Submachine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUBMACHINE = eINSTANCE.getState_Submachine();

		/**
		 * The meta object literal for the '<em><b>Deferrable Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DEFERRABLE_TRIGGER = eINSTANCE.getState_DeferrableTrigger();

		/**
		 * The meta object literal for the '<em><b>Do Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DO_ACTIVITY = eINSTANCE.getState_DoActivity();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY = eINSTANCE.getState_Entry();

		/**
		 * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT = eINSTANCE.getState_Exit();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_COMPOSITE = eINSTANCE.getState_IsComposite();

		/**
		 * The meta object literal for the '<em><b>Is Orthogonal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_ORTHOGONAL = eINSTANCE.getState_IsOrthogonal();

		/**
		 * The meta object literal for the '<em><b>Is Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_SIMPLE = eINSTANCE.getState_IsSimple();

		/**
		 * The meta object literal for the '<em><b>Is Submachine State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_SUBMACHINE_STATE = eINSTANCE.getState_IsSubmachineState();

		/**
		 * The meta object literal for the '<em><b>Redefined State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__REDEFINED_STATE = eINSTANCE.getState_RedefinedState();

		/**
		 * The meta object literal for the '<em><b>State Invariant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_INVARIANT = eINSTANCE.getState_StateInvariant();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__REGION = eINSTANCE.getState_Region();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___IS_COMPOSITE = eINSTANCE.getState__IsComposite();

		/**
		 * The meta object literal for the '<em><b>Is Orthogonal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___IS_ORTHOGONAL = eINSTANCE.getState__IsOrthogonal();

		/**
		 * The meta object literal for the '<em><b>Is Simple</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___IS_SIMPLE = eINSTANCE.getState__IsSimple();

		/**
		 * The meta object literal for the '<em><b>Is Submachine State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___IS_SUBMACHINE_STATE = eINSTANCE.getState__IsSubmachineState();

		/**
		 * The meta object literal for the '<em><b>Redefinition Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___REDEFINITION_CONTEXT = eINSTANCE.getState__RedefinitionContext();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.PseudostateImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSEUDOSTATE__KIND = eINSTANCE.getPseudostate_Kind();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEUDOSTATE__STATE_MACHINE = eINSTANCE.getPseudostate_StateMachine();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEUDOSTATE__STATE = eINSTANCE.getPseudostate_State();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.StateMachineImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Extended State Machine</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__EXTENDED_STATE_MACHINE = eINSTANCE.getStateMachine_ExtendedStateMachine();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__REGION = eINSTANCE.getStateMachine_Region();

		/**
		 * The meta object literal for the '<em><b>Submachine State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__SUBMACHINE_STATE = eINSTANCE.getStateMachine_SubmachineState();

		/**
		 * The meta object literal for the '<em><b>Connection Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__CONNECTION_POINT = eINSTANCE.getStateMachine_ConnectionPoint();

		/**
		 * The meta object literal for the '<em><b>Lca</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___LCA__VERTEX_VERTEX = eINSTANCE.getStateMachine__Lca__Vertex_Vertex();

		/**
		 * The meta object literal for the '<em><b>Ancestor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___ANCESTOR__VERTEX_VERTEX = eINSTANCE.getStateMachine__Ancestor__Vertex_Vertex();

		/**
		 * The meta object literal for the '<em><b>Lca State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_MACHINE___LCA_STATE__VERTEX_VERTEX = eINSTANCE.getStateMachine__LcaState__Vertex_Vertex();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.TransitionImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__KIND = eINSTANCE.getTransition_Kind();

		/**
		 * The meta object literal for the '<em><b>Redefined Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__REDEFINED_TRANSITION = eINSTANCE.getTransition_RedefinedTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONTAINER = eINSTANCE.getTransition_Container();

		/**
		 * The meta object literal for the '<em><b>Containing State Machine</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___CONTAINING_STATE_MACHINE = eINSTANCE.getTransition__ContainingStateMachine();

		/**
		 * The meta object literal for the '<em><b>Redefinition Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___REDEFINITION_CONTEXT = eINSTANCE.getTransition__RedefinitionContext();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.FinalStateImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.ProtocolConformanceImpl <em>Protocol Conformance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.ProtocolConformanceImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getProtocolConformance()
		 * @generated
		 */
		EClass PROTOCOL_CONFORMANCE = eINSTANCE.getProtocolConformance();

		/**
		 * The meta object literal for the '<em><b>General Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_CONFORMANCE__GENERAL_MACHINE = eINSTANCE.getProtocolConformance_GeneralMachine();

		/**
		 * The meta object literal for the '<em><b>Specific Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE = eINSTANCE.getProtocolConformance_SpecificMachine();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.ProtocolTransitionImpl <em>Protocol Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.ProtocolTransitionImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getProtocolTransition()
		 * @generated
		 */
		EClass PROTOCOL_TRANSITION = eINSTANCE.getProtocolTransition();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_TRANSITION__POST_CONDITION = eINSTANCE.getProtocolTransition_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_TRANSITION__PRE_CONDITION = eINSTANCE.getProtocolTransition_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Referred</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_TRANSITION__REFERRED = eINSTANCE.getProtocolTransition_Referred();

		/**
		 * The meta object literal for the '<em><b>Referred</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROTOCOL_TRANSITION___REFERRED = eINSTANCE.getProtocolTransition__Referred();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.impl.ProtocolStateMachineImpl <em>Protocol State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.impl.ProtocolStateMachineImpl
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getProtocolStateMachine()
		 * @generated
		 */
		EClass PROTOCOL_STATE_MACHINE = eINSTANCE.getProtocolStateMachine();

		/**
		 * The meta object literal for the '<em><b>Conformance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_STATE_MACHINE__CONFORMANCE = eINSTANCE.getProtocolStateMachine_Conformance();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.PseudostateKind <em>Pseudostate Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.PseudostateKind
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getPseudostateKind()
		 * @generated
		 */
		EEnum PSEUDOSTATE_KIND = eINSTANCE.getPseudostateKind();

		/**
		 * The meta object literal for the '{@link uml.stateMachines.TransitionKind <em>Transition Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.stateMachines.TransitionKind
		 * @see uml.stateMachines.impl.StateMachinesPackageImpl#getTransitionKind()
		 * @generated
		 */
		EEnum TRANSITION_KIND = eINSTANCE.getTransitionKind();

	}

} //StateMachinesPackage
