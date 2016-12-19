/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

import uml.classification.Property;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InteractionUse refers to an Interaction. The InteractionUse is a shorthand for copying the contents of the referenced Interaction where the InteractionUse is. To be accurate the copying must take into account substituting parameters with arguments and connect the formal Gates with the actual ones.
 * actualGate->notEmpty() implies 
 * refersTo.formalGate->forAll( fg : Gate | self.actualGate->select(matches(fg))->size()=1) and
 * self.actualGate->forAll(ag : Gate | refersTo.formalGate->select(matches(ag))->size()=1)
 * returnValueRecipient->asSet()->notEmpty() implies
 * let covCE : Set(ConnectableElement) = covered.represents->asSet() in 
 * covCE->notEmpty() and let classes:Set(Classifier) = covCE.type.oclIsKindOf(Classifier).oclAsType(Classifier)->asSet() in 
 * let allProps : Set(Property) = classes.attribute->union(classes.allParents().attribute)->asSet() in 
 * allProps->includes(returnValueRecipient)
 * returnValue.type->asSequence()->notEmpty() implies returnValue.type->asSequence()->first() = returnValueRecipient.type->asSequence()->first()
 * 
 * let parentInteraction : Set(Interaction) = enclosingInteraction->asSet()->
 * union(enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->
 * collect(enclosingInteraction).oclAsType(Interaction)->asSet()) in
 * parentInteraction->size()=1 and let refInteraction : Interaction = refersTo in
 * parentInteraction.covered-> forAll(intLifeline : Lifeline | refInteraction.covered->
 * forAll( refLifeline : Lifeline | refLifeline.represents = intLifeline.represents and 
 * (
 * ( refLifeline.selector.oclIsKindOf(LiteralString) implies
 *   intLifeline.selector.oclIsKindOf(LiteralString) and 
 *   refLifeline.selector.oclAsType(LiteralString).value = intLifeline.selector.oclAsType(LiteralString).value ) and
 * ( refLifeline.selector.oclIsKindOf(LiteralInteger) implies
 *   intLifeline.selector.oclIsKindOf(LiteralInteger) and 
 *   refLifeline.selector.oclAsType(LiteralInteger).value = intLifeline.selector.oclAsType(LiteralInteger).value )
 * )
 *  implies self.covered->asSet()->includes(intLifeline)))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.InteractionUse#getActualGate <em>Actual Gate</em>}</li>
 *   <li>{@link uml.interactions.InteractionUse#getArgument <em>Argument</em>}</li>
 *   <li>{@link uml.interactions.InteractionUse#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link uml.interactions.InteractionUse#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link uml.interactions.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getInteractionUse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='gates_match arguments_are_constants returnValueRecipient_coverage arguments_correspond_to_parameters returnValue_type_recipient_correspondence all_lifelines'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL gates_match='actualGate->notEmpty() implies \r\nrefersTo.formalGate->forAll( fg : Gate | self.actualGate->select(matches(fg))->size()=1) and\r\nself.actualGate->forAll(ag : Gate | refersTo.formalGate->select(matches(ag))->size()=1)' returnValueRecipient_coverage='returnValueRecipient->asSet()->notEmpty() implies\r\nlet covCE : Set(ConnectableElement) = covered.represents->asSet() in \r\ncovCE->notEmpty() and let classes:Set(Classifier) = covCE.type.oclIsKindOf(Classifier).oclAsType(Classifier)->asSet() in \r\nlet allProps : Set(Property) = classes.attribute->union(classes.allParents().attribute)->asSet() in \r\nallProps->includes(returnValueRecipient)' returnValue_type_recipient_correspondence='returnValue.type->asSequence()->notEmpty() implies returnValue.type->asSequence()->first() = returnValueRecipient.type->asSequence()->first()\r\n' all_lifelines='let parentInteraction : Set(Interaction) = enclosingInteraction->asSet()->\r\nunion(enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->\r\ncollect(enclosingInteraction).oclAsType(Interaction)->asSet()) in\r\nparentInteraction->size()=1 and let refInteraction : Interaction = refersTo in\r\nparentInteraction.covered-> forAll(intLifeline : Lifeline | refInteraction.covered->\r\nforAll( refLifeline : Lifeline | refLifeline.represents = intLifeline.represents and \r\n(\r\n( refLifeline.selector.oclIsKindOf(LiteralString) implies\r\n  intLifeline.selector.oclIsKindOf(LiteralString) and \r\n  refLifeline.selector.oclAsType(LiteralString).value = intLifeline.selector.oclAsType(LiteralString).value ) and\r\n( refLifeline.selector.oclIsKindOf(LiteralInteger) implies\r\n  intLifeline.selector.oclIsKindOf(LiteralInteger) and \r\n  refLifeline.selector.oclAsType(LiteralInteger).value = intLifeline.selector.oclAsType(LiteralInteger).value )\r\n)\r\n implies self.covered->asSet()->includes(intLifeline)))'"
 * @generated
 */
public interface InteractionUse extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Actual Gate</b></em>' containment reference list.
	 * The list contents are of type {@link uml.interactions.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual gates of the InteractionUse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Gate</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getInteractionUse_ActualGate()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interactionUse'"
	 * @generated
	 */
	EList<Gate> getActualGate();

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link uml.values.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual arguments of the Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getInteractionUse_Argument()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interactionUse'"
	 * @generated
	 */
	EList<ValueSpecification> getArgument();

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the Interaction that defines its meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Interaction)
	 * @see uml.interactions.InteractionsPackage#getInteractionUse_RefersTo()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interactionUse'"
	 * @generated
	 */
	Interaction getRefersTo();

	/**
	 * Sets the value of the '{@link uml.interactions.InteractionUse#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Interaction value);

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the executed Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(ValueSpecification)
	 * @see uml.interactions.InteractionsPackage#getInteractionUse_ReturnValue()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interactionUse'"
	 * @generated
	 */
	ValueSpecification getReturnValue();

	/**
	 * Sets the value of the '{@link uml.interactions.InteractionUse#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Return Value Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The recipient of the return value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Value Recipient</em>' reference.
	 * @see #setReturnValueRecipient(Property)
	 * @see uml.interactions.InteractionsPackage#getInteractionUse_ReturnValueRecipient()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interactionUse'"
	 * @generated
	 */
	Property getReturnValueRecipient();

	/**
	 * Sets the value of the '{@link uml.interactions.InteractionUse#getReturnValueRecipient <em>Return Value Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value Recipient</em>' reference.
	 * @see #getReturnValueRecipient()
	 * @generated
	 */
	void setReturnValueRecipient(Property value);

} // InteractionUse
