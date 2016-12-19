/**
 */
package uml.simpleClassifiers;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;
import uml.classification.Operation;
import uml.classification.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DataType is a type whose instances are identified only by their value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.DataType#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.simpleClassifiers.DataType#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 *
 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Operation}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Operation#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Operations owned by the DataType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getDataType_OwnedOperation()
	 * @see uml.classification.Operation#getDatatype
	 * @model opposite="datatype" containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Property#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes owned by the DataType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see uml.simpleClassifiers.SimpleClassifiersPackage#getDataType_OwnedAttribute()
	 * @see uml.classification.Property#getDatatype
	 * @model opposite="datatype" containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

} // DataType
