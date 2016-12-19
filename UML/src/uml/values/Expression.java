/**
 */
package uml.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Expression represents a node in an expression tree, which may be non-terminal or terminal. It defines a symbol, and has a possibly empty sequence of operands that are ValueSpecifications. It denotes a (possibly empty) set of values when evaluated in a context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.Expression#getOperand <em>Operand</em>}</li>
 *   <li>{@link uml.values.Expression#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link uml.values.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a sequence of operand ValueSpecifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see uml.values.ValuesPackage#getExpression_Operand()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='expression'"
	 * @generated
	 */
	EList<ValueSpecification> getOperand();

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The symbol associated with this node in the expression tree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see uml.values.ValuesPackage#getExpression_Symbol()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link uml.values.Expression#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // Expression
