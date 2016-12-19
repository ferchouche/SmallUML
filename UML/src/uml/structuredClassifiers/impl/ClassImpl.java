/**
 */
package uml.structuredClassifiers.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.Operation;

import uml.commonBehavior.Behavior;

import uml.packages.Extension;

import uml.simpleClassifiers.BehavioredClassifier;
import uml.simpleClassifiers.InterfaceRealization;
import uml.simpleClassifiers.Reception;
import uml.simpleClassifiers.SimpleClassifiersPackage;

import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.ClassImpl#getInterfaceRealization <em>Interface Realization</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ClassImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ClassImpl#getOwnedBehavior <em>Owned Behavior</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ClassImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ClassImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ClassImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ClassImpl#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends EncapsulatedClassifierImpl implements uml.structuredClassifiers.Class {
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
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNestedClassifier() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> nestedClassifier;

	/**
	 * The cached value of the '{@link #getOwnedReception() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReception()
	 * @generated
	 * @ordered
	 */
	protected EList<Reception> ownedReception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRealization> getInterfaceRealization() {
		if (interfaceRealization == null) {
			interfaceRealization = new EObjectContainmentWithInverseEList<InterfaceRealization>(InterfaceRealization.class, this, StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION, SimpleClassifiersPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehavior() {
		if (ownedBehavior == null) {
			ownedBehavior = new EObjectContainmentEList<Behavior>(Behavior.class, this, StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR);
		}
		return ownedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, StructuredClassifiersPackage.CLASS__OWNED_OPERATION, ClassificationPackage.OPERATION__CLASS);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtension() {
		// TODO: implement this method to return the 'Extension' reference list
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
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.CLASS__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNestedClassifier() {
		if (nestedClassifier == null) {
			nestedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, StructuredClassifiersPackage.CLASS__NESTED_CLASSIFIER);
		}
		return nestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reception> getOwnedReception() {
		if (ownedReception == null) {
			ownedReception = new EObjectContainmentEList<Reception>(Reception.class, this, StructuredClassifiersPackage.CLASS__OWNED_RECEPTION);
		}
		return ownedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uml.structuredClassifiers.Class> getSuperClass() {
		// TODO: implement this method to return the 'Super Class' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #extension() <em>Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #extension()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EXTENSION__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.CLASS___EXTENSION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Extension> extension() {
		try {
			return (EList<Extension>)EXTENSION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #superClass() <em>Super Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #superClass()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SUPER_CLASS__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.CLASS___SUPER_CLASS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<uml.structuredClassifiers.Class> superClass() {
		try {
			return (EList<uml.structuredClassifiers.Class>)SUPER_CLASS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceRealization()).basicAdd(otherEnd, msgs);
			case StructuredClassifiersPackage.CLASS__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
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
			case StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION:
				return ((InternalEList<?>)getInterfaceRealization()).basicRemove(otherEnd, msgs);
			case StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehavior()).basicRemove(otherEnd, msgs);
			case StructuredClassifiersPackage.CLASS__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case StructuredClassifiersPackage.CLASS__NESTED_CLASSIFIER:
				return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
			case StructuredClassifiersPackage.CLASS__OWNED_RECEPTION:
				return ((InternalEList<?>)getOwnedReception()).basicRemove(otherEnd, msgs);
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
			case StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION:
				return getInterfaceRealization();
			case StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR:
				if (resolve) return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR:
				return getOwnedBehavior();
			case StructuredClassifiersPackage.CLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case StructuredClassifiersPackage.CLASS__EXTENSION:
				return getExtension();
			case StructuredClassifiersPackage.CLASS__IS_ACTIVE:
				return isIsActive();
			case StructuredClassifiersPackage.CLASS__NESTED_CLASSIFIER:
				return getNestedClassifier();
			case StructuredClassifiersPackage.CLASS__OWNED_RECEPTION:
				return getOwnedReception();
			case StructuredClassifiersPackage.CLASS__SUPER_CLASS:
				return getSuperClass();
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
			case StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION:
				getInterfaceRealization().clear();
				getInterfaceRealization().addAll((Collection<? extends InterfaceRealization>)newValue);
				return;
			case StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				getOwnedBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case StructuredClassifiersPackage.CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case StructuredClassifiersPackage.CLASS__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case StructuredClassifiersPackage.CLASS__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case StructuredClassifiersPackage.CLASS__OWNED_RECEPTION:
				getOwnedReception().clear();
				getOwnedReception().addAll((Collection<? extends Reception>)newValue);
				return;
			case StructuredClassifiersPackage.CLASS__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends uml.structuredClassifiers.Class>)newValue);
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
			case StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION:
				getInterfaceRealization().clear();
				return;
			case StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR:
				getOwnedBehavior().clear();
				return;
			case StructuredClassifiersPackage.CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case StructuredClassifiersPackage.CLASS__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case StructuredClassifiersPackage.CLASS__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				return;
			case StructuredClassifiersPackage.CLASS__OWNED_RECEPTION:
				getOwnedReception().clear();
				return;
			case StructuredClassifiersPackage.CLASS__SUPER_CLASS:
				getSuperClass().clear();
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
			case StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION:
				return interfaceRealization != null && !interfaceRealization.isEmpty();
			case StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR:
				return ownedBehavior != null && !ownedBehavior.isEmpty();
			case StructuredClassifiersPackage.CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case StructuredClassifiersPackage.CLASS__EXTENSION:
				return !getExtension().isEmpty();
			case StructuredClassifiersPackage.CLASS__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case StructuredClassifiersPackage.CLASS__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case StructuredClassifiersPackage.CLASS__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case StructuredClassifiersPackage.CLASS__SUPER_CLASS:
				return !getSuperClass().isEmpty();
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
				case StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION: return SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
				case StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR: return SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				case StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR: return SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
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
				case SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION: return StructuredClassifiersPackage.CLASS__INTERFACE_REALIZATION;
				case SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR: return StructuredClassifiersPackage.CLASS__CLASSIFIER_BEHAVIOR;
				case SimpleClassifiersPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR: return StructuredClassifiersPackage.CLASS__OWNED_BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StructuredClassifiersPackage.CLASS___EXTENSION:
				return extension();
			case StructuredClassifiersPackage.CLASS___SUPER_CLASS:
				return superClass();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
