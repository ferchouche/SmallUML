/**
 */
package uml.commonBehavior;

import uml.simpleClassifiers.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FunctionBehavior is an OpaqueBehavior that does not access or modify any objects or other external data.
 * self.ownedParameter->
 *   select(p | p.direction = ParameterDirectionKind::out or p.direction= ParameterDirectionKind::inout or p.direction= ParameterDirectionKind::return)->size() >= 1
 * ownedParameter->forAll(p | p.type <> null and
 *   p.type.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p.type.oclAsType(DataType)))
 * <!-- end-model-doc -->
 *
 *
 * @see uml.commonBehavior.CommonBehaviorPackage#getFunctionBehavior()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='one_output_parameter types_of_parameters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL one_output_parameter='self.ownedParameter->\r\n  select(p | p.direction = ParameterDirectionKind::out or p.direction= ParameterDirectionKind::inout or p.direction= ParameterDirectionKind::return)->size() >= 1' types_of_parameters='ownedParameter->forAll(p | p.type <> null and\r\n  p.type.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p.type.oclAsType(DataType)))'"
 * @generated
 */
public interface FunctionBehavior extends OpaqueBehavior {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hasAllDataTypeAttributes query tests whether the types of the attributes of the given DataType are all DataTypes, and similarly for all those DataTypes.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" dRequired="true" dOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='d.ownedAttribute->forAll(a |\r\n    a.type.oclIsKindOf(DataType) and\r\n      hasAllDataTypeAttributes(a.type.oclAsType(DataType)))'"
	 * @generated
	 */
	boolean hasAllDataTypeAttributes(DataType d);

} // FunctionBehavior
