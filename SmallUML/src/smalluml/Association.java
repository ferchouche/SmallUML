/**
 */
package smalluml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Association#getCardinalities <em>Cardinalities</em>}</li>
 *   <li>{@link smalluml.Association#getTargetclass <em>Targetclass</em>}</li>
 *   <li>{@link smalluml.Association#getSourceclass <em>Sourceclass</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Entity {
	/**
	 * Returns the value of the '<em><b>Cardinalities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinalities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinalities</em>' containment reference.
	 * @see #setCardinalities(Cardinalities)
	 * @see smalluml.SmallumlPackage#getAssociation_Cardinalities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinalities getCardinalities();

	/**
	 * Sets the value of the '{@link smalluml.Association#getCardinalities <em>Cardinalities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinalities</em>' containment reference.
	 * @see #getCardinalities()
	 * @generated
	 */
	void setCardinalities(Cardinalities value);

	/**
	 * Returns the value of the '<em><b>Targetclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetclass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetclass</em>' reference.
	 * @see #setTargetclass(smalluml.Class)
	 * @see smalluml.SmallumlPackage#getAssociation_Targetclass()
	 * @model required="true"
	 * @generated
	 */
	smalluml.Class getTargetclass();

	/**
	 * Sets the value of the '{@link smalluml.Association#getTargetclass <em>Targetclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetclass</em>' reference.
	 * @see #getTargetclass()
	 * @generated
	 */
	void setTargetclass(smalluml.Class value);

	/**
	 * Returns the value of the '<em><b>Sourceclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourceclass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourceclass</em>' reference.
	 * @see #setSourceclass(smalluml.Class)
	 * @see smalluml.SmallumlPackage#getAssociation_Sourceclass()
	 * @model required="true"
	 * @generated
	 */
	smalluml.Class getSourceclass();

	/**
	 * Sets the value of the '{@link smalluml.Association#getSourceclass <em>Sourceclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourceclass</em>' reference.
	 * @see #getSourceclass()
	 * @generated
	 */
	void setSourceclass(smalluml.Class value);

} // Association
