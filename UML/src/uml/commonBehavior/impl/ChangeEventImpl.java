/**
 */
package uml.commonBehavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.commonBehavior.ChangeEvent;
import uml.commonBehavior.CommonBehaviorPackage;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.commonBehavior.impl.ChangeEventImpl#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeEventImpl extends EventImpl implements ChangeEvent {
	/**
	 * The cached value of the '{@link #getChangeExpression() <em>Change Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeExpression()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification changeExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonBehaviorPackage.Literals.CHANGE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getChangeExpression() {
		return changeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeExpression(ValueSpecification newChangeExpression, NotificationChain msgs) {
		ValueSpecification oldChangeExpression = changeExpression;
		changeExpression = newChangeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonBehaviorPackage.CHANGE_EVENT__CHANGE_EXPRESSION, oldChangeExpression, newChangeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeExpression(ValueSpecification newChangeExpression) {
		if (newChangeExpression != changeExpression) {
			NotificationChain msgs = null;
			if (changeExpression != null)
				msgs = ((InternalEObject)changeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonBehaviorPackage.CHANGE_EVENT__CHANGE_EXPRESSION, null, msgs);
			if (newChangeExpression != null)
				msgs = ((InternalEObject)newChangeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonBehaviorPackage.CHANGE_EVENT__CHANGE_EXPRESSION, null, msgs);
			msgs = basicSetChangeExpression(newChangeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonBehaviorPackage.CHANGE_EVENT__CHANGE_EXPRESSION, newChangeExpression, newChangeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonBehaviorPackage.CHANGE_EVENT__CHANGE_EXPRESSION:
				return basicSetChangeExpression(null, msgs);
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
			case CommonBehaviorPackage.CHANGE_EVENT__CHANGE_EXPRESSION:
				return getChangeExpression();
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
			case CommonBehaviorPackage.CHANGE_EVENT__CHANGE_EXPRESSION:
				setChangeExpression((ValueSpecification)newValue);
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
			case CommonBehaviorPackage.CHANGE_EVENT__CHANGE_EXPRESSION:
				setChangeExpression((ValueSpecification)null);
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
			case CommonBehaviorPackage.CHANGE_EVENT__CHANGE_EXPRESSION:
				return changeExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeEventImpl
