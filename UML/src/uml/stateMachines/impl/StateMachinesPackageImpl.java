/**
 */
package uml.stateMachines.impl;

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

import uml.stateMachines.ConnectionPointReference;
import uml.stateMachines.FinalState;
import uml.stateMachines.ProtocolConformance;
import uml.stateMachines.ProtocolStateMachine;
import uml.stateMachines.ProtocolTransition;
import uml.stateMachines.Pseudostate;
import uml.stateMachines.PseudostateKind;
import uml.stateMachines.Region;
import uml.stateMachines.State;
import uml.stateMachines.StateMachine;
import uml.stateMachines.StateMachinesFactory;
import uml.stateMachines.StateMachinesPackage;
import uml.stateMachines.Transition;
import uml.stateMachines.TransitionKind;
import uml.stateMachines.Vertex;

import uml.stateMachines.util.StateMachinesValidator;

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
public class StateMachinesPackageImpl extends EPackageImpl implements StateMachinesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudostateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pseudostateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionKindEEnum = null;

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
	 * @see uml.stateMachines.StateMachinesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateMachinesPackageImpl() {
		super(eNS_URI, StateMachinesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StateMachinesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StateMachinesPackage init() {
		if (isInited) return (StateMachinesPackage)EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI);

		// Obtain or create and register package
		StateMachinesPackageImpl theStateMachinesPackage = (StateMachinesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StateMachinesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StateMachinesPackageImpl());

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
		UseCasesPackageImpl theUseCasesPackage = (UseCasesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) instanceof UseCasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) : UseCasesPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		InteractionsPackageImpl theInteractionsPackage = (InteractionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) instanceof InteractionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) : InteractionsPackage.eINSTANCE);
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) : InformationFlowsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theStateMachinesPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCommonBehaviorPackage.createPackageContents();
		theCommonStructurePackage.createPackageContents();
		theValuesPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theStructuredClassifiersPackage.createPackageContents();
		theSimpleClassifiersPackage.createPackageContents();
		theClassificationPackage.createPackageContents();
		theDeploymentsPackage.createPackageContents();
		theUseCasesPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theInteractionsPackage.createPackageContents();
		theInformationFlowsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theStateMachinesPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCommonBehaviorPackage.initializePackageContents();
		theCommonStructurePackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theStructuredClassifiersPackage.initializePackageContents();
		theSimpleClassifiersPackage.initializePackageContents();
		theClassificationPackage.initializePackageContents();
		theDeploymentsPackage.initializePackageContents();
		theUseCasesPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theInteractionsPackage.initializePackageContents();
		theInformationFlowsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStateMachinesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return StateMachinesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStateMachinesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateMachinesPackage.eNS_URI, theStateMachinesPackage);
		return theStateMachinesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPointReference() {
		return connectionPointReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_State() {
		return (EReference)connectionPointReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_Entry() {
		return (EReference)connectionPointReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_Exit() {
		return (EReference)connectionPointReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Container() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Outgoing() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Incoming() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__ContainingStateMachine() {
		return vertexEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__Incoming() {
		return vertexEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__Outgoing() {
		return vertexEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__IsContainedInState__State() {
		return vertexEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__IsContainedInRegion__Region() {
		return vertexEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_ExtendedRegion() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_State() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_StateMachine() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Transition() {
		return (EReference)regionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Subvertex() {
		return (EReference)regionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__BelongsToPsm() {
		return regionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__ContainingStateMachine() {
		return regionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__RedefinitionContext() {
		return regionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Connection() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ConnectionPoint() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Submachine() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DeferrableTrigger() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DoActivity() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Entry() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Exit() {
		return (EReference)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsComposite() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsOrthogonal() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsSimple() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsSubmachineState() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_RedefinedState() {
		return (EReference)stateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StateInvariant() {
		return (EReference)stateEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Region() {
		return (EReference)stateEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__IsComposite() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__IsOrthogonal() {
		return stateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__IsSimple() {
		return stateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__IsSubmachineState() {
		return stateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__RedefinitionContext() {
		return stateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudostate() {
		return pseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPseudostate_Kind() {
		return (EAttribute)pseudostateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPseudostate_StateMachine() {
		return (EReference)pseudostateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPseudostate_State() {
		return (EReference)pseudostateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ExtendedStateMachine() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Region() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_SubmachineState() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ConnectionPoint() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Lca__Vertex_Vertex() {
		return stateMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Ancestor__Vertex_Vertex() {
		return stateMachineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__LcaState__Vertex_Vertex() {
		return stateMachineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Effect() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Kind() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_RedefinedTransition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Container() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__ContainingStateMachine() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__RedefinitionContext() {
		return transitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolConformance() {
		return protocolConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolConformance_GeneralMachine() {
		return (EReference)protocolConformanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolConformance_SpecificMachine() {
		return (EReference)protocolConformanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolTransition() {
		return protocolTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_PostCondition() {
		return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_PreCondition() {
		return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_Referred() {
		return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocolTransition__Referred() {
		return protocolTransitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolStateMachine() {
		return protocolStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolStateMachine_Conformance() {
		return (EReference)protocolStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPseudostateKind() {
		return pseudostateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionKind() {
		return transitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachinesFactory getStateMachinesFactory() {
		return (StateMachinesFactory)getEFactoryInstance();
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
		connectionPointReferenceEClass = createEClass(CONNECTION_POINT_REFERENCE);
		createEReference(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE__STATE);
		createEReference(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE__ENTRY);
		createEReference(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE__EXIT);

		vertexEClass = createEClass(VERTEX);
		createEReference(vertexEClass, VERTEX__CONTAINER);
		createEReference(vertexEClass, VERTEX__OUTGOING);
		createEReference(vertexEClass, VERTEX__INCOMING);
		createEOperation(vertexEClass, VERTEX___CONTAINING_STATE_MACHINE);
		createEOperation(vertexEClass, VERTEX___INCOMING);
		createEOperation(vertexEClass, VERTEX___OUTGOING);
		createEOperation(vertexEClass, VERTEX___IS_CONTAINED_IN_STATE__STATE);
		createEOperation(vertexEClass, VERTEX___IS_CONTAINED_IN_REGION__REGION);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__EXTENDED_REGION);
		createEReference(regionEClass, REGION__STATE);
		createEReference(regionEClass, REGION__STATE_MACHINE);
		createEReference(regionEClass, REGION__TRANSITION);
		createEReference(regionEClass, REGION__SUBVERTEX);
		createEOperation(regionEClass, REGION___BELONGS_TO_PSM);
		createEOperation(regionEClass, REGION___CONTAINING_STATE_MACHINE);
		createEOperation(regionEClass, REGION___REDEFINITION_CONTEXT);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__CONNECTION);
		createEReference(stateEClass, STATE__CONNECTION_POINT);
		createEReference(stateEClass, STATE__SUBMACHINE);
		createEReference(stateEClass, STATE__DEFERRABLE_TRIGGER);
		createEReference(stateEClass, STATE__DO_ACTIVITY);
		createEReference(stateEClass, STATE__ENTRY);
		createEReference(stateEClass, STATE__EXIT);
		createEAttribute(stateEClass, STATE__IS_COMPOSITE);
		createEAttribute(stateEClass, STATE__IS_ORTHOGONAL);
		createEAttribute(stateEClass, STATE__IS_SIMPLE);
		createEAttribute(stateEClass, STATE__IS_SUBMACHINE_STATE);
		createEReference(stateEClass, STATE__REDEFINED_STATE);
		createEReference(stateEClass, STATE__STATE_INVARIANT);
		createEReference(stateEClass, STATE__REGION);
		createEOperation(stateEClass, STATE___IS_COMPOSITE);
		createEOperation(stateEClass, STATE___IS_ORTHOGONAL);
		createEOperation(stateEClass, STATE___IS_SIMPLE);
		createEOperation(stateEClass, STATE___IS_SUBMACHINE_STATE);
		createEOperation(stateEClass, STATE___REDEFINITION_CONTEXT);

		pseudostateEClass = createEClass(PSEUDOSTATE);
		createEAttribute(pseudostateEClass, PSEUDOSTATE__KIND);
		createEReference(pseudostateEClass, PSEUDOSTATE__STATE_MACHINE);
		createEReference(pseudostateEClass, PSEUDOSTATE__STATE);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__EXTENDED_STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__REGION);
		createEReference(stateMachineEClass, STATE_MACHINE__SUBMACHINE_STATE);
		createEReference(stateMachineEClass, STATE_MACHINE__CONNECTION_POINT);
		createEOperation(stateMachineEClass, STATE_MACHINE___LCA__VERTEX_VERTEX);
		createEOperation(stateMachineEClass, STATE_MACHINE___ANCESTOR__VERTEX_VERTEX);
		createEOperation(stateMachineEClass, STATE_MACHINE___LCA_STATE__VERTEX_VERTEX);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__EFFECT);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEAttribute(transitionEClass, TRANSITION__KIND);
		createEReference(transitionEClass, TRANSITION__REDEFINED_TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__TRIGGER);
		createEReference(transitionEClass, TRANSITION__CONTAINER);
		createEOperation(transitionEClass, TRANSITION___CONTAINING_STATE_MACHINE);
		createEOperation(transitionEClass, TRANSITION___REDEFINITION_CONTEXT);

		finalStateEClass = createEClass(FINAL_STATE);

		protocolConformanceEClass = createEClass(PROTOCOL_CONFORMANCE);
		createEReference(protocolConformanceEClass, PROTOCOL_CONFORMANCE__GENERAL_MACHINE);
		createEReference(protocolConformanceEClass, PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);

		protocolTransitionEClass = createEClass(PROTOCOL_TRANSITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__POST_CONDITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__PRE_CONDITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__REFERRED);
		createEOperation(protocolTransitionEClass, PROTOCOL_TRANSITION___REFERRED);

		protocolStateMachineEClass = createEClass(PROTOCOL_STATE_MACHINE);
		createEReference(protocolStateMachineEClass, PROTOCOL_STATE_MACHINE__CONFORMANCE);

		// Create enums
		pseudostateKindEEnum = createEEnum(PSEUDOSTATE_KIND);
		transitionKindEEnum = createEEnum(TRANSITION_KIND);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		CommonBehaviorPackage theCommonBehaviorPackage = (CommonBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		connectionPointReferenceEClass.getESuperTypes().add(this.getVertex());
		vertexEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		regionEClass.getESuperTypes().add(theCommonStructurePackage.getNamespace());
		regionEClass.getESuperTypes().add(theClassificationPackage.getRedefinableElement());
		stateEClass.getESuperTypes().add(theCommonStructurePackage.getNamespace());
		stateEClass.getESuperTypes().add(theClassificationPackage.getRedefinableElement());
		stateEClass.getESuperTypes().add(this.getVertex());
		pseudostateEClass.getESuperTypes().add(this.getVertex());
		stateMachineEClass.getESuperTypes().add(theCommonBehaviorPackage.getBehavior());
		transitionEClass.getESuperTypes().add(theCommonStructurePackage.getNamespace());
		transitionEClass.getESuperTypes().add(theClassificationPackage.getRedefinableElement());
		finalStateEClass.getESuperTypes().add(this.getState());
		protocolConformanceEClass.getESuperTypes().add(theCommonStructurePackage.getDirectedRelationship());
		protocolTransitionEClass.getESuperTypes().add(this.getTransition());
		protocolStateMachineEClass.getESuperTypes().add(this.getStateMachine());

		// Initialize classes, features, and operations; add parameters
		initEClass(connectionPointReferenceEClass, ConnectionPointReference.class, "ConnectionPointReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPointReference_State(), this.getState(), this.getState_Connection(), "state", null, 0, 1, ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectionPointReference_Entry(), this.getPseudostate(), null, "entry", null, 0, -1, ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectionPointReference_Exit(), this.getPseudostate(), null, "exit", null, 0, -1, ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertex_Container(), this.getRegion(), this.getRegion_Subvertex(), "container", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVertex_Outgoing(), this.getTransition(), this.getTransition_Source(), "outgoing", null, 0, -1, Vertex.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getVertex_Incoming(), this.getTransition(), this.getTransition_Target(), "incoming", null, 0, -1, Vertex.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getVertex__ContainingStateMachine(), this.getStateMachine(), "containingStateMachine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVertex__Incoming(), this.getTransition(), "incoming", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVertex__Outgoing(), this.getTransition(), "outgoing", 0, -1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getVertex__IsContainedInState__State(), theTypesPackage.getBoolean(), "isContainedInState", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "s", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getVertex__IsContainedInRegion__Region(), theTypesPackage.getBoolean(), "isContainedInRegion", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRegion(), "r", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_ExtendedRegion(), this.getRegion(), null, "extendedRegion", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_State(), this.getState(), this.getState_Region(), "state", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_StateMachine(), this.getStateMachine(), this.getStateMachine_Region(), "stateMachine", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_Transition(), this.getTransition(), this.getTransition_Container(), "transition", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_Subvertex(), this.getVertex(), this.getVertex_Container(), "subvertex", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRegion__BelongsToPsm(), theTypesPackage.getBoolean(), "belongsToPsm", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRegion__ContainingStateMachine(), this.getStateMachine(), "containingStateMachine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRegion__RedefinitionContext(), theClassificationPackage.getClassifier(), "redefinitionContext", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Connection(), this.getConnectionPointReference(), this.getConnectionPointReference_State(), "connection", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ConnectionPoint(), this.getPseudostate(), this.getPseudostate_State(), "connectionPoint", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Submachine(), this.getStateMachine(), this.getStateMachine_SubmachineState(), "submachine", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_DeferrableTrigger(), theCommonBehaviorPackage.getTrigger(), null, "deferrableTrigger", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_DoActivity(), theCommonBehaviorPackage.getBehavior(), null, "doActivity", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Entry(), theCommonBehaviorPackage.getBehavior(), null, "entry", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Exit(), theCommonBehaviorPackage.getBehavior(), null, "exit", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getState_IsComposite(), theTypesPackage.getBoolean(), "isComposite", null, 1, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getState_IsOrthogonal(), theTypesPackage.getBoolean(), "isOrthogonal", null, 1, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getState_IsSimple(), theTypesPackage.getBoolean(), "isSimple", null, 1, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getState_IsSubmachineState(), theTypesPackage.getBoolean(), "isSubmachineState", null, 1, 1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getState_RedefinedState(), this.getState(), null, "redefinedState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StateInvariant(), theCommonStructurePackage.getConstraint(), null, "stateInvariant", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Region(), this.getRegion(), this.getRegion_State(), "region", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getState__IsComposite(), theTypesPackage.getBoolean(), "isComposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getState__IsOrthogonal(), theTypesPackage.getBoolean(), "isOrthogonal", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getState__IsSimple(), theTypesPackage.getBoolean(), "isSimple", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getState__IsSubmachineState(), theTypesPackage.getBoolean(), "isSubmachineState", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getState__RedefinitionContext(), theClassificationPackage.getClassifier(), "redefinitionContext", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(pseudostateEClass, Pseudostate.class, "Pseudostate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPseudostate_Kind(), this.getPseudostateKind(), "kind", "initial", 1, 1, Pseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPseudostate_StateMachine(), this.getStateMachine(), this.getStateMachine_ConnectionPoint(), "stateMachine", null, 0, 1, Pseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPseudostate_State(), this.getState(), this.getState_ConnectionPoint(), "state", null, 0, 1, Pseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_ExtendedStateMachine(), this.getStateMachine(), null, "extendedStateMachine", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_Region(), this.getRegion(), this.getRegion_StateMachine(), "region", null, 1, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_SubmachineState(), this.getState(), this.getState_Submachine(), "submachineState", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_ConnectionPoint(), this.getPseudostate(), this.getPseudostate_StateMachine(), "connectionPoint", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStateMachine__Lca__Vertex_Vertex(), this.getRegion(), "lca", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "s1", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "s2", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStateMachine__Ancestor__Vertex_Vertex(), theTypesPackage.getBoolean(), "ancestor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "s1", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "s2", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStateMachine__LcaState__Vertex_Vertex(), this.getState(), "lcaState", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "v1", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "v2", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Effect(), theCommonBehaviorPackage.getBehavior(), null, "effect", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Guard(), theCommonStructurePackage.getConstraint(), null, "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransition_Kind(), this.getTransitionKind(), "kind", "external", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_RedefinedTransition(), this.getTransition(), null, "redefinedTransition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Source(), this.getVertex(), this.getVertex_Outgoing(), "source", null, 1, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Target(), this.getVertex(), this.getVertex_Incoming(), "target", null, 1, 1, Transition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Trigger(), theCommonBehaviorPackage.getTrigger(), null, "trigger", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Container(), this.getRegion(), this.getRegion_Transition(), "container", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTransition__ContainingStateMachine(), this.getStateMachine(), "containingStateMachine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTransition__RedefinitionContext(), theClassificationPackage.getClassifier(), "redefinitionContext", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protocolConformanceEClass, ProtocolConformance.class, "ProtocolConformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolConformance_GeneralMachine(), this.getProtocolStateMachine(), null, "generalMachine", null, 1, 1, ProtocolConformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProtocolConformance_SpecificMachine(), this.getProtocolStateMachine(), this.getProtocolStateMachine_Conformance(), "specificMachine", null, 1, 1, ProtocolConformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(protocolTransitionEClass, ProtocolTransition.class, "ProtocolTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolTransition_PostCondition(), theCommonStructurePackage.getConstraint(), null, "postCondition", null, 0, 1, ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProtocolTransition_PreCondition(), theCommonStructurePackage.getConstraint(), null, "preCondition", null, 0, 1, ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProtocolTransition_Referred(), theClassificationPackage.getOperation(), null, "referred", null, 0, -1, ProtocolTransition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getProtocolTransition__Referred(), theClassificationPackage.getOperation(), "referred", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(protocolStateMachineEClass, ProtocolStateMachine.class, "ProtocolStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolStateMachine_Conformance(), this.getProtocolConformance(), this.getProtocolConformance_SpecificMachine(), "conformance", null, 0, -1, ProtocolStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pseudostateKindEEnum, PseudostateKind.class, "PseudostateKind");
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.INITIAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.DEEP_HISTORY);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.SHALLOW_HISTORY);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.JOIN);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.FORK);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.JUNCTION);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.CHOICE);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.ENTRY_POINT);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.EXIT_POINT);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.TERMINATE);

		initEEnum(transitionKindEEnum, TransitionKind.class, "TransitionKind");
		addEEnumLiteral(transitionKindEEnum, TransitionKind.INTERNAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.LOCAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.EXTERNAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// subsets
		createSubsetsAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// redefines
		createRedefinesAnnotations();
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
			 "originalName", "StateMachines"
		   });	
		addAnnotation
		  (getRegion__BelongsToPsm(), 
		   source, 
		   new String[] {
			 "originalName", "belongsToPSM"
		   });	
		addAnnotation
		  (getStateMachine__Lca__Vertex_Vertex(), 
		   source, 
		   new String[] {
			 "originalName", "LCA"
		   });	
		addAnnotation
		  (getStateMachine__LcaState__Vertex_Vertex(), 
		   source, 
		   new String[] {
			 "originalName", "LCAState"
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
		  (connectionPointReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "exit_pseudostates entry_pseudostates"
		   });	
		addAnnotation
		  (regionEClass, 
		   source, 
		   new String[] {
			 "constraints", "deep_history_vertex shallow_history_vertex owned initial_vertex"
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "constraints", "entry_or_exit submachine_states composite_states destinations_or_sources_of_transitions submachine_or_regions"
		   });	
		addAnnotation
		  (pseudostateEClass, 
		   source, 
		   new String[] {
			 "constraints", "transitions_outgoing choice_vertex outgoing_from_initial join_vertex junction_vertex history_vertices initial_vertex fork_vertex transitions_incoming"
		   });	
		addAnnotation
		  (stateMachineEClass, 
		   source, 
		   new String[] {
			 "constraints", "connection_points classifier_context method context_classifier"
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "state_is_external join_segment_guards state_is_internal outgoing_pseudostates join_segment_state fork_segment_state state_is_local initial_transition fork_segment_guards"
		   });	
		addAnnotation
		  (finalStateEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_exit_behavior no_outgoing_transitions no_regions cannot_reference_submachine no_entry_behavior no_state_behavior"
		   });	
		addAnnotation
		  (protocolTransitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "refers_to_operation associated_actions belongs_to_psm"
		   });	
		addAnnotation
		  (protocolStateMachineEClass, 
		   source, 
		   new String[] {
			 "constraints", "classifier_context deep_or_shallow_history entry_exit_do protocol_transitions"
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
		  (connectionPointReferenceEClass, 
		   source, 
		   new String[] {
			 "exit_pseudostates", "exit->forAll(kind = PseudostateKind::exitPoint)",
			 "entry_pseudostates", "entry->forAll(kind = PseudostateKind::entryPoint)"
		   });	
		addAnnotation
		  (getVertex__ContainingStateMachine(), 
		   source, 
		   new String[] {
			 "body", "if container <> null\nthen\n-- the container is a region\n   container.containingStateMachine()\nelse \n   if (self.oclIsKindOf(Pseudostate)) and ((self.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint) or (self.oclAsType(Pseudostate).kind = PseudostateKind::exitPoint)) then\n      self.oclAsType(Pseudostate).stateMachine\n   else \n      if (self.oclIsKindOf(ConnectionPointReference)) then\n          self.oclAsType(ConnectionPointReference).state.containingStateMachine() -- no other valid cases possible\n      else \n          null\n      endif\n   endif\nendif"
		   });	
		addAnnotation
		  (getVertex__Incoming(), 
		   source, 
		   new String[] {
			 "body", "Transition.allInstances()->select(target=self)"
		   });	
		addAnnotation
		  (getVertex__Outgoing(), 
		   source, 
		   new String[] {
			 "body", "Transition.allInstances()->select(source=self)"
		   });	
		addAnnotation
		  (getVertex__IsContainedInState__State(), 
		   source, 
		   new String[] {
			 "body", "if not s.isComposite() or container->isEmpty() then\r\n\tfalse\r\nelse\r\n\tif container.state = s then \r\n\t\ttrue\r\n\telse\r\n\t\tcontainer.state.isContainedInState(s)\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getVertex__IsContainedInRegion__Region(), 
		   source, 
		   new String[] {
			 "body", "if (container = r) then\r\n\ttrue\r\nelse\r\n\tif (r.state->isEmpty()) then\r\n\t\tfalse\r\n\telse\r\n\t\tcontainer.state.isContainedInRegion(r)\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (regionEClass, 
		   source, 
		   new String[] {
			 "deep_history_vertex", "self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->\n   select(kind = PseudostateKind::deepHistory)->size() <= 1\n",
			 "shallow_history_vertex", "subvertex->select(oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->\n  select(kind = PseudostateKind::shallowHistory)->size() <= 1\n",
			 "owned", "(stateMachine <> null implies state = null) and (state <> null implies stateMachine = null)",
			 "initial_vertex", "self.subvertex->select (oclIsKindOf(Pseudostate))->collect(oclAsType(Pseudostate))->\n  select(kind = PseudostateKind::initial)->size() <= 1\n"
		   });	
		addAnnotation
		  (getRegion__BelongsToPsm(), 
		   source, 
		   new String[] {
			 "body", "if  stateMachine <> null \nthen\n  stateMachine.oclIsKindOf(ProtocolStateMachine)\nelse \n  state <> null  implies  state.container.belongsToPSM()\nendif"
		   });	
		addAnnotation
		  (getRegion__ContainingStateMachine(), 
		   source, 
		   new String[] {
			 "body", "if stateMachine = null \nthen\n  state.containingStateMachine()\nelse\n  stateMachine\nendif"
		   });	
		addAnnotation
		  (getRegion__RedefinitionContext(), 
		   source, 
		   new String[] {
			 "body", "let sm : StateMachine = containingStateMachine() in\nif sm._\'context\' = null or sm.general->notEmpty() then\n  sm\nelse\n  sm._\'context\'\nendif"
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "entry_or_exit", "connectionPoint->forAll(kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)",
			 "submachine_states", "isSubmachineState implies connection->notEmpty( )",
			 "composite_states", "connectionPoint->notEmpty() implies isComposite",
			 "destinations_or_sources_of_transitions", "self.isSubmachineState implies (self.connection->forAll (cp |\r\n  cp.entry->forAll (ps | ps.stateMachine = self.submachine) and\r\n  cp.exit->forAll (ps | ps.stateMachine = self.submachine)))",
			 "submachine_or_regions", "isComposite implies not isSubmachineState"
		   });	
		addAnnotation
		  (getState__IsComposite(), 
		   source, 
		   new String[] {
			 "body", "region->notEmpty()"
		   });	
		addAnnotation
		  (getState__IsOrthogonal(), 
		   source, 
		   new String[] {
			 "body", "region->size () > 1"
		   });	
		addAnnotation
		  (getState__IsSimple(), 
		   source, 
		   new String[] {
			 "body", "(region->isEmpty()) and not isSubmachineState()"
		   });	
		addAnnotation
		  (getState__IsSubmachineState(), 
		   source, 
		   new String[] {
			 "body", "submachine <> null"
		   });	
		addAnnotation
		  (getState__RedefinitionContext(), 
		   source, 
		   new String[] {
			 "body", "let sm : StateMachine = containingStateMachine() in\nif sm._\'context\' = null or sm.general->notEmpty() then\n  sm\nelse\n  sm._\'context\'\nendif"
		   });	
		addAnnotation
		  (pseudostateEClass, 
		   source, 
		   new String[] {
			 "transitions_outgoing", "(kind = PseudostateKind::fork) implies\r\n\r\n-- for any pair of outgoing transitions there exists an orthogonal state which contains the targets of these transitions \r\n-- such that these targets belong to different regions of that orthogonal state \r\n\r\noutgoing->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.target, t2.target) in\r\n\t((contState <> null) and (contState.region\r\n\t\t->exists(r1:Region, r2: Region | (r1 <> r2) and t1.target.isContainedInRegion(r1) and t2.target.isContainedInRegion(r2)))))\r\n\t",
			 "choice_vertex", "(kind = PseudostateKind::choice) implies (incoming->size() >= 1 and outgoing->size() >= 1)\n",
			 "outgoing_from_initial", "(kind = PseudostateKind::initial) implies (outgoing.guard = null and outgoing.trigger->isEmpty())",
			 "join_vertex", "(kind = PseudostateKind::join) implies (outgoing->size() = 1 and incoming->size() >= 2)\n",
			 "junction_vertex", "(kind = PseudostateKind::junction) implies (incoming->size() >= 1 and outgoing->size() >= 1)\n",
			 "history_vertices", "((kind = PseudostateKind::deepHistory) or (kind = PseudostateKind::shallowHistory)) implies (outgoing->size() <= 1)\n",
			 "initial_vertex", "(kind = PseudostateKind::initial) implies (outgoing->size() <= 1)",
			 "fork_vertex", "(kind = PseudostateKind::fork) implies (incoming->size() = 1 and outgoing->size() >= 2)\n",
			 "transitions_incoming", "(kind = PseudostateKind::join) implies\n\n-- for any pair of incoming transitions there exists an orthogonal state which contains the source vetices of these transitions \n-- such that these source vertices belong to different regions of that orthogonal state \n\nincoming->forAll(t1:Transition, t2:Transition | let contState:State = containingStateMachine().LCAState(t1.source, t2.source) in\n\t((contState <> null) and (contState.region\n\t\t->exists(r1:Region, r2: Region | (r1 <> r2) and t1.source.isContainedInRegion(r1) and t2.source.isContainedInRegion(r2)))))"
		   });	
		addAnnotation
		  (stateMachineEClass, 
		   source, 
		   new String[] {
			 "connection_points", "connectionPoint->forAll (kind = PseudostateKind::entryPoint or kind = PseudostateKind::exitPoint)",
			 "classifier_context", "_\'context\' <> null implies not _\'context\'.oclIsKindOf(Interface)",
			 "method", "specification <> null implies connectionPoint->isEmpty()",
			 "context_classifier", "specification <> null implies ( _\'context\' <> null and specification.featuringClassifier->exists(c | c = _\'context\'))"
		   });	
		addAnnotation
		  (getStateMachine__Lca__Vertex_Vertex(), 
		   source, 
		   new String[] {
			 "body", "if ancestor(s1, s2) then \r\n    s2.container\r\nelse\r\n\tif ancestor(s2, s1) then\r\n\t    s1.container \r\n\telse \r\n\t    LCA(s1.container.state, s2.container.state)\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getStateMachine__Ancestor__Vertex_Vertex(), 
		   source, 
		   new String[] {
			 "body", "if (s2 = s1) then \r\n\ttrue \r\nelse \r\n\tif s1.container.stateMachine->notEmpty() then \r\n\t    true\r\n\telse \r\n\t    if s2.container.stateMachine->notEmpty() then \r\n\t        false\r\n\t    else\r\n\t        ancestor(s1, s2.container.state)\r\n\t     endif\r\n\t endif\r\nendif"
		   });	
		addAnnotation
		  (getStateMachine__LcaState__Vertex_Vertex(), 
		   source, 
		   new String[] {
			 "body", "if v2.oclIsTypeOf(State) and ancestor(v1, v2) then\r\n\tv2.oclAsType(State)\r\nelse if v1.oclIsTypeOf(State) and ancestor(v2, v1) then\r\n\tv1.oclAsType(State)\r\nelse if (v1.container.state->isEmpty() or v2.container.state->isEmpty()) then \r\n\tnull.oclAsType(State)\r\nelse LCAState(v1.container.state, v2.container.state)\r\nendif endif endif"
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "state_is_external", "(kind = TransitionKind::external) implies\r\n\tnot (source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint)",
			 "join_segment_guards", "(target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (guard = null and trigger->isEmpty())",
			 "state_is_internal", "(kind = TransitionKind::internal) implies\r\n\t\t(source.oclIsKindOf (State) and source = target)",
			 "outgoing_pseudostates", "source.oclIsKindOf(Pseudostate) and (source.oclAsType(Pseudostate).kind <> PseudostateKind::initial) implies trigger->isEmpty()",
			 "join_segment_state", "(target.oclIsKindOf(Pseudostate) and target.oclAsType(Pseudostate).kind = PseudostateKind::join) implies (source.oclIsKindOf(State))",
			 "fork_segment_state", "(source.oclIsKindOf(Pseudostate) and  source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (target.oclIsKindOf(State))",
			 "state_is_local", "(kind = TransitionKind::local) implies\r\n\t\t((source.oclIsKindOf (State) and source.oclAsType(State).isComposite) or\r\n\t\t(source.oclIsKindOf (Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint))",
			 "initial_transition", "(source.oclIsKindOf(Pseudostate) and container.stateMachine->notEmpty()) implies\n\ttrigger->isEmpty()\n",
			 "fork_segment_guards", "(source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::fork) implies (guard = null and trigger->isEmpty())"
		   });	
		addAnnotation
		  (getTransition__ContainingStateMachine(), 
		   source, 
		   new String[] {
			 "body", "container.containingStateMachine()"
		   });	
		addAnnotation
		  (getTransition__RedefinitionContext(), 
		   source, 
		   new String[] {
			 "body", "let sm : StateMachine = containingStateMachine() in\nif sm._\'context\' = null or sm.general->notEmpty() then\n  sm\nelse\n  sm._\'context\'\nendif"
		   });	
		addAnnotation
		  (finalStateEClass, 
		   source, 
		   new String[] {
			 "no_exit_behavior", "exit->isEmpty()",
			 "no_outgoing_transitions", "outgoing->size() = 0",
			 "no_regions", "region->size() = 0",
			 "cannot_reference_submachine", "submachine->isEmpty()",
			 "no_entry_behavior", "entry->isEmpty()",
			 "no_state_behavior", "doActivity->isEmpty()"
		   });	
		addAnnotation
		  (protocolTransitionEClass, 
		   source, 
		   new String[] {
			 "refers_to_operation", "if (referred()->notEmpty() and containingStateMachine()._\'context\'->notEmpty()) then \r\n    containingStateMachine()._\'context\'.oclAsType(BehavioredClassifier).allFeatures()->includesAll(referred())\r\nelse true endif",
			 "associated_actions", "effect = null",
			 "belongs_to_psm", "container.belongsToPSM()"
		   });	
		addAnnotation
		  (getProtocolTransition__Referred(), 
		   source, 
		   new String[] {
			 "body", "trigger->collect(event)->select(oclIsKindOf(CallEvent))->collect(oclAsType(CallEvent).operation)->asSet()"
		   });	
		addAnnotation
		  (protocolStateMachineEClass, 
		   source, 
		   new String[] {
			 "classifier_context", "_\'context\' <> null and specification = null",
			 "deep_or_shallow_history", "region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Pseudostate) implies\n((v.oclAsType(Pseudostate).kind <>  PseudostateKind::deepHistory) and (v.oclAsType(Pseudostate).kind <> PseudostateKind::shallowHistory))))\n",
			 "entry_exit_do", "region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies\n(v.oclAsType(State).entry->isEmpty() and v.oclAsType(State).exit->isEmpty() and v.oclAsType(State).doActivity->isEmpty())))\n",
			 "protocol_transitions", "region->forAll(r | r.transition->forAll(t | t.oclIsTypeOf(ProtocolTransition)))"
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
		  (getConnectionPointReference_State(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVertex_Container(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRegion_ExtendedRegion(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRegion_State(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRegion_StateMachine(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRegion_Transition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRegion_Subvertex(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_Connection(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_ConnectionPoint(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_DeferrableTrigger(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_DoActivity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_Entry(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_Exit(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_RedefinedState(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_StateInvariant(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_Region(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPseudostate_StateMachine(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPseudostate_State(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateMachine_Region(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateMachine_ConnectionPoint(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransition_Effect(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransition_Guard(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransition_RedefinedTransition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransition_Trigger(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransition_Container(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProtocolConformance_GeneralMachine(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProtocolConformance_SpecificMachine(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProtocolTransition_PostCondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProtocolTransition_PreCondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProtocolStateMachine_Conformance(), 
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
		  (getConnectionPointReference_Entry(), 
		   source, 
		   new String[] {
			 "body", "connectionPointReference"
		   });	
		addAnnotation
		  (getConnectionPointReference_Exit(), 
		   source, 
		   new String[] {
			 "body", "connectionPointReference"
		   });	
		addAnnotation
		  (getRegion_ExtendedRegion(), 
		   source, 
		   new String[] {
			 "body", "region"
		   });	
		addAnnotation
		  (getState_DeferrableTrigger(), 
		   source, 
		   new String[] {
			 "body", "state"
		   });	
		addAnnotation
		  (getState_DoActivity(), 
		   source, 
		   new String[] {
			 "body", "state"
		   });	
		addAnnotation
		  (getState_Entry(), 
		   source, 
		   new String[] {
			 "body", "state"
		   });	
		addAnnotation
		  (getState_Exit(), 
		   source, 
		   new String[] {
			 "body", "state"
		   });	
		addAnnotation
		  (getState_RedefinedState(), 
		   source, 
		   new String[] {
			 "body", "state"
		   });	
		addAnnotation
		  (getState_StateInvariant(), 
		   source, 
		   new String[] {
			 "body", "owningState"
		   });	
		addAnnotation
		  (getStateMachine_ExtendedStateMachine(), 
		   source, 
		   new String[] {
			 "body", "stateMachine"
		   });	
		addAnnotation
		  (getTransition_Effect(), 
		   source, 
		   new String[] {
			 "body", "transition"
		   });	
		addAnnotation
		  (getTransition_Guard(), 
		   source, 
		   new String[] {
			 "body", "transition"
		   });	
		addAnnotation
		  (getTransition_RedefinedTransition(), 
		   source, 
		   new String[] {
			 "body", "transition"
		   });	
		addAnnotation
		  (getTransition_Trigger(), 
		   source, 
		   new String[] {
			 "body", "transition"
		   });	
		addAnnotation
		  (getProtocolConformance_GeneralMachine(), 
		   source, 
		   new String[] {
			 "body", "protocolConformance"
		   });	
		addAnnotation
		  (getProtocolTransition_PostCondition(), 
		   source, 
		   new String[] {
			 "body", "owningTransition"
		   });	
		addAnnotation
		  (getProtocolTransition_PreCondition(), 
		   source, 
		   new String[] {
			 "body", "protocolTransition"
		   });	
		addAnnotation
		  (getProtocolTransition_Referred(), 
		   source, 
		   new String[] {
			 "body", "protocolTransition"
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
		  (regionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateMachineEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";	
		addAnnotation
		  (getStateMachine_ExtendedStateMachine(), 
		   source, 
		   new String[] {
		   });
	}

} //StateMachinesPackageImpl
