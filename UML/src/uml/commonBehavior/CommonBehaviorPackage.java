/**
 */
package uml.commonBehavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see uml.commonBehavior.CommonBehaviorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CommonBehavior'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface CommonBehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commonBehavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/commonBehavior.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.commonBehavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonBehaviorPackage eINSTANCE = uml.commonBehavior.impl.CommonBehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.EventImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNED_COMMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNED_ELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME_EXPRESSION = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VISIBILITY = CommonStructurePackage.PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ALL_OWNED_ELEMENTS = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___MUST_BE_OWNED = CommonStructurePackage.PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ALL_NAMESPACES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ALL_OWNING_PACKAGES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___SEPARATOR = CommonStructurePackage.PACKAGEABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___IS_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.MessageEventImpl <em>Message Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.MessageEventImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getMessageEvent()
	 * @generated
	 */
	int MESSAGE_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__OWNED_COMMENT = EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__OWNED_ELEMENT = EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__OWNER = EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__NAME_EXPRESSION = EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__NAMESPACE = EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__QUALIFIED_NAME = EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__CLIENT_DEPENDENCY = EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__OWNING_TEMPLATE_PARAMETER = EVENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT__TEMPLATE_PARAMETER = EVENT__TEMPLATE_PARAMETER;

	/**
	 * The number of structural features of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ALL_OWNED_ELEMENTS = EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___MUST_BE_OWNED = EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ALL_NAMESPACES = EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___ALL_OWNING_PACKAGES = EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___QUALIFIED_NAME = EVENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___SEPARATOR = EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___CLIENT_DEPENDENCY = EVENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT___IS_TEMPLATE_PARAMETER = EVENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Message Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.AnyReceiveEventImpl <em>Any Receive Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.AnyReceiveEventImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getAnyReceiveEvent()
	 * @generated
	 */
	int ANY_RECEIVE_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__OWNED_COMMENT = MESSAGE_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__OWNED_ELEMENT = MESSAGE_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__OWNER = MESSAGE_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__NAME = MESSAGE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__NAME_EXPRESSION = MESSAGE_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__NAMESPACE = MESSAGE_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__QUALIFIED_NAME = MESSAGE_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__VISIBILITY = MESSAGE_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__CLIENT_DEPENDENCY = MESSAGE_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__OWNING_TEMPLATE_PARAMETER = MESSAGE_EVENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT__TEMPLATE_PARAMETER = MESSAGE_EVENT__TEMPLATE_PARAMETER;

	/**
	 * The number of structural features of the '<em>Any Receive Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___ALL_OWNED_ELEMENTS = MESSAGE_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___MUST_BE_OWNED = MESSAGE_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___ALL_NAMESPACES = MESSAGE_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___ALL_OWNING_PACKAGES = MESSAGE_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = MESSAGE_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___QUALIFIED_NAME = MESSAGE_EVENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___SEPARATOR = MESSAGE_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___CLIENT_DEPENDENCY = MESSAGE_EVENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = MESSAGE_EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT___IS_TEMPLATE_PARAMETER = MESSAGE_EVENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Any Receive Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_RECEIVE_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.TriggerImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EVENT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PORT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.CallEventImpl <em>Call Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.CallEventImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getCallEvent()
	 * @generated
	 */
	int CALL_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__OWNED_COMMENT = MESSAGE_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__OWNED_ELEMENT = MESSAGE_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__OWNER = MESSAGE_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__NAME = MESSAGE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__NAME_EXPRESSION = MESSAGE_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__NAMESPACE = MESSAGE_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__QUALIFIED_NAME = MESSAGE_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__VISIBILITY = MESSAGE_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__CLIENT_DEPENDENCY = MESSAGE_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__OWNING_TEMPLATE_PARAMETER = MESSAGE_EVENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__TEMPLATE_PARAMETER = MESSAGE_EVENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT__OPERATION = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___ALL_OWNED_ELEMENTS = MESSAGE_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___MUST_BE_OWNED = MESSAGE_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___ALL_NAMESPACES = MESSAGE_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___ALL_OWNING_PACKAGES = MESSAGE_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = MESSAGE_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___QUALIFIED_NAME = MESSAGE_EVENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___SEPARATOR = MESSAGE_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___CLIENT_DEPENDENCY = MESSAGE_EVENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = MESSAGE_EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT___IS_TEMPLATE_PARAMETER = MESSAGE_EVENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Call Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.ChangeEventImpl <em>Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.ChangeEventImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getChangeEvent()
	 * @generated
	 */
	int CHANGE_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__OWNED_COMMENT = EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__OWNED_ELEMENT = EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__OWNER = EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__NAME_EXPRESSION = EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__NAMESPACE = EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__QUALIFIED_NAME = EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__CLIENT_DEPENDENCY = EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__OWNING_TEMPLATE_PARAMETER = EVENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__TEMPLATE_PARAMETER = EVENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Change Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT__CHANGE_EXPRESSION = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___ALL_OWNED_ELEMENTS = EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___MUST_BE_OWNED = EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___ALL_NAMESPACES = EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___ALL_OWNING_PACKAGES = EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___QUALIFIED_NAME = EVENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___SEPARATOR = EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___CLIENT_DEPENDENCY = EVENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT___IS_TEMPLATE_PARAMETER = EVENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.BehaviorImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_COMMENT = StructuredClassifiersPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_ELEMENT = StructuredClassifiersPackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNER = StructuredClassifiersPackage.CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = StructuredClassifiersPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME_EXPRESSION = StructuredClassifiersPackage.CLASS__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAMESPACE = StructuredClassifiersPackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__QUALIFIED_NAME = StructuredClassifiersPackage.CLASS__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__VISIBILITY = StructuredClassifiersPackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CLIENT_DEPENDENCY = StructuredClassifiersPackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ELEMENT_IMPORT = StructuredClassifiersPackage.CLASS__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IMPORTED_MEMBER = StructuredClassifiersPackage.CLASS__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__MEMBER = StructuredClassifiersPackage.CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_MEMBER = StructuredClassifiersPackage.CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_RULE = StructuredClassifiersPackage.CLASS__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__PACKAGE_IMPORT = StructuredClassifiersPackage.CLASS__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_LEAF = StructuredClassifiersPackage.CLASS__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__REDEFINED_ELEMENT = StructuredClassifiersPackage.CLASS__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__REDEFINITION_CONTEXT = StructuredClassifiersPackage.CLASS__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNING_TEMPLATE_PARAMETER = StructuredClassifiersPackage.CLASS__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__TEMPLATE_PARAMETER = StructuredClassifiersPackage.CLASS__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__PACKAGE = StructuredClassifiersPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__TEMPLATE_BINDING = StructuredClassifiersPackage.CLASS__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_TEMPLATE_SIGNATURE = StructuredClassifiersPackage.CLASS__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SUBSTITUTION = StructuredClassifiersPackage.CLASS__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__FEATURE = StructuredClassifiersPackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__POWERTYPE_EXTENT = StructuredClassifiersPackage.CLASS__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__GENERALIZATION = StructuredClassifiersPackage.CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ATTRIBUTE = StructuredClassifiersPackage.CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__COLLABORATION_USE = StructuredClassifiersPackage.CLASS__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__GENERAL = StructuredClassifiersPackage.CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__INHERITED_MEMBER = StructuredClassifiersPackage.CLASS__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_ABSTRACT = StructuredClassifiersPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_FINAL_SPECIALIZATION = StructuredClassifiersPackage.CLASS__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_USE_CASE = StructuredClassifiersPackage.CLASS__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__USE_CASE = StructuredClassifiersPackage.CLASS__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__REDEFINED_CLASSIFIER = StructuredClassifiersPackage.CLASS__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__REPRESENTATION = StructuredClassifiersPackage.CLASS__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_ATTRIBUTE = StructuredClassifiersPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_CONNECTOR = StructuredClassifiersPackage.CLASS__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__PART = StructuredClassifiersPackage.CLASS__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ROLE = StructuredClassifiersPackage.CLASS__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_PORT = StructuredClassifiersPackage.CLASS__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__INTERFACE_REALIZATION = StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CLASSIFIER_BEHAVIOR = StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_BEHAVIOR = StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_OPERATION = StructuredClassifiersPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__EXTENSION = StructuredClassifiersPackage.CLASS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_ACTIVE = StructuredClassifiersPackage.CLASS__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NESTED_CLASSIFIER = StructuredClassifiersPackage.CLASS__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_RECEPTION = StructuredClassifiersPackage.CLASS__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SUPER_CLASS = StructuredClassifiersPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__SPECIFICATION = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTEXT = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_REENTRANT = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_PARAMETER = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_PARAMETER_SET = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__POSTCONDITION = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__PRECONDITION = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__REDEFINED_BEHAVIOR = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = StructuredClassifiersPackage.CLASS_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_OWNED_ELEMENTS = StructuredClassifiersPackage.CLASS___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___MUST_BE_OWNED = StructuredClassifiersPackage.CLASS___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_NAMESPACES = StructuredClassifiersPackage.CLASS___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_OWNING_PACKAGES = StructuredClassifiersPackage.CLASS___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = StructuredClassifiersPackage.CLASS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___QUALIFIED_NAME = StructuredClassifiersPackage.CLASS___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___SEPARATOR = StructuredClassifiersPackage.CLASS___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___CLIENT_DEPENDENCY = StructuredClassifiersPackage.CLASS___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___EXCLUDE_COLLISIONS__ELIST = StructuredClassifiersPackage.CLASS___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT = StructuredClassifiersPackage.CLASS___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___IMPORT_MEMBERS__ELIST = StructuredClassifiersPackage.CLASS___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___IMPORTED_MEMBER = StructuredClassifiersPackage.CLASS___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE = StructuredClassifiersPackage.CLASS___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = StructuredClassifiersPackage.CLASS___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = StructuredClassifiersPackage.CLASS___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = StructuredClassifiersPackage.CLASS___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___IS_TEMPLATE_PARAMETER = StructuredClassifiersPackage.CLASS___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___CONFORMS_TO__TYPE = StructuredClassifiersPackage.CLASS___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___IS_TEMPLATE = StructuredClassifiersPackage.CLASS___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___PARAMETERABLE_ELEMENTS = StructuredClassifiersPackage.CLASS___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_FEATURES = StructuredClassifiersPackage.CLASS___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_PARENTS = StructuredClassifiersPackage.CLASS___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___GENERAL = StructuredClassifiersPackage.CLASS___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT = StructuredClassifiersPackage.CLASS___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___INHERIT__ELIST = StructuredClassifiersPackage.CLASS___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER = StructuredClassifiersPackage.CLASS___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___INHERITED_MEMBER = StructuredClassifiersPackage.CLASS___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER = StructuredClassifiersPackage.CLASS___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___PARENTS = StructuredClassifiersPackage.CLASS___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___DIRECTLY_REALIZED_INTERFACES = StructuredClassifiersPackage.CLASS___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___DIRECTLY_USED_INTERFACES = StructuredClassifiersPackage.CLASS___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_REALIZED_INTERFACES = StructuredClassifiersPackage.CLASS___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_USED_INTERFACES = StructuredClassifiersPackage.CLASS___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER = StructuredClassifiersPackage.CLASS___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_ATTRIBUTES = StructuredClassifiersPackage.CLASS___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_SLOTTABLE_FEATURES = StructuredClassifiersPackage.CLASS___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___PART = StructuredClassifiersPackage.CLASS___PART;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___ALL_ROLES = StructuredClassifiersPackage.CLASS___ALL_ROLES;

	/**
	 * The operation id for the '<em>Owned Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___OWNED_PORT = StructuredClassifiersPackage.CLASS___OWNED_PORT;

	/**
	 * The operation id for the '<em>Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___EXTENSION = StructuredClassifiersPackage.CLASS___EXTENSION;

	/**
	 * The operation id for the '<em>Super Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___SUPER_CLASS = StructuredClassifiersPackage.CLASS___SUPER_CLASS;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___CONTEXT = StructuredClassifiersPackage.CLASS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Behaviored Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT = StructuredClassifiersPackage.CLASS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___INPUT_PARAMETERS = StructuredClassifiersPackage.CLASS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR___OUTPUT_PARAMETERS = StructuredClassifiersPackage.CLASS_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = StructuredClassifiersPackage.CLASS_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.OpaqueBehaviorImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getOpaqueBehavior()
	 * @generated
	 */
	int OPAQUE_BEHAVIOR = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_COMMENT = BEHAVIOR__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_ELEMENT = BEHAVIOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNER = BEHAVIOR__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__NAME_EXPRESSION = BEHAVIOR__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__NAMESPACE = BEHAVIOR__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__QUALIFIED_NAME = BEHAVIOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__VISIBILITY = BEHAVIOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY = BEHAVIOR__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__ELEMENT_IMPORT = BEHAVIOR__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IMPORTED_MEMBER = BEHAVIOR__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__MEMBER = BEHAVIOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_MEMBER = BEHAVIOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_RULE = BEHAVIOR__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__PACKAGE_IMPORT = BEHAVIOR__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_LEAF = BEHAVIOR__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REDEFINED_ELEMENT = BEHAVIOR__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REDEFINITION_CONTEXT = BEHAVIOR__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER = BEHAVIOR__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER = BEHAVIOR__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__PACKAGE = BEHAVIOR__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__TEMPLATE_BINDING = BEHAVIOR__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE = BEHAVIOR__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__SUBSTITUTION = BEHAVIOR__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__FEATURE = BEHAVIOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__POWERTYPE_EXTENT = BEHAVIOR__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__GENERALIZATION = BEHAVIOR__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__ATTRIBUTE = BEHAVIOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__COLLABORATION_USE = BEHAVIOR__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__GENERAL = BEHAVIOR__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__INHERITED_MEMBER = BEHAVIOR__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_ABSTRACT = BEHAVIOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_FINAL_SPECIALIZATION = BEHAVIOR__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_USE_CASE = BEHAVIOR__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__USE_CASE = BEHAVIOR__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER = BEHAVIOR__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REPRESENTATION = BEHAVIOR__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE = BEHAVIOR__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_CONNECTOR = BEHAVIOR__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__PART = BEHAVIOR__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__ROLE = BEHAVIOR__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_PORT = BEHAVIOR__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__INTERFACE_REALIZATION = BEHAVIOR__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR = BEHAVIOR__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_BEHAVIOR = BEHAVIOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_OPERATION = BEHAVIOR__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__EXTENSION = BEHAVIOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_ACTIVE = BEHAVIOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__NESTED_CLASSIFIER = BEHAVIOR__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_RECEPTION = BEHAVIOR__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__SUPER_CLASS = BEHAVIOR__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__SPECIFICATION = BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__CONTEXT = BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_REENTRANT = BEHAVIOR__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_PARAMETER = BEHAVIOR__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET = BEHAVIOR__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__POSTCONDITION = BEHAVIOR__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__PRECONDITION = BEHAVIOR__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR = BEHAVIOR__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__BODY = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__LANGUAGE = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_OWNED_ELEMENTS = BEHAVIOR___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___MUST_BE_OWNED = BEHAVIOR___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_NAMESPACES = BEHAVIOR___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_OWNING_PACKAGES = BEHAVIOR___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___QUALIFIED_NAME = BEHAVIOR___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___SEPARATOR = BEHAVIOR___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CLIENT_DEPENDENCY = BEHAVIOR___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___EXCLUDE_COLLISIONS__ELIST = BEHAVIOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT = BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IMPORT_MEMBERS__ELIST = BEHAVIOR___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IMPORTED_MEMBER = BEHAVIOR___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE = BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_TEMPLATE_PARAMETER = BEHAVIOR___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CONFORMS_TO__TYPE = BEHAVIOR___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_TEMPLATE = BEHAVIOR___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___PARAMETERABLE_ELEMENTS = BEHAVIOR___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_FEATURES = BEHAVIOR___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_PARENTS = BEHAVIOR___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GENERAL = BEHAVIOR___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT = BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___INHERIT__ELIST = BEHAVIOR___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER = BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___INHERITED_MEMBER = BEHAVIOR___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER = BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___PARENTS = BEHAVIOR___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___DIRECTLY_REALIZED_INTERFACES = BEHAVIOR___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___DIRECTLY_USED_INTERFACES = BEHAVIOR___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_REALIZED_INTERFACES = BEHAVIOR___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_USED_INTERFACES = BEHAVIOR___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER = BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_ATTRIBUTES = BEHAVIOR___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_SLOTTABLE_FEATURES = BEHAVIOR___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___PART = BEHAVIOR___PART;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_ROLES = BEHAVIOR___ALL_ROLES;

	/**
	 * The operation id for the '<em>Owned Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___OWNED_PORT = BEHAVIOR___OWNED_PORT;

	/**
	 * The operation id for the '<em>Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___EXTENSION = BEHAVIOR___EXTENSION;

	/**
	 * The operation id for the '<em>Super Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___SUPER_CLASS = BEHAVIOR___SUPER_CLASS;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CONTEXT = BEHAVIOR___CONTEXT;

	/**
	 * The operation id for the '<em>Behaviored Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT = BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___INPUT_PARAMETERS = BEHAVIOR___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___OUTPUT_PARAMETERS = BEHAVIOR___OUTPUT_PARAMETERS;

	/**
	 * The number of operations of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.FunctionBehaviorImpl <em>Function Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.FunctionBehaviorImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getFunctionBehavior()
	 * @generated
	 */
	int FUNCTION_BEHAVIOR = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_COMMENT = OPAQUE_BEHAVIOR__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_ELEMENT = OPAQUE_BEHAVIOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNER = OPAQUE_BEHAVIOR__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__NAME = OPAQUE_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__NAME_EXPRESSION = OPAQUE_BEHAVIOR__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__NAMESPACE = OPAQUE_BEHAVIOR__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__QUALIFIED_NAME = OPAQUE_BEHAVIOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__VISIBILITY = OPAQUE_BEHAVIOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__CLIENT_DEPENDENCY = OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__ELEMENT_IMPORT = OPAQUE_BEHAVIOR__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__IMPORTED_MEMBER = OPAQUE_BEHAVIOR__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__MEMBER = OPAQUE_BEHAVIOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_MEMBER = OPAQUE_BEHAVIOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_RULE = OPAQUE_BEHAVIOR__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__PACKAGE_IMPORT = OPAQUE_BEHAVIOR__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__IS_LEAF = OPAQUE_BEHAVIOR__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__REDEFINED_ELEMENT = OPAQUE_BEHAVIOR__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__REDEFINITION_CONTEXT = OPAQUE_BEHAVIOR__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNING_TEMPLATE_PARAMETER = OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__TEMPLATE_PARAMETER = OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__PACKAGE = OPAQUE_BEHAVIOR__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__TEMPLATE_BINDING = OPAQUE_BEHAVIOR__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE = OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__SUBSTITUTION = OPAQUE_BEHAVIOR__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__FEATURE = OPAQUE_BEHAVIOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__POWERTYPE_EXTENT = OPAQUE_BEHAVIOR__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__GENERALIZATION = OPAQUE_BEHAVIOR__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__ATTRIBUTE = OPAQUE_BEHAVIOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__COLLABORATION_USE = OPAQUE_BEHAVIOR__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__GENERAL = OPAQUE_BEHAVIOR__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__INHERITED_MEMBER = OPAQUE_BEHAVIOR__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__IS_ABSTRACT = OPAQUE_BEHAVIOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__IS_FINAL_SPECIALIZATION = OPAQUE_BEHAVIOR__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_USE_CASE = OPAQUE_BEHAVIOR__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__USE_CASE = OPAQUE_BEHAVIOR__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__REDEFINED_CLASSIFIER = OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__REPRESENTATION = OPAQUE_BEHAVIOR__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_ATTRIBUTE = OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_CONNECTOR = OPAQUE_BEHAVIOR__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__PART = OPAQUE_BEHAVIOR__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__ROLE = OPAQUE_BEHAVIOR__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_PORT = OPAQUE_BEHAVIOR__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__INTERFACE_REALIZATION = OPAQUE_BEHAVIOR__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__CLASSIFIER_BEHAVIOR = OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_BEHAVIOR = OPAQUE_BEHAVIOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_OPERATION = OPAQUE_BEHAVIOR__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__EXTENSION = OPAQUE_BEHAVIOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__IS_ACTIVE = OPAQUE_BEHAVIOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__NESTED_CLASSIFIER = OPAQUE_BEHAVIOR__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_RECEPTION = OPAQUE_BEHAVIOR__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__SUPER_CLASS = OPAQUE_BEHAVIOR__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__SPECIFICATION = OPAQUE_BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__CONTEXT = OPAQUE_BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__IS_REENTRANT = OPAQUE_BEHAVIOR__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_PARAMETER = OPAQUE_BEHAVIOR__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__OWNED_PARAMETER_SET = OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__POSTCONDITION = OPAQUE_BEHAVIOR__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__PRECONDITION = OPAQUE_BEHAVIOR__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__REDEFINED_BEHAVIOR = OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__BODY = OPAQUE_BEHAVIOR__BODY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR__LANGUAGE = OPAQUE_BEHAVIOR__LANGUAGE;

	/**
	 * The number of structural features of the '<em>Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR_FEATURE_COUNT = OPAQUE_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_OWNED_ELEMENTS = OPAQUE_BEHAVIOR___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___MUST_BE_OWNED = OPAQUE_BEHAVIOR___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_NAMESPACES = OPAQUE_BEHAVIOR___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_OWNING_PACKAGES = OPAQUE_BEHAVIOR___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = OPAQUE_BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___QUALIFIED_NAME = OPAQUE_BEHAVIOR___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___SEPARATOR = OPAQUE_BEHAVIOR___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___CLIENT_DEPENDENCY = OPAQUE_BEHAVIOR___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___EXCLUDE_COLLISIONS__ELIST = OPAQUE_BEHAVIOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT = OPAQUE_BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___IMPORT_MEMBERS__ELIST = OPAQUE_BEHAVIOR___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___IMPORTED_MEMBER = OPAQUE_BEHAVIOR___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE = OPAQUE_BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = OPAQUE_BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = OPAQUE_BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = OPAQUE_BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___IS_TEMPLATE_PARAMETER = OPAQUE_BEHAVIOR___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___CONFORMS_TO__TYPE = OPAQUE_BEHAVIOR___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___IS_TEMPLATE = OPAQUE_BEHAVIOR___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___PARAMETERABLE_ELEMENTS = OPAQUE_BEHAVIOR___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_FEATURES = OPAQUE_BEHAVIOR___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_PARENTS = OPAQUE_BEHAVIOR___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___GENERAL = OPAQUE_BEHAVIOR___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT = OPAQUE_BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___INHERIT__ELIST = OPAQUE_BEHAVIOR___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER = OPAQUE_BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___INHERITED_MEMBER = OPAQUE_BEHAVIOR___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER = OPAQUE_BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___PARENTS = OPAQUE_BEHAVIOR___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___DIRECTLY_REALIZED_INTERFACES = OPAQUE_BEHAVIOR___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___DIRECTLY_USED_INTERFACES = OPAQUE_BEHAVIOR___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_REALIZED_INTERFACES = OPAQUE_BEHAVIOR___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_USED_INTERFACES = OPAQUE_BEHAVIOR___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER = OPAQUE_BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_ATTRIBUTES = OPAQUE_BEHAVIOR___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_SLOTTABLE_FEATURES = OPAQUE_BEHAVIOR___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___PART = OPAQUE_BEHAVIOR___PART;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___ALL_ROLES = OPAQUE_BEHAVIOR___ALL_ROLES;

	/**
	 * The operation id for the '<em>Owned Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___OWNED_PORT = OPAQUE_BEHAVIOR___OWNED_PORT;

	/**
	 * The operation id for the '<em>Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___EXTENSION = OPAQUE_BEHAVIOR___EXTENSION;

	/**
	 * The operation id for the '<em>Super Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___SUPER_CLASS = OPAQUE_BEHAVIOR___SUPER_CLASS;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___CONTEXT = OPAQUE_BEHAVIOR___CONTEXT;

	/**
	 * The operation id for the '<em>Behaviored Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT = OPAQUE_BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___INPUT_PARAMETERS = OPAQUE_BEHAVIOR___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___OUTPUT_PARAMETERS = OPAQUE_BEHAVIOR___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Has All Data Type Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR___HAS_ALL_DATA_TYPE_ATTRIBUTES__DATATYPE = OPAQUE_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BEHAVIOR_OPERATION_COUNT = OPAQUE_BEHAVIOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.SignalEventImpl <em>Signal Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.SignalEventImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getSignalEvent()
	 * @generated
	 */
	int SIGNAL_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__OWNED_COMMENT = MESSAGE_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__OWNED_ELEMENT = MESSAGE_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__OWNER = MESSAGE_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__NAME = MESSAGE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__NAME_EXPRESSION = MESSAGE_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__NAMESPACE = MESSAGE_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__QUALIFIED_NAME = MESSAGE_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__VISIBILITY = MESSAGE_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__CLIENT_DEPENDENCY = MESSAGE_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__OWNING_TEMPLATE_PARAMETER = MESSAGE_EVENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__TEMPLATE_PARAMETER = MESSAGE_EVENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT__SIGNAL = MESSAGE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_FEATURE_COUNT = MESSAGE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___ALL_OWNED_ELEMENTS = MESSAGE_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___MUST_BE_OWNED = MESSAGE_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___ALL_NAMESPACES = MESSAGE_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___ALL_OWNING_PACKAGES = MESSAGE_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = MESSAGE_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___QUALIFIED_NAME = MESSAGE_EVENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___SEPARATOR = MESSAGE_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___CLIENT_DEPENDENCY = MESSAGE_EVENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = MESSAGE_EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT___IS_TEMPLATE_PARAMETER = MESSAGE_EVENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Signal Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_OPERATION_COUNT = MESSAGE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonBehavior.impl.TimeEventImpl <em>Time Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonBehavior.impl.TimeEventImpl
	 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getTimeEvent()
	 * @generated
	 */
	int TIME_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__OWNED_COMMENT = EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__OWNED_ELEMENT = EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__OWNER = EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__NAME_EXPRESSION = EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__NAMESPACE = EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__QUALIFIED_NAME = EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__CLIENT_DEPENDENCY = EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__OWNING_TEMPLATE_PARAMETER = EVENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__TEMPLATE_PARAMETER = EVENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__IS_RELATIVE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__WHEN = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___ALL_OWNED_ELEMENTS = EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___MUST_BE_OWNED = EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___ALL_NAMESPACES = EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___ALL_OWNING_PACKAGES = EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___QUALIFIED_NAME = EVENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___SEPARATOR = EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___CLIENT_DEPENDENCY = EVENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = EVENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT___IS_TEMPLATE_PARAMETER = EVENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Time Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.AnyReceiveEvent <em>Any Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Receive Event</em>'.
	 * @see uml.commonBehavior.AnyReceiveEvent
	 * @generated
	 */
	EClass getAnyReceiveEvent();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.MessageEvent <em>Message Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event</em>'.
	 * @see uml.commonBehavior.MessageEvent
	 * @generated
	 */
	EClass getMessageEvent();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see uml.commonBehavior.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see uml.commonBehavior.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link uml.commonBehavior.Trigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see uml.commonBehavior.Trigger#getEvent()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Event();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonBehavior.Trigger#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see uml.commonBehavior.Trigger#getPort()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Port();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.CallEvent <em>Call Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Event</em>'.
	 * @see uml.commonBehavior.CallEvent
	 * @generated
	 */
	EClass getCallEvent();

	/**
	 * Returns the meta object for the reference '{@link uml.commonBehavior.CallEvent#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see uml.commonBehavior.CallEvent#getOperation()
	 * @see #getCallEvent()
	 * @generated
	 */
	EReference getCallEvent_Operation();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.ChangeEvent <em>Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Event</em>'.
	 * @see uml.commonBehavior.ChangeEvent
	 * @generated
	 */
	EClass getChangeEvent();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonBehavior.ChangeEvent#getChangeExpression <em>Change Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Expression</em>'.
	 * @see uml.commonBehavior.ChangeEvent#getChangeExpression()
	 * @see #getChangeEvent()
	 * @generated
	 */
	EReference getChangeEvent_ChangeExpression();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.FunctionBehavior <em>Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Behavior</em>'.
	 * @see uml.commonBehavior.FunctionBehavior
	 * @generated
	 */
	EClass getFunctionBehavior();

	/**
	 * Returns the meta object for the '{@link uml.commonBehavior.FunctionBehavior#hasAllDataTypeAttributes(uml.simpleClassifiers.DataType) <em>Has All Data Type Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has All Data Type Attributes</em>' operation.
	 * @see uml.commonBehavior.FunctionBehavior#hasAllDataTypeAttributes(uml.simpleClassifiers.DataType)
	 * @generated
	 */
	EOperation getFunctionBehavior__HasAllDataTypeAttributes__DataType();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.OpaqueBehavior <em>Opaque Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Behavior</em>'.
	 * @see uml.commonBehavior.OpaqueBehavior
	 * @generated
	 */
	EClass getOpaqueBehavior();

	/**
	 * Returns the meta object for the attribute list '{@link uml.commonBehavior.OpaqueBehavior#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Body</em>'.
	 * @see uml.commonBehavior.OpaqueBehavior#getBody()
	 * @see #getOpaqueBehavior()
	 * @generated
	 */
	EAttribute getOpaqueBehavior_Body();

	/**
	 * Returns the meta object for the attribute list '{@link uml.commonBehavior.OpaqueBehavior#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see uml.commonBehavior.OpaqueBehavior#getLanguage()
	 * @see #getOpaqueBehavior()
	 * @generated
	 */
	EAttribute getOpaqueBehavior_Language();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.SignalEvent <em>Signal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Event</em>'.
	 * @see uml.commonBehavior.SignalEvent
	 * @generated
	 */
	EClass getSignalEvent();

	/**
	 * Returns the meta object for the reference '{@link uml.commonBehavior.SignalEvent#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see uml.commonBehavior.SignalEvent#getSignal()
	 * @see #getSignalEvent()
	 * @generated
	 */
	EReference getSignalEvent_Signal();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.TimeEvent <em>Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Event</em>'.
	 * @see uml.commonBehavior.TimeEvent
	 * @generated
	 */
	EClass getTimeEvent();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonBehavior.TimeEvent#isIsRelative <em>Is Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Relative</em>'.
	 * @see uml.commonBehavior.TimeEvent#isIsRelative()
	 * @see #getTimeEvent()
	 * @generated
	 */
	EAttribute getTimeEvent_IsRelative();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonBehavior.TimeEvent#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see uml.commonBehavior.TimeEvent#getWhen()
	 * @see #getTimeEvent()
	 * @generated
	 */
	EReference getTimeEvent_When();

	/**
	 * Returns the meta object for class '{@link uml.commonBehavior.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see uml.commonBehavior.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the reference '{@link uml.commonBehavior.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see uml.commonBehavior.Behavior#getSpecification()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Specification();

	/**
	 * Returns the meta object for the reference '{@link uml.commonBehavior.Behavior#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see uml.commonBehavior.Behavior#getContext()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Context();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonBehavior.Behavior#isIsReentrant <em>Is Reentrant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reentrant</em>'.
	 * @see uml.commonBehavior.Behavior#isIsReentrant()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_IsReentrant();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.commonBehavior.Behavior#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see uml.commonBehavior.Behavior#getOwnedParameter()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_OwnedParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.commonBehavior.Behavior#getOwnedParameterSet <em>Owned Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter Set</em>'.
	 * @see uml.commonBehavior.Behavior#getOwnedParameterSet()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_OwnedParameterSet();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonBehavior.Behavior#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Postcondition</em>'.
	 * @see uml.commonBehavior.Behavior#getPostcondition()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Postcondition();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonBehavior.Behavior#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precondition</em>'.
	 * @see uml.commonBehavior.Behavior#getPrecondition()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Precondition();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonBehavior.Behavior#getRedefinedBehavior <em>Redefined Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Behavior</em>'.
	 * @see uml.commonBehavior.Behavior#getRedefinedBehavior()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_RedefinedBehavior();

	/**
	 * Returns the meta object for the '{@link uml.commonBehavior.Behavior#context() <em>Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Context</em>' operation.
	 * @see uml.commonBehavior.Behavior#context()
	 * @generated
	 */
	EOperation getBehavior__Context();

	/**
	 * Returns the meta object for the '{@link uml.commonBehavior.Behavior#behavioredClassifier(uml.commonStructure.Element) <em>Behaviored Classifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Behaviored Classifier</em>' operation.
	 * @see uml.commonBehavior.Behavior#behavioredClassifier(uml.commonStructure.Element)
	 * @generated
	 */
	EOperation getBehavior__BehavioredClassifier__Element();

	/**
	 * Returns the meta object for the '{@link uml.commonBehavior.Behavior#inputParameters() <em>Input Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Parameters</em>' operation.
	 * @see uml.commonBehavior.Behavior#inputParameters()
	 * @generated
	 */
	EOperation getBehavior__InputParameters();

	/**
	 * Returns the meta object for the '{@link uml.commonBehavior.Behavior#outputParameters() <em>Output Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output Parameters</em>' operation.
	 * @see uml.commonBehavior.Behavior#outputParameters()
	 * @generated
	 */
	EOperation getBehavior__OutputParameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonBehaviorFactory getCommonBehaviorFactory();

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
		 * The meta object literal for the '{@link uml.commonBehavior.impl.AnyReceiveEventImpl <em>Any Receive Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.AnyReceiveEventImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getAnyReceiveEvent()
		 * @generated
		 */
		EClass ANY_RECEIVE_EVENT = eINSTANCE.getAnyReceiveEvent();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.MessageEventImpl <em>Message Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.MessageEventImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getMessageEvent()
		 * @generated
		 */
		EClass MESSAGE_EVENT = eINSTANCE.getMessageEvent();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.EventImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.TriggerImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__EVENT = eINSTANCE.getTrigger_Event();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__PORT = eINSTANCE.getTrigger_Port();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.CallEventImpl <em>Call Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.CallEventImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getCallEvent()
		 * @generated
		 */
		EClass CALL_EVENT = eINSTANCE.getCallEvent();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EVENT__OPERATION = eINSTANCE.getCallEvent_Operation();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.ChangeEventImpl <em>Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.ChangeEventImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getChangeEvent()
		 * @generated
		 */
		EClass CHANGE_EVENT = eINSTANCE.getChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Change Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_EVENT__CHANGE_EXPRESSION = eINSTANCE.getChangeEvent_ChangeExpression();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.FunctionBehaviorImpl <em>Function Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.FunctionBehaviorImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getFunctionBehavior()
		 * @generated
		 */
		EClass FUNCTION_BEHAVIOR = eINSTANCE.getFunctionBehavior();

		/**
		 * The meta object literal for the '<em><b>Has All Data Type Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCTION_BEHAVIOR___HAS_ALL_DATA_TYPE_ATTRIBUTES__DATATYPE = eINSTANCE.getFunctionBehavior__HasAllDataTypeAttributes__DataType();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.OpaqueBehaviorImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getOpaqueBehavior()
		 * @generated
		 */
		EClass OPAQUE_BEHAVIOR = eINSTANCE.getOpaqueBehavior();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_BEHAVIOR__BODY = eINSTANCE.getOpaqueBehavior_Body();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_BEHAVIOR__LANGUAGE = eINSTANCE.getOpaqueBehavior_Language();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.SignalEventImpl <em>Signal Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.SignalEventImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getSignalEvent()
		 * @generated
		 */
		EClass SIGNAL_EVENT = eINSTANCE.getSignalEvent();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_EVENT__SIGNAL = eINSTANCE.getSignalEvent_Signal();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.TimeEventImpl <em>Time Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.TimeEventImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getTimeEvent()
		 * @generated
		 */
		EClass TIME_EVENT = eINSTANCE.getTimeEvent();

		/**
		 * The meta object literal for the '<em><b>Is Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_EVENT__IS_RELATIVE = eINSTANCE.getTimeEvent_IsRelative();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EVENT__WHEN = eINSTANCE.getTimeEvent_When();

		/**
		 * The meta object literal for the '{@link uml.commonBehavior.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonBehavior.impl.BehaviorImpl
		 * @see uml.commonBehavior.impl.CommonBehaviorPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__SPECIFICATION = eINSTANCE.getBehavior_Specification();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__CONTEXT = eINSTANCE.getBehavior_Context();

		/**
		 * The meta object literal for the '<em><b>Is Reentrant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__IS_REENTRANT = eINSTANCE.getBehavior_IsReentrant();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__OWNED_PARAMETER = eINSTANCE.getBehavior_OwnedParameter();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__OWNED_PARAMETER_SET = eINSTANCE.getBehavior_OwnedParameterSet();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__POSTCONDITION = eINSTANCE.getBehavior_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__PRECONDITION = eINSTANCE.getBehavior_Precondition();

		/**
		 * The meta object literal for the '<em><b>Redefined Behavior</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__REDEFINED_BEHAVIOR = eINSTANCE.getBehavior_RedefinedBehavior();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BEHAVIOR___CONTEXT = eINSTANCE.getBehavior__Context();

		/**
		 * The meta object literal for the '<em><b>Behaviored Classifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT = eINSTANCE.getBehavior__BehavioredClassifier__Element();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BEHAVIOR___INPUT_PARAMETERS = eINSTANCE.getBehavior__InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BEHAVIOR___OUTPUT_PARAMETERS = eINSTANCE.getBehavior__OutputParameters();

	}

} //CommonBehaviorPackage
