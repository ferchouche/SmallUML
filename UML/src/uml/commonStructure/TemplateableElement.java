/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TemplateableElement is an Element that can optionally be defined as a template and bound to other templates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.TemplateableElement#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.commonStructure.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getTemplateableElement()
 * @model abstract="true"
 * @generated
 */
public interface TemplateableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.TemplateBinding}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional TemplateBindings from this TemplateableElement to one or more templates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Binding</em>' containment reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateableElement_TemplateBinding()
	 * @see uml.commonStructure.TemplateBinding#getBoundElement
	 * @model opposite="boundElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateBinding> getTemplateBinding();

	/**
	 * Returns the value of the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.TemplateSignature#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional TemplateSignature specifying the formal TemplateParameters for this TemplateableElement. If a TemplateableElement has a TemplateSignature, then it is a template.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #setOwnedTemplateSignature(TemplateSignature)
	 * @see uml.commonStructure.CommonStructurePackage#getTemplateableElement_OwnedTemplateSignature()
	 * @see uml.commonStructure.TemplateSignature#getTemplate
	 * @model opposite="template" containment="true" ordered="false"
	 * @generated
	 */
	TemplateSignature getOwnedTemplateSignature();

	/**
	 * Sets the value of the '{@link uml.commonStructure.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 */
	void setOwnedTemplateSignature(TemplateSignature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this TemplateableElement is actually a template.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedTemplateSignature <> null'"
	 * @generated
	 */
	boolean isTemplate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parameterableElements() returns the set of ParameterableElements that may be used as the parameteredElements for a TemplateParameter of this TemplateableElement. By default, this set includes all the ownedElements. Subclasses may override this operation if they choose to restrict the set of ParameterableElements.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.allOwnedElements()->select(oclIsKindOf(ParameterableElement)).oclAsType(ParameterableElement)->asSet()'"
	 * @generated
	 */
	EList<ParameterableElement> parameterableElements();

} // TemplateableElement
