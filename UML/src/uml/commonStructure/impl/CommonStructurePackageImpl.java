/**
 */
package uml.commonStructure.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import types.TypesPackage;

import types.impl.TypesPackageImpl;

import uml.actions.ActionsPackage;

import uml.actions.impl.ActionsPackageImpl;

import uml.activities.ActivitiesPackage;

import uml.activities.impl.ActivitiesPackageImpl;

import uml.classification.ClassificationPackage;

import uml.classification.impl.ClassificationPackageImpl;

import uml.commonBehavior.CommonBehaviorPackage;

import uml.commonBehavior.impl.CommonBehaviorPackageImpl;

import uml.commonStructure.Abstraction;
import uml.commonStructure.Comment;
import uml.commonStructure.CommonStructureFactory;
import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Constraint;
import uml.commonStructure.Dependency;
import uml.commonStructure.DirectedRelationship;
import uml.commonStructure.Element;
import uml.commonStructure.ElementImport;
import uml.commonStructure.MultiplicityElement;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.PackageImport;
import uml.commonStructure.PackageableElement;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.Realization;
import uml.commonStructure.Relationship;
import uml.commonStructure.TemplateBinding;
import uml.commonStructure.TemplateParameter;
import uml.commonStructure.TemplateParameterSubstitution;
import uml.commonStructure.TemplateSignature;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.Type;
import uml.commonStructure.TypedElement;
import uml.commonStructure.Usage;
import uml.commonStructure.VisibilityKind;

import uml.commonStructure.util.CommonStructureValidator;

import uml.deployments.DeploymentsPackage;

import uml.deployments.impl.DeploymentsPackageImpl;

import uml.informationFlows.InformationFlowsPackage;

import uml.informationFlows.impl.InformationFlowsPackageImpl;

import uml.interactions.InteractionsPackage;

import uml.interactions.impl.InteractionsPackageImpl;

import uml.packages.PackagesPackage;

import uml.packages.impl.PackagesPackageImpl;

import uml.simpleClassifiers.SimpleClassifiersPackage;

import uml.simpleClassifiers.impl.SimpleClassifiersPackageImpl;

import uml.stateMachines.StateMachinesPackage;

import uml.stateMachines.impl.StateMachinesPackageImpl;

import uml.structuredClassifiers.StructuredClassifiersPackage;

import uml.structuredClassifiers.impl.StructuredClassifiersPackageImpl;

import uml.useCases.UseCasesPackage;

import uml.useCases.impl.UseCasesPackageImpl;

import uml.values.ValuesPackage;

import uml.values.impl.ValuesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonStructurePackageImpl extends EPackageImpl implements CommonStructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uml.commonStructure.CommonStructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonStructurePackageImpl() {
		super(eNS_URI, CommonStructureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommonStructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonStructurePackage init() {
		if (isInited) return (CommonStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI);

		// Obtain or create and register package
		CommonStructurePackageImpl theCommonStructurePackage = (CommonStructurePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonStructurePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonStructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		CommonBehaviorPackageImpl theCommonBehaviorPackage = (CommonBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) instanceof CommonBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) : CommonBehaviorPackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		StructuredClassifiersPackageImpl theStructuredClassifiersPackage = (StructuredClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI) instanceof StructuredClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI) : StructuredClassifiersPackage.eINSTANCE);
		SimpleClassifiersPackageImpl theSimpleClassifiersPackage = (SimpleClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI) instanceof SimpleClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI) : SimpleClassifiersPackage.eINSTANCE);
		ClassificationPackageImpl theClassificationPackage = (ClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) instanceof ClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) : ClassificationPackage.eINSTANCE);
		DeploymentsPackageImpl theDeploymentsPackage = (DeploymentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentsPackage.eNS_URI) instanceof DeploymentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentsPackage.eNS_URI) : DeploymentsPackage.eINSTANCE);
		StateMachinesPackageImpl theStateMachinesPackage = (StateMachinesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI) instanceof StateMachinesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI) : StateMachinesPackage.eINSTANCE);
		UseCasesPackageImpl theUseCasesPackage = (UseCasesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) instanceof UseCasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) : UseCasesPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		InteractionsPackageImpl theInteractionsPackage = (InteractionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) instanceof InteractionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) : InteractionsPackage.eINSTANCE);
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) : InformationFlowsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonStructurePackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCommonBehaviorPackage.createPackageContents();
		theValuesPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theStructuredClassifiersPackage.createPackageContents();
		theSimpleClassifiersPackage.createPackageContents();
		theClassificationPackage.createPackageContents();
		theDeploymentsPackage.createPackageContents();
		theStateMachinesPackage.createPackageContents();
		theUseCasesPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theInteractionsPackage.createPackageContents();
		theInformationFlowsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theCommonStructurePackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCommonBehaviorPackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theStructuredClassifiersPackage.initializePackageContents();
		theSimpleClassifiersPackage.initializePackageContents();
		theClassificationPackage.initializePackageContents();
		theDeploymentsPackage.initializePackageContents();
		theStateMachinesPackage.initializePackageContents();
		theUseCasesPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theInteractionsPackage.initializePackageContents();
		theInformationFlowsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCommonStructurePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CommonStructureValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCommonStructurePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonStructurePackage.eNS_URI, theCommonStructurePackage);
		return theCommonStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstraction() {
		return abstractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstraction_Mapping() {
		return (EReference)abstractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Client() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Supplier() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedRelationship() {
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Source() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Target() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_RelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedComment() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Owner() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__AllOwnedElements() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__MustBeOwned() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_AnnotatedElement() {
		return (EReference)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_NameExpression() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_Namespace() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_QualifiedName() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Visibility() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ClientDependency() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__AllNamespaces() {
		return namedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__AllOwningPackages() {
		return namedElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__IsDistinguishableFrom__NamedElement_Namespace() {
		return namedElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__QualifiedName() {
		return namedElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__Separator() {
		return namedElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__ClientDependency() {
		return namedElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Package() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getType__ConformsTo__Type() {
		return typeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization() {
		return realizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ElementImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ImportedMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Member() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedRule() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_PackageImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__ExcludeCollisions__EList() {
		return namespaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__GetNamesOfMember__NamedElement() {
		return namespaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__ImportMembers__EList() {
		return namespaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__ImportedMember() {
		return namespaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__MembersAreDistinguishable() {
		return namespaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementImport() {
		return elementImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Alias() {
		return (EAttribute)elementImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportedElement() {
		return (EReference)elementImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Visibility() {
		return (EAttribute)elementImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportingNamespace() {
		return (EReference)elementImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementImport__GetName() {
		return elementImportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstrainedElement() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Specification() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Context() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImport() {
		return packageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportedPackage() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageImport_Visibility() {
		return (EAttribute)packageImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportingNamespace() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsOrdered() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsUnique() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Lower() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_LowerValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Upper() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_UpperValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__CompatibleWith__MultiplicityElement() {
		return multiplicityElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__IncludesMultiplicity__MultiplicityElement() {
		return multiplicityElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__Is__int_int() {
		return multiplicityElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__IsMultivalued() {
		return multiplicityElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__Lower() {
		return multiplicityElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__LowerBound() {
		return multiplicityElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__Upper() {
		return multiplicityElementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__UpperBound() {
		return multiplicityElementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterableElement() {
		return parameterableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterableElement_OwningTemplateParameter() {
		return (EReference)parameterableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterableElement_TemplateParameter() {
		return (EReference)parameterableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterableElement__IsCompatibleWith__ParameterableElement() {
		return parameterableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterableElement__IsTemplateParameter() {
		return parameterableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameter() {
		return templateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_Default() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedDefault() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_ParameteredElement() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_Signature() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedParameteredElement() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSignature() {
		return templateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_Parameter() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_Template() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_OwnedParameter() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateableElement() {
		return templateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_TemplateBinding() {
		return (EReference)templateableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_OwnedTemplateSignature() {
		return (EReference)templateableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateableElement__IsTemplate() {
		return templateableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateableElement__ParameterableElements() {
		return templateableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateBinding() {
		return templateBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_ParameterSubstitution() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_Signature() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_BoundElement() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameterSubstitution() {
		return templateParameterSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_Actual() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_Formal() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_OwnedActual() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_TemplateBinding() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsage() {
		return usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElement() {
		return packageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonStructureFactory getCommonStructureFactory() {
		return (CommonStructureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractionEClass = createEClass(ABSTRACTION);
		createEReference(abstractionEClass, ABSTRACTION__MAPPING);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__CLIENT);
		createEReference(dependencyEClass, DEPENDENCY__SUPPLIER);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_COMMENT);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNER);
		createEOperation(elementEClass, ELEMENT___ALL_OWNED_ELEMENTS);
		createEOperation(elementEClass, ELEMENT___MUST_BE_OWNED);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__ANNOTATED_ELEMENT);
		createEAttribute(commentEClass, COMMENT__BODY);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAME_EXPRESSION);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAMESPACE);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__QUALIFIED_NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__VISIBILITY);
		createEReference(namedElementEClass, NAMED_ELEMENT__CLIENT_DEPENDENCY);
		createEOperation(namedElementEClass, NAMED_ELEMENT___ALL_NAMESPACES);
		createEOperation(namedElementEClass, NAMED_ELEMENT___ALL_OWNING_PACKAGES);
		createEOperation(namedElementEClass, NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE);
		createEOperation(namedElementEClass, NAMED_ELEMENT___QUALIFIED_NAME);
		createEOperation(namedElementEClass, NAMED_ELEMENT___SEPARATOR);
		createEOperation(namedElementEClass, NAMED_ELEMENT___CLIENT_DEPENDENCY);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__PACKAGE);
		createEOperation(typeEClass, TYPE___CONFORMS_TO__TYPE);

		realizationEClass = createEClass(REALIZATION);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__ELEMENT_IMPORT);
		createEReference(namespaceEClass, NAMESPACE__IMPORTED_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__MEMBER);
		createEReference(namespaceEClass, NAMESPACE__OWNED_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__OWNED_RULE);
		createEReference(namespaceEClass, NAMESPACE__PACKAGE_IMPORT);
		createEOperation(namespaceEClass, NAMESPACE___EXCLUDE_COLLISIONS__ELIST);
		createEOperation(namespaceEClass, NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT);
		createEOperation(namespaceEClass, NAMESPACE___IMPORT_MEMBERS__ELIST);
		createEOperation(namespaceEClass, NAMESPACE___IMPORTED_MEMBER);
		createEOperation(namespaceEClass, NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE);

		elementImportEClass = createEClass(ELEMENT_IMPORT);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__ALIAS);
		createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTED_ELEMENT);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__VISIBILITY);
		createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		createEOperation(elementImportEClass, ELEMENT_IMPORT___GET_NAME);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINED_ELEMENT);
		createEReference(constraintEClass, CONSTRAINT__SPECIFICATION);
		createEReference(constraintEClass, CONSTRAINT__CONTEXT);

		packageImportEClass = createEClass(PACKAGE_IMPORT);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTED_PACKAGE);
		createEAttribute(packageImportEClass, PACKAGE_IMPORT__VISIBILITY);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTING_NAMESPACE);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_ORDERED);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_UNIQUE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER_VALUE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER_VALUE);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___IS__INT_INT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___IS_MULTIVALUED);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___LOWER);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___LOWER_BOUND);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___UPPER);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___UPPER_BOUND);

		parameterableElementEClass = createEClass(PARAMETERABLE_ELEMENT);
		createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER);
		createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);
		createEOperation(parameterableElementEClass, PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT);
		createEOperation(parameterableElementEClass, PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER);

		templateParameterEClass = createEClass(TEMPLATE_PARAMETER);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__DEFAULT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__OWNED_DEFAULT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__SIGNATURE);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);

		templateSignatureEClass = createEClass(TEMPLATE_SIGNATURE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__PARAMETER);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__TEMPLATE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__OWNED_PARAMETER);

		templateableElementEClass = createEClass(TEMPLATEABLE_ELEMENT);
		createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);
		createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
		createEOperation(templateableElementEClass, TEMPLATEABLE_ELEMENT___IS_TEMPLATE);
		createEOperation(templateableElementEClass, TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS);

		templateBindingEClass = createEClass(TEMPLATE_BINDING);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__SIGNATURE);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__BOUND_ELEMENT);

		templateParameterSubstitutionEClass = createEClass(TEMPLATE_PARAMETER_SUBSTITUTION);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);

		usageEClass = createEClass(USAGE);

		packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		PackagesPackage thePackagesPackage = (PackagesPackage)EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractionEClass.getESuperTypes().add(this.getDependency());
		dependencyEClass.getESuperTypes().add(this.getPackageableElement());
		dependencyEClass.getESuperTypes().add(this.getDirectedRelationship());
		directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		commentEClass.getESuperTypes().add(this.getElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		typeEClass.getESuperTypes().add(this.getPackageableElement());
		realizationEClass.getESuperTypes().add(this.getAbstraction());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());
		elementImportEClass.getESuperTypes().add(this.getDirectedRelationship());
		constraintEClass.getESuperTypes().add(this.getPackageableElement());
		packageImportEClass.getESuperTypes().add(this.getDirectedRelationship());
		multiplicityElementEClass.getESuperTypes().add(this.getElement());
		parameterableElementEClass.getESuperTypes().add(this.getElement());
		templateParameterEClass.getESuperTypes().add(this.getElement());
		templateSignatureEClass.getESuperTypes().add(this.getElement());
		templateableElementEClass.getESuperTypes().add(this.getElement());
		templateBindingEClass.getESuperTypes().add(this.getDirectedRelationship());
		templateParameterSubstitutionEClass.getESuperTypes().add(this.getElement());
		usageEClass.getESuperTypes().add(this.getDependency());
		packageableElementEClass.getESuperTypes().add(this.getNamedElement());
		packageableElementEClass.getESuperTypes().add(this.getParameterableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractionEClass, Abstraction.class, "Abstraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstraction_Mapping(), theValuesPackage.getOpaqueExpression(), null, "mapping", null, 0, 1, Abstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Client(), this.getNamedElement(), this.getNamedElement_ClientDependency(), "client", null, 1, -1, Dependency.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDependency_Supplier(), this.getNamedElement(), null, "supplier", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectedRelationship_Source(), this.getElement(), null, "source", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDirectedRelationship_Target(), this.getElement(), null, "target", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 1, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwnedComment(), this.getComment(), null, "ownedComment", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getElement__AllOwnedElements(), this.getElement(), "allOwnedElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__MustBeOwned(), theTypesPackage.getBoolean(), "mustBeOwned", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 0, -1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComment_Body(), theTypesPackage.getString(), "body", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theTypesPackage.getString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_NameExpression(), theValuesPackage.getStringExpression(), null, "nameExpression", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_Namespace(), this.getNamespace(), this.getNamespace_OwnedMember(), "namespace", null, 0, 1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_QualifiedName(), theTypesPackage.getString(), "qualifiedName", null, 0, 1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_ClientDependency(), this.getDependency(), this.getDependency_Client(), "clientDependency", null, 0, -1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getNamedElement__AllNamespaces(), this.getNamespace(), "allNamespaces", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNamedElement__AllOwningPackages(), thePackagesPackage.getPackage(), "allOwningPackages", 0, -1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getNamedElement__IsDistinguishableFrom__NamedElement_Namespace(), theTypesPackage.getBoolean(), "isDistinguishableFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "n", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamespace(), "ns", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__QualifiedName(), theTypesPackage.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__Separator(), theTypesPackage.getString(), "separator", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__ClientDependency(), this.getDependency(), "clientDependency", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Package(), thePackagesPackage.getPackage(), thePackagesPackage.getPackage_OwnedType(), "package", null, 0, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getType__ConformsTo__Type(), theTypesPackage.getBoolean(), "conformsTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_ElementImport(), this.getElementImport(), this.getElementImport_ImportingNamespace(), "elementImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_ImportedMember(), this.getPackageableElement(), null, "importedMember", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_Member(), this.getNamedElement(), null, "member", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_OwnedMember(), this.getNamedElement(), this.getNamedElement_Namespace(), "ownedMember", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_OwnedRule(), this.getConstraint(), this.getConstraint_Context(), "ownedRule", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_PackageImport(), this.getPackageImport(), this.getPackageImport_ImportingNamespace(), "packageImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getNamespace__ExcludeCollisions__EList(), this.getPackageableElement(), "excludeCollisions", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "imps", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__GetNamesOfMember__NamedElement(), theTypesPackage.getString(), "getNamesOfMember", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__ImportMembers__EList(), this.getPackageableElement(), "importMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "imps", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamespace__ImportedMember(), this.getPackageableElement(), "importedMember", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamespace__MembersAreDistinguishable(), theTypesPackage.getBoolean(), "membersAreDistinguishable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(elementImportEClass, ElementImport.class, "ElementImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementImport_Alias(), theTypesPackage.getString(), "alias", null, 0, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementImport_ImportedElement(), this.getPackageableElement(), null, "importedElement", null, 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_ElementImport(), "importingNamespace", null, 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getElementImport__GetName(), theTypesPackage.getString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_ConstrainedElement(), this.getElement(), null, "constrainedElement", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Specification(), theValuesPackage.getValueSpecification(), null, "specification", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_Context(), this.getNamespace(), this.getNamespace_OwnedRule(), "context", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(packageImportEClass, PackageImport.class, "PackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageImport_ImportedPackage(), thePackagesPackage.getPackage(), null, "importedPackage", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPackageImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_PackageImport(), "importingNamespace", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_IsOrdered(), theTypesPackage.getBoolean(), "isOrdered", "false", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_IsUnique(), theTypesPackage.getBoolean(), "isUnique", "true", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_Lower(), theTypesPackage.getInteger(), "lower", null, 0, 1, MultiplicityElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityElement_LowerValue(), theValuesPackage.getValueSpecification(), null, "lowerValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_Upper(), theTypesPackage.getUnlimitedNatural(), "upper", null, 1, 1, MultiplicityElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityElement_UpperValue(), theValuesPackage.getValueSpecification(), null, "upperValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__CompatibleWith__MultiplicityElement(), theTypesPackage.getBoolean(), "compatibleWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMultiplicityElement(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__IncludesMultiplicity__MultiplicityElement(), theTypesPackage.getBoolean(), "includesMultiplicity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMultiplicityElement(), "m", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__Is__int_int(), theTypesPackage.getBoolean(), "is", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "lowerbound", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getUnlimitedNatural(), "upperbound", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__IsMultivalued(), theTypesPackage.getBoolean(), "isMultivalued", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__Lower(), theTypesPackage.getInteger(), "lower", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__LowerBound(), theTypesPackage.getInteger(), "lowerBound", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__Upper(), theTypesPackage.getUnlimitedNatural(), "upper", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__UpperBound(), theTypesPackage.getUnlimitedNatural(), "upperBound", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(parameterableElementEClass, ParameterableElement.class, "ParameterableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterableElement_OwningTemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_OwnedParameteredElement(), "owningTemplateParameter", null, 0, 1, ParameterableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterableElement_TemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_ParameteredElement(), "templateParameter", null, 0, 1, ParameterableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParameterableElement__IsCompatibleWith__ParameterableElement(), theTypesPackage.getBoolean(), "isCompatibleWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getParameterableElement(), "p", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getParameterableElement__IsTemplateParameter(), theTypesPackage.getBoolean(), "isTemplateParameter", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateParameterEClass, TemplateParameter.class, "TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateParameter_Default(), this.getParameterableElement(), null, "default", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter_OwnedDefault(), this.getParameterableElement(), null, "ownedDefault", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter_ParameteredElement(), this.getParameterableElement(), this.getParameterableElement_TemplateParameter(), "parameteredElement", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter_Signature(), this.getTemplateSignature(), this.getTemplateSignature_OwnedParameter(), "signature", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter_OwnedParameteredElement(), this.getParameterableElement(), this.getParameterableElement_OwningTemplateParameter(), "ownedParameteredElement", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(templateSignatureEClass, TemplateSignature.class, "TemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateSignature_Parameter(), this.getTemplateParameter(), null, "parameter", null, 1, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateSignature_Template(), this.getTemplateableElement(), this.getTemplateableElement_OwnedTemplateSignature(), "template", null, 1, 1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateSignature_OwnedParameter(), this.getTemplateParameter(), this.getTemplateParameter_Signature(), "ownedParameter", null, 0, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateableElementEClass, TemplateableElement.class, "TemplateableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateableElement_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_BoundElement(), "templateBinding", null, 0, -1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateableElement_OwnedTemplateSignature(), this.getTemplateSignature(), this.getTemplateSignature_Template(), "ownedTemplateSignature", null, 0, 1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTemplateableElement__IsTemplate(), theTypesPackage.getBoolean(), "isTemplate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTemplateableElement__ParameterableElements(), this.getParameterableElement(), "parameterableElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateBindingEClass, TemplateBinding.class, "TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateBinding_ParameterSubstitution(), this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_TemplateBinding(), "parameterSubstitution", null, 0, -1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateBinding_Signature(), this.getTemplateSignature(), null, "signature", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateBinding_BoundElement(), this.getTemplateableElement(), this.getTemplateableElement_TemplateBinding(), "boundElement", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(templateParameterSubstitutionEClass, TemplateParameterSubstitution.class, "TemplateParameterSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateParameterSubstitution_Actual(), this.getParameterableElement(), null, "actual", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterSubstitution_Formal(), this.getTemplateParameter(), null, "formal", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterSubstitution_OwnedActual(), this.getParameterableElement(), null, "ownedActual", null, 0, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterSubstitution_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_ParameterSubstitution(), "templateBinding", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// subsets
		createSubsetsAnnotations();
		// union
		createUnionAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// duplicates
		createDuplicatesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "CommonStructure"
		   });	
		addAnnotation
		  ((getMultiplicityElement__IncludesMultiplicity__MultiplicityElement()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "originalName", "M"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (elementEClass, 
		   source, 
		   new String[] {
			 "constraints", "has_owner not_own_self"
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "visibility_needs_ownership has_qualified_name has_no_qualified_name"
		   });	
		addAnnotation
		  (namespaceEClass, 
		   source, 
		   new String[] {
			 "constraints", "members_distinguishable cannot_import_self cannot_import_ownedMembers"
		   });	
		addAnnotation
		  (elementImportEClass, 
		   source, 
		   new String[] {
			 "constraints", "imported_element_is_public visibility_public_or_private"
		   });	
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "constraints", "boolean_value no_side_effects not_apply_to_self"
		   });	
		addAnnotation
		  (packageImportEClass, 
		   source, 
		   new String[] {
			 "constraints", "public_or_private"
		   });	
		addAnnotation
		  (multiplicityElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "upper_ge_lower lower_ge_0 value_specification_no_side_effects value_specification_constant lower_is_integer upper_is_unlimitedNatural"
		   });	
		addAnnotation
		  (templateParameterEClass, 
		   source, 
		   new String[] {
			 "constraints", "must_be_compatible"
		   });	
		addAnnotation
		  (templateSignatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "own_elements unique_parameters"
		   });	
		addAnnotation
		  (templateBindingEClass, 
		   source, 
		   new String[] {
			 "constraints", "parameter_substitution_formal one_parameter_substitution"
		   });	
		addAnnotation
		  (templateParameterSubstitutionEClass, 
		   source, 
		   new String[] {
			 "constraints", "must_be_compatible"
		   });	
		addAnnotation
		  (packageableElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "namespace_needs_visibility"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";	
		addAnnotation
		  (getAbstraction_Mapping(), 
		   source, 
		   new String[] {
			 "body", "abstraction"
		   });	
		addAnnotation
		  (getDependency_Supplier(), 
		   source, 
		   new String[] {
			 "body", "supplierDependency"
		   });	
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
			 "body", "directedRelationship"
		   });	
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
			 "body", "directedRelationship"
		   });	
		addAnnotation
		  (getRelationship_RelatedElement(), 
		   source, 
		   new String[] {
			 "body", "relationship"
		   });	
		addAnnotation
		  (getElement_OwnedComment(), 
		   source, 
		   new String[] {
			 "body", "owningElement"
		   });	
		addAnnotation
		  (getComment_AnnotatedElement(), 
		   source, 
		   new String[] {
			 "body", "comment"
		   });	
		addAnnotation
		  (getNamedElement_NameExpression(), 
		   source, 
		   new String[] {
			 "body", "namedElement"
		   });	
		addAnnotation
		  (getTypedElement_Type(), 
		   source, 
		   new String[] {
			 "body", "typedElement"
		   });	
		addAnnotation
		  (getNamespace_ImportedMember(), 
		   source, 
		   new String[] {
			 "body", "namespace"
		   });	
		addAnnotation
		  (getNamespace_Member(), 
		   source, 
		   new String[] {
			 "body", "memberNamespace"
		   });	
		addAnnotation
		  (getElementImport_ImportedElement(), 
		   source, 
		   new String[] {
			 "body", "import"
		   });	
		addAnnotation
		  (getConstraint_ConstrainedElement(), 
		   source, 
		   new String[] {
			 "body", "constraint"
		   });	
		addAnnotation
		  (getConstraint_Specification(), 
		   source, 
		   new String[] {
			 "body", "owningConstraint"
		   });	
		addAnnotation
		  (getPackageImport_ImportedPackage(), 
		   source, 
		   new String[] {
			 "body", "packageImport"
		   });	
		addAnnotation
		  (getMultiplicityElement_LowerValue(), 
		   source, 
		   new String[] {
			 "body", "owningLower"
		   });	
		addAnnotation
		  (getMultiplicityElement_UpperValue(), 
		   source, 
		   new String[] {
			 "body", "owningUpper"
		   });	
		addAnnotation
		  (getTemplateParameter_Default(), 
		   source, 
		   new String[] {
			 "body", "templateParameter"
		   });	
		addAnnotation
		  (getTemplateParameter_OwnedDefault(), 
		   source, 
		   new String[] {
			 "body", "templateParameter"
		   });	
		addAnnotation
		  (getTemplateSignature_Parameter(), 
		   source, 
		   new String[] {
			 "body", "templateSignature"
		   });	
		addAnnotation
		  (getTemplateBinding_Signature(), 
		   source, 
		   new String[] {
			 "body", "templateBinding"
		   });	
		addAnnotation
		  (getTemplateParameterSubstitution_Actual(), 
		   source, 
		   new String[] {
			 "body", "templateParameterSubstitution"
		   });	
		addAnnotation
		  (getTemplateParameterSubstitution_Formal(), 
		   source, 
		   new String[] {
			 "body", "templateParameterSubstitution"
		   });	
		addAnnotation
		  (getTemplateParameterSubstitution_OwnedActual(), 
		   source, 
		   new String[] {
			 "body", "owningTemplateParameterSubstitution"
		   });
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";	
		addAnnotation
		  (getAbstraction_Mapping(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDependency_Client(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDependency_Supplier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElement_OwnedComment(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamedElement_NameExpression(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamedElement_Namespace(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_ElementImport(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_ImportedMember(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_OwnedMember(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_OwnedRule(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_PackageImport(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElementImport_ImportedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElementImport_ImportingNamespace(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConstraint_Specification(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConstraint_Context(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackageImport_ImportedPackage(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackageImport_ImportingNamespace(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_LowerValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_UpperValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getParameterableElement_OwningTemplateParameter(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateParameter_OwnedDefault(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateParameter_Signature(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateParameter_OwnedParameteredElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateSignature_Template(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateSignature_OwnedParameter(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateableElement_TemplateBinding(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateableElement_OwnedTemplateSignature(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateBinding_ParameterSubstitution(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateBinding_Signature(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateBinding_BoundElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateParameterSubstitution_OwnedActual(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTemplateParameterSubstitution_TemplateBinding(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";	
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRelationship_RelatedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElement_OwnedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElement_Owner(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamedElement_Namespace(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_Member(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_OwnedMember(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (elementEClass, 
		   source, 
		   new String[] {
			 "has_owner", "mustBeOwned() implies owner->notEmpty()",
			 "not_own_self", "not allOwnedElements()->includes(self)"
		   });	
		addAnnotation
		  (getElement__AllOwnedElements(), 
		   source, 
		   new String[] {
			 "body", "ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))->asSet()"
		   });	
		addAnnotation
		  (getElement__MustBeOwned(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "visibility_needs_ownership", "(namespace = null and owner <> null) implies visibility = null",
			 "has_qualified_name", "(name <> null and allNamespaces()->select(ns | ns.name = null)->isEmpty()) implies\n  qualifiedName = allNamespaces()->iterate( ns : Namespace; agg: String = name | ns.name.concat(self.separator()).concat(agg))",
			 "has_no_qualified_name", "name=null or allNamespaces()->select( ns | ns.name=null )->notEmpty() implies qualifiedName = null"
		   });	
		addAnnotation
		  (getNamedElement__AllNamespaces(), 
		   source, 
		   new String[] {
			 "body", "if owner.oclIsKindOf(TemplateParameter) and\n  owner.oclAsType(TemplateParameter).signature.template.oclIsKindOf(Namespace) then\n    let enclosingNamespace : Namespace =\n      owner.oclAsType(TemplateParameter).signature.template.oclAsType(Namespace) in\n        enclosingNamespace.allNamespaces()->prepend(enclosingNamespace)\nelse\n  if namespace->isEmpty()\n    then OrderedSet{}\n  else\n    namespace.allNamespaces()->prepend(namespace)\n  endif\nendif"
		   });	
		addAnnotation
		  (getNamedElement__AllOwningPackages(), 
		   source, 
		   new String[] {
			 "body", "if namespace.oclIsKindOf(Package)\r\nthen\r\n  let owningPackage : Package = namespace.oclAsType(Package) in\r\n    owningPackage->union(owningPackage.allOwningPackages())\r\nelse\r\n  null\r\nendif"
		   });	
		addAnnotation
		  (getNamedElement__IsDistinguishableFrom__NamedElement_Namespace(), 
		   source, 
		   new String[] {
			 "body", "(self.oclIsKindOf(n.oclType()) or n.oclIsKindOf(self.oclType())) implies\n    ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()"
		   });	
		addAnnotation
		  (getNamedElement__QualifiedName(), 
		   source, 
		   new String[] {
			 "body", "if self.name <> null and self.allNamespaces()->select( ns | ns.name=null )->isEmpty()\nthen \n    self.allNamespaces()->iterate( ns : Namespace; agg: String = self.name | ns.name.concat(self.separator()).concat(agg))\nelse\n   null\nendif"
		   });	
		addAnnotation
		  (getNamedElement__Separator(), 
		   source, 
		   new String[] {
			 "body", "\'::\'"
		   });	
		addAnnotation
		  (getNamedElement__ClientDependency(), 
		   source, 
		   new String[] {
			 "body", "Dependency.allInstances()->select(d | d.client->includes(self))"
		   });	
		addAnnotation
		  (getType__ConformsTo__Type(), 
		   source, 
		   new String[] {
			 "body", "false"
		   });	
		addAnnotation
		  (namespaceEClass, 
		   source, 
		   new String[] {
			 "members_distinguishable", "membersAreDistinguishable()",
			 "cannot_import_self", "packageImport.importedPackage.oclAsType(Namespace)->excludes(self)",
			 "cannot_import_ownedMembers", "elementImport.importedElement.oclAsType(Element)->excludesAll(ownedMember)"
		   });	
		addAnnotation
		  (getNamespace__ExcludeCollisions__EList(), 
		   source, 
		   new String[] {
			 "body", "imps->reject(imp1  | imps->exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))"
		   });	
		addAnnotation
		  (getNamespace__GetNamesOfMember__NamedElement(), 
		   source, 
		   new String[] {
			 "body", "if self.ownedMember ->includes(element)\nthen Set{element.name}\nelse let elementImports : Set(ElementImport) = self.elementImport->select(ei | ei.importedElement = element) in\n  if elementImports->notEmpty()\n  then\n     elementImports->collect(el | el.getName())->asSet()\n  else \n     self.packageImport->select(pi | pi.importedPackage.visibleMembers().oclAsType(NamedElement)->includes(element))-> collect(pi | pi.importedPackage.getNamesOfMember(element))->asSet()\n  endif\nendif"
		   });	
		addAnnotation
		  (getNamespace__ImportMembers__EList(), 
		   source, 
		   new String[] {
			 "body", "self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem | imp.isDistinguishableFrom(mem, self)))"
		   });	
		addAnnotation
		  (getNamespace__ImportedMember(), 
		   source, 
		   new String[] {
			 "body", "self.importMembers(elementImport.importedElement->asSet()->union(packageImport.importedPackage->collect(p | p.visibleMembers()))->asSet())"
		   });	
		addAnnotation
		  (getNamespace__MembersAreDistinguishable(), 
		   source, 
		   new String[] {
			 "body", "member->forAll( memb |\n   member->excluding(memb)->forAll(other |\n       memb.isDistinguishableFrom(other, self)))"
		   });	
		addAnnotation
		  (elementImportEClass, 
		   source, 
		   new String[] {
			 "imported_element_is_public", "importedElement.visibility <> null implies importedElement.visibility = VisibilityKind::public",
			 "visibility_public_or_private", "visibility = VisibilityKind::public or visibility = VisibilityKind::private"
		   });	
		addAnnotation
		  (getElementImport__GetName(), 
		   source, 
		   new String[] {
			 "body", "if alias->notEmpty() then\n  alias\nelse\n  importedElement.name\nendif"
		   });	
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "not_apply_to_self", "not constrainedElement->includes(self)"
		   });	
		addAnnotation
		  (packageImportEClass, 
		   source, 
		   new String[] {
			 "public_or_private", "visibility = VisibilityKind::public or visibility = VisibilityKind::private"
		   });	
		addAnnotation
		  (multiplicityElementEClass, 
		   source, 
		   new String[] {
			 "upper_ge_lower", "upperBound() >= lowerBound()",
			 "lower_ge_0", "lowerBound() >= 0",
			 "lower_is_integer", "lowerValue <> null implies lowerValue.integerValue() <> null",
			 "upper_is_unlimitedNatural", "upperValue <> null implies upperValue.unlimitedValue() <> null"
		   });	
		addAnnotation
		  (getMultiplicityElement__CompatibleWith__MultiplicityElement(), 
		   source, 
		   new String[] {
			 "body", "(other.lowerBound() <= self.lowerBound()) and ((other.upperBound() = *) or (self.upperBound() <= other.upperBound()))"
		   });	
		addAnnotation
		  (getMultiplicityElement__IncludesMultiplicity__MultiplicityElement(), 
		   source, 
		   new String[] {
			 "body", "(self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())"
		   });	
		addAnnotation
		  (getMultiplicityElement__Is__int_int(), 
		   source, 
		   new String[] {
			 "body", "lowerbound = self.lowerBound() and upperbound = self.upperBound()"
		   });	
		addAnnotation
		  (getMultiplicityElement__IsMultivalued(), 
		   source, 
		   new String[] {
			 "body", "upperBound() > 1"
		   });	
		addAnnotation
		  (getMultiplicityElement__Lower(), 
		   source, 
		   new String[] {
			 "body", "lowerBound()"
		   });	
		addAnnotation
		  (getMultiplicityElement__LowerBound(), 
		   source, 
		   new String[] {
			 "body", "if (lowerValue=null or lowerValue.integerValue()=null) then 1 else lowerValue.integerValue() endif"
		   });	
		addAnnotation
		  (getMultiplicityElement__Upper(), 
		   source, 
		   new String[] {
			 "body", "upperBound()"
		   });	
		addAnnotation
		  (getMultiplicityElement__UpperBound(), 
		   source, 
		   new String[] {
			 "body", "if (upperValue=null or upperValue.unlimitedValue()=null) then 1 else upperValue.unlimitedValue() endif"
		   });	
		addAnnotation
		  (getParameterableElement__IsCompatibleWith__ParameterableElement(), 
		   source, 
		   new String[] {
			 "body", "self.oclIsKindOf(p.oclType())"
		   });	
		addAnnotation
		  (getParameterableElement__IsTemplateParameter(), 
		   source, 
		   new String[] {
			 "body", "templateParameter->notEmpty()"
		   });	
		addAnnotation
		  (templateParameterEClass, 
		   source, 
		   new String[] {
			 "must_be_compatible", "default <> null implies default.isCompatibleWith(parameteredElement)"
		   });	
		addAnnotation
		  (templateSignatureEClass, 
		   source, 
		   new String[] {
			 "own_elements", "template.ownedElement->includesAll(parameter.parameteredElement->asSet() - parameter.ownedParameteredElement->asSet())",
			 "unique_parameters", "parameter->forAll( p1, p2 | (p1 <> p2 and p1.parameteredElement.oclIsKindOf(NamedElement) and p2.parameteredElement.oclIsKindOf(NamedElement) ) implies\r\n   p1.parameteredElement.oclAsType(NamedElement).name <> p2.parameteredElement.oclAsType(NamedElement).name)"
		   });	
		addAnnotation
		  (getTemplateableElement__IsTemplate(), 
		   source, 
		   new String[] {
			 "body", "ownedTemplateSignature <> null"
		   });	
		addAnnotation
		  (getTemplateableElement__ParameterableElements(), 
		   source, 
		   new String[] {
			 "body", "self.allOwnedElements()->select(oclIsKindOf(ParameterableElement)).oclAsType(ParameterableElement)->asSet()"
		   });	
		addAnnotation
		  (templateBindingEClass, 
		   source, 
		   new String[] {
			 "parameter_substitution_formal", "parameterSubstitution->forAll(b | signature.parameter->includes(b.formal))",
			 "one_parameter_substitution", "signature.parameter->forAll(p | parameterSubstitution->select(b | b.formal = p)->size() <= 1)"
		   });	
		addAnnotation
		  (templateParameterSubstitutionEClass, 
		   source, 
		   new String[] {
			 "must_be_compatible", "actual->forAll(a | a.isCompatibleWith(formal.parameteredElement))"
		   });	
		addAnnotation
		  (packageableElementEClass, 
		   source, 
		   new String[] {
			 "namespace_needs_visibility", "visibility = null implies namespace = null"
		   });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";	
		addAnnotation
		  (packageableElementEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CommonStructurePackageImpl
