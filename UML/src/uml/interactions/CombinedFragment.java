/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CombinedFragment defines an expression of InteractionFragments. A CombinedFragment is defined by an interaction operator and corresponding InteractionOperands. Through the use of CombinedFragments the user will be able to describe a number of traces in a compact and concise manner.
 * interactionOperator=InteractionOperatorKind::break  implies   
 * enclosingInteraction.oclAsType(InteractionFragment)->asSet()->union(
 *    enclosingOperand.oclAsType(InteractionFragment)->asSet()).covered->asSet() = self.covered->asSet()
 * ((interactionOperator = InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)) implies oclIsKindOf(ConsiderIgnoreFragment)
 * (interactionOperator =  InteractionOperatorKind::opt or interactionOperator = InteractionOperatorKind::loop or
 * interactionOperator = InteractionOperatorKind::break or interactionOperator = InteractionOperatorKind::assert or
 * interactionOperator = InteractionOperatorKind::neg)
 * implies operand->size()=1
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.CombinedFragment#getCfragmentGate <em>Cfragment Gate</em>}</li>
 *   <li>{@link uml.interactions.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}</li>
 *   <li>{@link uml.interactions.CombinedFragment#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getCombinedFragment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='break consider_and_ignore opt_loop_break_neg'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL break='interactionOperator=InteractionOperatorKind::break  implies   \r\nenclosingInteraction.oclAsType(InteractionFragment)->asSet()->union(\r\n   enclosingOperand.oclAsType(InteractionFragment)->asSet()).covered->asSet() = self.covered->asSet()' consider_and_ignore='((interactionOperator = InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)) implies oclIsKindOf(ConsiderIgnoreFragment)' opt_loop_break_neg='(interactionOperator =  InteractionOperatorKind::opt or interactionOperator = InteractionOperatorKind::loop or\r\ninteractionOperator = InteractionOperatorKind::break or interactionOperator = InteractionOperatorKind::assert or\r\ninteractionOperator = InteractionOperatorKind::neg)\r\nimplies operand->size()=1'"
 * @generated
 */
public interface CombinedFragment extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Cfragment Gate</b></em>' containment reference list.
	 * The list contents are of type {@link uml.interactions.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the interface between this CombinedFragment and its surroundings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cfragment Gate</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getCombinedFragment_CfragmentGate()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='combinedFragment'"
	 * @generated
	 */
	EList<Gate> getCfragmentGate();

	/**
	 * Returns the value of the '<em><b>Interaction Operator</b></em>' attribute.
	 * The default value is <code>"seq"</code>.
	 * The literals are from the enumeration {@link uml.interactions.InteractionOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the operation which defines the semantics of this combination of InteractionFragments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction Operator</em>' attribute.
	 * @see uml.interactions.InteractionOperatorKind
	 * @see #setInteractionOperator(InteractionOperatorKind)
	 * @see uml.interactions.InteractionsPackage#getCombinedFragment_InteractionOperator()
	 * @model default="seq" required="true" ordered="false"
	 * @generated
	 */
	InteractionOperatorKind getInteractionOperator();

	/**
	 * Sets the value of the '{@link uml.interactions.CombinedFragment#getInteractionOperator <em>Interaction Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Operator</em>' attribute.
	 * @see uml.interactions.InteractionOperatorKind
	 * @see #getInteractionOperator()
	 * @generated
	 */
	void setInteractionOperator(InteractionOperatorKind value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link uml.interactions.InteractionOperand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of operands of the combined fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getCombinedFragment_Operand()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='combinedFragment'"
	 * @generated
	 */
	EList<InteractionOperand> getOperand();

} // CombinedFragment
