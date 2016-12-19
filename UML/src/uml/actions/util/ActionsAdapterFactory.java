/**
 */
package uml.actions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uml.actions.*;

import uml.activities.ActivityGroup;
import uml.activities.ActivityNode;
import uml.activities.ExecutableNode;
import uml.activities.ObjectNode;

import uml.classification.RedefinableElement;

import uml.commonStructure.Element;
import uml.commonStructure.MultiplicityElement;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uml.actions.ActionsPackage
 * @generated
 */
public class ActionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ActionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionsSwitch<Adapter> modelSwitch =
		new ActionsSwitch<Adapter>() {
			@Override
			public Adapter caseValueSpecificationAction(ValueSpecificationAction object) {
				return createValueSpecificationActionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseInputPin(InputPin object) {
				return createInputPinAdapter();
			}
			@Override
			public Adapter casePin(Pin object) {
				return createPinAdapter();
			}
			@Override
			public Adapter caseOutputPin(OutputPin object) {
				return createOutputPinAdapter();
			}
			@Override
			public Adapter caseVariableAction(VariableAction object) {
				return createVariableActionAdapter();
			}
			@Override
			public Adapter caseWriteLinkAction(WriteLinkAction object) {
				return createWriteLinkActionAdapter();
			}
			@Override
			public Adapter caseLinkAction(LinkAction object) {
				return createLinkActionAdapter();
			}
			@Override
			public Adapter caseLinkEndData(LinkEndData object) {
				return createLinkEndDataAdapter();
			}
			@Override
			public Adapter caseQualifierValue(QualifierValue object) {
				return createQualifierValueAdapter();
			}
			@Override
			public Adapter caseWriteStructuralFeatureAction(WriteStructuralFeatureAction object) {
				return createWriteStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseStructuralFeatureAction(StructuralFeatureAction object) {
				return createStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseWriteVariableAction(WriteVariableAction object) {
				return createWriteVariableActionAdapter();
			}
			@Override
			public Adapter caseAcceptCallAction(AcceptCallAction object) {
				return createAcceptCallActionAdapter();
			}
			@Override
			public Adapter caseAcceptEventAction(AcceptEventAction object) {
				return createAcceptEventActionAdapter();
			}
			@Override
			public Adapter caseActionInputPin(ActionInputPin object) {
				return createActionInputPinAdapter();
			}
			@Override
			public Adapter caseAddStructuralFeatureValueAction(AddStructuralFeatureValueAction object) {
				return createAddStructuralFeatureValueActionAdapter();
			}
			@Override
			public Adapter caseAddVariableValueAction(AddVariableValueAction object) {
				return createAddVariableValueActionAdapter();
			}
			@Override
			public Adapter caseBroadcastSignalAction(BroadcastSignalAction object) {
				return createBroadcastSignalActionAdapter();
			}
			@Override
			public Adapter caseInvocationAction(InvocationAction object) {
				return createInvocationActionAdapter();
			}
			@Override
			public Adapter caseCallAction(CallAction object) {
				return createCallActionAdapter();
			}
			@Override
			public Adapter caseCallBehaviorAction(CallBehaviorAction object) {
				return createCallBehaviorActionAdapter();
			}
			@Override
			public Adapter caseCallOperationAction(CallOperationAction object) {
				return createCallOperationActionAdapter();
			}
			@Override
			public Adapter caseClause(Clause object) {
				return createClauseAdapter();
			}
			@Override
			public Adapter caseClearAssociationAction(ClearAssociationAction object) {
				return createClearAssociationActionAdapter();
			}
			@Override
			public Adapter caseClearStructuralFeatureAction(ClearStructuralFeatureAction object) {
				return createClearStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseClearVariableAction(ClearVariableAction object) {
				return createClearVariableActionAdapter();
			}
			@Override
			public Adapter caseConditionalNode(ConditionalNode object) {
				return createConditionalNodeAdapter();
			}
			@Override
			public Adapter caseCreateLinkAction(CreateLinkAction object) {
				return createCreateLinkActionAdapter();
			}
			@Override
			public Adapter caseLinkEndCreationData(LinkEndCreationData object) {
				return createLinkEndCreationDataAdapter();
			}
			@Override
			public Adapter caseCreateLinkObjectAction(CreateLinkObjectAction object) {
				return createCreateLinkObjectActionAdapter();
			}
			@Override
			public Adapter caseCreateObjectAction(CreateObjectAction object) {
				return createCreateObjectActionAdapter();
			}
			@Override
			public Adapter caseDestroyLinkAction(DestroyLinkAction object) {
				return createDestroyLinkActionAdapter();
			}
			@Override
			public Adapter caseLinkEndDestructionData(LinkEndDestructionData object) {
				return createLinkEndDestructionDataAdapter();
			}
			@Override
			public Adapter caseDestroyObjectAction(DestroyObjectAction object) {
				return createDestroyObjectActionAdapter();
			}
			@Override
			public Adapter caseExpansionNode(ExpansionNode object) {
				return createExpansionNodeAdapter();
			}
			@Override
			public Adapter caseExpansionRegion(ExpansionRegion object) {
				return createExpansionRegionAdapter();
			}
			@Override
			public Adapter caseLoopNode(LoopNode object) {
				return createLoopNodeAdapter();
			}
			@Override
			public Adapter caseOpaqueAction(OpaqueAction object) {
				return createOpaqueActionAdapter();
			}
			@Override
			public Adapter caseRaiseExceptionAction(RaiseExceptionAction object) {
				return createRaiseExceptionActionAdapter();
			}
			@Override
			public Adapter caseReadExtentAction(ReadExtentAction object) {
				return createReadExtentActionAdapter();
			}
			@Override
			public Adapter caseReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction object) {
				return createReadIsClassifiedObjectActionAdapter();
			}
			@Override
			public Adapter caseReadLinkAction(ReadLinkAction object) {
				return createReadLinkActionAdapter();
			}
			@Override
			public Adapter caseReadLinkObjectEndAction(ReadLinkObjectEndAction object) {
				return createReadLinkObjectEndActionAdapter();
			}
			@Override
			public Adapter caseReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction object) {
				return createReadLinkObjectEndQualifierActionAdapter();
			}
			@Override
			public Adapter caseReadSelfAction(ReadSelfAction object) {
				return createReadSelfActionAdapter();
			}
			@Override
			public Adapter caseReadStructuralFeatureAction(ReadStructuralFeatureAction object) {
				return createReadStructuralFeatureActionAdapter();
			}
			@Override
			public Adapter caseReadVariableAction(ReadVariableAction object) {
				return createReadVariableActionAdapter();
			}
			@Override
			public Adapter caseReclassifyObjectAction(ReclassifyObjectAction object) {
				return createReclassifyObjectActionAdapter();
			}
			@Override
			public Adapter caseReduceAction(ReduceAction object) {
				return createReduceActionAdapter();
			}
			@Override
			public Adapter caseRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction object) {
				return createRemoveStructuralFeatureValueActionAdapter();
			}
			@Override
			public Adapter caseRemoveVariableValueAction(RemoveVariableValueAction object) {
				return createRemoveVariableValueActionAdapter();
			}
			@Override
			public Adapter caseReplyAction(ReplyAction object) {
				return createReplyActionAdapter();
			}
			@Override
			public Adapter caseSendObjectAction(SendObjectAction object) {
				return createSendObjectActionAdapter();
			}
			@Override
			public Adapter caseSendSignalAction(SendSignalAction object) {
				return createSendSignalActionAdapter();
			}
			@Override
			public Adapter caseSequenceNode(SequenceNode object) {
				return createSequenceNodeAdapter();
			}
			@Override
			public Adapter caseStartClassifierBehaviorAction(StartClassifierBehaviorAction object) {
				return createStartClassifierBehaviorActionAdapter();
			}
			@Override
			public Adapter caseStartObjectBehaviorAction(StartObjectBehaviorAction object) {
				return createStartObjectBehaviorActionAdapter();
			}
			@Override
			public Adapter caseTestIdentityAction(TestIdentityAction object) {
				return createTestIdentityActionAdapter();
			}
			@Override
			public Adapter caseUnmarshallAction(UnmarshallAction object) {
				return createUnmarshallActionAdapter();
			}
			@Override
			public Adapter caseValuePin(ValuePin object) {
				return createValuePinAdapter();
			}
			@Override
			public Adapter caseStructuredActivityNode(StructuredActivityNode object) {
				return createStructuredActivityNodeAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseRedefinableElement(RedefinableElement object) {
				return createRedefinableElementAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object) {
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseObjectNode(ObjectNode object) {
				return createObjectNodeAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseActivityGroup(ActivityGroup object) {
				return createActivityGroupAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ValueSpecificationAction <em>Value Specification Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ValueSpecificationAction
	 * @generated
	 */
	public Adapter createValueSpecificationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.InputPin
	 * @generated
	 */
	public Adapter createInputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.OutputPin
	 * @generated
	 */
	public Adapter createOutputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.VariableAction <em>Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.VariableAction
	 * @generated
	 */
	public Adapter createVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.WriteLinkAction <em>Write Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.WriteLinkAction
	 * @generated
	 */
	public Adapter createWriteLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.LinkAction <em>Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.LinkAction
	 * @generated
	 */
	public Adapter createLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.LinkEndData <em>Link End Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.LinkEndData
	 * @generated
	 */
	public Adapter createLinkEndDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.QualifierValue <em>Qualifier Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.QualifierValue
	 * @generated
	 */
	public Adapter createQualifierValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.WriteStructuralFeatureAction <em>Write Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.WriteStructuralFeatureAction
	 * @generated
	 */
	public Adapter createWriteStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.StructuralFeatureAction <em>Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.StructuralFeatureAction
	 * @generated
	 */
	public Adapter createStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.WriteVariableAction <em>Write Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.WriteVariableAction
	 * @generated
	 */
	public Adapter createWriteVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.AcceptCallAction <em>Accept Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.AcceptCallAction
	 * @generated
	 */
	public Adapter createAcceptCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.AcceptEventAction <em>Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.AcceptEventAction
	 * @generated
	 */
	public Adapter createAcceptEventActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ActionInputPin <em>Action Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ActionInputPin
	 * @generated
	 */
	public Adapter createActionInputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.AddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.AddStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createAddStructuralFeatureValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.AddVariableValueAction <em>Add Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.AddVariableValueAction
	 * @generated
	 */
	public Adapter createAddVariableValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.BroadcastSignalAction <em>Broadcast Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.BroadcastSignalAction
	 * @generated
	 */
	public Adapter createBroadcastSignalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.InvocationAction <em>Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.InvocationAction
	 * @generated
	 */
	public Adapter createInvocationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.CallAction
	 * @generated
	 */
	public Adapter createCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.CallBehaviorAction
	 * @generated
	 */
	public Adapter createCallBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.CallOperationAction
	 * @generated
	 */
	public Adapter createCallOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ClearAssociationAction <em>Clear Association Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ClearAssociationAction
	 * @generated
	 */
	public Adapter createClearAssociationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ClearStructuralFeatureAction
	 * @generated
	 */
	public Adapter createClearStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ClearVariableAction <em>Clear Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ClearVariableAction
	 * @generated
	 */
	public Adapter createClearVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ConditionalNode
	 * @generated
	 */
	public Adapter createConditionalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.CreateLinkAction <em>Create Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.CreateLinkAction
	 * @generated
	 */
	public Adapter createCreateLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.LinkEndCreationData <em>Link End Creation Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.LinkEndCreationData
	 * @generated
	 */
	public Adapter createLinkEndCreationDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.CreateLinkObjectAction <em>Create Link Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.CreateLinkObjectAction
	 * @generated
	 */
	public Adapter createCreateLinkObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.CreateObjectAction <em>Create Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.CreateObjectAction
	 * @generated
	 */
	public Adapter createCreateObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.DestroyLinkAction <em>Destroy Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.DestroyLinkAction
	 * @generated
	 */
	public Adapter createDestroyLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.LinkEndDestructionData <em>Link End Destruction Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.LinkEndDestructionData
	 * @generated
	 */
	public Adapter createLinkEndDestructionDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.DestroyObjectAction <em>Destroy Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.DestroyObjectAction
	 * @generated
	 */
	public Adapter createDestroyObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ExpansionNode <em>Expansion Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ExpansionNode
	 * @generated
	 */
	public Adapter createExpansionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ExpansionRegion <em>Expansion Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ExpansionRegion
	 * @generated
	 */
	public Adapter createExpansionRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.LoopNode
	 * @generated
	 */
	public Adapter createLoopNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.OpaqueAction
	 * @generated
	 */
	public Adapter createOpaqueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.RaiseExceptionAction <em>Raise Exception Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.RaiseExceptionAction
	 * @generated
	 */
	public Adapter createRaiseExceptionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReadExtentAction <em>Read Extent Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReadExtentAction
	 * @generated
	 */
	public Adapter createReadExtentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReadIsClassifiedObjectAction <em>Read Is Classified Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReadIsClassifiedObjectAction
	 * @generated
	 */
	public Adapter createReadIsClassifiedObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReadLinkAction <em>Read Link Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReadLinkAction
	 * @generated
	 */
	public Adapter createReadLinkActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReadLinkObjectEndAction <em>Read Link Object End Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReadLinkObjectEndAction
	 * @generated
	 */
	public Adapter createReadLinkObjectEndActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReadLinkObjectEndQualifierAction <em>Read Link Object End Qualifier Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReadLinkObjectEndQualifierAction
	 * @generated
	 */
	public Adapter createReadLinkObjectEndQualifierActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReadSelfAction <em>Read Self Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReadSelfAction
	 * @generated
	 */
	public Adapter createReadSelfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReadStructuralFeatureAction <em>Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReadStructuralFeatureAction
	 * @generated
	 */
	public Adapter createReadStructuralFeatureActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReadVariableAction <em>Read Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReadVariableAction
	 * @generated
	 */
	public Adapter createReadVariableActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReclassifyObjectAction <em>Reclassify Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReclassifyObjectAction
	 * @generated
	 */
	public Adapter createReclassifyObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReduceAction <em>Reduce Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReduceAction
	 * @generated
	 */
	public Adapter createReduceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.RemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.RemoveStructuralFeatureValueAction
	 * @generated
	 */
	public Adapter createRemoveStructuralFeatureValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.RemoveVariableValueAction <em>Remove Variable Value Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.RemoveVariableValueAction
	 * @generated
	 */
	public Adapter createRemoveVariableValueActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ReplyAction <em>Reply Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ReplyAction
	 * @generated
	 */
	public Adapter createReplyActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.SendObjectAction <em>Send Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.SendObjectAction
	 * @generated
	 */
	public Adapter createSendObjectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.SendSignalAction <em>Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.SendSignalAction
	 * @generated
	 */
	public Adapter createSendSignalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.SequenceNode
	 * @generated
	 */
	public Adapter createSequenceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.StartClassifierBehaviorAction <em>Start Classifier Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.StartClassifierBehaviorAction
	 * @generated
	 */
	public Adapter createStartClassifierBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.StartObjectBehaviorAction <em>Start Object Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.StartObjectBehaviorAction
	 * @generated
	 */
	public Adapter createStartObjectBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.TestIdentityAction <em>Test Identity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.TestIdentityAction
	 * @generated
	 */
	public Adapter createTestIdentityActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.UnmarshallAction <em>Unmarshall Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.UnmarshallAction
	 * @generated
	 */
	public Adapter createUnmarshallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.ValuePin <em>Value Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.ValuePin
	 * @generated
	 */
	public Adapter createValuePinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.actions.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.actions.StructuredActivityNode
	 * @generated
	 */
	public Adapter createStructuredActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.classification.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.classification.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.activities.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.activities.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.activities.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.activities.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.activities.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.activities.ObjectNode
	 * @generated
	 */
	public Adapter createObjectNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.activities.ActivityGroup <em>Activity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.activities.ActivityGroup
	 * @generated
	 */
	public Adapter createActivityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ActionsAdapterFactory
