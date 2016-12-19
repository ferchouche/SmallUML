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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.classification.Classifier;

import uml.commonStructure.impl.RealizationImpl;

import uml.structuredClassifiers.Component;
import uml.structuredClassifiers.ComponentRealization;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.ComponentRealizationImpl#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ComponentRealizationImpl#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentRealizationImpl extends RealizationImpl implements ComponentRealization {
	/**
	 * The cached value of the '{@link #getRealizingClassifier() <em>Realizing Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> realizingClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.COMPONENT_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRealizingClassifier() {
		if (realizingClassifier == null) {
			realizingClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, StructuredClassifiersPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER);
		}
		return realizingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAbstraction() {
		if (eContainerFeatureID() != StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstraction(Component newAbstraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAbstraction, StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstraction(Component newAbstraction) {
		if (newAbstraction != eInternalContainer() || (eContainerFeatureID() != StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION && newAbstraction != null)) {
			if (EcoreUtil.isAncestor(this, newAbstraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstraction != null)
				msgs = ((InternalEObject)newAbstraction).eInverseAdd(this, StructuredClassifiersPackage.COMPONENT__REALIZATION, Component.class, msgs);
			msgs = basicSetAbstraction(newAbstraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION, newAbstraction, newAbstraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstraction((Component)otherEnd, msgs);
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
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION:
				return basicSetAbstraction(null, msgs);
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
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION:
				return eInternalContainer().eInverseRemove(this, StructuredClassifiersPackage.COMPONENT__REALIZATION, Component.class, msgs);
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
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
				return getRealizingClassifier();
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION:
				return getAbstraction();
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
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
				getRealizingClassifier().clear();
				getRealizingClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION:
				setAbstraction((Component)newValue);
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
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
				getRealizingClassifier().clear();
				return;
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION:
				setAbstraction((Component)null);
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
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__REALIZING_CLASSIFIER:
				return realizingClassifier != null && !realizingClassifier.isEmpty();
			case StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION:
				return getAbstraction() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentRealizationImpl
