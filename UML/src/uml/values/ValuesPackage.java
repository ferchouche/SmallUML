/**
 */
package uml.values;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see uml.values.ValuesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Values'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface ValuesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "values";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/values.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.values";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValuesPackage eINSTANCE = uml.values.impl.ValuesPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.values.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.ValueSpecificationImpl
	 * @see uml.values.impl.ValuesPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__OWNED_COMMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__OWNED_ELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__OWNER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__NAME_EXPRESSION = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__VISIBILITY = CommonStructurePackage.PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__TYPE = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___ALL_OWNED_ELEMENTS = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___MUST_BE_OWNED = CommonStructurePackage.PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___ALL_NAMESPACES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___ALL_OWNING_PACKAGES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___SEPARATOR = CommonStructurePackage.PACKAGEABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___IS_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___BOOLEAN_VALUE = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___INTEGER_VALUE = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___IS_COMPUTABLE = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___IS_NULL = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___REAL_VALUE = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___STRING_VALUE = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION___UNLIMITED_VALUE = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_OPERATION_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link uml.values.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.DurationImpl
	 * @see uml.values.impl.ValuesPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__OWNED_COMMENT = VALUE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__OWNED_ELEMENT = VALUE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__OWNER = VALUE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__NAME_EXPRESSION = VALUE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__NAMESPACE = VALUE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__QUALIFIED_NAME = VALUE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__VISIBILITY = VALUE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CLIENT_DEPENDENCY = VALUE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__OWNING_TEMPLATE_PARAMETER = VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__TEMPLATE_PARAMETER = VALUE_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__EXPR = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__OBSERVATION = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___ALL_OWNED_ELEMENTS = VALUE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___MUST_BE_OWNED = VALUE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___ALL_NAMESPACES = VALUE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___ALL_OWNING_PACKAGES = VALUE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VALUE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___QUALIFIED_NAME = VALUE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___SEPARATOR = VALUE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___CLIENT_DEPENDENCY = VALUE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = VALUE_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___IS_TEMPLATE_PARAMETER = VALUE_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___BOOLEAN_VALUE = VALUE_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___INTEGER_VALUE = VALUE_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___IS_COMPUTABLE = VALUE_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___IS_NULL = VALUE_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___REAL_VALUE = VALUE_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___STRING_VALUE = VALUE_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION___UNLIMITED_VALUE = VALUE_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.ObservationImpl
	 * @see uml.values.impl.ValuesPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__OWNED_COMMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__OWNED_ELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__OWNER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__NAME_EXPRESSION = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__VISIBILITY = CommonStructurePackage.PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___ALL_OWNED_ELEMENTS = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___MUST_BE_OWNED = CommonStructurePackage.PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___ALL_NAMESPACES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___ALL_OWNING_PACKAGES = CommonStructurePackage.PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___QUALIFIED_NAME = CommonStructurePackage.PACKAGEABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___SEPARATOR = CommonStructurePackage.PACKAGEABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___CLIENT_DEPENDENCY = CommonStructurePackage.PACKAGEABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION___IS_TEMPLATE_PARAMETER = CommonStructurePackage.PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_OPERATION_COUNT = CommonStructurePackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.IntervalConstraintImpl <em>Interval Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.IntervalConstraintImpl
	 * @see uml.values.impl.ValuesPackageImpl#getIntervalConstraint()
	 * @generated
	 */
	int INTERVAL_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__OWNED_COMMENT = CommonStructurePackage.CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__OWNED_ELEMENT = CommonStructurePackage.CONSTRAINT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__OWNER = CommonStructurePackage.CONSTRAINT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__NAME = CommonStructurePackage.CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__NAME_EXPRESSION = CommonStructurePackage.CONSTRAINT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__NAMESPACE = CommonStructurePackage.CONSTRAINT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__QUALIFIED_NAME = CommonStructurePackage.CONSTRAINT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__VISIBILITY = CommonStructurePackage.CONSTRAINT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__CLIENT_DEPENDENCY = CommonStructurePackage.CONSTRAINT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__TEMPLATE_PARAMETER = CommonStructurePackage.CONSTRAINT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__CONSTRAINED_ELEMENT = CommonStructurePackage.CONSTRAINT__CONSTRAINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__SPECIFICATION = CommonStructurePackage.CONSTRAINT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT__CONTEXT = CommonStructurePackage.CONSTRAINT__CONTEXT;

	/**
	 * The number of structural features of the '<em>Interval Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT_FEATURE_COUNT = CommonStructurePackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___ALL_OWNED_ELEMENTS = CommonStructurePackage.CONSTRAINT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___MUST_BE_OWNED = CommonStructurePackage.CONSTRAINT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___ALL_NAMESPACES = CommonStructurePackage.CONSTRAINT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___ALL_OWNING_PACKAGES = CommonStructurePackage.CONSTRAINT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___QUALIFIED_NAME = CommonStructurePackage.CONSTRAINT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___SEPARATOR = CommonStructurePackage.CONSTRAINT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___CLIENT_DEPENDENCY = CommonStructurePackage.CONSTRAINT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT___IS_TEMPLATE_PARAMETER = CommonStructurePackage.CONSTRAINT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Interval Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_CONSTRAINT_OPERATION_COUNT = CommonStructurePackage.CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.DurationConstraintImpl <em>Duration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.DurationConstraintImpl
	 * @see uml.values.impl.ValuesPackageImpl#getDurationConstraint()
	 * @generated
	 */
	int DURATION_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__OWNED_COMMENT = INTERVAL_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__OWNED_ELEMENT = INTERVAL_CONSTRAINT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__OWNER = INTERVAL_CONSTRAINT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__NAME = INTERVAL_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__NAME_EXPRESSION = INTERVAL_CONSTRAINT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__NAMESPACE = INTERVAL_CONSTRAINT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__QUALIFIED_NAME = INTERVAL_CONSTRAINT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__VISIBILITY = INTERVAL_CONSTRAINT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__CLIENT_DEPENDENCY = INTERVAL_CONSTRAINT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER = INTERVAL_CONSTRAINT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__TEMPLATE_PARAMETER = INTERVAL_CONSTRAINT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__CONSTRAINED_ELEMENT = INTERVAL_CONSTRAINT__CONSTRAINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__SPECIFICATION = INTERVAL_CONSTRAINT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__CONTEXT = INTERVAL_CONSTRAINT__CONTEXT;

	/**
	 * The feature id for the '<em><b>First Event</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT__FIRST_EVENT = INTERVAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT_FEATURE_COUNT = INTERVAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___ALL_OWNED_ELEMENTS = INTERVAL_CONSTRAINT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___MUST_BE_OWNED = INTERVAL_CONSTRAINT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___ALL_NAMESPACES = INTERVAL_CONSTRAINT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___ALL_OWNING_PACKAGES = INTERVAL_CONSTRAINT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERVAL_CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___QUALIFIED_NAME = INTERVAL_CONSTRAINT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___SEPARATOR = INTERVAL_CONSTRAINT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___CLIENT_DEPENDENCY = INTERVAL_CONSTRAINT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = INTERVAL_CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT___IS_TEMPLATE_PARAMETER = INTERVAL_CONSTRAINT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Duration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONSTRAINT_OPERATION_COUNT = INTERVAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.IntervalImpl
	 * @see uml.values.impl.ValuesPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__OWNED_COMMENT = VALUE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__OWNED_ELEMENT = VALUE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__OWNER = VALUE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__NAME_EXPRESSION = VALUE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__NAMESPACE = VALUE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__QUALIFIED_NAME = VALUE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__VISIBILITY = VALUE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__CLIENT_DEPENDENCY = VALUE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__OWNING_TEMPLATE_PARAMETER = VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__TEMPLATE_PARAMETER = VALUE_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__MAX = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__MIN = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___ALL_OWNED_ELEMENTS = VALUE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___MUST_BE_OWNED = VALUE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___ALL_NAMESPACES = VALUE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___ALL_OWNING_PACKAGES = VALUE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VALUE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___QUALIFIED_NAME = VALUE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___SEPARATOR = VALUE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___CLIENT_DEPENDENCY = VALUE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = VALUE_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___IS_TEMPLATE_PARAMETER = VALUE_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___BOOLEAN_VALUE = VALUE_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___INTEGER_VALUE = VALUE_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___IS_COMPUTABLE = VALUE_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___IS_NULL = VALUE_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___REAL_VALUE = VALUE_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___STRING_VALUE = VALUE_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___UNLIMITED_VALUE = VALUE_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.DurationIntervalImpl <em>Duration Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.DurationIntervalImpl
	 * @see uml.values.impl.ValuesPackageImpl#getDurationInterval()
	 * @generated
	 */
	int DURATION_INTERVAL = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__OWNED_COMMENT = INTERVAL__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__OWNED_ELEMENT = INTERVAL__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__OWNER = INTERVAL__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__NAME = INTERVAL__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__NAME_EXPRESSION = INTERVAL__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__NAMESPACE = INTERVAL__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__QUALIFIED_NAME = INTERVAL__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__VISIBILITY = INTERVAL__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__CLIENT_DEPENDENCY = INTERVAL__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__OWNING_TEMPLATE_PARAMETER = INTERVAL__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__TEMPLATE_PARAMETER = INTERVAL__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__TYPE = INTERVAL__TYPE;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__MAX = INTERVAL__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__MIN = INTERVAL__MIN;

	/**
	 * The number of structural features of the '<em>Duration Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL_FEATURE_COUNT = INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___ALL_OWNED_ELEMENTS = INTERVAL___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___MUST_BE_OWNED = INTERVAL___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___ALL_NAMESPACES = INTERVAL___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___ALL_OWNING_PACKAGES = INTERVAL___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERVAL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___QUALIFIED_NAME = INTERVAL___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___SEPARATOR = INTERVAL___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___CLIENT_DEPENDENCY = INTERVAL___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = INTERVAL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___IS_TEMPLATE_PARAMETER = INTERVAL___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___BOOLEAN_VALUE = INTERVAL___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___INTEGER_VALUE = INTERVAL___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___IS_COMPUTABLE = INTERVAL___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___IS_NULL = INTERVAL___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___REAL_VALUE = INTERVAL___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___STRING_VALUE = INTERVAL___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL___UNLIMITED_VALUE = INTERVAL___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Duration Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL_OPERATION_COUNT = INTERVAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.DurationObservationImpl <em>Duration Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.DurationObservationImpl
	 * @see uml.values.impl.ValuesPackageImpl#getDurationObservation()
	 * @generated
	 */
	int DURATION_OBSERVATION = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__OWNED_COMMENT = OBSERVATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__OWNED_ELEMENT = OBSERVATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__OWNER = OBSERVATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__NAME = OBSERVATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__NAME_EXPRESSION = OBSERVATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__NAMESPACE = OBSERVATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__QUALIFIED_NAME = OBSERVATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__VISIBILITY = OBSERVATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__CLIENT_DEPENDENCY = OBSERVATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__OWNING_TEMPLATE_PARAMETER = OBSERVATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__TEMPLATE_PARAMETER = OBSERVATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__EVENT = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Event</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION__FIRST_EVENT = OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Duration Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___ALL_OWNED_ELEMENTS = OBSERVATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___MUST_BE_OWNED = OBSERVATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___ALL_NAMESPACES = OBSERVATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___ALL_OWNING_PACKAGES = OBSERVATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = OBSERVATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___QUALIFIED_NAME = OBSERVATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___SEPARATOR = OBSERVATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___CLIENT_DEPENDENCY = OBSERVATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = OBSERVATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION___IS_TEMPLATE_PARAMETER = OBSERVATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Duration Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_OBSERVATION_OPERATION_COUNT = OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.ExpressionImpl
	 * @see uml.values.impl.ValuesPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_COMMENT = VALUE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNED_ELEMENT = VALUE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNER = VALUE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME_EXPRESSION = VALUE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAMESPACE = VALUE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__QUALIFIED_NAME = VALUE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VISIBILITY = VALUE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CLIENT_DEPENDENCY = VALUE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OWNING_TEMPLATE_PARAMETER = VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TEMPLATE_PARAMETER = VALUE_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPERAND = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SYMBOL = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ALL_OWNED_ELEMENTS = VALUE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___MUST_BE_OWNED = VALUE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ALL_NAMESPACES = VALUE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___ALL_OWNING_PACKAGES = VALUE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VALUE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___QUALIFIED_NAME = VALUE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___SEPARATOR = VALUE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___CLIENT_DEPENDENCY = VALUE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = VALUE_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___IS_TEMPLATE_PARAMETER = VALUE_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___BOOLEAN_VALUE = VALUE_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___INTEGER_VALUE = VALUE_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___IS_COMPUTABLE = VALUE_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___IS_NULL = VALUE_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___REAL_VALUE = VALUE_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___STRING_VALUE = VALUE_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___UNLIMITED_VALUE = VALUE_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.LiteralSpecificationImpl
	 * @see uml.values.impl.ValuesPackageImpl#getLiteralSpecification()
	 * @generated
	 */
	int LITERAL_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__OWNED_COMMENT = VALUE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__OWNED_ELEMENT = VALUE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__OWNER = VALUE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__NAME_EXPRESSION = VALUE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__NAMESPACE = VALUE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__QUALIFIED_NAME = VALUE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__VISIBILITY = VALUE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__CLIENT_DEPENDENCY = VALUE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__OWNING_TEMPLATE_PARAMETER = VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__TEMPLATE_PARAMETER = VALUE_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The number of structural features of the '<em>Literal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___ALL_OWNED_ELEMENTS = VALUE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___MUST_BE_OWNED = VALUE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___ALL_NAMESPACES = VALUE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___ALL_OWNING_PACKAGES = VALUE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VALUE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___QUALIFIED_NAME = VALUE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___SEPARATOR = VALUE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___CLIENT_DEPENDENCY = VALUE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = VALUE_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___IS_TEMPLATE_PARAMETER = VALUE_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___BOOLEAN_VALUE = VALUE_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___INTEGER_VALUE = VALUE_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___IS_COMPUTABLE = VALUE_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___IS_NULL = VALUE_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___REAL_VALUE = VALUE_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___STRING_VALUE = VALUE_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION___UNLIMITED_VALUE = VALUE_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Literal Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_SPECIFICATION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.LiteralBooleanImpl
	 * @see uml.values.impl.ValuesPackageImpl#getLiteralBoolean()
	 * @generated
	 */
	int LITERAL_BOOLEAN = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__NAME_EXPRESSION = LITERAL_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__CLIENT_DEPENDENCY = LITERAL_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__OWNING_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___ALL_OWNED_ELEMENTS = LITERAL_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___MUST_BE_OWNED = LITERAL_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___ALL_NAMESPACES = LITERAL_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___ALL_OWNING_PACKAGES = LITERAL_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = LITERAL_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___QUALIFIED_NAME = LITERAL_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___SEPARATOR = LITERAL_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___CLIENT_DEPENDENCY = LITERAL_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = LITERAL_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___IS_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___IS_NULL = LITERAL_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___REAL_VALUE = LITERAL_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___STRING_VALUE = LITERAL_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN___UNLIMITED_VALUE = LITERAL_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Literal Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_BOOLEAN_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.LiteralIntegerImpl
	 * @see uml.values.impl.ValuesPackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 11;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__NAME_EXPRESSION = LITERAL_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__CLIENT_DEPENDENCY = LITERAL_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__OWNING_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___ALL_OWNED_ELEMENTS = LITERAL_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___MUST_BE_OWNED = LITERAL_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___ALL_NAMESPACES = LITERAL_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___ALL_OWNING_PACKAGES = LITERAL_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = LITERAL_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___QUALIFIED_NAME = LITERAL_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___SEPARATOR = LITERAL_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___CLIENT_DEPENDENCY = LITERAL_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = LITERAL_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___IS_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___IS_NULL = LITERAL_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___REAL_VALUE = LITERAL_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___STRING_VALUE = LITERAL_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER___UNLIMITED_VALUE = LITERAL_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.LiteralNullImpl <em>Literal Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.LiteralNullImpl
	 * @see uml.values.impl.ValuesPackageImpl#getLiteralNull()
	 * @generated
	 */
	int LITERAL_NULL = 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__NAME_EXPRESSION = LITERAL_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__CLIENT_DEPENDENCY = LITERAL_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__OWNING_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The number of structural features of the '<em>Literal Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___ALL_OWNED_ELEMENTS = LITERAL_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___MUST_BE_OWNED = LITERAL_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___ALL_NAMESPACES = LITERAL_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___ALL_OWNING_PACKAGES = LITERAL_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = LITERAL_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___QUALIFIED_NAME = LITERAL_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___SEPARATOR = LITERAL_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___CLIENT_DEPENDENCY = LITERAL_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = LITERAL_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___IS_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___IS_NULL = LITERAL_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___REAL_VALUE = LITERAL_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___STRING_VALUE = LITERAL_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL___UNLIMITED_VALUE = LITERAL_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Literal Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_NULL_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.LiteralRealImpl <em>Literal Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.LiteralRealImpl
	 * @see uml.values.impl.ValuesPackageImpl#getLiteralReal()
	 * @generated
	 */
	int LITERAL_REAL = 13;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__NAME_EXPRESSION = LITERAL_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__CLIENT_DEPENDENCY = LITERAL_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__OWNING_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___ALL_OWNED_ELEMENTS = LITERAL_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___MUST_BE_OWNED = LITERAL_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___ALL_NAMESPACES = LITERAL_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___ALL_OWNING_PACKAGES = LITERAL_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = LITERAL_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___QUALIFIED_NAME = LITERAL_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___SEPARATOR = LITERAL_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___CLIENT_DEPENDENCY = LITERAL_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = LITERAL_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___IS_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___IS_NULL = LITERAL_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___REAL_VALUE = LITERAL_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___STRING_VALUE = LITERAL_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL___UNLIMITED_VALUE = LITERAL_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Literal Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_REAL_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.LiteralStringImpl <em>Literal String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.LiteralStringImpl
	 * @see uml.values.impl.ValuesPackageImpl#getLiteralString()
	 * @generated
	 */
	int LITERAL_STRING = 14;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__NAME_EXPRESSION = LITERAL_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__CLIENT_DEPENDENCY = LITERAL_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__OWNING_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___ALL_OWNED_ELEMENTS = LITERAL_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___MUST_BE_OWNED = LITERAL_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___ALL_NAMESPACES = LITERAL_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___ALL_OWNING_PACKAGES = LITERAL_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = LITERAL_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___QUALIFIED_NAME = LITERAL_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___SEPARATOR = LITERAL_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___CLIENT_DEPENDENCY = LITERAL_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = LITERAL_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___IS_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___IS_NULL = LITERAL_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___REAL_VALUE = LITERAL_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___STRING_VALUE = LITERAL_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING___UNLIMITED_VALUE = LITERAL_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Literal String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_STRING_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.LiteralUnlimitedNaturalImpl <em>Literal Unlimited Natural</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.LiteralUnlimitedNaturalImpl
	 * @see uml.values.impl.ValuesPackageImpl#getLiteralUnlimitedNatural()
	 * @generated
	 */
	int LITERAL_UNLIMITED_NATURAL = 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__OWNED_COMMENT = LITERAL_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__OWNED_ELEMENT = LITERAL_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__OWNER = LITERAL_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__NAME = LITERAL_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__NAME_EXPRESSION = LITERAL_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__NAMESPACE = LITERAL_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__QUALIFIED_NAME = LITERAL_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__VISIBILITY = LITERAL_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__CLIENT_DEPENDENCY = LITERAL_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__OWNING_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__TEMPLATE_PARAMETER = LITERAL_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__TYPE = LITERAL_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__VALUE = LITERAL_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Unlimited Natural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL_FEATURE_COUNT = LITERAL_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___ALL_OWNED_ELEMENTS = LITERAL_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___MUST_BE_OWNED = LITERAL_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___ALL_NAMESPACES = LITERAL_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___ALL_OWNING_PACKAGES = LITERAL_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = LITERAL_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___QUALIFIED_NAME = LITERAL_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___SEPARATOR = LITERAL_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___CLIENT_DEPENDENCY = LITERAL_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = LITERAL_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___IS_TEMPLATE_PARAMETER = LITERAL_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___BOOLEAN_VALUE = LITERAL_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___INTEGER_VALUE = LITERAL_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___IS_COMPUTABLE = LITERAL_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___IS_NULL = LITERAL_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___REAL_VALUE = LITERAL_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___STRING_VALUE = LITERAL_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL___UNLIMITED_VALUE = LITERAL_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Literal Unlimited Natural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL_OPERATION_COUNT = LITERAL_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.OpaqueExpressionImpl
	 * @see uml.values.impl.ValuesPackageImpl#getOpaqueExpression()
	 * @generated
	 */
	int OPAQUE_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__OWNED_COMMENT = VALUE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__OWNED_ELEMENT = VALUE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__OWNER = VALUE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__NAME_EXPRESSION = VALUE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__NAMESPACE = VALUE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__QUALIFIED_NAME = VALUE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__VISIBILITY = VALUE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__CLIENT_DEPENDENCY = VALUE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__OWNING_TEMPLATE_PARAMETER = VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__TEMPLATE_PARAMETER = VALUE_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__BEHAVIOR = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__BODY = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__LANGUAGE = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__RESULT = VALUE_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___ALL_OWNED_ELEMENTS = VALUE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___MUST_BE_OWNED = VALUE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___ALL_NAMESPACES = VALUE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___ALL_OWNING_PACKAGES = VALUE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VALUE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___QUALIFIED_NAME = VALUE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___SEPARATOR = VALUE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___CLIENT_DEPENDENCY = VALUE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = VALUE_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___IS_TEMPLATE_PARAMETER = VALUE_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___BOOLEAN_VALUE = VALUE_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___INTEGER_VALUE = VALUE_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___IS_COMPUTABLE = VALUE_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___IS_NULL = VALUE_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___REAL_VALUE = VALUE_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___STRING_VALUE = VALUE_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___UNLIMITED_VALUE = VALUE_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The operation id for the '<em>Is Integral</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___IS_INTEGRAL = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Non Negative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___IS_NON_NEGATIVE = VALUE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___IS_POSITIVE = VALUE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___RESULT = VALUE_SPECIFICATION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION___VALUE = VALUE_SPECIFICATION_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link uml.values.impl.TimeConstraintImpl <em>Time Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.TimeConstraintImpl
	 * @see uml.values.impl.ValuesPackageImpl#getTimeConstraint()
	 * @generated
	 */
	int TIME_CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__OWNED_COMMENT = INTERVAL_CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__OWNED_ELEMENT = INTERVAL_CONSTRAINT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__OWNER = INTERVAL_CONSTRAINT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__NAME = INTERVAL_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__NAME_EXPRESSION = INTERVAL_CONSTRAINT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__NAMESPACE = INTERVAL_CONSTRAINT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__QUALIFIED_NAME = INTERVAL_CONSTRAINT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__VISIBILITY = INTERVAL_CONSTRAINT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__CLIENT_DEPENDENCY = INTERVAL_CONSTRAINT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__OWNING_TEMPLATE_PARAMETER = INTERVAL_CONSTRAINT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__TEMPLATE_PARAMETER = INTERVAL_CONSTRAINT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__CONSTRAINED_ELEMENT = INTERVAL_CONSTRAINT__CONSTRAINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__SPECIFICATION = INTERVAL_CONSTRAINT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__CONTEXT = INTERVAL_CONSTRAINT__CONTEXT;

	/**
	 * The feature id for the '<em><b>First Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT__FIRST_EVENT = INTERVAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT_FEATURE_COUNT = INTERVAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___ALL_OWNED_ELEMENTS = INTERVAL_CONSTRAINT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___MUST_BE_OWNED = INTERVAL_CONSTRAINT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___ALL_NAMESPACES = INTERVAL_CONSTRAINT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___ALL_OWNING_PACKAGES = INTERVAL_CONSTRAINT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERVAL_CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___QUALIFIED_NAME = INTERVAL_CONSTRAINT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___SEPARATOR = INTERVAL_CONSTRAINT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___CLIENT_DEPENDENCY = INTERVAL_CONSTRAINT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = INTERVAL_CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT___IS_TEMPLATE_PARAMETER = INTERVAL_CONSTRAINT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Time Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONSTRAINT_OPERATION_COUNT = INTERVAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.TimeIntervalImpl
	 * @see uml.values.impl.ValuesPackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 18;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__OWNED_COMMENT = INTERVAL__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__OWNED_ELEMENT = INTERVAL__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__OWNER = INTERVAL__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__NAME = INTERVAL__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__NAME_EXPRESSION = INTERVAL__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__NAMESPACE = INTERVAL__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__QUALIFIED_NAME = INTERVAL__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__VISIBILITY = INTERVAL__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__CLIENT_DEPENDENCY = INTERVAL__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__OWNING_TEMPLATE_PARAMETER = INTERVAL__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__TEMPLATE_PARAMETER = INTERVAL__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__TYPE = INTERVAL__TYPE;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MAX = INTERVAL__MAX;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__MIN = INTERVAL__MIN;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___ALL_OWNED_ELEMENTS = INTERVAL___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___MUST_BE_OWNED = INTERVAL___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___ALL_NAMESPACES = INTERVAL___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___ALL_OWNING_PACKAGES = INTERVAL___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERVAL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___QUALIFIED_NAME = INTERVAL___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___SEPARATOR = INTERVAL___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___CLIENT_DEPENDENCY = INTERVAL___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = INTERVAL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___IS_TEMPLATE_PARAMETER = INTERVAL___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___BOOLEAN_VALUE = INTERVAL___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___INTEGER_VALUE = INTERVAL___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___IS_COMPUTABLE = INTERVAL___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___IS_NULL = INTERVAL___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___REAL_VALUE = INTERVAL___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___STRING_VALUE = INTERVAL___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___UNLIMITED_VALUE = INTERVAL___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_OPERATION_COUNT = INTERVAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.TimeExpressionImpl
	 * @see uml.values.impl.ValuesPackageImpl#getTimeExpression()
	 * @generated
	 */
	int TIME_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__OWNED_COMMENT = VALUE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__OWNED_ELEMENT = VALUE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__OWNER = VALUE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__NAME = VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__NAME_EXPRESSION = VALUE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__NAMESPACE = VALUE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__QUALIFIED_NAME = VALUE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__VISIBILITY = VALUE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__CLIENT_DEPENDENCY = VALUE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__OWNING_TEMPLATE_PARAMETER = VALUE_SPECIFICATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__TEMPLATE_PARAMETER = VALUE_SPECIFICATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__TYPE = VALUE_SPECIFICATION__TYPE;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__EXPR = VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__OBSERVATION = VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION_FEATURE_COUNT = VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___ALL_OWNED_ELEMENTS = VALUE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___MUST_BE_OWNED = VALUE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___ALL_NAMESPACES = VALUE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___ALL_OWNING_PACKAGES = VALUE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VALUE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___QUALIFIED_NAME = VALUE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___SEPARATOR = VALUE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___CLIENT_DEPENDENCY = VALUE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = VALUE_SPECIFICATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___IS_TEMPLATE_PARAMETER = VALUE_SPECIFICATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___BOOLEAN_VALUE = VALUE_SPECIFICATION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___INTEGER_VALUE = VALUE_SPECIFICATION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___IS_COMPUTABLE = VALUE_SPECIFICATION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___IS_NULL = VALUE_SPECIFICATION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___REAL_VALUE = VALUE_SPECIFICATION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___STRING_VALUE = VALUE_SPECIFICATION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION___UNLIMITED_VALUE = VALUE_SPECIFICATION___UNLIMITED_VALUE;

	/**
	 * The number of operations of the '<em>Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION_OPERATION_COUNT = VALUE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.TimeObservationImpl <em>Time Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.TimeObservationImpl
	 * @see uml.values.impl.ValuesPackageImpl#getTimeObservation()
	 * @generated
	 */
	int TIME_OBSERVATION = 20;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__OWNED_COMMENT = OBSERVATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__OWNED_ELEMENT = OBSERVATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__OWNER = OBSERVATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__NAME = OBSERVATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__NAME_EXPRESSION = OBSERVATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__NAMESPACE = OBSERVATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__QUALIFIED_NAME = OBSERVATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__VISIBILITY = OBSERVATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__CLIENT_DEPENDENCY = OBSERVATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__OWNING_TEMPLATE_PARAMETER = OBSERVATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__TEMPLATE_PARAMETER = OBSERVATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__EVENT = OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION__FIRST_EVENT = OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_FEATURE_COUNT = OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___ALL_OWNED_ELEMENTS = OBSERVATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___MUST_BE_OWNED = OBSERVATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___ALL_NAMESPACES = OBSERVATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___ALL_OWNING_PACKAGES = OBSERVATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = OBSERVATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___QUALIFIED_NAME = OBSERVATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___SEPARATOR = OBSERVATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___CLIENT_DEPENDENCY = OBSERVATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = OBSERVATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION___IS_TEMPLATE_PARAMETER = OBSERVATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Time Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OBSERVATION_OPERATION_COUNT = OBSERVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.values.impl.StringExpressionImpl <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.values.impl.StringExpressionImpl
	 * @see uml.values.impl.ValuesPackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__OWNED_COMMENT = EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__OWNED_ELEMENT = EXPRESSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__OWNER = EXPRESSION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__NAME_EXPRESSION = EXPRESSION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__NAMESPACE = EXPRESSION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__QUALIFIED_NAME = EXPRESSION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__VISIBILITY = EXPRESSION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__CLIENT_DEPENDENCY = EXPRESSION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__OWNING_TEMPLATE_PARAMETER = EXPRESSION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__TEMPLATE_PARAMETER = EXPRESSION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__TYPE = EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__OPERAND = EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__SYMBOL = EXPRESSION__SYMBOL;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__TEMPLATE_BINDING = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__OWNING_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__SUB_EXPRESSION = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___ALL_OWNED_ELEMENTS = EXPRESSION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___MUST_BE_OWNED = EXPRESSION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___ALL_NAMESPACES = EXPRESSION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___ALL_OWNING_PACKAGES = EXPRESSION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = EXPRESSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___QUALIFIED_NAME = EXPRESSION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___SEPARATOR = EXPRESSION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___CLIENT_DEPENDENCY = EXPRESSION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = EXPRESSION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___IS_TEMPLATE_PARAMETER = EXPRESSION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Boolean Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___BOOLEAN_VALUE = EXPRESSION___BOOLEAN_VALUE;

	/**
	 * The operation id for the '<em>Integer Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___INTEGER_VALUE = EXPRESSION___INTEGER_VALUE;

	/**
	 * The operation id for the '<em>Is Computable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___IS_COMPUTABLE = EXPRESSION___IS_COMPUTABLE;

	/**
	 * The operation id for the '<em>Is Null</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___IS_NULL = EXPRESSION___IS_NULL;

	/**
	 * The operation id for the '<em>Real Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___REAL_VALUE = EXPRESSION___REAL_VALUE;

	/**
	 * The operation id for the '<em>String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___STRING_VALUE = EXPRESSION___STRING_VALUE;

	/**
	 * The operation id for the '<em>Unlimited Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___UNLIMITED_VALUE = EXPRESSION___UNLIMITED_VALUE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___IS_TEMPLATE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION___PARAMETERABLE_ELEMENTS = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link uml.values.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see uml.values.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the containment reference '{@link uml.values.Duration#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see uml.values.Duration#getExpr()
	 * @see #getDuration()
	 * @generated
	 */
	EReference getDuration_Expr();

	/**
	 * Returns the meta object for the reference list '{@link uml.values.Duration#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Observation</em>'.
	 * @see uml.values.Duration#getObservation()
	 * @see #getDuration()
	 * @generated
	 */
	EReference getDuration_Observation();

	/**
	 * Returns the meta object for class '{@link uml.values.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see uml.values.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for the '{@link uml.values.ValueSpecification#booleanValue() <em>Boolean Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Boolean Value</em>' operation.
	 * @see uml.values.ValueSpecification#booleanValue()
	 * @generated
	 */
	EOperation getValueSpecification__BooleanValue();

	/**
	 * Returns the meta object for the '{@link uml.values.ValueSpecification#integerValue() <em>Integer Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Integer Value</em>' operation.
	 * @see uml.values.ValueSpecification#integerValue()
	 * @generated
	 */
	EOperation getValueSpecification__IntegerValue();

	/**
	 * Returns the meta object for the '{@link uml.values.ValueSpecification#isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Computable</em>' operation.
	 * @see uml.values.ValueSpecification#isComputable()
	 * @generated
	 */
	EOperation getValueSpecification__IsComputable();

	/**
	 * Returns the meta object for the '{@link uml.values.ValueSpecification#isNull() <em>Is Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Null</em>' operation.
	 * @see uml.values.ValueSpecification#isNull()
	 * @generated
	 */
	EOperation getValueSpecification__IsNull();

	/**
	 * Returns the meta object for the '{@link uml.values.ValueSpecification#realValue() <em>Real Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Real Value</em>' operation.
	 * @see uml.values.ValueSpecification#realValue()
	 * @generated
	 */
	EOperation getValueSpecification__RealValue();

	/**
	 * Returns the meta object for the '{@link uml.values.ValueSpecification#stringValue() <em>String Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>String Value</em>' operation.
	 * @see uml.values.ValueSpecification#stringValue()
	 * @generated
	 */
	EOperation getValueSpecification__StringValue();

	/**
	 * Returns the meta object for the '{@link uml.values.ValueSpecification#unlimitedValue() <em>Unlimited Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unlimited Value</em>' operation.
	 * @see uml.values.ValueSpecification#unlimitedValue()
	 * @generated
	 */
	EOperation getValueSpecification__UnlimitedValue();

	/**
	 * Returns the meta object for class '{@link uml.values.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see uml.values.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for class '{@link uml.values.DurationConstraint <em>Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Constraint</em>'.
	 * @see uml.values.DurationConstraint
	 * @generated
	 */
	EClass getDurationConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link uml.values.DurationConstraint#getFirstEvent <em>First Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>First Event</em>'.
	 * @see uml.values.DurationConstraint#getFirstEvent()
	 * @see #getDurationConstraint()
	 * @generated
	 */
	EAttribute getDurationConstraint_FirstEvent();

	/**
	 * Returns the meta object for class '{@link uml.values.IntervalConstraint <em>Interval Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Constraint</em>'.
	 * @see uml.values.IntervalConstraint
	 * @generated
	 */
	EClass getIntervalConstraint();

	/**
	 * Returns the meta object for class '{@link uml.values.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see uml.values.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the reference '{@link uml.values.Interval#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see uml.values.Interval#getMax()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Max();

	/**
	 * Returns the meta object for the reference '{@link uml.values.Interval#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see uml.values.Interval#getMin()
	 * @see #getInterval()
	 * @generated
	 */
	EReference getInterval_Min();

	/**
	 * Returns the meta object for class '{@link uml.values.DurationInterval <em>Duration Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Interval</em>'.
	 * @see uml.values.DurationInterval
	 * @generated
	 */
	EClass getDurationInterval();

	/**
	 * Returns the meta object for class '{@link uml.values.DurationObservation <em>Duration Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Observation</em>'.
	 * @see uml.values.DurationObservation
	 * @generated
	 */
	EClass getDurationObservation();

	/**
	 * Returns the meta object for the reference list '{@link uml.values.DurationObservation#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event</em>'.
	 * @see uml.values.DurationObservation#getEvent()
	 * @see #getDurationObservation()
	 * @generated
	 */
	EReference getDurationObservation_Event();

	/**
	 * Returns the meta object for the attribute list '{@link uml.values.DurationObservation#getFirstEvent <em>First Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>First Event</em>'.
	 * @see uml.values.DurationObservation#getFirstEvent()
	 * @see #getDurationObservation()
	 * @generated
	 */
	EAttribute getDurationObservation_FirstEvent();

	/**
	 * Returns the meta object for class '{@link uml.values.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see uml.values.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.values.Expression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see uml.values.Expression#getOperand()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link uml.values.Expression#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see uml.values.Expression#getSymbol()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Symbol();

	/**
	 * Returns the meta object for class '{@link uml.values.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Boolean</em>'.
	 * @see uml.values.LiteralBoolean
	 * @generated
	 */
	EClass getLiteralBoolean();

	/**
	 * Returns the meta object for the attribute '{@link uml.values.LiteralBoolean#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml.values.LiteralBoolean#isValue()
	 * @see #getLiteralBoolean()
	 * @generated
	 */
	EAttribute getLiteralBoolean_Value();

	/**
	 * Returns the meta object for class '{@link uml.values.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Specification</em>'.
	 * @see uml.values.LiteralSpecification
	 * @generated
	 */
	EClass getLiteralSpecification();

	/**
	 * Returns the meta object for class '{@link uml.values.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see uml.values.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for the attribute '{@link uml.values.LiteralInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml.values.LiteralInteger#getValue()
	 * @see #getLiteralInteger()
	 * @generated
	 */
	EAttribute getLiteralInteger_Value();

	/**
	 * Returns the meta object for class '{@link uml.values.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Null</em>'.
	 * @see uml.values.LiteralNull
	 * @generated
	 */
	EClass getLiteralNull();

	/**
	 * Returns the meta object for class '{@link uml.values.LiteralReal <em>Literal Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Real</em>'.
	 * @see uml.values.LiteralReal
	 * @generated
	 */
	EClass getLiteralReal();

	/**
	 * Returns the meta object for the attribute '{@link uml.values.LiteralReal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml.values.LiteralReal#getValue()
	 * @see #getLiteralReal()
	 * @generated
	 */
	EAttribute getLiteralReal_Value();

	/**
	 * Returns the meta object for class '{@link uml.values.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal String</em>'.
	 * @see uml.values.LiteralString
	 * @generated
	 */
	EClass getLiteralString();

	/**
	 * Returns the meta object for the attribute '{@link uml.values.LiteralString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml.values.LiteralString#getValue()
	 * @see #getLiteralString()
	 * @generated
	 */
	EAttribute getLiteralString_Value();

	/**
	 * Returns the meta object for class '{@link uml.values.LiteralUnlimitedNatural <em>Literal Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Unlimited Natural</em>'.
	 * @see uml.values.LiteralUnlimitedNatural
	 * @generated
	 */
	EClass getLiteralUnlimitedNatural();

	/**
	 * Returns the meta object for the attribute '{@link uml.values.LiteralUnlimitedNatural#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uml.values.LiteralUnlimitedNatural#getValue()
	 * @see #getLiteralUnlimitedNatural()
	 * @generated
	 */
	EAttribute getLiteralUnlimitedNatural_Value();

	/**
	 * Returns the meta object for class '{@link uml.values.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Expression</em>'.
	 * @see uml.values.OpaqueExpression
	 * @generated
	 */
	EClass getOpaqueExpression();

	/**
	 * Returns the meta object for the reference '{@link uml.values.OpaqueExpression#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see uml.values.OpaqueExpression#getBehavior()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EReference getOpaqueExpression_Behavior();

	/**
	 * Returns the meta object for the attribute list '{@link uml.values.OpaqueExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Body</em>'.
	 * @see uml.values.OpaqueExpression#getBody()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EAttribute getOpaqueExpression_Body();

	/**
	 * Returns the meta object for the attribute list '{@link uml.values.OpaqueExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language</em>'.
	 * @see uml.values.OpaqueExpression#getLanguage()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EAttribute getOpaqueExpression_Language();

	/**
	 * Returns the meta object for the reference '{@link uml.values.OpaqueExpression#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see uml.values.OpaqueExpression#getResult()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EReference getOpaqueExpression_Result();

	/**
	 * Returns the meta object for the '{@link uml.values.OpaqueExpression#isIntegral() <em>Is Integral</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Integral</em>' operation.
	 * @see uml.values.OpaqueExpression#isIntegral()
	 * @generated
	 */
	EOperation getOpaqueExpression__IsIntegral();

	/**
	 * Returns the meta object for the '{@link uml.values.OpaqueExpression#isNonNegative() <em>Is Non Negative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Non Negative</em>' operation.
	 * @see uml.values.OpaqueExpression#isNonNegative()
	 * @generated
	 */
	EOperation getOpaqueExpression__IsNonNegative();

	/**
	 * Returns the meta object for the '{@link uml.values.OpaqueExpression#isPositive() <em>Is Positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Positive</em>' operation.
	 * @see uml.values.OpaqueExpression#isPositive()
	 * @generated
	 */
	EOperation getOpaqueExpression__IsPositive();

	/**
	 * Returns the meta object for the '{@link uml.values.OpaqueExpression#result() <em>Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Result</em>' operation.
	 * @see uml.values.OpaqueExpression#result()
	 * @generated
	 */
	EOperation getOpaqueExpression__Result();

	/**
	 * Returns the meta object for the '{@link uml.values.OpaqueExpression#value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see uml.values.OpaqueExpression#value()
	 * @generated
	 */
	EOperation getOpaqueExpression__Value();

	/**
	 * Returns the meta object for class '{@link uml.values.TimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Constraint</em>'.
	 * @see uml.values.TimeConstraint
	 * @generated
	 */
	EClass getTimeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link uml.values.TimeConstraint#isFirstEvent <em>First Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Event</em>'.
	 * @see uml.values.TimeConstraint#isFirstEvent()
	 * @see #getTimeConstraint()
	 * @generated
	 */
	EAttribute getTimeConstraint_FirstEvent();

	/**
	 * Returns the meta object for class '{@link uml.values.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see uml.values.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for class '{@link uml.values.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Expression</em>'.
	 * @see uml.values.TimeExpression
	 * @generated
	 */
	EClass getTimeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link uml.values.TimeExpression#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see uml.values.TimeExpression#getExpr()
	 * @see #getTimeExpression()
	 * @generated
	 */
	EReference getTimeExpression_Expr();

	/**
	 * Returns the meta object for the reference list '{@link uml.values.TimeExpression#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Observation</em>'.
	 * @see uml.values.TimeExpression#getObservation()
	 * @see #getTimeExpression()
	 * @generated
	 */
	EReference getTimeExpression_Observation();

	/**
	 * Returns the meta object for class '{@link uml.values.TimeObservation <em>Time Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Observation</em>'.
	 * @see uml.values.TimeObservation
	 * @generated
	 */
	EClass getTimeObservation();

	/**
	 * Returns the meta object for the reference '{@link uml.values.TimeObservation#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see uml.values.TimeObservation#getEvent()
	 * @see #getTimeObservation()
	 * @generated
	 */
	EReference getTimeObservation_Event();

	/**
	 * Returns the meta object for the attribute '{@link uml.values.TimeObservation#isFirstEvent <em>First Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Event</em>'.
	 * @see uml.values.TimeObservation#isFirstEvent()
	 * @see #getTimeObservation()
	 * @generated
	 */
	EAttribute getTimeObservation_FirstEvent();

	/**
	 * Returns the meta object for class '{@link uml.values.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see uml.values.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for the container reference '{@link uml.values.StringExpression#getOwningExpression <em>Owning Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Expression</em>'.
	 * @see uml.values.StringExpression#getOwningExpression()
	 * @see #getStringExpression()
	 * @generated
	 */
	EReference getStringExpression_OwningExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.values.StringExpression#getSubExpression <em>Sub Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Expression</em>'.
	 * @see uml.values.StringExpression#getSubExpression()
	 * @see #getStringExpression()
	 * @generated
	 */
	EReference getStringExpression_SubExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValuesFactory getValuesFactory();

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
		 * The meta object literal for the '{@link uml.values.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.DurationImpl
		 * @see uml.values.impl.ValuesPackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURATION__EXPR = eINSTANCE.getDuration_Expr();

		/**
		 * The meta object literal for the '<em><b>Observation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURATION__OBSERVATION = eINSTANCE.getDuration_Observation();

		/**
		 * The meta object literal for the '{@link uml.values.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.ValueSpecificationImpl
		 * @see uml.values.impl.ValuesPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___BOOLEAN_VALUE = eINSTANCE.getValueSpecification__BooleanValue();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___INTEGER_VALUE = eINSTANCE.getValueSpecification__IntegerValue();

		/**
		 * The meta object literal for the '<em><b>Is Computable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___IS_COMPUTABLE = eINSTANCE.getValueSpecification__IsComputable();

		/**
		 * The meta object literal for the '<em><b>Is Null</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___IS_NULL = eINSTANCE.getValueSpecification__IsNull();

		/**
		 * The meta object literal for the '<em><b>Real Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___REAL_VALUE = eINSTANCE.getValueSpecification__RealValue();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___STRING_VALUE = eINSTANCE.getValueSpecification__StringValue();

		/**
		 * The meta object literal for the '<em><b>Unlimited Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SPECIFICATION___UNLIMITED_VALUE = eINSTANCE.getValueSpecification__UnlimitedValue();

		/**
		 * The meta object literal for the '{@link uml.values.impl.ObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.ObservationImpl
		 * @see uml.values.impl.ValuesPackageImpl#getObservation()
		 * @generated
		 */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
		 * The meta object literal for the '{@link uml.values.impl.DurationConstraintImpl <em>Duration Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.DurationConstraintImpl
		 * @see uml.values.impl.ValuesPackageImpl#getDurationConstraint()
		 * @generated
		 */
		EClass DURATION_CONSTRAINT = eINSTANCE.getDurationConstraint();

		/**
		 * The meta object literal for the '<em><b>First Event</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_CONSTRAINT__FIRST_EVENT = eINSTANCE.getDurationConstraint_FirstEvent();

		/**
		 * The meta object literal for the '{@link uml.values.impl.IntervalConstraintImpl <em>Interval Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.IntervalConstraintImpl
		 * @see uml.values.impl.ValuesPackageImpl#getIntervalConstraint()
		 * @generated
		 */
		EClass INTERVAL_CONSTRAINT = eINSTANCE.getIntervalConstraint();

		/**
		 * The meta object literal for the '{@link uml.values.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.IntervalImpl
		 * @see uml.values.impl.ValuesPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__MAX = eINSTANCE.getInterval_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVAL__MIN = eINSTANCE.getInterval_Min();

		/**
		 * The meta object literal for the '{@link uml.values.impl.DurationIntervalImpl <em>Duration Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.DurationIntervalImpl
		 * @see uml.values.impl.ValuesPackageImpl#getDurationInterval()
		 * @generated
		 */
		EClass DURATION_INTERVAL = eINSTANCE.getDurationInterval();

		/**
		 * The meta object literal for the '{@link uml.values.impl.DurationObservationImpl <em>Duration Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.DurationObservationImpl
		 * @see uml.values.impl.ValuesPackageImpl#getDurationObservation()
		 * @generated
		 */
		EClass DURATION_OBSERVATION = eINSTANCE.getDurationObservation();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURATION_OBSERVATION__EVENT = eINSTANCE.getDurationObservation_Event();

		/**
		 * The meta object literal for the '<em><b>First Event</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_OBSERVATION__FIRST_EVENT = eINSTANCE.getDurationObservation_FirstEvent();

		/**
		 * The meta object literal for the '{@link uml.values.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.ExpressionImpl
		 * @see uml.values.impl.ValuesPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__OPERAND = eINSTANCE.getExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__SYMBOL = eINSTANCE.getExpression_Symbol();

		/**
		 * The meta object literal for the '{@link uml.values.impl.LiteralBooleanImpl <em>Literal Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.LiteralBooleanImpl
		 * @see uml.values.impl.ValuesPackageImpl#getLiteralBoolean()
		 * @generated
		 */
		EClass LITERAL_BOOLEAN = eINSTANCE.getLiteralBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_BOOLEAN__VALUE = eINSTANCE.getLiteralBoolean_Value();

		/**
		 * The meta object literal for the '{@link uml.values.impl.LiteralSpecificationImpl <em>Literal Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.LiteralSpecificationImpl
		 * @see uml.values.impl.ValuesPackageImpl#getLiteralSpecification()
		 * @generated
		 */
		EClass LITERAL_SPECIFICATION = eINSTANCE.getLiteralSpecification();

		/**
		 * The meta object literal for the '{@link uml.values.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.LiteralIntegerImpl
		 * @see uml.values.impl.ValuesPackageImpl#getLiteralInteger()
		 * @generated
		 */
		EClass LITERAL_INTEGER = eINSTANCE.getLiteralInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_INTEGER__VALUE = eINSTANCE.getLiteralInteger_Value();

		/**
		 * The meta object literal for the '{@link uml.values.impl.LiteralNullImpl <em>Literal Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.LiteralNullImpl
		 * @see uml.values.impl.ValuesPackageImpl#getLiteralNull()
		 * @generated
		 */
		EClass LITERAL_NULL = eINSTANCE.getLiteralNull();

		/**
		 * The meta object literal for the '{@link uml.values.impl.LiteralRealImpl <em>Literal Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.LiteralRealImpl
		 * @see uml.values.impl.ValuesPackageImpl#getLiteralReal()
		 * @generated
		 */
		EClass LITERAL_REAL = eINSTANCE.getLiteralReal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_REAL__VALUE = eINSTANCE.getLiteralReal_Value();

		/**
		 * The meta object literal for the '{@link uml.values.impl.LiteralStringImpl <em>Literal String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.LiteralStringImpl
		 * @see uml.values.impl.ValuesPackageImpl#getLiteralString()
		 * @generated
		 */
		EClass LITERAL_STRING = eINSTANCE.getLiteralString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_STRING__VALUE = eINSTANCE.getLiteralString_Value();

		/**
		 * The meta object literal for the '{@link uml.values.impl.LiteralUnlimitedNaturalImpl <em>Literal Unlimited Natural</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.LiteralUnlimitedNaturalImpl
		 * @see uml.values.impl.ValuesPackageImpl#getLiteralUnlimitedNatural()
		 * @generated
		 */
		EClass LITERAL_UNLIMITED_NATURAL = eINSTANCE.getLiteralUnlimitedNatural();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_UNLIMITED_NATURAL__VALUE = eINSTANCE.getLiteralUnlimitedNatural_Value();

		/**
		 * The meta object literal for the '{@link uml.values.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.OpaqueExpressionImpl
		 * @see uml.values.impl.ValuesPackageImpl#getOpaqueExpression()
		 * @generated
		 */
		EClass OPAQUE_EXPRESSION = eINSTANCE.getOpaqueExpression();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_EXPRESSION__BEHAVIOR = eINSTANCE.getOpaqueExpression_Behavior();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_EXPRESSION__BODY = eINSTANCE.getOpaqueExpression_Body();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_EXPRESSION__LANGUAGE = eINSTANCE.getOpaqueExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_EXPRESSION__RESULT = eINSTANCE.getOpaqueExpression_Result();

		/**
		 * The meta object literal for the '<em><b>Is Integral</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPAQUE_EXPRESSION___IS_INTEGRAL = eINSTANCE.getOpaqueExpression__IsIntegral();

		/**
		 * The meta object literal for the '<em><b>Is Non Negative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPAQUE_EXPRESSION___IS_NON_NEGATIVE = eINSTANCE.getOpaqueExpression__IsNonNegative();

		/**
		 * The meta object literal for the '<em><b>Is Positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPAQUE_EXPRESSION___IS_POSITIVE = eINSTANCE.getOpaqueExpression__IsPositive();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPAQUE_EXPRESSION___RESULT = eINSTANCE.getOpaqueExpression__Result();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPAQUE_EXPRESSION___VALUE = eINSTANCE.getOpaqueExpression__Value();

		/**
		 * The meta object literal for the '{@link uml.values.impl.TimeConstraintImpl <em>Time Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.TimeConstraintImpl
		 * @see uml.values.impl.ValuesPackageImpl#getTimeConstraint()
		 * @generated
		 */
		EClass TIME_CONSTRAINT = eINSTANCE.getTimeConstraint();

		/**
		 * The meta object literal for the '<em><b>First Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONSTRAINT__FIRST_EVENT = eINSTANCE.getTimeConstraint_FirstEvent();

		/**
		 * The meta object literal for the '{@link uml.values.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.TimeIntervalImpl
		 * @see uml.values.impl.ValuesPackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '{@link uml.values.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.TimeExpressionImpl
		 * @see uml.values.impl.ValuesPackageImpl#getTimeExpression()
		 * @generated
		 */
		EClass TIME_EXPRESSION = eINSTANCE.getTimeExpression();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EXPRESSION__EXPR = eINSTANCE.getTimeExpression_Expr();

		/**
		 * The meta object literal for the '<em><b>Observation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EXPRESSION__OBSERVATION = eINSTANCE.getTimeExpression_Observation();

		/**
		 * The meta object literal for the '{@link uml.values.impl.TimeObservationImpl <em>Time Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.TimeObservationImpl
		 * @see uml.values.impl.ValuesPackageImpl#getTimeObservation()
		 * @generated
		 */
		EClass TIME_OBSERVATION = eINSTANCE.getTimeObservation();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_OBSERVATION__EVENT = eINSTANCE.getTimeObservation_Event();

		/**
		 * The meta object literal for the '<em><b>First Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_OBSERVATION__FIRST_EVENT = eINSTANCE.getTimeObservation_FirstEvent();

		/**
		 * The meta object literal for the '{@link uml.values.impl.StringExpressionImpl <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.values.impl.StringExpressionImpl
		 * @see uml.values.impl.ValuesPackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '<em><b>Owning Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_EXPRESSION__OWNING_EXPRESSION = eINSTANCE.getStringExpression_OwningExpression();

		/**
		 * The meta object literal for the '<em><b>Sub Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_EXPRESSION__SUB_EXPRESSION = eINSTANCE.getStringExpression_SubExpression();

	}

} //ValuesPackage
