/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OccurrenceSpecification is the basic semantic unit of Interactions. The sequences of occurrences specified by them are the meanings of Interactions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.OccurrenceSpecification#getToAfter <em>To After</em>}</li>
 *   <li>{@link uml.interactions.OccurrenceSpecification#getToBefore <em>To Before</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getOccurrenceSpecification()
 * @model
 * @generated
 */
public interface OccurrenceSpecification extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>To After</b></em>' reference list.
	 * The list contents are of type {@link uml.interactions.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link uml.interactions.GeneralOrdering#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the GeneralOrderings that specify EventOcurrences that must occur after this OccurrenceSpecification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To After</em>' reference list.
	 * @see uml.interactions.InteractionsPackage#getOccurrenceSpecification_ToAfter()
	 * @see uml.interactions.GeneralOrdering#getBefore
	 * @model opposite="before" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getToAfter();

	/**
	 * Returns the value of the '<em><b>To Before</b></em>' reference list.
	 * The list contents are of type {@link uml.interactions.GeneralOrdering}.
	 * It is bidirectional and its opposite is '{@link uml.interactions.GeneralOrdering#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the GeneralOrderings that specify EventOcurrences that must occur before this OccurrenceSpecification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Before</em>' reference list.
	 * @see uml.interactions.InteractionsPackage#getOccurrenceSpecification_ToBefore()
	 * @see uml.interactions.GeneralOrdering#getAfter
	 * @model opposite="after" ordered="false"
	 * @generated
	 */
	EList<GeneralOrdering> getToBefore();

} // OccurrenceSpecification
