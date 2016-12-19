/**
 */
package uml.classification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.Generalization;
import uml.classification.GeneralizationSet;

import uml.commonStructure.impl.DirectedRelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.classification.impl.GeneralizationImpl#getGeneralizationSet <em>Generalization Set</em>}</li>
 *   <li>{@link uml.classification.impl.GeneralizationImpl#isIsSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link uml.classification.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends DirectedRelationshipImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected Classifier general;

	/**
	 * The cached value of the '{@link #getGeneralizationSet() <em>Generalization Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationSet()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationSet> generalizationSet;

	/**
	 * The default value of the '{@link #isIsSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBSTITUTABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsSubstitutable() <em>Is Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected boolean isSubstitutable = IS_SUBSTITUTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (Classifier)eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.GENERALIZATION__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Classifier newGeneral) {
		Classifier oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.GENERALIZATION__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getGeneralizationSet() {
		if (generalizationSet == null) {
			generalizationSet = new EObjectWithInverseResolvingEList.ManyInverse<GeneralizationSet>(GeneralizationSet.class, this, ClassificationPackage.GENERALIZATION__GENERALIZATION_SET, ClassificationPackage.GENERALIZATION_SET__GENERALIZATION);
		}
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubstitutable() {
		return isSubstitutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubstitutable(boolean newIsSubstitutable) {
		boolean oldIsSubstitutable = isSubstitutable;
		isSubstitutable = newIsSubstitutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable, isSubstitutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getSpecific() {
		if (eContainerFeatureID() != ClassificationPackage.GENERALIZATION__SPECIFIC) return null;
		return (Classifier)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecific(Classifier newSpecific, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecific, ClassificationPackage.GENERALIZATION__SPECIFIC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Classifier newSpecific) {
		if (newSpecific != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.GENERALIZATION__SPECIFIC && newSpecific != null)) {
			if (EcoreUtil.isAncestor(this, newSpecific))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecific != null)
				msgs = ((InternalEObject)newSpecific).eInverseAdd(this, ClassificationPackage.CLASSIFIER__GENERALIZATION, Classifier.class, msgs);
			msgs = basicSetSpecific(newSpecific, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.GENERALIZATION__SPECIFIC, newSpecific, newSpecific));
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
			case ClassificationPackage.GENERALIZATION__GENERALIZATION_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralizationSet()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecific((Classifier)otherEnd, msgs);
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
			case ClassificationPackage.GENERALIZATION__GENERALIZATION_SET:
				return ((InternalEList<?>)getGeneralizationSet()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				return basicSetSpecific(null, msgs);
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
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				return eInternalContainer().eInverseRemove(this, ClassificationPackage.CLASSIFIER__GENERALIZATION, Classifier.class, msgs);
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
			case ClassificationPackage.GENERALIZATION__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case ClassificationPackage.GENERALIZATION__GENERALIZATION_SET:
				return getGeneralizationSet();
			case ClassificationPackage.GENERALIZATION__IS_SUBSTITUTABLE:
				return isIsSubstitutable();
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				return getSpecific();
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
			case ClassificationPackage.GENERALIZATION__GENERAL:
				setGeneral((Classifier)newValue);
				return;
			case ClassificationPackage.GENERALIZATION__GENERALIZATION_SET:
				getGeneralizationSet().clear();
				getGeneralizationSet().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case ClassificationPackage.GENERALIZATION__IS_SUBSTITUTABLE:
				setIsSubstitutable((Boolean)newValue);
				return;
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)newValue);
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
			case ClassificationPackage.GENERALIZATION__GENERAL:
				setGeneral((Classifier)null);
				return;
			case ClassificationPackage.GENERALIZATION__GENERALIZATION_SET:
				getGeneralizationSet().clear();
				return;
			case ClassificationPackage.GENERALIZATION__IS_SUBSTITUTABLE:
				setIsSubstitutable(IS_SUBSTITUTABLE_EDEFAULT);
				return;
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Classifier)null);
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
			case ClassificationPackage.GENERALIZATION__GENERAL:
				return general != null;
			case ClassificationPackage.GENERALIZATION__GENERALIZATION_SET:
				return generalizationSet != null && !generalizationSet.isEmpty();
			case ClassificationPackage.GENERALIZATION__IS_SUBSTITUTABLE:
				return isSubstitutable != IS_SUBSTITUTABLE_EDEFAULT;
			case ClassificationPackage.GENERALIZATION__SPECIFIC:
				return getSpecific() != null;
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
		result.append(" (isSubstitutable: ");
		result.append(isSubstitutable);
		result.append(')');
		return result.toString();
	}

} //GeneralizationImpl
