/**
 */
package uml.simpleClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;
import uml.classification.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Signal is a specification of a kind of communication between objects in which a reaction is asynchronously triggered in the receiver without a reply.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.Signal#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 *
 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes owned by the Signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getSignal_OwnedAttribute()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningSignal'"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

} // Signal
