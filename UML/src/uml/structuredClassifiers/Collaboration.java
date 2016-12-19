/**
 */
package uml.structuredClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.simpleClassifiers.BehavioredClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Collaboration describes a structure of collaborating elements (roles), each performing a specialized function, which collectively accomplish some desired functionality. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.Collaboration#getCollaborationRole <em>Collaboration Role</em>}</li>
 * </ul>
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getCollaboration()
 * @model
 * @generated
 */
public interface Collaboration extends StructuredClassifier, BehavioredClassifier {
	/**
	 * Returns the value of the '<em><b>Collaboration Role</b></em>' reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.ConnectableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents the participants in the Collaboration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collaboration Role</em>' reference list.
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getCollaboration_CollaborationRole()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='collaboration'"
	 * @generated
	 */
	EList<ConnectableElement> getCollaborationRole();

} // Collaboration
