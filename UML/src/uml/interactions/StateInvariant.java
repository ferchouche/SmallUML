/**
 */
package uml.interactions;

import uml.commonStructure.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StateInvariant is a runtime constraint on the participants of the Interaction. It may be used to specify a variety of different kinds of Constraints, such as values of Attributes or Variables, internal or external States, and so on. A StateInvariant is an InteractionFragment and it is placed on a Lifeline.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.StateInvariant#getInvariant <em>Invariant</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getStateInvariant()
 * @model
 * @generated
 */
public interface StateInvariant extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Invariant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Constraint that should hold at runtime for this StateInvariant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariant</em>' containment reference.
	 * @see #setInvariant(Constraint)
	 * @see uml.interactions.InteractionsPackage#getStateInvariant_Invariant()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateInvariant'"
	 * @generated
	 */
	Constraint getInvariant();

	/**
	 * Sets the value of the '{@link uml.interactions.StateInvariant#getInvariant <em>Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant</em>' containment reference.
	 * @see #getInvariant()
	 * @generated
	 */
	void setInvariant(Constraint value);

} // StateInvariant
