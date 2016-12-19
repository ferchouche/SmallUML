/**
 */
package uml.actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.actions.ActionsPackage;
import uml.actions.InputPin;
import uml.actions.LinkEndDestructionData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.LinkEndDestructionDataImpl#getDestroyAt <em>Destroy At</em>}</li>
 *   <li>{@link uml.actions.impl.LinkEndDestructionDataImpl#isIsDestroyDuplicates <em>Is Destroy Duplicates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkEndDestructionDataImpl extends LinkEndDataImpl implements LinkEndDestructionData {
	/**
	 * The cached value of the '{@link #getDestroyAt() <em>Destroy At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin destroyAt;

	/**
	 * The default value of the '{@link #isIsDestroyDuplicates() <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDestroyDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DESTROY_DUPLICATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDestroyDuplicates() <em>Is Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDestroyDuplicates()
	 * @generated
	 * @ordered
	 */
	protected boolean isDestroyDuplicates = IS_DESTROY_DUPLICATES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndDestructionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.LINK_END_DESTRUCTION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getDestroyAt() {
		if (destroyAt != null && destroyAt.eIsProxy()) {
			InternalEObject oldDestroyAt = (InternalEObject)destroyAt;
			destroyAt = (InputPin)eResolveProxy(oldDestroyAt);
			if (destroyAt != oldDestroyAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, oldDestroyAt, destroyAt));
			}
		}
		return destroyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetDestroyAt() {
		return destroyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyAt(InputPin newDestroyAt) {
		InputPin oldDestroyAt = destroyAt;
		destroyAt = newDestroyAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, oldDestroyAt, destroyAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDestroyDuplicates() {
		return isDestroyDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroyDuplicates(boolean newIsDestroyDuplicates) {
		boolean oldIsDestroyDuplicates = isDestroyDuplicates;
		isDestroyDuplicates = newIsDestroyDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES, oldIsDestroyDuplicates, isDestroyDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				if (resolve) return getDestroyAt();
				return basicGetDestroyAt();
			case ActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
				return isIsDestroyDuplicates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				setDestroyAt((InputPin)newValue);
				return;
			case ActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
				setIsDestroyDuplicates((Boolean)newValue);
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
			case ActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				setDestroyAt((InputPin)null);
				return;
			case ActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
				setIsDestroyDuplicates(IS_DESTROY_DUPLICATES_EDEFAULT);
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
			case ActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				return destroyAt != null;
			case ActionsPackage.LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES:
				return isDestroyDuplicates != IS_DESTROY_DUPLICATES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDestroyDuplicates: ");
		result.append(isDestroyDuplicates);
		result.append(')');
		return result.toString();
	}

} //LinkEndDestructionDataImpl
