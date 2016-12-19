/**
 */
package uml.values;

import uml.commonStructure.PackageableElement;
import uml.commonStructure.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ValueSpecification is the specification of a (possibly empty) set of values. A ValueSpecification is a ParameterableElement that may be exposed as a formal TemplateParameter and provided as the actual parameter in the binding of a template.
 * <!-- end-model-doc -->
 *
 *
 * @see uml.values.ValuesPackage#getValueSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ValueSpecification extends PackageableElement, TypedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query booleanValue() gives a single Boolean value when one can be computed.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='null'"
	 * @generated
	 */
	boolean booleanValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query integerValue() gives a single Integer value when one can be computed.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Integer" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='null'"
	 * @generated
	 */
	int integerValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() determines whether a value specification can be computed in a model. This operation cannot be fully defined in OCL. A conforming implementation is expected to deliver true for this operation for all ValueSpecifications that it can compute, and to compute all of those for which the operation is true. A conforming implementation is expected to be able to compute at least the value of all LiteralSpecifications.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='false'"
	 * @generated
	 */
	boolean isComputable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNull() returns true when it can be computed that the value is null.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='false'"
	 * @generated
	 */
	boolean isNull();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query realValue() gives a single Real value when one can be computed.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Real" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='null'"
	 * @generated
	 */
	double realValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query stringValue() gives a single String value when one can be computed.
	 * <!-- end-model-doc -->
	 * @model dataType="types.String" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='null'"
	 * @generated
	 */
	String stringValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query unlimitedValue() gives a single UnlimitedNatural value when one can be computed.
	 * <!-- end-model-doc -->
	 * @model dataType="types.UnlimitedNatural" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='null'"
	 * @generated
	 */
	int unlimitedValue();

} // ValueSpecification
