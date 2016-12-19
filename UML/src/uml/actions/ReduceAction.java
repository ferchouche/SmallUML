/**
 */
package uml.actions;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ReduceAction is an Action that reduces a collection to a single value by repeatedly combining the elements of the collection using a reducer Behavior.
 * let inputs: OrderedSet(Parameter) = reducer.inputParameters() in
 * let outputs: OrderedSet(Parameter) = reducer.outputParameters() in
 * inputs->size()=2 and outputs->size()=1 and
 * inputs.type->forAll(t | 
 * 	outputs.type->forAll(conformsTo(t)) and 
 * 	-- Note that the following only checks the case when the collection is via multiple tokens.
 * 	collection.upperBound()>1 implies collection.type.conformsTo(t))
 * reducer.outputParameters().type->forAll(conformsTo(result.type))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.ReduceAction#getCollection <em>Collection</em>}</li>
 *   <li>{@link uml.actions.ReduceAction#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.actions.ReduceAction#getReducer <em>Reducer</em>}</li>
 *   <li>{@link uml.actions.ReduceAction#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getReduceAction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='reducer_inputs_output input_type_is_collection output_types_are_compatible'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL reducer_inputs_output='let inputs: OrderedSet(Parameter) = reducer.inputParameters() in\r\nlet outputs: OrderedSet(Parameter) = reducer.outputParameters() in\r\ninputs->size()=2 and outputs->size()=1 and\r\ninputs.type->forAll(t | \r\n\toutputs.type->forAll(conformsTo(t)) and \r\n\t-- Note that the following only checks the case when the collection is via multiple tokens.\r\n\tcollection.upperBound()>1 implies collection.type.conformsTo(t))' output_types_are_compatible='reducer.outputParameters().type->forAll(conformsTo(result.type))'"
 * @generated
 */
public interface ReduceAction extends Action {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that provides the collection to be reduced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(InputPin)
	 * @see uml.actions.ActionsPackage#getReduceAction_Collection()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='reduceAction'"
	 * @generated
	 */
	InputPin getCollection();

	/**
	 * Sets the value of the '{@link uml.actions.ReduceAction#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(InputPin value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the order of the input collection should determine the order in which the reducer Behavior is applied to its elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see #setIsOrdered(boolean)
	 * @see uml.actions.ActionsPackage#getReduceAction_IsOrdered()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Sets the value of the '{@link uml.actions.ReduceAction#isIsOrdered <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ordered</em>' attribute.
	 * @see #isIsOrdered()
	 * @generated
	 */
	void setIsOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Reducer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior that is repreatedly applied to two elements of the input collection to produce a value that is of the same type as elements of the collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reducer</em>' reference.
	 * @see #setReducer(Behavior)
	 * @see uml.actions.ActionsPackage#getReduceAction_Reducer()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='reduceAction'"
	 * @generated
	 */
	Behavior getReducer();

	/**
	 * Sets the value of the '{@link uml.actions.ReduceAction#getReducer <em>Reducer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reducer</em>' reference.
	 * @see #getReducer()
	 * @generated
	 */
	void setReducer(Behavior value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output pin on which the result value is placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(OutputPin)
	 * @see uml.actions.ActionsPackage#getReduceAction_Result()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='reduceAction'"
	 * @generated
	 */
	OutputPin getResult();

	/**
	 * Sets the value of the '{@link uml.actions.ReduceAction#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(OutputPin value);

} // ReduceAction
