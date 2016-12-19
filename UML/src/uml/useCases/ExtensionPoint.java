/**
 */
package uml.useCases;

import uml.classification.RedefinableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExtensionPoint identifies a point in the behavior of a UseCase where that behavior can be extended by the behavior of some other (extending) UseCase, as specified by an Extend relationship.
 * name->notEmpty ()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.useCases.ExtensionPoint#getUseCase <em>Use Case</em>}</li>
 * </ul>
 *
 * @see uml.useCases.UseCasesPackage#getExtensionPoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='must_have_name'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL must_have_name='name->notEmpty ()'"
 * @generated
 */
public interface ExtensionPoint extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.useCases.UseCase#getExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase that owns this ExtensionPoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case</em>' container reference.
	 * @see #setUseCase(UseCase)
	 * @see uml.useCases.UseCasesPackage#getExtensionPoint_UseCase()
	 * @see uml.useCases.UseCase#getExtensionPoint
	 * @model opposite="extensionPoint" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCase getUseCase();

	/**
	 * Sets the value of the '{@link uml.useCases.ExtensionPoint#getUseCase <em>Use Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' container reference.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(UseCase value);

} // ExtensionPoint
