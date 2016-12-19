/**
 */
package uml.classification;

import uml.commonStructure.MultiplicityElement;
import uml.commonStructure.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StructuralFeature is a typed feature of a Classifier that specifies the structure of instances of the Classifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.StructuralFeature#isIsReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface StructuralFeature extends Feature, TypedElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isReadOnly is true, the StructuralFeature may not be written to after initialization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see uml.classification.ClassificationPackage#getStructuralFeature_IsReadOnly()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link uml.classification.StructuralFeature#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

} // StructuralFeature
