/**
 */
package uml.interactions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Gate is a MessageEnd which serves as a connection point for relating a Message which has a MessageEnd (sendEvent / receiveEvent) outside an InteractionFragment with another Message which has a MessageEnd (receiveEvent / sendEvent)  inside that InteractionFragment.
 * interactionUse->notEmpty() implies interactionUse.refersTo.formalGate->select(matches(self))->size()=1
 * isInsideCF() implies combinedFragment.cfragmentGate->select(isOutsideCF() and matches(self))->size()=1
 * isOutsideCF() implies
 *  if self.combinedFragment.interactionOperator->asOrderedSet()->first() = InteractionOperatorKind::alt
 *  then self.combinedFragment.operand->forAll(op : InteractionOperand |
 *  self.combinedFragment.cfragmentGate->select(isInsideCF() and 
 *  oppositeEnd().enclosingFragment()->includes(self.combinedFragment) and matches(self))->size()=1)
 *  else  self.combinedFragment.cfragmentGate->select(isInsideCF() and matches(self))->size()=1
 *  endif
 * isFormal() implies interaction.formalGate->select(getName() = self.getName())->size()=1
 * isActual() implies interactionUse.actualGate->select(getName() = self.getName())->size()=1
 * isOutsideCF() implies combinedFragment.cfragmentGate->select(getName() = self.getName())->size()=1
 * isInsideCF() implies
 * let selfOperand : InteractionOperand = self.getOperand() in
 *   combinedFragment.cfragmentGate->select(isInsideCF() and getName() = self.getName())->select(getOperand() = selfOperand)->size()=1
 * <!-- end-model-doc -->
 *
 *
 * @see uml.interactions.InteractionsPackage#getGate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='actual_gate_matched inside_cf_matched outside_cf_matched formal_gate_distinguishable actual_gate_distinguishable outside_cf_gate_distinguishable inside_cf_gate_distinguishable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL actual_gate_matched='interactionUse->notEmpty() implies interactionUse.refersTo.formalGate->select(matches(self))->size()=1' inside_cf_matched='isInsideCF() implies combinedFragment.cfragmentGate->select(isOutsideCF() and matches(self))->size()=1' outside_cf_matched='isOutsideCF() implies\r\n if self.combinedFragment.interactionOperator->asOrderedSet()->first() = InteractionOperatorKind::alt\r\n then self.combinedFragment.operand->forAll(op : InteractionOperand |\r\n self.combinedFragment.cfragmentGate->select(isInsideCF() and \r\n oppositeEnd().enclosingFragment()->includes(self.combinedFragment) and matches(self))->size()=1)\r\n else  self.combinedFragment.cfragmentGate->select(isInsideCF() and matches(self))->size()=1\r\n endif' formal_gate_distinguishable='isFormal() implies interaction.formalGate->select(getName() = self.getName())->size()=1' actual_gate_distinguishable='isActual() implies interactionUse.actualGate->select(getName() = self.getName())->size()=1' outside_cf_gate_distinguishable='isOutsideCF() implies combinedFragment.cfragmentGate->select(getName() = self.getName())->size()=1' inside_cf_gate_distinguishable='isInsideCF() implies\r\nlet selfOperand : InteractionOperand = self.getOperand() in\r\n  combinedFragment.cfragmentGate->select(isInsideCF() and getName() = self.getName())->select(getOperand() = selfOperand)->size()=1'"
 * @generated
 */
public interface Gate extends MessageEnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if this Gate is attached to the boundary of a CombinedFragment, and its other end (if present)  is outside of the same CombinedFragment.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='isOutsideCF'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.oppositeEnd()-> notEmpty() and combinedFragment->notEmpty() implies\r\nlet oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in\r\nif oppEnd.oclIsKindOf(MessageOccurrenceSpecification) \r\nthen let oppMOS : MessageOccurrenceSpecification = oppEnd.oclAsType(MessageOccurrenceSpecification)\r\nin  self.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(self.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet()) =\r\n     oppMOS.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(oppMOS.enclosingOperand.oclAsType(InteractionFragment)->asSet())\r\nelse let oppGate : Gate = oppEnd.oclAsType(Gate) \r\nin self.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(self.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet()) =\r\n     oppGate.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(oppGate.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet())\r\nendif'"
	 * @generated
	 */
	boolean isOutsideCf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if this Gate is attached to the boundary of a CombinedFragment, and its other end (if present) is inside of an InteractionOperator of the same CombinedFragment.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='isInsideCF'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.oppositeEnd()-> notEmpty() and combinedFragment->notEmpty() implies\r\nlet oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in\r\nif oppEnd.oclIsKindOf(MessageOccurrenceSpecification)\r\nthen let oppMOS : MessageOccurrenceSpecification\r\n= oppEnd.oclAsType(MessageOccurrenceSpecification)\r\nin combinedFragment = oppMOS.enclosingOperand.combinedFragment\r\nelse let oppGate : Gate = oppEnd.oclAsType(Gate)\r\nin combinedFragment = oppGate.combinedFragment.enclosingOperand.combinedFragment\r\nendif'"
	 * @generated
	 */
	boolean isInsideCf();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true value if this Gate is an actualGate of an InteractionUse.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='interactionUse->notEmpty()'"
	 * @generated
	 */
	boolean isActual();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if this Gate is a formalGate of an Interaction.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='interaction->notEmpty()'"
	 * @generated
	 */
	boolean isFormal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns the name of the gate, either the explicit name (.name) or the constructed name ('out_\" or 'in_' concatenated in front of .message.name) if the explicit name is not present.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if name->notEmpty() then name->asOrderedSet()->first()\r\nelse  if isActual() or isOutsideCF() \r\n  then if isSend() \r\n    then \'out_\'.concat(self.message.name->asOrderedSet()->first())\r\n    else \'in_\'.concat(self.message.name->asOrderedSet()->first())\r\n    endif\r\n  else if isSend()\r\n    then \'in_\'.concat(self.message.name->asOrderedSet()->first())\r\n    else \'out_\'.concat(self.message.name->asOrderedSet()->first())\r\n    endif\r\n  endif\r\nendif'"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns true if the name of this Gate matches the name of the in parameter Gate, and the messages for the two Gates correspond. The Message for one Gate (say A) corresponds to the Message for another Gate (say B) if (A and B have the same name value) and (if A is a sendEvent then B is a receiveEvent) and (if A is a receiveEvent then B is a sendEvent) and (A and B have the same messageSort value) and (A and B have the same signature value).
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" gateToMatchRequired="true" gateToMatchOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.getName() = gateToMatch.getName() and \r\nself.message.messageSort = gateToMatch.message.messageSort and\r\nself.message.name = gateToMatch.message.name and\r\nself.message.sendEvent->includes(self) implies gateToMatch.message.receiveEvent->includes(gateToMatch)  and\r\nself.message.receiveEvent->includes(self) implies gateToMatch.message.sendEvent->includes(gateToMatch) and\r\nself.message.signature = gateToMatch.message.signature'"
	 * @generated
	 */
	boolean matches(Gate gateToMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the Gate is an inside Combined Fragment Gate, this operation returns the InteractionOperand that the opposite end of this Gate is included within.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if isInsideCF() then\r\n  let oppEnd : MessageEnd = self.oppositeEnd()->asOrderedSet()->first() in\r\n    if oppEnd.oclIsKindOf(MessageOccurrenceSpecification)\r\n    then let oppMOS : MessageOccurrenceSpecification = oppEnd.oclAsType(MessageOccurrenceSpecification)\r\n        in oppMOS.enclosingOperand->asOrderedSet()->first()\r\n    else let oppGate : Gate = oppEnd.oclAsType(Gate)\r\n        in oppGate.combinedFragment.enclosingOperand->asOrderedSet()->first()\r\n    endif\r\n  else null\r\nendif'"
	 * @generated
	 */
	InteractionOperand getOperand();

} // Gate
