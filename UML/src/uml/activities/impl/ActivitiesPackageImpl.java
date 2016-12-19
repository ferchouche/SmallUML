/**
 */
package uml.activities.impl;

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

import uml.activities.ActivitiesFactory;
import uml.activities.ActivitiesPackage;
import uml.activities.Activity;
import uml.activities.ActivityEdge;
import uml.activities.ActivityFinalNode;
import uml.activities.ActivityGroup;
import uml.activities.ActivityNode;
import uml.activities.ActivityParameterNode;
import uml.activities.ActivityPartition;
import uml.activities.CentralBufferNode;
import uml.activities.ControlFlow;
import uml.activities.ControlNode;
import uml.activities.DataStoreNode;
import uml.activities.DecisionNode;
import uml.activities.ExceptionHandler;
import uml.activities.ExecutableNode;
import uml.activities.FinalNode;
import uml.activities.FlowFinalNode;
import uml.activities.ForkNode;
import uml.activities.InitialNode;
import uml.activities.InterruptibleActivityRegion;
import uml.activities.JoinNode;
import uml.activities.MergeNode;
import uml.activities.ObjectFlow;
import uml.activities.ObjectNode;
import uml.activities.ObjectNodeOrderingKind;
import uml.activities.Variable;

import uml.activities.util.ActivitiesValidator;

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
public class ActivitiesPackageImpl extends EPackageImpl implements ActivitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptibleActivityRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityParameterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centralBufferNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectNodeOrderingKindEEnum = null;

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
	 * @see uml.activities.ActivitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitiesPackageImpl() {
		super(eNS_URI, ActivitiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitiesPackage init() {
		if (isInited) return (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);

		// Obtain or create and register package
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivitiesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
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
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) : InformationFlowsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
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
		theInformationFlowsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
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
		theInformationFlowsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theActivitiesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ActivitiesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theActivitiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitiesPackage.eNS_URI, theActivitiesPackage);
		return theActivitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edge() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Node() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Variable() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_StructuredNode() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Group() {
		return (EReference)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsReadOnly() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsSingleExecution() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Partition() {
		return (EReference)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Guard() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InGroup() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Interrupts() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InPartition() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InStructuredNode() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_RedefinedEdge() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Weight() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Activity() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityGroup() {
		return activityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_ContainedNode() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_InActivity() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_Subgroup() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_SuperGroup() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_ContainedEdge() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityGroup__ContainingActivity() {
		return activityGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Activity() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InInterruptibleRegion() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InPartition() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InStructuredNode() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_RedefinedNode() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InGroup() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNode__ActivityNode_containingActivity() {
		return activityNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptibleActivityRegion() {
		return interruptibleActivityRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptibleActivityRegion_InterruptingEdge() {
		return (EReference)interruptibleActivityRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptibleActivityRegion_Node() {
		return (EReference)interruptibleActivityRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPartition() {
		return activityPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Edge() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsDimension() {
		return (EAttribute)activityPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsExternal() {
		return (EAttribute)activityPartitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Represents() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Subpartition() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_SuperPartition() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Node() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableNode_Handler() {
		return (EReference)executableNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandler() {
		return exceptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionInput() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionType() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_HandlerBody() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ProtectedNode() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNode() {
		return objectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_InState() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_IsControlType() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_Ordering() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_Selection() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_UpperBound() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_ActivityScope() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Scope() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__IsAccessibleBy__Action() {
		return variableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode() {
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityParameterNode() {
		return activityParameterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityParameterNode_Parameter() {
		return (EReference)activityParameterNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentralBufferNode() {
		return centralBufferNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStoreNode() {
		return dataStoreNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionNode_DecisionInput() {
		return (EReference)decisionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionNode_DecisionInputFlow() {
		return (EReference)decisionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectFlow() {
		return objectFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMulticast() {
		return (EAttribute)objectFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMultireceive() {
		return (EAttribute)objectFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Selection() {
		return (EReference)objectFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Transformation() {
		return (EReference)objectFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNode() {
		return flowFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinNode_IsCombineDuplicate() {
		return (EAttribute)joinNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinNode_JoinSpec() {
		return (EReference)joinNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectNodeOrderingKind() {
		return objectNodeOrderingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesFactory getActivitiesFactory() {
		return (ActivitiesFactory)getEFactoryInstance();
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
		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__EDGE);
		createEReference(activityEClass, ACTIVITY__NODE);
		createEReference(activityEClass, ACTIVITY__VARIABLE);
		createEReference(activityEClass, ACTIVITY__STRUCTURED_NODE);
		createEReference(activityEClass, ACTIVITY__GROUP);
		createEAttribute(activityEClass, ACTIVITY__IS_READ_ONLY);
		createEAttribute(activityEClass, ACTIVITY__IS_SINGLE_EXECUTION);
		createEReference(activityEClass, ACTIVITY__PARTITION);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__GUARD);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_GROUP);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__INTERRUPTS);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_PARTITION);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__REDEFINED_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__WEIGHT);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__ACTIVITY);

		activityGroupEClass = createEClass(ACTIVITY_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__CONTAINED_NODE);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__IN_ACTIVITY);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__SUBGROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__SUPER_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__CONTAINED_EDGE);
		createEOperation(activityGroupEClass, ACTIVITY_GROUP___CONTAINING_ACTIVITY);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVITY);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_PARTITION);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_STRUCTURED_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__REDEFINED_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_GROUP);
		createEOperation(activityNodeEClass, ACTIVITY_NODE___ACTIVITY_NODE_CONTAINING_ACTIVITY);

		interruptibleActivityRegionEClass = createEClass(INTERRUPTIBLE_ACTIVITY_REGION);
		createEReference(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE);
		createEReference(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION__NODE);

		activityPartitionEClass = createEClass(ACTIVITY_PARTITION);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__EDGE);
		createEAttribute(activityPartitionEClass, ACTIVITY_PARTITION__IS_DIMENSION);
		createEAttribute(activityPartitionEClass, ACTIVITY_PARTITION__IS_EXTERNAL);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__REPRESENTS);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__SUBPARTITION);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__SUPER_PARTITION);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__NODE);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);
		createEReference(executableNodeEClass, EXECUTABLE_NODE__HANDLER);

		exceptionHandlerEClass = createEClass(EXCEPTION_HANDLER);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION_INPUT);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION_TYPE);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__HANDLER_BODY);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__PROTECTED_NODE);

		objectNodeEClass = createEClass(OBJECT_NODE);
		createEReference(objectNodeEClass, OBJECT_NODE__IN_STATE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__IS_CONTROL_TYPE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__ORDERING);
		createEReference(objectNodeEClass, OBJECT_NODE__SELECTION);
		createEReference(objectNodeEClass, OBJECT_NODE__UPPER_BOUND);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__ACTIVITY_SCOPE);
		createEReference(variableEClass, VARIABLE__SCOPE);
		createEOperation(variableEClass, VARIABLE___IS_ACCESSIBLE_BY__ACTION);

		activityFinalNodeEClass = createEClass(ACTIVITY_FINAL_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);

		controlNodeEClass = createEClass(CONTROL_NODE);

		activityParameterNodeEClass = createEClass(ACTIVITY_PARAMETER_NODE);
		createEReference(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE__PARAMETER);

		centralBufferNodeEClass = createEClass(CENTRAL_BUFFER_NODE);

		controlFlowEClass = createEClass(CONTROL_FLOW);

		dataStoreNodeEClass = createEClass(DATA_STORE_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);
		createEReference(decisionNodeEClass, DECISION_NODE__DECISION_INPUT);
		createEReference(decisionNodeEClass, DECISION_NODE__DECISION_INPUT_FLOW);

		objectFlowEClass = createEClass(OBJECT_FLOW);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTICAST);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTIRECEIVE);
		createEReference(objectFlowEClass, OBJECT_FLOW__SELECTION);
		createEReference(objectFlowEClass, OBJECT_FLOW__TRANSFORMATION);

		flowFinalNodeEClass = createEClass(FLOW_FINAL_NODE);

		forkNodeEClass = createEClass(FORK_NODE);

		initialNodeEClass = createEClass(INITIAL_NODE);

		joinNodeEClass = createEClass(JOIN_NODE);
		createEAttribute(joinNodeEClass, JOIN_NODE__IS_COMBINE_DUPLICATE);
		createEReference(joinNodeEClass, JOIN_NODE__JOIN_SPEC);

		mergeNodeEClass = createEClass(MERGE_NODE);

		// Create enums
		objectNodeOrderingKindEEnum = createEEnum(OBJECT_NODE_ORDERING_KIND);
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
		CommonBehaviorPackage theCommonBehaviorPackage = (CommonBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI);
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		CommonStructurePackage theCommonStructurePackage = (CommonStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI);
		StateMachinesPackage theStateMachinesPackage = (StateMachinesPackage)EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI);
		StructuredClassifiersPackage theStructuredClassifiersPackage = (StructuredClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(theCommonBehaviorPackage.getBehavior());
		activityEdgeEClass.getESuperTypes().add(theClassificationPackage.getRedefinableElement());
		activityGroupEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		activityNodeEClass.getESuperTypes().add(theClassificationPackage.getRedefinableElement());
		interruptibleActivityRegionEClass.getESuperTypes().add(this.getActivityGroup());
		activityPartitionEClass.getESuperTypes().add(this.getActivityGroup());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		exceptionHandlerEClass.getESuperTypes().add(theCommonStructurePackage.getElement());
		objectNodeEClass.getESuperTypes().add(this.getActivityNode());
		objectNodeEClass.getESuperTypes().add(theCommonStructurePackage.getTypedElement());
		variableEClass.getESuperTypes().add(theStructuredClassifiersPackage.getConnectableElement());
		variableEClass.getESuperTypes().add(theCommonStructurePackage.getMultiplicityElement());
		activityFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		finalNodeEClass.getESuperTypes().add(this.getControlNode());
		controlNodeEClass.getESuperTypes().add(this.getActivityNode());
		activityParameterNodeEClass.getESuperTypes().add(this.getObjectNode());
		centralBufferNodeEClass.getESuperTypes().add(this.getObjectNode());
		controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
		dataStoreNodeEClass.getESuperTypes().add(this.getCentralBufferNode());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		objectFlowEClass.getESuperTypes().add(this.getActivityEdge());
		flowFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		initialNodeEClass.getESuperTypes().add(this.getControlNode());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Edge(), this.getActivityEdge(), this.getActivityEdge_Activity(), "edge", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Node(), this.getActivityNode(), this.getActivityNode_Activity(), "node", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Variable(), this.getVariable(), this.getVariable_ActivityScope(), "variable", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_StructuredNode(), theActionsPackage.getStructuredActivityNode(), null, "structuredNode", null, 0, -1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Group(), this.getActivityGroup(), this.getActivityGroup_InActivity(), "group", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivity_IsReadOnly(), theTypesPackage.getBoolean(), "isReadOnly", "false", 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivity_IsSingleExecution(), theTypesPackage.getBoolean(), "isSingleExecution", "false", 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Partition(), this.getActivityPartition(), null, "partition", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Guard(), theValuesPackage.getValueSpecification(), null, "guard", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_InGroup(), this.getActivityGroup(), this.getActivityGroup_ContainedEdge(), "inGroup", null, 0, -1, ActivityEdge.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Interrupts(), this.getInterruptibleActivityRegion(), this.getInterruptibleActivityRegion_InterruptingEdge(), "interrupts", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_InPartition(), this.getActivityPartition(), this.getActivityPartition_Edge(), "inPartition", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_InStructuredNode(), theActionsPackage.getStructuredActivityNode(), theActionsPackage.getStructuredActivityNode_Edge(), "inStructuredNode", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_RedefinedEdge(), this.getActivityEdge(), null, "redefinedEdge", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Weight(), theValuesPackage.getValueSpecification(), null, "weight", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Activity(), this.getActivity(), this.getActivity_Edge(), "activity", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityGroupEClass, ActivityGroup.class, "ActivityGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityGroup_ContainedNode(), this.getActivityNode(), this.getActivityNode_InGroup(), "containedNode", null, 0, -1, ActivityGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityGroup_InActivity(), this.getActivity(), this.getActivity_Group(), "inActivity", null, 0, 1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityGroup_Subgroup(), this.getActivityGroup(), this.getActivityGroup_SuperGroup(), "subgroup", null, 0, -1, ActivityGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityGroup_SuperGroup(), this.getActivityGroup(), this.getActivityGroup_Subgroup(), "superGroup", null, 0, 1, ActivityGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityGroup_ContainedEdge(), this.getActivityEdge(), this.getActivityEdge_InGroup(), "containedEdge", null, 0, -1, ActivityGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getActivityGroup__ContainingActivity(), this.getActivity(), "containingActivity", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Activity(), this.getActivity(), this.getActivity_Node(), "activity", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InInterruptibleRegion(), this.getInterruptibleActivityRegion(), this.getInterruptibleActivityRegion_Node(), "inInterruptibleRegion", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InPartition(), this.getActivityPartition(), this.getActivityPartition_Node(), "inPartition", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InStructuredNode(), theActionsPackage.getStructuredActivityNode(), theActionsPackage.getStructuredActivityNode_Node(), "inStructuredNode", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_RedefinedNode(), this.getActivityNode(), null, "redefinedNode", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InGroup(), this.getActivityGroup(), this.getActivityGroup_ContainedNode(), "inGroup", null, 0, -1, ActivityNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getActivityNode__ActivityNode_containingActivity(), this.getActivity(), "ActivityNode_containingActivity", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(interruptibleActivityRegionEClass, InterruptibleActivityRegion.class, "InterruptibleActivityRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterruptibleActivityRegion_InterruptingEdge(), this.getActivityEdge(), this.getActivityEdge_Interrupts(), "interruptingEdge", null, 0, -1, InterruptibleActivityRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterruptibleActivityRegion_Node(), this.getActivityNode(), this.getActivityNode_InInterruptibleRegion(), "node", null, 0, -1, InterruptibleActivityRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityPartitionEClass, ActivityPartition.class, "ActivityPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityPartition_Edge(), this.getActivityEdge(), this.getActivityEdge_InPartition(), "edge", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivityPartition_IsDimension(), theTypesPackage.getBoolean(), "isDimension", "false", 1, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivityPartition_IsExternal(), theTypesPackage.getBoolean(), "isExternal", "false", 1, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Represents(), theCommonStructurePackage.getElement(), null, "represents", null, 0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Subpartition(), this.getActivityPartition(), this.getActivityPartition_SuperPartition(), "subpartition", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_SuperPartition(), this.getActivityPartition(), this.getActivityPartition_Subpartition(), "superPartition", null, 0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Node(), this.getActivityNode(), this.getActivityNode_InPartition(), "node", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutableNode_Handler(), this.getExceptionHandler(), this.getExceptionHandler_ProtectedNode(), "handler", null, 0, -1, ExecutableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exceptionHandlerEClass, ExceptionHandler.class, "ExceptionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionHandler_ExceptionInput(), this.getObjectNode(), null, "exceptionInput", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExceptionHandler_ExceptionType(), theClassificationPackage.getClassifier(), null, "exceptionType", null, 1, -1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExceptionHandler_HandlerBody(), this.getExecutableNode(), null, "handlerBody", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExceptionHandler_ProtectedNode(), this.getExecutableNode(), this.getExecutableNode_Handler(), "protectedNode", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectNode_InState(), theStateMachinesPackage.getState(), null, "inState", null, 0, -1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectNode_IsControlType(), theTypesPackage.getBoolean(), "isControlType", "false", 1, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectNode_Ordering(), this.getObjectNodeOrderingKind(), "ordering", "fifo", 1, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectNode_Selection(), theCommonBehaviorPackage.getBehavior(), null, "selection", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectNode_UpperBound(), theValuesPackage.getValueSpecification(), null, "upperBound", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_ActivityScope(), this.getActivity(), this.getActivity_Variable(), "activityScope", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariable_Scope(), theActionsPackage.getStructuredActivityNode(), theActionsPackage.getStructuredActivityNode_Variable(), "scope", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getVariable__IsAccessibleBy__Action(), theTypesPackage.getBoolean(), "isAccessibleBy", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theActionsPackage.getAction(), "a", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityParameterNodeEClass, ActivityParameterNode.class, "ActivityParameterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityParameterNode_Parameter(), theClassificationPackage.getParameter(), null, "parameter", null, 1, 1, ActivityParameterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(centralBufferNodeEClass, CentralBufferNode.class, "CentralBufferNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataStoreNodeEClass, DataStoreNode.class, "DataStoreNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionNode_DecisionInput(), theCommonBehaviorPackage.getBehavior(), null, "decisionInput", null, 0, 1, DecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDecisionNode_DecisionInputFlow(), this.getObjectFlow(), null, "decisionInputFlow", null, 0, 1, DecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectFlowEClass, ObjectFlow.class, "ObjectFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectFlow_IsMulticast(), theTypesPackage.getBoolean(), "isMulticast", "false", 1, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectFlow_IsMultireceive(), theTypesPackage.getBoolean(), "isMultireceive", "false", 1, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectFlow_Selection(), theCommonBehaviorPackage.getBehavior(), null, "selection", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectFlow_Transformation(), theCommonBehaviorPackage.getBehavior(), null, "transformation", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowFinalNodeEClass, FlowFinalNode.class, "FlowFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinNode_IsCombineDuplicate(), theTypesPackage.getBoolean(), "isCombineDuplicate", "true", 1, 1, JoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getJoinNode_JoinSpec(), theValuesPackage.getValueSpecification(), null, "joinSpec", null, 0, 1, JoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.class, "ObjectNodeOrderingKind");
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.UNORDERED);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.ORDERED);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.LIFO);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.FIFO);

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
		// union
		createUnionAnnotations();
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
			 "originalName", "Activities"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "originalName", "LIFO"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "originalName", "FIFO"
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
		  (activityEClass, 
		   source, 
		   new String[] {
			 "constraints", "maximum_one_parameter_node maximum_two_parameter_nodes"
		   });	
		addAnnotation
		  (activityEdgeEClass, 
		   source, 
		   new String[] {
			 "constraints", "source_and_target"
		   });	
		addAnnotation
		  (activityGroupEClass, 
		   source, 
		   new String[] {
			 "constraints", "nodes_and_edges not_contained"
		   });	
		addAnnotation
		  (interruptibleActivityRegionEClass, 
		   source, 
		   new String[] {
			 "constraints", "interrupting_edges"
		   });	
		addAnnotation
		  (activityPartitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "represents_classifier represents_property_and_is_contained represents_property dimension_not_contained"
		   });	
		addAnnotation
		  (exceptionHandlerEClass, 
		   source, 
		   new String[] {
			 "constraints", "handler_body_edges output_pins one_input edge_source_target handler_body_owner exception_input_type"
		   });	
		addAnnotation
		  (objectNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "input_output_parameter selection_behavior object_flow_edges"
		   });	
		addAnnotation
		  (finalNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_outgoing_edges"
		   });	
		addAnnotation
		  (activityParameterNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_outgoing_edges has_parameters same_type no_incoming_edges no_edges"
		   });	
		addAnnotation
		  (controlFlowEClass, 
		   source, 
		   new String[] {
			 "constraints", "object_nodes"
		   });	
		addAnnotation
		  (decisionNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "zero_input_parameters edges decision_input_flow_incoming two_input_parameters incoming_outgoing_edges incoming_control_one_input_parameter parameters incoming_object_one_input_parameter"
		   });	
		addAnnotation
		  (objectFlowEClass, 
		   source, 
		   new String[] {
			 "constraints", "input_and_output_parameter no_executable_nodes transformation_behavior selection_behavior compatible_types same_upper_bounds target is_multicast_or_is_multireceive"
		   });	
		addAnnotation
		  (forkNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "edges one_incoming_edge"
		   });	
		addAnnotation
		  (initialNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_incoming_edges control_edges"
		   });	
		addAnnotation
		  (joinNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "one_outgoing_edge incoming_object_flow"
		   });	
		addAnnotation
		  (mergeNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "one_outgoing_edge edges"
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
		  (activityEClass, 
		   source, 
		   new String[] {
			 "maximum_one_parameter_node", "ownedParameter->forAll(p | \r\n   p.direction <> ParameterDirectionKind::inout implies node->select(\r\n       oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p)->size()= 1)",
			 "maximum_two_parameter_nodes", "ownedParameter->forAll(p | \r\np.direction = ParameterDirectionKind::inout implies\r\nlet associatedNodes : Set(ActivityNode) = node->select(\r\n       oclIsKindOf(ActivityParameterNode) and oclAsType(ActivityParameterNode).parameter = p) in \r\n  associatedNodes->size()=2 and\r\n  associatedNodes->select(incoming->notEmpty())->size()<=1 and\r\n  associatedNodes->select(outgoing->notEmpty())->size()<=1\r\n)\r\n"
		   });	
		addAnnotation
		  (activityEdgeEClass, 
		   source, 
		   new String[] {
			 "source_and_target", "activity<>null implies source.containingActivity() = activity and target.containingActivity() = activity"
		   });	
		addAnnotation
		  (activityGroupEClass, 
		   source, 
		   new String[] {
			 "nodes_and_edges", "containedNode->forAll(activity = self.containingActivity()) and \r\ncontainedEdge->forAll(activity = self.containingActivity())",
			 "not_contained", "subgroup->closure(subgroup).containedNode->excludesAll(containedNode) and\r\nsuperGroup->closure(superGroup).containedNode->excludesAll(containedNode) and \r\nsubgroup->closure(subgroup).containedEdge->excludesAll(containedEdge) and \r\nsuperGroup->closure(superGroup).containedEdge->excludesAll(containedEdge)"
		   });	
		addAnnotation
		  (getActivityGroup__ContainingActivity(), 
		   source, 
		   new String[] {
			 "body", "if superGroup<>null then superGroup.containingActivity()\r\nelse inActivity\r\nendif"
		   });	
		addAnnotation
		  (getActivityNode__ActivityNode_containingActivity(), 
		   source, 
		   new String[] {
			 "body", "if inStructuredNode<>null then inStructuredNode.containingActivity()\r\nelse activity\r\nendif"
		   });	
		addAnnotation
		  (interruptibleActivityRegionEClass, 
		   source, 
		   new String[] {
			 "interrupting_edges", "interruptingEdge->forAll(edge | \r\n  node->includes(edge.source) and node->excludes(edge.target) and edge.target.containingActivity() = inActivity)"
		   });	
		addAnnotation
		  (activityPartitionEClass, 
		   source, 
		   new String[] {
			 "represents_classifier", "(not isExternal and represents.oclIsKindOf(Classifier) and superPartition->notEmpty()) implies\r\n(\r\n   let representedClassifier : Classifier = represents.oclAsType(Classifier) in\r\n     superPartition.represents.oclIsKindOf(Classifier) and\r\n      let representedSuperClassifier : Classifier = superPartition.represents.oclAsType(Classifier) in\r\n       (representedSuperClassifier.oclIsKindOf(BehavioredClassifier) and representedClassifier.oclIsKindOf(Behavior) and \r\n        representedSuperClassifier.oclAsType(BehavioredClassifier).ownedBehavior->includes(representedClassifier.oclAsType(Behavior))) \r\n       or\r\n       (representedSuperClassifier.oclIsKindOf(Class) and  representedSuperClassifier.oclAsType(Class).nestedClassifier->includes(representedClassifier))\r\n       or\r\n       (Association.allInstances()->exists(a | a.memberEnd->exists(end1 | end1.isComposite and end1.type = representedClassifier and \r\n                                                                      a.memberEnd->exists(end2 | end1<>end2 and end2.type = representedSuperClassifier))))\r\n)",
			 "represents_property_and_is_contained", "(represents.oclIsKindOf(Property) and superPartition->notEmpty()) implies\r\n(\r\n  (superPartition.represents.oclIsKindOf(Classifier) and represents.owner = superPartition.represents) or \r\n  (superPartition.represents.oclIsKindOf(Property) and represents.owner = superPartition.represents.oclAsType(Property).type)\r\n)",
			 "represents_property", "(represents.oclIsKindOf(Property) and superPartition->notEmpty() and superPartition.represents.oclIsKindOf(Classifier)) implies\r\n(\r\n  let representedClassifier : Classifier = superPartition.represents.oclAsType(Classifier)\r\n  in\r\n    superPartition.subpartition->reject(isExternal)->forAll(p | \r\n       p.represents.oclIsKindOf(Property) and p.owner=representedClassifier)\r\n)",
			 "dimension_not_contained", "isDimension implies superPartition->isEmpty()"
		   });	
		addAnnotation
		  (exceptionHandlerEClass, 
		   source, 
		   new String[] {
			 "handler_body_edges", "handlerBody.incoming->isEmpty() and handlerBody.outgoing->isEmpty() and exceptionInput.incoming->isEmpty()",
			 "output_pins", "(protectedNode.oclIsKindOf(Action) and protectedNode.oclAsType(Action).output->notEmpty()) implies\r\n(\r\n  handlerBody.oclIsKindOf(Action) and \r\n  let protectedNodeOutput : OrderedSet(OutputPin) = protectedNode.oclAsType(Action).output,\r\n        handlerBodyOutput : OrderedSet(OutputPin) =  handlerBody.oclAsType(Action).output in\r\n    protectedNodeOutput->size() = handlerBodyOutput->size() and\r\n    Sequence{1..protectedNodeOutput->size()}->forAll(i |\r\n    \thandlerBodyOutput->at(i).type.conformsTo(protectedNodeOutput->at(i).type) and\r\n    \thandlerBodyOutput->at(i).isOrdered=protectedNodeOutput->at(i).isOrdered and\r\n    \thandlerBodyOutput->at(i).compatibleWith(protectedNodeOutput->at(i)))\r\n)",
			 "one_input", "handlerBody.oclIsKindOf(Action) and\r\nlet inputs: OrderedSet(InputPin) = handlerBody.oclAsType(Action).input in\r\ninputs->size()=1 and inputs->first()=exceptionInput",
			 "edge_source_target", "let nodes:Set(ActivityNode) = handlerBody.oclAsType(Action).allOwnedNodes() in\r\nnodes.outgoing->forAll(nodes->includes(target)) and\r\nnodes.incoming->forAll(nodes->includes(source))",
			 "handler_body_owner", "handlerBody.owner=protectedNode.owner",
			 "exception_input_type", "exceptionInput.type=null or \r\nexceptionType->forAll(conformsTo(exceptionInput.type.oclAsType(Classifier)))"
		   });	
		addAnnotation
		  (objectNodeEClass, 
		   source, 
		   new String[] {
			 "input_output_parameter", "selection<>null implies\r\n\tselection.inputParameters()->size()=1 and\r\n\tselection.inputParameters()->forAll(p | not p.isUnique and p.is(0,*) and self.type.conformsTo(p.type)) and\r\n\tselection.outputParameters()->size()=1 and\r\n\t\tselection.inputParameters()->forAll(p | self.type.conformsTo(p.type))\r\n\t",
			 "selection_behavior", "(selection<>null) = (ordering=ObjectNodeOrderingKind::ordered)",
			 "object_flow_edges", "(not isControlType) implies incoming->union(outgoing)->forAll(oclIsKindOf(ObjectFlow))"
		   });	
		addAnnotation
		  (getVariable__IsAccessibleBy__Action(), 
		   source, 
		   new String[] {
			 "body", "if scope<>null then scope.allOwnedNodes()->includes(a)\r\nelse a.containingActivity()=activityScope\r\nendif"
		   });	
		addAnnotation
		  (finalNodeEClass, 
		   source, 
		   new String[] {
			 "no_outgoing_edges", "outgoing->isEmpty()"
		   });	
		addAnnotation
		  (activityParameterNodeEClass, 
		   source, 
		   new String[] {
			 "no_outgoing_edges", "(incoming->notEmpty() and outgoing->isEmpty()) implies \r\n\t(parameter.direction = ParameterDirectionKind::out or \r\n\t parameter.direction = ParameterDirectionKind::inout or \r\n\t parameter.direction = ParameterDirectionKind::return)",
			 "has_parameters", "activity.ownedParameter->includes(parameter)",
			 "same_type", "type = parameter.type",
			 "no_incoming_edges", "(outgoing->notEmpty() and incoming->isEmpty()) implies \r\n\t(parameter.direction = ParameterDirectionKind::_\'in\' or \r\n\t parameter.direction = ParameterDirectionKind::inout)",
			 "no_edges", "incoming->isEmpty() or outgoing->isEmpty()"
		   });	
		addAnnotation
		  (controlFlowEClass, 
		   source, 
		   new String[] {
			 "object_nodes", "(source.oclIsKindOf(ObjectNode) implies source.oclAsType(ObjectNode).isControlType) and \r\n(target.oclIsKindOf(ObjectNode) implies target.oclAsType(ObjectNode).isControlType)"
		   });	
		addAnnotation
		  (decisionNodeEClass, 
		   source, 
		   new String[] {
			 "zero_input_parameters", "(decisionInput<>null and decisionInputFlow=null and incoming->exists(oclIsKindOf(ControlFlow))) implies\r\n   decisionInput.inputParameters()->isEmpty()",
			 "edges", "let allEdges: Set(ActivityEdge) = incoming->union(outgoing) in\r\nlet allRelevantEdges: Set(ActivityEdge) = if decisionInputFlow->notEmpty() then allEdges->excluding(decisionInputFlow) else allEdges endif in\r\nallRelevantEdges->forAll(oclIsKindOf(ControlFlow)) or allRelevantEdges->forAll(oclIsKindOf(ObjectFlow))\r\n",
			 "decision_input_flow_incoming", "incoming->includes(decisionInputFlow)",
			 "two_input_parameters", "(decisionInput<>null and decisionInputFlow<>null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies\r\n\tdecisionInput.inputParameters()->size()=2",
			 "incoming_outgoing_edges", "(incoming->size() = 1 or incoming->size() = 2) and outgoing->size() > 0",
			 "incoming_control_one_input_parameter", "(decisionInput<>null and decisionInputFlow<>null and incoming->exists(oclIsKindOf(ControlFlow))) implies\r\n\tdecisionInput.inputParameters()->size()=1",
			 "parameters", "decisionInput<>null implies \r\n  (decisionInput.ownedParameter->forAll(par | \r\n     par.direction <> ParameterDirectionKind::out and \r\n     par.direction <> ParameterDirectionKind::inout ) and\r\n   decisionInput.ownedParameter->one(par | \r\n     par.direction <> ParameterDirectionKind::return))\r\n     ",
			 "incoming_object_one_input_parameter", "(decisionInput<>null and decisionInputFlow=null and incoming->forAll(oclIsKindOf(ObjectFlow))) implies\r\n\tdecisionInput.inputParameters()->size()=1"
		   });	
		addAnnotation
		  (objectFlowEClass, 
		   source, 
		   new String[] {
			 "input_and_output_parameter", "selection<>null implies\r\n\tselection.inputParameters()->size()=1 and\r\n\tselection.inputParameters()->forAll(not isUnique and is(0,*)) and\r\n\tselection.outputParameters()->size()=1",
			 "no_executable_nodes", "not (source.oclIsKindOf(ExecutableNode) or target.oclIsKindOf(ExecutableNode))",
			 "transformation_behavior", "transformation<>null implies\r\n\ttransformation.inputParameters()->size()=1 and\r\n\ttransformation.outputParameters()->size()=1",
			 "selection_behavior", "selection<>null implies source.oclIsKindOf(ObjectNode)",
			 "is_multicast_or_is_multireceive", "not (isMulticast and isMultireceive)"
		   });	
		addAnnotation
		  (forkNodeEClass, 
		   source, 
		   new String[] {
			 "edges", "let allEdges : Set(ActivityEdge) = incoming->union(outgoing) in\r\nallEdges->forAll(oclIsKindOf(ControlFlow)) or allEdges->forAll(oclIsKindOf(ObjectFlow))\r\n",
			 "one_incoming_edge", "incoming->size()=1"
		   });	
		addAnnotation
		  (initialNodeEClass, 
		   source, 
		   new String[] {
			 "no_incoming_edges", "incoming->isEmpty()",
			 "control_edges", "outgoing->forAll(oclIsKindOf(ControlFlow))"
		   });	
		addAnnotation
		  (joinNodeEClass, 
		   source, 
		   new String[] {
			 "one_outgoing_edge", "outgoing->size() = 1",
			 "incoming_object_flow", "if incoming->exists(oclIsKindOf(ObjectFlow)) then outgoing->forAll(oclIsKindOf(ObjectFlow))\r\nelse outgoing->forAll(oclIsKindOf(ControlFlow))\r\nendif"
		   });	
		addAnnotation
		  (mergeNodeEClass, 
		   source, 
		   new String[] {
			 "one_outgoing_edge", "outgoing->size()=1",
			 "edges", "let allEdges : Set(ActivityEdge) = incoming->union(outgoing) in\r\nallEdges->forAll(oclIsKindOf(ControlFlow)) or allEdges->forAll(oclIsKindOf(ObjectFlow))\r\n"
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
		  (getActivity_Edge(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivity_Node(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivity_Variable(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivity_StructuredNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivity_Group(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivity_Partition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Guard(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_InPartition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_InStructuredNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_RedefinedEdge(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Weight(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Activity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_InActivity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_Subgroup(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_SuperGroup(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_Activity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_InInterruptibleRegion(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_InPartition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_InStructuredNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_RedefinedNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterruptibleActivityRegion_Node(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityPartition_Edge(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityPartition_Subpartition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityPartition_SuperPartition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityPartition_Node(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExecutableNode_Handler(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExceptionHandler_ProtectedNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getObjectNode_UpperBound(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVariable_ActivityScope(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getVariable_Scope(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getJoinNode_JoinSpec(), 
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
		  (getActivity_Partition(), 
		   source, 
		   new String[] {
			 "body", "activity"
		   });	
		addAnnotation
		  (getActivityEdge_Guard(), 
		   source, 
		   new String[] {
			 "body", "activityEdge"
		   });	
		addAnnotation
		  (getActivityEdge_RedefinedEdge(), 
		   source, 
		   new String[] {
			 "body", "activityEdge"
		   });	
		addAnnotation
		  (getActivityEdge_Weight(), 
		   source, 
		   new String[] {
			 "body", "activityEdge"
		   });	
		addAnnotation
		  (getActivityNode_RedefinedNode(), 
		   source, 
		   new String[] {
			 "body", "activityNode"
		   });	
		addAnnotation
		  (getActivityPartition_Represents(), 
		   source, 
		   new String[] {
			 "body", "activityPartition"
		   });	
		addAnnotation
		  (getExceptionHandler_ExceptionInput(), 
		   source, 
		   new String[] {
			 "body", "exceptionHandler"
		   });	
		addAnnotation
		  (getExceptionHandler_ExceptionType(), 
		   source, 
		   new String[] {
			 "body", "exceptionHandler"
		   });	
		addAnnotation
		  (getExceptionHandler_HandlerBody(), 
		   source, 
		   new String[] {
			 "body", "exceptionHandler"
		   });	
		addAnnotation
		  (getObjectNode_InState(), 
		   source, 
		   new String[] {
			 "body", "objectNode"
		   });	
		addAnnotation
		  (getObjectNode_Selection(), 
		   source, 
		   new String[] {
			 "body", "objectNode"
		   });	
		addAnnotation
		  (getObjectNode_UpperBound(), 
		   source, 
		   new String[] {
			 "body", "objectNode"
		   });	
		addAnnotation
		  (getActivityParameterNode_Parameter(), 
		   source, 
		   new String[] {
			 "body", "activityParameterNode"
		   });	
		addAnnotation
		  (getDecisionNode_DecisionInput(), 
		   source, 
		   new String[] {
			 "body", "decisionNode"
		   });	
		addAnnotation
		  (getDecisionNode_DecisionInputFlow(), 
		   source, 
		   new String[] {
			 "body", "decisionNode"
		   });	
		addAnnotation
		  (getObjectFlow_Selection(), 
		   source, 
		   new String[] {
			 "body", "objectFlow"
		   });	
		addAnnotation
		  (getObjectFlow_Transformation(), 
		   source, 
		   new String[] {
			 "body", "objectFlow"
		   });	
		addAnnotation
		  (getJoinNode_JoinSpec(), 
		   source, 
		   new String[] {
			 "body", "joinNode"
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
		  (activityEdgeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (activityNodeEClass, 
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
		  (getActivityEdge_InGroup(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_ContainedNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_Subgroup(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_SuperGroup(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_ContainedEdge(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_InGroup(), 
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
		  (getActivityNode__ActivityNode_containingActivity(), 
		   source, 
		   new String[] {
		   });
	}

} //ActivitiesPackageImpl
