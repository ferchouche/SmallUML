/**
 */
package uml.commonStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ParameterableElement is an Element that can be exposed as a formal TemplateParameter for a template, or specified as an actual parameter in a binding of a template.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.commonStructure.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getParameterableElement()
 * @model abstract="true"
 * @generated
 */
public interface ParameterableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateParameter#getOwnedParameteredElement <em>Owned Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal TemplateParameter that owns this ParameterableElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Template Parameter</em>' container reference.
	 * @see #setOwningTemplateParameter(TemplateParameter)
	 * @see uml.commonStructure.CommonStructurePackage#getParameterableElement_OwningTemplateParameter()
	 * @see uml.commonStructure.TemplateParameter#getOwnedParameteredElement
	 * @model opposite="ownedParameteredElement" transient="false" ordered="false"
	 * @generated
	 */
	TemplateParameter getOwningTemplateParameter();

	/**
	 * Sets the value of the '{@link uml.commonStructure.ParameterableElement#getOwningTemplateParameter <em>Owning Template Parameter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Template Parameter</em>' container reference.
	 * @see #getOwningTemplateParameter()
	 * @generated
	 */
	void setOwningTemplateParameter(TemplateParameter value);

	/**
	 * Returns the value of the '<em><b>Template Parameter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TemplateParameter that exposes this ParameterableElement as a formal parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Parameter</em>' reference.
	 * @see #setTemplateParameter(TemplateParameter)
	 * @see uml.commonStructure.CommonStructurePackage#getParameterableElement_TemplateParameter()
	 * @see uml.commonStructure.TemplateParameter#getParameteredElement
	 * @model opposite="parameteredElement" ordered="false"
	 * @generated
	 */
	TemplateParameter getTemplateParameter();

	/**
	 * Sets the value of the '{@link uml.commonStructure.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Parameter</em>' reference.
	 * @see #getTemplateParameter()
	 * @generated
	 */
	void setTemplateParameter(TemplateParameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isCompatibleWith() determines if this ParameterableElement is compatible with the specified ParameterableElement. By default, this ParameterableElement is compatible with another ParameterableElement p if the kind of this ParameterableElement is the same as or a subtype of the kind of p. Subclasses of ParameterableElement should override this operation to specify different compatibility constraints.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" pRequired="true" pOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.oclIsKindOf(p.oclType())'"
	 * @generated
	 */
	boolean isCompatibleWith(ParameterableElement p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplateParameter() determines if this ParameterableElement is exposed as a formal TemplateParameter.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='templateParameter->notEmpty()'"
	 * @generated
	 */
	boolean isTemplateParameter();

} // ParameterableElement
