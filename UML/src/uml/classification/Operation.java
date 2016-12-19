/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.Constraint;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.Type;

import uml.simpleClassifiers.DataType;
import uml.simpleClassifiers.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Operation is a BehavioralFeature of a Classifier that specifies the name, type, parameters, and constraints for invoking an associated Behavior. An Operation may invoke both the execution of method behaviors as well as other behavioral responses. Operation specializes TemplateableElement in order to support specification of template operations and bound operations. Operation specializes ParameterableElement to specify that an operation can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
 * self.ownedParameter->select(direction = ParameterDirectionKind::return)->size() <= 1
 * bodyCondition <> null implies isQuery
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.Operation#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link uml.classification.Operation#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.classification.Operation#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml.classification.Operation#getInterface <em>Interface</em>}</li>
 *   <li>{@link uml.classification.Operation#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.classification.Operation#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link uml.classification.Operation#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.classification.Operation#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.classification.Operation#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml.classification.Operation#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml.classification.Operation#getRedefinedOperation <em>Redefined Operation</em>}</li>
 *   <li>{@link uml.classification.Operation#getType <em>Type</em>}</li>
 *   <li>{@link uml.classification.Operation#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='at_most_one_return only_body_for_query'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL at_most_one_return='self.ownedParameter->select(direction = ParameterDirectionKind::return)->size() <= 1' only_body_for_query='bodyCondition <> null implies isQuery'"
 * @generated
 */
public interface Operation extends BehavioralFeature, ParameterableElement, TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional Constraint on the result values of an invocation of this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Condition</em>' reference.
	 * @see #setBodyCondition(Constraint)
	 * @see uml.classification.ClassificationPackage#getOperation_BodyCondition()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='bodyContext'"
	 * @generated
	 */
	Constraint getBodyCondition();

	/**
	 * Sets the value of the '{@link uml.classification.Operation#getBodyCondition <em>Body Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Condition</em>' reference.
	 * @see #getBodyCondition()
	 * @generated
	 */
	void setBodyCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.structuredClassifiers.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Class that owns this operation, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' container reference.
	 * @see #setClass(uml.structuredClassifiers.Class)
	 * @see uml.classification.ClassificationPackage#getOperation_Class()
	 * @see uml.structuredClassifiers.Class#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	uml.structuredClassifiers.Class getClass_();

	/**
	 * Sets the value of the '{@link uml.classification.Operation#getClass_ <em>Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' container reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(uml.structuredClassifiers.Class value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.simpleClassifiers.DataType#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataType that owns this Operation, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see uml.classification.ClassificationPackage#getOperation_Datatype()
	 * @see uml.simpleClassifiers.DataType#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link uml.classification.Operation#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.simpleClassifiers.Interface#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interface that owns this Operation, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see uml.classification.ClassificationPackage#getOperation_Interface()
	 * @see uml.simpleClassifiers.Interface#getOwnedOperation
	 * @model opposite="ownedOperation" transient="false" ordered="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link uml.classification.Operation#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the return parameter is ordered or not, if present.  This information is derived from the return result for this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Ordered</em>' attribute.
	 * @see uml.classification.ClassificationPackage#getOperation_IsOrdered()
	 * @model dataType="types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsOrdered();

	/**
	 * Returns the value of the '<em><b>Is Query</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged (isQuery=true) or whether side effects may occur (isQuery=false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Query</em>' attribute.
	 * @see #setIsQuery(boolean)
	 * @see uml.classification.ClassificationPackage#getOperation_IsQuery()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsQuery();

	/**
	 * Sets the value of the '{@link uml.classification.Operation#isIsQuery <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Query</em>' attribute.
	 * @see #isIsQuery()
	 * @generated
	 */
	void setIsQuery(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the return parameter is unique or not, if present. This information is derived from the return result for this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see uml.classification.ClassificationPackage#getOperation_IsUnique()
	 * @model dataType="types.Boolean" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the lower multiplicity of the return parameter, if present. This information is derived from the return result for this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see uml.classification.ClassificationPackage#getOperation_Lower()
	 * @model dataType="types.Integer" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getLower();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints specifying the state of the system when the Operation is completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getOperation_Postcondition()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='postContext'"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional set of Constraints on the state of the system when the Operation is invoked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getOperation_Precondition()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='preContext'"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Redefined Operation</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations that are redefined by this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Operation</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getOperation_RedefinedOperation()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='operation'"
	 * @generated
	 */
	EList<Operation> getRedefinedOperation();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The return type of the operation, if present. This information is derived from the return result for this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see uml.classification.ClassificationPackage#getOperation_Type()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='operation'"
	 * @generated
	 */
	Type getType();

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper multiplicity of the return parameter, if present. This information is derived from the return result for this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see uml.classification.ClassificationPackage#getOperation_Upper()
	 * @model dataType="types.UnlimitedNatural" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getUpper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, isOrdered equals the value of isOrdered for that parameter. Otherwise isOrdered is false.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if returnResult()->notEmpty() then returnResult()-> exists(isOrdered) else false endif'"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, isUnique equals the value of isUnique for that parameter. Otherwise isUnique is true.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if returnResult()->notEmpty() then returnResult()->exists(isUnique) else true endif'"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, lower equals the value of lower for that parameter. Otherwise lower has no value.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Integer" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if returnResult()->notEmpty() then returnResult()->any(true).lower else null endif'"
	 * @generated
	 */
	int lower();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query returnResult() returns the set containing the return parameter of the Operation if one exists, otherwise, it returns an empty set
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedParameter->select (direction = ParameterDirectionKind::return)'"
	 * @generated
	 */
	EList<Parameter> returnResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, type equals the value of type for that parameter. Otherwise type has no value.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if returnResult()->notEmpty() then returnResult()->any(true).type else null endif'"
	 * @generated
	 */
	Type type();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, upper equals the value of upper for that parameter. Otherwise upper has no value.
	 * <!-- end-model-doc -->
	 * @model dataType="types.UnlimitedNatural" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if returnResult()->notEmpty() then returnResult()->any(true).upper else null endif'"
	 * @generated
	 */
	int upper();

} // Operation
