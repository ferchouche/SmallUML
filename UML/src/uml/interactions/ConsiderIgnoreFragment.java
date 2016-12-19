/**
 */
package uml.interactions;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consider Ignore Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConsiderIgnoreFragment is a kind of CombinedFragment that is used for the consider and ignore cases, which require lists of pertinent Messages to be specified.
 * (interactionOperator =  InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)
 * message->forAll(m | m.oclIsKindOf(Operation) or m.oclIsKindOf(Signal))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.ConsiderIgnoreFragment#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see uml.interactions.InteractionsPackage#getConsiderIgnoreFragment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='consider_or_ignore type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL consider_or_ignore='(interactionOperator =  InteractionOperatorKind::consider) or (interactionOperator =  InteractionOperatorKind::ignore)' type='message->forAll(m | m.oclIsKindOf(Operation) or m.oclIsKindOf(Signal))'"
 * @generated
 */
public interface ConsiderIgnoreFragment extends CombinedFragment {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of messages that apply to this fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' reference list.
	 * @see uml.interactions.InteractionsPackage#getConsiderIgnoreFragment_Message()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='considerIgnoreFragment'"
	 * @generated
	 */
	EList<NamedElement> getMessage();

} // ConsiderIgnoreFragment
