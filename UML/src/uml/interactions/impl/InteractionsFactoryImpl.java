/**
 */
package uml.interactions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.interactions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionsFactoryImpl extends EFactoryImpl implements InteractionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteractionsFactory init() {
		try {
			InteractionsFactory theInteractionsFactory = (InteractionsFactory)EPackage.Registry.INSTANCE.getEFactory(InteractionsPackage.eNS_URI);
			if (theInteractionsFactory != null) {
				return theInteractionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InteractionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case InteractionsPackage.ACTION_EXECUTION_SPECIFICATION: return createActionExecutionSpecification();
			case InteractionsPackage.LIFELINE: return createLifeline();
			case InteractionsPackage.PART_DECOMPOSITION: return createPartDecomposition();
			case InteractionsPackage.INTERACTION_USE: return createInteractionUse();
			case InteractionsPackage.GATE: return createGate();
			case InteractionsPackage.MESSAGE: return createMessage();
			case InteractionsPackage.INTERACTION: return createInteraction();
			case InteractionsPackage.INTERACTION_OPERAND: return createInteractionOperand();
			case InteractionsPackage.INTERACTION_CONSTRAINT: return createInteractionConstraint();
			case InteractionsPackage.GENERAL_ORDERING: return createGeneralOrdering();
			case InteractionsPackage.OCCURRENCE_SPECIFICATION: return createOccurrenceSpecification();
			case InteractionsPackage.BEHAVIOR_EXECUTION_SPECIFICATION: return createBehaviorExecutionSpecification();
			case InteractionsPackage.COMBINED_FRAGMENT: return createCombinedFragment();
			case InteractionsPackage.CONSIDER_IGNORE_FRAGMENT: return createConsiderIgnoreFragment();
			case InteractionsPackage.CONTINUATION: return createContinuation();
			case InteractionsPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION: return createDestructionOccurrenceSpecification();
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION: return createMessageOccurrenceSpecification();
			case InteractionsPackage.EXECUTION_OCCURRENCE_SPECIFICATION: return createExecutionOccurrenceSpecification();
			case InteractionsPackage.STATE_INVARIANT: return createStateInvariant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case InteractionsPackage.MESSAGE_KIND:
				return createMessageKindFromString(eDataType, initialValue);
			case InteractionsPackage.MESSAGE_SORT:
				return createMessageSortFromString(eDataType, initialValue);
			case InteractionsPackage.INTERACTION_OPERATOR_KIND:
				return createInteractionOperatorKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case InteractionsPackage.MESSAGE_KIND:
				return convertMessageKindToString(eDataType, instanceValue);
			case InteractionsPackage.MESSAGE_SORT:
				return convertMessageSortToString(eDataType, instanceValue);
			case InteractionsPackage.INTERACTION_OPERATOR_KIND:
				return convertInteractionOperatorKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExecutionSpecification createActionExecutionSpecification() {
		ActionExecutionSpecificationImpl actionExecutionSpecification = new ActionExecutionSpecificationImpl();
		return actionExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartDecomposition createPartDecomposition() {
		PartDecompositionImpl partDecomposition = new PartDecompositionImpl();
		return partDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUse createInteractionUse() {
		InteractionUseImpl interactionUse = new InteractionUseImpl();
		return interactionUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand createInteractionOperand() {
		InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
		return interactionOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint createInteractionConstraint() {
		InteractionConstraintImpl interactionConstraint = new InteractionConstraintImpl();
		return interactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralOrdering createGeneralOrdering() {
		GeneralOrderingImpl generalOrdering = new GeneralOrderingImpl();
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification createOccurrenceSpecification() {
		OccurrenceSpecificationImpl occurrenceSpecification = new OccurrenceSpecificationImpl();
		return occurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorExecutionSpecification createBehaviorExecutionSpecification() {
		BehaviorExecutionSpecificationImpl behaviorExecutionSpecification = new BehaviorExecutionSpecificationImpl();
		return behaviorExecutionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment createCombinedFragment() {
		CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
		return combinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsiderIgnoreFragment createConsiderIgnoreFragment() {
		ConsiderIgnoreFragmentImpl considerIgnoreFragment = new ConsiderIgnoreFragmentImpl();
		return considerIgnoreFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continuation createContinuation() {
		ContinuationImpl continuation = new ContinuationImpl();
		return continuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestructionOccurrenceSpecification createDestructionOccurrenceSpecification() {
		DestructionOccurrenceSpecificationImpl destructionOccurrenceSpecification = new DestructionOccurrenceSpecificationImpl();
		return destructionOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOccurrenceSpecification createMessageOccurrenceSpecification() {
		MessageOccurrenceSpecificationImpl messageOccurrenceSpecification = new MessageOccurrenceSpecificationImpl();
		return messageOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOccurrenceSpecification createExecutionOccurrenceSpecification() {
		ExecutionOccurrenceSpecificationImpl executionOccurrenceSpecification = new ExecutionOccurrenceSpecificationImpl();
		return executionOccurrenceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant createStateInvariant() {
		StateInvariantImpl stateInvariant = new StateInvariantImpl();
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageKind createMessageKindFromString(EDataType eDataType, String initialValue) {
		MessageKind result = MessageKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSort createMessageSortFromString(EDataType eDataType, String initialValue) {
		MessageSort result = MessageSort.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageSortToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind createInteractionOperatorKindFromString(EDataType eDataType, String initialValue) {
		InteractionOperatorKind result = InteractionOperatorKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionsPackage getInteractionsPackage() {
		return (InteractionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InteractionsPackage getPackage() {
		return InteractionsPackage.eINSTANCE;
	}

} //InteractionsFactoryImpl
