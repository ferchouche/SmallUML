/**
 */
package uml.interactions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Continuation is a syntactic way to define continuations of different branches of an alternative CombinedFragment. Continuations are intuitively similar to labels representing intermediate points in a flow of control.
 *  enclosingOperand->notEmpty() and 
 *  let peerFragments : OrderedSet(InteractionFragment) =  enclosingOperand.fragment in 
 *    ( peerFragments->notEmpty() and 
 *    ((peerFragments->first() = self) or  (peerFragments->last() = self)))
 * enclosingOperand.combinedFragment->notEmpty() and
 * let parentInteraction : Set(Interaction) = 
 * enclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->
 * collect(enclosingInteraction).oclAsType(Interaction)->asSet()
 * in 
 * (parentInteraction->size() = 1) 
 * and let peerInteractions : Set(Interaction) =
 *  (parentInteraction->union(parentInteraction->collect(_'context')->collect(behavior)->
 *  select(oclIsKindOf(Interaction)).oclAsType(Interaction)->asSet())->asSet()) in
 *  (peerInteractions->notEmpty()) and 
 *   let combinedFragments1 : Set(CombinedFragment) = peerInteractions.fragment->
 *  select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet() in
 *    combinedFragments1->notEmpty() and  combinedFragments1->closure(operand.fragment->
 *    select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment))->asSet().operand.fragment->
 *    select(oclIsKindOf(Continuation)).oclAsType(Continuation)->asSet()->
 *    forAll(c : Continuation |  (c.name = self.name) implies 
 *   (c.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by self
 *   self.covered->asSet()->
 *   select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))
 *    and
 *  (self.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by c
 *  c.covered->asSet()->
 *   select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))
 *   )
 * enclosingOperand->notEmpty() and
 *   let operandLifelines : Set(Lifeline) =  enclosingOperand.covered in 
 *     (operandLifelines->notEmpty() and 
 *     operandLifelines->forAll(ol :Lifeline |self.covered->includes(ol)))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.Continuation#isSetting <em>Setting</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getContinuation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='first_or_last_interaction_fragment same_name global'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL first_or_last_interaction_fragment=' enclosingOperand->notEmpty() and \r\n let peerFragments : OrderedSet(InteractionFragment) =  enclosingOperand.fragment in \r\n   ( peerFragments->notEmpty() and \r\n   ((peerFragments->first() = self) or  (peerFragments->last() = self)))' same_name='enclosingOperand.combinedFragment->notEmpty() and\r\nlet parentInteraction : Set(Interaction) = \r\nenclosingOperand.combinedFragment->closure(enclosingOperand.combinedFragment)->\r\ncollect(enclosingInteraction).oclAsType(Interaction)->asSet()\r\nin \r\n(parentInteraction->size() = 1) \r\nand let peerInteractions : Set(Interaction) =\r\n (parentInteraction->union(parentInteraction->collect(_\'context\')->collect(behavior)->\r\n select(oclIsKindOf(Interaction)).oclAsType(Interaction)->asSet())->asSet()) in\r\n (peerInteractions->notEmpty()) and \r\n  let combinedFragments1 : Set(CombinedFragment) = peerInteractions.fragment->\r\n select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet() in\r\n   combinedFragments1->notEmpty() and  combinedFragments1->closure(operand.fragment->\r\n   select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment))->asSet().operand.fragment->\r\n   select(oclIsKindOf(Continuation)).oclAsType(Continuation)->asSet()->\r\n   forAll(c : Continuation |  (c.name = self.name) implies \r\n  (c.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by self\r\n  self.covered->asSet()->\r\n  select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))\r\n   and\r\n (self.covered->asSet()->forAll(cl : Lifeline | --  cl must be common to one lifeline covered by c\r\n c.covered->asSet()->\r\n  select(represents = cl.represents and selector = cl.selector)->asSet()->size()=1))\r\n  )' global='enclosingOperand->notEmpty() and\r\n  let operandLifelines : Set(Lifeline) =  enclosingOperand.covered in \r\n    (operandLifelines->notEmpty() and \r\n    operandLifelines->forAll(ol :Lifeline |self.covered->includes(ol)))'"
 * @generated
 */
public interface Continuation extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Setting</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True: when the Continuation is at the end of the enclosing InteractionFragment and False when it is in the beginning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting</em>' attribute.
	 * @see #setSetting(boolean)
	 * @see uml.interactions.InteractionsPackage#getContinuation_Setting()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSetting();

	/**
	 * Sets the value of the '{@link uml.interactions.Continuation#isSetting <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' attribute.
	 * @see #isSetting()
	 * @generated
	 */
	void setSetting(boolean value);

} // Continuation
