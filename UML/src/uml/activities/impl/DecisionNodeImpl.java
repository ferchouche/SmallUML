/**
 */
package uml.activities.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.activities.ActivitiesPackage;
import uml.activities.DecisionNode;
import uml.activities.ObjectFlow;

import uml.commonBehavior.Behavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.impl.DecisionNodeImpl#getDecisionInput <em>Decision Input</em>}</li>
 *   <li>{@link uml.activities.impl.DecisionNodeImpl#getDecisionInputFlow <em>Decision Input Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionNodeImpl extends ControlNodeImpl implements DecisionNode {
	/**
	 * The cached value of the '{@link #getDecisionInput() <em>Decision Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionInput()
	 * @generated
	 * @ordered
	 */
	protected Behavior decisionInput;

	/**
	 * The cached value of the '{@link #getDecisionInputFlow() <em>Decision Input Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionInputFlow()
	 * @generated
	 * @ordered
	 */
	protected ObjectFlow decisionInputFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.DECISION_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDecisionInput() {
		if (decisionInput != null && decisionInput.eIsProxy()) {
			InternalEObject oldDecisionInput = (InternalEObject)decisionInput;
			decisionInput = (Behavior)eResolveProxy(oldDecisionInput);
			if (decisionInput != oldDecisionInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.DECISION_NODE__DECISION_INPUT, oldDecisionInput, decisionInput));
			}
		}
		return decisionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetDecisionInput() {
		return decisionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionInput(Behavior newDecisionInput) {
		Behavior oldDecisionInput = decisionInput;
		decisionInput = newDecisionInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.DECISION_NODE__DECISION_INPUT, oldDecisionInput, decisionInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow getDecisionInputFlow() {
		if (decisionInputFlow != null && decisionInputFlow.eIsProxy()) {
			InternalEObject oldDecisionInputFlow = (InternalEObject)decisionInputFlow;
			decisionInputFlow = (ObjectFlow)eResolveProxy(oldDecisionInputFlow);
			if (decisionInputFlow != oldDecisionInputFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.DECISION_NODE__DECISION_INPUT_FLOW, oldDecisionInputFlow, decisionInputFlow));
			}
		}
		return decisionInputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFlow basicGetDecisionInputFlow() {
		return decisionInputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionInputFlow(ObjectFlow newDecisionInputFlow) {
		ObjectFlow oldDecisionInputFlow = decisionInputFlow;
		decisionInputFlow = newDecisionInputFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.DECISION_NODE__DECISION_INPUT_FLOW, oldDecisionInputFlow, decisionInputFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.DECISION_NODE__DECISION_INPUT:
				if (resolve) return getDecisionInput();
				return basicGetDecisionInput();
			case ActivitiesPackage.DECISION_NODE__DECISION_INPUT_FLOW:
				if (resolve) return getDecisionInputFlow();
				return basicGetDecisionInputFlow();
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
			case ActivitiesPackage.DECISION_NODE__DECISION_INPUT:
				setDecisionInput((Behavior)newValue);
				return;
			case ActivitiesPackage.DECISION_NODE__DECISION_INPUT_FLOW:
				setDecisionInputFlow((ObjectFlow)newValue);
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
			case ActivitiesPackage.DECISION_NODE__DECISION_INPUT:
				setDecisionInput((Behavior)null);
				return;
			case ActivitiesPackage.DECISION_NODE__DECISION_INPUT_FLOW:
				setDecisionInputFlow((ObjectFlow)null);
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
			case ActivitiesPackage.DECISION_NODE__DECISION_INPUT:
				return decisionInput != null;
			case ActivitiesPackage.DECISION_NODE__DECISION_INPUT_FLOW:
				return decisionInputFlow != null;
		}
		return super.eIsSet(featureID);
	}

} //DecisionNodeImpl
