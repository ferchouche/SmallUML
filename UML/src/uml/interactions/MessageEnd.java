/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MessageEnd is an abstract specialization of NamedElement that represents what can occur at the end of a Message.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.MessageEnd#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getMessageEnd()
 * @model abstract="true"
 * @generated
 */
public interface MessageEnd extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see uml.interactions.InteractionsPackage#getMessageEnd_Message()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='messageEnd'"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link uml.interactions.MessageEnd#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns a set including the MessageEnd (if exists) at the opposite end of the Message for this MessageEnd.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='message->asSet().messageEnd->asSet()->excluding(self)'"
	 * @generated
	 */
	EList<MessageEnd> oppositeEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns value true if this MessageEnd is a sendEvent.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='message.sendEvent->asSet()->includes(self)'"
	 * @generated
	 */
	boolean isSend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns value true if this MessageEnd is a receiveEvent.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='message.receiveEvent->asSet()->includes(self)'"
	 * @generated
	 */
	boolean isReceive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns a set including the enclosing InteractionFragment this MessageEnd is enclosed within.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if self->select(oclIsKindOf(Gate))->notEmpty() \r\nthen -- it is a Gate\r\nlet endGate : Gate = \r\n  self->select(oclIsKindOf(Gate)).oclAsType(Gate)->asOrderedSet()->first()\r\n  in\r\n  if endGate.isOutsideCF() \r\n  then endGate.combinedFragment.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(endGate.combinedFragment.enclosingOperand.oclAsType(InteractionFragment)->asSet())\r\n  else if endGate.isInsideCF() \r\n    then endGate.combinedFragment.oclAsType(InteractionFragment)->asSet()\r\n    else if endGate.isFormal() \r\n      then endGate.interaction.oclAsType(InteractionFragment)->asSet()\r\n      else if endGate.isActual() \r\n        then endGate.interactionUse.enclosingInteraction.oclAsType(InteractionFragment)->asSet()->\r\n     union(endGate.interactionUse.enclosingOperand.oclAsType(InteractionFragment)->asSet())\r\n        else null\r\n        endif\r\n      endif\r\n    endif\r\n  endif\r\nelse -- it is a MessageOccurrenceSpecification\r\nlet endMOS : MessageOccurrenceSpecification  = \r\n  self->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() \r\n  in\r\n  if endMOS.enclosingInteraction->notEmpty() \r\n  then endMOS.enclosingInteraction.oclAsType(InteractionFragment)->asSet()\r\n  else endMOS.enclosingOperand.oclAsType(InteractionFragment)->asSet()\r\n  endif\r\nendif'"
	 * @generated
	 */
	EList<InteractionFragment> enclosingFragment();

} // MessageEnd
