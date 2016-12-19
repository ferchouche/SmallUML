/**
 */
package uml.simpleClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BehavioredClassifier may have InterfaceRealizations, and owns a set of Behaviors one of which may specify the behavior of the BehavioredClassifier itself.
 * classifierBehavior->notEmpty() implies classifierBehavior.specification->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.BehavioredClassifier#getInterfaceRealization <em>Interface Realization</em>}</li>
 *   <li>{@link uml.simpleClassifiers.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link uml.simpleClassifiers.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}</li>
 * </ul>
 *
 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getBehavioredClassifier()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='class_behavior'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL class_behavior='classifierBehavior->notEmpty() implies classifierBehavior.specification->isEmpty()'"
 * @generated
 */
public interface BehavioredClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Interface Realization</b></em>' containment reference list.
	 * The list contents are of type {@link uml.simpleClassifiers.InterfaceRealization}.
	 * It is bidirectional and its opposite is '{@link uml.simpleClassifiers.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations reference the Interfaces of which the BehavioredClassifier is an implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Realization</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getBehavioredClassifier_InterfaceRealization()
	 * @see uml.simpleClassifiers.InterfaceRealization#getImplementingClassifier
	 * @model opposite="implementingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList<InterfaceRealization> getInterfaceRealization();

	/**
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior that specifies the behavior of the BehavioredClassifier itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' reference.
	 * @see #setClassifierBehavior(Behavior)
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getBehavioredClassifier_ClassifierBehavior()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavioredClassifier'"
	 * @generated
	 */
	Behavior getClassifierBehavior();

	/**
	 * Sets the value of the '{@link uml.simpleClassifiers.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Behavior</em>' reference.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	void setClassifierBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonBehavior.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Behaviors owned by a BehavioredClassifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getBehavioredClassifier_OwnedBehavior()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavioredClassifier'"
	 * @generated
	 */
	EList<Behavior> getOwnedBehavior();

} // BehavioredClassifier
