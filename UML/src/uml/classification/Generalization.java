/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.DirectedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Generalization is a taxonomic relationship between a more general Classifier and a more specific Classifier. Each instance of the specific Classifier is also an instance of the general Classifier. The specific Classifier inherits the features of the more general Classifier. A Generalization is owned by the specific Classifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.classification.Generalization#getGeneralizationSet <em>Generalization Set</em>}</li>
 *   <li>{@link uml.classification.Generalization#isIsSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link uml.classification.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general classifier in the Generalization relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Classifier)
	 * @see uml.classification.ClassificationPackage#getGeneralization_General()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='generalization'"
	 * @generated
	 */
	Classifier getGeneral();

	/**
	 * Sets the value of the '{@link uml.classification.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Classifier value);

	/**
	 * Returns the value of the '<em><b>Generalization Set</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link uml.classification.GeneralizationSet#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a set of instances of Generalization.  A Generalization may appear in many GeneralizationSets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization Set</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getGeneralization_GeneralizationSet()
	 * @see uml.classification.GeneralizationSet#getGeneralization
	 * @model opposite="generalization" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getGeneralizationSet();

	/**
	 * Returns the value of the '<em><b>Is Substitutable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the specific Classifier can be used wherever the general Classifier can be used. If true, the execution traces of the specific Classifier shall be a superset of the execution traces of the general Classifier. If false, there is no such constraint on execution traces. If unset, the modeler has not stated whether there is such a constraint or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Substitutable</em>' attribute.
	 * @see #setIsSubstitutable(boolean)
	 * @see uml.classification.ClassificationPackage#getGeneralization_IsSubstitutable()
	 * @model default="true" dataType="types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isIsSubstitutable();

	/**
	 * Sets the value of the '{@link uml.classification.Generalization#isIsSubstitutable <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Substitutable</em>' attribute.
	 * @see #isIsSubstitutable()
	 * @generated
	 */
	void setIsSubstitutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.classification.Classifier#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specializing Classifier in the Generalization relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific</em>' container reference.
	 * @see #setSpecific(Classifier)
	 * @see uml.classification.ClassificationPackage#getGeneralization_Specific()
	 * @see uml.classification.Classifier#getGeneralization
	 * @model opposite="generalization" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getSpecific();

	/**
	 * Sets the value of the '{@link uml.classification.Generalization#getSpecific <em>Specific</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' container reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Classifier value);

} // Generalization
