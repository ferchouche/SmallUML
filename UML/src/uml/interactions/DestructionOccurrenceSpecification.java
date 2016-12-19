/**
 */
package uml.interactions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destruction Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DestructionOccurenceSpecification models the destruction of an object.
 * let o : InteractionOperand = enclosingOperand in o->notEmpty() and 
 * let peerEvents : OrderedSet(OccurrenceSpecification) = covered.events->select(enclosingOperand = o)
 * in peerEvents->last() = self
 * <!-- end-model-doc -->
 *
 *
 * @see uml.interactions.InteractionsPackage#getDestructionOccurrenceSpecification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_occurrence_specifications_below'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL no_occurrence_specifications_below='let o : InteractionOperand = enclosingOperand in o->notEmpty() and \r\nlet peerEvents : OrderedSet(OccurrenceSpecification) = covered.events->select(enclosingOperand = o)\r\nin peerEvents->last() = self'"
 * @generated
 */
public interface DestructionOccurrenceSpecification extends MessageOccurrenceSpecification {
} // DestructionOccurrenceSpecification
