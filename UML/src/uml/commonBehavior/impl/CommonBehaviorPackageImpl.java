/**
 */
package uml.commonBehavior.impl;

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

import uml.commonBehavior.AnyReceiveEvent;
import uml.commonBehavior.Behavior;
import uml.commonBehavior.CallEvent;
import uml.commonBehavior.ChangeEvent;
import uml.commonBehavior.CommonBehaviorFactory;
import uml.commonBehavior.CommonBehaviorPackage;
import uml.commonBehavior.Event;
import uml.commonBehavior.FunctionBehavior;
import uml.commonBehavior.MessageEvent;
import uml.commonBehavior.OpaqueBehavior;
import uml.commonBehavior.SignalEvent;
import uml.commonBehavior.TimeEvent;
import uml.commonBehavior.Trigger;

import uml.commonBehavior.util.CommonBehaviorValidator;

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
public class CommonBehaviorPackageImpl extends EPackageImpl implements CommonBehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyReceiveEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

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
	 * @see uml.commonBehavior.CommonBehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonBehaviorPackageImpl() {
		super(eNS_URI, CommonBehaviorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonBehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonBehaviorPackage init() {
		if (isInited) return (CommonBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI);

		// Obtain or create and register package
		CommonBehaviorPackageImpl theCommonBehaviorPackage = (CommonBehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonBehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonBehaviorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
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
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) : InformationFlowsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonBehaviorPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
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
		theInformationFlowsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theCommonBehaviorPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
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
		theInformationFlowsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCommonBehaviorPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CommonBehaviorValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCommonBehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonBehaviorPackage.eNS_URI, theCommonBehaviorPackage);
		return theCommonBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyReceiveEvent() {
		return anyReceiveEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEvent() {
		return messageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Event() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Port() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallEvent() {
		return callEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallEvent_Operation() {
		return (EReference)callEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeEvent() {
		return changeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeEvent_ChangeExpression() {
		return (EReference)changeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBehavior() {
		return functionBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionBehavior__HasAllDataTypeAttributes__DataType() {
		return functionBehaviorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueBehavior() {
		return opaqueBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Body() {
		return (EAttribute)opaqueBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Language() {
		return (EAttribute)opaqueBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalEvent() {
		return signalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalEvent_Signal() {
		return (EReference)signalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEvent() {
		return timeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEvent_IsRelative() {
		return (EAttribute)timeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEvent_When() {
		return (EReference)timeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Specification() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Context() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_IsReentrant() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameter() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameterSet() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Postcondition() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Precondition() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_RedefinedBehavior() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavior__Context() {
		return behaviorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavior__BehavioredClassifier__Element() {
		return behaviorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavior__InputParameters() {
		return behaviorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavior__OutputParameters() {
		return behaviorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonBehaviorFactory getCommonBehaviorFactory() {
		return (CommonBehaviorFactory)getEFactoryInstance();
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
		anyReceiveEventEClass = createEClass(ANY_RECEIVE_EVENT);

		messageEventEClass = createEClass(MESSAGE_EVENT);

		eventEClass = createEClass(EVENT);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__EVENT);
		createEReference(triggerEClass, TRIGGER__PORT);

		callEventEClass = createEClass(CALL_EVENT);
		createEReference(callEventEClass, CALL_EVENT__OPERATION);

		changeEventEClass = createEClass(CHANGE_EVENT);
		createEReference(changeEventEClass, CHANGE_EVENT__CHANGE_EXPRESSION);

		functionBehaviorEClass = createEClass(FUNCTION_BEHAVIOR);
		createEOperation(functionBehaviorEClass, FUNCTION_BEHAVIOR___HAS_ALL_DATA_TYPE_ATTRIBUTES__DATATYPE);

		opaqueBehaviorEClass = createEClass(OPAQUE_BEHAVIOR);
		createEAttribute(opaqueBehaviorEClass, OPAQUE_BEHAVIOR__BODY);
		createEAttribute(opaqueBehaviorEClass, OPAQUE_BEHAVIOR__LANGUAGE);

		signalEventEClass = createEClass(SIGNAL_EVENT);
		createEReference(signalEventEClass, SIGNAL_EVENT__SIGNAL);

		timeEventEClass = createEClass(TIME_EVENT);
		createEAttribute(timeEventEClass, TIME_EVENT__IS_RELATIVE);
		createEReference(timeEventEClass, TIME_EVENT__WHEN);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__SPECIFICATION);
		createEReference(behaviorEClass, BEHAVIOR__CONTEXT);
		createEAttribute(behaviorEClass, BEHAVIOR__IS_REENTRANT);
		createEReference(behaviorEClass, BEHAVIOR__OWNED_PARAMETER);
		createEReference(behaviorEClass, BEHAVIOR__OWNED_PARAMETER_SET);
		createEReference(behaviorEClass, BEHAVIOR__POSTCONDITION);
		createEReference(behaviorEClass, BEHAVIOR__PRECONDITION);
		createEReference(behaviorEClass, BEHAVIOR__REDEFINED_BEHAVIOR);
		createEOperation(behaviorEClass, BEHAVIOR___CONTEXT);
		createEOperation(behaviorEClass, BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT);
		createEOperation(behaviorEClass, BEHAVIOR___INPUT_PARAMETERS);
		createEOperation(behaviorEClass, BEHAVIOR___OUTPUT_PARAMETERS);
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
		StructuredClassifiersPackage theStructuredClassifiersPackage = (StructuredClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		SimpleClassifiersPackage theSimpleClassifiersPackage = (SimpleClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		anyReceiveEventEClass.getESuperTypes().add(this.getMessageEvent());
		messageEventEClass.getESuperTypes().add(this.getEvent());
		eventEClass.getESuperTypes().add(theCommonStructurePackage.getPackageableElement());
		triggerEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		callEventEClass.getESuperTypes().add(this.getMessageEvent());
		changeEventEClass.getESuperTypes().add(this.getEvent());
		functionBehaviorEClass.getESuperTypes().add(this.getOpaqueBehavior());
		opaqueBehaviorEClass.getESuperTypes().add(this.getBehavior());
		signalEventEClass.getESuperTypes().add(this.getMessageEvent());
		timeEventEClass.getESuperTypes().add(this.getEvent());
		behaviorEClass.getESuperTypes().add(theStructuredClassifiersPackage.getClass_());

		// Initialize classes, features, and operations; add parameters
		initEClass(anyReceiveEventEClass, AnyReceiveEvent.class, "AnyReceiveEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEventEClass, MessageEvent.class, "MessageEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Event(), this.getEvent(), null, "event", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrigger_Port(), theStructuredClassifiersPackage.getPort(), null, "port", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callEventEClass, CallEvent.class, "CallEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallEvent_Operation(), theClassificationPackage.getOperation(), null, "operation", null, 1, 1, CallEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(changeEventEClass, ChangeEvent.class, "ChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeEvent_ChangeExpression(), theValuesPackage.getValueSpecification(), null, "changeExpression", null, 1, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(functionBehaviorEClass, FunctionBehavior.class, "FunctionBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getFunctionBehavior__HasAllDataTypeAttributes__DataType(), theTypesPackage.getBoolean(), "hasAllDataTypeAttributes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theSimpleClassifiersPackage.getDataType(), "d", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(opaqueBehaviorEClass, OpaqueBehavior.class, "OpaqueBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueBehavior_Body(), theTypesPackage.getString(), "body", null, 0, -1, OpaqueBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpaqueBehavior_Language(), theTypesPackage.getString(), "language", null, 0, -1, OpaqueBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEventEClass, SignalEvent.class, "SignalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalEvent_Signal(), theSimpleClassifiersPackage.getSignal(), null, "signal", null, 1, 1, SignalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeEventEClass, TimeEvent.class, "TimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeEvent_IsRelative(), theTypesPackage.getBoolean(), "isRelative", "false", 1, 1, TimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeEvent_When(), theValuesPackage.getTimeExpression(), null, "when", null, 1, 1, TimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Specification(), theClassificationPackage.getBehavioralFeature(), theClassificationPackage.getBehavioralFeature_Method(), "specification", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Context(), theSimpleClassifiersPackage.getBehavioredClassifier(), null, "context", null, 0, 1, Behavior.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBehavior_IsReentrant(), theTypesPackage.getBoolean(), "isReentrant", "true", 1, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_OwnedParameter(), theClassificationPackage.getParameter(), null, "ownedParameter", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_OwnedParameterSet(), theClassificationPackage.getParameterSet(), null, "ownedParameterSet", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Postcondition(), theCommonStructurePackage.getConstraint(), null, "postcondition", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Precondition(), theCommonStructurePackage.getConstraint(), null, "precondition", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_RedefinedBehavior(), this.getBehavior(), null, "redefinedBehavior", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBehavior__Context(), theSimpleClassifiersPackage.getBehavioredClassifier(), "context", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBehavior__BehavioredClassifier__Element(), theSimpleClassifiersPackage.getBehavioredClassifier(), "behavioredClassifier", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonStructurePackage.getElement(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBehavior__InputParameters(), theClassificationPackage.getParameter(), "inputParameters", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBehavior__OutputParameters(), theClassificationPackage.getParameter(), "outputParameters", 0, -1, IS_UNIQUE, IS_ORDERED);

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
			 "originalName", "CommonBehavior"
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
		  (triggerEClass, 
		   source, 
		   new String[] {
			 "constraints", "trigger_with_ports"
		   });	
		addAnnotation
		  (functionBehaviorEClass, 
		   source, 
		   new String[] {
			 "constraints", "one_output_parameter types_of_parameters"
		   });	
		addAnnotation
		  (timeEventEClass, 
		   source, 
		   new String[] {
			 "constraints", "when_non_negative"
		   });	
		addAnnotation
		  (behaviorEClass, 
		   source, 
		   new String[] {
			 "constraints", "most_one_behavior parameters_match feature_of_context_classifier"
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
		  (triggerEClass, 
		   source, 
		   new String[] {
			 "trigger_with_ports", "port->notEmpty() implies event.oclIsKindOf(MessageEvent)"
		   });	
		addAnnotation
		  (functionBehaviorEClass, 
		   source, 
		   new String[] {
			 "one_output_parameter", "self.ownedParameter->\r\n  select(p | p.direction = ParameterDirectionKind::out or p.direction= ParameterDirectionKind::inout or p.direction= ParameterDirectionKind::return)->size() >= 1",
			 "types_of_parameters", "ownedParameter->forAll(p | p.type <> null and\r\n  p.type.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p.type.oclAsType(DataType)))"
		   });	
		addAnnotation
		  (getFunctionBehavior__HasAllDataTypeAttributes__DataType(), 
		   source, 
		   new String[] {
			 "body", "d.ownedAttribute->forAll(a |\r\n    a.type.oclIsKindOf(DataType) and\r\n      hasAllDataTypeAttributes(a.type.oclAsType(DataType)))"
		   });	
		addAnnotation
		  (timeEventEClass, 
		   source, 
		   new String[] {
			 "when_non_negative", "when.integerValue() >= 0"
		   });	
		addAnnotation
		  (behaviorEClass, 
		   source, 
		   new String[] {
			 "most_one_behavior", "specification <> null implies _\'context\'.ownedBehavior->select(specification=self.specification)->size() = 1",
			 "parameters_match", "specification <> null implies ownedParameter->size() = specification.ownedParameter->size()",
			 "feature_of_context_classifier", "_\'context\'.feature->includes(specification)"
		   });	
		addAnnotation
		  (getBehavior__Context(), 
		   source, 
		   new String[] {
			 "body", "if nestingClass <> null then\r\n    null\r\nelse\r\n    let b:BehavioredClassifier = self.behavioredClassifier(self.owner) in\r\n    if b.oclIsKindOf(Behavior) and b.oclAsType(Behavior)._\'context\' <> null then \r\n        b.oclAsType(Behavior)._\'context\'\r\n    else \r\n        b \r\n    endif\r\nendif"
		   });	
		addAnnotation
		  (getBehavior__InputParameters(), 
		   source, 
		   new String[] {
			 "body", "ownedParameter->select(direction=ParameterDirectionKind::_\'in\' or direction=ParameterDirectionKind::inout)"
		   });	
		addAnnotation
		  (getBehavior__OutputParameters(), 
		   source, 
		   new String[] {
			 "body", "ownedParameter->select(direction=ParameterDirectionKind::out or direction=ParameterDirectionKind::inout or direction=ParameterDirectionKind::return)"
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
		  (getTrigger_Event(), 
		   source, 
		   new String[] {
			 "body", "trigger"
		   });	
		addAnnotation
		  (getTrigger_Port(), 
		   source, 
		   new String[] {
			 "body", "trigger"
		   });	
		addAnnotation
		  (getCallEvent_Operation(), 
		   source, 
		   new String[] {
			 "body", "callEvent"
		   });	
		addAnnotation
		  (getChangeEvent_ChangeExpression(), 
		   source, 
		   new String[] {
			 "body", "changeEvent"
		   });	
		addAnnotation
		  (getSignalEvent_Signal(), 
		   source, 
		   new String[] {
			 "body", "signalEvent"
		   });	
		addAnnotation
		  (getTimeEvent_When(), 
		   source, 
		   new String[] {
			 "body", "timeEvent"
		   });	
		addAnnotation
		  (getBehavior_Context(), 
		   source, 
		   new String[] {
			 "body", "behavior"
		   });	
		addAnnotation
		  (getBehavior_OwnedParameter(), 
		   source, 
		   new String[] {
			 "body", "behavior"
		   });	
		addAnnotation
		  (getBehavior_OwnedParameterSet(), 
		   source, 
		   new String[] {
			 "body", "behavior"
		   });	
		addAnnotation
		  (getBehavior_Postcondition(), 
		   source, 
		   new String[] {
			 "body", "behavior"
		   });	
		addAnnotation
		  (getBehavior_Precondition(), 
		   source, 
		   new String[] {
			 "body", "behavior"
		   });	
		addAnnotation
		  (getBehavior_RedefinedBehavior(), 
		   source, 
		   new String[] {
			 "body", "behavior"
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
		  (getChangeEvent_ChangeExpression(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTimeEvent_When(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavior_Context(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavior_OwnedParameter(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavior_OwnedParameterSet(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavior_Postcondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavior_Precondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavior_RedefinedBehavior(), 
		   source, 
		   new String[] {
		   });
	}

} //CommonBehaviorPackageImpl
