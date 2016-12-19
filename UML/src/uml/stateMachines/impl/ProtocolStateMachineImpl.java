/**
 */
package uml.stateMachines.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.stateMachines.ProtocolConformance;
import uml.stateMachines.ProtocolStateMachine;
import uml.stateMachines.StateMachinesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.impl.ProtocolStateMachineImpl#getConformance <em>Conformance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolStateMachineImpl extends StateMachineImpl implements ProtocolStateMachine {
	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolConformance> conformance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinesPackage.Literals.PROTOCOL_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolConformance> getConformance() {
		if (conformance == null) {
			conformance = new EObjectContainmentWithInverseEList<ProtocolConformance>(ProtocolConformance.class, this, StateMachinesPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE, StateMachinesPackage.PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);
		}
		return conformance;
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
			case StateMachinesPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConformance()).basicAdd(otherEnd, msgs);
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
			case StateMachinesPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return ((InternalEList<?>)getConformance()).basicRemove(otherEnd, msgs);
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
			case StateMachinesPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return getConformance();
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
			case StateMachinesPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				getConformance().clear();
				getConformance().addAll((Collection<? extends ProtocolConformance>)newValue);
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
			case StateMachinesPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				getConformance().clear();
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
			case StateMachinesPackage.PROTOCOL_STATE_MACHINE__CONFORMANCE:
				return conformance != null && !conformance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProtocolStateMachineImpl
