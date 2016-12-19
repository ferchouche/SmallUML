/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.structuredClassifiers.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LinkAction is an abstract class for all Actions that identify the links to be acted on using LinkEndData.
 * inputValue->asBag()=endData.allPins()
 * endData.end = self.association().memberEnd->asBag()
 * endData->forAll(not end.isStatic)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.LinkAction#getEndData <em>End Data</em>}</li>
 *   <li>{@link uml.actions.LinkAction#getInputValue <em>Input Value</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getLinkAction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='same_pins same_association not_static'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL same_pins='inputValue->asBag()=endData.allPins()' same_association='endData.end = self.association().memberEnd->asBag()' not_static='endData->forAll(not end.isStatic)'"
 * @generated
 */
public interface LinkAction extends Action {
	/**
	 * Returns the value of the '<em><b>End Data</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.LinkEndData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LinkEndData identifying the values on the ends of the links acting on by this LinkAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Data</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getLinkAction_EndData()
	 * @model containment="true" lower="2" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='linkAction'"
	 * @generated
	 */
	EList<LinkEndData> getEndData();

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InputPins used by the LinkEndData of the LinkAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Value</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getLinkAction_InputValue()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='linkAction'"
	 * @generated
	 */
	EList<InputPin> getInputValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Association acted on by this LinkAction.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='endData->asSequence()->first().end.association'"
	 * @generated
	 */
	Association association();

} // LinkAction
