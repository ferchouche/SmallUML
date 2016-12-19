/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.classification.Property;

import uml.commonStructure.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link End Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LinkEndData is an Element that identifies on end of a link to be read or written by a LinkAction. As a link (that is not a link object) cannot be passed as a runtime value to or from an Action, it is instead identified by its end objects and qualifier values, if any. A LinkEndData instance provides these values for a single Association end.
 * value<>null implies value.type.conformsTo(end.type)
 * value<>null implies value.is(1,1)
 * value->excludesAll(qualifier.value)
 * end.association <> null
 * end.qualifier->includesAll(qualifier.qualifier)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.LinkEndData#getEnd <em>End</em>}</li>
 *   <li>{@link uml.actions.LinkEndData#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uml.actions.LinkEndData#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getLinkEndData()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='same_type multiplicity end_object_input_pin property_is_association_end qualifiers'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL same_type='value<>null implies value.type.conformsTo(end.type)' multiplicity='value<>null implies value.is(1,1)' end_object_input_pin='value->excludesAll(qualifier.value)' property_is_association_end='end.association <> null' qualifiers='end.qualifier->includesAll(qualifier.qualifier)'"
 * @generated
 */
public interface LinkEndData extends Element {
	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Association end for which this LinkEndData specifies values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Property)
	 * @see uml.actions.ActionsPackage#getLinkEndData_End()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='linkEndData'"
	 * @generated
	 */
	Property getEnd();

	/**
	 * Sets the value of the '{@link uml.actions.LinkEndData#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Property value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link uml.actions.QualifierValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of QualifierValues used to provide values for the qualifiers of the end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getLinkEndData_Qualifier()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='linkEndData'"
	 * @generated
	 */
	EList<QualifierValue> getQualifier();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin that provides the specified value for the given end. This InputPin is omitted if the LinkEndData specifies the \"open\" end for a ReadLinkAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(InputPin)
	 * @see uml.actions.ActionsPackage#getLinkEndData_Value()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='linkEndData'"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link uml.actions.LinkEndData#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all the InputPins referenced by this LinkEndData. By default this includes the value and qualifier InputPins, but subclasses may override the operation to add other InputPins.
	 * <!-- end-model-doc -->
	 * @model unique="false" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='value->asBag()->union(qualifier.value)'"
	 * @generated
	 */
	EList<InputPin> allPins();

} // LinkEndData
