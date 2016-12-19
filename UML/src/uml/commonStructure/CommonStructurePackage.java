/**
 */
package uml.commonStructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see uml.commonStructure.CommonStructureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CommonStructure'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface CommonStructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commonStructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/commonStructure.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.commonStructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonStructurePackage eINSTANCE = uml.commonStructure.impl.CommonStructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.ElementImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ALL_OWNED_ELEMENTS = 0;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MUST_BE_OWNED = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.NamedElementImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME_EXPRESSION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAMESPACE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__QUALIFIED_NAME = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__VISIBILITY = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CLIENT_DEPENDENCY = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ALL_NAMESPACES = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ALL_OWNING_PACKAGES = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___QUALIFIED_NAME = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___SEPARATOR = ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___CLIENT_DEPENDENCY = ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.PackageableElementImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getPackageableElement()
	 * @generated
	 */
	int PACKAGEABLE_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__NAME_EXPRESSION = NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY = NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS = NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___MUST_BE_OWNED = NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___ALL_NAMESPACES = NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES = NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___QUALIFIED_NAME = NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___SEPARATOR = NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___CLIENT_DEPENDENCY = NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.DependencyImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__OWNED_COMMENT = PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__OWNED_ELEMENT = PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__OWNER = PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME_EXPRESSION = PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAMESPACE = PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__QUALIFIED_NAME = PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__VISIBILITY = PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CLIENT_DEPENDENCY = PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__OWNING_TEMPLATE_PARAMETER = PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TEMPLATE_PARAMETER = PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__RELATED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CLIENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SUPPLIER = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___ALL_OWNED_ELEMENTS = PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___MUST_BE_OWNED = PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___ALL_NAMESPACES = PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___ALL_OWNING_PACKAGES = PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___QUALIFIED_NAME = PACKAGEABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___SEPARATOR = PACKAGEABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___CLIENT_DEPENDENCY = PACKAGEABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY___IS_TEMPLATE_PARAMETER = PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.AbstractionImpl <em>Abstraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.AbstractionImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getAbstraction()
	 * @generated
	 */
	int ABSTRACTION = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__OWNED_COMMENT = DEPENDENCY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__OWNED_ELEMENT = DEPENDENCY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__OWNER = DEPENDENCY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__NAME = DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__NAME_EXPRESSION = DEPENDENCY__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__NAMESPACE = DEPENDENCY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__QUALIFIED_NAME = DEPENDENCY__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__VISIBILITY = DEPENDENCY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__CLIENT_DEPENDENCY = DEPENDENCY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__OWNING_TEMPLATE_PARAMETER = DEPENDENCY__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__TEMPLATE_PARAMETER = DEPENDENCY__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__RELATED_ELEMENT = DEPENDENCY__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__CLIENT = DEPENDENCY__CLIENT;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__SUPPLIER = DEPENDENCY__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION__MAPPING = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___ALL_OWNED_ELEMENTS = DEPENDENCY___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___MUST_BE_OWNED = DEPENDENCY___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___ALL_NAMESPACES = DEPENDENCY___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___ALL_OWNING_PACKAGES = DEPENDENCY___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = DEPENDENCY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___QUALIFIED_NAME = DEPENDENCY___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___SEPARATOR = DEPENDENCY___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___CLIENT_DEPENDENCY = DEPENDENCY___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = DEPENDENCY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION___IS_TEMPLATE_PARAMETER = DEPENDENCY___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.RelationshipImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATED_ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.DirectedRelationshipImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getDirectedRelationship()
	 * @generated
	 */
	int DIRECTED_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__OWNED_COMMENT = RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__SOURCE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TARGET = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS = RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP___MUST_BE_OWNED = RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.CommentImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ANNOTATED_ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.TypedElementImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME_EXPRESSION = NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__CLIENT_DEPENDENCY = NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___ALL_OWNED_ELEMENTS = NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___MUST_BE_OWNED = NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___ALL_NAMESPACES = NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___ALL_OWNING_PACKAGES = NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___QUALIFIED_NAME = NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___SEPARATOR = NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT___CLIENT_DEPENDENCY = NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.TypeImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_COMMENT = PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNED_ELEMENT = PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNER = PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME_EXPRESSION = PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAMESPACE = PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__QUALIFIED_NAME = PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__VISIBILITY = PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__CLIENT_DEPENDENCY = PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNING_TEMPLATE_PARAMETER = PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TEMPLATE_PARAMETER = PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PACKAGE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_OWNED_ELEMENTS = PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___MUST_BE_OWNED = PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_NAMESPACES = PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_OWNING_PACKAGES = PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___QUALIFIED_NAME = PACKAGEABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___SEPARATOR = PACKAGEABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___CLIENT_DEPENDENCY = PACKAGEABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___IS_TEMPLATE_PARAMETER = PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___CONFORMS_TO__TYPE = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.RealizationImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__OWNED_COMMENT = ABSTRACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__OWNED_ELEMENT = ABSTRACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__OWNER = ABSTRACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__NAME = ABSTRACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__NAME_EXPRESSION = ABSTRACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__NAMESPACE = ABSTRACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__QUALIFIED_NAME = ABSTRACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__VISIBILITY = ABSTRACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__CLIENT_DEPENDENCY = ABSTRACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__OWNING_TEMPLATE_PARAMETER = ABSTRACTION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__TEMPLATE_PARAMETER = ABSTRACTION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__RELATED_ELEMENT = ABSTRACTION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__SOURCE = ABSTRACTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__TARGET = ABSTRACTION__TARGET;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__CLIENT = ABSTRACTION__CLIENT;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__SUPPLIER = ABSTRACTION__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__MAPPING = ABSTRACTION__MAPPING;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = ABSTRACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___ALL_OWNED_ELEMENTS = ABSTRACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___MUST_BE_OWNED = ABSTRACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___ALL_NAMESPACES = ABSTRACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___ALL_OWNING_PACKAGES = ABSTRACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ABSTRACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___QUALIFIED_NAME = ABSTRACTION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___SEPARATOR = ABSTRACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___CLIENT_DEPENDENCY = ABSTRACTION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = ABSTRACTION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION___IS_TEMPLATE_PARAMETER = ABSTRACTION___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_OPERATION_COUNT = ABSTRACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.NamespaceImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME_EXPRESSION = NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__CLIENT_DEPENDENCY = NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ELEMENT_IMPORT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__IMPORTED_MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_RULE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PACKAGE_IMPORT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___ALL_OWNED_ELEMENTS = NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___MUST_BE_OWNED = NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___ALL_NAMESPACES = NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___ALL_OWNING_PACKAGES = NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___QUALIFIED_NAME = NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___SEPARATOR = NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___CLIENT_DEPENDENCY = NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___EXCLUDE_COLLISIONS__ELIST = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___IMPORT_MEMBERS__ELIST = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___IMPORTED_MEMBER = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.ElementImportImpl <em>Element Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.ElementImportImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getElementImport()
	 * @generated
	 */
	int ELEMENT_IMPORT = 11;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__OWNED_COMMENT = DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__OWNED_ELEMENT = DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__OWNER = DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__ALIAS = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__IMPORTED_ELEMENT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__VISIBILITY = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Importing Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT__IMPORTING_NAMESPACE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT___ALL_OWNED_ELEMENTS = DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT___MUST_BE_OWNED = DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT___GET_NAME = DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORT_OPERATION_COUNT = DIRECTED_RELATIONSHIP_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.ConstraintImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNED_COMMENT = PACKAGEABLE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNED_ELEMENT = PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNER = PACKAGEABLE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME_EXPRESSION = PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAMESPACE = PACKAGEABLE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__QUALIFIED_NAME = PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VISIBILITY = PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CLIENT_DEPENDENCY = PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNING_TEMPLATE_PARAMETER = PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TEMPLATE_PARAMETER = PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SPECIFICATION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTEXT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ALL_OWNED_ELEMENTS = PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___MUST_BE_OWNED = PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ALL_NAMESPACES = PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___ALL_OWNING_PACKAGES = PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___QUALIFIED_NAME = PACKAGEABLE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___SEPARATOR = PACKAGEABLE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___CLIENT_DEPENDENCY = PACKAGEABLE_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___IS_TEMPLATE_PARAMETER = PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.PackageImportImpl <em>Package Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.PackageImportImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getPackageImport()
	 * @generated
	 */
	int PACKAGE_IMPORT = 13;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__OWNED_COMMENT = DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__OWNED_ELEMENT = DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__OWNER = DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Imported Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__IMPORTED_PACKAGE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__VISIBILITY = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Importing Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__IMPORTING_NAMESPACE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT___ALL_OWNED_ELEMENTS = DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT___MUST_BE_OWNED = DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Package Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_OPERATION_COUNT = DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.MultiplicityElementImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__IS_ORDERED = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__IS_UNIQUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER_VALUE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER_VALUE = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___IS__INT_INT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___IS_MULTIVALUED = ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___LOWER = ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___LOWER_BOUND = ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___UPPER = ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT___UPPER_BOUND = ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.ParameterableElementImpl <em>Parameterable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.ParameterableElementImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getParameterableElement()
	 * @generated
	 */
	int PARAMETERABLE_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameterable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameterable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERABLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.TemplateParameterImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateParameter()
	 * @generated
	 */
	int TEMPLATE_PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__DEFAULT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OWNED_DEFAULT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametered Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__SIGNATURE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Template Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.TemplateSignatureImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateSignature()
	 * @generated
	 */
	int TEMPLATE_SIGNATURE = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__PARAMETER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__TEMPLATE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE__OWNED_PARAMETER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Template Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SIGNATURE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.TemplateableElementImpl <em>Templateable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.TemplateableElementImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateableElement()
	 * @generated
	 */
	int TEMPLATEABLE_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Templateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT___IS_TEMPLATE = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Templateable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATEABLE_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.TemplateBindingImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateBinding()
	 * @generated
	 */
	int TEMPLATE_BINDING = 19;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__OWNED_COMMENT = DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__OWNED_ELEMENT = DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__OWNER = DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__PARAMETER_SUBSTITUTION = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__SIGNATURE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bound Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__BOUND_ELEMENT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING___ALL_OWNED_ELEMENTS = DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING___MUST_BE_OWNED = DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Template Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING_OPERATION_COUNT = DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.TemplateParameterSubstitutionImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateParameterSubstitution()
	 * @generated
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION = 20;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Template Parameter Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Template Parameter Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.impl.UsageImpl <em>Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.impl.UsageImpl
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getUsage()
	 * @generated
	 */
	int USAGE = 21;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__OWNED_COMMENT = DEPENDENCY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__OWNED_ELEMENT = DEPENDENCY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__OWNER = DEPENDENCY__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__NAME = DEPENDENCY__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__NAME_EXPRESSION = DEPENDENCY__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__NAMESPACE = DEPENDENCY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__QUALIFIED_NAME = DEPENDENCY__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__VISIBILITY = DEPENDENCY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__CLIENT_DEPENDENCY = DEPENDENCY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__OWNING_TEMPLATE_PARAMETER = DEPENDENCY__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__TEMPLATE_PARAMETER = DEPENDENCY__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__RELATED_ELEMENT = DEPENDENCY__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__SOURCE = DEPENDENCY__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__TARGET = DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__CLIENT = DEPENDENCY__CLIENT;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__SUPPLIER = DEPENDENCY__SUPPLIER;

	/**
	 * The number of structural features of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___ALL_OWNED_ELEMENTS = DEPENDENCY___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___MUST_BE_OWNED = DEPENDENCY___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___ALL_NAMESPACES = DEPENDENCY___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___ALL_OWNING_PACKAGES = DEPENDENCY___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = DEPENDENCY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___QUALIFIED_NAME = DEPENDENCY___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___SEPARATOR = DEPENDENCY___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___CLIENT_DEPENDENCY = DEPENDENCY___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = DEPENDENCY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE___IS_TEMPLATE_PARAMETER = DEPENDENCY___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.commonStructure.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.commonStructure.VisibilityKind
	 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 23;


	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstraction</em>'.
	 * @see uml.commonStructure.Abstraction
	 * @generated
	 */
	EClass getAbstraction();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonStructure.Abstraction#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see uml.commonStructure.Abstraction#getMapping()
	 * @see #getAbstraction()
	 * @generated
	 */
	EReference getAbstraction_Mapping();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see uml.commonStructure.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.Dependency#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Client</em>'.
	 * @see uml.commonStructure.Dependency#getClient()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Client();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.Dependency#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supplier</em>'.
	 * @see uml.commonStructure.Dependency#getSupplier()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Supplier();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Relationship</em>'.
	 * @see uml.commonStructure.DirectedRelationship
	 * @generated
	 */
	EClass getDirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.DirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see uml.commonStructure.DirectedRelationship#getSource()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.DirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see uml.commonStructure.DirectedRelationship#getTarget()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Target();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see uml.commonStructure.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.Relationship#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Element</em>'.
	 * @see uml.commonStructure.Relationship#getRelatedElement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelatedElement();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see uml.commonStructure.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.commonStructure.Element#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Comment</em>'.
	 * @see uml.commonStructure.Element#getOwnedComment()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedComment();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Element</em>'.
	 * @see uml.commonStructure.Element#getOwnedElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see uml.commonStructure.Element#getOwner()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Owner();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.Element#allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Owned Elements</em>' operation.
	 * @see uml.commonStructure.Element#allOwnedElements()
	 * @generated
	 */
	EOperation getElement__AllOwnedElements();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.Element#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Be Owned</em>' operation.
	 * @see uml.commonStructure.Element#mustBeOwned()
	 * @generated
	 */
	EOperation getElement__MustBeOwned();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see uml.commonStructure.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.Comment#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated Element</em>'.
	 * @see uml.commonStructure.Comment#getAnnotatedElement()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_AnnotatedElement();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see uml.commonStructure.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see uml.commonStructure.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml.commonStructure.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonStructure.NamedElement#getNameExpression <em>Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Expression</em>'.
	 * @see uml.commonStructure.NamedElement#getNameExpression()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_NameExpression();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see uml.commonStructure.NamedElement#getNamespace()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.NamedElement#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see uml.commonStructure.NamedElement#getQualifiedName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.NamedElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see uml.commonStructure.NamedElement#getVisibility()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Visibility();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.NamedElement#getClientDependency <em>Client Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Client Dependency</em>'.
	 * @see uml.commonStructure.NamedElement#getClientDependency()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_ClientDependency();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.NamedElement#allNamespaces() <em>All Namespaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Namespaces</em>' operation.
	 * @see uml.commonStructure.NamedElement#allNamespaces()
	 * @generated
	 */
	EOperation getNamedElement__AllNamespaces();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.NamedElement#allOwningPackages() <em>All Owning Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Owning Packages</em>' operation.
	 * @see uml.commonStructure.NamedElement#allOwningPackages()
	 * @generated
	 */
	EOperation getNamedElement__AllOwningPackages();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.NamedElement#isDistinguishableFrom(uml.commonStructure.NamedElement, uml.commonStructure.Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Distinguishable From</em>' operation.
	 * @see uml.commonStructure.NamedElement#isDistinguishableFrom(uml.commonStructure.NamedElement, uml.commonStructure.Namespace)
	 * @generated
	 */
	EOperation getNamedElement__IsDistinguishableFrom__NamedElement_Namespace();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.NamedElement#qualifiedName() <em>Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Qualified Name</em>' operation.
	 * @see uml.commonStructure.NamedElement#qualifiedName()
	 * @generated
	 */
	EOperation getNamedElement__QualifiedName();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.NamedElement#separator() <em>Separator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Separator</em>' operation.
	 * @see uml.commonStructure.NamedElement#separator()
	 * @generated
	 */
	EOperation getNamedElement__Separator();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.NamedElement#clientDependency() <em>Client Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Client Dependency</em>' operation.
	 * @see uml.commonStructure.NamedElement#clientDependency()
	 * @generated
	 */
	EOperation getNamedElement__ClientDependency();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see uml.commonStructure.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see uml.commonStructure.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see uml.commonStructure.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.Type#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see uml.commonStructure.Type#getPackage()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Package();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.Type#conformsTo(uml.commonStructure.Type) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conforms To</em>' operation.
	 * @see uml.commonStructure.Type#conformsTo(uml.commonStructure.Type)
	 * @generated
	 */
	EOperation getType__ConformsTo__Type();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see uml.commonStructure.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see uml.commonStructure.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.commonStructure.Namespace#getElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Import</em>'.
	 * @see uml.commonStructure.Namespace#getElementImport()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_ElementImport();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.Namespace#getImportedMember <em>Imported Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Member</em>'.
	 * @see uml.commonStructure.Namespace#getImportedMember()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_ImportedMember();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.Namespace#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see uml.commonStructure.Namespace#getMember()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Member();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.Namespace#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Member</em>'.
	 * @see uml.commonStructure.Namespace#getOwnedMember()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_OwnedMember();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.commonStructure.Namespace#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rule</em>'.
	 * @see uml.commonStructure.Namespace#getOwnedRule()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_OwnedRule();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.commonStructure.Namespace#getPackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package Import</em>'.
	 * @see uml.commonStructure.Namespace#getPackageImport()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_PackageImport();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.Namespace#excludeCollisions(org.eclipse.emf.common.util.EList) <em>Exclude Collisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exclude Collisions</em>' operation.
	 * @see uml.commonStructure.Namespace#excludeCollisions(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNamespace__ExcludeCollisions__EList();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.Namespace#getNamesOfMember(uml.commonStructure.NamedElement) <em>Get Names Of Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Names Of Member</em>' operation.
	 * @see uml.commonStructure.Namespace#getNamesOfMember(uml.commonStructure.NamedElement)
	 * @generated
	 */
	EOperation getNamespace__GetNamesOfMember__NamedElement();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.Namespace#importMembers(org.eclipse.emf.common.util.EList) <em>Import Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Members</em>' operation.
	 * @see uml.commonStructure.Namespace#importMembers(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getNamespace__ImportMembers__EList();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.Namespace#importedMember() <em>Imported Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Imported Member</em>' operation.
	 * @see uml.commonStructure.Namespace#importedMember()
	 * @generated
	 */
	EOperation getNamespace__ImportedMember();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.Namespace#membersAreDistinguishable() <em>Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Members Are Distinguishable</em>' operation.
	 * @see uml.commonStructure.Namespace#membersAreDistinguishable()
	 * @generated
	 */
	EOperation getNamespace__MembersAreDistinguishable();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.ElementImport <em>Element Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Import</em>'.
	 * @see uml.commonStructure.ElementImport
	 * @generated
	 */
	EClass getElementImport();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.ElementImport#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see uml.commonStructure.ElementImport#getAlias()
	 * @see #getElementImport()
	 * @generated
	 */
	EAttribute getElementImport_Alias();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.ElementImport#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Element</em>'.
	 * @see uml.commonStructure.ElementImport#getImportedElement()
	 * @see #getElementImport()
	 * @generated
	 */
	EReference getElementImport_ImportedElement();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.ElementImport#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see uml.commonStructure.ElementImport#getVisibility()
	 * @see #getElementImport()
	 * @generated
	 */
	EAttribute getElementImport_Visibility();

	/**
	 * Returns the meta object for the container reference '{@link uml.commonStructure.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importing Namespace</em>'.
	 * @see uml.commonStructure.ElementImport#getImportingNamespace()
	 * @see #getElementImport()
	 * @generated
	 */
	EReference getElementImport_ImportingNamespace();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.ElementImport#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see uml.commonStructure.ElementImport#getName()
	 * @generated
	 */
	EOperation getElementImport__GetName();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see uml.commonStructure.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.Constraint#getConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Element</em>'.
	 * @see uml.commonStructure.Constraint#getConstrainedElement()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstrainedElement();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonStructure.Constraint#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see uml.commonStructure.Constraint#getSpecification()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Specification();

	/**
	 * Returns the meta object for the container reference '{@link uml.commonStructure.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see uml.commonStructure.Constraint#getContext()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Context();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.PackageImport <em>Package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Import</em>'.
	 * @see uml.commonStructure.PackageImport
	 * @generated
	 */
	EClass getPackageImport();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.PackageImport#getImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Package</em>'.
	 * @see uml.commonStructure.PackageImport#getImportedPackage()
	 * @see #getPackageImport()
	 * @generated
	 */
	EReference getPackageImport_ImportedPackage();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.PackageImport#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see uml.commonStructure.PackageImport#getVisibility()
	 * @see #getPackageImport()
	 * @generated
	 */
	EAttribute getPackageImport_Visibility();

	/**
	 * Returns the meta object for the container reference '{@link uml.commonStructure.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importing Namespace</em>'.
	 * @see uml.commonStructure.PackageImport#getImportingNamespace()
	 * @see #getPackageImport()
	 * @generated
	 */
	EReference getPackageImport_ImportingNamespace();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see uml.commonStructure.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see uml.commonStructure.MultiplicityElement#isIsOrdered()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.MultiplicityElement#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see uml.commonStructure.MultiplicityElement#isIsUnique()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.MultiplicityElement#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see uml.commonStructure.MultiplicityElement#getLower()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonStructure.MultiplicityElement#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Value</em>'.
	 * @see uml.commonStructure.MultiplicityElement#getLowerValue()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EReference getMultiplicityElement_LowerValue();

	/**
	 * Returns the meta object for the attribute '{@link uml.commonStructure.MultiplicityElement#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see uml.commonStructure.MultiplicityElement#getUpper()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Upper();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonStructure.MultiplicityElement#getUpperValue <em>Upper Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Value</em>'.
	 * @see uml.commonStructure.MultiplicityElement#getUpperValue()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EReference getMultiplicityElement_UpperValue();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.MultiplicityElement#compatibleWith(uml.commonStructure.MultiplicityElement) <em>Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compatible With</em>' operation.
	 * @see uml.commonStructure.MultiplicityElement#compatibleWith(uml.commonStructure.MultiplicityElement)
	 * @generated
	 */
	EOperation getMultiplicityElement__CompatibleWith__MultiplicityElement();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.MultiplicityElement#includesMultiplicity(uml.commonStructure.MultiplicityElement) <em>Includes Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Includes Multiplicity</em>' operation.
	 * @see uml.commonStructure.MultiplicityElement#includesMultiplicity(uml.commonStructure.MultiplicityElement)
	 * @generated
	 */
	EOperation getMultiplicityElement__IncludesMultiplicity__MultiplicityElement();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.MultiplicityElement#is(int, int) <em>Is</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is</em>' operation.
	 * @see uml.commonStructure.MultiplicityElement#is(int, int)
	 * @generated
	 */
	EOperation getMultiplicityElement__Is__int_int();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.MultiplicityElement#isMultivalued() <em>Is Multivalued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Multivalued</em>' operation.
	 * @see uml.commonStructure.MultiplicityElement#isMultivalued()
	 * @generated
	 */
	EOperation getMultiplicityElement__IsMultivalued();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.MultiplicityElement#lower() <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower</em>' operation.
	 * @see uml.commonStructure.MultiplicityElement#lower()
	 * @generated
	 */
	EOperation getMultiplicityElement__Lower();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.MultiplicityElement#lowerBound() <em>Lower Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower Bound</em>' operation.
	 * @see uml.commonStructure.MultiplicityElement#lowerBound()
	 * @generated
	 */
	EOperation getMultiplicityElement__LowerBound();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.MultiplicityElement#upper() <em>Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upper</em>' operation.
	 * @see uml.commonStructure.MultiplicityElement#upper()
	 * @generated
	 */
	EOperation getMultiplicityElement__Upper();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.MultiplicityElement#upperBound() <em>Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upper Bound</em>' operation.
	 * @see uml.commonStructure.MultiplicityElement#upperBound()
	 * @generated
	 */
	EOperation getMultiplicityElement__UpperBound();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.ParameterableElement <em>Parameterable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterable Element</em>'.
	 * @see uml.commonStructure.ParameterableElement
	 * @generated
	 */
	EClass getParameterableElement();

	/**
	 * Returns the meta object for the container reference '{@link uml.commonStructure.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Template Parameter</em>'.
	 * @see uml.commonStructure.ParameterableElement#getOwningTemplateParameter()
	 * @see #getParameterableElement()
	 * @generated
	 */
	EReference getParameterableElement_OwningTemplateParameter();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template Parameter</em>'.
	 * @see uml.commonStructure.ParameterableElement#getTemplateParameter()
	 * @see #getParameterableElement()
	 * @generated
	 */
	EReference getParameterableElement_TemplateParameter();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.ParameterableElement#isCompatibleWith(uml.commonStructure.ParameterableElement) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Compatible With</em>' operation.
	 * @see uml.commonStructure.ParameterableElement#isCompatibleWith(uml.commonStructure.ParameterableElement)
	 * @generated
	 */
	EOperation getParameterableElement__IsCompatibleWith__ParameterableElement();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.ParameterableElement#isTemplateParameter() <em>Is Template Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Template Parameter</em>' operation.
	 * @see uml.commonStructure.ParameterableElement#isTemplateParameter()
	 * @generated
	 */
	EOperation getParameterableElement__IsTemplateParameter();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.TemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter</em>'.
	 * @see uml.commonStructure.TemplateParameter
	 * @generated
	 */
	EClass getTemplateParameter();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.TemplateParameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see uml.commonStructure.TemplateParameter#getDefault()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EReference getTemplateParameter_Default();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonStructure.TemplateParameter#getOwnedDefault <em>Owned Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Default</em>'.
	 * @see uml.commonStructure.TemplateParameter#getOwnedDefault()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EReference getTemplateParameter_OwnedDefault();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parametered Element</em>'.
	 * @see uml.commonStructure.TemplateParameter#getParameteredElement()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EReference getTemplateParameter_ParameteredElement();

	/**
	 * Returns the meta object for the container reference '{@link uml.commonStructure.TemplateParameter#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Signature</em>'.
	 * @see uml.commonStructure.TemplateParameter#getSignature()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EReference getTemplateParameter_Signature();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonStructure.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Parametered Element</em>'.
	 * @see uml.commonStructure.TemplateParameter#getOwnedParameteredElement()
	 * @see #getTemplateParameter()
	 * @generated
	 */
	EReference getTemplateParameter_OwnedParameteredElement();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.TemplateSignature <em>Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Signature</em>'.
	 * @see uml.commonStructure.TemplateSignature
	 * @generated
	 */
	EClass getTemplateSignature();

	/**
	 * Returns the meta object for the reference list '{@link uml.commonStructure.TemplateSignature#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see uml.commonStructure.TemplateSignature#getParameter()
	 * @see #getTemplateSignature()
	 * @generated
	 */
	EReference getTemplateSignature_Parameter();

	/**
	 * Returns the meta object for the container reference '{@link uml.commonStructure.TemplateSignature#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template</em>'.
	 * @see uml.commonStructure.TemplateSignature#getTemplate()
	 * @see #getTemplateSignature()
	 * @generated
	 */
	EReference getTemplateSignature_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.commonStructure.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see uml.commonStructure.TemplateSignature#getOwnedParameter()
	 * @see #getTemplateSignature()
	 * @generated
	 */
	EReference getTemplateSignature_OwnedParameter();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.TemplateableElement <em>Templateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Templateable Element</em>'.
	 * @see uml.commonStructure.TemplateableElement
	 * @generated
	 */
	EClass getTemplateableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.commonStructure.TemplateableElement#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Binding</em>'.
	 * @see uml.commonStructure.TemplateableElement#getTemplateBinding()
	 * @see #getTemplateableElement()
	 * @generated
	 */
	EReference getTemplateableElement_TemplateBinding();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonStructure.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Template Signature</em>'.
	 * @see uml.commonStructure.TemplateableElement#getOwnedTemplateSignature()
	 * @see #getTemplateableElement()
	 * @generated
	 */
	EReference getTemplateableElement_OwnedTemplateSignature();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.TemplateableElement#isTemplate() <em>Is Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Template</em>' operation.
	 * @see uml.commonStructure.TemplateableElement#isTemplate()
	 * @generated
	 */
	EOperation getTemplateableElement__IsTemplate();

	/**
	 * Returns the meta object for the '{@link uml.commonStructure.TemplateableElement#parameterableElements() <em>Parameterable Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parameterable Elements</em>' operation.
	 * @see uml.commonStructure.TemplateableElement#parameterableElements()
	 * @generated
	 */
	EOperation getTemplateableElement__ParameterableElements();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.TemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Binding</em>'.
	 * @see uml.commonStructure.TemplateBinding
	 * @generated
	 */
	EClass getTemplateBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.commonStructure.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Substitution</em>'.
	 * @see uml.commonStructure.TemplateBinding#getParameterSubstitution()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_ParameterSubstitution();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.TemplateBinding#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see uml.commonStructure.TemplateBinding#getSignature()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_Signature();

	/**
	 * Returns the meta object for the container reference '{@link uml.commonStructure.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bound Element</em>'.
	 * @see uml.commonStructure.TemplateBinding#getBoundElement()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_BoundElement();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter Substitution</em>'.
	 * @see uml.commonStructure.TemplateParameterSubstitution
	 * @generated
	 */
	EClass getTemplateParameterSubstitution();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.TemplateParameterSubstitution#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual</em>'.
	 * @see uml.commonStructure.TemplateParameterSubstitution#getActual()
	 * @see #getTemplateParameterSubstitution()
	 * @generated
	 */
	EReference getTemplateParameterSubstitution_Actual();

	/**
	 * Returns the meta object for the reference '{@link uml.commonStructure.TemplateParameterSubstitution#getFormal <em>Formal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formal</em>'.
	 * @see uml.commonStructure.TemplateParameterSubstitution#getFormal()
	 * @see #getTemplateParameterSubstitution()
	 * @generated
	 */
	EReference getTemplateParameterSubstitution_Formal();

	/**
	 * Returns the meta object for the containment reference '{@link uml.commonStructure.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Actual</em>'.
	 * @see uml.commonStructure.TemplateParameterSubstitution#getOwnedActual()
	 * @see #getTemplateParameterSubstitution()
	 * @generated
	 */
	EReference getTemplateParameterSubstitution_OwnedActual();

	/**
	 * Returns the meta object for the container reference '{@link uml.commonStructure.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template Binding</em>'.
	 * @see uml.commonStructure.TemplateParameterSubstitution#getTemplateBinding()
	 * @see #getTemplateParameterSubstitution()
	 * @generated
	 */
	EReference getTemplateParameterSubstitution_TemplateBinding();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage</em>'.
	 * @see uml.commonStructure.Usage
	 * @generated
	 */
	EClass getUsage();

	/**
	 * Returns the meta object for class '{@link uml.commonStructure.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageable Element</em>'.
	 * @see uml.commonStructure.PackageableElement
	 * @generated
	 */
	EClass getPackageableElement();

	/**
	 * Returns the meta object for enum '{@link uml.commonStructure.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see uml.commonStructure.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonStructureFactory getCommonStructureFactory();

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
		 * The meta object literal for the '{@link uml.commonStructure.impl.AbstractionImpl <em>Abstraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.AbstractionImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getAbstraction()
		 * @generated
		 */
		EClass ABSTRACTION = eINSTANCE.getAbstraction();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACTION__MAPPING = eINSTANCE.getAbstraction_Mapping();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.DependencyImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__CLIENT = eINSTANCE.getDependency_Client();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__SUPPLIER = eINSTANCE.getDependency_Supplier();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.DirectedRelationshipImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getDirectedRelationship()
		 * @generated
		 */
		EClass DIRECTED_RELATIONSHIP = eINSTANCE.getDirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getDirectedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getDirectedRelationship_Target();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.RelationshipImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Related Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATED_ELEMENT = eINSTANCE.getRelationship_RelatedElement();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.ElementImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNED_COMMENT = eINSTANCE.getElement_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNED_ELEMENT = eINSTANCE.getElement_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNER = eINSTANCE.getElement_Owner();

		/**
		 * The meta object literal for the '<em><b>All Owned Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ALL_OWNED_ELEMENTS = eINSTANCE.getElement__AllOwnedElements();

		/**
		 * The meta object literal for the '<em><b>Must Be Owned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MUST_BE_OWNED = eINSTANCE.getElement__MustBeOwned();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.CommentImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Annotated Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__ANNOTATED_ELEMENT = eINSTANCE.getComment_AnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.NamedElementImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Name Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__NAME_EXPRESSION = eINSTANCE.getNamedElement_NameExpression();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__NAMESPACE = eINSTANCE.getNamedElement_Namespace();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__QUALIFIED_NAME = eINSTANCE.getNamedElement_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__VISIBILITY = eINSTANCE.getNamedElement_Visibility();

		/**
		 * The meta object literal for the '<em><b>Client Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__CLIENT_DEPENDENCY = eINSTANCE.getNamedElement_ClientDependency();

		/**
		 * The meta object literal for the '<em><b>All Namespaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_ELEMENT___ALL_NAMESPACES = eINSTANCE.getNamedElement__AllNamespaces();

		/**
		 * The meta object literal for the '<em><b>All Owning Packages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_ELEMENT___ALL_OWNING_PACKAGES = eINSTANCE.getNamedElement__AllOwningPackages();

		/**
		 * The meta object literal for the '<em><b>Is Distinguishable From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = eINSTANCE.getNamedElement__IsDistinguishableFrom__NamedElement_Namespace();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_ELEMENT___QUALIFIED_NAME = eINSTANCE.getNamedElement__QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_ELEMENT___SEPARATOR = eINSTANCE.getNamedElement__Separator();

		/**
		 * The meta object literal for the '<em><b>Client Dependency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED_ELEMENT___CLIENT_DEPENDENCY = eINSTANCE.getNamedElement__ClientDependency();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.TypedElementImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.TypeImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PACKAGE = eINSTANCE.getType_Package();

		/**
		 * The meta object literal for the '<em><b>Conforms To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___CONFORMS_TO__TYPE = eINSTANCE.getType__ConformsTo__Type();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.RealizationImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.NamespaceImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Element Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__ELEMENT_IMPORT = eINSTANCE.getNamespace_ElementImport();

		/**
		 * The meta object literal for the '<em><b>Imported Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__IMPORTED_MEMBER = eINSTANCE.getNamespace_ImportedMember();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__MEMBER = eINSTANCE.getNamespace_Member();

		/**
		 * The meta object literal for the '<em><b>Owned Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__OWNED_MEMBER = eINSTANCE.getNamespace_OwnedMember();

		/**
		 * The meta object literal for the '<em><b>Owned Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__OWNED_RULE = eINSTANCE.getNamespace_OwnedRule();

		/**
		 * The meta object literal for the '<em><b>Package Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__PACKAGE_IMPORT = eINSTANCE.getNamespace_PackageImport();

		/**
		 * The meta object literal for the '<em><b>Exclude Collisions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMESPACE___EXCLUDE_COLLISIONS__ELIST = eINSTANCE.getNamespace__ExcludeCollisions__EList();

		/**
		 * The meta object literal for the '<em><b>Get Names Of Member</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = eINSTANCE.getNamespace__GetNamesOfMember__NamedElement();

		/**
		 * The meta object literal for the '<em><b>Import Members</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMESPACE___IMPORT_MEMBERS__ELIST = eINSTANCE.getNamespace__ImportMembers__EList();

		/**
		 * The meta object literal for the '<em><b>Imported Member</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMESPACE___IMPORTED_MEMBER = eINSTANCE.getNamespace__ImportedMember();

		/**
		 * The meta object literal for the '<em><b>Members Are Distinguishable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE = eINSTANCE.getNamespace__MembersAreDistinguishable();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.ElementImportImpl <em>Element Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.ElementImportImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getElementImport()
		 * @generated
		 */
		EClass ELEMENT_IMPORT = eINSTANCE.getElementImport();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IMPORT__ALIAS = eINSTANCE.getElementImport_Alias();

		/**
		 * The meta object literal for the '<em><b>Imported Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_IMPORT__IMPORTED_ELEMENT = eINSTANCE.getElementImport_ImportedElement();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_IMPORT__VISIBILITY = eINSTANCE.getElementImport_Visibility();

		/**
		 * The meta object literal for the '<em><b>Importing Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getElementImport_ImportingNamespace();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_IMPORT___GET_NAME = eINSTANCE.getElementImport__GetName();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.ConstraintImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINED_ELEMENT = eINSTANCE.getConstraint_ConstrainedElement();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__SPECIFICATION = eINSTANCE.getConstraint_Specification();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONTEXT = eINSTANCE.getConstraint_Context();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.PackageImportImpl <em>Package Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.PackageImportImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getPackageImport()
		 * @generated
		 */
		EClass PACKAGE_IMPORT = eINSTANCE.getPackageImport();

		/**
		 * The meta object literal for the '<em><b>Imported Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_IMPORT__IMPORTED_PACKAGE = eINSTANCE.getPackageImport_ImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_IMPORT__VISIBILITY = eINSTANCE.getPackageImport_Visibility();

		/**
		 * The meta object literal for the '<em><b>Importing Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getPackageImport_ImportingNamespace();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.MultiplicityElementImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__IS_ORDERED = eINSTANCE.getMultiplicityElement_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__IS_UNIQUE = eINSTANCE.getMultiplicityElement_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__LOWER = eINSTANCE.getMultiplicityElement_Lower();

		/**
		 * The meta object literal for the '<em><b>Lower Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_ELEMENT__LOWER_VALUE = eINSTANCE.getMultiplicityElement_LowerValue();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__UPPER = eINSTANCE.getMultiplicityElement_Upper();

		/**
		 * The meta object literal for the '<em><b>Upper Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_ELEMENT__UPPER_VALUE = eINSTANCE.getMultiplicityElement_UpperValue();

		/**
		 * The meta object literal for the '<em><b>Compatible With</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT = eINSTANCE.getMultiplicityElement__CompatibleWith__MultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Includes Multiplicity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = eINSTANCE.getMultiplicityElement__IncludesMultiplicity__MultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICITY_ELEMENT___IS__INT_INT = eINSTANCE.getMultiplicityElement__Is__int_int();

		/**
		 * The meta object literal for the '<em><b>Is Multivalued</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICITY_ELEMENT___IS_MULTIVALUED = eINSTANCE.getMultiplicityElement__IsMultivalued();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICITY_ELEMENT___LOWER = eINSTANCE.getMultiplicityElement__Lower();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICITY_ELEMENT___LOWER_BOUND = eINSTANCE.getMultiplicityElement__LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICITY_ELEMENT___UPPER = eINSTANCE.getMultiplicityElement__Upper();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIPLICITY_ELEMENT___UPPER_BOUND = eINSTANCE.getMultiplicityElement__UpperBound();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.ParameterableElementImpl <em>Parameterable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.ParameterableElementImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getParameterableElement()
		 * @generated
		 */
		EClass PARAMETERABLE_ELEMENT = eINSTANCE.getParameterableElement();

		/**
		 * The meta object literal for the '<em><b>Owning Template Parameter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER = eINSTANCE.getParameterableElement_OwningTemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Template Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER = eINSTANCE.getParameterableElement_TemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Is Compatible With</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = eINSTANCE.getParameterableElement__IsCompatibleWith__ParameterableElement();

		/**
		 * The meta object literal for the '<em><b>Is Template Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER = eINSTANCE.getParameterableElement__IsTemplateParameter();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.TemplateParameterImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateParameter()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER = eINSTANCE.getTemplateParameter();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER__DEFAULT = eINSTANCE.getTemplateParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Owned Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER__OWNED_DEFAULT = eINSTANCE.getTemplateParameter_OwnedDefault();

		/**
		 * The meta object literal for the '<em><b>Parametered Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = eINSTANCE.getTemplateParameter_ParameteredElement();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER__SIGNATURE = eINSTANCE.getTemplateParameter_Signature();

		/**
		 * The meta object literal for the '<em><b>Owned Parametered Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT = eINSTANCE.getTemplateParameter_OwnedParameteredElement();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.TemplateSignatureImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateSignature()
		 * @generated
		 */
		EClass TEMPLATE_SIGNATURE = eINSTANCE.getTemplateSignature();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SIGNATURE__PARAMETER = eINSTANCE.getTemplateSignature_Parameter();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SIGNATURE__TEMPLATE = eINSTANCE.getTemplateSignature_Template();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SIGNATURE__OWNED_PARAMETER = eINSTANCE.getTemplateSignature_OwnedParameter();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.TemplateableElementImpl <em>Templateable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.TemplateableElementImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateableElement()
		 * @generated
		 */
		EClass TEMPLATEABLE_ELEMENT = eINSTANCE.getTemplateableElement();

		/**
		 * The meta object literal for the '<em><b>Template Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING = eINSTANCE.getTemplateableElement_TemplateBinding();

		/**
		 * The meta object literal for the '<em><b>Owned Template Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE = eINSTANCE.getTemplateableElement_OwnedTemplateSignature();

		/**
		 * The meta object literal for the '<em><b>Is Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATEABLE_ELEMENT___IS_TEMPLATE = eINSTANCE.getTemplateableElement__IsTemplate();

		/**
		 * The meta object literal for the '<em><b>Parameterable Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS = eINSTANCE.getTemplateableElement__ParameterableElements();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.TemplateBindingImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateBinding()
		 * @generated
		 */
		EClass TEMPLATE_BINDING = eINSTANCE.getTemplateBinding();

		/**
		 * The meta object literal for the '<em><b>Parameter Substitution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateBinding_ParameterSubstitution();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__SIGNATURE = eINSTANCE.getTemplateBinding_Signature();

		/**
		 * The meta object literal for the '<em><b>Bound Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__BOUND_ELEMENT = eINSTANCE.getTemplateBinding_BoundElement();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.TemplateParameterSubstitutionImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getTemplateParameterSubstitution()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateParameterSubstitution();

		/**
		 * The meta object literal for the '<em><b>Actual</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL = eINSTANCE.getTemplateParameterSubstitution_Actual();

		/**
		 * The meta object literal for the '<em><b>Formal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL = eINSTANCE.getTemplateParameterSubstitution_Formal();

		/**
		 * The meta object literal for the '<em><b>Owned Actual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL = eINSTANCE.getTemplateParameterSubstitution_OwnedActual();

		/**
		 * The meta object literal for the '<em><b>Template Binding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING = eINSTANCE.getTemplateParameterSubstitution_TemplateBinding();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.UsageImpl <em>Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.UsageImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getUsage()
		 * @generated
		 */
		EClass USAGE = eINSTANCE.getUsage();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.impl.PackageableElementImpl
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getPackageableElement()
		 * @generated
		 */
		EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

		/**
		 * The meta object literal for the '{@link uml.commonStructure.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.commonStructure.VisibilityKind
		 * @see uml.commonStructure.impl.CommonStructurePackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

	}

} //CommonStructurePackage
