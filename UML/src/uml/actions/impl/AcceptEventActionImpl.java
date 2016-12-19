/**
 */
package uml.actions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.actions.AcceptEventAction;
import uml.actions.ActionsPackage;
import uml.actions.OutputPin;

import uml.commonBehavior.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Event Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.AcceptEventActionImpl#isIsUnmarshall <em>Is Unmarshall</em>}</li>
 *   <li>{@link uml.actions.impl.AcceptEventActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link uml.actions.impl.AcceptEventActionImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptEventActionImpl extends ActionImpl implements AcceptEventAction {
	/**
	 * The default value of the '{@link #isIsUnmarshall() <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnmarshall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNMARSHALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnmarshall() <em>Is Unmarshall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnmarshall()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnmarshall = IS_UNMARSHALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> result;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptEventActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ACCEPT_EVENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnmarshall() {
		return isUnmarshall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnmarshall(boolean newIsUnmarshall) {
		boolean oldIsUnmarshall = isUnmarshall;
		isUnmarshall = newIsUnmarshall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL, oldIsUnmarshall, isUnmarshall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActionsPackage.ACCEPT_EVENT_ACTION__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, ActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case ActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
				return isIsUnmarshall();
			case ActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				return getResult();
			case ActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				return getTrigger();
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
			case ActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
				setIsUnmarshall((Boolean)newValue);
				return;
			case ActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case ActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
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
			case ActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
				setIsUnmarshall(IS_UNMARSHALL_EDEFAULT);
				return;
			case ActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				getResult().clear();
				return;
			case ActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				getTrigger().clear();
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
			case ActionsPackage.ACCEPT_EVENT_ACTION__IS_UNMARSHALL:
				return isUnmarshall != IS_UNMARSHALL_EDEFAULT;
			case ActionsPackage.ACCEPT_EVENT_ACTION__RESULT:
				return result != null && !result.isEmpty();
			case ActionsPackage.ACCEPT_EVENT_ACTION__TRIGGER:
				return trigger != null && !trigger.isEmpty();
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
		result.append(" (isUnmarshall: ");
		result.append(isUnmarshall);
		result.append(')');
		return result.toString();
	}

} //AcceptEventActionImpl
