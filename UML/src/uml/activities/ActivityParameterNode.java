/**
 */
package uml.activities;

import uml.classification.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Parameter Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ActivityParameterNode is an ObjectNode for accepting values from the input Parameters or providing values to the output Parameters of an Activity.
 * (incoming->notEmpty() and outgoing->isEmpty()) implies 
 * 	(parameter.direction = ParameterDirectionKind::out or 
 * 	 parameter.direction = ParameterDirectionKind::inout or 
 * 	 parameter.direction = ParameterDirectionKind::return)
 * activity.ownedParameter->includes(parameter)
 * type = parameter.type
 * (outgoing->notEmpty() and incoming->isEmpty()) implies 
 * 	(parameter.direction = ParameterDirectionKind::_'in' or 
 * 	 parameter.direction = ParameterDirectionKind::inout)
 * incoming->isEmpty() or outgoing->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.ActivityParameterNode#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getActivityParameterNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_outgoing_edges has_parameters same_type no_incoming_edges no_edges'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL no_outgoing_edges='(incoming->notEmpty() and outgoing->isEmpty()) implies \r\n\t(parameter.direction = ParameterDirectionKind::out or \r\n\t parameter.direction = ParameterDirectionKind::inout or \r\n\t parameter.direction = ParameterDirectionKind::return)' has_parameters='activity.ownedParameter->includes(parameter)' same_type='type = parameter.type' no_incoming_edges='(outgoing->notEmpty() and incoming->isEmpty()) implies \r\n\t(parameter.direction = ParameterDirectionKind::_\'in\' or \r\n\t parameter.direction = ParameterDirectionKind::inout)' no_edges='incoming->isEmpty() or outgoing->isEmpty()'"
 * @generated
 */
public interface ActivityParameterNode extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Parameter for which the ActivityParameterNode will be accepting or providing values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see uml.activities.ActivitiesPackage#getActivityParameterNode_Parameter()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activityParameterNode'"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link uml.activities.ActivityParameterNode#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ActivityParameterNode
