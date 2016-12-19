/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.TemplateParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ClassifierTemplateParameter exposes a Classifier as a formal template parameter.
 * allowSubstitutable implies constrainingClassifier->notEmpty()
 * parameteredElement.feature->isEmpty() and (constrainingClassifier->isEmpty() implies  parameteredElement.allParents()->isEmpty())
 * (not parameteredElement.isAbstract) implies templateParameterSubstitution.actual->forAll(a | not a.oclAsType(Classifier).isAbstract)
 *  templateParameterSubstitution.actual->forAll(a | a.oclIsKindOf(Classifier))
 * templateParameterSubstitution.actual->forAll( a |
 *   let arg : Classifier = a.oclAsType(Classifier) in
 *     constrainingClassifier->forAll(
 *       cc |  
 *          arg = cc or arg.conformsTo(cc) or (allowSubstitutable and arg.isSubstitutableFor(cc))
 *       )
 * )
 * constrainingClassifier->forAll(
 *      cc |  parameteredElement = cc or parameteredElement.conformsTo(cc) or (allowSubstitutable and parameteredElement.isSubstitutableFor(cc))
 * )
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.ClassifierTemplateParameter#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 *   <li>{@link uml.classification.ClassifierTemplateParameter#getConstrainingClassifier <em>Constraining Classifier</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getClassifierTemplateParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='has_constraining_classifier parametered_element_no_features matching_abstract actual_is_classifier constraining_classifiers_constrain_args constraining_classifiers_constrain_parametered_element'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL has_constraining_classifier='allowSubstitutable implies constrainingClassifier->notEmpty()' parametered_element_no_features='parameteredElement.feature->isEmpty() and (constrainingClassifier->isEmpty() implies  parameteredElement.allParents()->isEmpty())' matching_abstract='(not parameteredElement.isAbstract) implies templateParameterSubstitution.actual->forAll(a | not a.oclAsType(Classifier).isAbstract)' actual_is_classifier=' templateParameterSubstitution.actual->forAll(a | a.oclIsKindOf(Classifier))' constraining_classifiers_constrain_args='templateParameterSubstitution.actual->forAll( a |\r\n  let arg : Classifier = a.oclAsType(Classifier) in\r\n    constrainingClassifier->forAll(\r\n      cc |  \r\n         arg = cc or arg.conformsTo(cc) or (allowSubstitutable and arg.isSubstitutableFor(cc))\r\n      )\r\n)' constraining_classifiers_constrain_parametered_element='constrainingClassifier->forAll(\r\n     cc |  parameteredElement = cc or parameteredElement.conformsTo(cc) or (allowSubstitutable and parameteredElement.isSubstitutableFor(cc))\r\n)\r\n'"
 * @generated
 */
public interface ClassifierTemplateParameter extends TemplateParameter {
	/**
	 * Returns the value of the '<em><b>Allow Substitutable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constrains the required relationship between an actual parameter and the parameteredElement for this formal parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #setAllowSubstitutable(boolean)
	 * @see uml.classification.ClassificationPackage#getClassifierTemplateParameter_AllowSubstitutable()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAllowSubstitutable();

	/**
	 * Sets the value of the '{@link uml.classification.ClassifierTemplateParameter#isAllowSubstitutable <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #isAllowSubstitutable()
	 * @generated
	 */
	void setAllowSubstitutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Constraining Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifiers that constrain the argument that can be used for the parameter. If the allowSubstitutable attribute is true, then any Classifier that is compatible with this constraining Classifier can be substituted; otherwise, it must be either this Classifier or one of its specializations. If this property is empty, there are no constraints on the Classifier that can be used as an argument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraining Classifier</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getClassifierTemplateParameter_ConstrainingClassifier()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='classifierTemplateParameter'"
	 * @generated
	 */
	EList<Classifier> getConstrainingClassifier();

} // ClassifierTemplateParameter
