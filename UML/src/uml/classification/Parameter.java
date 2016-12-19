/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.MultiplicityElement;

import uml.structuredClassifiers.ConnectableElement;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Parameter is a specification of an argument used to pass information into or out of an invocation of a BehavioralFeature.  Parameters can be treated as ConnectableElements within Collaborations.
 * (effect = ParameterEffectKind::delete implies (direction = ParameterDirectionKind::_'in' or direction = ParameterDirectionKind::inout))
 * and
 * (effect = ParameterEffectKind::create implies (direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::return))
 * isException implies (direction <> ParameterDirectionKind::_'in' and direction <> ParameterDirectionKind::inout)
 * end->notEmpty() implies collaboration->notEmpty()
 * (isStream and behavior <> null) implies not behavior.isReentrant
 * not (isException and isStream)
 * (type.oclIsKindOf(DataType)) implies (effect = null)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.Parameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link uml.classification.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.classification.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.classification.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link uml.classification.Parameter#getEffect <em>Effect</em>}</li>
 *   <li>{@link uml.classification.Parameter#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link uml.classification.Parameter#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link uml.classification.Parameter#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='in_and_out not_exception connector_end reentrant_behaviors stream_and_exception object_effect'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL in_and_out='(effect = ParameterEffectKind::delete implies (direction = ParameterDirectionKind::_\'in\' or direction = ParameterDirectionKind::inout))\r\nand\r\n(effect = ParameterEffectKind::create implies (direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::return))' not_exception='isException implies (direction <> ParameterDirectionKind::_\'in\' and direction <> ParameterDirectionKind::inout)' connector_end='end->notEmpty() implies collaboration->notEmpty()' reentrant_behaviors='(isStream and behavior <> null) implies not behavior.isReentrant' stream_and_exception='not (isException and isStream)' object_effect='(type.oclIsKindOf(DataType)) implies (effect = null)'"
 * @generated
 */
public interface Parameter extends ConnectableElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operation owning this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see uml.classification.ClassificationPackage#getParameter_Operation()
	 * @model transient="true" changeable="false" volatile="true" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A String that represents a value to be used when no argument is supplied for the Parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see uml.classification.ClassificationPackage#getParameter_Default()
	 * @model dataType="types.String" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link uml.classification.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see uml.classification.ClassificationPackage#getParameter_DefaultValue()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningParameter'"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link uml.classification.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link uml.classification.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a parameter is being sent into or out of a behavioral element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see uml.classification.ParameterDirectionKind
	 * @see #setDirection(ParameterDirectionKind)
	 * @see uml.classification.ClassificationPackage#getParameter_Direction()
	 * @model default="in" required="true" ordered="false"
	 * @generated
	 */
	ParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link uml.classification.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see uml.classification.ParameterDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link uml.classification.ParameterEffectKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the effect that executions of the owner of the Parameter have on objects passed in or out of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see uml.classification.ParameterEffectKind
	 * @see #setEffect(ParameterEffectKind)
	 * @see uml.classification.ClassificationPackage#getParameter_Effect()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link uml.classification.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see uml.classification.ParameterEffectKind
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether an output parameter may emit a value to the exclusion of the other outputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(boolean)
	 * @see uml.classification.ClassificationPackage#getParameter_IsException()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsException();

	/**
	 * Sets the value of the '{@link uml.classification.Parameter#isIsException <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exception</em>' attribute.
	 * @see #isIsException()
	 * @generated
	 */
	void setIsException(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether an input parameter may accept values while its behavior is executing, or whether an output parameter may post values while the behavior is executing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(boolean)
	 * @see uml.classification.ClassificationPackage#getParameter_IsStream()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsStream();

	/**
	 * Sets the value of the '{@link uml.classification.Parameter#isIsStream <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream</em>' attribute.
	 * @see #isIsStream()
	 * @generated
	 */
	void setIsStream(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.ParameterSet}.
	 * It is bidirectional and its opposite is '{@link uml.classification.ParameterSet#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ParameterSets containing the parameter. See ParameterSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Set</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getParameter_ParameterSet()
	 * @see uml.classification.ParameterSet#getParameter
	 * @model opposite="parameter" ordered="false"
	 * @generated
	 */
	EList<ParameterSet> getParameterSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Parameter::/default
	 * <!-- end-model-doc -->
	 * @model dataType="types.String" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if self.type = String then defaultValue.stringValue() else null endif'"
	 * @generated
	 */
	String default_();

} // Parameter
