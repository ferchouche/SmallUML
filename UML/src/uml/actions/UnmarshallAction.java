/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unmarshall Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An UnmarshallAction is an Action that retrieves the values of the StructuralFeatures of an object and places them on OutputPins. 
 * unmarshallType.allAttributes()->size() >= 1
 * unmarshallType.allAttributes()->size() = result->size()
 * let attribute:OrderedSet(Property) = unmarshallType.allAttributes() in
 * Sequence{1..result->size()}->forAll(i | 
 * 	attribute->at(i).type.conformsTo(result->at(i).type) and
 * 	attribute->at(i).isOrdered=result->at(i).isOrdered and
 * 	attribute->at(i).compatibleWith(result->at(i)))
 * object.is(1,1)
 * object.type.conformsTo(unmarshallType)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.UnmarshallAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml.actions.UnmarshallAction#getResult <em>Result</em>}</li>
 *   <li>{@link uml.actions.UnmarshallAction#getUnmarshallType <em>Unmarshall Type</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getUnmarshallAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='structural_feature number_of_result type_ordering_and_multiplicity multiplicity_of_object object_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL structural_feature='unmarshallType.allAttributes()->size() >= 1' number_of_result='unmarshallType.allAttributes()->size() = result->size()' type_ordering_and_multiplicity='let attribute:OrderedSet(Property) = unmarshallType.allAttributes() in\r\nSequence{1..result->size()}->forAll(i | \r\n\tattribute->at(i).type.conformsTo(result->at(i).type) and\r\n\tattribute->at(i).isOrdered=result->at(i).isOrdered and\r\n\tattribute->at(i).compatibleWith(result->at(i)))' multiplicity_of_object='object.is(1,1)' object_type='object.type.conformsTo(unmarshallType)'"
 * @generated
 */
public interface UnmarshallAction extends Action {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that gives the object to be unmarshalled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.actions.ActionsPackage#getUnmarshallAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='unmarshallAction'"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.actions.UnmarshallAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins on which are placed the values of the StructuralFeatures of the input object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getUnmarshallAction_Result()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='unmarshallAction'"
	 * @generated
	 */
	EList<OutputPin> getResult();

	/**
	 * Returns the value of the '<em><b>Unmarshall Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the object to be unmarshalled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unmarshall Type</em>' reference.
	 * @see #setUnmarshallType(Classifier)
	 * @see uml.actions.ActionsPackage#getUnmarshallAction_UnmarshallType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='unmarshallAction'"
	 * @generated
	 */
	Classifier getUnmarshallType();

	/**
	 * Sets the value of the '{@link uml.actions.UnmarshallAction#getUnmarshallType <em>Unmarshall Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unmarshall Type</em>' reference.
	 * @see #getUnmarshallType()
	 * @generated
	 */
	void setUnmarshallType(Classifier value);

} // UnmarshallAction
