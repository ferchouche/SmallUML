/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OpaqueAction is an Action whose functionality is not specified within UML.
 * language->notEmpty() implies (_'body'->size() = language->size())
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.OpaqueAction#getBody <em>Body</em>}</li>
 *   <li>{@link uml.actions.OpaqueAction#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link uml.actions.OpaqueAction#getLanguage <em>Language</em>}</li>
 *   <li>{@link uml.actions.OpaqueAction#getOutputValue <em>Output Value</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getOpaqueAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='language_body_size'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL language_body_size='language->notEmpty() implies (_\'body\'->size() = language->size())'"
 * @generated
 */
public interface OpaqueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a textual specification of the functionality of the Action, in one or more languages other than UML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see uml.actions.ActionsPackage#getOpaqueAction_Body()
	 * @model unique="false" dataType="types.String"
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPins providing inputs to the OpaqueAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Value</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getOpaqueAction_InputValue()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='opaqueAction'"
	 * @generated
	 */
	EList<InputPin> getInputValue();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If provided, a specification of the language used for each of the body Strings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see uml.actions.ActionsPackage#getOpaqueAction_Language()
	 * @model dataType="types.String"
	 * @generated
	 */
	EList<String> getLanguage();

	/**
	 * Returns the value of the '<em><b>Output Value</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputPins on which the OpaqueAction provides outputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Value</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getOpaqueAction_OutputValue()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='opaqueAction'"
	 * @generated
	 */
	EList<OutputPin> getOutputValue();

} // OpaqueAction
