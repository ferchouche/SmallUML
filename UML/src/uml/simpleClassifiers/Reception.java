/**
 */
package uml.simpleClassifiers;

import uml.classification.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Reception is a declaration stating that a Classifier is prepared to react to the receipt of a Signal.
 * name = signal.name
 * signal.ownedAttribute->size() = ownedParameter->size() and
 * Sequence{1..signal.ownedAttribute->size()}->forAll( i | 
 *     ownedParameter->at(i).direction = ParameterDirectionKind::_'in' and 
 *     ownedParameter->at(i).name = signal.ownedAttribute->at(i).name and
 *     ownedParameter->at(i).type = signal.ownedAttribute->at(i).type and
 *     ownedParameter->at(i).lowerBound() = signal.ownedAttribute->at(i).lowerBound() and
 *     ownedParameter->at(i).upperBound() = signal.ownedAttribute->at(i).upperBound()
 * )
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.Reception#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getReception()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='same_name_as_signal same_structure_as_signal'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL same_name_as_signal='name = signal.name' same_structure_as_signal='signal.ownedAttribute->size() = ownedParameter->size() and\r\nSequence{1..signal.ownedAttribute->size()}->forAll( i | \r\n    ownedParameter->at(i).direction = ParameterDirectionKind::_\'in\' and \r\n    ownedParameter->at(i).name = signal.ownedAttribute->at(i).name and\r\n    ownedParameter->at(i).type = signal.ownedAttribute->at(i).type and\r\n    ownedParameter->at(i).lowerBound() = signal.ownedAttribute->at(i).lowerBound() and\r\n    ownedParameter->at(i).upperBound() = signal.ownedAttribute->at(i).upperBound()\r\n)'"
 * @generated
 */
public interface Reception extends BehavioralFeature {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Signal that this Reception handles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal</em>' reference.
	 * @see #setSignal(Signal)
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getReception_Signal()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='reception'"
	 * @generated
	 */
	Signal getSignal();

	/**
	 * Sets the value of the '{@link uml.simpleClassifiers.Reception#getSignal <em>Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal</em>' reference.
	 * @see #getSignal()
	 * @generated
	 */
	void setSignal(Signal value);

} // Reception
