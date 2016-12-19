/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExpansionRegion is a StructuredActivityNode that executes its content multiple times corresponding to elements of input collection(s).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ExpansionRegion#getMode <em>Mode</em>}</li>
 *   <li>{@link uml.actions.ExpansionRegion#getOutputElement <em>Output Element</em>}</li>
 *   <li>{@link uml.actions.ExpansionRegion#getInputElement <em>Input Element</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getExpansionRegion()
 * @model
 * @generated
 */
public interface ExpansionRegion extends StructuredActivityNode {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"iterative"</code>.
	 * The literals are from the enumeration {@link uml.actions.ExpansionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mode in which the ExpansionRegion executes its contents. If parallel, executions are concurrent. If iterative, executions are sequential. If stream, a stream of values flows into a single execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see uml.actions.ExpansionKind
	 * @see #setMode(ExpansionKind)
	 * @see uml.actions.ActionsPackage#getExpansionRegion_Mode()
	 * @model default="iterative" required="true" ordered="false"
	 * @generated
	 */
	ExpansionKind getMode();

	/**
	 * Sets the value of the '{@link uml.actions.ExpansionRegion#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see uml.actions.ExpansionKind
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ExpansionKind value);

	/**
	 * Returns the value of the '<em><b>Output Element</b></em>' reference list.
	 * The list contents are of type {@link uml.actions.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link uml.actions.ExpansionNode#getRegionAsOutput <em>Region As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExpansionNodes that form the output collections of the ExpansionRegion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Element</em>' reference list.
	 * @see uml.actions.ActionsPackage#getExpansionRegion_OutputElement()
	 * @see uml.actions.ExpansionNode#getRegionAsOutput
	 * @model opposite="regionAsOutput" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getOutputElement();

	/**
	 * Returns the value of the '<em><b>Input Element</b></em>' reference list.
	 * The list contents are of type {@link uml.actions.ExpansionNode}.
	 * It is bidirectional and its opposite is '{@link uml.actions.ExpansionNode#getRegionAsInput <em>Region As Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExpansionNodes that hold the input collections for the ExpansionRegion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Element</em>' reference list.
	 * @see uml.actions.ActionsPackage#getExpansionRegion_InputElement()
	 * @see uml.actions.ExpansionNode#getRegionAsInput
	 * @model opposite="regionAsInput" required="true" ordered="false"
	 * @generated
	 */
	EList<ExpansionNode> getInputElement();

} // ExpansionRegion
