/**
 */
package uml.packages.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.commonStructure.impl.DirectedRelationshipImpl;

import uml.packages.PackageMerge;
import uml.packages.PackagesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.impl.PackageMergeImpl#getMergedPackage <em>Merged Package</em>}</li>
 *   <li>{@link uml.packages.impl.PackageMergeImpl#getReceivingPackage <em>Receiving Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageMergeImpl extends DirectedRelationshipImpl implements PackageMerge {
	/**
	 * The cached value of the '{@link #getMergedPackage() <em>Merged Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedPackage()
	 * @generated
	 * @ordered
	 */
	protected uml.packages.Package mergedPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageMergeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagesPackage.Literals.PACKAGE_MERGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.packages.Package getMergedPackage() {
		if (mergedPackage != null && mergedPackage.eIsProxy()) {
			InternalEObject oldMergedPackage = (InternalEObject)mergedPackage;
			mergedPackage = (uml.packages.Package)eResolveProxy(oldMergedPackage);
			if (mergedPackage != oldMergedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PackagesPackage.PACKAGE_MERGE__MERGED_PACKAGE, oldMergedPackage, mergedPackage));
			}
		}
		return mergedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.packages.Package basicGetMergedPackage() {
		return mergedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedPackage(uml.packages.Package newMergedPackage) {
		uml.packages.Package oldMergedPackage = mergedPackage;
		mergedPackage = newMergedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagesPackage.PACKAGE_MERGE__MERGED_PACKAGE, oldMergedPackage, mergedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.packages.Package getReceivingPackage() {
		if (eContainerFeatureID() != PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE) return null;
		return (uml.packages.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivingPackage(uml.packages.Package newReceivingPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReceivingPackage, PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingPackage(uml.packages.Package newReceivingPackage) {
		if (newReceivingPackage != eInternalContainer() || (eContainerFeatureID() != PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE && newReceivingPackage != null)) {
			if (EcoreUtil.isAncestor(this, newReceivingPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReceivingPackage != null)
				msgs = ((InternalEObject)newReceivingPackage).eInverseAdd(this, PackagesPackage.PACKAGE__PACKAGE_MERGE, uml.packages.Package.class, msgs);
			msgs = basicSetReceivingPackage(newReceivingPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE, newReceivingPackage, newReceivingPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReceivingPackage((uml.packages.Package)otherEnd, msgs);
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
			case PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				return basicSetReceivingPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, PackagesPackage.PACKAGE__PACKAGE_MERGE, uml.packages.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagesPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				if (resolve) return getMergedPackage();
				return basicGetMergedPackage();
			case PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				return getReceivingPackage();
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
			case PackagesPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				setMergedPackage((uml.packages.Package)newValue);
				return;
			case PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				setReceivingPackage((uml.packages.Package)newValue);
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
			case PackagesPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				setMergedPackage((uml.packages.Package)null);
				return;
			case PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				setReceivingPackage((uml.packages.Package)null);
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
			case PackagesPackage.PACKAGE_MERGE__MERGED_PACKAGE:
				return mergedPackage != null;
			case PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE:
				return getReceivingPackage() != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageMergeImpl
