/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonBehavior.Behavior;

import uml.commonStructure.Namespace;
import uml.commonStructure.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BehavioralFeature is a feature of a Classifier that specifies an aspect of the behavior of its instances.  A BehavioralFeature is implemented (realized) by a Behavior. A BehavioralFeature specifies that a Classifier will respond to a designated request by invoking its implementing method.
 * isAbstract implies method->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.BehavioralFeature#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link uml.classification.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.classification.BehavioralFeature#getMethod <em>Method</em>}</li>
 *   <li>{@link uml.classification.BehavioralFeature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.classification.BehavioralFeature#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link uml.classification.BehavioralFeature#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getBehavioralFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='abstract_no_method'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL abstract_no_method='isAbstract implies method->isEmpty()'"
 * @generated
 */
public interface BehavioralFeature extends Namespace, Feature {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
	 * The default value is <code>"sequential"</code>.
	 * The literals are from the enumeration {@link uml.classification.CallConcurrencyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the semantics of concurrent calls to the same passive instance (i.e., an instance originating from a Class with isActive being false). Active instances control access to their own BehavioralFeatures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concurrency</em>' attribute.
	 * @see uml.classification.CallConcurrencyKind
	 * @see #setConcurrency(CallConcurrencyKind)
	 * @see uml.classification.ClassificationPackage#getBehavioralFeature_Concurrency()
	 * @model default="sequential" required="true" ordered="false"
	 * @generated
	 */
	CallConcurrencyKind getConcurrency();

	/**
	 * Sets the value of the '{@link uml.classification.BehavioralFeature#getConcurrency <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' attribute.
	 * @see uml.classification.CallConcurrencyKind
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(CallConcurrencyKind value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, then the BehavioralFeature does not have an implementation, and one must be supplied by a more specific Classifier. If false, the BehavioralFeature must have an implementation in the Classifier or one must be inherited.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see uml.classification.ClassificationPackage#getBehavioralFeature_IsAbstract()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link uml.classification.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference list.
	 * The list contents are of type {@link uml.commonBehavior.Behavior}.
	 * It is bidirectional and its opposite is '{@link uml.commonBehavior.Behavior#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Behavior that implements the BehavioralFeature. There may be at most one Behavior for a particular pairing of a Classifier (as owner of the Behavior) and a BehavioralFeature (as specification of the Behavior).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getBehavioralFeature_Method()
	 * @see uml.commonBehavior.Behavior#getSpecification
	 * @model opposite="specification" ordered="false"
	 * @generated
	 */
	EList<Behavior> getMethod();

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of formal Parameters of this BehavioralFeature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getBehavioralFeature_OwnedParameter()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ownerFormalParam'"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.ParameterSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterSets owned by this BehavioralFeature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Parameter Set</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getBehavioralFeature_OwnedParameterSet()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavioralFeature'"
	 * @generated
	 */
	EList<ParameterSet> getOwnedParameterSet();

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Types representing exceptions that may be raised during an invocation of this BehavioralFeature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raised Exception</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getBehavioralFeature_RaisedException()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='behavioralFeature'"
	 * @generated
	 */
	EList<Type> getRaisedException();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ownedParameters with direction in and inout.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedParameter->select(direction=ParameterDirectionKind::_\'in\' or direction=ParameterDirectionKind::inout)'"
	 * @generated
	 */
	EList<Parameter> inputParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ownedParameters with direction out, inout, or return.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedParameter->select(direction=ParameterDirectionKind::out or direction=ParameterDirectionKind::inout or direction=ParameterDirectionKind::return)'"
	 * @generated
	 */
	EList<Parameter> outputParameters();

} // BehavioralFeature
