/**
 */
package uml.interactions;

import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GeneralOrdering represents a binary relation between two OccurrenceSpecifications, to describe that one OccurrenceSpecification must occur before the other in a valid trace. This mechanism provides the ability to define partial orders of OccurrenceSpecifications that may otherwise not have a specified order.
 * after->closure(toAfter.after)->excludes(before)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.GeneralOrdering#getAfter <em>After</em>}</li>
 *   <li>{@link uml.interactions.GeneralOrdering#getBefore <em>Before</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getGeneralOrdering()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='irreflexive_transitive_closure'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL irreflexive_transitive_closure='after->closure(toAfter.after)->excludes(before)'"
 * @generated
 */
public interface GeneralOrdering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.interactions.OccurrenceSpecification#getToBefore <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OccurrenceSpecification referenced comes after the OccurrenceSpecification referenced by before.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(OccurrenceSpecification)
	 * @see uml.interactions.InteractionsPackage#getGeneralOrdering_After()
	 * @see uml.interactions.OccurrenceSpecification#getToBefore
	 * @model opposite="toBefore" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getAfter();

	/**
	 * Sets the value of the '{@link uml.interactions.GeneralOrdering#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(OccurrenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.interactions.OccurrenceSpecification#getToAfter <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OccurrenceSpecification referenced comes before the OccurrenceSpecification referenced by after.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(OccurrenceSpecification)
	 * @see uml.interactions.InteractionsPackage#getGeneralOrdering_Before()
	 * @see uml.interactions.OccurrenceSpecification#getToAfter
	 * @model opposite="toAfter" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getBefore();

	/**
	 * Sets the value of the '{@link uml.interactions.GeneralOrdering#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(OccurrenceSpecification value);

} // GeneralOrdering
