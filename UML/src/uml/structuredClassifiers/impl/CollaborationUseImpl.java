/**
 */
package uml.structuredClassifiers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonStructure.Dependency;

import uml.commonStructure.impl.NamedElementImpl;

import uml.structuredClassifiers.Collaboration;
import uml.structuredClassifiers.CollaborationUse;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.CollaborationUseImpl#getRoleBinding <em>Role Binding</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.CollaborationUseImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationUseImpl extends NamedElementImpl implements CollaborationUse {
	/**
	 * The cached value of the '{@link #getRoleBinding() <em>Role Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> roleBinding;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Collaboration type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.COLLABORATION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getRoleBinding() {
		if (roleBinding == null) {
			roleBinding = new EObjectContainmentEList<Dependency>(Dependency.class, this, StructuredClassifiersPackage.COLLABORATION_USE__ROLE_BINDING);
		}
		return roleBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Collaboration)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuredClassifiersPackage.COLLABORATION_USE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Collaboration newType) {
		Collaboration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.COLLABORATION_USE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredClassifiersPackage.COLLABORATION_USE__ROLE_BINDING:
				return ((InternalEList<?>)getRoleBinding()).basicRemove(otherEnd, msgs);
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
			case StructuredClassifiersPackage.COLLABORATION_USE__ROLE_BINDING:
				return getRoleBinding();
			case StructuredClassifiersPackage.COLLABORATION_USE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case StructuredClassifiersPackage.COLLABORATION_USE__ROLE_BINDING:
				getRoleBinding().clear();
				getRoleBinding().addAll((Collection<? extends Dependency>)newValue);
				return;
			case StructuredClassifiersPackage.COLLABORATION_USE__TYPE:
				setType((Collaboration)newValue);
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
			case StructuredClassifiersPackage.COLLABORATION_USE__ROLE_BINDING:
				getRoleBinding().clear();
				return;
			case StructuredClassifiersPackage.COLLABORATION_USE__TYPE:
				setType((Collaboration)null);
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
			case StructuredClassifiersPackage.COLLABORATION_USE__ROLE_BINDING:
				return roleBinding != null && !roleBinding.isEmpty();
			case StructuredClassifiersPackage.COLLABORATION_USE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //CollaborationUseImpl
