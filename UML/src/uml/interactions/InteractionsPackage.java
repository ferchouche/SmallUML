/**
 */
package uml.interactions;

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
 * @see uml.interactions.InteractionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Interactions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface InteractionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interactions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uml/interactions.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml.interactions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionsPackage eINSTANCE = uml.interactions.impl.InteractionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.interactions.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.InteractionFragmentImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionFragment()
	 * @generated
	 */
	int INTERACTION_FRAGMENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__COVERED = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__ENCLOSING_INTERACTION = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__ENCLOSING_OPERAND = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT__GENERAL_ORDERING = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Interaction Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FRAGMENT_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.ExecutionSpecificationImpl <em>Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.ExecutionSpecificationImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getExecutionSpecification()
	 * @generated
	 */
	int EXECUTION_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__OWNED_COMMENT = INTERACTION_FRAGMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__OWNED_ELEMENT = INTERACTION_FRAGMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__OWNER = INTERACTION_FRAGMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__NAME_EXPRESSION = INTERACTION_FRAGMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__NAMESPACE = INTERACTION_FRAGMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__QUALIFIED_NAME = INTERACTION_FRAGMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__VISIBILITY = INTERACTION_FRAGMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY = INTERACTION_FRAGMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__FINISH = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION__START = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION___ALL_OWNED_ELEMENTS = INTERACTION_FRAGMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION___MUST_BE_OWNED = INTERACTION_FRAGMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION___ALL_NAMESPACES = INTERACTION_FRAGMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION___ALL_OWNING_PACKAGES = INTERACTION_FRAGMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION___QUALIFIED_NAME = INTERACTION_FRAGMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION___SEPARATOR = INTERACTION_FRAGMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION___CLIENT_DEPENDENCY = INTERACTION_FRAGMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFICATION_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.ActionExecutionSpecificationImpl <em>Action Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.ActionExecutionSpecificationImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getActionExecutionSpecification()
	 * @generated
	 */
	int ACTION_EXECUTION_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__OWNED_COMMENT = EXECUTION_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__OWNED_ELEMENT = EXECUTION_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__OWNER = EXECUTION_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__NAME = EXECUTION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__NAME_EXPRESSION = EXECUTION_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__NAMESPACE = EXECUTION_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__QUALIFIED_NAME = EXECUTION_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__VISIBILITY = EXECUTION_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY = EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__COVERED = EXECUTION_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION = EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = EXECUTION_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__GENERAL_ORDERING = EXECUTION_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__FINISH = EXECUTION_SPECIFICATION__FINISH;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__START = EXECUTION_SPECIFICATION__START;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION__ACTION = EXECUTION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION_FEATURE_COUNT = EXECUTION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION___ALL_OWNED_ELEMENTS = EXECUTION_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION___MUST_BE_OWNED = EXECUTION_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION___ALL_NAMESPACES = EXECUTION_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION___ALL_OWNING_PACKAGES = EXECUTION_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = EXECUTION_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION___QUALIFIED_NAME = EXECUTION_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION___SEPARATOR = EXECUTION_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION___CLIENT_DEPENDENCY = EXECUTION_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Action Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXECUTION_SPECIFICATION_OPERATION_COUNT = EXECUTION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.LifelineImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__DECOMPOSED_AS = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__INTERACTION = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__REPRESENTS = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__SELECTOR = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Covered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__COVERED_BY = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.InteractionUseImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionUse()
	 * @generated
	 */
	int INTERACTION_USE = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__OWNED_COMMENT = INTERACTION_FRAGMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__OWNED_ELEMENT = INTERACTION_FRAGMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__OWNER = INTERACTION_FRAGMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__NAME_EXPRESSION = INTERACTION_FRAGMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__NAMESPACE = INTERACTION_FRAGMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__QUALIFIED_NAME = INTERACTION_FRAGMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__VISIBILITY = INTERACTION_FRAGMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__CLIENT_DEPENDENCY = INTERACTION_FRAGMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ACTUAL_GATE = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__ARGUMENT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__REFERS_TO = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__RETURN_VALUE = INTERACTION_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Return Value Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE__RETURN_VALUE_RECIPIENT = INTERACTION_FRAGMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Interaction Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE___ALL_OWNED_ELEMENTS = INTERACTION_FRAGMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE___MUST_BE_OWNED = INTERACTION_FRAGMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE___ALL_NAMESPACES = INTERACTION_FRAGMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE___ALL_OWNING_PACKAGES = INTERACTION_FRAGMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE___QUALIFIED_NAME = INTERACTION_FRAGMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE___SEPARATOR = INTERACTION_FRAGMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE___CLIENT_DEPENDENCY = INTERACTION_FRAGMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Interaction Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_USE_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.PartDecompositionImpl <em>Part Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.PartDecompositionImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getPartDecomposition()
	 * @generated
	 */
	int PART_DECOMPOSITION = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__OWNED_COMMENT = INTERACTION_USE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__OWNED_ELEMENT = INTERACTION_USE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__OWNER = INTERACTION_USE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__NAME = INTERACTION_USE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__NAME_EXPRESSION = INTERACTION_USE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__NAMESPACE = INTERACTION_USE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__QUALIFIED_NAME = INTERACTION_USE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__VISIBILITY = INTERACTION_USE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__CLIENT_DEPENDENCY = INTERACTION_USE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__COVERED = INTERACTION_USE__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ENCLOSING_INTERACTION = INTERACTION_USE__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ENCLOSING_OPERAND = INTERACTION_USE__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__GENERAL_ORDERING = INTERACTION_USE__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Actual Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ACTUAL_GATE = INTERACTION_USE__ACTUAL_GATE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__ARGUMENT = INTERACTION_USE__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__REFERS_TO = INTERACTION_USE__REFERS_TO;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__RETURN_VALUE = INTERACTION_USE__RETURN_VALUE;

	/**
	 * The feature id for the '<em><b>Return Value Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION__RETURN_VALUE_RECIPIENT = INTERACTION_USE__RETURN_VALUE_RECIPIENT;

	/**
	 * The number of structural features of the '<em>Part Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION_FEATURE_COUNT = INTERACTION_USE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION___ALL_OWNED_ELEMENTS = INTERACTION_USE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION___MUST_BE_OWNED = INTERACTION_USE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION___ALL_NAMESPACES = INTERACTION_USE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION___ALL_OWNING_PACKAGES = INTERACTION_USE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_USE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION___QUALIFIED_NAME = INTERACTION_USE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION___SEPARATOR = INTERACTION_USE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION___CLIENT_DEPENDENCY = INTERACTION_USE___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Part Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_DECOMPOSITION_OPERATION_COUNT = INTERACTION_USE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.MessageEndImpl <em>Message End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.MessageEndImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getMessageEnd()
	 * @generated
	 */
	int MESSAGE_END = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END__MESSAGE = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Opposite End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___OPPOSITE_END = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___IS_SEND = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Receive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___IS_RECEIVE = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Enclosing Fragment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END___ENCLOSING_FRAGMENT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Message End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_END_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.GateImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__OWNED_COMMENT = MESSAGE_END__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__OWNED_ELEMENT = MESSAGE_END__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__OWNER = MESSAGE_END__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = MESSAGE_END__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME_EXPRESSION = MESSAGE_END__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAMESPACE = MESSAGE_END__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__QUALIFIED_NAME = MESSAGE_END__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__VISIBILITY = MESSAGE_END__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__CLIENT_DEPENDENCY = MESSAGE_END__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__MESSAGE = MESSAGE_END__MESSAGE;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = MESSAGE_END_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___ALL_OWNED_ELEMENTS = MESSAGE_END___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___MUST_BE_OWNED = MESSAGE_END___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___ALL_NAMESPACES = MESSAGE_END___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___ALL_OWNING_PACKAGES = MESSAGE_END___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = MESSAGE_END___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___QUALIFIED_NAME = MESSAGE_END___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___SEPARATOR = MESSAGE_END___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___CLIENT_DEPENDENCY = MESSAGE_END___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Opposite End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___OPPOSITE_END = MESSAGE_END___OPPOSITE_END;

	/**
	 * The operation id for the '<em>Is Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___IS_SEND = MESSAGE_END___IS_SEND;

	/**
	 * The operation id for the '<em>Is Receive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___IS_RECEIVE = MESSAGE_END___IS_RECEIVE;

	/**
	 * The operation id for the '<em>Enclosing Fragment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___ENCLOSING_FRAGMENT = MESSAGE_END___ENCLOSING_FRAGMENT;

	/**
	 * The operation id for the '<em>Is Outside Cf</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___IS_OUTSIDE_CF = MESSAGE_END_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Inside Cf</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___IS_INSIDE_CF = MESSAGE_END_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Actual</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___IS_ACTUAL = MESSAGE_END_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Formal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___IS_FORMAL = MESSAGE_END_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___GET_NAME = MESSAGE_END_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Matches</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___MATCHES__GATE = MESSAGE_END_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Operand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE___GET_OPERAND = MESSAGE_END_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = MESSAGE_END_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.MessageImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ARGUMENT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONNECTOR = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__INTERACTION = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_KIND = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_SORT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVE_EVENT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SEND_EVENT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SIGNATURE = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Message Kind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___MESSAGE_KIND = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.InteractionImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 9;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_COMMENT = CommonBehaviorPackage.BEHAVIOR__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_ELEMENT = CommonBehaviorPackage.BEHAVIOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNER = CommonBehaviorPackage.BEHAVIOR__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = CommonBehaviorPackage.BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME_EXPRESSION = CommonBehaviorPackage.BEHAVIOR__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAMESPACE = CommonBehaviorPackage.BEHAVIOR__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__QUALIFIED_NAME = CommonBehaviorPackage.BEHAVIOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__VISIBILITY = CommonBehaviorPackage.BEHAVIOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CLIENT_DEPENDENCY = CommonBehaviorPackage.BEHAVIOR__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ELEMENT_IMPORT = CommonBehaviorPackage.BEHAVIOR__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IMPORTED_MEMBER = CommonBehaviorPackage.BEHAVIOR__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MEMBER = CommonBehaviorPackage.BEHAVIOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_MEMBER = CommonBehaviorPackage.BEHAVIOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_RULE = CommonBehaviorPackage.BEHAVIOR__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PACKAGE_IMPORT = CommonBehaviorPackage.BEHAVIOR__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_LEAF = CommonBehaviorPackage.BEHAVIOR__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REDEFINED_ELEMENT = CommonBehaviorPackage.BEHAVIOR__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REDEFINITION_CONTEXT = CommonBehaviorPackage.BEHAVIOR__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNING_TEMPLATE_PARAMETER = CommonBehaviorPackage.BEHAVIOR__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TEMPLATE_PARAMETER = CommonBehaviorPackage.BEHAVIOR__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PACKAGE = CommonBehaviorPackage.BEHAVIOR__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TEMPLATE_BINDING = CommonBehaviorPackage.BEHAVIOR__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_TEMPLATE_SIGNATURE = CommonBehaviorPackage.BEHAVIOR__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SUBSTITUTION = CommonBehaviorPackage.BEHAVIOR__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FEATURE = CommonBehaviorPackage.BEHAVIOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__POWERTYPE_EXTENT = CommonBehaviorPackage.BEHAVIOR__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__GENERALIZATION = CommonBehaviorPackage.BEHAVIOR__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ATTRIBUTE = CommonBehaviorPackage.BEHAVIOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__COLLABORATION_USE = CommonBehaviorPackage.BEHAVIOR__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__GENERAL = CommonBehaviorPackage.BEHAVIOR__GENERAL;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INHERITED_MEMBER = CommonBehaviorPackage.BEHAVIOR__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_ABSTRACT = CommonBehaviorPackage.BEHAVIOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_FINAL_SPECIALIZATION = CommonBehaviorPackage.BEHAVIOR__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_USE_CASE = CommonBehaviorPackage.BEHAVIOR__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__USE_CASE = CommonBehaviorPackage.BEHAVIOR__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REDEFINED_CLASSIFIER = CommonBehaviorPackage.BEHAVIOR__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REPRESENTATION = CommonBehaviorPackage.BEHAVIOR__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_ATTRIBUTE = CommonBehaviorPackage.BEHAVIOR__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_CONNECTOR = CommonBehaviorPackage.BEHAVIOR__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PART = CommonBehaviorPackage.BEHAVIOR__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ROLE = CommonBehaviorPackage.BEHAVIOR__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_PORT = CommonBehaviorPackage.BEHAVIOR__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INTERFACE_REALIZATION = CommonBehaviorPackage.BEHAVIOR__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CLASSIFIER_BEHAVIOR = CommonBehaviorPackage.BEHAVIOR__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_BEHAVIOR = CommonBehaviorPackage.BEHAVIOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_OPERATION = CommonBehaviorPackage.BEHAVIOR__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__EXTENSION = CommonBehaviorPackage.BEHAVIOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_ACTIVE = CommonBehaviorPackage.BEHAVIOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NESTED_CLASSIFIER = CommonBehaviorPackage.BEHAVIOR__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_RECEPTION = CommonBehaviorPackage.BEHAVIOR__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SUPER_CLASS = CommonBehaviorPackage.BEHAVIOR__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SPECIFICATION = CommonBehaviorPackage.BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CONTEXT = CommonBehaviorPackage.BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_REENTRANT = CommonBehaviorPackage.BEHAVIOR__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_PARAMETER = CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_PARAMETER_SET = CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__POSTCONDITION = CommonBehaviorPackage.BEHAVIOR__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PRECONDITION = CommonBehaviorPackage.BEHAVIOR__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REDEFINED_BEHAVIOR = CommonBehaviorPackage.BEHAVIOR__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__COVERED = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ENCLOSING_INTERACTION = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ENCLOSING_OPERAND = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__GENERAL_ORDERING = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ACTION = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FORMAL_GATE = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FRAGMENT = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__LIFELINE = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MESSAGE = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = CommonBehaviorPackage.BEHAVIOR_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_OWNED_ELEMENTS = CommonBehaviorPackage.BEHAVIOR___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___MUST_BE_OWNED = CommonBehaviorPackage.BEHAVIOR___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_NAMESPACES = CommonBehaviorPackage.BEHAVIOR___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_OWNING_PACKAGES = CommonBehaviorPackage.BEHAVIOR___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonBehaviorPackage.BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___QUALIFIED_NAME = CommonBehaviorPackage.BEHAVIOR___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___SEPARATOR = CommonBehaviorPackage.BEHAVIOR___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CLIENT_DEPENDENCY = CommonBehaviorPackage.BEHAVIOR___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___EXCLUDE_COLLISIONS__ELIST = CommonBehaviorPackage.BEHAVIOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonBehaviorPackage.BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IMPORT_MEMBERS__ELIST = CommonBehaviorPackage.BEHAVIOR___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IMPORTED_MEMBER = CommonBehaviorPackage.BEHAVIOR___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___MEMBERS_ARE_DISTINGUISHABLE = CommonBehaviorPackage.BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = CommonBehaviorPackage.BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = CommonBehaviorPackage.BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonBehaviorPackage.BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_TEMPLATE_PARAMETER = CommonBehaviorPackage.BEHAVIOR___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CONFORMS_TO__TYPE = CommonBehaviorPackage.BEHAVIOR___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_TEMPLATE = CommonBehaviorPackage.BEHAVIOR___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___PARAMETERABLE_ELEMENTS = CommonBehaviorPackage.BEHAVIOR___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_FEATURES = CommonBehaviorPackage.BEHAVIOR___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_PARENTS = CommonBehaviorPackage.BEHAVIOR___ALL_PARENTS;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GENERAL = CommonBehaviorPackage.BEHAVIOR___GENERAL;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___HAS_VISIBILITY_OF__NAMEDELEMENT = CommonBehaviorPackage.BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___INHERIT__ELIST = CommonBehaviorPackage.BEHAVIOR___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___INHERITABLE_MEMBERS__CLASSIFIER = CommonBehaviorPackage.BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Inherited Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___INHERITED_MEMBER = CommonBehaviorPackage.BEHAVIOR___INHERITED_MEMBER;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___MAY_SPECIALIZE_TYPE__CLASSIFIER = CommonBehaviorPackage.BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___PARENTS = CommonBehaviorPackage.BEHAVIOR___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___DIRECTLY_REALIZED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___DIRECTLY_USED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_REALIZED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_USED_INTERFACES = CommonBehaviorPackage.BEHAVIOR___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_SUBSTITUTABLE_FOR__CLASSIFIER = CommonBehaviorPackage.BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_ATTRIBUTES = CommonBehaviorPackage.BEHAVIOR___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_SLOTTABLE_FEATURES = CommonBehaviorPackage.BEHAVIOR___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___PART = CommonBehaviorPackage.BEHAVIOR___PART;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_ROLES = CommonBehaviorPackage.BEHAVIOR___ALL_ROLES;

	/**
	 * The operation id for the '<em>Owned Port</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___OWNED_PORT = CommonBehaviorPackage.BEHAVIOR___OWNED_PORT;

	/**
	 * The operation id for the '<em>Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___EXTENSION = CommonBehaviorPackage.BEHAVIOR___EXTENSION;

	/**
	 * The operation id for the '<em>Super Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___SUPER_CLASS = CommonBehaviorPackage.BEHAVIOR___SUPER_CLASS;

	/**
	 * The operation id for the '<em>Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CONTEXT = CommonBehaviorPackage.BEHAVIOR___CONTEXT;

	/**
	 * The operation id for the '<em>Behaviored Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___BEHAVIORED_CLASSIFIER__ELEMENT = CommonBehaviorPackage.BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___INPUT_PARAMETERS = CommonBehaviorPackage.BEHAVIOR___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___OUTPUT_PARAMETERS = CommonBehaviorPackage.BEHAVIOR___OUTPUT_PARAMETERS;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = CommonBehaviorPackage.BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.InteractionOperandImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionOperand()
	 * @generated
	 */
	int INTERACTION_OPERAND = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNED_COMMENT = CommonStructurePackage.NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNED_ELEMENT = CommonStructurePackage.NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNER = CommonStructurePackage.NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__NAME = CommonStructurePackage.NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__NAME_EXPRESSION = CommonStructurePackage.NAMESPACE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__NAMESPACE = CommonStructurePackage.NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__QUALIFIED_NAME = CommonStructurePackage.NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__VISIBILITY = CommonStructurePackage.NAMESPACE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__ELEMENT_IMPORT = CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__MEMBER = CommonStructurePackage.NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNED_MEMBER = CommonStructurePackage.NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__OWNED_RULE = CommonStructurePackage.NAMESPACE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__PACKAGE_IMPORT = CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__COVERED = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__ENCLOSING_INTERACTION = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__ENCLOSING_OPERAND = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__GENERAL_ORDERING = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__FRAGMENT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND__GUARD = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Interaction Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_FEATURE_COUNT = CommonStructurePackage.NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___MUST_BE_OWNED = CommonStructurePackage.NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___ALL_NAMESPACES = CommonStructurePackage.NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMESPACE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMESPACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___QUALIFIED_NAME = CommonStructurePackage.NAMESPACE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___SEPARATOR = CommonStructurePackage.NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___CLIENT_DEPENDENCY = CommonStructurePackage.NAMESPACE___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___EXCLUDE_COLLISIONS__ELIST = CommonStructurePackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___GET_NAMES_OF_MEMBER__NAMEDELEMENT = CommonStructurePackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___IMPORT_MEMBERS__ELIST = CommonStructurePackage.NAMESPACE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Imported Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___IMPORTED_MEMBER = CommonStructurePackage.NAMESPACE___IMPORTED_MEMBER;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND___MEMBERS_ARE_DISTINGUISHABLE = CommonStructurePackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The number of operations of the '<em>Interaction Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERAND_OPERATION_COUNT = CommonStructurePackage.NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.InteractionConstraintImpl <em>Interaction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.InteractionConstraintImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionConstraint()
	 * @generated
	 */
	int INTERACTION_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__OWNED_COMMENT = CommonStructurePackage.CONSTRAINT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__OWNED_ELEMENT = CommonStructurePackage.CONSTRAINT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__OWNER = CommonStructurePackage.CONSTRAINT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__NAME = CommonStructurePackage.CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__NAME_EXPRESSION = CommonStructurePackage.CONSTRAINT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__NAMESPACE = CommonStructurePackage.CONSTRAINT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__QUALIFIED_NAME = CommonStructurePackage.CONSTRAINT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__VISIBILITY = CommonStructurePackage.CONSTRAINT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__CLIENT_DEPENDENCY = CommonStructurePackage.CONSTRAINT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__OWNING_TEMPLATE_PARAMETER = CommonStructurePackage.CONSTRAINT__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__TEMPLATE_PARAMETER = CommonStructurePackage.CONSTRAINT__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__CONSTRAINED_ELEMENT = CommonStructurePackage.CONSTRAINT__CONSTRAINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__SPECIFICATION = CommonStructurePackage.CONSTRAINT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__CONTEXT = CommonStructurePackage.CONSTRAINT__CONTEXT;

	/**
	 * The feature id for the '<em><b>Maxint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__MAXINT = CommonStructurePackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT__MININT = CommonStructurePackage.CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT_FEATURE_COUNT = CommonStructurePackage.CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___ALL_OWNED_ELEMENTS = CommonStructurePackage.CONSTRAINT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___MUST_BE_OWNED = CommonStructurePackage.CONSTRAINT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___ALL_NAMESPACES = CommonStructurePackage.CONSTRAINT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___ALL_OWNING_PACKAGES = CommonStructurePackage.CONSTRAINT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.CONSTRAINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___QUALIFIED_NAME = CommonStructurePackage.CONSTRAINT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___SEPARATOR = CommonStructurePackage.CONSTRAINT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___CLIENT_DEPENDENCY = CommonStructurePackage.CONSTRAINT___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = CommonStructurePackage.CONSTRAINT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT___IS_TEMPLATE_PARAMETER = CommonStructurePackage.CONSTRAINT___IS_TEMPLATE_PARAMETER;

	/**
	 * The number of operations of the '<em>Interaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_CONSTRAINT_OPERATION_COUNT = CommonStructurePackage.CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.GeneralOrderingImpl <em>General Ordering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.GeneralOrderingImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getGeneralOrdering()
	 * @generated
	 */
	int GENERAL_ORDERING = 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__OWNED_COMMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__OWNED_ELEMENT = CommonStructurePackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__OWNER = CommonStructurePackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__NAME = CommonStructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__NAME_EXPRESSION = CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__NAMESPACE = CommonStructurePackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__VISIBILITY = CommonStructurePackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__AFTER = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING__BEFORE = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>General Ordering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING_FEATURE_COUNT = CommonStructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING___ALL_OWNED_ELEMENTS = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING___MUST_BE_OWNED = CommonStructurePackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING___ALL_NAMESPACES = CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING___ALL_OWNING_PACKAGES = CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING___QUALIFIED_NAME = CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING___SEPARATOR = CommonStructurePackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING___CLIENT_DEPENDENCY = CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>General Ordering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ORDERING_OPERATION_COUNT = CommonStructurePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.OccurrenceSpecificationImpl <em>Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.OccurrenceSpecificationImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getOccurrenceSpecification()
	 * @generated
	 */
	int OCCURRENCE_SPECIFICATION = 13;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__OWNED_COMMENT = INTERACTION_FRAGMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__OWNED_ELEMENT = INTERACTION_FRAGMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__OWNER = INTERACTION_FRAGMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__NAME_EXPRESSION = INTERACTION_FRAGMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__NAMESPACE = INTERACTION_FRAGMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__QUALIFIED_NAME = INTERACTION_FRAGMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__VISIBILITY = INTERACTION_FRAGMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY = INTERACTION_FRAGMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__TO_AFTER = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION__TO_BEFORE = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS = INTERACTION_FRAGMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION___MUST_BE_OWNED = INTERACTION_FRAGMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION___ALL_NAMESPACES = INTERACTION_FRAGMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES = INTERACTION_FRAGMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION___QUALIFIED_NAME = INTERACTION_FRAGMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION___SEPARATOR = INTERACTION_FRAGMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION___CLIENT_DEPENDENCY = INTERACTION_FRAGMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_SPECIFICATION_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.BehaviorExecutionSpecificationImpl <em>Behavior Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.BehaviorExecutionSpecificationImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getBehaviorExecutionSpecification()
	 * @generated
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION = 14;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT = EXECUTION_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_ELEMENT = EXECUTION_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__OWNER = EXECUTION_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__NAME = EXECUTION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION = EXECUTION_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__NAMESPACE = EXECUTION_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__QUALIFIED_NAME = EXECUTION_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY = EXECUTION_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY = EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__COVERED = EXECUTION_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION = EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = EXECUTION_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING = EXECUTION_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__FINISH = EXECUTION_SPECIFICATION__FINISH;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__START = EXECUTION_SPECIFICATION__START;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR = EXECUTION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION_FEATURE_COUNT = EXECUTION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___ALL_OWNED_ELEMENTS = EXECUTION_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___MUST_BE_OWNED = EXECUTION_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___ALL_NAMESPACES = EXECUTION_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___ALL_OWNING_PACKAGES = EXECUTION_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = EXECUTION_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___QUALIFIED_NAME = EXECUTION_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___SEPARATOR = EXECUTION_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___CLIENT_DEPENDENCY = EXECUTION_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Behavior Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION_OPERATION_COUNT = EXECUTION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.CombinedFragmentImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getCombinedFragment()
	 * @generated
	 */
	int COMBINED_FRAGMENT = 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OWNED_COMMENT = INTERACTION_FRAGMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OWNED_ELEMENT = INTERACTION_FRAGMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OWNER = INTERACTION_FRAGMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__NAME_EXPRESSION = INTERACTION_FRAGMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__NAMESPACE = INTERACTION_FRAGMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__QUALIFIED_NAME = INTERACTION_FRAGMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__VISIBILITY = INTERACTION_FRAGMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__CLIENT_DEPENDENCY = INTERACTION_FRAGMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__CFRAGMENT_GATE = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__INTERACTION_OPERATOR = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT__OPERAND = INTERACTION_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT___ALL_OWNED_ELEMENTS = INTERACTION_FRAGMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT___MUST_BE_OWNED = INTERACTION_FRAGMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT___ALL_NAMESPACES = INTERACTION_FRAGMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT___ALL_OWNING_PACKAGES = INTERACTION_FRAGMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT___QUALIFIED_NAME = INTERACTION_FRAGMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT___SEPARATOR = INTERACTION_FRAGMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT___CLIENT_DEPENDENCY = INTERACTION_FRAGMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Combined Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_FRAGMENT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.ConsiderIgnoreFragmentImpl <em>Consider Ignore Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.ConsiderIgnoreFragmentImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getConsiderIgnoreFragment()
	 * @generated
	 */
	int CONSIDER_IGNORE_FRAGMENT = 16;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__OWNED_COMMENT = COMBINED_FRAGMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__OWNED_ELEMENT = COMBINED_FRAGMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__OWNER = COMBINED_FRAGMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__NAME = COMBINED_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__NAME_EXPRESSION = COMBINED_FRAGMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__NAMESPACE = COMBINED_FRAGMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__QUALIFIED_NAME = COMBINED_FRAGMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__VISIBILITY = COMBINED_FRAGMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__CLIENT_DEPENDENCY = COMBINED_FRAGMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__COVERED = COMBINED_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__ENCLOSING_INTERACTION = COMBINED_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__ENCLOSING_OPERAND = COMBINED_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__GENERAL_ORDERING = COMBINED_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__CFRAGMENT_GATE = COMBINED_FRAGMENT__CFRAGMENT_GATE;

	/**
	 * The feature id for the '<em><b>Interaction Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__INTERACTION_OPERATOR = COMBINED_FRAGMENT__INTERACTION_OPERATOR;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__OPERAND = COMBINED_FRAGMENT__OPERAND;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT__MESSAGE = COMBINED_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consider Ignore Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT_FEATURE_COUNT = COMBINED_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT___ALL_OWNED_ELEMENTS = COMBINED_FRAGMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT___MUST_BE_OWNED = COMBINED_FRAGMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT___ALL_NAMESPACES = COMBINED_FRAGMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT___ALL_OWNING_PACKAGES = COMBINED_FRAGMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = COMBINED_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT___QUALIFIED_NAME = COMBINED_FRAGMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT___SEPARATOR = COMBINED_FRAGMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT___CLIENT_DEPENDENCY = COMBINED_FRAGMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Consider Ignore Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSIDER_IGNORE_FRAGMENT_OPERATION_COUNT = COMBINED_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.ContinuationImpl <em>Continuation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.ContinuationImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getContinuation()
	 * @generated
	 */
	int CONTINUATION = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__OWNED_COMMENT = INTERACTION_FRAGMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__OWNED_ELEMENT = INTERACTION_FRAGMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__OWNER = INTERACTION_FRAGMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__NAME_EXPRESSION = INTERACTION_FRAGMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__NAMESPACE = INTERACTION_FRAGMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__QUALIFIED_NAME = INTERACTION_FRAGMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__VISIBILITY = INTERACTION_FRAGMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__CLIENT_DEPENDENCY = INTERACTION_FRAGMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Setting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION__SETTING = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION___ALL_OWNED_ELEMENTS = INTERACTION_FRAGMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION___MUST_BE_OWNED = INTERACTION_FRAGMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION___ALL_NAMESPACES = INTERACTION_FRAGMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION___ALL_OWNING_PACKAGES = INTERACTION_FRAGMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION___QUALIFIED_NAME = INTERACTION_FRAGMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION___SEPARATOR = INTERACTION_FRAGMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION___CLIENT_DEPENDENCY = INTERACTION_FRAGMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Continuation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.MessageOccurrenceSpecificationImpl <em>Message Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.MessageOccurrenceSpecificationImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getMessageOccurrenceSpecification()
	 * @generated
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION = 19;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT = OCCURRENCE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT = OCCURRENCE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__OWNER = OCCURRENCE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__NAME = OCCURRENCE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION = OCCURRENCE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__NAMESPACE = OCCURRENCE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME = OCCURRENCE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY = OCCURRENCE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY = OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__COVERED = OCCURRENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION = OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = OCCURRENCE_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER = OCCURRENCE_SPECIFICATION__TO_AFTER;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE = OCCURRENCE_SPECIFICATION__TO_BEFORE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE = OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS = OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___MUST_BE_OWNED = OCCURRENCE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___ALL_NAMESPACES = OCCURRENCE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES = OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___QUALIFIED_NAME = OCCURRENCE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___SEPARATOR = OCCURRENCE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___CLIENT_DEPENDENCY = OCCURRENCE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Opposite End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___OPPOSITE_END = OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___IS_SEND = OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Receive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___IS_RECEIVE = OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Enclosing Fragment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION___ENCLOSING_FRAGMENT = OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Message Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURRENCE_SPECIFICATION_OPERATION_COUNT = OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.DestructionOccurrenceSpecificationImpl <em>Destruction Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.DestructionOccurrenceSpecificationImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getDestructionOccurrenceSpecification()
	 * @generated
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION = 18;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__OWNED_COMMENT = MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT = MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__OWNER = MESSAGE_OCCURRENCE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__NAME = MESSAGE_OCCURRENCE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION = MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__NAMESPACE = MESSAGE_OCCURRENCE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME = MESSAGE_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__VISIBILITY = MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY = MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__COVERED = MESSAGE_OCCURRENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION = MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__TO_AFTER = MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__TO_BEFORE = MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION__MESSAGE = MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE;

	/**
	 * The number of structural features of the '<em>Destruction Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS = MESSAGE_OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___MUST_BE_OWNED = MESSAGE_OCCURRENCE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___ALL_NAMESPACES = MESSAGE_OCCURRENCE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES = MESSAGE_OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = MESSAGE_OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___QUALIFIED_NAME = MESSAGE_OCCURRENCE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___SEPARATOR = MESSAGE_OCCURRENCE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___CLIENT_DEPENDENCY = MESSAGE_OCCURRENCE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The operation id for the '<em>Opposite End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___OPPOSITE_END = MESSAGE_OCCURRENCE_SPECIFICATION___OPPOSITE_END;

	/**
	 * The operation id for the '<em>Is Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___IS_SEND = MESSAGE_OCCURRENCE_SPECIFICATION___IS_SEND;

	/**
	 * The operation id for the '<em>Is Receive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___IS_RECEIVE = MESSAGE_OCCURRENCE_SPECIFICATION___IS_RECEIVE;

	/**
	 * The operation id for the '<em>Enclosing Fragment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION___ENCLOSING_FRAGMENT = MESSAGE_OCCURRENCE_SPECIFICATION___ENCLOSING_FRAGMENT;

	/**
	 * The number of operations of the '<em>Destruction Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTRUCTION_OCCURRENCE_SPECIFICATION_OPERATION_COUNT = MESSAGE_OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.ExecutionOccurrenceSpecificationImpl <em>Execution Occurrence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.ExecutionOccurrenceSpecificationImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getExecutionOccurrenceSpecification()
	 * @generated
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION = 20;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__OWNED_COMMENT = OCCURRENCE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT = OCCURRENCE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__OWNER = OCCURRENCE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__NAME = OCCURRENCE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION = OCCURRENCE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__NAMESPACE = OCCURRENCE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME = OCCURRENCE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__VISIBILITY = OCCURRENCE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY = OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__COVERED = OCCURRENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION = OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND = OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING = OCCURRENCE_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__TO_AFTER = OCCURRENCE_SPECIFICATION__TO_AFTER;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__TO_BEFORE = OCCURRENCE_SPECIFICATION__TO_BEFORE;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION = OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION_FEATURE_COUNT = OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS = OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION___MUST_BE_OWNED = OCCURRENCE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION___ALL_NAMESPACES = OCCURRENCE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES = OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION___QUALIFIED_NAME = OCCURRENCE_SPECIFICATION___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION___SEPARATOR = OCCURRENCE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION___CLIENT_DEPENDENCY = OCCURRENCE_SPECIFICATION___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>Execution Occurrence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OCCURRENCE_SPECIFICATION_OPERATION_COUNT = OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.impl.StateInvariantImpl <em>State Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.impl.StateInvariantImpl
	 * @see uml.interactions.impl.InteractionsPackageImpl#getStateInvariant()
	 * @generated
	 */
	int STATE_INVARIANT = 21;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__OWNED_COMMENT = INTERACTION_FRAGMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__OWNED_ELEMENT = INTERACTION_FRAGMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__OWNER = INTERACTION_FRAGMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__NAME = INTERACTION_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__NAME_EXPRESSION = INTERACTION_FRAGMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__NAMESPACE = INTERACTION_FRAGMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__QUALIFIED_NAME = INTERACTION_FRAGMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__VISIBILITY = INTERACTION_FRAGMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__CLIENT_DEPENDENCY = INTERACTION_FRAGMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__COVERED = INTERACTION_FRAGMENT__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__ENCLOSING_INTERACTION = INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__ENCLOSING_OPERAND = INTERACTION_FRAGMENT__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__GENERAL_ORDERING = INTERACTION_FRAGMENT__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT__INVARIANT = INTERACTION_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT_FEATURE_COUNT = INTERACTION_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT___ALL_OWNED_ELEMENTS = INTERACTION_FRAGMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT___MUST_BE_OWNED = INTERACTION_FRAGMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT___ALL_NAMESPACES = INTERACTION_FRAGMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT___ALL_OWNING_PACKAGES = INTERACTION_FRAGMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FRAGMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT___QUALIFIED_NAME = INTERACTION_FRAGMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT___SEPARATOR = INTERACTION_FRAGMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT___CLIENT_DEPENDENCY = INTERACTION_FRAGMENT___CLIENT_DEPENDENCY;

	/**
	 * The number of operations of the '<em>State Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_INVARIANT_OPERATION_COUNT = INTERACTION_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml.interactions.MessageKind <em>Message Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.MessageKind
	 * @see uml.interactions.impl.InteractionsPackageImpl#getMessageKind()
	 * @generated
	 */
	int MESSAGE_KIND = 22;

	/**
	 * The meta object id for the '{@link uml.interactions.MessageSort <em>Message Sort</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.MessageSort
	 * @see uml.interactions.impl.InteractionsPackageImpl#getMessageSort()
	 * @generated
	 */
	int MESSAGE_SORT = 23;

	/**
	 * The meta object id for the '{@link uml.interactions.InteractionOperatorKind <em>Interaction Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.interactions.InteractionOperatorKind
	 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionOperatorKind()
	 * @generated
	 */
	int INTERACTION_OPERATOR_KIND = 24;


	/**
	 * Returns the meta object for class '{@link uml.interactions.ActionExecutionSpecification <em>Action Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Execution Specification</em>'.
	 * @see uml.interactions.ActionExecutionSpecification
	 * @generated
	 */
	EClass getActionExecutionSpecification();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.ActionExecutionSpecification#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see uml.interactions.ActionExecutionSpecification#getAction()
	 * @see #getActionExecutionSpecification()
	 * @generated
	 */
	EReference getActionExecutionSpecification_Action();

	/**
	 * Returns the meta object for class '{@link uml.interactions.ExecutionSpecification <em>Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Specification</em>'.
	 * @see uml.interactions.ExecutionSpecification
	 * @generated
	 */
	EClass getExecutionSpecification();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.ExecutionSpecification#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Finish</em>'.
	 * @see uml.interactions.ExecutionSpecification#getFinish()
	 * @see #getExecutionSpecification()
	 * @generated
	 */
	EReference getExecutionSpecification_Finish();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.ExecutionSpecification#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see uml.interactions.ExecutionSpecification#getStart()
	 * @see #getExecutionSpecification()
	 * @generated
	 */
	EReference getExecutionSpecification_Start();

	/**
	 * Returns the meta object for class '{@link uml.interactions.InteractionFragment <em>Interaction Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Fragment</em>'.
	 * @see uml.interactions.InteractionFragment
	 * @generated
	 */
	EClass getInteractionFragment();

	/**
	 * Returns the meta object for the reference list '{@link uml.interactions.InteractionFragment#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered</em>'.
	 * @see uml.interactions.InteractionFragment#getCovered()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_Covered();

	/**
	 * Returns the meta object for the container reference '{@link uml.interactions.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enclosing Interaction</em>'.
	 * @see uml.interactions.InteractionFragment#getEnclosingInteraction()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_EnclosingInteraction();

	/**
	 * Returns the meta object for the container reference '{@link uml.interactions.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enclosing Operand</em>'.
	 * @see uml.interactions.InteractionFragment#getEnclosingOperand()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_EnclosingOperand();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.InteractionFragment#getGeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Ordering</em>'.
	 * @see uml.interactions.InteractionFragment#getGeneralOrdering()
	 * @see #getInteractionFragment()
	 * @generated
	 */
	EReference getInteractionFragment_GeneralOrdering();

	/**
	 * Returns the meta object for class '{@link uml.interactions.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see uml.interactions.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.Lifeline#getDecomposedAs <em>Decomposed As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decomposed As</em>'.
	 * @see uml.interactions.Lifeline#getDecomposedAs()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_DecomposedAs();

	/**
	 * Returns the meta object for the container reference '{@link uml.interactions.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interaction</em>'.
	 * @see uml.interactions.Lifeline#getInteraction()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Interaction();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.Lifeline#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see uml.interactions.Lifeline#getRepresents()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Represents();

	/**
	 * Returns the meta object for the containment reference '{@link uml.interactions.Lifeline#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see uml.interactions.Lifeline#getSelector()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_Selector();

	/**
	 * Returns the meta object for the reference list '{@link uml.interactions.Lifeline#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered By</em>'.
	 * @see uml.interactions.Lifeline#getCoveredBy()
	 * @see #getLifeline()
	 * @generated
	 */
	EReference getLifeline_CoveredBy();

	/**
	 * Returns the meta object for class '{@link uml.interactions.PartDecomposition <em>Part Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Decomposition</em>'.
	 * @see uml.interactions.PartDecomposition
	 * @generated
	 */
	EClass getPartDecomposition();

	/**
	 * Returns the meta object for class '{@link uml.interactions.InteractionUse <em>Interaction Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Use</em>'.
	 * @see uml.interactions.InteractionUse
	 * @generated
	 */
	EClass getInteractionUse();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.InteractionUse#getActualGate <em>Actual Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Gate</em>'.
	 * @see uml.interactions.InteractionUse#getActualGate()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_ActualGate();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.InteractionUse#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see uml.interactions.InteractionUse#getArgument()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_Argument();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.InteractionUse#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To</em>'.
	 * @see uml.interactions.InteractionUse#getRefersTo()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_RefersTo();

	/**
	 * Returns the meta object for the containment reference '{@link uml.interactions.InteractionUse#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see uml.interactions.InteractionUse#getReturnValue()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_ReturnValue();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value Recipient</em>'.
	 * @see uml.interactions.InteractionUse#getReturnValueRecipient()
	 * @see #getInteractionUse()
	 * @generated
	 */
	EReference getInteractionUse_ReturnValueRecipient();

	/**
	 * Returns the meta object for class '{@link uml.interactions.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see uml.interactions.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the '{@link uml.interactions.Gate#isOutsideCf() <em>Is Outside Cf</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Outside Cf</em>' operation.
	 * @see uml.interactions.Gate#isOutsideCf()
	 * @generated
	 */
	EOperation getGate__IsOutsideCf();

	/**
	 * Returns the meta object for the '{@link uml.interactions.Gate#isInsideCf() <em>Is Inside Cf</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Inside Cf</em>' operation.
	 * @see uml.interactions.Gate#isInsideCf()
	 * @generated
	 */
	EOperation getGate__IsInsideCf();

	/**
	 * Returns the meta object for the '{@link uml.interactions.Gate#isActual() <em>Is Actual</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Actual</em>' operation.
	 * @see uml.interactions.Gate#isActual()
	 * @generated
	 */
	EOperation getGate__IsActual();

	/**
	 * Returns the meta object for the '{@link uml.interactions.Gate#isFormal() <em>Is Formal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Formal</em>' operation.
	 * @see uml.interactions.Gate#isFormal()
	 * @generated
	 */
	EOperation getGate__IsFormal();

	/**
	 * Returns the meta object for the '{@link uml.interactions.Gate#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see uml.interactions.Gate#getName()
	 * @generated
	 */
	EOperation getGate__GetName();

	/**
	 * Returns the meta object for the '{@link uml.interactions.Gate#matches(uml.interactions.Gate) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches</em>' operation.
	 * @see uml.interactions.Gate#matches(uml.interactions.Gate)
	 * @generated
	 */
	EOperation getGate__Matches__Gate();

	/**
	 * Returns the meta object for the '{@link uml.interactions.Gate#getOperand() <em>Get Operand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operand</em>' operation.
	 * @see uml.interactions.Gate#getOperand()
	 * @generated
	 */
	EOperation getGate__GetOperand();

	/**
	 * Returns the meta object for class '{@link uml.interactions.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message End</em>'.
	 * @see uml.interactions.MessageEnd
	 * @generated
	 */
	EClass getMessageEnd();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.MessageEnd#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see uml.interactions.MessageEnd#getMessage()
	 * @see #getMessageEnd()
	 * @generated
	 */
	EReference getMessageEnd_Message();

	/**
	 * Returns the meta object for the '{@link uml.interactions.MessageEnd#oppositeEnd() <em>Opposite End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Opposite End</em>' operation.
	 * @see uml.interactions.MessageEnd#oppositeEnd()
	 * @generated
	 */
	EOperation getMessageEnd__OppositeEnd();

	/**
	 * Returns the meta object for the '{@link uml.interactions.MessageEnd#isSend() <em>Is Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Send</em>' operation.
	 * @see uml.interactions.MessageEnd#isSend()
	 * @generated
	 */
	EOperation getMessageEnd__IsSend();

	/**
	 * Returns the meta object for the '{@link uml.interactions.MessageEnd#isReceive() <em>Is Receive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Receive</em>' operation.
	 * @see uml.interactions.MessageEnd#isReceive()
	 * @generated
	 */
	EOperation getMessageEnd__IsReceive();

	/**
	 * Returns the meta object for the '{@link uml.interactions.MessageEnd#enclosingFragment() <em>Enclosing Fragment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enclosing Fragment</em>' operation.
	 * @see uml.interactions.MessageEnd#enclosingFragment()
	 * @generated
	 */
	EOperation getMessageEnd__EnclosingFragment();

	/**
	 * Returns the meta object for class '{@link uml.interactions.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see uml.interactions.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.Message#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see uml.interactions.Message#getArgument()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Argument();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.Message#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see uml.interactions.Message#getConnector()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Connector();

	/**
	 * Returns the meta object for the container reference '{@link uml.interactions.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interaction</em>'.
	 * @see uml.interactions.Message#getInteraction()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Interaction();

	/**
	 * Returns the meta object for the attribute '{@link uml.interactions.Message#getMessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Kind</em>'.
	 * @see uml.interactions.Message#getMessageKind()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageKind();

	/**
	 * Returns the meta object for the attribute '{@link uml.interactions.Message#getMessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Sort</em>'.
	 * @see uml.interactions.Message#getMessageSort()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageSort();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.Message#getReceiveEvent <em>Receive Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receive Event</em>'.
	 * @see uml.interactions.Message#getReceiveEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ReceiveEvent();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.Message#getSendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Send Event</em>'.
	 * @see uml.interactions.Message#getSendEvent()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_SendEvent();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.Message#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see uml.interactions.Message#getSignature()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Signature();

	/**
	 * Returns the meta object for the '{@link uml.interactions.Message#messageKind() <em>Message Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Message Kind</em>' operation.
	 * @see uml.interactions.Message#messageKind()
	 * @generated
	 */
	EOperation getMessage__MessageKind();

	/**
	 * Returns the meta object for class '{@link uml.interactions.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see uml.interactions.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.Interaction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see uml.interactions.Interaction#getAction()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.Interaction#getFormalGate <em>Formal Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Gate</em>'.
	 * @see uml.interactions.Interaction#getFormalGate()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_FormalGate();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.Interaction#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragment</em>'.
	 * @see uml.interactions.Interaction#getFragment()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Fragment();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.Interaction#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifeline</em>'.
	 * @see uml.interactions.Interaction#getLifeline()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Lifeline();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.Interaction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see uml.interactions.Interaction#getMessage()
	 * @see #getInteraction()
	 * @generated
	 */
	EReference getInteraction_Message();

	/**
	 * Returns the meta object for class '{@link uml.interactions.InteractionOperand <em>Interaction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Operand</em>'.
	 * @see uml.interactions.InteractionOperand
	 * @generated
	 */
	EClass getInteractionOperand();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.InteractionOperand#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragment</em>'.
	 * @see uml.interactions.InteractionOperand#getFragment()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EReference getInteractionOperand_Fragment();

	/**
	 * Returns the meta object for the containment reference '{@link uml.interactions.InteractionOperand#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see uml.interactions.InteractionOperand#getGuard()
	 * @see #getInteractionOperand()
	 * @generated
	 */
	EReference getInteractionOperand_Guard();

	/**
	 * Returns the meta object for class '{@link uml.interactions.InteractionConstraint <em>Interaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Constraint</em>'.
	 * @see uml.interactions.InteractionConstraint
	 * @generated
	 */
	EClass getInteractionConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link uml.interactions.InteractionConstraint#getMaxint <em>Maxint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maxint</em>'.
	 * @see uml.interactions.InteractionConstraint#getMaxint()
	 * @see #getInteractionConstraint()
	 * @generated
	 */
	EReference getInteractionConstraint_Maxint();

	/**
	 * Returns the meta object for the containment reference '{@link uml.interactions.InteractionConstraint#getMinint <em>Minint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Minint</em>'.
	 * @see uml.interactions.InteractionConstraint#getMinint()
	 * @see #getInteractionConstraint()
	 * @generated
	 */
	EReference getInteractionConstraint_Minint();

	/**
	 * Returns the meta object for class '{@link uml.interactions.GeneralOrdering <em>General Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Ordering</em>'.
	 * @see uml.interactions.GeneralOrdering
	 * @generated
	 */
	EClass getGeneralOrdering();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After</em>'.
	 * @see uml.interactions.GeneralOrdering#getAfter()
	 * @see #getGeneralOrdering()
	 * @generated
	 */
	EReference getGeneralOrdering_After();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before</em>'.
	 * @see uml.interactions.GeneralOrdering#getBefore()
	 * @see #getGeneralOrdering()
	 * @generated
	 */
	EReference getGeneralOrdering_Before();

	/**
	 * Returns the meta object for class '{@link uml.interactions.OccurrenceSpecification <em>Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence Specification</em>'.
	 * @see uml.interactions.OccurrenceSpecification
	 * @generated
	 */
	EClass getOccurrenceSpecification();

	/**
	 * Returns the meta object for the reference list '{@link uml.interactions.OccurrenceSpecification#getToAfter <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To After</em>'.
	 * @see uml.interactions.OccurrenceSpecification#getToAfter()
	 * @see #getOccurrenceSpecification()
	 * @generated
	 */
	EReference getOccurrenceSpecification_ToAfter();

	/**
	 * Returns the meta object for the reference list '{@link uml.interactions.OccurrenceSpecification#getToBefore <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Before</em>'.
	 * @see uml.interactions.OccurrenceSpecification#getToBefore()
	 * @see #getOccurrenceSpecification()
	 * @generated
	 */
	EReference getOccurrenceSpecification_ToBefore();

	/**
	 * Returns the meta object for class '{@link uml.interactions.BehaviorExecutionSpecification <em>Behavior Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Execution Specification</em>'.
	 * @see uml.interactions.BehaviorExecutionSpecification
	 * @generated
	 */
	EClass getBehaviorExecutionSpecification();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.BehaviorExecutionSpecification#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see uml.interactions.BehaviorExecutionSpecification#getBehavior()
	 * @see #getBehaviorExecutionSpecification()
	 * @generated
	 */
	EReference getBehaviorExecutionSpecification_Behavior();

	/**
	 * Returns the meta object for class '{@link uml.interactions.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Fragment</em>'.
	 * @see uml.interactions.CombinedFragment
	 * @generated
	 */
	EClass getCombinedFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.CombinedFragment#getCfragmentGate <em>Cfragment Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cfragment Gate</em>'.
	 * @see uml.interactions.CombinedFragment#getCfragmentGate()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_CfragmentGate();

	/**
	 * Returns the meta object for the attribute '{@link uml.interactions.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Operator</em>'.
	 * @see uml.interactions.CombinedFragment#getInteractionOperator()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EAttribute getCombinedFragment_InteractionOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.interactions.CombinedFragment#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operand</em>'.
	 * @see uml.interactions.CombinedFragment#getOperand()
	 * @see #getCombinedFragment()
	 * @generated
	 */
	EReference getCombinedFragment_Operand();

	/**
	 * Returns the meta object for class '{@link uml.interactions.ConsiderIgnoreFragment <em>Consider Ignore Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consider Ignore Fragment</em>'.
	 * @see uml.interactions.ConsiderIgnoreFragment
	 * @generated
	 */
	EClass getConsiderIgnoreFragment();

	/**
	 * Returns the meta object for the reference list '{@link uml.interactions.ConsiderIgnoreFragment#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see uml.interactions.ConsiderIgnoreFragment#getMessage()
	 * @see #getConsiderIgnoreFragment()
	 * @generated
	 */
	EReference getConsiderIgnoreFragment_Message();

	/**
	 * Returns the meta object for class '{@link uml.interactions.Continuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuation</em>'.
	 * @see uml.interactions.Continuation
	 * @generated
	 */
	EClass getContinuation();

	/**
	 * Returns the meta object for the attribute '{@link uml.interactions.Continuation#isSetting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setting</em>'.
	 * @see uml.interactions.Continuation#isSetting()
	 * @see #getContinuation()
	 * @generated
	 */
	EAttribute getContinuation_Setting();

	/**
	 * Returns the meta object for class '{@link uml.interactions.DestructionOccurrenceSpecification <em>Destruction Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destruction Occurrence Specification</em>'.
	 * @see uml.interactions.DestructionOccurrenceSpecification
	 * @generated
	 */
	EClass getDestructionOccurrenceSpecification();

	/**
	 * Returns the meta object for class '{@link uml.interactions.MessageOccurrenceSpecification <em>Message Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Occurrence Specification</em>'.
	 * @see uml.interactions.MessageOccurrenceSpecification
	 * @generated
	 */
	EClass getMessageOccurrenceSpecification();

	/**
	 * Returns the meta object for class '{@link uml.interactions.ExecutionOccurrenceSpecification <em>Execution Occurrence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Occurrence Specification</em>'.
	 * @see uml.interactions.ExecutionOccurrenceSpecification
	 * @generated
	 */
	EClass getExecutionOccurrenceSpecification();

	/**
	 * Returns the meta object for the reference '{@link uml.interactions.ExecutionOccurrenceSpecification#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution</em>'.
	 * @see uml.interactions.ExecutionOccurrenceSpecification#getExecution()
	 * @see #getExecutionOccurrenceSpecification()
	 * @generated
	 */
	EReference getExecutionOccurrenceSpecification_Execution();

	/**
	 * Returns the meta object for class '{@link uml.interactions.StateInvariant <em>State Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Invariant</em>'.
	 * @see uml.interactions.StateInvariant
	 * @generated
	 */
	EClass getStateInvariant();

	/**
	 * Returns the meta object for the containment reference '{@link uml.interactions.StateInvariant#getInvariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invariant</em>'.
	 * @see uml.interactions.StateInvariant#getInvariant()
	 * @see #getStateInvariant()
	 * @generated
	 */
	EReference getStateInvariant_Invariant();

	/**
	 * Returns the meta object for enum '{@link uml.interactions.MessageKind <em>Message Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Kind</em>'.
	 * @see uml.interactions.MessageKind
	 * @generated
	 */
	EEnum getMessageKind();

	/**
	 * Returns the meta object for enum '{@link uml.interactions.MessageSort <em>Message Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Sort</em>'.
	 * @see uml.interactions.MessageSort
	 * @generated
	 */
	EEnum getMessageSort();

	/**
	 * Returns the meta object for enum '{@link uml.interactions.InteractionOperatorKind <em>Interaction Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interaction Operator Kind</em>'.
	 * @see uml.interactions.InteractionOperatorKind
	 * @generated
	 */
	EEnum getInteractionOperatorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionsFactory getInteractionsFactory();

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
		 * The meta object literal for the '{@link uml.interactions.impl.ActionExecutionSpecificationImpl <em>Action Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.ActionExecutionSpecificationImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getActionExecutionSpecification()
		 * @generated
		 */
		EClass ACTION_EXECUTION_SPECIFICATION = eINSTANCE.getActionExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_EXECUTION_SPECIFICATION__ACTION = eINSTANCE.getActionExecutionSpecification_Action();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.ExecutionSpecificationImpl <em>Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.ExecutionSpecificationImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getExecutionSpecification()
		 * @generated
		 */
		EClass EXECUTION_SPECIFICATION = eINSTANCE.getExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_SPECIFICATION__FINISH = eINSTANCE.getExecutionSpecification_Finish();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_SPECIFICATION__START = eINSTANCE.getExecutionSpecification_Start();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.InteractionFragmentImpl <em>Interaction Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.InteractionFragmentImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionFragment()
		 * @generated
		 */
		EClass INTERACTION_FRAGMENT = eINSTANCE.getInteractionFragment();

		/**
		 * The meta object literal for the '<em><b>Covered</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__COVERED = eINSTANCE.getInteractionFragment_Covered();

		/**
		 * The meta object literal for the '<em><b>Enclosing Interaction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__ENCLOSING_INTERACTION = eINSTANCE.getInteractionFragment_EnclosingInteraction();

		/**
		 * The meta object literal for the '<em><b>Enclosing Operand</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__ENCLOSING_OPERAND = eINSTANCE.getInteractionFragment_EnclosingOperand();

		/**
		 * The meta object literal for the '<em><b>General Ordering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FRAGMENT__GENERAL_ORDERING = eINSTANCE.getInteractionFragment_GeneralOrdering();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.LifelineImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>Decomposed As</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__DECOMPOSED_AS = eINSTANCE.getLifeline_DecomposedAs();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__INTERACTION = eINSTANCE.getLifeline_Interaction();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__REPRESENTS = eINSTANCE.getLifeline_Represents();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__SELECTOR = eINSTANCE.getLifeline_Selector();

		/**
		 * The meta object literal for the '<em><b>Covered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFELINE__COVERED_BY = eINSTANCE.getLifeline_CoveredBy();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.PartDecompositionImpl <em>Part Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.PartDecompositionImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getPartDecomposition()
		 * @generated
		 */
		EClass PART_DECOMPOSITION = eINSTANCE.getPartDecomposition();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.InteractionUseImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionUse()
		 * @generated
		 */
		EClass INTERACTION_USE = eINSTANCE.getInteractionUse();

		/**
		 * The meta object literal for the '<em><b>Actual Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__ACTUAL_GATE = eINSTANCE.getInteractionUse_ActualGate();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__ARGUMENT = eINSTANCE.getInteractionUse_Argument();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__REFERS_TO = eINSTANCE.getInteractionUse_RefersTo();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__RETURN_VALUE = eINSTANCE.getInteractionUse_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Return Value Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_USE__RETURN_VALUE_RECIPIENT = eINSTANCE.getInteractionUse_ReturnValueRecipient();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.GateImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Is Outside Cf</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATE___IS_OUTSIDE_CF = eINSTANCE.getGate__IsOutsideCf();

		/**
		 * The meta object literal for the '<em><b>Is Inside Cf</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATE___IS_INSIDE_CF = eINSTANCE.getGate__IsInsideCf();

		/**
		 * The meta object literal for the '<em><b>Is Actual</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATE___IS_ACTUAL = eINSTANCE.getGate__IsActual();

		/**
		 * The meta object literal for the '<em><b>Is Formal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATE___IS_FORMAL = eINSTANCE.getGate__IsFormal();

		/**
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATE___GET_NAME = eINSTANCE.getGate__GetName();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATE___MATCHES__GATE = eINSTANCE.getGate__Matches__Gate();

		/**
		 * The meta object literal for the '<em><b>Get Operand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATE___GET_OPERAND = eINSTANCE.getGate__GetOperand();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.MessageEndImpl <em>Message End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.MessageEndImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getMessageEnd()
		 * @generated
		 */
		EClass MESSAGE_END = eINSTANCE.getMessageEnd();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_END__MESSAGE = eINSTANCE.getMessageEnd_Message();

		/**
		 * The meta object literal for the '<em><b>Opposite End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_END___OPPOSITE_END = eINSTANCE.getMessageEnd__OppositeEnd();

		/**
		 * The meta object literal for the '<em><b>Is Send</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_END___IS_SEND = eINSTANCE.getMessageEnd__IsSend();

		/**
		 * The meta object literal for the '<em><b>Is Receive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_END___IS_RECEIVE = eINSTANCE.getMessageEnd__IsReceive();

		/**
		 * The meta object literal for the '<em><b>Enclosing Fragment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_END___ENCLOSING_FRAGMENT = eINSTANCE.getMessageEnd__EnclosingFragment();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.MessageImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ARGUMENT = eINSTANCE.getMessage_Argument();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__CONNECTOR = eINSTANCE.getMessage_Connector();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__INTERACTION = eINSTANCE.getMessage_Interaction();

		/**
		 * The meta object literal for the '<em><b>Message Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_KIND = eINSTANCE.getMessage_MessageKind();

		/**
		 * The meta object literal for the '<em><b>Message Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_SORT = eINSTANCE.getMessage_MessageSort();

		/**
		 * The meta object literal for the '<em><b>Receive Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__RECEIVE_EVENT = eINSTANCE.getMessage_ReceiveEvent();

		/**
		 * The meta object literal for the '<em><b>Send Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SEND_EVENT = eINSTANCE.getMessage_SendEvent();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SIGNATURE = eINSTANCE.getMessage_Signature();

		/**
		 * The meta object literal for the '<em><b>Message Kind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE___MESSAGE_KIND = eINSTANCE.getMessage__MessageKind();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.InteractionImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__ACTION = eINSTANCE.getInteraction_Action();

		/**
		 * The meta object literal for the '<em><b>Formal Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FORMAL_GATE = eINSTANCE.getInteraction_FormalGate();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__FRAGMENT = eINSTANCE.getInteraction_Fragment();

		/**
		 * The meta object literal for the '<em><b>Lifeline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__LIFELINE = eINSTANCE.getInteraction_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION__MESSAGE = eINSTANCE.getInteraction_Message();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.InteractionOperandImpl <em>Interaction Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.InteractionOperandImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionOperand()
		 * @generated
		 */
		EClass INTERACTION_OPERAND = eINSTANCE.getInteractionOperand();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OPERAND__FRAGMENT = eINSTANCE.getInteractionOperand_Fragment();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_OPERAND__GUARD = eINSTANCE.getInteractionOperand_Guard();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.InteractionConstraintImpl <em>Interaction Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.InteractionConstraintImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionConstraint()
		 * @generated
		 */
		EClass INTERACTION_CONSTRAINT = eINSTANCE.getInteractionConstraint();

		/**
		 * The meta object literal for the '<em><b>Maxint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_CONSTRAINT__MAXINT = eINSTANCE.getInteractionConstraint_Maxint();

		/**
		 * The meta object literal for the '<em><b>Minint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_CONSTRAINT__MININT = eINSTANCE.getInteractionConstraint_Minint();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.GeneralOrderingImpl <em>General Ordering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.GeneralOrderingImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getGeneralOrdering()
		 * @generated
		 */
		EClass GENERAL_ORDERING = eINSTANCE.getGeneralOrdering();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_ORDERING__AFTER = eINSTANCE.getGeneralOrdering_After();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_ORDERING__BEFORE = eINSTANCE.getGeneralOrdering_Before();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.OccurrenceSpecificationImpl <em>Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.OccurrenceSpecificationImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getOccurrenceSpecification()
		 * @generated
		 */
		EClass OCCURRENCE_SPECIFICATION = eINSTANCE.getOccurrenceSpecification();

		/**
		 * The meta object literal for the '<em><b>To After</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURRENCE_SPECIFICATION__TO_AFTER = eINSTANCE.getOccurrenceSpecification_ToAfter();

		/**
		 * The meta object literal for the '<em><b>To Before</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURRENCE_SPECIFICATION__TO_BEFORE = eINSTANCE.getOccurrenceSpecification_ToBefore();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.BehaviorExecutionSpecificationImpl <em>Behavior Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.BehaviorExecutionSpecificationImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getBehaviorExecutionSpecification()
		 * @generated
		 */
		EClass BEHAVIOR_EXECUTION_SPECIFICATION = eINSTANCE.getBehaviorExecutionSpecification();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR = eINSTANCE.getBehaviorExecutionSpecification_Behavior();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.CombinedFragmentImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getCombinedFragment()
		 * @generated
		 */
		EClass COMBINED_FRAGMENT = eINSTANCE.getCombinedFragment();

		/**
		 * The meta object literal for the '<em><b>Cfragment Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__CFRAGMENT_GATE = eINSTANCE.getCombinedFragment_CfragmentGate();

		/**
		 * The meta object literal for the '<em><b>Interaction Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBINED_FRAGMENT__INTERACTION_OPERATOR = eINSTANCE.getCombinedFragment_InteractionOperator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_FRAGMENT__OPERAND = eINSTANCE.getCombinedFragment_Operand();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.ConsiderIgnoreFragmentImpl <em>Consider Ignore Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.ConsiderIgnoreFragmentImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getConsiderIgnoreFragment()
		 * @generated
		 */
		EClass CONSIDER_IGNORE_FRAGMENT = eINSTANCE.getConsiderIgnoreFragment();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSIDER_IGNORE_FRAGMENT__MESSAGE = eINSTANCE.getConsiderIgnoreFragment_Message();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.ContinuationImpl <em>Continuation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.ContinuationImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getContinuation()
		 * @generated
		 */
		EClass CONTINUATION = eINSTANCE.getContinuation();

		/**
		 * The meta object literal for the '<em><b>Setting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUATION__SETTING = eINSTANCE.getContinuation_Setting();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.DestructionOccurrenceSpecificationImpl <em>Destruction Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.DestructionOccurrenceSpecificationImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getDestructionOccurrenceSpecification()
		 * @generated
		 */
		EClass DESTRUCTION_OCCURRENCE_SPECIFICATION = eINSTANCE.getDestructionOccurrenceSpecification();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.MessageOccurrenceSpecificationImpl <em>Message Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.MessageOccurrenceSpecificationImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getMessageOccurrenceSpecification()
		 * @generated
		 */
		EClass MESSAGE_OCCURRENCE_SPECIFICATION = eINSTANCE.getMessageOccurrenceSpecification();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.ExecutionOccurrenceSpecificationImpl <em>Execution Occurrence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.ExecutionOccurrenceSpecificationImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getExecutionOccurrenceSpecification()
		 * @generated
		 */
		EClass EXECUTION_OCCURRENCE_SPECIFICATION = eINSTANCE.getExecutionOccurrenceSpecification();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION = eINSTANCE.getExecutionOccurrenceSpecification_Execution();

		/**
		 * The meta object literal for the '{@link uml.interactions.impl.StateInvariantImpl <em>State Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.impl.StateInvariantImpl
		 * @see uml.interactions.impl.InteractionsPackageImpl#getStateInvariant()
		 * @generated
		 */
		EClass STATE_INVARIANT = eINSTANCE.getStateInvariant();

		/**
		 * The meta object literal for the '<em><b>Invariant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_INVARIANT__INVARIANT = eINSTANCE.getStateInvariant_Invariant();

		/**
		 * The meta object literal for the '{@link uml.interactions.MessageKind <em>Message Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.MessageKind
		 * @see uml.interactions.impl.InteractionsPackageImpl#getMessageKind()
		 * @generated
		 */
		EEnum MESSAGE_KIND = eINSTANCE.getMessageKind();

		/**
		 * The meta object literal for the '{@link uml.interactions.MessageSort <em>Message Sort</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.MessageSort
		 * @see uml.interactions.impl.InteractionsPackageImpl#getMessageSort()
		 * @generated
		 */
		EEnum MESSAGE_SORT = eINSTANCE.getMessageSort();

		/**
		 * The meta object literal for the '{@link uml.interactions.InteractionOperatorKind <em>Interaction Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.interactions.InteractionOperatorKind
		 * @see uml.interactions.impl.InteractionsPackageImpl#getInteractionOperatorKind()
		 * @generated
		 */
		EEnum INTERACTION_OPERATOR_KIND = eINSTANCE.getInteractionOperatorKind();

	}

} //InteractionsPackage
