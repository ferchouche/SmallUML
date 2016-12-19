/**
 */
package uml.commonStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TemplateParameter exposes a ParameterableElement as a formal parameter of a template.
 * default <> null implies default.isCompatibleWith(parameteredElement)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.TemplateParameter#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateParameter#getOwnedDefault <em>Owned Default</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateParameter#getParameteredElement <em>Parametered Element</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateParameter#getSignature <em>Signature</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='must_be_compatible'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL must_be_compatible='default <> null implies default.isCompatibleWith(parameteredElement)'"
 * @generated
 */
public interface TemplateParameter extends Element {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is the default for this formal TemplateParameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(ParameterableElement)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameter_Default()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='templateParameter'"
	 * @generated
	 */
	ParameterableElement getDefault();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateParameter#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is owned by this TemplateParameter for the purpose of providing a default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Default</em>' containment reference.
	 * @see #setOwnedDefault(ParameterableElement)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameter_OwnedDefault()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='templateParameter'"
	 * @generated
	 */
	ParameterableElement getOwnedDefault();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateParameter#getOwnedDefault <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default</em>' containment reference.
	 * @see #getOwnedDefault()
	 * @generated
	 */
	void setOwnedDefault(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Parametered Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement exposed by this TemplateParameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parametered Element</em>' reference.
	 * @see #setParameteredElement(ParameterableElement)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameter_ParameteredElement()
	 * @see uml.commonStructure.ParameterableElement#getTemplateParameter
	 * @model opposite="templateParameter" required="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getParameteredElement();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateParameter#getParameteredElement <em>Parametered Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametered Element</em>' reference.
	 * @see #getParameteredElement()
	 * @generated
	 */
	void setParameteredElement(ParameterableElement value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateSignature that owns this TemplateParameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' container reference.
	 * @see #setSignature(TemplateSignature)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameter_Signature()
	 * @see uml.commonStructure.TemplateSignature#getOwnedParameter
	 * @model opposite="ownedParameter" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TemplateSignature getSignature();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateParameter#getSignature <em>Signature</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' container reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(TemplateSignature value);

	/**
	 * Returns the value of the '<em><b>Owned Parametered Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterableElement that is owned by this TemplateParameter for the purpose of exposing it as the parameteredElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #setOwnedParameteredElement(ParameterableElement)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateParameter_OwnedParameteredElement()
	 * @see uml.commonStructure.ParameterableElement#getOwningTemplateParameter
	 * @model opposite="owningTemplateParameter" containment="true" ordered="false"
	 * @generated
	 */
	ParameterableElement getOwnedParameteredElement();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Parametered Element</em>' containment reference.
	 * @see #getOwnedParameteredElement()
	 * @generated
	 */
	void setOwnedParameteredElement(ParameterableElement value);

} // TemplateParameter
