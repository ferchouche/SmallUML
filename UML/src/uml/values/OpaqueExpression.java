/**
 */
package uml.values;

import org.eclipse.emf.common.util.EList;

import uml.classification.Parameter;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OpaqueExpression is a ValueSpecification that specifies the computation of a collection of values either in terms of a UML Behavior or based on a textual statement in a language other than UML
 * language->notEmpty() implies (_'body'->size() = language->size())
 * behavior <> null implies
 *    behavior.ownedParameter->select(direction=ParameterDirectionKind::return)->size() = 1
 * behavior <> null implies behavior.ownedParameter->select(direction<>ParameterDirectionKind::return)->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.OpaqueExpression#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link uml.values.OpaqueExpression#getBody <em>Body</em>}</li>
 *   <li>{@link uml.values.OpaqueExpression#getLanguage <em>Language</em>}</li>
 *   <li>{@link uml.values.OpaqueExpression#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getOpaqueExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='language_body_size one_return_result_parameter only_return_result_parameters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL language_body_size='language->notEmpty() implies (_\'body\'->size() = language->size())' one_return_result_parameter='behavior <> null implies\r\n   behavior.ownedParameter->select(direction=ParameterDirectionKind::return)->size() = 1' only_return_result_parameters='behavior <> null implies behavior.ownedParameter->select(direction<>ParameterDirectionKind::return)->isEmpty()'"
 * @generated
 */
public interface OpaqueExpression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the behavior of the OpaqueExpression as a UML Behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see uml.values.ValuesPackage#getOpaqueExpression_Behavior()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='opaqueExpression'"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link uml.values.OpaqueExpression#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual definition of the behavior of the OpaqueExpression, possibly in multiple languages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see uml.values.ValuesPackage#getOpaqueExpression_Body()
	 * @model unique="false" dataType="types.String"
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the languages used to express the textual bodies of the OpaqueExpression.  Languages are matched to body Strings by order. The interpretation of the body depends on the languages. If the languages are unspecified, they may be implicit from the expression body or the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see uml.values.ValuesPackage#getOpaqueExpression_Language()
	 * @model dataType="types.String"
	 * @generated
	 */
	EList<String> getLanguage();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an OpaqueExpression is specified using a UML Behavior, then this refers to the single required return Parameter of that Behavior. When the Behavior completes execution, the values on this Parameter give the result of evaluating the OpaqueExpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see uml.values.ValuesPackage#getOpaqueExpression_Result()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='opaqueExpression'"
	 * @generated
	 */
	Parameter getResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isIntegral() tells whether an expression is intended to produce an Integer.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='false'"
	 * @generated
	 */
	boolean isIntegral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNonNegative() tells whether an integer expression has a non-negative value.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='false'"
	 * @generated
	 */
	boolean isNonNegative();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isPositive() tells whether an integer expression has a positive value.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='false'"
	 * @generated
	 */
	boolean isPositive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for OpaqueExpression::/result 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if behavior = null then\r\n\tnull\r\nelse\r\n\tbehavior.ownedParameter->first()\r\nendif'"
	 * @generated
	 */
	Parameter result();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query value() gives an integer value for an expression intended to produce one.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='0'"
	 * @generated
	 */
	int value();

} // OpaqueExpression
