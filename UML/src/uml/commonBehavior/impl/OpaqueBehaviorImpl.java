/**
 */
package uml.commonBehavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import uml.commonBehavior.CommonBehaviorPackage;
import uml.commonBehavior.OpaqueBehavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.commonBehavior.impl.OpaqueBehaviorImpl#getBody <em>Body</em>}</li>
 *   <li>{@link uml.commonBehavior.impl.OpaqueBehaviorImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueBehaviorImpl extends BehaviorImpl implements OpaqueBehavior {
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
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonBehaviorPackage.Literals.OPAQUE_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBody() {
		if (body == null) {
			body = new EDataTypeEList<String>(String.class, this, CommonBehaviorPackage.OPAQUE_BEHAVIOR__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, CommonBehaviorPackage.OPAQUE_BEHAVIOR__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonBehaviorPackage.OPAQUE_BEHAVIOR__BODY:
				return getBody();
			case CommonBehaviorPackage.OPAQUE_BEHAVIOR__LANGUAGE:
				return getLanguage();
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
			case CommonBehaviorPackage.OPAQUE_BEHAVIOR__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends String>)newValue);
				return;
			case CommonBehaviorPackage.OPAQUE_BEHAVIOR__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
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
			case CommonBehaviorPackage.OPAQUE_BEHAVIOR__BODY:
				getBody().clear();
				return;
			case CommonBehaviorPackage.OPAQUE_BEHAVIOR__LANGUAGE:
				getLanguage().clear();
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
			case CommonBehaviorPackage.OPAQUE_BEHAVIOR__BODY:
				return body != null && !body.isEmpty();
			case CommonBehaviorPackage.OPAQUE_BEHAVIOR__LANGUAGE:
				return language != null && !language.isEmpty();
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

} //OpaqueBehaviorImpl
