/**
 */
package smalluml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinalities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Cardinalities#getLowerbound <em>Lowerbound</em>}</li>
 *   <li>{@link smalluml.Cardinalities#getUpperbound <em>Upperbound</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getCardinalities()
 * @model
 * @generated
 */
public interface Cardinalities extends EObject {
	/**
	 * Returns the value of the '<em><b>Lowerbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lowerbound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lowerbound</em>' attribute.
	 * @see #setLowerbound(int)
	 * @see smalluml.SmallumlPackage#getCardinalities_Lowerbound()
	 * @model required="true"
	 * @generated
	 */
	int getLowerbound();

	/**
	 * Sets the value of the '{@link smalluml.Cardinalities#getLowerbound <em>Lowerbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowerbound</em>' attribute.
	 * @see #getLowerbound()
	 * @generated
	 */
	void setLowerbound(int value);

	/**
	 * Returns the value of the '<em><b>Upperbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upperbound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upperbound</em>' attribute.
	 * @see #setUpperbound(int)
	 * @see smalluml.SmallumlPackage#getCardinalities_Upperbound()
	 * @model required="true"
	 * @generated
	 */
	int getUpperbound();

	/**
	 * Sets the value of the '{@link smalluml.Cardinalities#getUpperbound <em>Upperbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upperbound</em>' attribute.
	 * @see #getUpperbound()
	 * @generated
	 */
	void setUpperbound(int value);

} // Cardinalities
