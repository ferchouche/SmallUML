/**
 */
package uml.values;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StringExpression is an Expression that specifies a String value that is derived by concatenating a sequence of operands with String values or a sequence of subExpressions, some of which might be template parameters.
 * operand->forAll (oclIsKindOf (LiteralString))
 * if subExpression->notEmpty() then operand->isEmpty() else operand->notEmpty() endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.StringExpression#getOwningExpression <em>Owning Expression</em>}</li>
 *   <li>{@link uml.values.StringExpression#getSubExpression <em>Sub Expression</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getStringExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='operands subexpressions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL operands='operand->forAll (oclIsKindOf (LiteralString))' subexpressions='if subExpression->notEmpty() then operand->isEmpty() else operand->notEmpty() endif'"
 * @generated
 */
public interface StringExpression extends Expression, TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Owning Expression</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.values.StringExpression#getSubExpression <em>Sub Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StringExpression of which this StringExpression is a subExpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Expression</em>' container reference.
	 * @see #setOwningExpression(StringExpression)
	 * @see uml.values.ValuesPackage#getStringExpression_OwningExpression()
	 * @see uml.values.StringExpression#getSubExpression
	 * @model opposite="subExpression" transient="false" ordered="false"
	 * @generated
	 */
	StringExpression getOwningExpression();

	/**
	 * Sets the value of the '{@link uml.values.StringExpression#getOwningExpression <em>Owning Expression</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Expression</em>' container reference.
	 * @see #getOwningExpression()
	 * @generated
	 */
	void setOwningExpression(StringExpression value);

	/**
	 * Returns the value of the '<em><b>Sub Expression</b></em>' containment reference list.
	 * The list contents are of type {@link uml.values.StringExpression}.
	 * It is bidirectional and its opposite is '{@link uml.values.StringExpression#getOwningExpression <em>Owning Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StringExpressions that constitute this StringExpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Expression</em>' containment reference list.
	 * @see uml.values.ValuesPackage#getStringExpression_SubExpression()
	 * @see uml.values.StringExpression#getOwningExpression
	 * @model opposite="owningExpression" containment="true"
	 * @generated
	 */
	EList<StringExpression> getSubExpression();

} // StringExpression
