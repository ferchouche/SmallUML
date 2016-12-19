/**
 */
package uml.actions.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.actions.ActionsPackage;
import uml.actions.InputPin;
import uml.actions.LinkAction;
import uml.actions.LinkEndData;

import uml.structuredClassifiers.Association;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.LinkActionImpl#getEndData <em>End Data</em>}</li>
 *   <li>{@link uml.actions.impl.LinkActionImpl#getInputValue <em>Input Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinkActionImpl extends ActionImpl implements LinkAction {
	/**
	 * The cached value of the '{@link #getEndData() <em>End Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndData()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkEndData> endData;

	/**
	 * The cached value of the '{@link #getInputValue() <em>Input Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> inputValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.LINK_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkEndData> getEndData() {
		if (endData == null) {
			endData = new EObjectContainmentEList<LinkEndData>(LinkEndData.class, this, ActionsPackage.LINK_ACTION__END_DATA);
		}
		return endData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputValue() {
		if (inputValue == null) {
			inputValue = new EObjectContainmentEList<InputPin>(InputPin.class, this, ActionsPackage.LINK_ACTION__INPUT_VALUE);
		}
		return inputValue;
	}

	/**
	 * The cached invocation delegate for the '{@link #association() <em>Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #association()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ASSOCIATION__EINVOCATION_DELEGATE = ((EOperation.Internal)ActionsPackage.Literals.LINK_ACTION___ASSOCIATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association association() {
		try {
			return (Association)ASSOCIATION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.LINK_ACTION__END_DATA:
				return ((InternalEList<?>)getEndData()).basicRemove(otherEnd, msgs);
			case ActionsPackage.LINK_ACTION__INPUT_VALUE:
				return ((InternalEList<?>)getInputValue()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.LINK_ACTION__END_DATA:
				return getEndData();
			case ActionsPackage.LINK_ACTION__INPUT_VALUE:
				return getInputValue();
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
			case ActionsPackage.LINK_ACTION__END_DATA:
				getEndData().clear();
				getEndData().addAll((Collection<? extends LinkEndData>)newValue);
				return;
			case ActionsPackage.LINK_ACTION__INPUT_VALUE:
				getInputValue().clear();
				getInputValue().addAll((Collection<? extends InputPin>)newValue);
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
			case ActionsPackage.LINK_ACTION__END_DATA:
				getEndData().clear();
				return;
			case ActionsPackage.LINK_ACTION__INPUT_VALUE:
				getInputValue().clear();
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
			case ActionsPackage.LINK_ACTION__END_DATA:
				return endData != null && !endData.isEmpty();
			case ActionsPackage.LINK_ACTION__INPUT_VALUE:
				return inputValue != null && !inputValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ActionsPackage.LINK_ACTION___ASSOCIATION:
				return association();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LinkActionImpl
