/**
 */
package uml.interactions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.interactions.ExecutionSpecification;
import uml.interactions.InteractionsPackage;
import uml.interactions.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.impl.ExecutionSpecificationImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link uml.interactions.impl.ExecutionSpecificationImpl#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExecutionSpecificationImpl extends InteractionFragmentImpl implements ExecutionSpecification {
	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceSpecification finish;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceSpecification start;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionsPackage.Literals.EXECUTION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification getFinish() {
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject)finish;
			finish = (OccurrenceSpecification)eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionsPackage.EXECUTION_SPECIFICATION__FINISH, oldFinish, finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification basicGetFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(OccurrenceSpecification newFinish) {
		OccurrenceSpecification oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionsPackage.EXECUTION_SPECIFICATION__FINISH, oldFinish, finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (OccurrenceSpecification)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionsPackage.EXECUTION_SPECIFICATION__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(OccurrenceSpecification newStart) {
		OccurrenceSpecification oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionsPackage.EXECUTION_SPECIFICATION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionsPackage.EXECUTION_SPECIFICATION__FINISH:
				if (resolve) return getFinish();
				return basicGetFinish();
			case InteractionsPackage.EXECUTION_SPECIFICATION__START:
				if (resolve) return getStart();
				return basicGetStart();
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
			case InteractionsPackage.EXECUTION_SPECIFICATION__FINISH:
				setFinish((OccurrenceSpecification)newValue);
				return;
			case InteractionsPackage.EXECUTION_SPECIFICATION__START:
				setStart((OccurrenceSpecification)newValue);
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
			case InteractionsPackage.EXECUTION_SPECIFICATION__FINISH:
				setFinish((OccurrenceSpecification)null);
				return;
			case InteractionsPackage.EXECUTION_SPECIFICATION__START:
				setStart((OccurrenceSpecification)null);
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
			case InteractionsPackage.EXECUTION_SPECIFICATION__FINISH:
				return finish != null;
			case InteractionsPackage.EXECUTION_SPECIFICATION__START:
				return start != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionSpecificationImpl
