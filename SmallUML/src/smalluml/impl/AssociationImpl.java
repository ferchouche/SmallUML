/**
 */
package smalluml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import smalluml.Association;
import smalluml.Cardinalities;
import smalluml.SmallumlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smalluml.impl.AssociationImpl#getCardinalities <em>Cardinalities</em>}</li>
 *   <li>{@link smalluml.impl.AssociationImpl#getTargetclass <em>Targetclass</em>}</li>
 *   <li>{@link smalluml.impl.AssociationImpl#getSourceclass <em>Sourceclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends EntityImpl implements Association {
	/**
	 * The cached value of the '{@link #getCardinalities() <em>Cardinalities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalities()
	 * @generated
	 * @ordered
	 */
	protected Cardinalities cardinalities;

	/**
	 * The cached value of the '{@link #getTargetclass() <em>Targetclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetclass()
	 * @generated
	 * @ordered
	 */
	protected smalluml.Class targetclass;

	/**
	 * The cached value of the '{@link #getSourceclass() <em>Sourceclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceclass()
	 * @generated
	 * @ordered
	 */
	protected smalluml.Class sourceclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmallumlPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinalities getCardinalities() {
		return cardinalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalities(Cardinalities newCardinalities, NotificationChain msgs) {
		Cardinalities oldCardinalities = cardinalities;
		cardinalities = newCardinalities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__CARDINALITIES, oldCardinalities, newCardinalities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalities(Cardinalities newCardinalities) {
		if (newCardinalities != cardinalities) {
			NotificationChain msgs = null;
			if (cardinalities != null)
				msgs = ((InternalEObject)cardinalities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__CARDINALITIES, null, msgs);
			if (newCardinalities != null)
				msgs = ((InternalEObject)newCardinalities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmallumlPackage.ASSOCIATION__CARDINALITIES, null, msgs);
			msgs = basicSetCardinalities(newCardinalities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__CARDINALITIES, newCardinalities, newCardinalities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smalluml.Class getTargetclass() {
		if (targetclass != null && targetclass.eIsProxy()) {
			InternalEObject oldTargetclass = (InternalEObject)targetclass;
			targetclass = (smalluml.Class)eResolveProxy(oldTargetclass);
			if (targetclass != oldTargetclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallumlPackage.ASSOCIATION__TARGETCLASS, oldTargetclass, targetclass));
			}
		}
		return targetclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smalluml.Class basicGetTargetclass() {
		return targetclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetclass(smalluml.Class newTargetclass) {
		smalluml.Class oldTargetclass = targetclass;
		targetclass = newTargetclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__TARGETCLASS, oldTargetclass, targetclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smalluml.Class getSourceclass() {
		if (sourceclass != null && sourceclass.eIsProxy()) {
			InternalEObject oldSourceclass = (InternalEObject)sourceclass;
			sourceclass = (smalluml.Class)eResolveProxy(oldSourceclass);
			if (sourceclass != oldSourceclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmallumlPackage.ASSOCIATION__SOURCECLASS, oldSourceclass, sourceclass));
			}
		}
		return sourceclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smalluml.Class basicGetSourceclass() {
		return sourceclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceclass(smalluml.Class newSourceclass) {
		smalluml.Class oldSourceclass = sourceclass;
		sourceclass = newSourceclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmallumlPackage.ASSOCIATION__SOURCECLASS, oldSourceclass, sourceclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmallumlPackage.ASSOCIATION__CARDINALITIES:
				return basicSetCardinalities(null, msgs);
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
			case SmallumlPackage.ASSOCIATION__CARDINALITIES:
				return getCardinalities();
			case SmallumlPackage.ASSOCIATION__TARGETCLASS:
				if (resolve) return getTargetclass();
				return basicGetTargetclass();
			case SmallumlPackage.ASSOCIATION__SOURCECLASS:
				if (resolve) return getSourceclass();
				return basicGetSourceclass();
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
			case SmallumlPackage.ASSOCIATION__CARDINALITIES:
				setCardinalities((Cardinalities)newValue);
				return;
			case SmallumlPackage.ASSOCIATION__TARGETCLASS:
				setTargetclass((smalluml.Class)newValue);
				return;
			case SmallumlPackage.ASSOCIATION__SOURCECLASS:
				setSourceclass((smalluml.Class)newValue);
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
			case SmallumlPackage.ASSOCIATION__CARDINALITIES:
				setCardinalities((Cardinalities)null);
				return;
			case SmallumlPackage.ASSOCIATION__TARGETCLASS:
				setTargetclass((smalluml.Class)null);
				return;
			case SmallumlPackage.ASSOCIATION__SOURCECLASS:
				setSourceclass((smalluml.Class)null);
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
			case SmallumlPackage.ASSOCIATION__CARDINALITIES:
				return cardinalities != null;
			case SmallumlPackage.ASSOCIATION__TARGETCLASS:
				return targetclass != null;
			case SmallumlPackage.ASSOCIATION__SOURCECLASS:
				return sourceclass != null;
		}
		return super.eIsSet(featureID);
	}

} //AssociationImpl
