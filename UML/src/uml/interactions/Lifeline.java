/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

import uml.structuredClassifiers.ConnectableElement;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Lifeline represents an individual participant in the Interaction. While parts and structural features may have multiplicity greater than 1, Lifelines represent only one interacting entity.
 *  self.selector->notEmpty() = (self.represents.oclIsKindOf(MultiplicityElement) and self.represents.oclAsType(MultiplicityElement).isMultivalued())
 * let intUses : Set(InteractionUse) = interaction.interactionUse  in 
 * intUses->forAll
 * ( iuse : InteractionUse | 
 * let usingInteraction : Set(Interaction)  = iuse.enclosingInteraction->asSet()
 * ->union(
 * iuse.enclosingOperand.combinedFragment->asSet()->closure(enclosingOperand.combinedFragment).enclosingInteraction->asSet()
 *                ) 
 * in
 * let peerUses : Set(InteractionUse) = usingInteraction.fragment->select(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()
 * ->union(
 * usingInteraction.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet()
 * ->closure(operand.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)).operand.fragment->
 * select(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()
 *                )->excluding(iuse)
 *  in
 * peerUses->forAll( peerUse : InteractionUse |
 *  peerUse.refersTo.lifeline->forAll( l : Lifeline | (l.represents = self.represents and 
 *  ( self.selector.oclIsKindOf(LiteralString) implies
 *   l.selector.oclIsKindOf(LiteralString) and 
 *   self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )
 *   and 
 * ( self.selector.oclIsKindOf(LiteralInteger) implies
 *   l.selector.oclIsKindOf(LiteralInteger) and 
 *   self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )
 * )  
 * implies
 *  usingInteraction.lifeline->select(represents = self.represents and
 *  ( self.selector.oclIsKindOf(LiteralString) implies
 *   l.selector.oclIsKindOf(LiteralString) and 
 *   self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )
 * and 
 * ( self.selector.oclIsKindOf(LiteralInteger) implies
 *   l.selector.oclIsKindOf(LiteralInteger) and 
 *   self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )
 * )
 *                                                 )
 *                     )
 * )
 * represents.namespace->closure(namespace)->includes(interaction._'context')
 * self.selector->notEmpty() implies 
 * self.selector.oclIsKindOf(LiteralInteger) or 
 * self.selector.oclIsKindOf(LiteralString)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.Lifeline#getDecomposedAs <em>Decomposed As</em>}</li>
 *   <li>{@link uml.interactions.Lifeline#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link uml.interactions.Lifeline#getRepresents <em>Represents</em>}</li>
 *   <li>{@link uml.interactions.Lifeline#getSelector <em>Selector</em>}</li>
 *   <li>{@link uml.interactions.Lifeline#getCoveredBy <em>Covered By</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getLifeline()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selector_specified interaction_uses_share_lifeline same_classifier selector_int_or_string'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL selector_specified=' self.selector->notEmpty() = (self.represents.oclIsKindOf(MultiplicityElement) and self.represents.oclAsType(MultiplicityElement).isMultivalued())' interaction_uses_share_lifeline='let intUses : Set(InteractionUse) = interaction.interactionUse  in \r\nintUses->forAll\r\n( iuse : InteractionUse | \r\nlet usingInteraction : Set(Interaction)  = iuse.enclosingInteraction->asSet()\r\n->union(\r\niuse.enclosingOperand.combinedFragment->asSet()->closure(enclosingOperand.combinedFragment).enclosingInteraction->asSet()\r\n               ) \r\nin\r\nlet peerUses : Set(InteractionUse) = usingInteraction.fragment->select(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()\r\n->union(\r\nusingInteraction.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)->asSet()\r\n->closure(operand.fragment->select(oclIsKindOf(CombinedFragment)).oclAsType(CombinedFragment)).operand.fragment->\r\nselect(oclIsKindOf(InteractionUse)).oclAsType(InteractionUse)->asSet()\r\n               )->excluding(iuse)\r\n in\r\npeerUses->forAll( peerUse : InteractionUse |\r\n peerUse.refersTo.lifeline->forAll( l : Lifeline | (l.represents = self.represents and \r\n ( self.selector.oclIsKindOf(LiteralString) implies\r\n  l.selector.oclIsKindOf(LiteralString) and \r\n  self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )\r\n  and \r\n( self.selector.oclIsKindOf(LiteralInteger) implies\r\n  l.selector.oclIsKindOf(LiteralInteger) and \r\n  self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )\r\n)  \r\nimplies\r\n usingInteraction.lifeline->select(represents = self.represents and\r\n ( self.selector.oclIsKindOf(LiteralString) implies\r\n  l.selector.oclIsKindOf(LiteralString) and \r\n  self.selector.oclAsType(LiteralString).value = l.selector.oclAsType(LiteralString).value )\r\nand \r\n( self.selector.oclIsKindOf(LiteralInteger) implies\r\n  l.selector.oclIsKindOf(LiteralInteger) and \r\n  self.selector.oclAsType(LiteralInteger).value = l.selector.oclAsType(LiteralInteger).value )\r\n)\r\n                                                )\r\n                    )\r\n)' same_classifier='represents.namespace->closure(namespace)->includes(interaction._\'context\')' selector_int_or_string='self.selector->notEmpty() implies \r\nself.selector.oclIsKindOf(LiteralInteger) or \r\nself.selector.oclIsKindOf(LiteralString)'"
 * @generated
 */
public interface Lifeline extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Interaction that represents the decomposition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decomposed As</em>' reference.
	 * @see #setDecomposedAs(PartDecomposition)
	 * @see uml.interactions.InteractionsPackage#getLifeline_DecomposedAs()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='lifeline'"
	 * @generated
	 */
	PartDecomposition getDecomposedAs();

	/**
	 * Sets the value of the '{@link uml.interactions.Lifeline#getDecomposedAs <em>Decomposed As</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposed As</em>' reference.
	 * @see #getDecomposedAs()
	 * @generated
	 */
	void setDecomposedAs(PartDecomposition value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.interactions.Interaction#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Interaction enclosing this Lifeline.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' container reference.
	 * @see #setInteraction(Interaction)
	 * @see uml.interactions.InteractionsPackage#getLifeline_Interaction()
	 * @see uml.interactions.Interaction#getLifeline
	 * @model opposite="lifeline" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link uml.interactions.Lifeline#getInteraction <em>Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' container reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the ConnectableElement within the classifier that contains the enclosing interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(ConnectableElement)
	 * @see uml.interactions.InteractionsPackage#getLifeline_Represents()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='lifeline'"
	 * @generated
	 */
	ConnectableElement getRepresents();

	/**
	 * Sets the value of the '{@link uml.interactions.Lifeline#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(ConnectableElement value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the referenced ConnectableElement is multivalued, then this specifies the specific individual part within that set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(ValueSpecification)
	 * @see uml.interactions.InteractionsPackage#getLifeline_Selector()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='lifeline'"
	 * @generated
	 */
	ValueSpecification getSelector();

	/**
	 * Sets the value of the '{@link uml.interactions.Lifeline#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Covered By</b></em>' reference list.
	 * The list contents are of type {@link uml.interactions.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link uml.interactions.InteractionFragment#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the InteractionFragments in which this Lifeline takes part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Covered By</em>' reference list.
	 * @see uml.interactions.InteractionsPackage#getLifeline_CoveredBy()
	 * @see uml.interactions.InteractionFragment#getCovered
	 * @model opposite="covered" ordered="false"
	 * @generated
	 */
	EList<InteractionFragment> getCoveredBy();

} // Lifeline
