/**
 */
package uml.actions;

import uml.classification.Property;

import uml.commonStructure.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifier Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A QualifierValue is an Element that is used as part of LinkEndData to provide the value for a single qualifier of the end given by the LinkEndData.
 * value.is(1,1)
 * value.type.conformsTo(qualifier.type)
 * linkEndData.end.qualifier->includes(qualifier)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.QualifierValue#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uml.actions.QualifierValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getQualifierValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity_of_qualifier type_of_qualifier qualifier_attribute'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity_of_qualifier='value.is(1,1)' type_of_qualifier='value.type.conformsTo(qualifier.type)' qualifier_attribute='linkEndData.end.qualifier->includes(qualifier)'"
 * @generated
 */
public interface QualifierValue extends Element {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualifier Property for which the value is to be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(Property)
	 * @see uml.actions.ActionsPackage#getQualifierValue_Qualifier()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='qualifierValue'"
	 * @generated
	 */
	Property getQualifier();

	/**
	 * Sets the value of the '{@link uml.actions.QualifierValue#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(Property value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin from which the specified value for the qualifier is taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(InputPin)
	 * @see uml.actions.ActionsPackage#getQualifierValue_Value()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='qualifierValue'"
	 * @generated
	 */
	InputPin getValue();

	/**
	 * Sets the value of the '{@link uml.actions.QualifierValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InputPin value);

} // QualifierValue
