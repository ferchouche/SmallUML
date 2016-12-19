/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Element is a constituent of a model. As such, it has the capability of owning other Elements.
 * mustBeOwned() implies owner->notEmpty()
 * not allOwnedElements()->includes(self)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.Element#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link uml.commonStructure.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link uml.commonStructure.Element#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='has_owner not_own_self'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL has_owner='mustBeOwned() implies owner->notEmpty()' not_own_self='not allOwnedElements()->includes(self)'"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Comments owned by this Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getElement_OwnedComment()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningElement'"
	 * @generated
	 */
	EList<Comment> getOwnedComment();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Element}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Elements owned by this Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getElement_OwnedElement()
	 * @see uml.commonStructure.Element#getOwner
	 * @model opposite="owner" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Element that owns this Element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see uml.commonStructure.CommonStructurePackage#getElement_Owner()
	 * @see uml.commonStructure.Element#getOwnedElement
	 * @model opposite="ownedElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Element getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwnedElements() gives all of the direct and indirect ownedElements of an Element.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))->asSet()'"
	 * @generated
	 */
	EList<Element> allOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether Elements of this type must have an owner. Subclasses of Element that do not require an owner must override this operation.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='true'"
	 * @generated
	 */
	boolean mustBeOwned();

} // Element
