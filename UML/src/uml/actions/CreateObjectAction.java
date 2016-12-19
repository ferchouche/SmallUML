/**
 */
package uml.actions;

import uml.classification.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CreateObjectAction is an Action that creates an instance of the specified Classifier.
 * not classifier.isAbstract 
 * result.is(1,1)
 * not classifier.oclIsKindOf(AssociationClass)
 * result.type = classifier
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.CreateObjectAction#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link uml.actions.CreateObjectAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getCreateObjectAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='classifier_not_abstract multiplicity classifier_not_association_class same_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL classifier_not_abstract='not classifier.isAbstract ' multiplicity='result.is(1,1)' classifier_not_association_class='not classifier.oclIsKindOf(AssociationClass)' same_type='result.type = classifier'"
 * @generated
 */
public interface CreateObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier to be instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(Classifier)
	 * @see uml.actions.ActionsPackage#getCreateObjectAction_Classifier()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='createObjectAction'"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * Sets the value of the '{@link uml.actions.CreateObjectAction#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPin on which the newly created object is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getCreateObjectAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='createObjectAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.CreateObjectAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // CreateObjectAction
