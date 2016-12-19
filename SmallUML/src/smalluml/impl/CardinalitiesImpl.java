/**
 */
package smalluml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import smalluml.Cardinalities;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinalities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.CardinalitiesImpl#getLowerbound <em>Lowerbound</em>}</li>
 *   <li>{@link smalluml.impl.CardinalitiesImpl#getUpperbound <em>Upperbound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinalitiesImpl extends MinimalEObjectImpl.Container implements Cardinalities {
	/**
	 * The default value of the '{@link #getLowerbound() <em>Lowerbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerbound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWERBOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerbound() <em>Lowerbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerbound()
	 * @generated
	 * @ordered
	 */
	protected int lowerbound = LOWERBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperbound() <em>Upperbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperbound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPERBOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperbound() <em>Upperbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperbound()
	 * @generated
	 * @ordered
	 */
	protected int upperbound = UPPERBOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.CARDINALITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerbound() {
		return lowerbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerbound(int newLowerbound) {
		int oldLowerbound = lowerbound;
		lowerbound = newLowerbound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CARDINALITIES__LOWERBOUND, oldLowerbound, lowerbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperbound() {
		return upperbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperbound(int newUpperbound) {
		int oldUpperbound = upperbound;
		upperbound = newUpperbound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.CARDINALITIES__UPPERBOUND, oldUpperbound, upperbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmallumlPackage.CARDINALITIES__LOWERBOUND:
				return getLowerbound();
			case SmallumlPackage.CARDINALITIES__UPPERBOUND:
				return getUpperbound();
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
			case SmallumlPackage.CARDINALITIES__LOWERBOUND:
				setLowerbound((Integer)newValue);
				return;
			case SmallumlPackage.CARDINALITIES__UPPERBOUND:
				setUpperbound((Integer)newValue);
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
			case SmallumlPackage.CARDINALITIES__LOWERBOUND:
				setLowerbound(LOWERBOUND_EDEFAULT);
				return;
			case SmallumlPackage.CARDINALITIES__UPPERBOUND:
				setUpperbound(UPPERBOUND_EDEFAULT);
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
			case SmallumlPackage.CARDINALITIES__LOWERBOUND:
				return lowerbound != LOWERBOUND_EDEFAULT;
			case SmallumlPackage.CARDINALITIES__UPPERBOUND:
				return upperbound != UPPERBOUND_EDEFAULT;
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
		result.append(" (lowerbound: ");
		result.append(lowerbound);
		result.append(", upperbound: ");
		result.append(upperbound);
		result.append(')');
		return result.toString();
	}

} //CardinalitiesImpl
