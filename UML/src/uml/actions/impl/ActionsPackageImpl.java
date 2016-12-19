/**
 */
package uml.actions.impl;

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

import uml.actions.AcceptCallAction;
import uml.actions.AcceptEventAction;
import uml.actions.Action;
import uml.actions.ActionInputPin;
import uml.actions.ActionsFactory;
import uml.actions.ActionsPackage;
import uml.actions.AddStructuralFeatureValueAction;
import uml.actions.AddVariableValueAction;
import uml.actions.BroadcastSignalAction;
import uml.actions.CallAction;
import uml.actions.CallBehaviorAction;
import uml.actions.CallOperationAction;
import uml.actions.Clause;
import uml.actions.ClearAssociationAction;
import uml.actions.ClearStructuralFeatureAction;
import uml.actions.ClearVariableAction;
import uml.actions.ConditionalNode;
import uml.actions.CreateLinkAction;
import uml.actions.CreateLinkObjectAction;
import uml.actions.CreateObjectAction;
import uml.actions.DestroyLinkAction;
import uml.actions.DestroyObjectAction;
import uml.actions.ExpansionKind;
import uml.actions.ExpansionNode;
import uml.actions.ExpansionRegion;
import uml.actions.InputPin;
import uml.actions.InvocationAction;
import uml.actions.LinkAction;
import uml.actions.LinkEndCreationData;
import uml.actions.LinkEndData;
import uml.actions.LinkEndDestructionData;
import uml.actions.LoopNode;
import uml.actions.OpaqueAction;
import uml.actions.OutputPin;
import uml.actions.Pin;
import uml.actions.QualifierValue;
import uml.actions.RaiseExceptionAction;
import uml.actions.ReadExtentAction;
import uml.actions.ReadIsClassifiedObjectAction;
import uml.actions.ReadLinkAction;
import uml.actions.ReadLinkObjectEndAction;
import uml.actions.ReadLinkObjectEndQualifierAction;
import uml.actions.ReadSelfAction;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.ReadVariableAction;
import uml.actions.ReclassifyObjectAction;
import uml.actions.ReduceAction;
import uml.actions.RemoveStructuralFeatureValueAction;
import uml.actions.RemoveVariableValueAction;
import uml.actions.ReplyAction;
import uml.actions.SendObjectAction;
import uml.actions.SendSignalAction;
import uml.actions.SequenceNode;
import uml.actions.StartClassifierBehaviorAction;
import uml.actions.StartObjectBehaviorAction;
import uml.actions.StructuralFeatureAction;
import uml.actions.StructuredActivityNode;
import uml.actions.TestIdentityAction;
import uml.actions.UnmarshallAction;
import uml.actions.ValuePin;
import uml.actions.ValueSpecificationAction;
import uml.actions.VariableAction;
import uml.actions.WriteLinkAction;
import uml.actions.WriteStructuralFeatureAction;
import uml.actions.WriteVariableAction;

import uml.actions.util.ActionsValidator;

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
public class ActionsPackageImpl extends EPackageImpl implements ActionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptCallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionInputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearAssociationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndCreationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDestructionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseExceptionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readExtentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readIsClassifiedObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndQualifierActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSelfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reclassifyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startClassifierBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startObjectBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIdentityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unmarshallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredActivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expansionKindEEnum = null;

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
	 * @see uml.actions.ActionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActionsPackageImpl() {
		super(eNS_URI, ActionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActionsPackage init() {
		if (isInited) return (ActionsPackage)EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI);

		// Obtain or create and register package
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionsPackageImpl());

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
		InteractionsPackageImpl theInteractionsPackage = (InteractionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) instanceof InteractionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) : InteractionsPackage.eINSTANCE);
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) : InformationFlowsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theActionsPackage.createPackageContents();
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
		theInteractionsPackage.createPackageContents();
		theInformationFlowsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theActionsPackage.initializePackageContents();
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
		theInteractionsPackage.initializePackageContents();
		theInformationFlowsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theActionsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ActionsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theActionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActionsPackage.eNS_URI, theActionsPackage);
		return theActionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationAction() {
		return valueSpecificationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Result() {
		return (EReference)valueSpecificationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Value() {
		return (EReference)valueSpecificationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Context() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Input() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_IsLocallyReentrant() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPostcondition() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPrecondition() {
		return (EReference)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Output() {
		return (EReference)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Context() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__AllActions() {
		return actionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__AllOwnedNodes() {
		return actionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__ContainingBehavior() {
		return actionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_IsControl() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPin() {
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAction() {
		return variableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAction_Variable() {
		return (EReference)variableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLinkAction() {
		return writeLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkAction() {
		return linkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_EndData() {
		return (EReference)linkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_InputValue() {
		return (EReference)linkActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkAction__Association() {
		return linkActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndData() {
		return linkEndDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_End() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Qualifier() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Value() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndData__AllPins() {
		return linkEndDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifierValue() {
		return qualifierValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Qualifier() {
		return (EReference)qualifierValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Value() {
		return (EReference)qualifierValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteStructuralFeatureAction() {
		return writeStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Result() {
		return (EReference)writeStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Value() {
		return (EReference)writeStructuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureAction() {
		return structuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_Object() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_StructuralFeature() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteVariableAction() {
		return writeVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteVariableAction_Value() {
		return (EReference)writeVariableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptCallAction() {
		return acceptCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptCallAction_ReturnInformation() {
		return (EReference)acceptCallActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventAction() {
		return acceptEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptEventAction_IsUnmarshall() {
		return (EAttribute)acceptEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Result() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Trigger() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionInputPin() {
		return actionInputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionInputPin_FromAction() {
		return (EReference)actionInputPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStructuralFeatureValueAction() {
		return addStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddStructuralFeatureValueAction_InsertAt() {
		return (EReference)addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddStructuralFeatureValueAction_IsReplaceAll() {
		return (EAttribute)addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddVariableValueAction() {
		return addVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddVariableValueAction_InsertAt() {
		return (EReference)addVariableValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddVariableValueAction_IsReplaceAll() {
		return (EAttribute)addVariableValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastSignalAction() {
		return broadcastSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastSignalAction_Signal() {
		return (EReference)broadcastSignalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationAction() {
		return invocationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_Argument() {
		return (EReference)invocationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_OnPort() {
		return (EReference)invocationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallAction() {
		return callActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallAction_IsSynchronous() {
		return (EAttribute)callActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallAction_Result() {
		return (EReference)callActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallAction__InputParameters() {
		return callActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallAction__OutputParameters() {
		return callActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBehaviorAction() {
		return callBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallBehaviorAction_Behavior() {
		return (EReference)callBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallOperationAction() {
		return callOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Operation() {
		return (EReference)callOperationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Target() {
		return (EReference)callOperationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClause() {
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Body() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_BodyOutput() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Decider() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_PredecessorClause() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_SuccessorClause() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Test() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearAssociationAction() {
		return clearAssociationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Association() {
		return (EReference)clearAssociationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Object() {
		return (EReference)clearAssociationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStructuralFeatureAction() {
		return clearStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearStructuralFeatureAction_Result() {
		return (EReference)clearStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearVariableAction() {
		return clearVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalNode() {
		return conditionalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_Clause() {
		return (EReference)conditionalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsAssured() {
		return (EAttribute)conditionalNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsDeterminate() {
		return (EAttribute)conditionalNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_Result() {
		return (EReference)conditionalNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkAction() {
		return createLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndCreationData() {
		return linkEndCreationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndCreationData_InsertAt() {
		return (EReference)linkEndCreationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndCreationData_IsReplaceAll() {
		return (EAttribute)linkEndCreationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkObjectAction() {
		return createLinkObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateLinkObjectAction_Result() {
		return (EReference)createLinkObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectAction() {
		return createObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Classifier() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Result() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyLinkAction() {
		return destroyLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndDestructionData() {
		return linkEndDestructionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndDestructionData_DestroyAt() {
		return (EReference)linkEndDestructionDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndDestructionData_IsDestroyDuplicates() {
		return (EAttribute)linkEndDestructionDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyObjectAction() {
		return destroyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyLinks() {
		return (EAttribute)destroyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyOwnedObjects() {
		return (EAttribute)destroyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestroyObjectAction_Target() {
		return (EReference)destroyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionNode() {
		return expansionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsInput() {
		return (EReference)expansionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsOutput() {
		return (EReference)expansionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionRegion() {
		return expansionRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionRegion_Mode() {
		return (EAttribute)expansionRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_OutputElement() {
		return (EReference)expansionRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_InputElement() {
		return (EReference)expansionRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopNode() {
		return loopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_BodyOutput() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_BodyPart() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Decider() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_IsTestedFirst() {
		return (EAttribute)loopNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_LoopVariable() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_LoopVariableInput() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Result() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_SetupPart() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Test() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction() {
		return opaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueAction_Body() {
		return (EAttribute)opaqueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_InputValue() {
		return (EReference)opaqueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueAction_Language() {
		return (EAttribute)opaqueActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_OutputValue() {
		return (EReference)opaqueActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaiseExceptionAction() {
		return raiseExceptionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaiseExceptionAction_Exception() {
		return (EReference)raiseExceptionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadExtentAction() {
		return readExtentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Classifier() {
		return (EReference)readExtentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Result() {
		return (EReference)readExtentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadIsClassifiedObjectAction() {
		return readIsClassifiedObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Classifier() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadIsClassifiedObjectAction_IsDirect() {
		return (EAttribute)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Object() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Result() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkAction() {
		return readLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkAction_Result() {
		return (EReference)readLinkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkAction__OpenEnd() {
		return readLinkActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndAction() {
		return readLinkObjectEndActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_End() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Object() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Result() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndQualifierAction() {
		return readLinkObjectEndQualifierActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Object() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Qualifier() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Result() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSelfAction() {
		return readSelfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadSelfAction_Result() {
		return (EReference)readSelfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadStructuralFeatureAction() {
		return readStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadStructuralFeatureAction_Result() {
		return (EReference)readStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadVariableAction() {
		return readVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadVariableAction_Result() {
		return (EReference)readVariableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReclassifyObjectAction() {
		return reclassifyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReclassifyObjectAction_IsReplaceAll() {
		return (EAttribute)reclassifyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_NewClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_Object() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_OldClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduceAction() {
		return reduceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Collection() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReduceAction_IsOrdered() {
		return (EAttribute)reduceActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Reducer() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Result() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveStructuralFeatureValueAction() {
		return removeStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveStructuralFeatureValueAction_IsRemoveDuplicates() {
		return (EAttribute)removeStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveStructuralFeatureValueAction_RemoveAt() {
		return (EReference)removeStructuralFeatureValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveVariableValueAction() {
		return removeVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveVariableValueAction_IsRemoveDuplicates() {
		return (EAttribute)removeVariableValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveVariableValueAction_RemoveAt() {
		return (EReference)removeVariableValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyAction() {
		return replyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyToCall() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyValue() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReturnInformation() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendObjectAction() {
		return sendObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Request() {
		return (EReference)sendObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Target() {
		return (EReference)sendObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalAction() {
		return sendSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Signal() {
		return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Target() {
		return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceNode() {
		return sequenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceNode_ExecutableNode() {
		return (EReference)sequenceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartClassifierBehaviorAction() {
		return startClassifierBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartClassifierBehaviorAction_Object() {
		return (EReference)startClassifierBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartObjectBehaviorAction() {
		return startObjectBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartObjectBehaviorAction_Object() {
		return (EReference)startObjectBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStartObjectBehaviorAction__Behavior() {
		return startObjectBehaviorActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIdentityAction() {
		return testIdentityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_First() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Result() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Second() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnmarshallAction() {
		return unmarshallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_Object() {
		return (EReference)unmarshallActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_Result() {
		return (EReference)unmarshallActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_UnmarshallType() {
		return (EReference)unmarshallActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePin() {
		return valuePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePin_Value() {
		return (EReference)valuePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredActivityNode() {
		return structuredActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Variable() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Edge() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredActivityNode_MustIsolate() {
		return (EAttribute)structuredActivityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_StructuredNodeInput() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_StructuredNodeOutput() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Node() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredActivityNode__SourceNodes() {
		return structuredActivityNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredActivityNode__TargetNodes() {
		return structuredActivityNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpansionKind() {
		return expansionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsFactory getActionsFactory() {
		return (ActionsFactory)getEFactoryInstance();
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
		valueSpecificationActionEClass = createEClass(VALUE_SPECIFICATION_ACTION);
		createEReference(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION__RESULT);
		createEReference(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION__VALUE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__CONTEXT);
		createEReference(actionEClass, ACTION__INPUT);
		createEAttribute(actionEClass, ACTION__IS_LOCALLY_REENTRANT);
		createEReference(actionEClass, ACTION__LOCAL_POSTCONDITION);
		createEReference(actionEClass, ACTION__LOCAL_PRECONDITION);
		createEReference(actionEClass, ACTION__OUTPUT);
		createEOperation(actionEClass, ACTION___CONTEXT);
		createEOperation(actionEClass, ACTION___ALL_ACTIONS);
		createEOperation(actionEClass, ACTION___ALL_OWNED_NODES);
		createEOperation(actionEClass, ACTION___CONTAINING_BEHAVIOR);

		inputPinEClass = createEClass(INPUT_PIN);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__IS_CONTROL);

		outputPinEClass = createEClass(OUTPUT_PIN);

		variableActionEClass = createEClass(VARIABLE_ACTION);
		createEReference(variableActionEClass, VARIABLE_ACTION__VARIABLE);

		writeLinkActionEClass = createEClass(WRITE_LINK_ACTION);

		linkActionEClass = createEClass(LINK_ACTION);
		createEReference(linkActionEClass, LINK_ACTION__END_DATA);
		createEReference(linkActionEClass, LINK_ACTION__INPUT_VALUE);
		createEOperation(linkActionEClass, LINK_ACTION___ASSOCIATION);

		linkEndDataEClass = createEClass(LINK_END_DATA);
		createEReference(linkEndDataEClass, LINK_END_DATA__END);
		createEReference(linkEndDataEClass, LINK_END_DATA__QUALIFIER);
		createEReference(linkEndDataEClass, LINK_END_DATA__VALUE);
		createEOperation(linkEndDataEClass, LINK_END_DATA___ALL_PINS);

		qualifierValueEClass = createEClass(QUALIFIER_VALUE);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__QUALIFIER);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__VALUE);

		writeStructuralFeatureActionEClass = createEClass(WRITE_STRUCTURAL_FEATURE_ACTION);
		createEReference(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION__RESULT);
		createEReference(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION__VALUE);

		structuralFeatureActionEClass = createEClass(STRUCTURAL_FEATURE_ACTION);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__OBJECT);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE);

		writeVariableActionEClass = createEClass(WRITE_VARIABLE_ACTION);
		createEReference(writeVariableActionEClass, WRITE_VARIABLE_ACTION__VALUE);

		acceptCallActionEClass = createEClass(ACCEPT_CALL_ACTION);
		createEReference(acceptCallActionEClass, ACCEPT_CALL_ACTION__RETURN_INFORMATION);

		acceptEventActionEClass = createEClass(ACCEPT_EVENT_ACTION);
		createEAttribute(acceptEventActionEClass, ACCEPT_EVENT_ACTION__IS_UNMARSHALL);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__RESULT);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__TRIGGER);

		actionInputPinEClass = createEClass(ACTION_INPUT_PIN);
		createEReference(actionInputPinEClass, ACTION_INPUT_PIN__FROM_ACTION);

		addStructuralFeatureValueActionEClass = createEClass(ADD_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEReference(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT);
		createEAttribute(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL);

		addVariableValueActionEClass = createEClass(ADD_VARIABLE_VALUE_ACTION);
		createEReference(addVariableValueActionEClass, ADD_VARIABLE_VALUE_ACTION__INSERT_AT);
		createEAttribute(addVariableValueActionEClass, ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL);

		broadcastSignalActionEClass = createEClass(BROADCAST_SIGNAL_ACTION);
		createEReference(broadcastSignalActionEClass, BROADCAST_SIGNAL_ACTION__SIGNAL);

		invocationActionEClass = createEClass(INVOCATION_ACTION);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ARGUMENT);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ON_PORT);

		callActionEClass = createEClass(CALL_ACTION);
		createEAttribute(callActionEClass, CALL_ACTION__IS_SYNCHRONOUS);
		createEReference(callActionEClass, CALL_ACTION__RESULT);
		createEOperation(callActionEClass, CALL_ACTION___INPUT_PARAMETERS);
		createEOperation(callActionEClass, CALL_ACTION___OUTPUT_PARAMETERS);

		callBehaviorActionEClass = createEClass(CALL_BEHAVIOR_ACTION);
		createEReference(callBehaviorActionEClass, CALL_BEHAVIOR_ACTION__BEHAVIOR);

		callOperationActionEClass = createEClass(CALL_OPERATION_ACTION);
		createEReference(callOperationActionEClass, CALL_OPERATION_ACTION__OPERATION);
		createEReference(callOperationActionEClass, CALL_OPERATION_ACTION__TARGET);

		clauseEClass = createEClass(CLAUSE);
		createEReference(clauseEClass, CLAUSE__BODY);
		createEReference(clauseEClass, CLAUSE__BODY_OUTPUT);
		createEReference(clauseEClass, CLAUSE__DECIDER);
		createEReference(clauseEClass, CLAUSE__PREDECESSOR_CLAUSE);
		createEReference(clauseEClass, CLAUSE__SUCCESSOR_CLAUSE);
		createEReference(clauseEClass, CLAUSE__TEST);

		clearAssociationActionEClass = createEClass(CLEAR_ASSOCIATION_ACTION);
		createEReference(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION__ASSOCIATION);
		createEReference(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION__OBJECT);

		clearStructuralFeatureActionEClass = createEClass(CLEAR_STRUCTURAL_FEATURE_ACTION);
		createEReference(clearStructuralFeatureActionEClass, CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT);

		clearVariableActionEClass = createEClass(CLEAR_VARIABLE_ACTION);

		conditionalNodeEClass = createEClass(CONDITIONAL_NODE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__CLAUSE);
		createEAttribute(conditionalNodeEClass, CONDITIONAL_NODE__IS_ASSURED);
		createEAttribute(conditionalNodeEClass, CONDITIONAL_NODE__IS_DETERMINATE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__RESULT);

		createLinkActionEClass = createEClass(CREATE_LINK_ACTION);

		linkEndCreationDataEClass = createEClass(LINK_END_CREATION_DATA);
		createEReference(linkEndCreationDataEClass, LINK_END_CREATION_DATA__INSERT_AT);
		createEAttribute(linkEndCreationDataEClass, LINK_END_CREATION_DATA__IS_REPLACE_ALL);

		createLinkObjectActionEClass = createEClass(CREATE_LINK_OBJECT_ACTION);
		createEReference(createLinkObjectActionEClass, CREATE_LINK_OBJECT_ACTION__RESULT);

		createObjectActionEClass = createEClass(CREATE_OBJECT_ACTION);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__CLASSIFIER);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__RESULT);

		destroyLinkActionEClass = createEClass(DESTROY_LINK_ACTION);

		linkEndDestructionDataEClass = createEClass(LINK_END_DESTRUCTION_DATA);
		createEReference(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA__DESTROY_AT);
		createEAttribute(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES);

		destroyObjectActionEClass = createEClass(DESTROY_OBJECT_ACTION);
		createEAttribute(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS);
		createEAttribute(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS);
		createEReference(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__TARGET);

		expansionNodeEClass = createEClass(EXPANSION_NODE);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_INPUT);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_OUTPUT);

		expansionRegionEClass = createEClass(EXPANSION_REGION);
		createEAttribute(expansionRegionEClass, EXPANSION_REGION__MODE);
		createEReference(expansionRegionEClass, EXPANSION_REGION__OUTPUT_ELEMENT);
		createEReference(expansionRegionEClass, EXPANSION_REGION__INPUT_ELEMENT);

		loopNodeEClass = createEClass(LOOP_NODE);
		createEReference(loopNodeEClass, LOOP_NODE__BODY_OUTPUT);
		createEReference(loopNodeEClass, LOOP_NODE__BODY_PART);
		createEReference(loopNodeEClass, LOOP_NODE__DECIDER);
		createEAttribute(loopNodeEClass, LOOP_NODE__IS_TESTED_FIRST);
		createEReference(loopNodeEClass, LOOP_NODE__LOOP_VARIABLE);
		createEReference(loopNodeEClass, LOOP_NODE__LOOP_VARIABLE_INPUT);
		createEReference(loopNodeEClass, LOOP_NODE__RESULT);
		createEReference(loopNodeEClass, LOOP_NODE__SETUP_PART);
		createEReference(loopNodeEClass, LOOP_NODE__TEST);

		opaqueActionEClass = createEClass(OPAQUE_ACTION);
		createEAttribute(opaqueActionEClass, OPAQUE_ACTION__BODY);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__INPUT_VALUE);
		createEAttribute(opaqueActionEClass, OPAQUE_ACTION__LANGUAGE);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__OUTPUT_VALUE);

		raiseExceptionActionEClass = createEClass(RAISE_EXCEPTION_ACTION);
		createEReference(raiseExceptionActionEClass, RAISE_EXCEPTION_ACTION__EXCEPTION);

		readExtentActionEClass = createEClass(READ_EXTENT_ACTION);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__CLASSIFIER);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__RESULT);

		readIsClassifiedObjectActionEClass = createEClass(READ_IS_CLASSIFIED_OBJECT_ACTION);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER);
		createEAttribute(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT);

		readLinkActionEClass = createEClass(READ_LINK_ACTION);
		createEReference(readLinkActionEClass, READ_LINK_ACTION__RESULT);
		createEOperation(readLinkActionEClass, READ_LINK_ACTION___OPEN_END);

		readLinkObjectEndActionEClass = createEClass(READ_LINK_OBJECT_END_ACTION);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__END);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__OBJECT);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__RESULT);

		readLinkObjectEndQualifierActionEClass = createEClass(READ_LINK_OBJECT_END_QUALIFIER_ACTION);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT);

		readSelfActionEClass = createEClass(READ_SELF_ACTION);
		createEReference(readSelfActionEClass, READ_SELF_ACTION__RESULT);

		readStructuralFeatureActionEClass = createEClass(READ_STRUCTURAL_FEATURE_ACTION);
		createEReference(readStructuralFeatureActionEClass, READ_STRUCTURAL_FEATURE_ACTION__RESULT);

		readVariableActionEClass = createEClass(READ_VARIABLE_ACTION);
		createEReference(readVariableActionEClass, READ_VARIABLE_ACTION__RESULT);

		reclassifyObjectActionEClass = createEClass(RECLASSIFY_OBJECT_ACTION);
		createEAttribute(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OBJECT);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER);

		reduceActionEClass = createEClass(REDUCE_ACTION);
		createEReference(reduceActionEClass, REDUCE_ACTION__COLLECTION);
		createEAttribute(reduceActionEClass, REDUCE_ACTION__IS_ORDERED);
		createEReference(reduceActionEClass, REDUCE_ACTION__REDUCER);
		createEReference(reduceActionEClass, REDUCE_ACTION__RESULT);

		removeStructuralFeatureValueActionEClass = createEClass(REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEAttribute(removeStructuralFeatureValueActionEClass, REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES);
		createEReference(removeStructuralFeatureValueActionEClass, REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT);

		removeVariableValueActionEClass = createEClass(REMOVE_VARIABLE_VALUE_ACTION);
		createEAttribute(removeVariableValueActionEClass, REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES);
		createEReference(removeVariableValueActionEClass, REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT);

		replyActionEClass = createEClass(REPLY_ACTION);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_TO_CALL);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_VALUE);
		createEReference(replyActionEClass, REPLY_ACTION__RETURN_INFORMATION);

		sendObjectActionEClass = createEClass(SEND_OBJECT_ACTION);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__REQUEST);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__TARGET);

		sendSignalActionEClass = createEClass(SEND_SIGNAL_ACTION);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__SIGNAL);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__TARGET);

		sequenceNodeEClass = createEClass(SEQUENCE_NODE);
		createEReference(sequenceNodeEClass, SEQUENCE_NODE__EXECUTABLE_NODE);

		startClassifierBehaviorActionEClass = createEClass(START_CLASSIFIER_BEHAVIOR_ACTION);
		createEReference(startClassifierBehaviorActionEClass, START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT);

		startObjectBehaviorActionEClass = createEClass(START_OBJECT_BEHAVIOR_ACTION);
		createEReference(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION__OBJECT);
		createEOperation(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION___BEHAVIOR);

		testIdentityActionEClass = createEClass(TEST_IDENTITY_ACTION);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__FIRST);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__RESULT);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__SECOND);

		unmarshallActionEClass = createEClass(UNMARSHALL_ACTION);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__OBJECT);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__RESULT);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__UNMARSHALL_TYPE);

		valuePinEClass = createEClass(VALUE_PIN);
		createEReference(valuePinEClass, VALUE_PIN__VALUE);

		structuredActivityNodeEClass = createEClass(STRUCTURED_ACTIVITY_NODE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__VARIABLE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__EDGE);
		createEAttribute(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__NODE);
		createEOperation(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE___SOURCE_NODES);
		createEOperation(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE___TARGET_NODES);

		// Create enums
		expansionKindEEnum = createEEnum(EXPANSION_KIND);
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
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		CommonStructurePackage theCommonStructurePackage = (CommonStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI);
		CommonBehaviorPackage theCommonBehaviorPackage = (CommonBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI);
		StructuredClassifiersPackage theStructuredClassifiersPackage = (StructuredClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI);
		SimpleClassifiersPackage theSimpleClassifiersPackage = (SimpleClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		valueSpecificationActionEClass.getESuperTypes().add(this.getAction());
		actionEClass.getESuperTypes().add(theActivitiesPackage.getExecutableNode());
		inputPinEClass.getESuperTypes().add(this.getPin());
		pinEClass.getESuperTypes().add(theActivitiesPackage.getObjectNode());
		pinEClass.getESuperTypes().add(theCommonStructurePackage.getMultiplicityElement());
		outputPinEClass.getESuperTypes().add(this.getPin());
		variableActionEClass.getESuperTypes().add(this.getAction());
		writeLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		linkActionEClass.getESuperTypes().add(this.getAction());
		linkEndDataEClass.getESuperTypes().add(theCommonStructurePackage.getElement());
		qualifierValueEClass.getESuperTypes().add(theCommonStructurePackage.getElement());
		writeStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		structuralFeatureActionEClass.getESuperTypes().add(this.getAction());
		writeVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		acceptCallActionEClass.getESuperTypes().add(this.getAcceptEventAction());
		acceptEventActionEClass.getESuperTypes().add(this.getAction());
		actionInputPinEClass.getESuperTypes().add(this.getInputPin());
		addStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		addVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
		broadcastSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
		invocationActionEClass.getESuperTypes().add(this.getAction());
		callActionEClass.getESuperTypes().add(this.getInvocationAction());
		callBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
		callOperationActionEClass.getESuperTypes().add(this.getCallAction());
		clauseEClass.getESuperTypes().add(theCommonStructurePackage.getElement());
		clearAssociationActionEClass.getESuperTypes().add(this.getAction());
		clearStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		clearVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		conditionalNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		createLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		linkEndCreationDataEClass.getESuperTypes().add(this.getLinkEndData());
		createLinkObjectActionEClass.getESuperTypes().add(this.getCreateLinkAction());
		createObjectActionEClass.getESuperTypes().add(this.getAction());
		destroyLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		linkEndDestructionDataEClass.getESuperTypes().add(this.getLinkEndData());
		destroyObjectActionEClass.getESuperTypes().add(this.getAction());
		expansionNodeEClass.getESuperTypes().add(theActivitiesPackage.getObjectNode());
		expansionRegionEClass.getESuperTypes().add(this.getStructuredActivityNode());
		loopNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		opaqueActionEClass.getESuperTypes().add(this.getAction());
		raiseExceptionActionEClass.getESuperTypes().add(this.getAction());
		readExtentActionEClass.getESuperTypes().add(this.getAction());
		readIsClassifiedObjectActionEClass.getESuperTypes().add(this.getAction());
		readLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		readLinkObjectEndActionEClass.getESuperTypes().add(this.getAction());
		readLinkObjectEndQualifierActionEClass.getESuperTypes().add(this.getAction());
		readSelfActionEClass.getESuperTypes().add(this.getAction());
		readStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		readVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		reclassifyObjectActionEClass.getESuperTypes().add(this.getAction());
		reduceActionEClass.getESuperTypes().add(this.getAction());
		removeStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		removeVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
		replyActionEClass.getESuperTypes().add(this.getAction());
		sendObjectActionEClass.getESuperTypes().add(this.getInvocationAction());
		sendSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
		sequenceNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		startClassifierBehaviorActionEClass.getESuperTypes().add(this.getAction());
		startObjectBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
		testIdentityActionEClass.getESuperTypes().add(this.getAction());
		unmarshallActionEClass.getESuperTypes().add(this.getAction());
		valuePinEClass.getESuperTypes().add(this.getInputPin());
		structuredActivityNodeEClass.getESuperTypes().add(this.getAction());
		structuredActivityNodeEClass.getESuperTypes().add(theCommonStructurePackage.getNamespace());
		structuredActivityNodeEClass.getESuperTypes().add(theActivitiesPackage.getActivityGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(valueSpecificationActionEClass, ValueSpecificationAction.class, "ValueSpecificationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSpecificationAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSpecificationAction_Value(), theValuesPackage.getValueSpecification(), null, "value", null, 1, 1, ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Context(), theClassificationPackage.getClassifier(), null, "context", null, 0, 1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_Input(), this.getInputPin(), null, "input", null, 0, -1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_IsLocallyReentrant(), theTypesPackage.getBoolean(), "isLocallyReentrant", "false", 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_LocalPostcondition(), theCommonStructurePackage.getConstraint(), null, "localPostcondition", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_LocalPrecondition(), theCommonStructurePackage.getConstraint(), null, "localPrecondition", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_Output(), this.getOutputPin(), null, "output", null, 0, -1, Action.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__Context(), theClassificationPackage.getClassifier(), "context", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAction__AllActions(), this.getAction(), "allActions", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAction__AllOwnedNodes(), theActivitiesPackage.getActivityNode(), "allOwnedNodes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAction__ContainingBehavior(), theCommonBehaviorPackage.getBehavior(), "containingBehavior", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_IsControl(), theTypesPackage.getBoolean(), "isControl", "false", 1, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableActionEClass, VariableAction.class, "VariableAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAction_Variable(), theActivitiesPackage.getVariable(), null, "variable", null, 1, 1, VariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(writeLinkActionEClass, WriteLinkAction.class, "WriteLinkAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkActionEClass, LinkAction.class, "LinkAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkAction_EndData(), this.getLinkEndData(), null, "endData", null, 2, -1, LinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkAction_InputValue(), this.getInputPin(), null, "inputValue", null, 1, -1, LinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getLinkAction__Association(), theStructuredClassifiersPackage.getAssociation(), "association", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(linkEndDataEClass, LinkEndData.class, "LinkEndData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndData_End(), theClassificationPackage.getProperty(), null, "end", null, 1, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkEndData_Qualifier(), this.getQualifierValue(), null, "qualifier", null, 0, -1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkEndData_Value(), this.getInputPin(), null, "value", null, 0, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getLinkEndData__AllPins(), this.getInputPin(), "allPins", 0, -1, !IS_UNIQUE, !IS_ORDERED);

		initEClass(qualifierValueEClass, QualifierValue.class, "QualifierValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifierValue_Qualifier(), theClassificationPackage.getProperty(), null, "qualifier", null, 1, 1, QualifierValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQualifierValue_Value(), this.getInputPin(), null, "value", null, 1, 1, QualifierValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(writeStructuralFeatureActionEClass, WriteStructuralFeatureAction.class, "WriteStructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteStructuralFeatureAction_Result(), this.getOutputPin(), null, "result", null, 0, 1, WriteStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWriteStructuralFeatureAction_Value(), this.getInputPin(), null, "value", null, 0, 1, WriteStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structuralFeatureActionEClass, StructuralFeatureAction.class, "StructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralFeatureAction_Object(), this.getInputPin(), null, "object", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuralFeatureAction_StructuralFeature(), theClassificationPackage.getStructuralFeature(), null, "structuralFeature", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(writeVariableActionEClass, WriteVariableAction.class, "WriteVariableAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteVariableAction_Value(), this.getInputPin(), null, "value", null, 0, 1, WriteVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(acceptCallActionEClass, AcceptCallAction.class, "AcceptCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptCallAction_ReturnInformation(), this.getOutputPin(), null, "returnInformation", null, 1, 1, AcceptCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(acceptEventActionEClass, AcceptEventAction.class, "AcceptEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptEventAction_IsUnmarshall(), theTypesPackage.getBoolean(), "isUnmarshall", "false", 1, 1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAcceptEventAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcceptEventAction_Trigger(), theCommonBehaviorPackage.getTrigger(), null, "trigger", null, 1, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionInputPinEClass, ActionInputPin.class, "ActionInputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionInputPin_FromAction(), this.getAction(), null, "fromAction", null, 1, 1, ActionInputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(addStructuralFeatureValueActionEClass, AddStructuralFeatureValueAction.class, "AddStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddStructuralFeatureValueAction_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, AddStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddStructuralFeatureValueAction_IsReplaceAll(), theTypesPackage.getBoolean(), "isReplaceAll", "false", 1, 1, AddStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(addVariableValueActionEClass, AddVariableValueAction.class, "AddVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddVariableValueAction_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, AddVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddVariableValueAction_IsReplaceAll(), theTypesPackage.getBoolean(), "isReplaceAll", "false", 1, 1, AddVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(broadcastSignalActionEClass, BroadcastSignalAction.class, "BroadcastSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBroadcastSignalAction_Signal(), theSimpleClassifiersPackage.getSignal(), null, "signal", null, 1, 1, BroadcastSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(invocationActionEClass, InvocationAction.class, "InvocationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationAction_Argument(), this.getInputPin(), null, "argument", null, 0, -1, InvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvocationAction_OnPort(), theStructuredClassifiersPackage.getPort(), null, "onPort", null, 0, 1, InvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callActionEClass, CallAction.class, "CallAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallAction_IsSynchronous(), theTypesPackage.getBoolean(), "isSynchronous", "true", 1, 1, CallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCallAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, CallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCallAction__InputParameters(), theClassificationPackage.getParameter(), "inputParameters", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCallAction__OutputParameters(), theClassificationPackage.getParameter(), "outputParameters", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(callBehaviorActionEClass, CallBehaviorAction.class, "CallBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallBehaviorAction_Behavior(), theCommonBehaviorPackage.getBehavior(), null, "behavior", null, 1, 1, CallBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callOperationActionEClass, CallOperationAction.class, "CallOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallOperationAction_Operation(), theClassificationPackage.getOperation(), null, "operation", null, 1, 1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCallOperationAction_Target(), this.getInputPin(), null, "target", null, 1, 1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClause_Body(), theActivitiesPackage.getExecutableNode(), null, "body", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_BodyOutput(), this.getOutputPin(), null, "bodyOutput", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClause_Decider(), this.getOutputPin(), null, "decider", null, 1, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_PredecessorClause(), this.getClause(), this.getClause_SuccessorClause(), "predecessorClause", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_SuccessorClause(), this.getClause(), this.getClause_PredecessorClause(), "successorClause", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_Test(), theActivitiesPackage.getExecutableNode(), null, "test", null, 1, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clearAssociationActionEClass, ClearAssociationAction.class, "ClearAssociationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearAssociationAction_Association(), theStructuredClassifiersPackage.getAssociation(), null, "association", null, 1, 1, ClearAssociationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClearAssociationAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ClearAssociationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clearStructuralFeatureActionEClass, ClearStructuralFeatureAction.class, "ClearStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearStructuralFeatureAction_Result(), this.getOutputPin(), null, "result", null, 0, 1, ClearStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clearVariableActionEClass, ClearVariableAction.class, "ClearVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalNodeEClass, ConditionalNode.class, "ConditionalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalNode_Clause(), this.getClause(), null, "clause", null, 1, -1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConditionalNode_IsAssured(), theTypesPackage.getBoolean(), "isAssured", "false", 1, 1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConditionalNode_IsDeterminate(), theTypesPackage.getBoolean(), "isDeterminate", "false", 1, 1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConditionalNode_Result(), this.getOutputPin(), null, "result", null, 0, -1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createLinkActionEClass, CreateLinkAction.class, "CreateLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEndCreationDataEClass, LinkEndCreationData.class, "LinkEndCreationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndCreationData_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinkEndCreationData_IsReplaceAll(), theTypesPackage.getBoolean(), "isReplaceAll", "false", 1, 1, LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(createLinkObjectActionEClass, CreateLinkObjectAction.class, "CreateLinkObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateLinkObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, CreateLinkObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(createObjectActionEClass, CreateObjectAction.class, "CreateObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateObjectAction_Classifier(), theClassificationPackage.getClassifier(), null, "classifier", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCreateObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(destroyLinkActionEClass, DestroyLinkAction.class, "DestroyLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEndDestructionDataEClass, LinkEndDestructionData.class, "LinkEndDestructionData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndDestructionData_DestroyAt(), this.getInputPin(), null, "destroyAt", null, 0, 1, LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinkEndDestructionData_IsDestroyDuplicates(), theTypesPackage.getBoolean(), "isDestroyDuplicates", "false", 1, 1, LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(destroyObjectActionEClass, DestroyObjectAction.class, "DestroyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDestroyObjectAction_IsDestroyLinks(), theTypesPackage.getBoolean(), "isDestroyLinks", "false", 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDestroyObjectAction_IsDestroyOwnedObjects(), theTypesPackage.getBoolean(), "isDestroyOwnedObjects", "false", 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDestroyObjectAction_Target(), this.getInputPin(), null, "target", null, 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expansionNodeEClass, ExpansionNode.class, "ExpansionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpansionNode_RegionAsInput(), this.getExpansionRegion(), this.getExpansionRegion_InputElement(), "regionAsInput", null, 0, 1, ExpansionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpansionNode_RegionAsOutput(), this.getExpansionRegion(), this.getExpansionRegion_OutputElement(), "regionAsOutput", null, 0, 1, ExpansionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expansionRegionEClass, ExpansionRegion.class, "ExpansionRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpansionRegion_Mode(), this.getExpansionKind(), "mode", "iterative", 1, 1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpansionRegion_OutputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsOutput(), "outputElement", null, 0, -1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpansionRegion_InputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsInput(), "inputElement", null, 1, -1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loopNodeEClass, LoopNode.class, "LoopNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopNode_BodyOutput(), this.getOutputPin(), null, "bodyOutput", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_BodyPart(), theActivitiesPackage.getExecutableNode(), null, "bodyPart", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_Decider(), this.getOutputPin(), null, "decider", null, 1, 1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLoopNode_IsTestedFirst(), theTypesPackage.getBoolean(), "isTestedFirst", "false", 1, 1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_LoopVariable(), this.getOutputPin(), null, "loopVariable", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_LoopVariableInput(), this.getInputPin(), null, "loopVariableInput", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_Result(), this.getOutputPin(), null, "result", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_SetupPart(), theActivitiesPackage.getExecutableNode(), null, "setupPart", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_Test(), theActivitiesPackage.getExecutableNode(), null, "test", null, 1, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueActionEClass, OpaqueAction.class, "OpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueAction_Body(), theTypesPackage.getString(), "body", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueAction_InputValue(), this.getInputPin(), null, "inputValue", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpaqueAction_Language(), theTypesPackage.getString(), "language", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueAction_OutputValue(), this.getOutputPin(), null, "outputValue", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(raiseExceptionActionEClass, RaiseExceptionAction.class, "RaiseExceptionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaiseExceptionAction_Exception(), this.getInputPin(), null, "exception", null, 1, 1, RaiseExceptionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readExtentActionEClass, ReadExtentAction.class, "ReadExtentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadExtentAction_Classifier(), theClassificationPackage.getClassifier(), null, "classifier", null, 1, 1, ReadExtentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadExtentAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadExtentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readIsClassifiedObjectActionEClass, ReadIsClassifiedObjectAction.class, "ReadIsClassifiedObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadIsClassifiedObjectAction_Classifier(), theClassificationPackage.getClassifier(), null, "classifier", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReadIsClassifiedObjectAction_IsDirect(), theTypesPackage.getBoolean(), "isDirect", "false", 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadIsClassifiedObjectAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadIsClassifiedObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readLinkActionEClass, ReadLinkAction.class, "ReadLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadLinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReadLinkAction__OpenEnd(), theClassificationPackage.getProperty(), "openEnd", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(readLinkObjectEndActionEClass, ReadLinkObjectEndAction.class, "ReadLinkObjectEndAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkObjectEndAction_End(), theClassificationPackage.getProperty(), null, "end", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readLinkObjectEndQualifierActionEClass, ReadLinkObjectEndQualifierAction.class, "ReadLinkObjectEndQualifierAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkObjectEndQualifierAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndQualifierAction_Qualifier(), theClassificationPackage.getProperty(), null, "qualifier", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndQualifierAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readSelfActionEClass, ReadSelfAction.class, "ReadSelfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadSelfAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadSelfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readStructuralFeatureActionEClass, ReadStructuralFeatureAction.class, "ReadStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadStructuralFeatureAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readVariableActionEClass, ReadVariableAction.class, "ReadVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadVariableAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reclassifyObjectActionEClass, ReclassifyObjectAction.class, "ReclassifyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReclassifyObjectAction_IsReplaceAll(), theTypesPackage.getBoolean(), "isReplaceAll", "false", 1, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_NewClassifier(), theClassificationPackage.getClassifier(), null, "newClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_OldClassifier(), theClassificationPackage.getClassifier(), null, "oldClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reduceActionEClass, ReduceAction.class, "ReduceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReduceAction_Collection(), this.getInputPin(), null, "collection", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReduceAction_IsOrdered(), theTypesPackage.getBoolean(), "isOrdered", "false", 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReduceAction_Reducer(), theCommonBehaviorPackage.getBehavior(), null, "reducer", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReduceAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(removeStructuralFeatureValueActionEClass, RemoveStructuralFeatureValueAction.class, "RemoveStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveStructuralFeatureValueAction_IsRemoveDuplicates(), theTypesPackage.getBoolean(), "isRemoveDuplicates", "false", 1, 1, RemoveStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRemoveStructuralFeatureValueAction_RemoveAt(), this.getInputPin(), null, "removeAt", null, 0, 1, RemoveStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(removeVariableValueActionEClass, RemoveVariableValueAction.class, "RemoveVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveVariableValueAction_IsRemoveDuplicates(), theTypesPackage.getBoolean(), "isRemoveDuplicates", "false", 1, 1, RemoveVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRemoveVariableValueAction_RemoveAt(), this.getInputPin(), null, "removeAt", null, 0, 1, RemoveVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(replyActionEClass, ReplyAction.class, "ReplyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplyAction_ReplyToCall(), theCommonBehaviorPackage.getTrigger(), null, "replyToCall", null, 1, 1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReplyAction_ReplyValue(), this.getInputPin(), null, "replyValue", null, 0, -1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplyAction_ReturnInformation(), this.getInputPin(), null, "returnInformation", null, 1, 1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sendObjectActionEClass, SendObjectAction.class, "SendObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendObjectAction_Request(), this.getInputPin(), null, "request", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendObjectAction_Target(), this.getInputPin(), null, "target", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sendSignalActionEClass, SendSignalAction.class, "SendSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendSignalAction_Signal(), theSimpleClassifiersPackage.getSignal(), null, "signal", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendSignalAction_Target(), this.getInputPin(), null, "target", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sequenceNodeEClass, SequenceNode.class, "SequenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceNode_ExecutableNode(), theActivitiesPackage.getExecutableNode(), null, "executableNode", null, 0, -1, SequenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startClassifierBehaviorActionEClass, StartClassifierBehaviorAction.class, "StartClassifierBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartClassifierBehaviorAction_Object(), this.getInputPin(), null, "object", null, 1, 1, StartClassifierBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startObjectBehaviorActionEClass, StartObjectBehaviorAction.class, "StartObjectBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartObjectBehaviorAction_Object(), this.getInputPin(), null, "object", null, 1, 1, StartObjectBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getStartObjectBehaviorAction__Behavior(), theCommonBehaviorPackage.getBehavior(), "behavior", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(testIdentityActionEClass, TestIdentityAction.class, "TestIdentityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestIdentityAction_First(), this.getInputPin(), null, "first", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestIdentityAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestIdentityAction_Second(), this.getInputPin(), null, "second", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unmarshallActionEClass, UnmarshallAction.class, "UnmarshallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnmarshallAction_Object(), this.getInputPin(), null, "object", null, 1, 1, UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnmarshallAction_Result(), this.getOutputPin(), null, "result", null, 1, -1, UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnmarshallAction_UnmarshallType(), theClassificationPackage.getClassifier(), null, "unmarshallType", null, 1, 1, UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valuePinEClass, ValuePin.class, "ValuePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePin_Value(), theValuesPackage.getValueSpecification(), null, "value", null, 1, 1, ValuePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structuredActivityNodeEClass, StructuredActivityNode.class, "StructuredActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredActivityNode_Variable(), theActivitiesPackage.getVariable(), theActivitiesPackage.getVariable_Scope(), "variable", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_Edge(), theActivitiesPackage.getActivityEdge(), theActivitiesPackage.getActivityEdge_InStructuredNode(), "edge", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStructuredActivityNode_MustIsolate(), theTypesPackage.getBoolean(), "mustIsolate", "false", 1, 1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_StructuredNodeInput(), this.getInputPin(), null, "structuredNodeInput", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_StructuredNodeOutput(), this.getOutputPin(), null, "structuredNodeOutput", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_Node(), theActivitiesPackage.getActivityNode(), theActivitiesPackage.getActivityNode_InStructuredNode(), "node", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getStructuredActivityNode__SourceNodes(), theActivitiesPackage.getActivityNode(), "sourceNodes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStructuredActivityNode__TargetNodes(), theActivitiesPackage.getActivityNode(), "targetNodes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(expansionKindEEnum, ExpansionKind.class, "ExpansionKind");
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.PARALLEL);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.ITERATIVE);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.STREAM);

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
		// union
		createUnionAnnotations();
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
			 "originalName", "Actions"
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
		  (valueSpecificationActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity compatible_type"
		   });	
		addAnnotation
		  (inputPinEClass, 
		   source, 
		   new String[] {
			 "constraints", "outgoing_edges_structured_only"
		   });	
		addAnnotation
		  (pinEClass, 
		   source, 
		   new String[] {
			 "constraints", "control_pins not_unique"
		   });	
		addAnnotation
		  (outputPinEClass, 
		   source, 
		   new String[] {
			 "constraints", "incoming_edges_structured_only"
		   });	
		addAnnotation
		  (variableActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "scope_of_variable"
		   });	
		addAnnotation
		  (writeLinkActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "allow_access"
		   });	
		addAnnotation
		  (linkActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "same_pins same_association not_static"
		   });	
		addAnnotation
		  (linkEndDataEClass, 
		   source, 
		   new String[] {
			 "constraints", "same_type multiplicity end_object_input_pin property_is_association_end qualifiers"
		   });	
		addAnnotation
		  (qualifierValueEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity_of_qualifier type_of_qualifier qualifier_attribute"
		   });	
		addAnnotation
		  (writeStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity_of_result type_of_value multiplicity_of_value type_of_result"
		   });	
		addAnnotation
		  (structuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity object_type visibility not_static one_featuring_classifier"
		   });	
		addAnnotation
		  (writeVariableActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "value_type multiplicity"
		   });	
		addAnnotation
		  (acceptCallActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "result_pins trigger_call_event unmarshall"
		   });	
		addAnnotation
		  (acceptEventActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "one_output_pin no_input_pins no_output_pins unmarshall_signal_events conforming_type"
		   });	
		addAnnotation
		  (actionInputPinEClass, 
		   source, 
		   new String[] {
			 "constraints", "input_pin one_output_pin no_control_or_object_flow"
		   });	
		addAnnotation
		  (addStructuralFeatureValueActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "required_value insertAt_pin"
		   });	
		addAnnotation
		  (addVariableValueActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "required_value insertAt_pin"
		   });	
		addAnnotation
		  (broadcastSignalActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "number_of_arguments type_ordering_multiplicity no_onport"
		   });	
		addAnnotation
		  (callActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "argument_pins result_pins synchronous_call"
		   });	
		addAnnotation
		  (callBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_onport"
		   });	
		addAnnotation
		  (callOperationActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "type_target_pin"
		   });	
		addAnnotation
		  (clauseEClass, 
		   source, 
		   new String[] {
			 "constraints", "body_output_pins decider_output test_and_body"
		   });	
		addAnnotation
		  (clearAssociationActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity same_type"
		   });	
		addAnnotation
		  (clearStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "type_of_result multiplicity_of_result"
		   });	
		addAnnotation
		  (conditionalNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "result_no_incoming no_input_pins one_clause_with_executable_node matching_output_pins executable_nodes clause_no_predecessor"
		   });	
		addAnnotation
		  (createLinkActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "association_not_abstract"
		   });	
		addAnnotation
		  (linkEndCreationDataEClass, 
		   source, 
		   new String[] {
			 "constraints", "insertAt_pin"
		   });	
		addAnnotation
		  (createLinkObjectActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity type_of_result association_class"
		   });	
		addAnnotation
		  (createObjectActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "classifier_not_abstract multiplicity classifier_not_association_class same_type"
		   });	
		addAnnotation
		  (linkEndDestructionDataEClass, 
		   source, 
		   new String[] {
			 "constraints", "destroyAt_pin"
		   });	
		addAnnotation
		  (destroyObjectActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity no_type"
		   });	
		addAnnotation
		  (expansionNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "region_as_input_or_output"
		   });	
		addAnnotation
		  (loopNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "result_no_incoming input_edges executable_nodes body_output_pins setup_test_and_body matching_output_pins matching_loop_variables matching_result_pins loop_variable_outgoing"
		   });	
		addAnnotation
		  (opaqueActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "language_body_size"
		   });	
		addAnnotation
		  (readExtentActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "type_is_classifier multiplicity_of_result"
		   });	
		addAnnotation
		  (readIsClassifiedObjectActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_type multiplicity_of_output boolean_result multiplicity_of_input"
		   });	
		addAnnotation
		  (readLinkActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "type_and_ordering compatible_multiplicity visibility one_open_end navigable_open_end"
		   });	
		addAnnotation
		  (readLinkObjectEndActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "property multiplicity_of_object ends_of_association type_of_result multiplicity_of_result type_of_object association_of_association"
		   });	
		addAnnotation
		  (readLinkObjectEndQualifierActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity_of_object type_of_object multiplicity_of_qualifier ends_of_association multiplicity_of_result same_type association_of_association qualifier_attribute"
		   });	
		addAnnotation
		  (readSelfActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "contained multiplicity not_static type"
		   });	
		addAnnotation
		  (readStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity type_and_ordering"
		   });	
		addAnnotation
		  (readVariableActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "type_and_ordering compatible_multiplicity"
		   });	
		addAnnotation
		  (reclassifyObjectActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "input_pin classifier_not_abstract multiplicity"
		   });	
		addAnnotation
		  (reduceActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "reducer_inputs_output input_type_is_collection output_types_are_compatible"
		   });	
		addAnnotation
		  (removeStructuralFeatureValueActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "removeAt_and_value"
		   });	
		addAnnotation
		  (removeVariableValueActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "removeAt_and_value"
		   });	
		addAnnotation
		  (replyActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "pins_match_parameter event_on_reply_to_call_trigger"
		   });	
		addAnnotation
		  (sendObjectActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "type_target_pin"
		   });	
		addAnnotation
		  (sendSignalActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "type_ordering_multiplicity number_order type_target_pin"
		   });	
		addAnnotation
		  (startClassifierBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity type_has_classifier"
		   });	
		addAnnotation
		  (startObjectBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity_of_object type_of_object no_onport"
		   });	
		addAnnotation
		  (testIdentityActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "multiplicity no_type result_is_boolean"
		   });	
		addAnnotation
		  (unmarshallActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "structural_feature number_of_result type_ordering_and_multiplicity multiplicity_of_object object_type"
		   });	
		addAnnotation
		  (valuePinEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_incoming_edges compatible_type"
		   });	
		addAnnotation
		  (structuredActivityNodeEClass, 
		   source, 
		   new String[] {
			 "constraints", "output_pin_edges edges input_pin_edges"
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
		  (valueSpecificationActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity", "result.is(1,1)",
			 "compatible_type", "value.type.conformsTo(result.type)"
		   });	
		addAnnotation
		  (getAction__Context(), 
		   source, 
		   new String[] {
			 "body", "let behavior: Behavior = self.containingBehavior() in\r\nif behavior=null then null\r\nelse if behavior._\'context\' = null then behavior\r\nelse behavior._\'context\'\r\nendif\r\nendif"
		   });	
		addAnnotation
		  (getAction__AllActions(), 
		   source, 
		   new String[] {
			 "body", "self->asSet()"
		   });	
		addAnnotation
		  (getAction__AllOwnedNodes(), 
		   source, 
		   new String[] {
			 "body", "input.oclAsType(Pin)->asSet()->union(output->asSet())"
		   });	
		addAnnotation
		  (getAction__ContainingBehavior(), 
		   source, 
		   new String[] {
			 "body", "if inStructuredNode<>null then inStructuredNode.containingBehavior() \r\nelse if activity<>null then activity\r\nelse interaction \r\nendif\r\nendif"
		   });	
		addAnnotation
		  (inputPinEClass, 
		   source, 
		   new String[] {
			 "outgoing_edges_structured_only", "outgoing->notEmpty() implies\r\n\taction<>null and\r\n\taction.oclIsKindOf(StructuredActivityNode) and\r\n\taction.oclAsType(StructuredActivityNode).allOwnedNodes()->includesAll(outgoing.target)"
		   });	
		addAnnotation
		  (pinEClass, 
		   source, 
		   new String[] {
			 "control_pins", "isControl implies isControlType",
			 "not_unique", "not isUnique"
		   });	
		addAnnotation
		  (outputPinEClass, 
		   source, 
		   new String[] {
			 "incoming_edges_structured_only", "incoming->notEmpty() implies\r\n\taction<>null and\r\n\taction.oclIsKindOf(StructuredActivityNode) and\r\n\taction.oclAsType(StructuredActivityNode).allOwnedNodes()->includesAll(incoming.source)"
		   });	
		addAnnotation
		  (variableActionEClass, 
		   source, 
		   new String[] {
			 "scope_of_variable", "variable.isAccessibleBy(self)"
		   });	
		addAnnotation
		  (writeLinkActionEClass, 
		   source, 
		   new String[] {
			 "allow_access", "endData.end->exists(end |\r\n  end.type=_\'context\' or\r\n  end.visibility=VisibilityKind::public or \r\n  end.visibility=VisibilityKind::protected and\r\n  endData.end->exists(other | \r\n    other<>end and _\'context\'.conformsTo(other.type.oclAsType(Classifier))))\r\n"
		   });	
		addAnnotation
		  (linkActionEClass, 
		   source, 
		   new String[] {
			 "same_pins", "inputValue->asBag()=endData.allPins()",
			 "same_association", "endData.end = self.association().memberEnd->asBag()",
			 "not_static", "endData->forAll(not end.isStatic)"
		   });	
		addAnnotation
		  (getLinkAction__Association(), 
		   source, 
		   new String[] {
			 "body", "endData->asSequence()->first().end.association"
		   });	
		addAnnotation
		  (linkEndDataEClass, 
		   source, 
		   new String[] {
			 "same_type", "value<>null implies value.type.conformsTo(end.type)",
			 "multiplicity", "value<>null implies value.is(1,1)",
			 "end_object_input_pin", "value->excludesAll(qualifier.value)",
			 "property_is_association_end", "end.association <> null",
			 "qualifiers", "end.qualifier->includesAll(qualifier.qualifier)"
		   });	
		addAnnotation
		  (getLinkEndData__AllPins(), 
		   source, 
		   new String[] {
			 "body", "value->asBag()->union(qualifier.value)"
		   });	
		addAnnotation
		  (qualifierValueEClass, 
		   source, 
		   new String[] {
			 "multiplicity_of_qualifier", "value.is(1,1)",
			 "type_of_qualifier", "value.type.conformsTo(qualifier.type)",
			 "qualifier_attribute", "linkEndData.end.qualifier->includes(qualifier)"
		   });	
		addAnnotation
		  (writeStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity_of_result", "result <> null implies result.is(1,1)",
			 "type_of_value", "value <> null implies value.type.conformsTo(structuralFeature.type)",
			 "multiplicity_of_value", "value<>null implies value.is(1,1)",
			 "type_of_result", "result <> null implies result.type = object.type"
		   });	
		addAnnotation
		  (structuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity", "object.is(1,1)",
			 "object_type", "object.type.oclAsType(Classifier).allFeatures()->includes(structuralFeature) or\r\n\tobject.type.conformsTo(structuralFeature.oclAsType(Property).opposite.type)",
			 "visibility", "structuralFeature.visibility = VisibilityKind::public or\n_\'context\'.allFeatures()->includes(structuralFeature) or\nstructuralFeature.visibility=VisibilityKind::protected and\n_\'context\'.conformsTo(structuralFeature.oclAsType(Property).opposite.type.oclAsType(Classifier))\n",
			 "not_static", "not structuralFeature.isStatic",
			 "one_featuring_classifier", "structuralFeature.featuringClassifier->size() = 1"
		   });	
		addAnnotation
		  (writeVariableActionEClass, 
		   source, 
		   new String[] {
			 "value_type", "value <> null implies value.type.conformsTo(variable.type)",
			 "multiplicity", "value<>null implies value.is(1,1)"
		   });	
		addAnnotation
		  (acceptCallActionEClass, 
		   source, 
		   new String[] {
			 "result_pins", "let parameter: OrderedSet(Parameter) = trigger.event->asSequence()->first().oclAsType(CallEvent).operation.inputParameters() in\r\nresult->size() = parameter->size() and\r\nSequence{1..result->size()}->forAll(i | \r\n\tparameter->at(i).type.conformsTo(result->at(i).type) and \r\n\tparameter->at(i).isOrdered = result->at(i).isOrdered and\r\n\tparameter->at(i).compatibleWith(result->at(i)))",
			 "trigger_call_event", "trigger->size()=1 and\r\ntrigger->asSequence()->first().event.oclIsKindOf(CallEvent)\r\n",
			 "unmarshall", "isUnmarshall = true"
		   });	
		addAnnotation
		  (acceptEventActionEClass, 
		   source, 
		   new String[] {
			 "one_output_pin", "not isUnmarshall and trigger->exists(event.oclIsKindOf(SignalEvent) or event.oclIsKindOf(TimeEvent)) implies \r\n\toutput->size() = 1 and output->first().is(1,1)",
			 "no_input_pins", "input->size() = 0",
			 "no_output_pins", "(self.oclIsTypeOf(AcceptEventAction) and\r\n   (trigger->forAll(event.oclIsKindOf(ChangeEvent) or  \r\n                             event.oclIsKindOf(CallEvent))))\r\nimplies output->size() = 0",
			 "unmarshall_signal_events", "isUnmarshall and self.oclIsTypeOf(AcceptEventAction) implies\r\n\ttrigger->size()=1 and\r\n\ttrigger->asSequence()->first().event.oclIsKindOf(SignalEvent) and\r\n\tlet attribute: OrderedSet(Property) = trigger->asSequence()->first().event.oclAsType(SignalEvent).signal.allAttributes() in\r\n\tattribute->size()>0 and result->size() = attribute->size() and\r\n\tSequence{1..result->size()}->forAll(i | \r\n\t\tresult->at(i).type = attribute->at(i).type and \r\n\t\tresult->at(i).isOrdered = attribute->at(i).isOrdered and\r\n\t\tresult->at(i).includesMultiplicity(attribute->at(i)))",
			 "conforming_type", "not isUnmarshall implies \r\n\tresult->isEmpty() or\r\n\tlet type: Type = result->first().type in\r\n\ttype=null or \r\n\t\t(trigger->forAll(event.oclIsKindOf(SignalEvent)) and \r\n\t\t trigger.event.oclAsType(SignalEvent).signal->forAll(s | s.conformsTo(type)))"
		   });	
		addAnnotation
		  (actionInputPinEClass, 
		   source, 
		   new String[] {
			 "input_pin", "fromAction.input->forAll(oclIsKindOf(ActionInputPin))",
			 "one_output_pin", "fromAction.output->size() = 1",
			 "no_control_or_object_flow", "fromAction.incoming->union(outgoing)->isEmpty() and\r\nfromAction.input.incoming->isEmpty() and\r\nfromAction.output.outgoing->isEmpty()"
		   });	
		addAnnotation
		  (addStructuralFeatureValueActionEClass, 
		   source, 
		   new String[] {
			 "required_value", "value<>null",
			 "insertAt_pin", "if not structuralFeature.isOrdered then insertAt = null\nelse \n  not isReplaceAll implies\n  \tinsertAt<>null and \n  \tinsertAt->forAll(type=UnlimitedNatural and is(1,1.oclAsType(UnlimitedNatural)))\nendif\n"
		   });	
		addAnnotation
		  (addVariableValueActionEClass, 
		   source, 
		   new String[] {
			 "required_value", "value <> null",
			 "insertAt_pin", "if not variable.isOrdered then insertAt = null\nelse \n  not isReplaceAll implies\n  \tinsertAt<>null and \n  \tinsertAt->forAll(type=UnlimitedNatural and is(1,1.oclAsType(UnlimitedNatural)))\nendif\n"
		   });	
		addAnnotation
		  (broadcastSignalActionEClass, 
		   source, 
		   new String[] {
			 "number_of_arguments", "argument->size() = signal.allAttributes()->size()",
			 "type_ordering_multiplicity", "let attribute: OrderedSet(Property) = signal.allAttributes() in\r\nSequence{1..argument->size()}->forAll(i | \r\n\targument->at(i).type.conformsTo(attribute->at(i).type) and \r\n\targument->at(i).isOrdered = attribute->at(i).isOrdered and\r\n\targument->at(i).compatibleWith(attribute->at(i)))",
			 "no_onport", "onPort=null"
		   });	
		addAnnotation
		  (callActionEClass, 
		   source, 
		   new String[] {
			 "argument_pins", "let parameter: OrderedSet(Parameter) = self.inputParameters() in\r\nargument->size() = parameter->size() and\r\nSequence{1..argument->size()}->forAll(i | \r\n\targument->at(i).type.conformsTo(parameter->at(i).type) and \r\n\targument->at(i).isOrdered = parameter->at(i).isOrdered and\r\n\targument->at(i).compatibleWith(parameter->at(i)))",
			 "result_pins", "let parameter: OrderedSet(Parameter) = self.outputParameters() in\r\nresult->size() = parameter->size() and\r\nSequence{1..result->size()}->forAll(i | \r\n\tparameter->at(i).type.conformsTo(result->at(i).type) and \r\n\tparameter->at(i).isOrdered = result->at(i).isOrdered and\r\n\tparameter->at(i).compatibleWith(result->at(i)))",
			 "synchronous_call", "result->notEmpty() implies isSynchronous"
		   });	
		addAnnotation
		  (callBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "no_onport", "onPort=null"
		   });	
		addAnnotation
		  (callOperationActionEClass, 
		   source, 
		   new String[] {
			 "type_target_pin", "if onPort=null then  target.type.oclAsType(Classifier).allFeatures()->includes(operation)\r\nelse target.type.oclAsType(Classifier).allFeatures()->includes(onPort) and onPort.provided->union(onPort.required).allFeatures()->includes(operation)\r\nendif"
		   });	
		addAnnotation
		  (clauseEClass, 
		   source, 
		   new String[] {
			 "body_output_pins", "_\'body\'.oclAsType(Action).allActions().output->includesAll(bodyOutput)",
			 "decider_output", "test.oclAsType(Action).allActions().output->includes(decider) and\r\ndecider.type = Boolean and\r\ndecider.is(1,1)",
			 "test_and_body", "test->intersection(_\'body\')->isEmpty()"
		   });	
		addAnnotation
		  (clearAssociationActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity", "object.is(1,1)",
			 "same_type", "association.memberEnd->exists(self.object.type.conformsTo(type))"
		   });	
		addAnnotation
		  (clearStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "type_of_result", "result<>null implies result.type = object.type",
			 "multiplicity_of_result", "result<>null implies result.is(1,1)"
		   });	
		addAnnotation
		  (conditionalNodeEClass, 
		   source, 
		   new String[] {
			 "result_no_incoming", "result.incoming->isEmpty()",
			 "no_input_pins", "input->isEmpty()",
			 "one_clause_with_executable_node", "node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->forAll(n | \r\n\tself.clause->select(test->union(_\'body\')->includes(n))->size()=1)",
			 "matching_output_pins", "clause->forAll(\r\n\tbodyOutput->size()=self.result->size() and\r\n\tSequence{1..self.result->size()}->forAll(i |\r\n\t\tbodyOutput->at(i).type.conformsTo(result->at(i).type) and\r\n\t\tbodyOutput->at(i).isOrdered = result->at(i).isOrdered and\r\n\t\tbodyOutput->at(i).isUnique = result->at(i).isUnique and\r\n\t\tbodyOutput->at(i).compatibleWith(result->at(i))))",
			 "executable_nodes", "clause.test->union(clause._\'body\') = node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)",
			 "clause_no_predecessor", "clause->closure(predecessorClause)->intersection(clause)->isEmpty()"
		   });	
		addAnnotation
		  (createLinkActionEClass, 
		   source, 
		   new String[] {
			 "association_not_abstract", "not self.association().isAbstract"
		   });	
		addAnnotation
		  (linkEndCreationDataEClass, 
		   source, 
		   new String[] {
			 "insertAt_pin", "if  not end.isOrdered\nthen insertAt = null\nelse\n\tnot isReplaceAll=false implies\n\tinsertAt <> null and insertAt->forAll(type=UnlimitedNatural and is(1,1))\nendif\n"
		   });	
		addAnnotation
		  (createLinkObjectActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity", "result.is(1,1)",
			 "type_of_result", "result.type = association()",
			 "association_class", "self.association().oclIsKindOf(AssociationClass)"
		   });	
		addAnnotation
		  (createObjectActionEClass, 
		   source, 
		   new String[] {
			 "classifier_not_abstract", "not classifier.isAbstract ",
			 "multiplicity", "result.is(1,1)",
			 "classifier_not_association_class", "not classifier.oclIsKindOf(AssociationClass)",
			 "same_type", "result.type = classifier"
		   });	
		addAnnotation
		  (linkEndDestructionDataEClass, 
		   source, 
		   new String[] {
			 "destroyAt_pin", "if  not end.isOrdered or end.isUnique or isDestroyDuplicates\r\nthen destroyAt = null\r\nelse\r\n\tdestroyAt <> null and \r\n\tdestroyAt->forAll(type=UnlimitedNatural and is(1,1))\r\nendif\r\n"
		   });	
		addAnnotation
		  (destroyObjectActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity", "target.is(1,1)",
			 "no_type", "target.type= null"
		   });	
		addAnnotation
		  (expansionNodeEClass, 
		   source, 
		   new String[] {
			 "region_as_input_or_output", "regionAsInput->notEmpty() xor regionAsOutput->notEmpty()"
		   });	
		addAnnotation
		  (loopNodeEClass, 
		   source, 
		   new String[] {
			 "result_no_incoming", "result.incoming->isEmpty()",
			 "input_edges", "loopVariableInput.outgoing->isEmpty()",
			 "executable_nodes", "setupPart->union(test)->union(bodyPart)=node->select(oclIsKindOf(ExecutableNode)).oclAsType(ExecutableNode)->asSet()",
			 "body_output_pins", "bodyPart.oclAsType(Action).allActions().output->includesAll(bodyOutput)",
			 "setup_test_and_body", "setupPart->intersection(test)->isEmpty() and\r\nsetupPart->intersection(bodyPart)->isEmpty() and\r\ntest->intersection(bodyPart)->isEmpty()",
			 "matching_output_pins", "bodyOutput->size()=loopVariable->size() and\r\nSequence{1..loopVariable->size()}->forAll(i |\r\n\tbodyOutput->at(i).type.conformsTo(loopVariable->at(i).type) and\r\n\tbodyOutput->at(i).isOrdered = loopVariable->at(i).isOrdered and\r\n\tbodyOutput->at(i).isUnique = loopVariable->at(i).isUnique and\r\n\tloopVariable->at(i).includesMultiplicity(bodyOutput->at(i)))",
			 "matching_loop_variables", "loopVariableInput->size()=loopVariable->size() and\r\nloopVariableInput.type=loopVariable.type and\r\nloopVariableInput.isUnique=loopVariable.isUnique and\r\nloopVariableInput.lower=loopVariable.lower and\r\nloopVariableInput.upper=loopVariable.upper",
			 "matching_result_pins", "result->size()=loopVariable->size() and\r\nresult.type=loopVariable.type and\r\nresult.isUnique=loopVariable.isUnique and\r\nresult.lower=loopVariable.lower and\r\nresult.upper=loopVariable.upper",
			 "loop_variable_outgoing", "allOwnedNodes()->includesAll(loopVariable.outgoing.target)"
		   });	
		addAnnotation
		  (opaqueActionEClass, 
		   source, 
		   new String[] {
			 "language_body_size", "language->notEmpty() implies (_\'body\'->size() = language->size())"
		   });	
		addAnnotation
		  (readExtentActionEClass, 
		   source, 
		   new String[] {
			 "type_is_classifier", "result.type = classifier",
			 "multiplicity_of_result", "result.is(0,*)"
		   });	
		addAnnotation
		  (readIsClassifiedObjectActionEClass, 
		   source, 
		   new String[] {
			 "no_type", "object.type = null",
			 "multiplicity_of_output", "result.is(1,1)",
			 "boolean_result", "result.type = Boolean",
			 "multiplicity_of_input", "object.is(1,1)"
		   });	
		addAnnotation
		  (readLinkActionEClass, 
		   source, 
		   new String[] {
			 "type_and_ordering", "self.openEnd()->forAll(type=result.type and isOrdered=result.isOrdered)\n",
			 "compatible_multiplicity", "self.openEnd()->first().compatibleWith(result)\n",
			 "visibility", "let openEnd : Property = self.openEnd()->first() in\n  openEnd.visibility = VisibilityKind::public or \n  endData->exists(oed | \n    oed.end<>openEnd and \n    (_\'context\' = oed.end.type or \n      (openEnd.visibility = VisibilityKind::protected and \n        _\'context\'.conformsTo(oed.end.type.oclAsType(Classifier)))))\n",
			 "one_open_end", "self.openEnd()->size() = 1",
			 "navigable_open_end", "self.openEnd()->first().isNavigable()\n"
		   });	
		addAnnotation
		  (getReadLinkAction__OpenEnd(), 
		   source, 
		   new String[] {
			 "body", "endData->select(value=null).end->asOrderedSet()"
		   });	
		addAnnotation
		  (readLinkObjectEndActionEClass, 
		   source, 
		   new String[] {
			 "property", "end.association <> null",
			 "multiplicity_of_object", "object.is(1,1)",
			 "ends_of_association", "end.association.memberEnd->forAll(e | not e.isStatic)",
			 "type_of_result", "result.type = end.type",
			 "multiplicity_of_result", "result.is(1,1)",
			 "type_of_object", "object.type = end.association",
			 "association_of_association", "end.association.oclIsKindOf(AssociationClass)"
		   });	
		addAnnotation
		  (readLinkObjectEndQualifierActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity_of_object", "object.is(1,1)",
			 "type_of_object", "object.type = qualifier.associationEnd.association",
			 "multiplicity_of_qualifier", "qualifier.is(1,1)",
			 "ends_of_association", "qualifier.associationEnd.association.memberEnd->forAll(e | not e.isStatic)",
			 "multiplicity_of_result", "result.is(1,1)",
			 "same_type", "result.type = qualifier.type",
			 "association_of_association", "qualifier.associationEnd.association.oclIsKindOf(AssociationClass)",
			 "qualifier_attribute", "qualifier.associationEnd <> null"
		   });	
		addAnnotation
		  (readSelfActionEClass, 
		   source, 
		   new String[] {
			 "contained", "_\'context\' <> null",
			 "multiplicity", "result.is(1,1)",
			 "not_static", "let behavior: Behavior = self.containingBehavior() in\r\nbehavior.specification<>null implies not behavior.specification.isStatic",
			 "type", "result.type = _\'context\'"
		   });	
		addAnnotation
		  (readStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity", "structuralFeature.compatibleWith(result)",
			 "type_and_ordering", "result.type =structuralFeature.type and \nresult.isOrdered = structuralFeature.isOrdered\n"
		   });	
		addAnnotation
		  (readVariableActionEClass, 
		   source, 
		   new String[] {
			 "type_and_ordering", "result.type =variable.type and \nresult.isOrdered = variable.isOrdered\n",
			 "compatible_multiplicity", "variable.compatibleWith(result)"
		   });	
		addAnnotation
		  (reclassifyObjectActionEClass, 
		   source, 
		   new String[] {
			 "input_pin", "object.type = null",
			 "classifier_not_abstract", "not newClassifier->exists(isAbstract)",
			 "multiplicity", "object.is(1,1)"
		   });	
		addAnnotation
		  (reduceActionEClass, 
		   source, 
		   new String[] {
			 "reducer_inputs_output", "let inputs: OrderedSet(Parameter) = reducer.inputParameters() in\r\nlet outputs: OrderedSet(Parameter) = reducer.outputParameters() in\r\ninputs->size()=2 and outputs->size()=1 and\r\ninputs.type->forAll(t | \r\n\toutputs.type->forAll(conformsTo(t)) and \r\n\t-- Note that the following only checks the case when the collection is via multiple tokens.\r\n\tcollection.upperBound()>1 implies collection.type.conformsTo(t))",
			 "output_types_are_compatible", "reducer.outputParameters().type->forAll(conformsTo(result.type))"
		   });	
		addAnnotation
		  (removeStructuralFeatureValueActionEClass, 
		   source, 
		   new String[] {
			 "removeAt_and_value", "if structuralFeature.isOrdered and not structuralFeature.isUnique and  not isRemoveDuplicates then\r\n  value = null and\r\n  removeAt <> null and\r\n  removeAt.type = UnlimitedNatural and\r\n  removeAt.is(1,1)\r\nelse\r\n  removeAt = null and value <> null\r\nendif"
		   });	
		addAnnotation
		  (removeVariableValueActionEClass, 
		   source, 
		   new String[] {
			 "removeAt_and_value", "if  variable.isOrdered and not variable.isUnique and not isRemoveDuplicates then \r\n  value = null and\r\n  removeAt <> null and\r\n  removeAt.type = UnlimitedNatural and\r\n  removeAt.is(1,1)\r\nelse\r\n  removeAt = null and value <> null\r\nendif"
		   });	
		addAnnotation
		  (replyActionEClass, 
		   source, 
		   new String[] {
			 "pins_match_parameter", "let parameter:OrderedSet(Parameter) = replyToCall.event.oclAsType(CallEvent).operation.outputParameters() in\r\nreplyValue->size()=parameter->size() and\r\nSequence{1..replyValue->size()}->forAll(i |\r\n\treplyValue->at(i).type.conformsTo(parameter->at(i).type) and\r\n\treplyValue->at(i).isOrdered=parameter->at(i).isOrdered and\r\n\treplyValue->at(i).compatibleWith(parameter->at(i)))",
			 "event_on_reply_to_call_trigger", "replyToCall.event.oclIsKindOf(CallEvent)"
		   });	
		addAnnotation
		  (sendObjectActionEClass, 
		   source, 
		   new String[] {
			 "type_target_pin", "onPort<>null implies target.type.oclAsType(Classifier).allFeatures()->includes(onPort)"
		   });	
		addAnnotation
		  (sendSignalActionEClass, 
		   source, 
		   new String[] {
			 "type_ordering_multiplicity", "let attribute: OrderedSet(Property) = signal.allAttributes() in\r\nSequence{1..argument->size()}->forAll(i | \r\n\targument->at(i).type.conformsTo(attribute->at(i).type) and \r\n\targument->at(i).isOrdered = attribute->at(i).isOrdered and\r\n\targument->at(i).compatibleWith(attribute->at(i)))",
			 "number_order", "argument->size()=signal.allAttributes()->size()",
			 "type_target_pin", "not onPort->isEmpty() implies target.type.oclAsType(Classifier).allFeatures()->includes(onPort)\r\n"
		   });	
		addAnnotation
		  (startClassifierBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity", "object.is(1,1)",
			 "type_has_classifier", "object.type->notEmpty() implies \r\n   (object.type.oclIsKindOf(BehavioredClassifier) and object.type.oclAsType(BehavioredClassifier).classifierBehavior<>null)"
		   });	
		addAnnotation
		  (startObjectBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity_of_object", "object.is(1,1)",
			 "type_of_object", "self.behavior()<>null",
			 "no_onport", "onPort->isEmpty()"
		   });	
		addAnnotation
		  (getStartObjectBehaviorAction__Behavior(), 
		   source, 
		   new String[] {
			 "body", "if object.type.oclIsKindOf(Behavior) then\r\n  object.type.oclAsType(Behavior)\r\nelse if object.type.oclIsKindOf(BehavioredClassifier) then\r\n  object.type.oclAsType(BehavioredClassifier).classifierBehavior\r\nelse\r\n  null\r\nendif\r\nendif"
		   });	
		addAnnotation
		  (testIdentityActionEClass, 
		   source, 
		   new String[] {
			 "multiplicity", "first.is(1,1) and second.is(1,1)\n",
			 "no_type", "first.type= null and second.type = null\n",
			 "result_is_boolean", "result.type=Boolean"
		   });	
		addAnnotation
		  (unmarshallActionEClass, 
		   source, 
		   new String[] {
			 "structural_feature", "unmarshallType.allAttributes()->size() >= 1",
			 "number_of_result", "unmarshallType.allAttributes()->size() = result->size()",
			 "type_ordering_and_multiplicity", "let attribute:OrderedSet(Property) = unmarshallType.allAttributes() in\r\nSequence{1..result->size()}->forAll(i | \r\n\tattribute->at(i).type.conformsTo(result->at(i).type) and\r\n\tattribute->at(i).isOrdered=result->at(i).isOrdered and\r\n\tattribute->at(i).compatibleWith(result->at(i)))",
			 "multiplicity_of_object", "object.is(1,1)",
			 "object_type", "object.type.conformsTo(unmarshallType)"
		   });	
		addAnnotation
		  (valuePinEClass, 
		   source, 
		   new String[] {
			 "no_incoming_edges", "incoming->isEmpty()",
			 "compatible_type", "value.type.conformsTo(type)"
		   });	
		addAnnotation
		  (structuredActivityNodeEClass, 
		   source, 
		   new String[] {
			 "output_pin_edges", "output.outgoing.target->excludesAll(allOwnedNodes()-input)",
			 "edges", "edge=self.sourceNodes().outgoing->intersection(self.allOwnedNodes().incoming)->\r\n\tunion(self.targetNodes().incoming->intersection(self.allOwnedNodes().outgoing))->asSet()",
			 "input_pin_edges", "input.incoming.source->excludesAll(allOwnedNodes()-output)"
		   });	
		addAnnotation
		  (getStructuredActivityNode__SourceNodes(), 
		   source, 
		   new String[] {
			 "body", "node->union(input.oclAsType(ActivityNode)->asSet())->\r\n  union(node->select(oclIsKindOf(Action)).oclAsType(Action).output)->asSet()"
		   });	
		addAnnotation
		  (getStructuredActivityNode__TargetNodes(), 
		   source, 
		   new String[] {
			 "body", "node->union(output.oclAsType(ActivityNode)->asSet())->\r\n  union(node->select(oclIsKindOf(Action)).oclAsType(Action).input)->asSet()"
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
		  (getValueSpecificationAction_Result(), 
		   source, 
		   new String[] {
			 "body", "valueSpecificationAction"
		   });	
		addAnnotation
		  (getValueSpecificationAction_Value(), 
		   source, 
		   new String[] {
			 "body", "valueSpecificationAction"
		   });	
		addAnnotation
		  (getAction_Context(), 
		   source, 
		   new String[] {
			 "body", "action"
		   });	
		addAnnotation
		  (getAction_Input(), 
		   source, 
		   new String[] {
			 "body", "action"
		   });	
		addAnnotation
		  (getAction_LocalPostcondition(), 
		   source, 
		   new String[] {
			 "body", "action"
		   });	
		addAnnotation
		  (getAction_LocalPrecondition(), 
		   source, 
		   new String[] {
			 "body", "action"
		   });	
		addAnnotation
		  (getAction_Output(), 
		   source, 
		   new String[] {
			 "body", "action"
		   });	
		addAnnotation
		  (getVariableAction_Variable(), 
		   source, 
		   new String[] {
			 "body", "variableAction"
		   });	
		addAnnotation
		  (getLinkAction_EndData(), 
		   source, 
		   new String[] {
			 "body", "linkAction"
		   });	
		addAnnotation
		  (getLinkAction_InputValue(), 
		   source, 
		   new String[] {
			 "body", "linkAction"
		   });	
		addAnnotation
		  (getLinkEndData_End(), 
		   source, 
		   new String[] {
			 "body", "linkEndData"
		   });	
		addAnnotation
		  (getLinkEndData_Qualifier(), 
		   source, 
		   new String[] {
			 "body", "linkEndData"
		   });	
		addAnnotation
		  (getLinkEndData_Value(), 
		   source, 
		   new String[] {
			 "body", "linkEndData"
		   });	
		addAnnotation
		  (getQualifierValue_Qualifier(), 
		   source, 
		   new String[] {
			 "body", "qualifierValue"
		   });	
		addAnnotation
		  (getQualifierValue_Value(), 
		   source, 
		   new String[] {
			 "body", "qualifierValue"
		   });	
		addAnnotation
		  (getWriteStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
			 "body", "writeStructuralFeatureAction"
		   });	
		addAnnotation
		  (getWriteStructuralFeatureAction_Value(), 
		   source, 
		   new String[] {
			 "body", "writeStructuralFeatureAction"
		   });	
		addAnnotation
		  (getStructuralFeatureAction_Object(), 
		   source, 
		   new String[] {
			 "body", "structuralFeatureAction"
		   });	
		addAnnotation
		  (getStructuralFeatureAction_StructuralFeature(), 
		   source, 
		   new String[] {
			 "body", "structuralFeatureAction"
		   });	
		addAnnotation
		  (getWriteVariableAction_Value(), 
		   source, 
		   new String[] {
			 "body", "writeVariableAction"
		   });	
		addAnnotation
		  (getAcceptCallAction_ReturnInformation(), 
		   source, 
		   new String[] {
			 "body", "acceptCallAction"
		   });	
		addAnnotation
		  (getAcceptEventAction_Result(), 
		   source, 
		   new String[] {
			 "body", "acceptEventAction"
		   });	
		addAnnotation
		  (getAcceptEventAction_Trigger(), 
		   source, 
		   new String[] {
			 "body", "acceptEventAction"
		   });	
		addAnnotation
		  (getActionInputPin_FromAction(), 
		   source, 
		   new String[] {
			 "body", "actionInputPin"
		   });	
		addAnnotation
		  (getAddStructuralFeatureValueAction_InsertAt(), 
		   source, 
		   new String[] {
			 "body", "addStructuralFeatureValueAction"
		   });	
		addAnnotation
		  (getAddVariableValueAction_InsertAt(), 
		   source, 
		   new String[] {
			 "body", "addVariableValueAction"
		   });	
		addAnnotation
		  (getBroadcastSignalAction_Signal(), 
		   source, 
		   new String[] {
			 "body", "broadcastSignalAction"
		   });	
		addAnnotation
		  (getInvocationAction_Argument(), 
		   source, 
		   new String[] {
			 "body", "invocationAction"
		   });	
		addAnnotation
		  (getInvocationAction_OnPort(), 
		   source, 
		   new String[] {
			 "body", "invocationAction"
		   });	
		addAnnotation
		  (getCallAction_Result(), 
		   source, 
		   new String[] {
			 "body", "callAction"
		   });	
		addAnnotation
		  (getCallBehaviorAction_Behavior(), 
		   source, 
		   new String[] {
			 "body", "callBehaviorAction"
		   });	
		addAnnotation
		  (getCallOperationAction_Operation(), 
		   source, 
		   new String[] {
			 "body", "callOperationAction"
		   });	
		addAnnotation
		  (getCallOperationAction_Target(), 
		   source, 
		   new String[] {
			 "body", "callOperationAction"
		   });	
		addAnnotation
		  (getClause_Body(), 
		   source, 
		   new String[] {
			 "body", "clause"
		   });	
		addAnnotation
		  (getClause_BodyOutput(), 
		   source, 
		   new String[] {
			 "body", "clause"
		   });	
		addAnnotation
		  (getClause_Decider(), 
		   source, 
		   new String[] {
			 "body", "clause"
		   });	
		addAnnotation
		  (getClause_Test(), 
		   source, 
		   new String[] {
			 "body", "clause"
		   });	
		addAnnotation
		  (getClearAssociationAction_Association(), 
		   source, 
		   new String[] {
			 "body", "clearAssociationAction"
		   });	
		addAnnotation
		  (getClearAssociationAction_Object(), 
		   source, 
		   new String[] {
			 "body", "clearAssociationAction"
		   });	
		addAnnotation
		  (getClearStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
			 "body", "clearStructuralFeatureAction"
		   });	
		addAnnotation
		  (getConditionalNode_Clause(), 
		   source, 
		   new String[] {
			 "body", "conditionalNode"
		   });	
		addAnnotation
		  (getConditionalNode_Result(), 
		   source, 
		   new String[] {
			 "body", "conditionalNode"
		   });	
		addAnnotation
		  (getLinkEndCreationData_InsertAt(), 
		   source, 
		   new String[] {
			 "body", "linkEndCreationData"
		   });	
		addAnnotation
		  (getCreateLinkObjectAction_Result(), 
		   source, 
		   new String[] {
			 "body", "createLinkObjectAction"
		   });	
		addAnnotation
		  (getCreateObjectAction_Classifier(), 
		   source, 
		   new String[] {
			 "body", "createObjectAction"
		   });	
		addAnnotation
		  (getCreateObjectAction_Result(), 
		   source, 
		   new String[] {
			 "body", "createObjectAction"
		   });	
		addAnnotation
		  (getLinkEndDestructionData_DestroyAt(), 
		   source, 
		   new String[] {
			 "body", "linkEndDestructionData"
		   });	
		addAnnotation
		  (getDestroyObjectAction_Target(), 
		   source, 
		   new String[] {
			 "body", "destroyObjectAction"
		   });	
		addAnnotation
		  (getLoopNode_BodyOutput(), 
		   source, 
		   new String[] {
			 "body", "loopNode"
		   });	
		addAnnotation
		  (getLoopNode_BodyPart(), 
		   source, 
		   new String[] {
			 "body", "loopNode"
		   });	
		addAnnotation
		  (getLoopNode_Decider(), 
		   source, 
		   new String[] {
			 "body", "loopNode"
		   });	
		addAnnotation
		  (getLoopNode_LoopVariable(), 
		   source, 
		   new String[] {
			 "body", "loopNode"
		   });	
		addAnnotation
		  (getLoopNode_LoopVariableInput(), 
		   source, 
		   new String[] {
			 "body", "loopNode"
		   });	
		addAnnotation
		  (getLoopNode_Result(), 
		   source, 
		   new String[] {
			 "body", "loopNode"
		   });	
		addAnnotation
		  (getLoopNode_SetupPart(), 
		   source, 
		   new String[] {
			 "body", "loopNode"
		   });	
		addAnnotation
		  (getLoopNode_Test(), 
		   source, 
		   new String[] {
			 "body", "loopNode"
		   });	
		addAnnotation
		  (getOpaqueAction_InputValue(), 
		   source, 
		   new String[] {
			 "body", "opaqueAction"
		   });	
		addAnnotation
		  (getOpaqueAction_OutputValue(), 
		   source, 
		   new String[] {
			 "body", "opaqueAction"
		   });	
		addAnnotation
		  (getRaiseExceptionAction_Exception(), 
		   source, 
		   new String[] {
			 "body", "raiseExceptionAction"
		   });	
		addAnnotation
		  (getReadExtentAction_Classifier(), 
		   source, 
		   new String[] {
			 "body", "readExtentAction"
		   });	
		addAnnotation
		  (getReadExtentAction_Result(), 
		   source, 
		   new String[] {
			 "body", "readExtentAction"
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction_Classifier(), 
		   source, 
		   new String[] {
			 "body", "readIsClassifiedObjectAction"
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction_Object(), 
		   source, 
		   new String[] {
			 "body", "readIsClassifiedObjectAction"
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction_Result(), 
		   source, 
		   new String[] {
			 "body", "readIsClassifiedObjectAction"
		   });	
		addAnnotation
		  (getReadLinkAction_Result(), 
		   source, 
		   new String[] {
			 "body", "readLinkAction"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction_End(), 
		   source, 
		   new String[] {
			 "body", "readLinkObjectEndAction"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction_Object(), 
		   source, 
		   new String[] {
			 "body", "readLinkObjectEndAction"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction_Result(), 
		   source, 
		   new String[] {
			 "body", "readLinkObjectEndAction"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Object(), 
		   source, 
		   new String[] {
			 "body", "readLinkObjectEndQualifierAction"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Qualifier(), 
		   source, 
		   new String[] {
			 "body", "readLinkObjectEndQualifierAction"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Result(), 
		   source, 
		   new String[] {
			 "body", "readLinkObjectEndQualifierAction"
		   });	
		addAnnotation
		  (getReadSelfAction_Result(), 
		   source, 
		   new String[] {
			 "body", "readSelfAction"
		   });	
		addAnnotation
		  (getReadStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
			 "body", "readStructuralFeatureAction"
		   });	
		addAnnotation
		  (getReadVariableAction_Result(), 
		   source, 
		   new String[] {
			 "body", "readVariableAction"
		   });	
		addAnnotation
		  (getReclassifyObjectAction_NewClassifier(), 
		   source, 
		   new String[] {
			 "body", "reclassifyObjectAction"
		   });	
		addAnnotation
		  (getReclassifyObjectAction_Object(), 
		   source, 
		   new String[] {
			 "body", "reclassifyObjectAction"
		   });	
		addAnnotation
		  (getReclassifyObjectAction_OldClassifier(), 
		   source, 
		   new String[] {
			 "body", "reclassifyObjectAction"
		   });	
		addAnnotation
		  (getReduceAction_Collection(), 
		   source, 
		   new String[] {
			 "body", "reduceAction"
		   });	
		addAnnotation
		  (getReduceAction_Reducer(), 
		   source, 
		   new String[] {
			 "body", "reduceAction"
		   });	
		addAnnotation
		  (getReduceAction_Result(), 
		   source, 
		   new String[] {
			 "body", "reduceAction"
		   });	
		addAnnotation
		  (getRemoveStructuralFeatureValueAction_RemoveAt(), 
		   source, 
		   new String[] {
			 "body", "removeStructuralFeatureValueAction"
		   });	
		addAnnotation
		  (getRemoveVariableValueAction_RemoveAt(), 
		   source, 
		   new String[] {
			 "body", "removeVariableValueAction"
		   });	
		addAnnotation
		  (getReplyAction_ReplyToCall(), 
		   source, 
		   new String[] {
			 "body", "replyAction"
		   });	
		addAnnotation
		  (getReplyAction_ReplyValue(), 
		   source, 
		   new String[] {
			 "body", "replyAction"
		   });	
		addAnnotation
		  (getReplyAction_ReturnInformation(), 
		   source, 
		   new String[] {
			 "body", "replyAction"
		   });	
		addAnnotation
		  (getSendObjectAction_Request(), 
		   source, 
		   new String[] {
			 "body", "sendObjectAction"
		   });	
		addAnnotation
		  (getSendObjectAction_Target(), 
		   source, 
		   new String[] {
			 "body", "sendObjectAction"
		   });	
		addAnnotation
		  (getSendSignalAction_Signal(), 
		   source, 
		   new String[] {
			 "body", "sendSignalAction"
		   });	
		addAnnotation
		  (getSendSignalAction_Target(), 
		   source, 
		   new String[] {
			 "body", "sendSignalAction"
		   });	
		addAnnotation
		  (getSequenceNode_ExecutableNode(), 
		   source, 
		   new String[] {
			 "body", "sequenceNode"
		   });	
		addAnnotation
		  (getStartClassifierBehaviorAction_Object(), 
		   source, 
		   new String[] {
			 "body", "startClassifierBehaviorAction"
		   });	
		addAnnotation
		  (getStartObjectBehaviorAction_Object(), 
		   source, 
		   new String[] {
			 "body", "startObjectBehaviorAction"
		   });	
		addAnnotation
		  (getTestIdentityAction_First(), 
		   source, 
		   new String[] {
			 "body", "testIdentityAction"
		   });	
		addAnnotation
		  (getTestIdentityAction_Result(), 
		   source, 
		   new String[] {
			 "body", "testIdentityAction"
		   });	
		addAnnotation
		  (getTestIdentityAction_Second(), 
		   source, 
		   new String[] {
			 "body", "testIdentityAction"
		   });	
		addAnnotation
		  (getUnmarshallAction_Object(), 
		   source, 
		   new String[] {
			 "body", "unmarshallAction"
		   });	
		addAnnotation
		  (getUnmarshallAction_Result(), 
		   source, 
		   new String[] {
			 "body", "unmarshallAction"
		   });	
		addAnnotation
		  (getUnmarshallAction_UnmarshallType(), 
		   source, 
		   new String[] {
			 "body", "unmarshallAction"
		   });	
		addAnnotation
		  (getValuePin_Value(), 
		   source, 
		   new String[] {
			 "body", "valuePin"
		   });	
		addAnnotation
		  (getStructuredActivityNode_StructuredNodeInput(), 
		   source, 
		   new String[] {
			 "body", "structuredActivityNode"
		   });	
		addAnnotation
		  (getStructuredActivityNode_StructuredNodeOutput(), 
		   source, 
		   new String[] {
			 "body", "structuredActivityNode"
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
		  (getValueSpecificationAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getValueSpecificationAction_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAction_Input(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAction_LocalPostcondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAction_LocalPrecondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAction_Output(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLinkAction_EndData(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLinkAction_InputValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLinkEndData_Qualifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getWriteStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getWriteStructuralFeatureAction_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuralFeatureAction_Object(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getWriteVariableAction_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAcceptCallAction_ReturnInformation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAcceptEventAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAcceptEventAction_Trigger(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActionInputPin_FromAction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAddStructuralFeatureValueAction_InsertAt(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAddVariableValueAction_InsertAt(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInvocationAction_Argument(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCallAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCallOperationAction_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClearAssociationAction_Object(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClearStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConditionalNode_Clause(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCreateLinkObjectAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCreateObjectAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDestroyObjectAction_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLoopNode_LoopVariable(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOpaqueAction_InputValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOpaqueAction_OutputValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRaiseExceptionAction_Exception(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadExtentAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction_Object(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadLinkAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction_Object(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Object(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadSelfAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReadVariableAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReclassifyObjectAction_Object(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReduceAction_Collection(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReduceAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRemoveStructuralFeatureValueAction_RemoveAt(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRemoveVariableValueAction_RemoveAt(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReplyAction_ReplyValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReplyAction_ReturnInformation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSendObjectAction_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSendSignalAction_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStartClassifierBehaviorAction_Object(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStartObjectBehaviorAction_Object(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTestIdentityAction_First(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTestIdentityAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTestIdentityAction_Second(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnmarshallAction_Object(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnmarshallAction_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getValuePin_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuredActivityNode_Variable(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuredActivityNode_Edge(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuredActivityNode_StructuredNodeInput(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuredActivityNode_StructuredNodeOutput(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuredActivityNode_Node(), 
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
		  (getAction_Input(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAction_Output(), 
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
		  (callBehaviorActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (callOperationActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (conditionalNodeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (createLinkActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (linkEndCreationDataEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (destroyLinkActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (linkEndDestructionDataEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (loopNodeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (startObjectBehaviorActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (structuredActivityNodeEClass, 
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
		  (getConditionalNode_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLoopNode_LoopVariableInput(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLoopNode_Result(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSendObjectAction_Request(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSequenceNode_ExecutableNode(), 
		   source, 
		   new String[] {
		   });
	}

} //ActionsPackageImpl
