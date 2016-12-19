/**
 */
package uml.packages.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

import uml.commonStructure.CommonStructurePackage;

import uml.commonStructure.impl.CommonStructurePackageImpl;

import uml.deployments.DeploymentsPackage;

import uml.deployments.impl.DeploymentsPackageImpl;

import uml.informationFlows.InformationFlowsPackage;

import uml.informationFlows.impl.InformationFlowsPackageImpl;

import uml.interactions.InteractionsPackage;

import uml.interactions.impl.InteractionsPackageImpl;

import uml.packages.Extension;
import uml.packages.ExtensionEnd;
import uml.packages.Image;
import uml.packages.Model;
import uml.packages.PackageMerge;
import uml.packages.PackagesFactory;
import uml.packages.PackagesPackage;
import uml.packages.Profile;
import uml.packages.ProfileApplication;
import uml.packages.Stereotype;

import uml.packages.util.PackagesValidator;

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
public class PackagesPackageImpl extends EPackageImpl implements PackagesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

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
	 * @see uml.packages.PackagesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PackagesPackageImpl() {
		super(eNS_URI, PackagesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PackagesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PackagesPackage init() {
		if (isInited) return (PackagesPackage)EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI);

		// Obtain or create and register package
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PackagesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		CommonBehaviorPackageImpl theCommonBehaviorPackage = (CommonBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) instanceof CommonBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) : CommonBehaviorPackage.eINSTANCE);
		CommonStructurePackageImpl theCommonStructurePackage = (CommonStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) instanceof CommonStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) : CommonStructurePackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
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
		thePackagesPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCommonBehaviorPackage.createPackageContents();
		theCommonStructurePackage.createPackageContents();
		theValuesPackage.createPackageContents();
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
		thePackagesPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCommonBehaviorPackage.initializePackageContents();
		theCommonStructurePackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
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
			(thePackagesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PackagesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePackagesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PackagesPackage.eNS_URI, thePackagesPackage);
		return thePackagesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Metaclass() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_IsRequired() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtension__IsRequired() {
		return extensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtension__Metaclass() {
		return extensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtension__MetaclassEnd() {
		return extensionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionEnd() {
		return extensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStereotype() {
		return stereotypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStereotype_Icon() {
		return (EReference)stereotypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStereotype_Profile() {
		return (EReference)stereotypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStereotype__ContainingProfile() {
		return stereotypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStereotype__Profile() {
		return stereotypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Content() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Format() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Location() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_MetaclassReference() {
		return (EReference)profileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_MetamodelReference() {
		return (EReference)profileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Viewpoint() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageMerge() {
		return packageMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_MergedPackage() {
		return (EReference)packageMergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_ReceivingPackage() {
		return (EReference)packageMergeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileApplication() {
		return profileApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileApplication_AppliedProfile() {
		return (EReference)profileApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileApplication_ApplyingPackage() {
		return (EReference)profileApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileApplication_IsStrict() {
		return (EAttribute)profileApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageMerge() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ProfileApplication() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Uri() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestedPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestingPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedStereotype() {
		return (EReference)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackagedElement() {
		return (EReference)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedType() {
		return (EReference)packageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__AllApplicableStereotypes() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__ContainingProfile() {
		return packageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__MakesVisible__NamedElement() {
		return packageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__NestedPackage() {
		return packageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__OwnedStereotype() {
		return packageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__OwnedType() {
		return packageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__VisibleMembers() {
		return packageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesFactory getPackagesFactory() {
		return (PackagesFactory)getEFactoryInstance();
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
		extensionEClass = createEClass(EXTENSION);
		createEReference(extensionEClass, EXTENSION__METACLASS);
		createEAttribute(extensionEClass, EXTENSION__IS_REQUIRED);
		createEOperation(extensionEClass, EXTENSION___IS_REQUIRED);
		createEOperation(extensionEClass, EXTENSION___METACLASS);
		createEOperation(extensionEClass, EXTENSION___METACLASS_END);

		extensionEndEClass = createEClass(EXTENSION_END);

		stereotypeEClass = createEClass(STEREOTYPE);
		createEReference(stereotypeEClass, STEREOTYPE__ICON);
		createEReference(stereotypeEClass, STEREOTYPE__PROFILE);
		createEOperation(stereotypeEClass, STEREOTYPE___CONTAINING_PROFILE);
		createEOperation(stereotypeEClass, STEREOTYPE___PROFILE);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__CONTENT);
		createEAttribute(imageEClass, IMAGE__FORMAT);
		createEAttribute(imageEClass, IMAGE__LOCATION);

		profileEClass = createEClass(PROFILE);
		createEReference(profileEClass, PROFILE__METACLASS_REFERENCE);
		createEReference(profileEClass, PROFILE__METAMODEL_REFERENCE);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__VIEWPOINT);

		packageMergeEClass = createEClass(PACKAGE_MERGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__MERGED_PACKAGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__RECEIVING_PACKAGE);

		profileApplicationEClass = createEClass(PROFILE_APPLICATION);
		createEReference(profileApplicationEClass, PROFILE_APPLICATION__APPLIED_PROFILE);
		createEReference(profileApplicationEClass, PROFILE_APPLICATION__APPLYING_PACKAGE);
		createEAttribute(profileApplicationEClass, PROFILE_APPLICATION__IS_STRICT);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__PACKAGE_MERGE);
		createEReference(packageEClass, PACKAGE__PROFILE_APPLICATION);
		createEAttribute(packageEClass, PACKAGE__URI);
		createEReference(packageEClass, PACKAGE__NESTED_PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTING_PACKAGE);
		createEReference(packageEClass, PACKAGE__OWNED_STEREOTYPE);
		createEReference(packageEClass, PACKAGE__PACKAGED_ELEMENT);
		createEReference(packageEClass, PACKAGE__OWNED_TYPE);
		createEOperation(packageEClass, PACKAGE___ALL_APPLICABLE_STEREOTYPES);
		createEOperation(packageEClass, PACKAGE___CONTAINING_PROFILE);
		createEOperation(packageEClass, PACKAGE___MAKES_VISIBLE__NAMEDELEMENT);
		createEOperation(packageEClass, PACKAGE___NESTED_PACKAGE);
		createEOperation(packageEClass, PACKAGE___OWNED_STEREOTYPE);
		createEOperation(packageEClass, PACKAGE___OWNED_TYPE);
		createEOperation(packageEClass, PACKAGE___VISIBLE_MEMBERS);
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
		StructuredClassifiersPackage theStructuredClassifiersPackage = (StructuredClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		CommonStructurePackage theCommonStructurePackage = (CommonStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extensionEClass.getESuperTypes().add(theStructuredClassifiersPackage.getAssociation());
		extensionEndEClass.getESuperTypes().add(theClassificationPackage.getProperty());
		stereotypeEClass.getESuperTypes().add(theStructuredClassifiersPackage.getClass_());
		imageEClass.getESuperTypes().add(theCommonStructurePackage.getElement());
		profileEClass.getESuperTypes().add(this.getPackage());
		modelEClass.getESuperTypes().add(this.getPackage());
		packageMergeEClass.getESuperTypes().add(theCommonStructurePackage.getDirectedRelationship());
		profileApplicationEClass.getESuperTypes().add(theCommonStructurePackage.getDirectedRelationship());
		packageEClass.getESuperTypes().add(theCommonStructurePackage.getNamespace());
		packageEClass.getESuperTypes().add(theCommonStructurePackage.getPackageableElement());
		packageEClass.getESuperTypes().add(theCommonStructurePackage.getTemplateableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtension_Metaclass(), theStructuredClassifiersPackage.getClass_(), theStructuredClassifiersPackage.getClass_Extension(), "metaclass", null, 1, 1, Extension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExtension_IsRequired(), theTypesPackage.getBoolean(), "isRequired", null, 1, 1, Extension.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getExtension__IsRequired(), theTypesPackage.getBoolean(), "isRequired", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExtension__Metaclass(), theStructuredClassifiersPackage.getClass_(), "metaclass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExtension__MetaclassEnd(), theClassificationPackage.getProperty(), "metaclassEnd", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(extensionEndEClass, ExtensionEnd.class, "ExtensionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stereotypeEClass, Stereotype.class, "Stereotype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStereotype_Icon(), this.getImage(), null, "icon", null, 0, -1, Stereotype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStereotype_Profile(), this.getProfile(), null, "profile", null, 1, 1, Stereotype.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getStereotype__ContainingProfile(), this.getProfile(), "containingProfile", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStereotype__Profile(), this.getProfile(), "profile", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Content(), theTypesPackage.getString(), "content", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImage_Format(), theTypesPackage.getString(), "format", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImage_Location(), theTypesPackage.getString(), "location", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfile_MetaclassReference(), theCommonStructurePackage.getElementImport(), null, "metaclassReference", null, 0, -1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProfile_MetamodelReference(), theCommonStructurePackage.getPackageImport(), null, "metamodelReference", null, 0, -1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Viewpoint(), theTypesPackage.getString(), "viewpoint", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(packageMergeEClass, PackageMerge.class, "PackageMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageMerge_MergedPackage(), this.getPackage(), null, "mergedPackage", null, 1, 1, PackageMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageMerge_ReceivingPackage(), this.getPackage(), this.getPackage_PackageMerge(), "receivingPackage", null, 1, 1, PackageMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(profileApplicationEClass, ProfileApplication.class, "ProfileApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfileApplication_AppliedProfile(), this.getProfile(), null, "appliedProfile", null, 1, 1, ProfileApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProfileApplication_ApplyingPackage(), this.getPackage(), this.getPackage_ProfileApplication(), "applyingPackage", null, 1, 1, ProfileApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProfileApplication_IsStrict(), theTypesPackage.getBoolean(), "isStrict", "false", 1, 1, ProfileApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(packageEClass, uml.packages.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_PackageMerge(), this.getPackageMerge(), this.getPackageMerge_ReceivingPackage(), "packageMerge", null, 0, -1, uml.packages.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_ProfileApplication(), this.getProfileApplication(), this.getProfileApplication_ApplyingPackage(), "profileApplication", null, 0, -1, uml.packages.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPackage_Uri(), theTypesPackage.getString(), "uri", null, 0, 1, uml.packages.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_NestedPackage(), this.getPackage(), this.getPackage_NestingPackage(), "nestedPackage", null, 0, -1, uml.packages.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_NestingPackage(), this.getPackage(), this.getPackage_NestedPackage(), "nestingPackage", null, 0, 1, uml.packages.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_OwnedStereotype(), this.getStereotype(), null, "ownedStereotype", null, 0, -1, uml.packages.Package.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_PackagedElement(), theCommonStructurePackage.getPackageableElement(), null, "packagedElement", null, 0, -1, uml.packages.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_OwnedType(), theCommonStructurePackage.getType(), theCommonStructurePackage.getType_Package(), "ownedType", null, 0, -1, uml.packages.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getPackage__AllApplicableStereotypes(), this.getStereotype(), "allApplicableStereotypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__ContainingProfile(), this.getProfile(), "containingProfile", 0, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getPackage__MakesVisible__NamedElement(), theTypesPackage.getBoolean(), "makesVisible", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonStructurePackage.getNamedElement(), "el", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__NestedPackage(), this.getPackage(), "nestedPackage", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__OwnedStereotype(), this.getStereotype(), "ownedStereotype", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__OwnedType(), theCommonStructurePackage.getType(), "ownedType", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__VisibleMembers(), theCommonStructurePackage.getPackageableElement(), "visibleMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// subsets
		createSubsetsAnnotations();
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
			 "originalName", "Packages"
		   });	
		addAnnotation
		  (getPackage_Uri(), 
		   source, 
		   new String[] {
			 "originalName", "URI"
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
		  (extensionEClass, 
		   source, 
		   new String[] {
			 "constraints", "non_owned_end is_binary"
		   });	
		addAnnotation
		  (extensionEndEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity aggregation"
		   });	
		addAnnotation
		  (stereotypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "binaryAssociationsOnly generalize name_not_clash associationEndOwnership base_property_upper_bound base_property_multiplicity_single_extension base_property_multiplicity_multiple_extension"
		   });	
		addAnnotation
		  (profileEClass, 
		   source, 
		   new String[] {
			 "constraints", "metaclass_reference_not_specialized references_same_metamodel"
		   });	
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "constraints", "elements_public_or_private"
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
		  (extensionEClass, 
		   source, 
		   new String[] {
			 "non_owned_end", "metaclassEnd()->notEmpty() and metaclassEnd().type.oclIsKindOf(Class)",
			 "is_binary", "memberEnd->size() = 2"
		   });	
		addAnnotation
		  (getExtension__IsRequired(), 
		   source, 
		   new String[] {
			 "body", "ownedEnd.lowerBound() = 1"
		   });	
		addAnnotation
		  (getExtension__Metaclass(), 
		   source, 
		   new String[] {
			 "body", "metaclassEnd().type.oclAsType(Class)"
		   });	
		addAnnotation
		  (getExtension__MetaclassEnd(), 
		   source, 
		   new String[] {
			 "body", "memberEnd->reject(p | ownedEnd->includes(p.oclAsType(ExtensionEnd)))->any(true)"
		   });	
		addAnnotation
		  (extensionEndEClass, 
		   source, 
		   new String[] {
			 "multiplicity", "(lowerBound() = 0 or lowerBound() = 1) and upperBound() = 1",
			 "aggregation", "self.aggregation = AggregationKind::composite"
		   });	
		addAnnotation
		  (stereotypeEClass, 
		   source, 
		   new String[] {
			 "binaryAssociationsOnly", "ownedAttribute.association->forAll(memberEnd->size()=2)",
			 "generalize", "allParents()->forAll(oclIsKindOf(Stereotype)) \r\nand Classifier.allInstances()->forAll(c | c.allParents()->exists(oclIsKindOf(Stereotype)) implies c.oclIsKindOf(Stereotype))\r\n",
			 "associationEndOwnership", "ownedAttribute\r\n->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))\r\n->forAll(opposite.owner = association)"
		   });	
		addAnnotation
		  (getStereotype__ContainingProfile(), 
		   source, 
		   new String[] {
			 "body", "self.namespace.oclAsType(Package).containingProfile()"
		   });	
		addAnnotation
		  (getStereotype__Profile(), 
		   source, 
		   new String[] {
			 "body", "self.containingProfile()"
		   });	
		addAnnotation
		  (profileEClass, 
		   source, 
		   new String[] {
			 "metaclass_reference_not_specialized", "metaclassReference.importedElement->\r\n\tselect(c | c.oclIsKindOf(Classifier) and\r\n\t\t(c.oclAsType(Classifier).allParents()->collect(namespace)->includes(self)))->isEmpty()\r\nand \r\npackagedElement->\r\n    select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier).allParents())->\r\n       intersection(metaclassReference.importedElement->select(oclIsKindOf(Classifier))->collect(oclAsType(Classifier)))->isEmpty()",
			 "references_same_metamodel", "metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages()->\r\n  union(metaclassReference.importedElement.allOwningPackages() )->notEmpty()"
		   });	
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "elements_public_or_private", "packagedElement->forAll(e | e.visibility<> null implies e.visibility = VisibilityKind::public or e.visibility = VisibilityKind::private)"
		   });	
		addAnnotation
		  (getPackage__AllApplicableStereotypes(), 
		   source, 
		   new String[] {
			 "body", "let ownedPackages : Bag(Package) = ownedMember->select(oclIsKindOf(Package))->collect(oclAsType(Package)) in\r\n ownedStereotype->union(ownedPackages.allApplicableStereotypes())->flatten()->asSet()"
		   });	
		addAnnotation
		  (getPackage__ContainingProfile(), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsKindOf(Profile) then \r\n\tself.oclAsType(Profile)\r\nelse\r\n\tself.namespace.oclAsType(Package).containingProfile()\r\nendif"
		   });	
		addAnnotation
		  (getPackage__MakesVisible__NamedElement(), 
		   source, 
		   new String[] {
			 "body", "ownedMember->includes(el) or\n(elementImport->select(ei|ei.importedElement = VisibilityKind::public)->collect(importedElement.oclAsType(NamedElement))->includes(el)) or\n(packageImport->select(visibility = VisibilityKind::public)->collect(importedPackage.member->includes(el))->notEmpty())"
		   });	
		addAnnotation
		  (getPackage__NestedPackage(), 
		   source, 
		   new String[] {
			 "body", "packagedElement->select(oclIsKindOf(Package))->collect(oclAsType(Package))->asSet()"
		   });	
		addAnnotation
		  (getPackage__OwnedStereotype(), 
		   source, 
		   new String[] {
			 "body", "packagedElement->select(oclIsKindOf(Stereotype))->collect(oclAsType(Stereotype))->asSet()"
		   });	
		addAnnotation
		  (getPackage__OwnedType(), 
		   source, 
		   new String[] {
			 "body", "packagedElement->select(oclIsKindOf(Type))->collect(oclAsType(Type))->asSet()"
		   });	
		addAnnotation
		  (getPackage__VisibleMembers(), 
		   source, 
		   new String[] {
			 "body", "member->select( m | m.oclIsKindOf(PackageableElement) and self.makesVisible(m))->collect(oclAsType(PackageableElement))->asSet()"
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
		  (extensionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (extensionEndEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
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
		  (getStereotype_Icon(), 
		   source, 
		   new String[] {
			 "body", "stereotype"
		   });	
		addAnnotation
		  (getStereotype_Profile(), 
		   source, 
		   new String[] {
			 "body", "stereotype"
		   });	
		addAnnotation
		  (getProfile_MetaclassReference(), 
		   source, 
		   new String[] {
			 "body", "profile"
		   });	
		addAnnotation
		  (getProfile_MetamodelReference(), 
		   source, 
		   new String[] {
			 "body", "profile"
		   });	
		addAnnotation
		  (getPackageMerge_MergedPackage(), 
		   source, 
		   new String[] {
			 "body", "packageMerge"
		   });	
		addAnnotation
		  (getProfileApplication_AppliedProfile(), 
		   source, 
		   new String[] {
			 "body", "profileApplication"
		   });	
		addAnnotation
		  (getPackage_OwnedStereotype(), 
		   source, 
		   new String[] {
			 "body", "owningPackage"
		   });	
		addAnnotation
		  (getPackage_PackagedElement(), 
		   source, 
		   new String[] {
			 "body", "owningPackage"
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
		  (getStereotype_Icon(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProfile_MetaclassReference(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProfile_MetamodelReference(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackageMerge_MergedPackage(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackageMerge_ReceivingPackage(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProfileApplication_AppliedProfile(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProfileApplication_ApplyingPackage(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackage_PackageMerge(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackage_ProfileApplication(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackage_NestedPackage(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackage_OwnedStereotype(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackage_PackagedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPackage_OwnedType(), 
		   source, 
		   new String[] {
		   });
	}

} //PackagesPackageImpl
