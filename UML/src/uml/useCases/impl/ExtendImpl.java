/**
 */
package uml.useCases.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Constraint;
import uml.commonStructure.DirectedRelationship;
import uml.commonStructure.Element;
import uml.commonStructure.Relationship;

import uml.commonStructure.impl.NamedElementImpl;

import uml.useCases.Extend;
import uml.useCases.ExtensionPoint;
import uml.useCases.UseCase;
import uml.useCases.UseCasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.useCases.impl.ExtendImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link uml.useCases.impl.ExtendImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uml.useCases.impl.ExtendImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.useCases.impl.ExtendImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link uml.useCases.impl.ExtendImpl#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link uml.useCases.impl.ExtendImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link uml.useCases.impl.ExtendImpl#getExtensionLocation <em>Extension Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendImpl extends NamedElementImpl implements Extend {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint condition;

	/**
	 * The cached value of the '{@link #getExtendedCase() <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase extendedCase;

	/**
	 * The cached value of the '{@link #getExtensionLocation() <em>Extension Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasesPackage.Literals.EXTEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		// TODO: implement this method to return the 'Related Element' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSource() {
		// TODO: implement this method to return the 'Source' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		// TODO: implement this method to return the 'Target' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Constraint newCondition, NotificationChain msgs) {
		Constraint oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UseCasesPackage.EXTEND__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Constraint newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UseCasesPackage.EXTEND__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UseCasesPackage.EXTEND__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasesPackage.EXTEND__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getExtendedCase() {
		if (extendedCase != null && extendedCase.eIsProxy()) {
			InternalEObject oldExtendedCase = (InternalEObject)extendedCase;
			extendedCase = (UseCase)eResolveProxy(oldExtendedCase);
			if (extendedCase != oldExtendedCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UseCasesPackage.EXTEND__EXTENDED_CASE, oldExtendedCase, extendedCase));
			}
		}
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetExtendedCase() {
		return extendedCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedCase(UseCase newExtendedCase) {
		UseCase oldExtendedCase = extendedCase;
		extendedCase = newExtendedCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasesPackage.EXTEND__EXTENDED_CASE, oldExtendedCase, extendedCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getExtension() {
		if (eContainerFeatureID() != UseCasesPackage.EXTEND__EXTENSION) return null;
		return (UseCase)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(UseCase newExtension, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExtension, UseCasesPackage.EXTEND__EXTENSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(UseCase newExtension) {
		if (newExtension != eInternalContainer() || (eContainerFeatureID() != UseCasesPackage.EXTEND__EXTENSION && newExtension != null)) {
			if (EcoreUtil.isAncestor(this, newExtension))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExtension != null)
				msgs = ((InternalEObject)newExtension).eInverseAdd(this, UseCasesPackage.USE_CASE__EXTEND, UseCase.class, msgs);
			msgs = basicSetExtension(newExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UseCasesPackage.EXTEND__EXTENSION, newExtension, newExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionLocation() {
		if (extensionLocation == null) {
			extensionLocation = new EObjectResolvingEList<ExtensionPoint>(ExtensionPoint.class, this, UseCasesPackage.EXTEND__EXTENSION_LOCATION);
		}
		return extensionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UseCasesPackage.EXTEND__EXTENSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExtension((UseCase)otherEnd, msgs);
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
			case UseCasesPackage.EXTEND__CONDITION:
				return basicSetCondition(null, msgs);
			case UseCasesPackage.EXTEND__EXTENSION:
				return basicSetExtension(null, msgs);
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
			case UseCasesPackage.EXTEND__EXTENSION:
				return eInternalContainer().eInverseRemove(this, UseCasesPackage.USE_CASE__EXTEND, UseCase.class, msgs);
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
			case UseCasesPackage.EXTEND__RELATED_ELEMENT:
				return getRelatedElement();
			case UseCasesPackage.EXTEND__SOURCE:
				return getSource();
			case UseCasesPackage.EXTEND__TARGET:
				return getTarget();
			case UseCasesPackage.EXTEND__CONDITION:
				return getCondition();
			case UseCasesPackage.EXTEND__EXTENDED_CASE:
				if (resolve) return getExtendedCase();
				return basicGetExtendedCase();
			case UseCasesPackage.EXTEND__EXTENSION:
				return getExtension();
			case UseCasesPackage.EXTEND__EXTENSION_LOCATION:
				return getExtensionLocation();
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
			case UseCasesPackage.EXTEND__CONDITION:
				setCondition((Constraint)newValue);
				return;
			case UseCasesPackage.EXTEND__EXTENDED_CASE:
				setExtendedCase((UseCase)newValue);
				return;
			case UseCasesPackage.EXTEND__EXTENSION:
				setExtension((UseCase)newValue);
				return;
			case UseCasesPackage.EXTEND__EXTENSION_LOCATION:
				getExtensionLocation().clear();
				getExtensionLocation().addAll((Collection<? extends ExtensionPoint>)newValue);
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
			case UseCasesPackage.EXTEND__CONDITION:
				setCondition((Constraint)null);
				return;
			case UseCasesPackage.EXTEND__EXTENDED_CASE:
				setExtendedCase((UseCase)null);
				return;
			case UseCasesPackage.EXTEND__EXTENSION:
				setExtension((UseCase)null);
				return;
			case UseCasesPackage.EXTEND__EXTENSION_LOCATION:
				getExtensionLocation().clear();
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
			case UseCasesPackage.EXTEND__RELATED_ELEMENT:
				return !getRelatedElement().isEmpty();
			case UseCasesPackage.EXTEND__SOURCE:
				return !getSource().isEmpty();
			case UseCasesPackage.EXTEND__TARGET:
				return !getTarget().isEmpty();
			case UseCasesPackage.EXTEND__CONDITION:
				return condition != null;
			case UseCasesPackage.EXTEND__EXTENDED_CASE:
				return extendedCase != null;
			case UseCasesPackage.EXTEND__EXTENSION:
				return getExtension() != null;
			case UseCasesPackage.EXTEND__EXTENSION_LOCATION:
				return extensionLocation != null && !extensionLocation.isEmpty();
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
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case UseCasesPackage.EXTEND__RELATED_ELEMENT: return CommonStructurePackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case UseCasesPackage.EXTEND__SOURCE: return CommonStructurePackage.DIRECTED_RELATIONSHIP__SOURCE;
				case UseCasesPackage.EXTEND__TARGET: return CommonStructurePackage.DIRECTED_RELATIONSHIP__TARGET;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.RELATIONSHIP__RELATED_ELEMENT: return UseCasesPackage.EXTEND__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.DIRECTED_RELATIONSHIP__SOURCE: return UseCasesPackage.EXTEND__SOURCE;
				case CommonStructurePackage.DIRECTED_RELATIONSHIP__TARGET: return UseCasesPackage.EXTEND__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExtendImpl
