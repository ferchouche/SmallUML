/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.TemplateParameter;
import uml.commonStructure.TemplateSignature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RedefinableTemplateSignature supports the addition of formal template parameters in a specialization of a template classifier.
 * classifier.allParents()->forAll(c | c.ownedTemplateSignature->notEmpty() implies self->closure(extendedSignature)->includes(c.ownedTemplateSignature))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.RedefinableTemplateSignature#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link uml.classification.RedefinableTemplateSignature#getExtendedSignature <em>Extended Signature</em>}</li>
 *   <li>{@link uml.classification.RedefinableTemplateSignature#getInheritedParameter <em>Inherited Parameter</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getRedefinableTemplateSignature()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='redefines_parents'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL redefines_parents='classifier.allParents()->forAll(c | c.ownedTemplateSignature->notEmpty() implies self->closure(extendedSignature)->includes(c.ownedTemplateSignature))'"
 * @generated
 */
public interface RedefinableTemplateSignature extends RedefinableElement, TemplateSignature {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that owns this RedefinableTemplateSignature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see uml.classification.ClassificationPackage#getRedefinableTemplateSignature_Classifier()
	 * @model required="true" transient="true" changeable="false" volatile="true" ordered="false"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * Returns the value of the '<em><b>Extended Signature</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.RedefinableTemplateSignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signatures extended by this RedefinableTemplateSignature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Signature</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getRedefinableTemplateSignature_ExtendedSignature()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='redefinableTemplateSignature'"
	 * @generated
	 */
	EList<RedefinableTemplateSignature> getExtendedSignature();

	/**
	 * Returns the value of the '<em><b>Inherited Parameter</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal template parameters of the extended signatures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Parameter</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getRedefinableTemplateSignature_InheritedParameter()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='redefinableTemplateSignature'"
	 * @generated
	 */
	EList<TemplateParameter> getInheritedParameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for RedefinableTemplateSignature::/inheritedParameter
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if extendedSignature->isEmpty() then Set{} else extendedSignature.parameter->asSet() endif'"
	 * @generated
	 */
	EList<TemplateParameter> inheritedParameter();

} // RedefinableTemplateSignature
