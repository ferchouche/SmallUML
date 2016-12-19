/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;

import uml.commonStructure.Realization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Realization is specialized to (optionally) define the Classifiers that realize the contract offered by a Component in terms of its provided and required Interfaces. The Component forms an abstraction from these various Classifiers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.ComponentRealization#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 *   <li>{@link uml.structuredClassifiers.ComponentRealization#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getComponentRealization()
 * @model
 * @generated
 */
public interface ComponentRealization extends Realization {
	/**
	 * Returns the value of the '<em><b>Realizing Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers that are involved in the implementation of the Component that owns this Realization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Classifier</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getComponentRealization_RealizingClassifier()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='componentRealization'"
	 * @generated
	 */
	EList<Classifier> getRealizingClassifier();

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.structuredClassifiers.Component#getRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Component that owns this ComponentRealization and which is implemented by its realizing Classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstraction</em>' container reference.
	 * @see #setAbstraction(Component)
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getComponentRealization_Abstraction()
	 * @see uml.structuredClassifiers.Component#getRealization
	 * @model opposite="realization" transient="false" ordered="false"
	 * @generated
	 */
	Component getAbstraction();

	/**
	 * Sets the value of the '{@link uml.structuredClassifiers.ComponentRealization#getAbstraction <em>Abstraction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction</em>' container reference.
	 * @see #getAbstraction()
	 * @generated
	 */
	void setAbstraction(Component value);

} // ComponentRealization
