/**
 */
package uml.interactions.impl;

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

import uml.interactions.ActionExecutionSpecification;
import uml.interactions.BehaviorExecutionSpecification;
import uml.interactions.CombinedFragment;
import uml.interactions.ConsiderIgnoreFragment;
import uml.interactions.Continuation;
import uml.interactions.DestructionOccurrenceSpecification;
import uml.interactions.ExecutionOccurrenceSpecification;
import uml.interactions.ExecutionSpecification;
import uml.interactions.Gate;
import uml.interactions.GeneralOrdering;
import uml.interactions.Interaction;
import uml.interactions.InteractionConstraint;
import uml.interactions.InteractionFragment;
import uml.interactions.InteractionOperand;
import uml.interactions.InteractionOperatorKind;
import uml.interactions.InteractionUse;
import uml.interactions.InteractionsFactory;
import uml.interactions.InteractionsPackage;
import uml.interactions.Lifeline;
import uml.interactions.Message;
import uml.interactions.MessageEnd;
import uml.interactions.MessageKind;
import uml.interactions.MessageOccurrenceSpecification;
import uml.interactions.MessageSort;
import uml.interactions.OccurrenceSpecification;
import uml.interactions.PartDecomposition;
import uml.interactions.StateInvariant;

import uml.interactions.util.InteractionsValidator;

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
public class InteractionsPackageImpl extends EPackageImpl implements InteractionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionExecutionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalOrderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorExecutionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass considerIgnoreFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destructionOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateInvariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSortEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionOperatorKindEEnum = null;

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
	 * @see uml.interactions.InteractionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InteractionsPackageImpl() {
		super(eNS_URI, InteractionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InteractionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InteractionsPackage init() {
		if (isInited) return (InteractionsPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI);

		// Obtain or create and register package
		InteractionsPackageImpl theInteractionsPackage = (InteractionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InteractionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InteractionsPackageImpl());

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
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) : InformationFlowsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theInteractionsPackage.createPackageContents();
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
		theInformationFlowsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theInteractionsPackage.initializePackageContents();
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
		theInformationFlowsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theInteractionsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return InteractionsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theInteractionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InteractionsPackage.eNS_URI, theInteractionsPackage);
		return theInteractionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionExecutionSpecification() {
		return actionExecutionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionExecutionSpecification_Action() {
		return (EReference)actionExecutionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionSpecification() {
		return executionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionSpecification_Finish() {
		return (EReference)executionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionSpecification_Start() {
		return (EReference)executionSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFragment() {
		return interactionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_Covered() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingInteraction() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingOperand() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_GeneralOrdering() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeline() {
		return lifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_DecomposedAs() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Interaction() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Represents() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Selector() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_CoveredBy() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartDecomposition() {
		return partDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionUse() {
		return interactionUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ActualGate() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_Argument() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_RefersTo() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ReturnValue() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ReturnValueRecipient() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__IsOutsideCf() {
		return gateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__IsInsideCf() {
		return gateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__IsActual() {
		return gateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__IsFormal() {
		return gateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__GetName() {
		return gateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__Matches__Gate() {
		return gateEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__GetOperand() {
		return gateEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEnd() {
		return messageEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEnd_Message() {
		return (EReference)messageEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageEnd__OppositeEnd() {
		return messageEndEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageEnd__IsSend() {
		return messageEndEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageEnd__IsReceive() {
		return messageEndEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageEnd__EnclosingFragment() {
		return messageEndEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Argument() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Connector() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Interaction() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageKind() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageSort() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_ReceiveEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_SendEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Signature() {
		return (EReference)messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__MessageKind() {
		return messageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Action() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_FormalGate() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Fragment() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Lifeline() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Message() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOperand() {
		return interactionOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Fragment() {
		return (EReference)interactionOperandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Guard() {
		return (EReference)interactionOperandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionConstraint() {
		return interactionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Maxint() {
		return (EReference)interactionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Minint() {
		return (EReference)interactionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralOrdering() {
		return generalOrderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralOrdering_After() {
		return (EReference)generalOrderingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralOrdering_Before() {
		return (EReference)generalOrderingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrenceSpecification() {
		return occurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrenceSpecification_ToAfter() {
		return (EReference)occurrenceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrenceSpecification_ToBefore() {
		return (EReference)occurrenceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorExecutionSpecification() {
		return behaviorExecutionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorExecutionSpecification_Behavior() {
		return (EReference)behaviorExecutionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedFragment() {
		return combinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_CfragmentGate() {
		return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinedFragment_InteractionOperator() {
		return (EAttribute)combinedFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_Operand() {
		return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsiderIgnoreFragment() {
		return considerIgnoreFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsiderIgnoreFragment_Message() {
		return (EReference)considerIgnoreFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuation() {
		return continuationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuation_Setting() {
		return (EAttribute)continuationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestructionOccurrenceSpecification() {
		return destructionOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageOccurrenceSpecification() {
		return messageOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionOccurrenceSpecification() {
		return executionOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionOccurrenceSpecification_Execution() {
		return (EReference)executionOccurrenceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateInvariant() {
		return stateInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateInvariant_Invariant() {
		return (EReference)stateInvariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageKind() {
		return messageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSort() {
		return messageSortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionOperatorKind() {
		return interactionOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionsFactory getInteractionsFactory() {
		return (InteractionsFactory)getEFactoryInstance();
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
		actionExecutionSpecificationEClass = createEClass(ACTION_EXECUTION_SPECIFICATION);
		createEReference(actionExecutionSpecificationEClass, ACTION_EXECUTION_SPECIFICATION__ACTION);

		executionSpecificationEClass = createEClass(EXECUTION_SPECIFICATION);
		createEReference(executionSpecificationEClass, EXECUTION_SPECIFICATION__FINISH);
		createEReference(executionSpecificationEClass, EXECUTION_SPECIFICATION__START);

		interactionFragmentEClass = createEClass(INTERACTION_FRAGMENT);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__COVERED);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__ENCLOSING_OPERAND);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__GENERAL_ORDERING);

		lifelineEClass = createEClass(LIFELINE);
		createEReference(lifelineEClass, LIFELINE__DECOMPOSED_AS);
		createEReference(lifelineEClass, LIFELINE__INTERACTION);
		createEReference(lifelineEClass, LIFELINE__REPRESENTS);
		createEReference(lifelineEClass, LIFELINE__SELECTOR);
		createEReference(lifelineEClass, LIFELINE__COVERED_BY);

		partDecompositionEClass = createEClass(PART_DECOMPOSITION);

		interactionUseEClass = createEClass(INTERACTION_USE);
		createEReference(interactionUseEClass, INTERACTION_USE__ACTUAL_GATE);
		createEReference(interactionUseEClass, INTERACTION_USE__ARGUMENT);
		createEReference(interactionUseEClass, INTERACTION_USE__REFERS_TO);
		createEReference(interactionUseEClass, INTERACTION_USE__RETURN_VALUE);
		createEReference(interactionUseEClass, INTERACTION_USE__RETURN_VALUE_RECIPIENT);

		gateEClass = createEClass(GATE);
		createEOperation(gateEClass, GATE___IS_OUTSIDE_CF);
		createEOperation(gateEClass, GATE___IS_INSIDE_CF);
		createEOperation(gateEClass, GATE___IS_ACTUAL);
		createEOperation(gateEClass, GATE___IS_FORMAL);
		createEOperation(gateEClass, GATE___GET_NAME);
		createEOperation(gateEClass, GATE___MATCHES__GATE);
		createEOperation(gateEClass, GATE___GET_OPERAND);

		messageEndEClass = createEClass(MESSAGE_END);
		createEReference(messageEndEClass, MESSAGE_END__MESSAGE);
		createEOperation(messageEndEClass, MESSAGE_END___OPPOSITE_END);
		createEOperation(messageEndEClass, MESSAGE_END___IS_SEND);
		createEOperation(messageEndEClass, MESSAGE_END___IS_RECEIVE);
		createEOperation(messageEndEClass, MESSAGE_END___ENCLOSING_FRAGMENT);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__ARGUMENT);
		createEReference(messageEClass, MESSAGE__CONNECTOR);
		createEReference(messageEClass, MESSAGE__INTERACTION);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_KIND);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_SORT);
		createEReference(messageEClass, MESSAGE__RECEIVE_EVENT);
		createEReference(messageEClass, MESSAGE__SEND_EVENT);
		createEReference(messageEClass, MESSAGE__SIGNATURE);
		createEOperation(messageEClass, MESSAGE___MESSAGE_KIND);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__ACTION);
		createEReference(interactionEClass, INTERACTION__FORMAL_GATE);
		createEReference(interactionEClass, INTERACTION__FRAGMENT);
		createEReference(interactionEClass, INTERACTION__LIFELINE);
		createEReference(interactionEClass, INTERACTION__MESSAGE);

		interactionOperandEClass = createEClass(INTERACTION_OPERAND);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__FRAGMENT);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__GUARD);

		interactionConstraintEClass = createEClass(INTERACTION_CONSTRAINT);
		createEReference(interactionConstraintEClass, INTERACTION_CONSTRAINT__MAXINT);
		createEReference(interactionConstraintEClass, INTERACTION_CONSTRAINT__MININT);

		generalOrderingEClass = createEClass(GENERAL_ORDERING);
		createEReference(generalOrderingEClass, GENERAL_ORDERING__AFTER);
		createEReference(generalOrderingEClass, GENERAL_ORDERING__BEFORE);

		occurrenceSpecificationEClass = createEClass(OCCURRENCE_SPECIFICATION);
		createEReference(occurrenceSpecificationEClass, OCCURRENCE_SPECIFICATION__TO_AFTER);
		createEReference(occurrenceSpecificationEClass, OCCURRENCE_SPECIFICATION__TO_BEFORE);

		behaviorExecutionSpecificationEClass = createEClass(BEHAVIOR_EXECUTION_SPECIFICATION);
		createEReference(behaviorExecutionSpecificationEClass, BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR);

		combinedFragmentEClass = createEClass(COMBINED_FRAGMENT);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__CFRAGMENT_GATE);
		createEAttribute(combinedFragmentEClass, COMBINED_FRAGMENT__INTERACTION_OPERATOR);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__OPERAND);

		considerIgnoreFragmentEClass = createEClass(CONSIDER_IGNORE_FRAGMENT);
		createEReference(considerIgnoreFragmentEClass, CONSIDER_IGNORE_FRAGMENT__MESSAGE);

		continuationEClass = createEClass(CONTINUATION);
		createEAttribute(continuationEClass, CONTINUATION__SETTING);

		destructionOccurrenceSpecificationEClass = createEClass(DESTRUCTION_OCCURRENCE_SPECIFICATION);

		messageOccurrenceSpecificationEClass = createEClass(MESSAGE_OCCURRENCE_SPECIFICATION);

		executionOccurrenceSpecificationEClass = createEClass(EXECUTION_OCCURRENCE_SPECIFICATION);
		createEReference(executionOccurrenceSpecificationEClass, EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION);

		stateInvariantEClass = createEClass(STATE_INVARIANT);
		createEReference(stateInvariantEClass, STATE_INVARIANT__INVARIANT);

		// Create enums
		messageKindEEnum = createEEnum(MESSAGE_KIND);
		messageSortEEnum = createEEnum(MESSAGE_SORT);
		interactionOperatorKindEEnum = createEEnum(INTERACTION_OPERATOR_KIND);
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
		ActionsPackage theActionsPackage = (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);
		CommonStructurePackage theCommonStructurePackage = (CommonStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI);
		StructuredClassifiersPackage theStructuredClassifiersPackage = (StructuredClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		CommonBehaviorPackage theCommonBehaviorPackage = (CommonBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionExecutionSpecificationEClass.getESuperTypes().add(this.getExecutionSpecification());
		executionSpecificationEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionFragmentEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		lifelineEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		partDecompositionEClass.getESuperTypes().add(this.getInteractionUse());
		interactionUseEClass.getESuperTypes().add(this.getInteractionFragment());
		gateEClass.getESuperTypes().add(this.getMessageEnd());
		messageEndEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		messageEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		interactionEClass.getESuperTypes().add(theCommonBehaviorPackage.getBehavior());
		interactionEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionOperandEClass.getESuperTypes().add(theCommonStructurePackage.getNamespace());
		interactionOperandEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionConstraintEClass.getESuperTypes().add(theCommonStructurePackage.getConstraint());
		generalOrderingEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		occurrenceSpecificationEClass.getESuperTypes().add(this.getInteractionFragment());
		behaviorExecutionSpecificationEClass.getESuperTypes().add(this.getExecutionSpecification());
		combinedFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
		considerIgnoreFragmentEClass.getESuperTypes().add(this.getCombinedFragment());
		continuationEClass.getESuperTypes().add(this.getInteractionFragment());
		destructionOccurrenceSpecificationEClass.getESuperTypes().add(this.getMessageOccurrenceSpecification());
		messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getOccurrenceSpecification());
		messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getMessageEnd());
		executionOccurrenceSpecificationEClass.getESuperTypes().add(this.getOccurrenceSpecification());
		stateInvariantEClass.getESuperTypes().add(this.getInteractionFragment());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionExecutionSpecificationEClass, ActionExecutionSpecification.class, "ActionExecutionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionExecutionSpecification_Action(), theActionsPackage.getAction(), null, "action", null, 1, 1, ActionExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(executionSpecificationEClass, ExecutionSpecification.class, "ExecutionSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionSpecification_Finish(), this.getOccurrenceSpecification(), null, "finish", null, 1, 1, ExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecutionSpecification_Start(), this.getOccurrenceSpecification(), null, "start", null, 1, 1, ExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionFragmentEClass, InteractionFragment.class, "InteractionFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFragment_Covered(), this.getLifeline(), this.getLifeline_CoveredBy(), "covered", null, 0, -1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_EnclosingInteraction(), this.getInteraction(), this.getInteraction_Fragment(), "enclosingInteraction", null, 0, 1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_EnclosingOperand(), this.getInteractionOperand(), this.getInteractionOperand_Fragment(), "enclosingOperand", null, 0, 1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_GeneralOrdering(), this.getGeneralOrdering(), null, "generalOrdering", null, 0, -1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifeline_DecomposedAs(), this.getPartDecomposition(), null, "decomposedAs", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Interaction(), this.getInteraction(), this.getInteraction_Lifeline(), "interaction", null, 1, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Represents(), theStructuredClassifiersPackage.getConnectableElement(), null, "represents", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Selector(), theValuesPackage.getValueSpecification(), null, "selector", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_CoveredBy(), this.getInteractionFragment(), this.getInteractionFragment_Covered(), "coveredBy", null, 0, -1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(partDecompositionEClass, PartDecomposition.class, "PartDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionUseEClass, InteractionUse.class, "InteractionUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionUse_ActualGate(), this.getGate(), null, "actualGate", null, 0, -1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionUse_Argument(), theValuesPackage.getValueSpecification(), null, "argument", null, 0, -1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionUse_RefersTo(), this.getInteraction(), null, "refersTo", null, 1, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionUse_ReturnValue(), theValuesPackage.getValueSpecification(), null, "returnValue", null, 0, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionUse_ReturnValueRecipient(), theClassificationPackage.getProperty(), null, "returnValueRecipient", null, 0, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGate__IsOutsideCf(), theTypesPackage.getBoolean(), "isOutsideCf", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__IsInsideCf(), theTypesPackage.getBoolean(), "isInsideCf", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__IsActual(), theTypesPackage.getBoolean(), "isActual", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__IsFormal(), theTypesPackage.getBoolean(), "isFormal", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__GetName(), theTypesPackage.getString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getGate__Matches__Gate(), theTypesPackage.getBoolean(), "matches", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getGate(), "gateToMatch", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGate__GetOperand(), this.getInteractionOperand(), "getOperand", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(messageEndEClass, MessageEnd.class, "MessageEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageEnd_Message(), this.getMessage(), null, "message", null, 0, 1, MessageEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getMessageEnd__OppositeEnd(), this.getMessageEnd(), "oppositeEnd", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMessageEnd__IsSend(), theTypesPackage.getBoolean(), "isSend", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMessageEnd__IsReceive(), theTypesPackage.getBoolean(), "isReceive", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMessageEnd__EnclosingFragment(), this.getInteractionFragment(), "enclosingFragment", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Argument(), theValuesPackage.getValueSpecification(), null, "argument", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Connector(), theStructuredClassifiersPackage.getConnector(), null, "connector", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Interaction(), this.getInteraction(), this.getInteraction_Message(), "interaction", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_MessageKind(), this.getMessageKind(), "messageKind", null, 1, 1, Message.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_MessageSort(), this.getMessageSort(), "messageSort", "synchCall", 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_ReceiveEvent(), this.getMessageEnd(), null, "receiveEvent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_SendEvent(), this.getMessageEnd(), null, "sendEvent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Signature(), theCommonStructurePackage.getNamedElement(), null, "signature", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getMessage__MessageKind(), this.getMessageKind(), "messageKind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Action(), theActionsPackage.getAction(), null, "action", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_FormalGate(), this.getGate(), null, "formalGate", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Fragment(), this.getInteractionFragment(), this.getInteractionFragment_EnclosingInteraction(), "fragment", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_Lifeline(), this.getLifeline(), this.getLifeline_Interaction(), "lifeline", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Message(), this.getMessage(), this.getMessage_Interaction(), "message", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionOperandEClass, InteractionOperand.class, "InteractionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionOperand_Fragment(), this.getInteractionFragment(), this.getInteractionFragment_EnclosingOperand(), "fragment", null, 0, -1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionOperand_Guard(), this.getInteractionConstraint(), null, "guard", null, 0, 1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionConstraintEClass, InteractionConstraint.class, "InteractionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionConstraint_Maxint(), theValuesPackage.getValueSpecification(), null, "maxint", null, 0, 1, InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionConstraint_Minint(), theValuesPackage.getValueSpecification(), null, "minint", null, 0, 1, InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalOrderingEClass, GeneralOrdering.class, "GeneralOrdering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralOrdering_After(), this.getOccurrenceSpecification(), this.getOccurrenceSpecification_ToBefore(), "after", null, 1, 1, GeneralOrdering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralOrdering_Before(), this.getOccurrenceSpecification(), this.getOccurrenceSpecification_ToAfter(), "before", null, 1, 1, GeneralOrdering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(occurrenceSpecificationEClass, OccurrenceSpecification.class, "OccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOccurrenceSpecification_ToAfter(), this.getGeneralOrdering(), this.getGeneralOrdering_Before(), "toAfter", null, 0, -1, OccurrenceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOccurrenceSpecification_ToBefore(), this.getGeneralOrdering(), this.getGeneralOrdering_After(), "toBefore", null, 0, -1, OccurrenceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorExecutionSpecificationEClass, BehaviorExecutionSpecification.class, "BehaviorExecutionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorExecutionSpecification_Behavior(), theCommonBehaviorPackage.getBehavior(), null, "behavior", null, 0, 1, BehaviorExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinedFragment_CfragmentGate(), this.getGate(), null, "cfragmentGate", null, 0, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCombinedFragment_InteractionOperator(), this.getInteractionOperatorKind(), "interactionOperator", "seq", 1, 1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCombinedFragment_Operand(), this.getInteractionOperand(), null, "operand", null, 1, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(considerIgnoreFragmentEClass, ConsiderIgnoreFragment.class, "ConsiderIgnoreFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsiderIgnoreFragment_Message(), theCommonStructurePackage.getNamedElement(), null, "message", null, 0, -1, ConsiderIgnoreFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(continuationEClass, Continuation.class, "Continuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuation_Setting(), theTypesPackage.getBoolean(), "setting", "true", 1, 1, Continuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(destructionOccurrenceSpecificationEClass, DestructionOccurrenceSpecification.class, "DestructionOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageOccurrenceSpecificationEClass, MessageOccurrenceSpecification.class, "MessageOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionOccurrenceSpecificationEClass, ExecutionOccurrenceSpecification.class, "ExecutionOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionOccurrenceSpecification_Execution(), this.getExecutionSpecification(), null, "execution", null, 1, 1, ExecutionOccurrenceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stateInvariantEClass, StateInvariant.class, "StateInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateInvariant_Invariant(), theCommonStructurePackage.getConstraint(), null, "invariant", null, 1, 1, StateInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(messageKindEEnum, MessageKind.class, "MessageKind");
		addEEnumLiteral(messageKindEEnum, MessageKind.COMPLETE);
		addEEnumLiteral(messageKindEEnum, MessageKind.LOST);
		addEEnumLiteral(messageKindEEnum, MessageKind.FOUND);
		addEEnumLiteral(messageKindEEnum, MessageKind.UNKNOWN);

		initEEnum(messageSortEEnum, MessageSort.class, "MessageSort");
		addEEnumLiteral(messageSortEEnum, MessageSort.SYNCH_CALL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_CALL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_SIGNAL);
		addEEnumLiteral(messageSortEEnum, MessageSort.CREATE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.DELETE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.REPLY);

		initEEnum(interactionOperatorKindEEnum, InteractionOperatorKind.class, "InteractionOperatorKind");
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.SEQ);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.ALT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.OPT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.BREAK);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.PAR);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.STRICT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.LOOP);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.CRITICAL);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.NEG);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.ASSERT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.IGNORE);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.CONSIDER);

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
			 "originalName", "Interactions"
		   });	
		addAnnotation
		  (getGate__IsOutsideCf(), 
		   source, 
		   new String[] {
			 "originalName", "isOutsideCF"
		   });	
		addAnnotation
		  (getGate__IsInsideCf(), 
		   source, 
		   new String[] {
			 "originalName", "isInsideCF"
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
		  (actionExecutionSpecificationEClass, 
		   source, 
		   new String[] {
			 "constraints", "action_referenced"
		   });	
		addAnnotation
		  (executionSpecificationEClass, 
		   source, 
		   new String[] {
			 "constraints", "same_lifeline"
		   });	
		addAnnotation
		  (lifelineEClass, 
		   source, 
		   new String[] {
			 "constraints", "selector_specified interaction_uses_share_lifeline same_classifier selector_int_or_string"
		   });	
		addAnnotation
		  (partDecompositionEClass, 
		   source, 
		   new String[] {
			 "constraints", "commutativity_of_decomposition assume parts_of_internal_structures"
		   });	
		addAnnotation
		  (interactionUseEClass, 
		   source, 
		   new String[] {
			 "constraints", "gates_match arguments_are_constants returnValueRecipient_coverage arguments_correspond_to_parameters returnValue_type_recipient_correspondence all_lifelines"
		   });	
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
			 "constraints", "actual_gate_matched inside_cf_matched outside_cf_matched formal_gate_distinguishable actual_gate_distinguishable outside_cf_gate_distinguishable inside_cf_gate_distinguishable"
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "constraints", "sending_receiving_message_event arguments cannot_cross_boundaries signature_is_signal occurrence_specifications signature_refer_to signature_is_operation_request signature_is_operation_reply"
		   });	
		addAnnotation
		  (interactionEClass, 
		   source, 
		   new String[] {
			 "constraints", "not_contained"
		   });	
		addAnnotation
		  (interactionOperandEClass, 
		   source, 
		   new String[] {
			 "constraints", "guard_contain_references guard_directly_prior"
		   });	
		addAnnotation
		  (interactionConstraintEClass, 
		   source, 
		   new String[] {
			 "constraints", "minint_maxint minint_non_negative maxint_positive dynamic_variables global_data maxint_greater_equal_minint"
		   });	
		addAnnotation
		  (generalOrderingEClass, 
		   source, 
		   new String[] {
			 "constraints", "irreflexive_transitive_closure"
		   });	
		addAnnotation
		  (combinedFragmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "break consider_and_ignore opt_loop_break_neg"
		   });	
		addAnnotation
		  (considerIgnoreFragmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "consider_or_ignore type"
		   });	
		addAnnotation
		  (continuationEClass, 
		   source, 
		   new String[] {
			 "constraints", "first_or_last_interaction_fragment same_name global"
		   });	
		addAnnotation
		  (destructionOccurrenceSpecificationEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_occurrence_specifications_below"
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
		  (actionExecutionSpecificationEClass, 
		   source, 
		   new String[] {
			 "action_referenced", "(enclosingInteraction->notEmpty() or enclosingOperand.combinedFragment->notEmpty()) and\r\nlet parentInteraction : Set(Interaction) = enclosingInteraction.oclAsType(Interaction)->asSet()->union(\r\nenclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->\r\ncollect(enclosingInteraction).oclAsType(Interaction)->asSet()) in\r\n(parentInteraction->size() = 1) and self.action.interaction->asSet() = parentInteraction"
		   });	
		addAnnotation
		  (executionSpecificationEClass, 
		   source, 
		   new String[] {
			 "same_lifeline", "start.covered = finish.covered"
		   });	
		addAnnotation
		  (lifelineEClass, 
		   source, 
		   new String[] {
			 "selector_specified", " self.selector->notEmpty() = (self.represents.oclIsKindOf(MultiplicityElement) and self.represents.oclAsType(MultiplicityElement).isMultivalued())",
			 "interaction_uses_share_lifeline", "let intUses : Set(InteractionUse) = interaction.interactionUse  in \r\nintUses->forAll\r\n( iuse : InteractionUse | \r\nlet usingInteraction : Set(Interaction)  = iuse.enclosingInteraction->asSet()\r\n->union(\r\niuse.enclosingOperand.combinedFragment->asSet()->closure(enclosingOperand.combinedFragment).enclosingInteraction->asSet()\r\n               ) \r\nin\r\nlet peerUses : Set(InteractionUse) = usingInteraction.fragment->select(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()\r\n->union(\r\nusingInteraction.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet()\r\n->closure(operand.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)).operand.fragment->\r\nselect(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()\r\n               )->excluding(iuse)\r\n in\r\npeerUses->forAll( peerUse : InteractionUse |\r\n peerUse.refersTo.lifeline->forAll( l : Lifeline | (l.represents = self.represents and \r\n ( self.selector.oclIsKindOf(LiteralString) implies\r\n  l.selector.oclIsKindOf(LiteralString) and \r\n  self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )\r\n  and \r\n( self.selector.oclIsKindOf(LiteralInteger) implies\r\n  l.selector.oclIsKindOf(LiteralInteger) and \r\n  self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )\r\n)  \r\nimplies\r\n usingInteraction.lifeline->select(represents = self.represents and\r\n ( self.selector.oclIsKindOf(LiteralString) implies\r\n  l.selector.oclIsKindOf(LiteralString) and \r\n  self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )\r\nand \r\n( self.selector.oclIsKindOf(LiteralInteger) implies\r\n  l.selector.oclIsKindOf(LiteralInteger) and \r\n  self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )\r\n)\r\n                                                )\r\n                    )\r\n)",
			 "same_classifier", "represents.namespace->closure(namespace)->includes(interaction._\'context\')",
			 "selector_int_or_string", "self.selector->notEmpty() implies \r\nself.selector.oclIsKindOf(LiteralInteger) or \r\nself.selector.oclIsKindOf(LiteralString)"
		   });	
		addAnnotation
		  (interactionUseEClass, 
		   source, 
		   new String[] {
			 "gates_match", "actualGate->notEmpty() implies \r\nrefersTo.formalGate->forAll( fg : Gate | self.actualGate->select(matches(fg))->size()=1) and\r\nself.actualGate->forAll(ag : Gate | refersTo.formalGate->select(matches(ag))->size()=1)",
			 "returnValueRecipient_coverage", "returnValueRecipient->asSet()->notEmpty() implies\r\nlet covCE : Set(ConnectableElement) = covered.represents->asSet() in \r\ncovCE->notEmpty() and let classes:Set(Classifier) = covCE.type.oclIsKindOf(Classifier).oclAsType(Classifier)->asSet() in \r\nlet allProps : Set(Property) = classes.attribute->union(classes.allParents().attribute)->asSet() in \r\nallProps->includes(returnValueRecipient)",
			 "returnValue_type_recipient_correspondence", "returnValue.type->asSequence()->notEmpty() implies returnValue.type->asSequence()->first() = returnValueRecipient.type->asSequence()->first()\r\n",
			 "all_lifelines", "let parentInteraction : Set(Interaction) = enclosingInteraction->asSet()->\r\nunion(enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->\r\ncollect(enclosingInteraction).oclAsType(Interaction)->asSet()) in\r\nparentInteraction->size()=1 and let refInteraction : Interaction = refersTo in\r\nparentInteraction.covered-> forAll(intLifeline : Lifeline | refInteraction.covered->\r\nforAll( refLifeline : Lifeline | refLifeline.represents = intLifeline.represents and \r\n(\r\n( refLifeline.selector.oclIsKindOf(LiteralString) implies\r\n  intLifeline.selector.oclIsKindOf(LiteralString) and \r\n  refLifeline.selector.oclAsType(LiteralString).value = intLifeline.selector.oclAsType(LiteralString).value ) and\r\n( refLifeline.selector.oclIsKindOf(LiteralInteger) implies\r\n  intLifeline.selector.oclIsKindOf(LiteralInteger) and \r\n  refLifeline.selector.oclAsType(LiteralInteger).value = intLifeline.selector.oclAsType(LiteralInteger).value )\r\n)\r\n implies self.covered->asSet()->includes(intLifeline)))"
		   });	
		addAnnotation
		  (gateEClass, 
		   source, 
		   new String[] {
			 "actual_gate_matched", "interactionUse->notEmpty() implies interactionUse.refersTo.formalGate->select(matches(self))->size()=1",
			 "inside_cf_matched", "isInsideCF() implies combinedFragment.cfragmentGate->select(isOutsideCF() and matches(self))->size()=1",
			 "outside_cf_matched", "isOutsideCF() implies\r\n if self.combinedFragment.interactionOperator->asOrderedSet()->first() = InteractionOperatorKind::alt\r\n then self.combinedFragment.operand->forAll(op : InteractionOperand |\r\n self.combinedFragment.cfragmentGate->select(isInsideCF() and \r\n oppositeEnd().enclosingFragment()->includes(self.combinedFragment) and matches(self))->size()=1)\r\n else  self.combinedFragment.cfragmentGate->select(isInsideCF() and matches(self))->size()=1\r\n endif",
			 "formal_gate_distinguishable", "isFormal() implies interaction.formalGate->select(getName() = self.getName())->size()=1",
			 "actual_gate_distinguishable", "isActual() implies interactionUse.actualGate->select(getName() = self.getName())->size()=1",
			 "outside_cf_gate_distinguishable", "isOutsideCF() implies combinedFragment.cfragmentGate->select(getName() = self.getName())->size()=1",
			 "inside_cf_gate_distinguishable", "isInsideCF() implies\r\nlet selfOperand : InteractionOperand = self.getOperand() in\r\n  combinedFragment.cfragmentGate->select(isInsideCF() and getName() = self.getName())->select(getOperand() = selfOperand)->size()=1"
		   });	
		addAnnotation
		  (getGate__IsOutsideCf(), 
		   source, 
		   new String[] {
			 "body", "self.oppositeEnd()-> notEmpty() and combinedFragment->notEmpty() implies\r\nlet oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in\r\nif oppEnd.oclIsKindOf(MessageOccurrenceSpecification) \r\nthen let oppMOS : MessageOccurrenceSpecification = oppEnd.oclAsType(MessageOccurrenceSpecification)\r\nin  self.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(self.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet()) =\r\n     oppMOS.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(oppMOS.enclosingOperand.oclAsType(InteractionFragment)->asSet())\r\nelse let oppGate : Gate = oppEnd.oclAsType(Gate) \r\nin self.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(self.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet()) =\r\n     oppGate.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(oppGate.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet())\r\nendif"
		   });	
		addAnnotation
		  (getGate__IsInsideCf(), 
		   source, 
		   new String[] {
			 "body", "self.oppositeEnd()-> notEmpty() and combinedFragment->notEmpty() implies\r\nlet oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in\r\nif oppEnd.oclIsKindOf(MessageOccurrenceSpecification)\r\nthen let oppMOS : MessageOccurrenceSpecification\r\n= oppEnd.oclAsType(MessageOccurrenceSpecification)\r\nin combinedFragment = oppMOS.enclosingOperand.combinedFragment\r\nelse let oppGate : Gate = oppEnd.oclAsType(Gate)\r\nin combinedFragment = oppGate.combinedFragment.enclosingOperand.combinedFragment\r\nendif"
		   });	
		addAnnotation
		  (getGate__IsActual(), 
		   source, 
		   new String[] {
			 "body", "interactionUse->notEmpty()"
		   });	
		addAnnotation
		  (getGate__IsFormal(), 
		   source, 
		   new String[] {
			 "body", "interaction->notEmpty()"
		   });	
		addAnnotation
		  (getGate__GetName(), 
		   source, 
		   new String[] {
			 "body", "if name->notEmpty() then name->asOrderedSet()->first()\r\nelse  if isActual() or isOutsideCF() \r\n  then if isSend() \r\n    then \'out_\'.concat(self.message.name->asOrderedSet()->first())\r\n    else \'in_\'.concat(self.message.name->asOrderedSet()->first())\r\n    endif\r\n  else if isSend()\r\n    then \'in_\'.concat(self.message.name->asOrderedSet()->first())\r\n    else \'out_\'.concat(self.message.name->asOrderedSet()->first())\r\n    endif\r\n  endif\r\nendif"
		   });	
		addAnnotation
		  (getGate__Matches__Gate(), 
		   source, 
		   new String[] {
			 "body", "self.getName() = gateToMatch.getName() and \r\nself.message.messageSort = gateToMatch.message.messageSort and\r\nself.message.name = gateToMatch.message.name and\r\nself.message.sendEvent->includes(self) implies gateToMatch.message.receiveEvent->includes(gateToMatch)  and\r\nself.message.receiveEvent->includes(self) implies gateToMatch.message.sendEvent->includes(gateToMatch) and\r\nself.message.signature = gateToMatch.message.signature"
		   });	
		addAnnotation
		  (getGate__GetOperand(), 
		   source, 
		   new String[] {
			 "body", "if isInsideCF() then\r\n  let oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in\r\n    if oppEnd.oclIsKindOf(MessageOccurrenceSpecification)\r\n    then let oppMOS : MessageOccurrenceSpecification = oppEnd.oclAsType(MessageOccurrenceSpecification)\r\n        in oppMOS.enclosingOperand->asOrderedSet()->first()\r\n    else let oppGate : Gate = oppEnd.oclAsType(Gate)\r\n        in oppGate.combinedFragment.enclosingOperand->asOrderedSet()->first()\r\n    endif\r\n  else null\r\nendif"
		   });	
		addAnnotation
		  (getMessageEnd__OppositeEnd(), 
		   source, 
		   new String[] {
			 "body", "message->asSet().messageEnd->asSet()->excluding(self)"
		   });	
		addAnnotation
		  (getMessageEnd__IsSend(), 
		   source, 
		   new String[] {
			 "body", "message.sendEvent->asSet()->includes(self)"
		   });	
		addAnnotation
		  (getMessageEnd__IsReceive(), 
		   source, 
		   new String[] {
			 "body", "message.receiveEvent->asSet()->includes(self)"
		   });	
		addAnnotation
		  (getMessageEnd__EnclosingFragment(), 
		   source, 
		   new String[] {
			 "body", "if self->select(oclIsKindOf(Gate))->notEmpty() \r\nthen -- it is a Gate\r\nlet endGate : Gate = \r\n  self->select(oclIsKindOf(Gate)).oclAsType(Gate)->asOrderedSet()->first()\r\n  in\r\n  if endGate.isOutsideCF() \r\n  then endGate.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(endGate.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet())\r\n  else if endGate.isInsideCF() \r\n    then endGate.combinedFragment.oclAsType(InteractionFragment)->asSet()\r\n    else if endGate.isFormal() \r\n      then endGate.interaction.oclAsType(InteractionFragment)->asSet()\r\n      else if endGate.isActual() \r\n        then endGate.interactionUse.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(endGate.interactionUse.enclosingOperand.oclAsType(InteractionFragment)->asSet())\r\n        else null\r\n        endif\r\n      endif\r\n    endif\r\n  endif\r\nelse -- it is a MessageOccurrenceSpecification\r\nlet endMOS : MessageOccurrenceSpecification  = \r\n  self->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() \r\n  in\r\n  if endMOS.enclosingInteraction->notEmpty() \r\n  then endMOS.enclosingInteraction.oclAsType(InteractionFragment)->asSet()\r\n  else endMOS.enclosingOperand.oclAsType(InteractionFragment)->asSet()\r\n  endif\r\nendif"
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "sending_receiving_message_event", "receiveEvent.oclIsKindOf(MessageOccurrenceSpecification)\r\nimplies\r\nlet f :  Lifeline = sendEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered in\r\nf = receiveEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered  implies\r\nf.events->indexOf(sendEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() ) < \r\nf.events->indexOf(receiveEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() )",
			 "cannot_cross_boundaries", "sendEvent->notEmpty() and receiveEvent->notEmpty() implies\r\nlet sendEnclosingFrag : Set(InteractionFragment) = \r\nsendEvent->asOrderedSet()->first().enclosingFragment()\r\nin \r\nlet receiveEnclosingFrag : Set(InteractionFragment) = \r\nreceiveEvent->asOrderedSet()->first().enclosingFragment()\r\nin  sendEnclosingFrag = receiveEnclosingFrag",
			 "signature_is_signal", "(messageSort = MessageSort::asynchSignal ) and signature.oclIsKindOf(Signal) implies\r\n   let signalAttributes : OrderedSet(Property) = signature.oclAsType(Signal).inheritedMember()->\r\n             select(n:NamedElement | n.oclIsTypeOf(Property))->collect(oclAsType(Property))->asOrderedSet()\r\n   in signalAttributes->size() = self.argument->size()\r\n   and self.argument->forAll( o: ValueSpecification |\r\n          not (o.oclIsKindOf(Expression)\r\n          and o.oclAsType(Expression).symbol->size()=0\r\n          and o.oclAsType(Expression).operand->isEmpty() ) implies\r\n              let p : Property = signalAttributes->at(self.argument->indexOf(o))\r\n              in o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier)))\r\n",
			 "signature_refer_to", "signature->notEmpty() implies \r\n((signature.oclIsKindOf(Operation) and \r\n(messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall or messageSort = MessageSort::reply) \r\n) or (signature.oclIsKindOf(Signal)  and messageSort = MessageSort::asynchSignal )\r\n ) and name = signature.name",
			 "signature_is_operation_request", "(messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall) and signature.oclIsKindOf(Operation)  implies \r\n let requestParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->\r\n select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::_\'in\'  )\r\nin requestParms->size() = self.argument->size() and\r\nself.argument->forAll( o: ValueSpecification | \r\nnot (o.oclIsKindOf(Expression) and o.oclAsType(Expression).symbol->size()=0 and o.oclAsType(Expression).operand->isEmpty() ) implies \r\nlet p : Parameter = requestParms->at(self.argument->indexOf(o)) in\r\no.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))\r\n)",
			 "signature_is_operation_reply", "(messageSort = MessageSort::reply) and signature.oclIsKindOf(Operation) implies \r\n let replyParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->\r\nselect(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::return)\r\nin replyParms->size() = self.argument->size() and\r\nself.argument->forAll( o: ValueSpecification | o.oclIsKindOf(Expression) and let e : Expression = o.oclAsType(Expression) in\r\ne.operand->notEmpty()  implies \r\nlet p : Parameter = replyParms->at(self.argument->indexOf(o)) in\r\ne.operand->asSequence()->first().type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))\r\n)"
		   });	
		addAnnotation
		  (getMessage__MessageKind(), 
		   source, 
		   new String[] {
			 "body", "messageKind"
		   });	
		addAnnotation
		  (interactionEClass, 
		   source, 
		   new String[] {
			 "not_contained", "enclosingInteraction->isEmpty()"
		   });	
		addAnnotation
		  (interactionConstraintEClass, 
		   source, 
		   new String[] {
			 "minint_maxint", "maxint->notEmpty() or minint->notEmpty() implies\r\ninteractionOperand.combinedFragment.interactionOperator =\r\nInteractionOperatorKind::loop",
			 "minint_non_negative", "minint->notEmpty() implies \r\nminint->asSequence()->first().integerValue() >= 0",
			 "maxint_positive", "maxint->notEmpty() implies \r\nmaxint->asSequence()->first().integerValue() > 0",
			 "maxint_greater_equal_minint", "maxint->notEmpty() implies (minint->notEmpty() and \r\nmaxint->asSequence()->first().integerValue() >=\r\nminint->asSequence()->first().integerValue() )"
		   });	
		addAnnotation
		  (generalOrderingEClass, 
		   source, 
		   new String[] {
			 "irreflexive_transitive_closure", "after->closure(toAfter.after)->excludes(before)"
		   });	
		addAnnotation
		  (combinedFragmentEClass, 
		   source, 
		   new String[] {
			 "break", "interactionOperator=InteractionOperatorKind::break  implies   \r\nenclosingInteraction.oclAsType(InteractionFragment)->asSet()->union(\r\n   enclosingOperand.oclAsType(InteractionFragment)->asSet()).covered->asSet() = self.covered->asSet()",
			 "consider_and_ignore", "((interactionOperator = InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)) implies oclIsKindOf(ConsiderIgnoreFragment)",
			 "opt_loop_break_neg", "(interactionOperator =  InteractionOperatorKind::opt or interactionOperator = InteractionOperatorKind::loop or\r\ninteractionOperator = InteractionOperatorKind::break or interactionOperator = InteractionOperatorKind::assert or\r\ninteractionOperator = InteractionOperatorKind::neg)\r\nimplies operand->size()=1"
		   });	
		addAnnotation
		  (considerIgnoreFragmentEClass, 
		   source, 
		   new String[] {
			 "consider_or_ignore", "(interactionOperator =  InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)",
			 "type", "message->forAll(m | m.oclIsKindOf(Operation) or m.oclIsKindOf(Signal))"
		   });	
		addAnnotation
		  (continuationEClass, 
		   source, 
		   new String[] {
			 "first_or_last_interaction_fragment", " enclosingOperand->notEmpty() and \r\n let peerFragments : OrderedSet(InteractionFragment) =  enclosingOperand.fragment in \r\n   ( peerFragments->notEmpty() and \r\n   ((peerFragments->first() = self) or  (peerFragments->last() = self)))",
			 "same_name", "enclosingOperand.combinedFragment->notEmpty() and\r\nlet parentInteraction : Set(Interaction) = \r\nenclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->\r\ncollect(enclosingInteraction).oclAsType(Interaction)->asSet()\r\nin \r\n(parentInteraction->size() = 1) \r\nand let peerInteractions : Set(Interaction) =\r\n (parentInteraction->union(parentInteraction->collect(_\'context\')->collect(behavior)->\r\n select(oclIsKindOf(Interaction)).oclAsType(Interaction)->asSet())->asSet()) in\r\n (peerInteractions->notEmpty()) and \r\n  let combinedFragments1 : Set(CombinedFragment) = peerInteractions.fragment->\r\n select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet() in\r\n   combinedFragments1->notEmpty() and  combinedFragments1->closure(operand.fragment->\r\n   select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment))->asSet().operand.fragment->\r\n   select(oclIsKindOf(Continuation)).oclAsType(Continuation)->asSet()->\r\n   forAll(c : Continuation |  (c.name = self.name) implies \r\n  (c.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by self\r\n  self.covered->asSet()->\r\n  select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))\r\n   and\r\n (self.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by c\r\n c.covered->asSet()->\r\n  select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))\r\n  )",
			 "global", "enclosingOperand->notEmpty() and\r\n  let operandLifelines : Set(Lifeline) =  enclosingOperand.covered in \r\n    (operandLifelines->notEmpty() and \r\n    operandLifelines->forAll(ol :Lifeline |self.covered->includes(ol)))"
		   });	
		addAnnotation
		  (destructionOccurrenceSpecificationEClass, 
		   source, 
		   new String[] {
			 "no_occurrence_specifications_below", "let o : InteractionOperand = enclosingOperand in o->notEmpty() and \r\nlet peerEvents : OrderedSet(OccurrenceSpecification) = covered.events->select(enclosingOperand = o)\r\nin peerEvents->last() = self"
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
		  (getActionExecutionSpecification_Action(), 
		   source, 
		   new String[] {
			 "body", "actionExecutionSpecification"
		   });	
		addAnnotation
		  (getExecutionSpecification_Finish(), 
		   source, 
		   new String[] {
			 "body", "executionSpecification"
		   });	
		addAnnotation
		  (getExecutionSpecification_Start(), 
		   source, 
		   new String[] {
			 "body", "executionSpecification"
		   });	
		addAnnotation
		  (getInteractionFragment_GeneralOrdering(), 
		   source, 
		   new String[] {
			 "body", "interactionFragment"
		   });	
		addAnnotation
		  (getLifeline_DecomposedAs(), 
		   source, 
		   new String[] {
			 "body", "lifeline"
		   });	
		addAnnotation
		  (getLifeline_Represents(), 
		   source, 
		   new String[] {
			 "body", "lifeline"
		   });	
		addAnnotation
		  (getLifeline_Selector(), 
		   source, 
		   new String[] {
			 "body", "lifeline"
		   });	
		addAnnotation
		  (getInteractionUse_ActualGate(), 
		   source, 
		   new String[] {
			 "body", "interactionUse"
		   });	
		addAnnotation
		  (getInteractionUse_Argument(), 
		   source, 
		   new String[] {
			 "body", "interactionUse"
		   });	
		addAnnotation
		  (getInteractionUse_RefersTo(), 
		   source, 
		   new String[] {
			 "body", "interactionUse"
		   });	
		addAnnotation
		  (getInteractionUse_ReturnValue(), 
		   source, 
		   new String[] {
			 "body", "interactionUse"
		   });	
		addAnnotation
		  (getInteractionUse_ReturnValueRecipient(), 
		   source, 
		   new String[] {
			 "body", "interactionUse"
		   });	
		addAnnotation
		  (getMessageEnd_Message(), 
		   source, 
		   new String[] {
			 "body", "messageEnd"
		   });	
		addAnnotation
		  (getMessage_Argument(), 
		   source, 
		   new String[] {
			 "body", "message"
		   });	
		addAnnotation
		  (getMessage_Connector(), 
		   source, 
		   new String[] {
			 "body", "message"
		   });	
		addAnnotation
		  (getMessage_ReceiveEvent(), 
		   source, 
		   new String[] {
			 "body", "endMessage"
		   });	
		addAnnotation
		  (getMessage_SendEvent(), 
		   source, 
		   new String[] {
			 "body", "endMessage"
		   });	
		addAnnotation
		  (getMessage_Signature(), 
		   source, 
		   new String[] {
			 "body", "message"
		   });	
		addAnnotation
		  (getInteraction_Action(), 
		   source, 
		   new String[] {
			 "body", "interaction"
		   });	
		addAnnotation
		  (getInteraction_FormalGate(), 
		   source, 
		   new String[] {
			 "body", "interaction"
		   });	
		addAnnotation
		  (getInteractionOperand_Guard(), 
		   source, 
		   new String[] {
			 "body", "interactionOperand"
		   });	
		addAnnotation
		  (getInteractionConstraint_Maxint(), 
		   source, 
		   new String[] {
			 "body", "interactionConstraint"
		   });	
		addAnnotation
		  (getInteractionConstraint_Minint(), 
		   source, 
		   new String[] {
			 "body", "interactionConstraint"
		   });	
		addAnnotation
		  (getBehaviorExecutionSpecification_Behavior(), 
		   source, 
		   new String[] {
			 "body", "behaviorExecutionSpecification"
		   });	
		addAnnotation
		  (getCombinedFragment_CfragmentGate(), 
		   source, 
		   new String[] {
			 "body", "combinedFragment"
		   });	
		addAnnotation
		  (getCombinedFragment_Operand(), 
		   source, 
		   new String[] {
			 "body", "combinedFragment"
		   });	
		addAnnotation
		  (getConsiderIgnoreFragment_Message(), 
		   source, 
		   new String[] {
			 "body", "considerIgnoreFragment"
		   });	
		addAnnotation
		  (getExecutionOccurrenceSpecification_Execution(), 
		   source, 
		   new String[] {
			 "body", "executionOccurrenceSpecification"
		   });	
		addAnnotation
		  (getStateInvariant_Invariant(), 
		   source, 
		   new String[] {
			 "body", "stateInvariant"
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
		  (getInteractionFragment_EnclosingInteraction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteractionFragment_EnclosingOperand(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteractionFragment_GeneralOrdering(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLifeline_Interaction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLifeline_Selector(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteractionUse_ActualGate(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteractionUse_Argument(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteractionUse_ReturnValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMessage_Argument(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMessage_Interaction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteraction_Action(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteraction_FormalGate(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteraction_Fragment(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteraction_Lifeline(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteraction_Message(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteractionOperand_Fragment(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteractionOperand_Guard(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteractionConstraint_Maxint(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInteractionConstraint_Minint(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCombinedFragment_CfragmentGate(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCombinedFragment_Operand(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateInvariant_Invariant(), 
		   source, 
		   new String[] {
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
		  (gateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (occurrenceSpecificationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateInvariantEClass, 
		   source, 
		   new String[] {
		   });
	}

} //InteractionsPackageImpl
