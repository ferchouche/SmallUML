/**
 */
package uml.simpleClassifiers.impl;

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

import uml.packages.PackagesPackage;

import uml.packages.impl.PackagesPackageImpl;

import uml.simpleClassifiers.BehavioredClassifier;
import uml.simpleClassifiers.DataType;
import uml.simpleClassifiers.Enumeration;
import uml.simpleClassifiers.EnumerationLiteral;
import uml.simpleClassifiers.Interface;
import uml.simpleClassifiers.InterfaceRealization;
import uml.simpleClassifiers.PrimitiveType;
import uml.simpleClassifiers.Reception;
import uml.simpleClassifiers.Signal;
import uml.simpleClassifiers.SimpleClassifiersFactory;
import uml.simpleClassifiers.SimpleClassifiersPackage;

import uml.simpleClassifiers.util.SimpleClassifiersValidator;

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
public class SimpleClassifiersPackageImpl extends EPackageImpl implements SimpleClassifiersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredClassifierEClass = null;

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
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleClassifiersPackageImpl() {
		super(eNS_URI, SimpleClassifiersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimpleClassifiersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleClassifiersPackage init() {
		if (isInited) return (SimpleClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI);

		// Obtain or create and register package
		SimpleClassifiersPackageImpl theSimpleClassifiersPackage = (SimpleClassifiersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleClassifiersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleClassifiersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		CommonBehaviorPackageImpl theCommonBehaviorPackage = (CommonBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) instanceof CommonBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) : CommonBehaviorPackage.eINSTANCE);
		CommonStructurePackageImpl theCommonStructurePackage = (CommonStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) instanceof CommonStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) : CommonStructurePackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		StructuredClassifiersPackageImpl theStructuredClassifiersPackage = (StructuredClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI) instanceof StructuredClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI) : StructuredClassifiersPackage.eINSTANCE);
		ClassificationPackageImpl theClassificationPackage = (ClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) instanceof ClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) : ClassificationPackage.eINSTANCE);
		DeploymentsPackageImpl theDeploymentsPackage = (DeploymentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentsPackage.eNS_URI) instanceof DeploymentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentsPackage.eNS_URI) : DeploymentsPackage.eINSTANCE);
		StateMachinesPackageImpl theStateMachinesPackage = (StateMachinesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI) instanceof StateMachinesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI) : StateMachinesPackage.eINSTANCE);
		UseCasesPackageImpl theUseCasesPackage = (UseCasesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) instanceof UseCasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) : UseCasesPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		InteractionsPackageImpl theInteractionsPackage = (InteractionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) instanceof InteractionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) : InteractionsPackage.eINSTANCE);
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) : InformationFlowsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theSimpleClassifiersPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCommonBehaviorPackage.createPackageContents();
		theCommonStructurePackage.createPackageContents();
		theValuesPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theStructuredClassifiersPackage.createPackageContents();
		theClassificationPackage.createPackageContents();
		theDeploymentsPackage.createPackageContents();
		theStateMachinesPackage.createPackageContents();
		theUseCasesPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theInteractionsPackage.createPackageContents();
		theInformationFlowsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleClassifiersPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCommonBehaviorPackage.initializePackageContents();
		theCommonStructurePackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theStructuredClassifiersPackage.initializePackageContents();
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
			(theSimpleClassifiersPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SimpleClassifiersValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSimpleClassifiersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleClassifiersPackage.eNS_URI, theSimpleClassifiersPackage);
		return theSimpleClassifiersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedOperation() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedAttribute() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_NestedClassifier() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedAttribute() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedReception() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Protocol() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RedefinedInterface() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedOperation() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReception() {
		return receptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReception_Signal() {
		return (EReference)receptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_OwnedAttribute() {
		return (EReference)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedLiteral() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteral_Enumeration() {
		return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumerationLiteral__Classifier() {
		return enumerationLiteralEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRealization() {
		return interfaceRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRealization_Contract() {
		return (EReference)interfaceRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRealization_ImplementingClassifier() {
		return (EReference)interfaceRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioredClassifier() {
		return behavioredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_InterfaceRealization() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_ClassifierBehavior() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_OwnedBehavior() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClassifiersFactory getSimpleClassifiersFactory() {
		return (SimpleClassifiersFactory)getEFactoryInstance();
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
		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_OPERATION);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_ATTRIBUTE);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__NESTED_CLASSIFIER);
		createEReference(interfaceEClass, INTERFACE__OWNED_ATTRIBUTE);
		createEReference(interfaceEClass, INTERFACE__OWNED_RECEPTION);
		createEReference(interfaceEClass, INTERFACE__PROTOCOL);
		createEReference(interfaceEClass, INTERFACE__REDEFINED_INTERFACE);
		createEReference(interfaceEClass, INTERFACE__OWNED_OPERATION);

		receptionEClass = createEClass(RECEPTION);
		createEReference(receptionEClass, RECEPTION__SIGNAL);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__OWNED_ATTRIBUTE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERAL);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__ENUMERATION);
		createEOperation(enumerationLiteralEClass, ENUMERATION_LITERAL___CLASSIFIER);

		interfaceRealizationEClass = createEClass(INTERFACE_REALIZATION);
		createEReference(interfaceRealizationEClass, INTERFACE_REALIZATION__CONTRACT);
		createEReference(interfaceRealizationEClass, INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		behavioredClassifierEClass = createEClass(BEHAVIORED_CLASSIFIER);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
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
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		StateMachinesPackage theStateMachinesPackage = (StateMachinesPackage)EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI);
		CommonStructurePackage theCommonStructurePackage = (CommonStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI);
		CommonBehaviorPackage theCommonBehaviorPackage = (CommonBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataTypeEClass.getESuperTypes().add(theClassificationPackage.getClassifier());
		interfaceEClass.getESuperTypes().add(theClassificationPackage.getClassifier());
		receptionEClass.getESuperTypes().add(theClassificationPackage.getBehavioralFeature());
		signalEClass.getESuperTypes().add(theClassificationPackage.getClassifier());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		enumerationLiteralEClass.getESuperTypes().add(theClassificationPackage.getInstanceSpecification());
		interfaceRealizationEClass.getESuperTypes().add(theCommonStructurePackage.getRealization());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());
		behavioredClassifierEClass.getESuperTypes().add(theClassificationPackage.getClassifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_OwnedOperation(), theClassificationPackage.getOperation(), theClassificationPackage.getOperation_Datatype(), "ownedOperation", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_OwnedAttribute(), theClassificationPackage.getProperty(), theClassificationPackage.getProperty_Datatype(), "ownedAttribute", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_NestedClassifier(), theClassificationPackage.getClassifier(), null, "nestedClassifier", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_OwnedAttribute(), theClassificationPackage.getProperty(), theClassificationPackage.getProperty_Interface(), "ownedAttribute", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_OwnedReception(), this.getReception(), null, "ownedReception", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_Protocol(), theStateMachinesPackage.getProtocolStateMachine(), null, "protocol", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_RedefinedInterface(), this.getInterface(), null, "redefinedInterface", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_OwnedOperation(), theClassificationPackage.getOperation(), theClassificationPackage.getOperation_Interface(), "ownedOperation", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receptionEClass, Reception.class, "Reception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReception_Signal(), this.getSignal(), null, "signal", null, 1, 1, Reception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_OwnedAttribute(), theClassificationPackage.getProperty(), null, "ownedAttribute", null, 0, -1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_OwnedLiteral(), this.getEnumerationLiteral(), this.getEnumerationLiteral_Enumeration(), "ownedLiteral", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_OwnedLiteral(), "enumeration", null, 1, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEnumerationLiteral__Classifier(), this.getEnumeration(), "classifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(interfaceRealizationEClass, InterfaceRealization.class, "InterfaceRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceRealization_Contract(), this.getInterface(), null, "contract", null, 1, 1, InterfaceRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterfaceRealization_ImplementingClassifier(), this.getBehavioredClassifier(), this.getBehavioredClassifier_InterfaceRealization(), "implementingClassifier", null, 1, 1, InterfaceRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(behavioredClassifierEClass, BehavioredClassifier.class, "BehavioredClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioredClassifier_InterfaceRealization(), this.getInterfaceRealization(), this.getInterfaceRealization_ImplementingClassifier(), "interfaceRealization", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioredClassifier_ClassifierBehavior(), theCommonBehaviorPackage.getBehavior(), null, "classifierBehavior", null, 0, 1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioredClassifier_OwnedBehavior(), theCommonBehaviorPackage.getBehavior(), null, "ownedBehavior", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// subsets
		createSubsetsAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
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
			 "originalName", "SimpleClassifiers"
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
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "constraints", "visibility"
		   });	
		addAnnotation
		  (receptionEClass, 
		   source, 
		   new String[] {
			 "constraints", "same_name_as_signal same_structure_as_signal"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "constraints", "immutable"
		   });	
		addAnnotation
		  (behavioredClassifierEClass, 
		   source, 
		   new String[] {
			 "constraints", "class_behavior"
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
		  (getDataType_OwnedOperation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_OwnedAttribute(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_NestedClassifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_OwnedAttribute(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_OwnedReception(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_Protocol(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_RedefinedInterface(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_OwnedOperation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSignal_OwnedAttribute(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_OwnedLiteral(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumerationLiteral_Enumeration(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceRealization_Contract(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceRealization_ImplementingClassifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavioredClassifier_InterfaceRealization(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavioredClassifier_ClassifierBehavior(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavioredClassifier_OwnedBehavior(), 
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
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "visibility", "feature->forAll(visibility = VisibilityKind::public)"
		   });	
		addAnnotation
		  (receptionEClass, 
		   source, 
		   new String[] {
			 "same_name_as_signal", "name = signal.name",
			 "same_structure_as_signal", "signal.ownedAttribute->size() = ownedParameter->size() and\r\nSequence{1..signal.ownedAttribute->size()}->forAll( i | \r\n    ownedParameter->at(i).direction = ParameterDirectionKind::_\'in\' and \r\n    ownedParameter->at(i).name = signal.ownedAttribute->at(i).name and\r\n    ownedParameter->at(i).type = signal.ownedAttribute->at(i).type and\r\n    ownedParameter->at(i).lowerBound() = signal.ownedAttribute->at(i).lowerBound() and\r\n    ownedParameter->at(i).upperBound() = signal.ownedAttribute->at(i).upperBound()\r\n)"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "immutable", "ownedAttribute->forAll(isReadOnly)"
		   });	
		addAnnotation
		  (getEnumerationLiteral__Classifier(), 
		   source, 
		   new String[] {
			 "body", "enumeration"
		   });	
		addAnnotation
		  (behavioredClassifierEClass, 
		   source, 
		   new String[] {
			 "class_behavior", "classifierBehavior->notEmpty() implies classifierBehavior.specification->isEmpty()"
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
		  (getInterface_NestedClassifier(), 
		   source, 
		   new String[] {
			 "body", "interface"
		   });	
		addAnnotation
		  (getInterface_OwnedReception(), 
		   source, 
		   new String[] {
			 "body", "interface"
		   });	
		addAnnotation
		  (getInterface_Protocol(), 
		   source, 
		   new String[] {
			 "body", "interface"
		   });	
		addAnnotation
		  (getInterface_RedefinedInterface(), 
		   source, 
		   new String[] {
			 "body", "interface"
		   });	
		addAnnotation
		  (getReception_Signal(), 
		   source, 
		   new String[] {
			 "body", "reception"
		   });	
		addAnnotation
		  (getSignal_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "body", "owningSignal"
		   });	
		addAnnotation
		  (getInterfaceRealization_Contract(), 
		   source, 
		   new String[] {
			 "body", "interfaceRealization"
		   });	
		addAnnotation
		  (getBehavioredClassifier_ClassifierBehavior(), 
		   source, 
		   new String[] {
			 "body", "behavioredClassifier"
		   });	
		addAnnotation
		  (getBehavioredClassifier_OwnedBehavior(), 
		   source, 
		   new String[] {
			 "body", "behavioredClassifier"
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
		  (enumerationLiteralEClass, 
		   source, 
		   new String[] {
		   });
	}

} //SimpleClassifiersPackageImpl
