/**
 */
package uml.commonStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TemplateParameterSubstitution relates the actual parameter to a formal TemplateParameter as part of a template binding.
 * actual->forAll(a | a.isCompatibleWith(formal.parameteredElement))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.TemplateParameterSubstitution#getActual <em>Actual</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateParameterSubstitution#getFormal <em>Formal</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameterSubstitution()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='must_be_compatible'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL must_be_compatible='actual->forAll(a | a.isCompatibleWith(formal.parameteredElement))'"
 * @generated
 */
public interface TemplateParameterSubstitution extends Element {
	/**
	 * Returns the value of the '<em><b>Actual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is the actual parameter for this TemplateParameterSubstitution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual</em>' reference.
	 * @see #setActual(ParameterableElement)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameterSubstitution_Actual()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='templateParameterSubstitution'"
	 * @generated
	 */
	ParameterableElement getActual();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateParameterSubstitution#getActual <em>Actual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Formal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal TemplateParameter that is associated with this TemplateParameterSubstitution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formal</em>' reference.
	 * @see #setFormal(TemplateParameter)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameterSubstitution_Formal()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='templateParameterSubstitution'"
	 * @generated
	 */
	TemplateParameter getFormal();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateParameterSubstitution#getFormal <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal</em>' reference.
	 * @see #getFormal()
	 * @generated
	 */
	void setFormal(TemplateParameter value);

	/**
	 * Returns the value of the '<em><b>Owned Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is owned by this TemplateParameterSubstitution as its actual parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Actual</em>' containment reference.
	 * @see #setOwnedActual(ParameterableElement)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameterSubstitution_OwnedActual()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningTemplateParameterSubstitution'"
	 * @generated
	 */
	ParameterableElement getOwnedActual();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateParameterSubstitution#getOwnedActual <em>Owned Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Actual</em>' containment reference.
	 * @see #getOwnedActual()
	 * @generated
	 */
	void setOwnedActual(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateBinding that owns this TemplateParameterSubstitution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Binding</em>' container reference.
	 * @see #setTemplateBinding(TemplateBinding)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameterSubstitution_TemplateBinding()
	 * @see uml.commonStructure.TemplateBinding#getParameterSubstitution
	 * @model opposite="parameterSubstitution" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateBinding getTemplateBinding();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Binding</em>' container reference.
	 * @see #getTemplateBinding()
	 * @generated
	 */
	void setTemplateBinding(TemplateBinding value);

} // TemplateParameterSubstitution
