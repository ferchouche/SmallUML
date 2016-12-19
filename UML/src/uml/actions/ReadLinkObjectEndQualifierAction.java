/**
 */
package uml.actions;

import uml.classification.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Link Object End Qualifier Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReadLinkObjectEndQualifierAction is an Action that retrieves a qualifier end value from a link object.
 * object.is(1,1)
 * object.type = qualifier.associationEnd.association
 * qualifier.is(1,1)
 * qualifier.associationEnd.association.memberEnd->forAll(e | not e.isStatic)
 * result.is(1,1)
 * result.type = qualifier.type
 * qualifier.associationEnd.association.oclIsKindOf(AssociationClass)
 * qualifier.associationEnd <> null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml.actions.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uml.actions.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReadLinkObjectEndQualifierAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity_of_object type_of_object multiplicity_of_qualifier ends_of_association multiplicity_of_result same_type association_of_association qualifier_attribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity_of_object='object.is(1,1)' type_of_object='object.type = qualifier.associationEnd.association' multiplicity_of_qualifier='qualifier.is(1,1)' ends_of_association='qualifier.associationEnd.association.memberEnd->forAll(e | not e.isStatic)' multiplicity_of_result='result.is(1,1)' same_type='result.type = qualifier.type' association_of_association='qualifier.associationEnd.association.oclIsKindOf(AssociationClass)' qualifier_attribute='qualifier.associationEnd <> null'"
 * @generated
 */
public interface ReadLinkObjectEndQualifierAction extends Action {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin from which the link object is obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.actions.ActionsPackage#getReadLinkObjectEndQualifierAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readLinkObjectEndQualifierAction'"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.actions.ReadLinkObjectEndQualifierAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualifier Property to be read.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(Property)
	 * @see uml.actions.ActionsPackage#getReadLinkObjectEndQualifierAction_Qualifier()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readLinkObjectEndQualifierAction'"
	 * @generated
	 */
	Property getQualifier();

	/**
	 * Sets the value of the '{@link uml.actions.ReadLinkObjectEndQualifierAction#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Property value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin where the result value is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getReadLinkObjectEndQualifierAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='readLinkObjectEndQualifierAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ReadLinkObjectEndQualifierAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // ReadLinkObjectEndQualifierAction
