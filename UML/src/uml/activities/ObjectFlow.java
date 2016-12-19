/**
 */
package uml.activities;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ObjectFlow is an ActivityEdge that is traversed by object tokens that may hold values. Object flows also support multicast/receive, token selection from object nodes, and transformation of tokens.
 * selection<>null implies
 * 	selection.inputParameters()->size()=1 and
 * 	selection.inputParameters()->forAll(not isUnique and is(0,*)) and
 * 	selection.outputParameters()->size()=1
 * not (source.oclIsKindOf(ExecutableNode) or target.oclIsKindOf(ExecutableNode))
 * transformation<>null implies
 * 	transformation.inputParameters()->size()=1 and
 * 	transformation.outputParameters()->size()=1
 * selection<>null implies source.oclIsKindOf(ObjectNode)
 * not (isMulticast and isMultireceive)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.ObjectFlow#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link uml.activities.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link uml.activities.ObjectFlow#getSelection <em>Selection</em>}</li>
 *   <li>{@link uml.activities.ObjectFlow#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getObjectFlow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='input_and_output_parameter no_executable_nodes transformation_behavior selection_behavior compatible_types same_upper_bounds target is_multicast_or_is_multireceive'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL input_and_output_parameter='selection<>null implies\r\n\tselection.inputParameters()->size()=1 and\r\n\tselection.inputParameters()->forAll(not isUnique and is(0,*)) and\r\n\tselection.outputParameters()->size()=1' no_executable_nodes='not (source.oclIsKindOf(ExecutableNode) or target.oclIsKindOf(ExecutableNode))' transformation_behavior='transformation<>null implies\r\n\ttransformation.inputParameters()->size()=1 and\r\n\ttransformation.outputParameters()->size()=1' selection_behavior='selection<>null implies source.oclIsKindOf(ObjectNode)' is_multicast_or_is_multireceive='not (isMulticast and isMultireceive)'"
 * @generated
 */
public interface ObjectFlow extends ActivityEdge {
	/**
	 * Returns the value of the '<em><b>Is Multicast</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the objects in the ObjectFlow are passed by multicasting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Multicast</em>' attribute.
	 * @see #setIsMulticast(boolean)
	 * @see uml.activities.ActivitiesPackage#getObjectFlow_IsMulticast()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMulticast();

	/**
	 * Sets the value of the '{@link uml.activities.ObjectFlow#isIsMulticast <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multicast</em>' attribute.
	 * @see #isIsMulticast()
	 * @generated
	 */
	void setIsMulticast(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Multireceive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the objects in the ObjectFlow are gathered from respondents to multicasting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Multireceive</em>' attribute.
	 * @see #setIsMultireceive(boolean)
	 * @see uml.activities.ActivitiesPackage#getObjectFlow_IsMultireceive()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsMultireceive();

	/**
	 * Sets the value of the '{@link uml.activities.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multireceive</em>' attribute.
	 * @see #isIsMultireceive()
	 * @generated
	 */
	void setIsMultireceive(boolean value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior used to select tokens from a source ObjectNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(Behavior)
	 * @see uml.activities.ActivitiesPackage#getObjectFlow_Selection()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectFlow'"
	 * @generated
	 */
	Behavior getSelection();

	/**
	 * Sets the value of the '{@link uml.activities.ObjectFlow#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Behavior value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior used to change or replace object tokens flowing along the ObjectFlow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(Behavior)
	 * @see uml.activities.ActivitiesPackage#getObjectFlow_Transformation()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectFlow'"
	 * @generated
	 */
	Behavior getTransformation();

	/**
	 * Sets the value of the '{@link uml.activities.ObjectFlow#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Behavior value);

} // ObjectFlow
