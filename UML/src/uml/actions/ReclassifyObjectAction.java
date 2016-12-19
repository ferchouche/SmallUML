/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReclassifyObjectAction is an Action that changes the Classifiers that classify an object.
 * object.type = null
 * not newClassifier->exists(isAbstract)
 * object.is(1,1)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link uml.actions.ReclassifyObjectAction#getNewClassifier <em>New Classifier</em>}</li>
 *   <li>{@link uml.actions.ReclassifyObjectAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml.actions.ReclassifyObjectAction#getOldClassifier <em>Old Classifier</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReclassifyObjectAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='input_pin classifier_not_abstract multiplicity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL input_pin='object.type = null' classifier_not_abstract='not newClassifier->exists(isAbstract)' multiplicity='object.is(1,1)'"
 * @generated
 */
public interface ReclassifyObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether existing Classifiers should be removed before adding the new Classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(boolean)
	 * @see uml.actions.ActionsPackage#getReclassifyObjectAction_IsReplaceAll()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReplaceAll();

	/**
	 * Sets the value of the '{@link uml.actions.ReclassifyObjectAction#isIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #isIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(boolean value);

	/**
	 * Returns the value of the '<em><b>New Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Classifiers to be added to the Classifiers of the given object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Classifier</em>' reference list.
	 * @see uml.actions.ActionsPackage#getReclassifyObjectAction_NewClassifier()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='reclassifyObjectAction'"
	 * @generated
	 */
	EList<Classifier> getNewClassifier();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that holds the object to be reclassified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.actions.ActionsPackage#getReclassifyObjectAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='reclassifyObjectAction'"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.actions.ReclassifyObjectAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Old Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Classifiers to be removed from the Classifiers of the given object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Old Classifier</em>' reference list.
	 * @see uml.actions.ActionsPackage#getReclassifyObjectAction_OldClassifier()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='reclassifyObjectAction'"
	 * @generated
	 */
	EList<Classifier> getOldClassifier();

} // ReclassifyObjectAction
