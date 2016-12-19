/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ConnectableElement is an abstract metaclass representing a set of instances that play roles of a StructuredClassifier. ConnectableElements may be joined by attached Connectors and specify configurations of linked instances to be created within an instance of the containing StructuredClassifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.ConnectableElement#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement extends TypedElement, ParameterableElement {
	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.ConnectorEnd}.
	 * It is bidirectional and its opposite is '{@link uml.structuredClassifiers.ConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of ConnectorEnds that attach to this ConnectableElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getConnectableElement_End()
	 * @see uml.structuredClassifiers.ConnectorEnd#getRole
	 * @model opposite="role" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for ConnectableElement::/end : ConnectorEnd
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ConnectorEnd.allInstances()->select(role = self)'"
	 * @generated
	 */
	EList<ConnectorEnd> end();

} // ConnectableElement
