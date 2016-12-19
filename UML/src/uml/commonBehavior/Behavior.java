/**
 */
package uml.commonBehavior;

import org.eclipse.emf.common.util.EList;

import uml.classification.BehavioralFeature;
import uml.classification.Parameter;
import uml.classification.ParameterSet;

import uml.commonStructure.Constraint;
import uml.commonStructure.Element;

import uml.simpleClassifiers.BehavioredClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Behavior is a specification of how its context BehavioredClassifier changes state over time. This specification may be either a definition of possible behavior execution or emergent behavior, or a selective illustration of an interesting subset of possible executions. The latter form is typically used for capturing examples, such as a trace of a particular execution.
 * specification <> null implies _'context'.ownedBehavior->select(specification=self.specification)->size() = 1
 * specification <> null implies ownedParameter->size() = specification.ownedParameter->size()
 * _'context'.feature->includes(specification)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonBehavior.Behavior#getSpecification <em>Specification</em>}</li>
 *   <li>{@link uml.commonBehavior.Behavior#getContext <em>Context</em>}</li>
 *   <li>{@link uml.commonBehavior.Behavior#isIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link uml.commonBehavior.Behavior#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.commonBehavior.Behavior#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link uml.commonBehavior.Behavior#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml.commonBehavior.Behavior#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml.commonBehavior.Behavior#getRedefinedBehavior <em>Redefined Behavior</em>}</li>
 * </ul>
 *
 * @see uml.commonBehavior.CommonBehaviorPackage#getBehavior()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='most_one_behavior parameters_match feature_of_context_classifier'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL most_one_behavior='specification <> null implies _\'context\'.ownedBehavior->select(specification=self.specification)->size() = 1' parameters_match='specification <> null implies ownedParameter->size() = specification.ownedParameter->size()' feature_of_context_classifier='_\'context\'.feature->includes(specification)'"
 * @generated
 */
public interface Behavior extends uml.structuredClassifiers.Class {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.classification.BehavioralFeature#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates a BehavioralFeature that the Behavior implements. The BehavioralFeature must be owned by the BehavioredClassifier that owns the Behavior or be inherited by it. The Parameters of the BehavioralFeature and the implementing Behavior must match. A Behavior does not need to have a specification, in which case it either is the classifierBehavior of a BehavioredClassifier or it can only be invoked by another Behavior of the Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see #setSpecification(BehavioralFeature)
	 * @see uml.commonBehavior.CommonBehaviorPackage#getBehavior_Specification()
	 * @see uml.classification.BehavioralFeature#getMethod
	 * @model opposite="method" ordered="false"
	 * @generated
	 */
	BehavioralFeature getSpecification();

	/**
	 * Sets the value of the '{@link uml.commonBehavior.Behavior#getSpecification <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(BehavioralFeature value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BehavioredClassifier that is the context for the execution of the Behavior. A Behavior that is directly owned as a nestedClassifier does not have a context. Otherwise, to determine the context of a Behavior, find the first BehavioredClassifier reached by following the chain of owner relationships from the Behavior, if any. If there is such a BehavioredClassifier, then it is the context, unless it is itself a Behavior with a non-empty context, in which case that is also the context for the original Behavior. For example, following this algorithm, the context of an entry Behavior in a StateMachine is the BehavioredClassifier that owns the StateMachine. The features of the context BehavioredClassifier as well as the Elements visible to the context Classifier are visible to the Behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see uml.commonBehavior.CommonBehaviorPackage#getBehavior_Context()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavior'"
	 * @generated
	 */
	BehavioredClassifier getContext();

	/**
	 * Returns the value of the '<em><b>Is Reentrant</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether the Behavior can be invoked while it is still executing from a previous invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Reentrant</em>' attribute.
	 * @see #setIsReentrant(boolean)
	 * @see uml.commonBehavior.CommonBehaviorPackage#getBehavior_IsReentrant()
	 * @model default="true" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsReentrant();

	/**
	 * Sets the value of the '{@link uml.commonBehavior.Behavior#isIsReentrant <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reentrant</em>' attribute.
	 * @see #isIsReentrant()
	 * @generated
	 */
	void setIsReentrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a list of Parameters to the Behavior which describes the order and type of arguments that can be given when the Behavior is invoked and of the values which will be returned when the Behavior completes its execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see uml.commonBehavior.CommonBehaviorPackage#getBehavior_OwnedParameter()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavior'"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.ParameterSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterSets owned by this Behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter Set</em>' containment reference list.
	 * @see uml.commonBehavior.CommonBehaviorPackage#getBehavior_OwnedParameterSet()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavior'"
	 * @generated
	 */
	EList<ParameterSet> getOwnedParameterSet();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints specifying what is fulfilled after the execution of the Behavior is completed, if its precondition was fulfilled before its invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference list.
	 * @see uml.commonBehavior.CommonBehaviorPackage#getBehavior_Postcondition()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavior'"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints specifying what must be fulfilled before the Behavior is invoked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see uml.commonBehavior.CommonBehaviorPackage#getBehavior_Precondition()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavior'"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Redefined Behavior</b></em>' reference list.
	 * The list contents are of type {@link uml.commonBehavior.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Behavior that this Behavior redefines. A subtype of Behavior may redefine any other subtype of Behavior. If the Behavior implements a BehavioralFeature, it replaces the redefined Behavior. If the Behavior is a classifierBehavior, it extends the redefined Behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Behavior</em>' reference list.
	 * @see uml.commonBehavior.CommonBehaviorPackage#getBehavior_RedefinedBehavior()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavior'"
	 * @generated
	 */
	EList<Behavior> getRedefinedBehavior();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior that is directly owned as a nestedClassifier does not have a context. Otherwise, to determine the context of a Behavior, find the first BehavioredClassifier reached by following the chain of owner relationships from the Behavior, if any. If there is such a BehavioredClassifier, then it is the context, unless it is itself a Behavior with a non-empty context, in which case that is also the context for the original Behavior. 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if nestingClass <> null then\r\n    null\r\nelse\r\n    let b:BehavioredClassifier = self.behavioredClassifier(self.owner) in\r\n    if b.oclIsKindOf(Behavior) and b.oclAsType(Behavior)._\'context\' <> null then \r\n        b.oclAsType(Behavior)._\'context\'\r\n    else \r\n        b \r\n    endif\r\nendif'"
	 * @generated
	 */
	BehavioredClassifier context();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first BehavioredClassifier reached by following the chain of owner relationships from the Behavior, if any.
	 * <!-- end-model-doc -->
	 * @model ordered="false" fromRequired="true" fromOrdered="false"
	 * @generated
	 */
	BehavioredClassifier behavioredClassifier(Element from);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The in and inout ownedParameters of the Behavior.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedParameter->select(direction=ParameterDirectionKind::_\'in\' or direction=ParameterDirectionKind::inout)'"
	 * @generated
	 */
	EList<Parameter> inputParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The out, inout and return ownedParameters.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedParameter->select(direction=ParameterDirectionKind::out or direction=ParameterDirectionKind::inout or direction=ParameterDirectionKind::return)'"
	 * @generated
	 */
	EList<Parameter> outputParameters();

} // Behavior
