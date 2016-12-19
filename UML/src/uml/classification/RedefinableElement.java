/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefinable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RedefinableElement is an element that, when defined in the context of a Classifier, can be redefined more specifically or differently in the context of another Classifier that specializes (directly or indirectly) the context Classifier.
 * redefinedElement->forAll(re | re.isConsistentWith(self))
 * redefinedElement->forAll(re | not re.isLeaf)
 * redefinedElement->forAll(re | self.isRedefinitionContextValid(re))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.RedefinableElement#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.classification.RedefinableElement#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.classification.RedefinableElement#getRedefinitionContext <em>Redefinition Context</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getRedefinableElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='redefinition_consistent non_leaf_redefinition redefinition_context_valid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL redefinition_consistent='redefinedElement->forAll(re | re.isConsistentWith(self))' non_leaf_redefinition='redefinedElement->forAll(re | not re.isLeaf)' redefinition_context_valid='redefinedElement->forAll(re | self.isRedefinitionContextValid(re))'"
 * @generated
 */
public interface RedefinableElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether it is possible to further redefine a RedefinableElement. If the value is true, then it is not possible to further redefine the RedefinableElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Leaf</em>' attribute.
	 * @see #setIsLeaf(boolean)
	 * @see uml.classification.ClassificationPackage#getRedefinableElement_IsLeaf()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsLeaf();

	/**
	 * Sets the value of the '{@link uml.classification.RedefinableElement#isIsLeaf <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Leaf</em>' attribute.
	 * @see #isIsLeaf()
	 * @generated
	 */
	void setIsLeaf(boolean value);

	/**
	 * Returns the value of the '<em><b>Redefined Element</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.RedefinableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RedefinableElement that is being redefined by this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Element</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getRedefinableElement_RedefinedElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='redefinableElement'"
	 * @generated
	 */
	EList<RedefinableElement> getRedefinedElement();

	/**
	 * Returns the value of the '<em><b>Redefinition Context</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contexts that this element may be redefined from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefinition Context</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getRedefinableElement_RedefinitionContext()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='redefinableElement'"
	 * @generated
	 */
	EList<Classifier> getRedefinitionContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two RedefinableElements in a context in which redefinition is possible, whether redefinition would be logically consistent. By default, this is false; this operation must be overridden for subclasses of RedefinableElement to define the consistency conditions.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" redefiningElementRequired="true" redefiningElementOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='false'"
	 * @generated
	 */
	boolean isConsistentWith(RedefinableElement redefiningElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of this RedefinableElement are properly related to the redefinition contexts of the specified RedefinableElement to allow this element to redefine the other. By default at least one of the redefinition contexts of this element must be a specialization of at least one of the redefinition contexts of the specified element.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" redefinedElementRequired="true" redefinedElementOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='redefinitionContext->exists(c | c.allParents()->includesAll(redefinedElement.redefinitionContext))'"
	 * @generated
	 */
	boolean isRedefinitionContextValid(RedefinableElement redefinedElement);

} // RedefinableElement
