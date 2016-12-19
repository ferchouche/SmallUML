/**
 */
package uml.classification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Feature declares a behavioral or structural characteristic of Classifiers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link uml.classification.Feature#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.classification.Classifier#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers that have this Feature as a feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' reference.
	 * @see uml.classification.ClassificationPackage#getFeature_FeaturingClassifier()
	 * @see uml.classification.Classifier#getFeature
	 * @model opposite="feature" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Classifier getFeaturingClassifier();

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether this Feature characterizes individual instances classified by the Classifier (false) or the Classifier itself (true).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see uml.classification.ClassificationPackage#getFeature_IsStatic()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link uml.classification.Feature#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

} // Feature
