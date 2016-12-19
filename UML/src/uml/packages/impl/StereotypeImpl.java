/**
 */
package uml.packages.impl;

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

import uml.packages.Image;
import uml.packages.PackagesPackage;
import uml.packages.Profile;
import uml.packages.Stereotype;

import uml.structuredClassifiers.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.impl.StereotypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link uml.packages.impl.StereotypeImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StereotypeImpl extends ClassImpl implements Stereotype {
	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> icon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagesPackage.Literals.STEREOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getIcon() {
		if (icon == null) {
			icon = new EObjectContainmentEList<Image>(Image.class, this, PackagesPackage.STEREOTYPE__ICON);
		}
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getProfile() {
		Profile profile = basicGetProfile();
		return profile != null && profile.eIsProxy() ? (Profile)eResolveProxy((InternalEObject)profile) : profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetProfile() {
		// TODO: implement this method to return the 'Profile' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #containingProfile() <em>Containing Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containingProfile()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINING_PROFILE__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.STEREOTYPE___CONTAINING_PROFILE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile containingProfile() {
		try {
			return (Profile)CONTAINING_PROFILE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #profile() <em>Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #profile()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROFILE__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.STEREOTYPE___PROFILE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile profile() {
		try {
			return (Profile)PROFILE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case PackagesPackage.STEREOTYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
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
			case PackagesPackage.STEREOTYPE__ICON:
				return getIcon();
			case PackagesPackage.STEREOTYPE__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
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
			case PackagesPackage.STEREOTYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends Image>)newValue);
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
			case PackagesPackage.STEREOTYPE__ICON:
				getIcon().clear();
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
			case PackagesPackage.STEREOTYPE__ICON:
				return icon != null && !icon.isEmpty();
			case PackagesPackage.STEREOTYPE__PROFILE:
				return basicGetProfile() != null;
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
			case PackagesPackage.STEREOTYPE___CONTAINING_PROFILE:
				return containingProfile();
			case PackagesPackage.STEREOTYPE___PROFILE:
				return profile();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StereotypeImpl
