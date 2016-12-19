/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

import uml.structuredClassifiers.Connector;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Message defines a particular communication between Lifelines of an Interaction.
 * receiveEvent.oclIsKindOf(MessageOccurrenceSpecification)
 * implies
 * let f :  Lifeline = sendEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered in
 * f = receiveEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered  implies
 * f.events->indexOf(sendEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() ) < 
 * f.events->indexOf(receiveEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() )
 * sendEvent->notEmpty() and receiveEvent->notEmpty() implies
 * let sendEnclosingFrag : Set(InteractionFragment) = 
 * sendEvent->asOrderedSet()->first().enclosingFragment()
 * in 
 * let receiveEnclosingFrag : Set(InteractionFragment) = 
 * receiveEvent->asOrderedSet()->first().enclosingFragment()
 * in  sendEnclosingFrag = receiveEnclosingFrag
 * (messageSort = MessageSort::asynchSignal ) and signature.oclIsKindOf(Signal) implies
 *    let signalAttributes : OrderedSet(Property) = signature.oclAsType(Signal).inheritedMember()->
 *              select(n:NamedElement | n.oclIsTypeOf(Property))->collect(oclAsType(Property))->asOrderedSet()
 *    in signalAttributes->size() = self.argument->size()
 *    and self.argument->forAll( o: ValueSpecification |
 *           not (o.oclIsKindOf(Expression)
 *           and o.oclAsType(Expression).symbol->size()=0
 *           and o.oclAsType(Expression).operand->isEmpty() ) implies
 *               let p : Property = signalAttributes->at(self.argument->indexOf(o))
 *               in o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier)))
 * 
 * signature->notEmpty() implies 
 * ((signature.oclIsKindOf(Operation) and 
 * (messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall or messageSort = MessageSort::reply) 
 * ) or (signature.oclIsKindOf(Signal)  and messageSort = MessageSort::asynchSignal )
 *  ) and name = signature.name
 * (messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall) and signature.oclIsKindOf(Operation)  implies 
 *  let requestParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->
 *  select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::_'in'  )
 * in requestParms->size() = self.argument->size() and
 * self.argument->forAll( o: ValueSpecification | 
 * not (o.oclIsKindOf(Expression) and o.oclAsType(Expression).symbol->size()=0 and o.oclAsType(Expression).operand->isEmpty() ) implies 
 * let p : Parameter = requestParms->at(self.argument->indexOf(o)) in
 * o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))
 * )
 * (messageSort = MessageSort::reply) and signature.oclIsKindOf(Operation) implies 
 *  let replyParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->
 * select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::return)
 * in replyParms->size() = self.argument->size() and
 * self.argument->forAll( o: ValueSpecification | o.oclIsKindOf(Expression) and let e : Expression = o.oclAsType(Expression) in
 * e.operand->notEmpty()  implies 
 * let p : Parameter = replyParms->at(self.argument->indexOf(o)) in
 * e.operand->asSequence()->first().type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))
 * )
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.Message#getArgument <em>Argument</em>}</li>
 *   <li>{@link uml.interactions.Message#getConnector <em>Connector</em>}</li>
 *   <li>{@link uml.interactions.Message#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link uml.interactions.Message#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link uml.interactions.Message#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link uml.interactions.Message#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link uml.interactions.Message#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link uml.interactions.Message#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getMessage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sending_receiving_message_event arguments cannot_cross_boundaries signature_is_signal occurrence_specifications signature_refer_to signature_is_operation_request signature_is_operation_reply'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL sending_receiving_message_event='receiveEvent.oclIsKindOf(MessageOccurrenceSpecification)\r\nimplies\r\nlet f :  Lifeline = sendEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered in\r\nf = receiveEvent->select(oclIsKindOf(MessageOccurrenceSpecification)).oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first().covered  implies\r\nf.events->indexOf(sendEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() ) < \r\nf.events->indexOf(receiveEvent.oclAsType(MessageOccurrenceSpecification)->asOrderedSet()->first() )' cannot_cross_boundaries='sendEvent->notEmpty() and receiveEvent->notEmpty() implies\r\nlet sendEnclosingFrag : Set(InteractionFragment) = \r\nsendEvent->asOrderedSet()->first().enclosingFragment()\r\nin \r\nlet receiveEnclosingFrag : Set(InteractionFragment) = \r\nreceiveEvent->asOrderedSet()->first().enclosingFragment()\r\nin  sendEnclosingFrag = receiveEnclosingFrag' signature_is_signal='(messageSort = MessageSort::asynchSignal ) and signature.oclIsKindOf(Signal) implies\r\n   let signalAttributes : OrderedSet(Property) = signature.oclAsType(Signal).inheritedMember()->\r\n             select(n:NamedElement | n.oclIsTypeOf(Property))->collect(oclAsType(Property))->asOrderedSet()\r\n   in signalAttributes->size() = self.argument->size()\r\n   and self.argument->forAll( o: ValueSpecification |\r\n          not (o.oclIsKindOf(Expression)\r\n          and o.oclAsType(Expression).symbol->size()=0\r\n          and o.oclAsType(Expression).operand->isEmpty() ) implies\r\n              let p : Property = signalAttributes->at(self.argument->indexOf(o))\r\n              in o.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier)))\r\n' signature_refer_to='signature->notEmpty() implies \r\n((signature.oclIsKindOf(Operation) and \r\n(messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall or messageSort = MessageSort::reply) \r\n) or (signature.oclIsKindOf(Signal)  and messageSort = MessageSort::asynchSignal )\r\n ) and name = signature.name' signature_is_operation_request='(messageSort = MessageSort::asynchCall or messageSort = MessageSort::synchCall) and signature.oclIsKindOf(Operation)  implies \r\n let requestParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->\r\n select(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::_\'in\'  )\r\nin requestParms->size() = self.argument->size() and\r\nself.argument->forAll( o: ValueSpecification | \r\nnot (o.oclIsKindOf(Expression) and o.oclAsType(Expression).symbol->size()=0 and o.oclAsType(Expression).operand->isEmpty() ) implies \r\nlet p : Parameter = requestParms->at(self.argument->indexOf(o)) in\r\no.type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))\r\n)' signature_is_operation_reply='(messageSort = MessageSort::reply) and signature.oclIsKindOf(Operation) implies \r\n let replyParms : OrderedSet(Parameter) = signature.oclAsType(Operation).ownedParameter->\r\nselect(direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::return)\r\nin replyParms->size() = self.argument->size() and\r\nself.argument->forAll( o: ValueSpecification | o.oclIsKindOf(Expression) and let e : Expression = o.oclAsType(Expression) in\r\ne.operand->notEmpty()  implies \r\nlet p : Parameter = replyParms->at(self.argument->indexOf(o)) in\r\ne.operand->asSequence()->first().type.oclAsType(Classifier).conformsTo(p.type.oclAsType(Classifier))\r\n)'"
 * @generated
 */
public interface Message extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link uml.values.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The arguments of the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getMessage_Argument()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='message'"
	 * @generated
	 */
	EList<ValueSpecification> getArgument();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Connector on which this Message is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see uml.interactions.InteractionsPackage#getMessage_Connector()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='message'"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link uml.interactions.Message#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.interactions.Interaction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The enclosing Interaction owning the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' container reference.
	 * @see #setInteraction(Interaction)
	 * @see uml.interactions.InteractionsPackage#getMessage_Interaction()
	 * @see uml.interactions.Interaction#getMessage
	 * @model opposite="message" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link uml.interactions.Message#getInteraction <em>Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' container reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Message Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link uml.interactions.MessageKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derived kind of the Message (complete, lost, found, or unknown).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Kind</em>' attribute.
	 * @see uml.interactions.MessageKind
	 * @see uml.interactions.InteractionsPackage#getMessage_MessageKind()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	MessageKind getMessageKind();

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The default value is <code>"synchCall"</code>.
	 * The literals are from the enumeration {@link uml.interactions.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sort of communication reflected by the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see uml.interactions.MessageSort
	 * @see #setMessageSort(MessageSort)
	 * @see uml.interactions.InteractionsPackage#getMessage_MessageSort()
	 * @model default="synchCall" required="true" ordered="false"
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link uml.interactions.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see uml.interactions.MessageSort
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

	/**
	 * Returns the value of the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Receiving of the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Event</em>' reference.
	 * @see #setReceiveEvent(MessageEnd)
	 * @see uml.interactions.InteractionsPackage#getMessage_ReceiveEvent()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='endMessage'"
	 * @generated
	 */
	MessageEnd getReceiveEvent();

	/**
	 * Sets the value of the '{@link uml.interactions.Message#getReceiveEvent <em>Receive Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Event</em>' reference.
	 * @see #getReceiveEvent()
	 * @generated
	 */
	void setReceiveEvent(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Sending of the Message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Send Event</em>' reference.
	 * @see #setSendEvent(MessageEnd)
	 * @see uml.interactions.InteractionsPackage#getMessage_SendEvent()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='endMessage'"
	 * @generated
	 */
	MessageEnd getSendEvent();

	/**
	 * Sets the value of the '{@link uml.interactions.Message#getSendEvent <em>Send Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Event</em>' reference.
	 * @see #getSendEvent()
	 * @generated
	 */
	void setSendEvent(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signature of the Message is the specification of its content. It refers either an Operation or a Signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(NamedElement)
	 * @see uml.interactions.InteractionsPackage#getMessage_Signature()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='message'"
	 * @generated
	 */
	NamedElement getSignature();

	/**
	 * Sets the value of the '{@link uml.interactions.Message#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(NamedElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This query returns the MessageKind value for this Message.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='messageKind'"
	 * @generated
	 */
	MessageKind messageKind();

} // Message
