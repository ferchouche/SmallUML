/**
 */
package uml.simpleClassifiers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.commonStructure.impl.RealizationImpl;

import uml.simpleClassifiers.BehavioredClassifier;
import uml.simpleClassifiers.Interface;
import uml.simpleClassifiers.InterfaceRealization;
import uml.simpleClassifiers.SimpleClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.impl.InterfaceRealizationImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link uml.simpleClassifiers.impl.InterfaceRealizationImpl#getImplementingClassifier <em>Implementing Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceRealizationImpl extends RealizationImpl implements InterfaceRealization {
	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Interface contract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleClassifiersPackage.Literals.INTERFACE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getContract() {
		if (contract != null && contract.eIsProxy()) {
			InternalEObject oldContract = (InternalEObject)contract;
			contract = (Interface)eResolveProxy(oldContract);
			if (contract != oldContract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimpleClassifiersPackage.INTERFACE_REALIZATION__CONTRACT, oldContract, contract));
			}
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Interface newContract) {
		Interface oldContract = contract;
		contract = newContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleClassifiersPackage.INTERFACE_REALIZATION__CONTRACT, oldContract, contract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getImplementingClassifier() {
		if (eContainerFeatureID() != SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER) return null;
		return (BehavioredClassifier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementingClassifier(BehavioredClassifier newImplementingClassifier, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImplementingClassifier, SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementingClassifier(BehavioredClassifier newImplementingClassifier) {
		if (newImplementingClassifier != eInternalContainer() || (eContainerFeatureID() != SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER && newImplementingClassifier != null)) {
			if (EcoreUtil.isAncestor(this, newImplementingClassifier))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImplementingClassifier != null)
				msgs = ((InternalEObject)newImplementingClassifier).eInverseAdd(this, SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION, BehavioredClassifier.class, msgs);
			msgs = basicSetImplementingClassifier(newImplementingClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER, newImplementingClassifier, newImplementingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImplementingClassifier((BehavioredClassifier)otherEnd, msgs);
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
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER:
				return basicSetImplementingClassifier(null, msgs);
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
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER:
				return eInternalContainer().eInverseRemove(this, SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION, BehavioredClassifier.class, msgs);
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
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__CONTRACT:
				if (resolve) return getContract();
				return basicGetContract();
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER:
				return getImplementingClassifier();
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
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__CONTRACT:
				setContract((Interface)newValue);
				return;
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER:
				setImplementingClassifier((BehavioredClassifier)newValue);
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
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__CONTRACT:
				setContract((Interface)null);
				return;
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER:
				setImplementingClassifier((BehavioredClassifier)null);
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
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__CONTRACT:
				return contract != null;
			case SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER:
				return getImplementingClassifier() != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceRealizationImpl
