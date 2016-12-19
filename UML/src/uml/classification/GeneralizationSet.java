/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GeneralizationSet is a PackageableElement whose instances represent sets of Generalization relationships.
 * generalization->collect(general)->asSet()->size() <= 1
 * powertype <> null implies generalization->forAll( gen | 
 *     not (gen.general = powertype) and not gen.general.allParents()->includes(powertype) and not (gen.specific = powertype) and not powertype.allParents()->includes(gen.specific)
 *   )
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.GeneralizationSet#isIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link uml.classification.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link uml.classification.GeneralizationSet#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link uml.classification.GeneralizationSet#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getGeneralizationSet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='generalization_same_classifier maps_to_generalization_set'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL generalization_same_classifier='generalization->collect(general)->asSet()->size() <= 1' maps_to_generalization_set='powertype <> null implies generalization->forAll( gen | \r\n    not (gen.general = powertype) and not gen.general.allParents()->includes(powertype) and not (gen.specific = powertype) and not powertype.allParents()->includes(gen.specific)\r\n  )'"
 * @generated
 */
public interface GeneralizationSet extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Is Covering</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates (via the associated Generalizations) whether or not the set of specific Classifiers are covering for a particular general classifier. When isCovering is true, every instance of a particular general Classifier is also an instance of at least one of its specific Classifiers for the GeneralizationSet. When isCovering is false, there are one or more instances of the particular general Classifier that are not instances of at least one of its specific Classifiers defined for the GeneralizationSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Covering</em>' attribute.
	 * @see #setIsCovering(boolean)
	 * @see uml.classification.ClassificationPackage#getGeneralizationSet_IsCovering()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsCovering();

	/**
	 * Sets the value of the '{@link uml.classification.GeneralizationSet#isIsCovering <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Covering</em>' attribute.
	 * @see #isIsCovering()
	 * @generated
	 */
	void setIsCovering(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Disjoint</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the set of specific Classifiers in a Generalization relationship have instance in common. If isDisjoint is true, the specific Classifiers for a particular GeneralizationSet have no members in common; that is, their intersection is empty. If isDisjoint is false, the specific Classifiers in a particular GeneralizationSet have one or more members in common; that is, their intersection is not empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Disjoint</em>' attribute.
	 * @see #setIsDisjoint(boolean)
	 * @see uml.classification.ClassificationPackage#getGeneralizationSet_IsDisjoint()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDisjoint();

	/**
	 * Sets the value of the '{@link uml.classification.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Disjoint</em>' attribute.
	 * @see #isIsDisjoint()
	 * @generated
	 */
	void setIsDisjoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Powertype</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.classification.Classifier#getPowertypeExtent <em>Powertype Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the Classifier that is defined as the power type for the associated GeneralizationSet, if there is one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Powertype</em>' reference.
	 * @see #setPowertype(Classifier)
	 * @see uml.classification.ClassificationPackage#getGeneralizationSet_Powertype()
	 * @see uml.classification.Classifier#getPowertypeExtent
	 * @model opposite="powertypeExtent" ordered="false"
	 * @generated
	 */
	Classifier getPowertype();

	/**
	 * Sets the value of the '{@link uml.classification.GeneralizationSet#getPowertype <em>Powertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Powertype</em>' reference.
	 * @see #getPowertype()
	 * @generated
	 */
	void setPowertype(Classifier value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Generalization}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Generalization#getGeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the instances of Generalization that are members of this GeneralizationSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getGeneralizationSet_Generalization()
	 * @see uml.classification.Generalization#getGeneralizationSet
	 * @model opposite="generalizationSet" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

} // GeneralizationSet
