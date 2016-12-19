/**
 */
package uml.stateMachines.impl;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.RedefinableElement;

import uml.commonBehavior.Behavior;
import uml.commonBehavior.Trigger;

import uml.commonStructure.Constraint;

import uml.commonStructure.impl.NamespaceImpl;

import uml.stateMachines.Region;
import uml.stateMachines.StateMachine;
import uml.stateMachines.StateMachinesPackage;
import uml.stateMachines.Transition;
import uml.stateMachines.TransitionKind;
import uml.stateMachines.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getRedefinedTransition <em>Redefined Transition</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link uml.stateMachines.impl.TransitionImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamespaceImpl implements Transition {
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
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected Behavior effect;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Constraint guard;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionKind KIND_EDEFAULT = TransitionKind.EXTERNAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TransitionKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedTransition() <em>Redefined Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition redefinedTransition;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinesPackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.TRANSITION__IS_LEAF, oldIsLeaf, isLeaf));
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
	public Behavior getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(Behavior newEffect, NotificationChain msgs) {
		Behavior oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinesPackage.TRANSITION__EFFECT, oldEffect, newEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(Behavior newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateMachinesPackage.TRANSITION__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateMachinesPackage.TRANSITION__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.TRANSITION__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getGuard() {
		if (guard != null && guard.eIsProxy()) {
			InternalEObject oldGuard = (InternalEObject)guard;
			guard = (Constraint)eResolveProxy(oldGuard);
			if (guard != oldGuard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinesPackage.TRANSITION__GUARD, oldGuard, guard));
			}
		}
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Constraint newGuard) {
		Constraint oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.TRANSITION__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TransitionKind newKind) {
		TransitionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.TRANSITION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getRedefinedTransition() {
		if (redefinedTransition != null && redefinedTransition.eIsProxy()) {
			InternalEObject oldRedefinedTransition = (InternalEObject)redefinedTransition;
			redefinedTransition = (Transition)eResolveProxy(oldRedefinedTransition);
			if (redefinedTransition != oldRedefinedTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinesPackage.TRANSITION__REDEFINED_TRANSITION, oldRedefinedTransition, redefinedTransition));
			}
		}
		return redefinedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetRedefinedTransition() {
		return redefinedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedTransition(Transition newRedefinedTransition) {
		Transition oldRedefinedTransition = redefinedTransition;
		redefinedTransition = newRedefinedTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.TRANSITION__REDEFINED_TRANSITION, oldRedefinedTransition, redefinedTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSource() {
		Vertex source = basicGetSource();
		return source != null && source.eIsProxy() ? (Vertex)eResolveProxy((InternalEObject)source) : source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetSource() {
		// TODO: implement this method to return the 'Source' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Vertex newSource) {
		// TODO: implement this method to set the 'Source' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getTarget() {
		Vertex target = basicGetTarget();
		return target != null && target.eIsProxy() ? (Vertex)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetTarget() {
		// TODO: implement this method to return the 'Target' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Vertex newTarget) {
		// TODO: implement this method to set the 'Target' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, StateMachinesPackage.TRANSITION__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getContainer() {
		if (eContainerFeatureID() != StateMachinesPackage.TRANSITION__CONTAINER) return null;
		return (Region)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Region newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, StateMachinesPackage.TRANSITION__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Region newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != StateMachinesPackage.TRANSITION__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, StateMachinesPackage.REGION__TRANSITION, Region.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.TRANSITION__CONTAINER, newContainer, newContainer));
	}

	/**
	 * The cached invocation delegate for the '{@link #containingStateMachine() <em>Containing State Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containingStateMachine()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINING_STATE_MACHINE__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.TRANSITION___CONTAINING_STATE_MACHINE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine containingStateMachine() {
		try {
			return (StateMachine)CONTAINING_STATE_MACHINE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #redefinitionContext() <em>Redefinition Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #redefinitionContext()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REDEFINITION_CONTEXT__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.TRANSITION___REDEFINITION_CONTEXT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier redefinitionContext() {
		try {
			return (Classifier)REDEFINITION_CONTEXT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateMachinesPackage.TRANSITION__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region)otherEnd, msgs);
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
			case StateMachinesPackage.TRANSITION__EFFECT:
				return basicSetEffect(null, msgs);
			case StateMachinesPackage.TRANSITION__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case StateMachinesPackage.TRANSITION__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case StateMachinesPackage.TRANSITION__CONTAINER:
				return eInternalContainer().eInverseRemove(this, StateMachinesPackage.REGION__TRANSITION, Region.class, msgs);
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
			case StateMachinesPackage.TRANSITION__IS_LEAF:
				return isIsLeaf();
			case StateMachinesPackage.TRANSITION__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case StateMachinesPackage.TRANSITION__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case StateMachinesPackage.TRANSITION__EFFECT:
				return getEffect();
			case StateMachinesPackage.TRANSITION__GUARD:
				if (resolve) return getGuard();
				return basicGetGuard();
			case StateMachinesPackage.TRANSITION__KIND:
				return getKind();
			case StateMachinesPackage.TRANSITION__REDEFINED_TRANSITION:
				if (resolve) return getRedefinedTransition();
				return basicGetRedefinedTransition();
			case StateMachinesPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StateMachinesPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StateMachinesPackage.TRANSITION__TRIGGER:
				return getTrigger();
			case StateMachinesPackage.TRANSITION__CONTAINER:
				return getContainer();
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
			case StateMachinesPackage.TRANSITION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case StateMachinesPackage.TRANSITION__EFFECT:
				setEffect((Behavior)newValue);
				return;
			case StateMachinesPackage.TRANSITION__GUARD:
				setGuard((Constraint)newValue);
				return;
			case StateMachinesPackage.TRANSITION__KIND:
				setKind((TransitionKind)newValue);
				return;
			case StateMachinesPackage.TRANSITION__REDEFINED_TRANSITION:
				setRedefinedTransition((Transition)newValue);
				return;
			case StateMachinesPackage.TRANSITION__SOURCE:
				setSource((Vertex)newValue);
				return;
			case StateMachinesPackage.TRANSITION__TARGET:
				setTarget((Vertex)newValue);
				return;
			case StateMachinesPackage.TRANSITION__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case StateMachinesPackage.TRANSITION__CONTAINER:
				setContainer((Region)newValue);
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
			case StateMachinesPackage.TRANSITION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case StateMachinesPackage.TRANSITION__EFFECT:
				setEffect((Behavior)null);
				return;
			case StateMachinesPackage.TRANSITION__GUARD:
				setGuard((Constraint)null);
				return;
			case StateMachinesPackage.TRANSITION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case StateMachinesPackage.TRANSITION__REDEFINED_TRANSITION:
				setRedefinedTransition((Transition)null);
				return;
			case StateMachinesPackage.TRANSITION__SOURCE:
				setSource((Vertex)null);
				return;
			case StateMachinesPackage.TRANSITION__TARGET:
				setTarget((Vertex)null);
				return;
			case StateMachinesPackage.TRANSITION__TRIGGER:
				getTrigger().clear();
				return;
			case StateMachinesPackage.TRANSITION__CONTAINER:
				setContainer((Region)null);
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
			case StateMachinesPackage.TRANSITION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case StateMachinesPackage.TRANSITION__REDEFINED_ELEMENT:
				return !getRedefinedElement().isEmpty();
			case StateMachinesPackage.TRANSITION__REDEFINITION_CONTEXT:
				return !getRedefinitionContext().isEmpty();
			case StateMachinesPackage.TRANSITION__EFFECT:
				return effect != null;
			case StateMachinesPackage.TRANSITION__GUARD:
				return guard != null;
			case StateMachinesPackage.TRANSITION__KIND:
				return kind != KIND_EDEFAULT;
			case StateMachinesPackage.TRANSITION__REDEFINED_TRANSITION:
				return redefinedTransition != null;
			case StateMachinesPackage.TRANSITION__SOURCE:
				return basicGetSource() != null;
			case StateMachinesPackage.TRANSITION__TARGET:
				return basicGetTarget() != null;
			case StateMachinesPackage.TRANSITION__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case StateMachinesPackage.TRANSITION__CONTAINER:
				return getContainer() != null;
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
				case StateMachinesPackage.TRANSITION__IS_LEAF: return ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case StateMachinesPackage.TRANSITION__REDEFINED_ELEMENT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case StateMachinesPackage.TRANSITION__REDEFINITION_CONTEXT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
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
				case ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF: return StateMachinesPackage.TRANSITION__IS_LEAF;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return StateMachinesPackage.TRANSITION__REDEFINED_ELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return StateMachinesPackage.TRANSITION__REDEFINITION_CONTEXT;
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
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT: return StateMachinesPackage.TRANSITION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT: return StateMachinesPackage.TRANSITION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
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
			case StateMachinesPackage.TRANSITION___CONTAINING_STATE_MACHINE:
				return containingStateMachine();
			case StateMachinesPackage.TRANSITION___REDEFINITION_CONTEXT:
				return redefinitionContext();
			case StateMachinesPackage.TRANSITION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
				return isConsistentWith((RedefinableElement)arguments.get(0));
			case StateMachinesPackage.TRANSITION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
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
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
