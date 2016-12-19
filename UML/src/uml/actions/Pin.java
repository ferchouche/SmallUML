/**
 */
package uml.actions;

import uml.activities.ObjectNode;

import uml.commonStructure.MultiplicityElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Pin is an ObjectNode and MultiplicityElement that provides input values to an Action or accepts output values from an Action.
 * isControl implies isControlType
 * not isUnique
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.Pin#isIsControl <em>Is Control</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getPin()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='control_pins not_unique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL control_pins='isControl implies isControlType' not_unique='not isUnique'"
 * @generated
 */
public interface Pin extends ObjectNode, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Is Control</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the Pin provides data to the Action or just controls how the Action executes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Control</em>' attribute.
	 * @see #setIsControl(boolean)
	 * @see uml.actions.ActionsPackage#getPin_IsControl()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsControl();

	/**
	 * Sets the value of the '{@link uml.actions.Pin#isIsControl <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control</em>' attribute.
	 * @see #isIsControl()
	 * @generated
	 */
	void setIsControl(boolean value);

} // Pin
