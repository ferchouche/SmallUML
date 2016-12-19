/**
 */
package uml.actions;

import uml.classification.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Link Object End Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReadLinkObjectEndAction is an Action that retrieves an end object from a link object.
 * end.association <> null
 * object.is(1,1)
 * end.association.memberEnd->forAll(e | not e.isStatic)
 * result.type = end.type
 * result.is(1,1)
 * object.type = end.association
 * end.association.oclIsKindOf(AssociationClass)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReadLinkObjectEndAction#getEnd <em>End</em>}</li>
 *   <li>{@link uml.actions.ReadLinkObjectEndAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml.actions.ReadLinkObjectEndAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReadLinkObjectEndAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='property multiplicity_of_object ends_of_association type_of_result multiplicity_of_result type_of_object association_of_association'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL property='end.association <> null' multiplicity_of_object='object.is(1,1)' ends_of_association='end.association.memberEnd->forAll(e | not e.isStatic)' type_of_result='result.type = end.type' multiplicity_of_result='result.is(1,1)' type_of_object='object.type = end.association' association_of_association='end.association.oclIsKindOf(AssociationClass)'"
 * @generated
 */
public interface ReadLinkObjectEndAction extends Action {
	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Association end to be read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Property)
	 * @see uml.actions.ActionsPackage#getReadLinkObjectEndAction_End()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readLinkObjectEndAction'"
	 * @generated
	 */
	Property getEnd();

	/**
	 * Sets the value of the '{@link uml.actions.ReadLinkObjectEndAction#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Property value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pin from which the link object is obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.actions.ActionsPackage#getReadLinkObjectEndAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readLinkObjectEndAction'"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.actions.ReadLinkObjectEndAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin where the result value is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getReadLinkObjectEndAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readLinkObjectEndAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ReadLinkObjectEndAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // ReadLinkObjectEndAction
