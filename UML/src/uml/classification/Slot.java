/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.Element;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Slot designates that an entity modeled by an InstanceSpecification has a value or values for a specific StructuralFeature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.Slot#getDefiningFeature <em>Defining Feature</em>}</li>
 *   <li>{@link uml.classification.Slot#getValue <em>Value</em>}</li>
 *   <li>{@link uml.classification.Slot#getOwningInstance <em>Owning Instance</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends Element {
	/**
	 * Returns the value of the '<em><b>Defining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StructuralFeature that specifies the values that may be held by the Slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining Feature</em>' reference.
	 * @see #setDefiningFeature(StructuralFeature)
	 * @see uml.classification.ClassificationPackage#getSlot_DefiningFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='slot'"
	 * @generated
	 */
	StructuralFeature getDefiningFeature();

	/**
	 * Sets the value of the '{@link uml.classification.Slot#getDefiningFeature <em>Defining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Feature</em>' reference.
	 * @see #getDefiningFeature()
	 * @generated
	 */
	void setDefiningFeature(StructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link uml.values.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value or values held by the Slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getSlot_Value()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningSlot'"
	 * @generated
	 */
	EList<ValueSpecification> getValue();

	/**
	 * Returns the value of the '<em><b>Owning Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.classification.InstanceSpecification#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InstanceSpecification that owns this Slot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Instance</em>' container reference.
	 * @see #setOwningInstance(InstanceSpecification)
	 * @see uml.classification.ClassificationPackage#getSlot_OwningInstance()
	 * @see uml.classification.InstanceSpecification#getSlot
	 * @model opposite="slot" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InstanceSpecification getOwningInstance();

	/**
	 * Sets the value of the '{@link uml.classification.Slot#getOwningInstance <em>Owning Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Instance</em>' container reference.
	 * @see #getOwningInstance()
	 * @generated
	 */
	void setOwningInstance(InstanceSpecification value);

} // Slot
