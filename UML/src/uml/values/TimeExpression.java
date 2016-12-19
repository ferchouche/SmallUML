/**
 */
package uml.values;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TimeExpression is a ValueSpecification that represents a time value.
 * expr = null implies (observation->size() = 1 and observation->forAll(oclIsKindOf(TimeObservation)))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.values.TimeExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link uml.values.TimeExpression#getObservation <em>Observation</em>}</li>
 * </ul>
 *
 * @see uml.values.ValuesPackage#getTimeExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='no_expr_requires_observation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL no_expr_requires_observation='expr = null implies (observation->size() = 1 and observation->forAll(oclIsKindOf(TimeObservation)))'"
 * @generated
 */
public interface TimeExpression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification that evaluates to the value of the TimeExpression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(ValueSpecification)
	 * @see uml.values.ValuesPackage#getTimeExpression_Expr()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='timeExpression'"
	 * @generated
	 */
	ValueSpecification getExpr();

	/**
	 * Sets the value of the '{@link uml.values.TimeExpression#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' reference list.
	 * The list contents are of type {@link uml.values.Observation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the Observations that are involved in the computation of the TimeExpression value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' reference list.
	 * @see uml.values.ValuesPackage#getTimeExpression_Observation()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='timeExpression'"
	 * @generated
	 */
	EList<Observation> getObservation();

} // TimeExpression
