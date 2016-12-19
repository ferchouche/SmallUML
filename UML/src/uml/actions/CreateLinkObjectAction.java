/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Link Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CreateLinkObjectAction is a CreateLinkAction for creating link objects (AssociationClasse instances).
 * result.is(1,1)
 * result.type = association()
 * self.association().oclIsKindOf(AssociationClass)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.CreateLinkObjectAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getCreateLinkObjectAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity type_of_result association_class'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity='result.is(1,1)' type_of_result='result.type = association()' association_class='self.association().oclIsKindOf(AssociationClass)'"
 * @generated
 */
public interface CreateLinkObjectAction extends CreateLinkAction {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output pin on which the newly created link object is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getCreateLinkObjectAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='createLinkObjectAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.CreateLinkObjectAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // CreateLinkObjectAction
