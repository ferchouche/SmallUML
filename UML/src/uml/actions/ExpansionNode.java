/**
 */
package uml.actions;

import uml.activities.ObjectNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExpansionNode is an ObjectNode used to indicate a collection input or output for an ExpansionRegion. A collection input of an ExpansionRegion contains a collection that is broken into its individual elements inside the region, whose content is executed once per element. A collection output of an ExpansionRegion combines individual elements produced by the execution of the region into a collection for use outside the region.
 * regionAsInput->notEmpty() xor regionAsOutput->notEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ExpansionNode#getRegionAsInput <em>Region As Input</em>}</li>
 *   <li>{@link uml.actions.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getExpansionNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='region_as_input_or_output'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL region_as_input_or_output='regionAsInput->notEmpty() xor regionAsOutput->notEmpty()'"
 * @generated
 */
public interface ExpansionNode extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Region As Input</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.actions.ExpansionRegion#getInputElement <em>Input Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExpansionRegion for which the ExpansionNode is an input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Input</em>' reference.
	 * @see #setRegionAsInput(ExpansionRegion)
	 * @see uml.actions.ActionsPackage#getExpansionNode_RegionAsInput()
	 * @see uml.actions.ExpansionRegion#getInputElement
	 * @model opposite="inputElement" ordered="false"
	 * @generated
	 */
	ExpansionRegion getRegionAsInput();

	/**
	 * Sets the value of the '{@link uml.actions.ExpansionNode#getRegionAsInput <em>Region As Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Input</em>' reference.
	 * @see #getRegionAsInput()
	 * @generated
	 */
	void setRegionAsInput(ExpansionRegion value);

	/**
	 * Returns the value of the '<em><b>Region As Output</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.actions.ExpansionRegion#getOutputElement <em>Output Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExpansionRegion for which the ExpansionNode is an output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region As Output</em>' reference.
	 * @see #setRegionAsOutput(ExpansionRegion)
	 * @see uml.actions.ActionsPackage#getExpansionNode_RegionAsOutput()
	 * @see uml.actions.ExpansionRegion#getOutputElement
	 * @model opposite="outputElement" ordered="false"
	 * @generated
	 */
	ExpansionRegion getRegionAsOutput();

	/**
	 * Sets the value of the '{@link uml.actions.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region As Output</em>' reference.
	 * @see #getRegionAsOutput()
	 * @generated
	 */
	void setRegionAsOutput(ExpansionRegion value);

} // ExpansionNode
