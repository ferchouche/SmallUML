/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InteractionOperand is contained in a CombinedFragment. An InteractionOperand represents one operand of the expression given by the enclosing CombinedFragment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.InteractionOperand#getFragment <em>Fragment</em>}</li>
 *   <li>{@link uml.interactions.InteractionOperand#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getInteractionOperand()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='guard_contain_references guard_directly_prior'"
 * @generated
 */
public interface InteractionOperand extends Namespace, InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link uml.interactions.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link uml.interactions.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fragments of the operand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getInteractionOperand_Fragment()
	 * @see uml.interactions.InteractionFragment#getEnclosingOperand
	 * @model opposite="enclosingOperand" containment="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint of the operand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(InteractionConstraint)
	 * @see uml.interactions.InteractionsPackage#getInteractionOperand_Guard()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interactionOperand'"
	 * @generated
	 */
	InteractionConstraint getGuard();

	/**
	 * Sets the value of the '{@link uml.interactions.InteractionOperand#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(InteractionConstraint value);

} // InteractionOperand
