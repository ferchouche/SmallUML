/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.classification.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReadLinkAction is a LinkAction that navigates across an Association to retrieve the objects on one end.
 * self.openEnd()->forAll(type=result.type and isOrdered=result.isOrdered)
 * 
 * self.openEnd()->first().compatibleWith(result)
 * 
 * let openEnd : Property = self.openEnd()->first() in
 *   openEnd.visibility = VisibilityKind::public or 
 *   endData->exists(oed | 
 *     oed.end<>openEnd and 
 *     (_'context' = oed.end.type or 
 *       (openEnd.visibility = VisibilityKind::protected and 
 *         _'context'.conformsTo(oed.end.type.oclAsType(Classifier)))))
 * 
 * self.openEnd()->size() = 1
 * self.openEnd()->first().isNavigable()
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReadLinkAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReadLinkAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='type_and_ordering compatible_multiplicity visibility one_open_end navigable_open_end'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL type_and_ordering='self.openEnd()->forAll(type=result.type and isOrdered=result.isOrdered)\n' compatible_multiplicity='self.openEnd()->first().compatibleWith(result)\n' visibility='let openEnd : Property = self.openEnd()->first() in\n  openEnd.visibility = VisibilityKind::public or \n  endData->exists(oed | \n    oed.end<>openEnd and \n    (_\'context\' = oed.end.type or \n      (openEnd.visibility = VisibilityKind::protected and \n        _\'context\'.conformsTo(oed.end.type.oclAsType(Classifier)))))\n' one_open_end='self.openEnd()->size() = 1' navigable_open_end='self.openEnd()->first().isNavigable()\n'"
 * @generated
 */
public interface ReadLinkAction extends LinkAction {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which the objects retrieved from the \"open\" end of those links whose values on other ends are given by the endData.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getReadLinkAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readLinkAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ReadLinkAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the ends corresponding to endData with no value InputPin. (A well-formed ReadLinkAction is constrained to have only one of these.)
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='endData->select(value=null).end->asOrderedSet()'"
	 * @generated
	 */
	EList<Property> openEnd();

} // ReadLinkAction
