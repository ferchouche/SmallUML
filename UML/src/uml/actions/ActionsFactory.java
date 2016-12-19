/**
 */
package uml.actions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml.actions.ActionsPackage
 * @generated
 */
public interface ActionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActionsFactory eINSTANCE = uml.actions.impl.ActionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Value Specification Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Specification Action</em>'.
	 * @generated
	 */
	ValueSpecificationAction createValueSpecificationAction();

	/**
	 * Returns a new object of class '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Pin</em>'.
	 * @generated
	 */
	InputPin createInputPin();

	/**
	 * Returns a new object of class '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Pin</em>'.
	 * @generated
	 */
	OutputPin createOutputPin();

	/**
	 * Returns a new object of class '<em>Link End Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link End Data</em>'.
	 * @generated
	 */
	LinkEndData createLinkEndData();

	/**
	 * Returns a new object of class '<em>Qualifier Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualifier Value</em>'.
	 * @generated
	 */
	QualifierValue createQualifierValue();

	/**
	 * Returns a new object of class '<em>Accept Call Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Call Action</em>'.
	 * @generated
	 */
	AcceptCallAction createAcceptCallAction();

	/**
	 * Returns a new object of class '<em>Accept Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Event Action</em>'.
	 * @generated
	 */
	AcceptEventAction createAcceptEventAction();

	/**
	 * Returns a new object of class '<em>Action Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Input Pin</em>'.
	 * @generated
	 */
	ActionInputPin createActionInputPin();

	/**
	 * Returns a new object of class '<em>Add Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Structural Feature Value Action</em>'.
	 * @generated
	 */
	AddStructuralFeatureValueAction createAddStructuralFeatureValueAction();

	/**
	 * Returns a new object of class '<em>Add Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Variable Value Action</em>'.
	 * @generated
	 */
	AddVariableValueAction createAddVariableValueAction();

	/**
	 * Returns a new object of class '<em>Broadcast Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broadcast Signal Action</em>'.
	 * @generated
	 */
	BroadcastSignalAction createBroadcastSignalAction();

	/**
	 * Returns a new object of class '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Behavior Action</em>'.
	 * @generated
	 */
	CallBehaviorAction createCallBehaviorAction();

	/**
	 * Returns a new object of class '<em>Call Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Operation Action</em>'.
	 * @generated
	 */
	CallOperationAction createCallOperationAction();

	/**
	 * Returns a new object of class '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clause</em>'.
	 * @generated
	 */
	Clause createClause();

	/**
	 * Returns a new object of class '<em>Clear Association Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Association Action</em>'.
	 * @generated
	 */
	ClearAssociationAction createClearAssociationAction();

	/**
	 * Returns a new object of class '<em>Clear Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Structural Feature Action</em>'.
	 * @generated
	 */
	ClearStructuralFeatureAction createClearStructuralFeatureAction();

	/**
	 * Returns a new object of class '<em>Clear Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Variable Action</em>'.
	 * @generated
	 */
	ClearVariableAction createClearVariableAction();

	/**
	 * Returns a new object of class '<em>Conditional Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Node</em>'.
	 * @generated
	 */
	ConditionalNode createConditionalNode();

	/**
	 * Returns a new object of class '<em>Create Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Link Action</em>'.
	 * @generated
	 */
	CreateLinkAction createCreateLinkAction();

	/**
	 * Returns a new object of class '<em>Link End Creation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link End Creation Data</em>'.
	 * @generated
	 */
	LinkEndCreationData createLinkEndCreationData();

	/**
	 * Returns a new object of class '<em>Create Link Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Link Object Action</em>'.
	 * @generated
	 */
	CreateLinkObjectAction createCreateLinkObjectAction();

	/**
	 * Returns a new object of class '<em>Create Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Object Action</em>'.
	 * @generated
	 */
	CreateObjectAction createCreateObjectAction();

	/**
	 * Returns a new object of class '<em>Destroy Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroy Link Action</em>'.
	 * @generated
	 */
	DestroyLinkAction createDestroyLinkAction();

	/**
	 * Returns a new object of class '<em>Link End Destruction Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link End Destruction Data</em>'.
	 * @generated
	 */
	LinkEndDestructionData createLinkEndDestructionData();

	/**
	 * Returns a new object of class '<em>Destroy Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroy Object Action</em>'.
	 * @generated
	 */
	DestroyObjectAction createDestroyObjectAction();

	/**
	 * Returns a new object of class '<em>Expansion Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Node</em>'.
	 * @generated
	 */
	ExpansionNode createExpansionNode();

	/**
	 * Returns a new object of class '<em>Expansion Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expansion Region</em>'.
	 * @generated
	 */
	ExpansionRegion createExpansionRegion();

	/**
	 * Returns a new object of class '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Node</em>'.
	 * @generated
	 */
	LoopNode createLoopNode();

	/**
	 * Returns a new object of class '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Action</em>'.
	 * @generated
	 */
	OpaqueAction createOpaqueAction();

	/**
	 * Returns a new object of class '<em>Raise Exception Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raise Exception Action</em>'.
	 * @generated
	 */
	RaiseExceptionAction createRaiseExceptionAction();

	/**
	 * Returns a new object of class '<em>Read Extent Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Extent Action</em>'.
	 * @generated
	 */
	ReadExtentAction createReadExtentAction();

	/**
	 * Returns a new object of class '<em>Read Is Classified Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Is Classified Object Action</em>'.
	 * @generated
	 */
	ReadIsClassifiedObjectAction createReadIsClassifiedObjectAction();

	/**
	 * Returns a new object of class '<em>Read Link Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Link Action</em>'.
	 * @generated
	 */
	ReadLinkAction createReadLinkAction();

	/**
	 * Returns a new object of class '<em>Read Link Object End Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Link Object End Action</em>'.
	 * @generated
	 */
	ReadLinkObjectEndAction createReadLinkObjectEndAction();

	/**
	 * Returns a new object of class '<em>Read Link Object End Qualifier Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Link Object End Qualifier Action</em>'.
	 * @generated
	 */
	ReadLinkObjectEndQualifierAction createReadLinkObjectEndQualifierAction();

	/**
	 * Returns a new object of class '<em>Read Self Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Self Action</em>'.
	 * @generated
	 */
	ReadSelfAction createReadSelfAction();

	/**
	 * Returns a new object of class '<em>Read Structural Feature Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Structural Feature Action</em>'.
	 * @generated
	 */
	ReadStructuralFeatureAction createReadStructuralFeatureAction();

	/**
	 * Returns a new object of class '<em>Read Variable Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Variable Action</em>'.
	 * @generated
	 */
	ReadVariableAction createReadVariableAction();

	/**
	 * Returns a new object of class '<em>Reclassify Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reclassify Object Action</em>'.
	 * @generated
	 */
	ReclassifyObjectAction createReclassifyObjectAction();

	/**
	 * Returns a new object of class '<em>Reduce Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reduce Action</em>'.
	 * @generated
	 */
	ReduceAction createReduceAction();

	/**
	 * Returns a new object of class '<em>Remove Structural Feature Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Structural Feature Value Action</em>'.
	 * @generated
	 */
	RemoveStructuralFeatureValueAction createRemoveStructuralFeatureValueAction();

	/**
	 * Returns a new object of class '<em>Remove Variable Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Variable Value Action</em>'.
	 * @generated
	 */
	RemoveVariableValueAction createRemoveVariableValueAction();

	/**
	 * Returns a new object of class '<em>Reply Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reply Action</em>'.
	 * @generated
	 */
	ReplyAction createReplyAction();

	/**
	 * Returns a new object of class '<em>Send Object Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Object Action</em>'.
	 * @generated
	 */
	SendObjectAction createSendObjectAction();

	/**
	 * Returns a new object of class '<em>Send Signal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Signal Action</em>'.
	 * @generated
	 */
	SendSignalAction createSendSignalAction();

	/**
	 * Returns a new object of class '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Node</em>'.
	 * @generated
	 */
	SequenceNode createSequenceNode();

	/**
	 * Returns a new object of class '<em>Start Classifier Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Classifier Behavior Action</em>'.
	 * @generated
	 */
	StartClassifierBehaviorAction createStartClassifierBehaviorAction();

	/**
	 * Returns a new object of class '<em>Start Object Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Object Behavior Action</em>'.
	 * @generated
	 */
	StartObjectBehaviorAction createStartObjectBehaviorAction();

	/**
	 * Returns a new object of class '<em>Test Identity Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Identity Action</em>'.
	 * @generated
	 */
	TestIdentityAction createTestIdentityAction();

	/**
	 * Returns a new object of class '<em>Unmarshall Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unmarshall Action</em>'.
	 * @generated
	 */
	UnmarshallAction createUnmarshallAction();

	/**
	 * Returns a new object of class '<em>Value Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Pin</em>'.
	 * @generated
	 */
	ValuePin createValuePin();

	/**
	 * Returns a new object of class '<em>Structured Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Activity Node</em>'.
	 * @generated
	 */
	StructuredActivityNode createStructuredActivityNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActionsPackage getActionsPackage();

} //ActionsFactory
