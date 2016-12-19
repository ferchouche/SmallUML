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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.actions.ActionsPackage;
import uml.actions.ExpansionKind;
import uml.actions.ExpansionNode;
import uml.actions.ExpansionRegion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.ExpansionRegionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link uml.actions.impl.ExpansionRegionImpl#getOutputElement <em>Output Element</em>}</li>
 *   <li>{@link uml.actions.impl.ExpansionRegionImpl#getInputElement <em>Input Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpansionRegionImpl extends StructuredActivityNodeImpl implements ExpansionRegion {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExpansionKind MODE_EDEFAULT = ExpansionKind.ITERATIVE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ExpansionKind mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputElement() <em>Output Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionNode> outputElement;

	/**
	 * The cached value of the '{@link #getInputElement() <em>Input Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionNode> inputElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.EXPANSION_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ExpansionKind newMode) {
		ExpansionKind oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.EXPANSION_REGION__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionNode> getOutputElement() {
		if (outputElement == null) {
			outputElement = new EObjectWithInverseResolvingEList<ExpansionNode>(ExpansionNode.class, this, ActionsPackage.EXPANSION_REGION__OUTPUT_ELEMENT, ActionsPackage.EXPANSION_NODE__REGION_AS_OUTPUT);
		}
		return outputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionNode> getInputElement() {
		if (inputElement == null) {
			inputElement = new EObjectWithInverseResolvingEList<ExpansionNode>(ExpansionNode.class, this, ActionsPackage.EXPANSION_REGION__INPUT_ELEMENT, ActionsPackage.EXPANSION_NODE__REGION_AS_INPUT);
		}
		return inputElement;
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
			case ActionsPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputElement()).basicAdd(otherEnd, msgs);
			case ActionsPackage.EXPANSION_REGION__INPUT_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputElement()).basicAdd(otherEnd, msgs);
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
			case ActionsPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				return ((InternalEList<?>)getOutputElement()).basicRemove(otherEnd, msgs);
			case ActionsPackage.EXPANSION_REGION__INPUT_ELEMENT:
				return ((InternalEList<?>)getInputElement()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.EXPANSION_REGION__MODE:
				return getMode();
			case ActionsPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				return getOutputElement();
			case ActionsPackage.EXPANSION_REGION__INPUT_ELEMENT:
				return getInputElement();
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
			case ActionsPackage.EXPANSION_REGION__MODE:
				setMode((ExpansionKind)newValue);
				return;
			case ActionsPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				getOutputElement().clear();
				getOutputElement().addAll((Collection<? extends ExpansionNode>)newValue);
				return;
			case ActionsPackage.EXPANSION_REGION__INPUT_ELEMENT:
				getInputElement().clear();
				getInputElement().addAll((Collection<? extends ExpansionNode>)newValue);
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
			case ActionsPackage.EXPANSION_REGION__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case ActionsPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				getOutputElement().clear();
				return;
			case ActionsPackage.EXPANSION_REGION__INPUT_ELEMENT:
				getInputElement().clear();
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
			case ActionsPackage.EXPANSION_REGION__MODE:
				return mode != MODE_EDEFAULT;
			case ActionsPackage.EXPANSION_REGION__OUTPUT_ELEMENT:
				return outputElement != null && !outputElement.isEmpty();
			case ActionsPackage.EXPANSION_REGION__INPUT_ELEMENT:
				return inputElement != null && !inputElement.isEmpty();
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //ExpansionRegionImpl
