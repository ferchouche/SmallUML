/**
 */
package uml.informationFlows.impl;

import org.eclipse.emf.ecore.EClass;
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

import uml.informationFlows.InformationFlow;
import uml.informationFlows.InformationFlowsFactory;
import uml.informationFlows.InformationFlowsPackage;
import uml.informationFlows.InformationItem;

import uml.informationFlows.util.InformationFlowsValidator;

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
public class InformationFlowsPackageImpl extends EPackageImpl implements InformationFlowsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationItemEClass = null;

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
	 * @see uml.informationFlows.InformationFlowsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InformationFlowsPackageImpl() {
		super(eNS_URI, InformationFlowsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InformationFlowsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InformationFlowsPackage init() {
		if (isInited) return (InformationFlowsPackage)EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI);

		// Obtain or create and register package
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InformationFlowsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		CommonBehaviorPackageImpl theCommonBehaviorPackage = (CommonBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) instanceof CommonBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) : CommonBehaviorPackage.eINSTANCE);
		CommonStructurePackageImpl theCommonStructurePackage = (CommonStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) instanceof CommonStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) : CommonStructurePackage.eINSTANCE);
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
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theInformationFlowsPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCommonBehaviorPackage.createPackageContents();
		theCommonStructurePackage.createPackageContents();
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
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theInformationFlowsPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCommonBehaviorPackage.initializePackageContents();
		theCommonStructurePackage.initializePackageContents();
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
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theInformationFlowsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return InformationFlowsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theInformationFlowsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InformationFlowsPackage.eNS_URI, theInformationFlowsPackage);
		return theInformationFlowsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlow() {
		return informationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_Conveyed() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_InformationSource() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_InformationTarget() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_Realization() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_RealizingActivityEdge() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_RealizingConnector() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_RealizingMessage() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationItem() {
		return informationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationItem_Represented() {
		return (EReference)informationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowsFactory getInformationFlowsFactory() {
		return (InformationFlowsFactory)getEFactoryInstance();
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
		informationFlowEClass = createEClass(INFORMATION_FLOW);
		createEReference(informationFlowEClass, INFORMATION_FLOW__CONVEYED);
		createEReference(informationFlowEClass, INFORMATION_FLOW__INFORMATION_SOURCE);
		createEReference(informationFlowEClass, INFORMATION_FLOW__INFORMATION_TARGET);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZATION);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZING_CONNECTOR);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZING_MESSAGE);

		informationItemEClass = createEClass(INFORMATION_ITEM);
		createEReference(informationItemEClass, INFORMATION_ITEM__REPRESENTED);
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
		CommonStructurePackage theCommonStructurePackage = (CommonStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		StructuredClassifiersPackage theStructuredClassifiersPackage = (StructuredClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI);
		InteractionsPackage theInteractionsPackage = (InteractionsPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		informationFlowEClass.getESuperTypes().add(theCommonStructurePackage.getPackageableElement());
		informationFlowEClass.getESuperTypes().add(theCommonStructurePackage.getDirectedRelationship());
		informationItemEClass.getESuperTypes().add(theClassificationPackage.getClassifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(informationFlowEClass, InformationFlow.class, "InformationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationFlow_Conveyed(), theClassificationPackage.getClassifier(), null, "conveyed", null, 1, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_InformationSource(), theCommonStructurePackage.getNamedElement(), null, "informationSource", null, 1, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_InformationTarget(), theCommonStructurePackage.getNamedElement(), null, "informationTarget", null, 1, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_Realization(), theCommonStructurePackage.getRelationship(), null, "realization", null, 0, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_RealizingActivityEdge(), theActivitiesPackage.getActivityEdge(), null, "realizingActivityEdge", null, 0, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_RealizingConnector(), theStructuredClassifiersPackage.getConnector(), null, "realizingConnector", null, 0, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_RealizingMessage(), theInteractionsPackage.getMessage(), null, "realizingMessage", null, 0, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(informationItemEClass, InformationItem.class, "InformationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationItem_Represented(), theClassificationPackage.getClassifier(), null, "represented", null, 0, -1, InformationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
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
			 "originalName", "InformationFlows"
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
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (informationFlowEClass, 
		   source, 
		   new String[] {
			 "constraints", "must_conform sources_and_targets_kind convey_classifiers"
		   });	
		addAnnotation
		  (informationItemEClass, 
		   source, 
		   new String[] {
			 "constraints", "sources_and_targets has_no not_instantiable"
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
		  (informationFlowEClass, 
		   source, 
		   new String[] {
			 "sources_and_targets_kind", "(self.informationSource->forAll( sis |\r\n  oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or \r\n  oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or \r\n  oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or \r\n  (oclIsKindOf(InstanceSpecification) and not sis.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship))))) \r\n\r\nand\r\n\r\n(self.informationTarget->forAll( sit | \r\n  oclIsKindOf(Actor) or oclIsKindOf(Node) or oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or \r\n  oclIsKindOf(Class) or oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or \r\n  oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or oclIsKindOf(ActivityPartition) or \r\n(oclIsKindOf(InstanceSpecification) and not sit.oclAsType(InstanceSpecification).classifier->exists(oclIsKindOf(Relationship)))))",
			 "convey_classifiers", "self.conveyed->forAll(oclIsKindOf(Class) or oclIsKindOf(Interface)\r\n  or oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component))"
		   });	
		addAnnotation
		  (informationItemEClass, 
		   source, 
		   new String[] {
			 "sources_and_targets", "(self.represented->select(oclIsKindOf(InformationItem))->forAll(p |\r\n  p.conveyingFlow.source->forAll(q | self.conveyingFlow.source->includes(q)) and\r\n    p.conveyingFlow.target->forAll(q | self.conveyingFlow.target->includes(q)))) and\r\n      (self.represented->forAll(oclIsKindOf(Class) or oclIsKindOf(Interface) or\r\n        oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component)))",
			 "has_no", "self.generalization->isEmpty() and self.feature->isEmpty()",
			 "not_instantiable", "isAbstract"
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
		  (getInformationFlow_Conveyed(), 
		   source, 
		   new String[] {
			 "body", "conveyingFlow"
		   });	
		addAnnotation
		  (getInformationFlow_InformationSource(), 
		   source, 
		   new String[] {
			 "body", "informationFlow"
		   });	
		addAnnotation
		  (getInformationFlow_InformationTarget(), 
		   source, 
		   new String[] {
			 "body", "informationFlow"
		   });	
		addAnnotation
		  (getInformationFlow_Realization(), 
		   source, 
		   new String[] {
			 "body", "abstraction"
		   });	
		addAnnotation
		  (getInformationFlow_RealizingActivityEdge(), 
		   source, 
		   new String[] {
			 "body", "informationFlow"
		   });	
		addAnnotation
		  (getInformationFlow_RealizingConnector(), 
		   source, 
		   new String[] {
			 "body", "informationFlow"
		   });	
		addAnnotation
		  (getInformationFlow_RealizingMessage(), 
		   source, 
		   new String[] {
			 "body", "informationFlow"
		   });	
		addAnnotation
		  (getInformationItem_Represented(), 
		   source, 
		   new String[] {
			 "body", "representation"
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
		  (getInformationFlow_InformationSource(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInformationFlow_InformationTarget(), 
		   source, 
		   new String[] {
		   });
	}

} //InformationFlowsPackageImpl
