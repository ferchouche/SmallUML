/**
 */
package uml.actions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.actions.ActionsPackage;
import uml.actions.InputPin;
import uml.actions.OpaqueAction;
import uml.actions.OutputPin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.OpaqueActionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link uml.actions.impl.OpaqueActionImpl#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link uml.actions.impl.OpaqueActionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link uml.actions.impl.OpaqueActionImpl#getOutputValue <em>Output Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueActionImpl extends ActionImpl implements OpaqueAction {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<String> body;

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
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * The cached value of the '{@link #getOutputValue() <em>Output Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputValue()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> outputValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.OPAQUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBody() {
		if (body == null) {
			body = new EDataTypeEList<String>(String.class, this, ActionsPackage.OPAQUE_ACTION__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputValue() {
		if (inputValue == null) {
			inputValue = new EObjectContainmentEList<InputPin>(InputPin.class, this, ActionsPackage.OPAQUE_ACTION__INPUT_VALUE);
		}
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, ActionsPackage.OPAQUE_ACTION__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutputValue() {
		if (outputValue == null) {
			outputValue = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActionsPackage.OPAQUE_ACTION__OUTPUT_VALUE);
		}
		return outputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.OPAQUE_ACTION__INPUT_VALUE:
				return ((InternalEList<?>)getInputValue()).basicRemove(otherEnd, msgs);
			case ActionsPackage.OPAQUE_ACTION__OUTPUT_VALUE:
				return ((InternalEList<?>)getOutputValue()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.OPAQUE_ACTION__BODY:
				return getBody();
			case ActionsPackage.OPAQUE_ACTION__INPUT_VALUE:
				return getInputValue();
			case ActionsPackage.OPAQUE_ACTION__LANGUAGE:
				return getLanguage();
			case ActionsPackage.OPAQUE_ACTION__OUTPUT_VALUE:
				return getOutputValue();
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
			case ActionsPackage.OPAQUE_ACTION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends String>)newValue);
				return;
			case ActionsPackage.OPAQUE_ACTION__INPUT_VALUE:
				getInputValue().clear();
				getInputValue().addAll((Collection<? extends InputPin>)newValue);
				return;
			case ActionsPackage.OPAQUE_ACTION__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
				return;
			case ActionsPackage.OPAQUE_ACTION__OUTPUT_VALUE:
				getOutputValue().clear();
				getOutputValue().addAll((Collection<? extends OutputPin>)newValue);
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
			case ActionsPackage.OPAQUE_ACTION__BODY:
				getBody().clear();
				return;
			case ActionsPackage.OPAQUE_ACTION__INPUT_VALUE:
				getInputValue().clear();
				return;
			case ActionsPackage.OPAQUE_ACTION__LANGUAGE:
				getLanguage().clear();
				return;
			case ActionsPackage.OPAQUE_ACTION__OUTPUT_VALUE:
				getOutputValue().clear();
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
			case ActionsPackage.OPAQUE_ACTION__BODY:
				return body != null && !body.isEmpty();
			case ActionsPackage.OPAQUE_ACTION__INPUT_VALUE:
				return inputValue != null && !inputValue.isEmpty();
			case ActionsPackage.OPAQUE_ACTION__LANGUAGE:
				return language != null && !language.isEmpty();
			case ActionsPackage.OPAQUE_ACTION__OUTPUT_VALUE:
				return outputValue != null && !outputValue.isEmpty();
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
		result.append(" (body: ");
		result.append(body);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //OpaqueActionImpl
