/**
 */
package uml.structuredClassifiers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonBehavior.Behavior;

import uml.simpleClassifiers.BehavioredClassifier;
import uml.simpleClassifiers.InterfaceRealization;
import uml.simpleClassifiers.SimpleClassifiersPackage;

import uml.structuredClassifiers.Collaboration;
import uml.structuredClassifiers.ConnectableElement;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.CollaborationImpl#getInterfaceRealization <em>Interface Realization</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.CollaborationImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.CollaborationImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.CollaborationImpl#getCollaborationRole <em>Collaboration Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborationImpl extends StructuredClassifierImpl implements Collaboration {
	/**
	 * The cached value of the '{@link #getInterfaceRealization() <em>Interface Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRealization()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceRealization> interfaceRealization;

	/**
	 * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior classifierBehavior;

	/**
	 * The cached value of the '{@link #getOwnedBehavior() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> ownedBehavior;

	/**
	 * The cached value of the '{@link #getCollaborationRole() <em>Collaboration Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectableElement> collaborationRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.COLLABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRealization> getInterfaceRealization() {
		if (interfaceRealization == null) {
			interfaceRealization = new EObjectContainmentWithInverseEList<InterfaceRealization>(InterfaceRealization.class, this, StructuredClassifiersPackage.COLLABORATION__INTERFACE_REALIZATION, SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
		}
		return interfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		if (classifierBehavior != null && classifierBehavior.eIsProxy()) {
			InternalEObject oldClassifierBehavior = (InternalEObject)classifierBehavior;
			classifierBehavior = (Behavior)eResolveProxy(oldClassifierBehavior);
			if (classifierBehavior != oldClassifierBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuredClassifiersPackage.COLLABORATION__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
			}
		}
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetClassifierBehavior() {
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		Behavior oldClassifierBehavior = classifierBehavior;
		classifierBehavior = newClassifierBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.COLLABORATION__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehavior() {
		if (ownedBehavior == null) {
			ownedBehavior = new EObjectContainmentEList<Behavior>(Behavior.class, this, StructuredClassifiersPackage.COLLABORATION__OWNED_BEHAVIOR);
		}
		return ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectableElement> getCollaborationRole() {
		if (collaborationRole == null) {
			collaborationRole = new EObjectResolvingEList<ConnectableElement>(ConnectableElement.class, this, StructuredClassifiersPackage.COLLABORATION__COLLABORATION_ROLE);
		}
		return collaborationRole;
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
			case StructuredClassifiersPackage.COLLABORATION__INTERFACE_REALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceRealization()).basicAdd(otherEnd, msgs);
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
			case StructuredClassifiersPackage.COLLABORATION__INTERFACE_REALIZATION:
				return ((InternalEList<?>)getInterfaceRealization()).basicRemove(otherEnd, msgs);
			case StructuredClassifiersPackage.COLLABORATION__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
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
			case StructuredClassifiersPackage.COLLABORATION__INTERFACE_REALIZATION:
				return getInterfaceRealization();
			case StructuredClassifiersPackage.COLLABORATION__CLASSIFIER_BEHAVIOR:
				if (resolve) return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case StructuredClassifiersPackage.COLLABORATION__OWNED_BEHAVIOR:
				return getOwnedBehavior();
			case StructuredClassifiersPackage.COLLABORATION__COLLABORATION_ROLE:
				return getCollaborationRole();
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
			case StructuredClassifiersPackage.COLLABORATION__INTERFACE_REALIZATION:
				getInterfaceRealization().clear();
				getInterfaceRealization().addAll((Collection<? extends InterfaceRealization>)newValue);
				return;
			case StructuredClassifiersPackage.COLLABORATION__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case StructuredClassifiersPackage.COLLABORATION__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				getOwnedBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case StructuredClassifiersPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
				getCollaborationRole().addAll((Collection<? extends ConnectableElement>)newValue);
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
			case StructuredClassifiersPackage.COLLABORATION__INTERFACE_REALIZATION:
				getInterfaceRealization().clear();
				return;
			case StructuredClassifiersPackage.COLLABORATION__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case StructuredClassifiersPackage.COLLABORATION__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				return;
			case StructuredClassifiersPackage.COLLABORATION__COLLABORATION_ROLE:
				getCollaborationRole().clear();
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
			case StructuredClassifiersPackage.COLLABORATION__INTERFACE_REALIZATION:
				return interfaceRealization != null && !interfaceRealization.isEmpty();
			case StructuredClassifiersPackage.COLLABORATION__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case StructuredClassifiersPackage.COLLABORATION__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case StructuredClassifiersPackage.COLLABORATION__COLLABORATION_ROLE:
				return collaborationRole != null && !collaborationRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
				case StructuredClassifiersPackage.COLLABORATION__INTERFACE_REALIZATION: return SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
				case StructuredClassifiersPackage.COLLABORATION__CLASSIFIER_BEHAVIOR: return SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				case StructuredClassifiersPackage.COLLABORATION__OWNED_BEHAVIOR: return SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
				case SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION: return StructuredClassifiersPackage.COLLABORATION__INTERFACE_REALIZATION;
				case SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR: return StructuredClassifiersPackage.COLLABORATION__CLASSIFIER_BEHAVIOR;
				case SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR: return StructuredClassifiersPackage.COLLABORATION__OWNED_BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CollaborationImpl
