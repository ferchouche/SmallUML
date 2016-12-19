/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

import uml.actions.Action;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Interaction is a unit of Behavior that focuses on the observable exchange of information between connectable elements.
 * enclosingInteraction->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.Interaction#getAction <em>Action</em>}</li>
 *   <li>{@link uml.interactions.Interaction#getFormalGate <em>Formal Gate</em>}</li>
 *   <li>{@link uml.interactions.Interaction#getFragment <em>Fragment</em>}</li>
 *   <li>{@link uml.interactions.Interaction#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link uml.interactions.Interaction#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getInteraction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='not_contained'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL not_contained='enclosingInteraction->isEmpty()'"
 * @generated
 */
public interface Interaction extends Behavior, InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actions owned by the Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getInteraction_Action()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interaction'"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Formal Gate</b></em>' containment reference list.
	 * The list contents are of type {@link uml.interactions.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the gates that form the message interface between this Interaction and any InteractionUses which reference it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal Gate</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getInteraction_FormalGate()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interaction'"
	 * @generated
	 */
	EList<Gate> getFormalGate();

	/**
	 * Returns the value of the '<em><b>Fragment</b></em>' containment reference list.
	 * The list contents are of type {@link uml.interactions.InteractionFragment}.
	 * It is bidirectional and its opposite is '{@link uml.interactions.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of fragments in the Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getInteraction_Fragment()
	 * @see uml.interactions.InteractionFragment#getEnclosingInteraction
	 * @model opposite="enclosingInteraction" containment="true"
	 * @generated
	 */
	EList<InteractionFragment> getFragment();

	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link uml.interactions.Lifeline}.
	 * It is bidirectional and its opposite is '{@link uml.interactions.Lifeline#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the participants in this Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getInteraction_Lifeline()
	 * @see uml.interactions.Lifeline#getInteraction
	 * @model opposite="interaction" containment="true" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getLifeline();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link uml.interactions.Message}.
	 * It is bidirectional and its opposite is '{@link uml.interactions.Message#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Messages contained in this Interaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getInteraction_Message()
	 * @see uml.interactions.Message#getInteraction
	 * @model opposite="interaction" containment="true" ordered="false"
	 * @generated
	 */
	EList<Message> getMessage();

} // Interaction
