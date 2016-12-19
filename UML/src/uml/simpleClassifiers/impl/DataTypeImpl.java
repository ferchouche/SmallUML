/**
 */
package uml.simpleClassifiers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Operation;
import uml.classification.Property;

import uml.classification.impl.ClassifierImpl;

import uml.simpleClassifiers.DataType;
import uml.simpleClassifiers.SimpleClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.impl.DataTypeImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.simpleClassifiers.impl.DataTypeImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends ClassifierImpl implements DataType {
	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleClassifiersPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, SimpleClassifiersPackage.DATA_TYPE__OWNED_OPERATION, ClassificationPackage.OPERATION__DATATYPE);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentWithInverseEList<Property>(Property.class, this, SimpleClassifiersPackage.DATA_TYPE__OWNED_ATTRIBUTE, ClassificationPackage.PROPERTY__DATATYPE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAttribute()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_OPERATION:
				return getOwnedOperation();
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case SimpleClassifiersPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataTypeImpl
