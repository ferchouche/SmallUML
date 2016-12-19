/**
 */
package uml.classification.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.BehavioralFeature;
import uml.classification.CallConcurrencyKind;
import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.Feature;
import uml.classification.Parameter;
import uml.classification.ParameterSet;
import uml.classification.RedefinableElement;

import uml.commonBehavior.Behavior;
import uml.commonBehavior.CommonBehaviorPackage;

import uml.commonStructure.Type;

import uml.commonStructure.impl.NamespaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link uml.classification.impl.BehavioralFeatureImpl#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BehavioralFeatureImpl extends NamespaceImpl implements BehavioralFeature {
	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final CallConcurrencyKind CONCURRENCY_EDEFAULT = CallConcurrencyKind.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected CallConcurrencyKind concurrency = CONCURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> method;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getOwnedParameterSet() <em>Owned Parameter Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSet> ownedParameterSet;

	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> raisedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.BEHAVIORAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.BEHAVIORAL_FEATURE__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		// TODO: implement this method to return the 'Redefined Element' reference list
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
	public EList<Classifier> getRedefinitionContext() {
		// TODO: implement this method to return the 'Redefinition Context' reference list
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
	public Classifier getFeaturingClassifier() {
		Classifier featuringClassifier = basicGetFeaturingClassifier();
		return featuringClassifier != null && featuringClassifier.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)featuringClassifier) : featuringClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetFeaturingClassifier() {
		// TODO: implement this method to return the 'Featuring Classifier' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.BEHAVIORAL_FEATURE__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyKind newConcurrency) {
		CallConcurrencyKind oldConcurrency = concurrency;
		concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency, concurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getMethod() {
		if (method == null) {
			method = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, ClassificationPackage.BEHAVIORAL_FEATURE__METHOD, CommonBehaviorPackage.BEHAVIOR__SPECIFICATION);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getOwnedParameterSet() {
		if (ownedParameterSet == null) {
			ownedParameterSet = new EObjectContainmentEList<ParameterSet>(ParameterSet.class, this, ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
		}
		return ownedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedException() {
		if (raisedException == null) {
			raisedException = new EObjectResolvingEList<Type>(Type.class, this, ClassificationPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * The cached invocation delegate for the '{@link #inputParameters() <em>Input Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inputParameters()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INPUT_PARAMETERS__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.BEHAVIORAL_FEATURE___INPUT_PARAMETERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> inputParameters() {
		try {
			return (EList<Parameter>)INPUT_PARAMETERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #outputParameters() <em>Output Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #outputParameters()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OUTPUT_PARAMETERS__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.BEHAVIORAL_FEATURE___OUTPUT_PARAMETERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> outputParameters() {
		try {
			return (EList<Parameter>)OUTPUT_PARAMETERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isConsistentWith(uml.classification.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsistentWith(uml.classification.RedefinableElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_CONSISTENT_WITH_REDEFINABLE_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		try {
			return (Boolean)IS_CONSISTENT_WITH_REDEFINABLE_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{redefiningElement}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isRedefinitionContextValid(uml.classification.RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRedefinitionContextValid(uml.classification.RedefinableElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_REDEFINITION_CONTEXT_VALID_REDEFINABLE_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefinedElement) {
		try {
			return (Boolean)IS_REDEFINITION_CONTEXT_VALID_REDEFINABLE_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{redefinedElement}));
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
			case ClassificationPackage.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
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
			case ClassificationPackage.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				return ((InternalEList<?>)getOwnedParameterSet()).basicRemove(otherEnd, msgs);
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
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				return isIsLeaf();
			case ClassificationPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case ClassificationPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case ClassificationPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				if (resolve) return getFeaturingClassifier();
				return basicGetFeaturingClassifier();
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				return isIsStatic();
			case ClassificationPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return getConcurrency();
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return isIsAbstract();
			case ClassificationPackage.BEHAVIORAL_FEATURE__METHOD:
				return getMethod();
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				return getOwnedParameter();
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				return getOwnedParameterSet();
			case ClassificationPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return getRaisedException();
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
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency((CallConcurrencyKind)newValue);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Behavior>)newValue);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				getOwnedParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Type>)newValue);
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
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				return;
			case ClassificationPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedException().clear();
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
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case ClassificationPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT:
				return !getRedefinedElement().isEmpty();
			case ClassificationPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT:
				return !getRedefinitionContext().isEmpty();
			case ClassificationPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
				return basicGetFeaturingClassifier() != null;
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case ClassificationPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
			case ClassificationPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ClassificationPackage.BEHAVIORAL_FEATURE__METHOD:
				return method != null && !method.isEmpty();
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case ClassificationPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET:
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
			case ClassificationPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
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
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.BEHAVIORAL_FEATURE__IS_LEAF: return ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case ClassificationPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case ClassificationPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER: return ClassificationPackage.FEATURE__FEATURING_CLASSIFIER;
				case ClassificationPackage.BEHAVIORAL_FEATURE__IS_STATIC: return ClassificationPackage.FEATURE__IS_STATIC;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF: return ClassificationPackage.BEHAVIORAL_FEATURE__IS_LEAF;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return ClassificationPackage.BEHAVIORAL_FEATURE__REDEFINED_ELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return ClassificationPackage.BEHAVIORAL_FEATURE__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case ClassificationPackage.FEATURE__FEATURING_CLASSIFIER: return ClassificationPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;
				case ClassificationPackage.FEATURE__IS_STATIC: return ClassificationPackage.BEHAVIORAL_FEATURE__IS_STATIC;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseOperationID) {
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT: return ClassificationPackage.BEHAVIORAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT: return ClassificationPackage.BEHAVIORAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassificationPackage.BEHAVIORAL_FEATURE___INPUT_PARAMETERS:
				return inputParameters();
			case ClassificationPackage.BEHAVIORAL_FEATURE___OUTPUT_PARAMETERS:
				return outputParameters();
			case ClassificationPackage.BEHAVIORAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
				return isConsistentWith((RedefinableElement)arguments.get(0));
			case ClassificationPackage.BEHAVIORAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
				return isRedefinitionContextValid((RedefinableElement)arguments.get(0));
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
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", concurrency: ");
		result.append(concurrency);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //BehavioralFeatureImpl
