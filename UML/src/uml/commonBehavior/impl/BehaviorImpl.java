/**
 */
package uml.commonBehavior.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.BehavioralFeature;
import uml.classification.ClassificationPackage;
import uml.classification.Parameter;
import uml.classification.ParameterSet;

import uml.commonBehavior.Behavior;
import uml.commonBehavior.CommonBehaviorPackage;

import uml.commonStructure.Constraint;
import uml.commonStructure.Element;

import uml.simpleClassifiers.BehavioredClassifier;

import uml.structuredClassifiers.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.commonBehavior.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link uml.commonBehavior.impl.BehaviorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link uml.commonBehavior.impl.BehaviorImpl#isIsReentrant <em>Is Reentrant</em>}</li>
 *   <li>{@link uml.commonBehavior.impl.BehaviorImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.commonBehavior.impl.BehaviorImpl#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link uml.commonBehavior.impl.BehaviorImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml.commonBehavior.impl.BehaviorImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml.commonBehavior.impl.BehaviorImpl#getRedefinedBehavior <em>Redefined Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BehaviorImpl extends ClassImpl implements Behavior {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature specification;

	/**
	 * The default value of the '{@link #isIsReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REENTRANT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsReentrant() <em>Is Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReentrant()
	 * @generated
	 * @ordered
	 */
	protected boolean isReentrant = IS_REENTRANT_EDEFAULT;

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
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> postcondition;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> precondition;

	/**
	 * The cached value of the '{@link #getRedefinedBehavior() <em>Redefined Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> redefinedBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonBehaviorPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (BehavioralFeature)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonBehaviorPackage.BEHAVIOR__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(BehavioralFeature newSpecification, NotificationChain msgs) {
		BehavioralFeature oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonBehaviorPackage.BEHAVIOR__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(BehavioralFeature newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, ClassificationPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, ClassificationPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonBehaviorPackage.BEHAVIOR__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getContext() {
		BehavioredClassifier context = basicGetContext();
		return context != null && context.eIsProxy() ? (BehavioredClassifier)eResolveProxy((InternalEObject)context) : context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier basicGetContext() {
		// TODO: implement this method to return the 'Context' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReentrant() {
		return isReentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReentrant(boolean newIsReentrant) {
		boolean oldIsReentrant = isReentrant;
		isReentrant = newIsReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonBehaviorPackage.BEHAVIOR__IS_REENTRANT, oldIsReentrant, isReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER);
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
			ownedParameterSet = new EObjectContainmentEList<ParameterSet>(ParameterSet.class, this, CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER_SET);
		}
		return ownedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, CommonBehaviorPackage.BEHAVIOR__POSTCONDITION);
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, CommonBehaviorPackage.BEHAVIOR__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getRedefinedBehavior() {
		if (redefinedBehavior == null) {
			redefinedBehavior = new EObjectResolvingEList<Behavior>(Behavior.class, this, CommonBehaviorPackage.BEHAVIOR__REDEFINED_BEHAVIOR);
		}
		return redefinedBehavior;
	}

	/**
	 * The cached invocation delegate for the '{@link #context() <em>Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #context()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTEXT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonBehaviorPackage.Literals.BEHAVIOR___CONTEXT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier context() {
		try {
			return (BehavioredClassifier)CONTEXT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public BehavioredClassifier behavioredClassifier(Element from) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #inputParameters() <em>Input Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inputParameters()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INPUT_PARAMETERS__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonBehaviorPackage.Literals.BEHAVIOR___INPUT_PARAMETERS).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate OUTPUT_PARAMETERS__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonBehaviorPackage.Literals.BEHAVIOR___OUTPUT_PARAMETERS).getInvocationDelegate();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonBehaviorPackage.BEHAVIOR__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, ClassificationPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
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
			case CommonBehaviorPackage.BEHAVIOR__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER_SET:
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
			case CommonBehaviorPackage.BEHAVIOR__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case CommonBehaviorPackage.BEHAVIOR__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case CommonBehaviorPackage.BEHAVIOR__IS_REENTRANT:
				return isIsReentrant();
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER:
				return getOwnedParameter();
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				return getOwnedParameterSet();
			case CommonBehaviorPackage.BEHAVIOR__POSTCONDITION:
				return getPostcondition();
			case CommonBehaviorPackage.BEHAVIOR__PRECONDITION:
				return getPrecondition();
			case CommonBehaviorPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				return getRedefinedBehavior();
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
			case CommonBehaviorPackage.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case CommonBehaviorPackage.BEHAVIOR__IS_REENTRANT:
				setIsReentrant((Boolean)newValue);
				return;
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				getOwnedParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
				return;
			case CommonBehaviorPackage.BEHAVIOR__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CommonBehaviorPackage.BEHAVIOR__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CommonBehaviorPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehavior().clear();
				getRedefinedBehavior().addAll((Collection<? extends Behavior>)newValue);
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
			case CommonBehaviorPackage.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case CommonBehaviorPackage.BEHAVIOR__IS_REENTRANT:
				setIsReentrant(IS_REENTRANT_EDEFAULT);
				return;
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				return;
			case CommonBehaviorPackage.BEHAVIOR__POSTCONDITION:
				getPostcondition().clear();
				return;
			case CommonBehaviorPackage.BEHAVIOR__PRECONDITION:
				getPrecondition().clear();
				return;
			case CommonBehaviorPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				getRedefinedBehavior().clear();
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
			case CommonBehaviorPackage.BEHAVIOR__SPECIFICATION:
				return specification != null;
			case CommonBehaviorPackage.BEHAVIOR__CONTEXT:
				return basicGetContext() != null;
			case CommonBehaviorPackage.BEHAVIOR__IS_REENTRANT:
				return isReentrant != IS_REENTRANT_EDEFAULT;
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case CommonBehaviorPackage.BEHAVIOR__OWNED_PARAMETER_SET:
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
			case CommonBehaviorPackage.BEHAVIOR__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case CommonBehaviorPackage.BEHAVIOR__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case CommonBehaviorPackage.BEHAVIOR__REDEFINED_BEHAVIOR:
				return redefinedBehavior != null && !redefinedBehavior.isEmpty();
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
			case CommonBehaviorPackage.BEHAVIOR___CONTEXT:
				return context();
			case CommonBehaviorPackage.BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT:
				return behavioredClassifier((Element)arguments.get(0));
			case CommonBehaviorPackage.BEHAVIOR___INPUT_PARAMETERS:
				return inputParameters();
			case CommonBehaviorPackage.BEHAVIOR___OUTPUT_PARAMETERS:
				return outputParameters();
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
		result.append(" (isReentrant: ");
		result.append(isReentrant);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
