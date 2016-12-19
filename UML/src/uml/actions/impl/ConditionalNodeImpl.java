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

import uml.actions.ActionsPackage;
import uml.actions.Clause;
import uml.actions.ConditionalNode;
import uml.actions.OutputPin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.ConditionalNodeImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link uml.actions.impl.ConditionalNodeImpl#isIsAssured <em>Is Assured</em>}</li>
 *   <li>{@link uml.actions.impl.ConditionalNodeImpl#isIsDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link uml.actions.impl.ConditionalNodeImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode {
	/**
	 * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> clause;

	/**
	 * The default value of the '{@link #isIsAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssured()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSURED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssured()
	 * @generated
	 * @ordered
	 */
	protected boolean isAssured = IS_ASSURED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DETERMINATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDeterminate()
	 * @generated
	 * @ordered
	 */
	protected boolean isDeterminate = IS_DETERMINATE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.CONDITIONAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getClause() {
		if (clause == null) {
			clause = new EObjectContainmentEList<Clause>(Clause.class, this, ActionsPackage.CONDITIONAL_NODE__CLAUSE);
		}
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAssured() {
		return isAssured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssured(boolean newIsAssured) {
		boolean oldIsAssured = isAssured;
		isAssured = newIsAssured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.CONDITIONAL_NODE__IS_ASSURED, oldIsAssured, isAssured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDeterminate() {
		return isDeterminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeterminate(boolean newIsDeterminate) {
		boolean oldIsDeterminate = isDeterminate;
		isDeterminate = newIsDeterminate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.CONDITIONAL_NODE__IS_DETERMINATE, oldIsDeterminate, isDeterminate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActionsPackage.CONDITIONAL_NODE__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.CONDITIONAL_NODE__CLAUSE:
				return ((InternalEList<?>)getClause()).basicRemove(otherEnd, msgs);
			case ActionsPackage.CONDITIONAL_NODE__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.CONDITIONAL_NODE__CLAUSE:
				return getClause();
			case ActionsPackage.CONDITIONAL_NODE__IS_ASSURED:
				return isIsAssured();
			case ActionsPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				return isIsDeterminate();
			case ActionsPackage.CONDITIONAL_NODE__RESULT:
				return getResult();
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
			case ActionsPackage.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				getClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case ActionsPackage.CONDITIONAL_NODE__IS_ASSURED:
				setIsAssured((Boolean)newValue);
				return;
			case ActionsPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate((Boolean)newValue);
				return;
			case ActionsPackage.CONDITIONAL_NODE__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
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
			case ActionsPackage.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				return;
			case ActionsPackage.CONDITIONAL_NODE__IS_ASSURED:
				setIsAssured(IS_ASSURED_EDEFAULT);
				return;
			case ActionsPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate(IS_DETERMINATE_EDEFAULT);
				return;
			case ActionsPackage.CONDITIONAL_NODE__RESULT:
				getResult().clear();
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
			case ActionsPackage.CONDITIONAL_NODE__CLAUSE:
				return clause != null && !clause.isEmpty();
			case ActionsPackage.CONDITIONAL_NODE__IS_ASSURED:
				return isAssured != IS_ASSURED_EDEFAULT;
			case ActionsPackage.CONDITIONAL_NODE__IS_DETERMINATE:
				return isDeterminate != IS_DETERMINATE_EDEFAULT;
			case ActionsPackage.CONDITIONAL_NODE__RESULT:
				return result != null && !result.isEmpty();
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
		result.append(" (isAssured: ");
		result.append(isAssured);
		result.append(", isDeterminate: ");
		result.append(isDeterminate);
		result.append(')');
		return result.toString();
	}

} //ConditionalNodeImpl
