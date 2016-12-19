/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InteractionFragment is an abstract notion of the most general interaction unit. An InteractionFragment is a piece of an Interaction. Each InteractionFragment is conceptually like an Interaction by itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.InteractionFragment#getCovered <em>Covered</em>}</li>
 *   <li>{@link uml.interactions.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link uml.interactions.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link uml.interactions.InteractionFragment#getGeneralOrdering <em>General Ordering</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getInteractionFragment()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFragment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Covered</b></em>' reference list.
	 * The list contents are of type {@link uml.interactions.Lifeline}.
	 * It is bidirectional and its opposite is '{@link uml.interactions.Lifeline#getCoveredBy <em>Covered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Lifelines that the InteractionFragment involves.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Covered</em>' reference list.
	 * @see uml.interactions.InteractionsPackage#getInteractionFragment_Covered()
	 * @see uml.interactions.Lifeline#getCoveredBy
	 * @model opposite="coveredBy" ordered="false"
	 * @generated
	 */
	EList<Lifeline> getCovered();

	/**
	 * Returns the value of the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.interactions.Interaction#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interaction enclosing this InteractionFragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #setEnclosingInteraction(Interaction)
	 * @see uml.interactions.InteractionsPackage#getInteractionFragment_EnclosingInteraction()
	 * @see uml.interactions.Interaction#getFragment
	 * @model opposite="fragment" transient="false" ordered="false"
	 * @generated
	 */
	Interaction getEnclosingInteraction();

	/**
	 * Sets the value of the '{@link uml.interactions.InteractionFragment#getEnclosingInteraction <em>Enclosing Interaction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Interaction</em>' container reference.
	 * @see #getEnclosingInteraction()
	 * @generated
	 */
	void setEnclosingInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Enclosing Operand</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.interactions.InteractionOperand#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operand enclosing this InteractionFragment (they may nest recursively).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #setEnclosingOperand(InteractionOperand)
	 * @see uml.interactions.InteractionsPackage#getInteractionFragment_EnclosingOperand()
	 * @see uml.interactions.InteractionOperand#getFragment
	 * @model opposite="fragment" transient="false" ordered="false"
	 * @generated
	 */
	InteractionOperand getEnclosingOperand();

	/**
	 * Sets the value of the '{@link uml.interactions.InteractionFragment#getEnclosingOperand <em>Enclosing Operand</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Operand</em>' container reference.
	 * @see #getEnclosingOperand()
	 * @generated
	 */
	void setEnclosingOperand(InteractionOperand value);

	/**
	 * Returns the value of the '<em><b>General Ordering</b></em>' containment reference list.
	 * The list contents are of type {@link uml.interactions.GeneralOrdering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general ordering relationships contained in this fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General Ordering</em>' containment reference list.
	 * @see uml.interactions.InteractionsPackage#getInteractionFragment_GeneralOrdering()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interactionFragment'"
	 * @generated
	 */
	EList<GeneralOrdering> getGeneralOrdering();

} // InteractionFragment
