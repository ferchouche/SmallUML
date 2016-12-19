/**
 */
package uml.values.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import uml.values.DurationConstraint;
import uml.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.values.impl.DurationConstraintImpl#getFirstEvent <em>First Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationConstraintImpl extends IntervalConstraintImpl implements DurationConstraint {
	/**
	 * The cached value of the '{@link #getFirstEvent() <em>First Event</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> firstEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DurationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuesPackage.Literals.DURATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getFirstEvent() {
		if (firstEvent == null) {
			firstEvent = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, ValuesPackage.DURATION_CONSTRAINT__FIRST_EVENT);
		}
		return firstEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValuesPackage.DURATION_CONSTRAINT__FIRST_EVENT:
				return getFirstEvent();
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
			case ValuesPackage.DURATION_CONSTRAINT__FIRST_EVENT:
				getFirstEvent().clear();
				getFirstEvent().addAll((Collection<? extends Boolean>)newValue);
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
			case ValuesPackage.DURATION_CONSTRAINT__FIRST_EVENT:
				getFirstEvent().clear();
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
			case ValuesPackage.DURATION_CONSTRAINT__FIRST_EVENT:
				return firstEvent != null && !firstEvent.isEmpty();
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
		result.append(" (firstEvent: ");
		result.append(firstEvent);
		result.append(')');
		return result.toString();
	}

} //DurationConstraintImpl
