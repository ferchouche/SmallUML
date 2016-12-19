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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.RedefinableElement;

import uml.commonStructure.impl.NamespaceImpl;

import uml.stateMachines.Region;
import uml.stateMachines.State;
import uml.stateMachines.StateMachine;
import uml.stateMachines.StateMachinesPackage;
import uml.stateMachines.Transition;
import uml.stateMachines.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.impl.RegionImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.stateMachines.impl.RegionImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.stateMachines.impl.RegionImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.stateMachines.impl.RegionImpl#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link uml.stateMachines.impl.RegionImpl#getState <em>State</em>}</li>
 *   <li>{@link uml.stateMachines.impl.RegionImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link uml.stateMachines.impl.RegionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link uml.stateMachines.impl.RegionImpl#getSubvertex <em>Subvertex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends NamespaceImpl implements Region {
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
	 * The cached value of the '{@link #getExtendedRegion() <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedRegion()
	 * @generated
	 * @ordered
	 */
	protected Region extendedRegion;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The cached value of the '{@link #getSubvertex() <em>Subvertex</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubvertex()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> subvertex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinesPackage.Literals.REGION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.REGION__IS_LEAF, oldIsLeaf, isLeaf));
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
	public Region getExtendedRegion() {
		if (extendedRegion != null && extendedRegion.eIsProxy()) {
			InternalEObject oldExtendedRegion = (InternalEObject)extendedRegion;
			extendedRegion = (Region)eResolveProxy(oldExtendedRegion);
			if (extendedRegion != oldExtendedRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinesPackage.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
			}
		}
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetExtendedRegion() {
		return extendedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedRegion(Region newExtendedRegion) {
		Region oldExtendedRegion = extendedRegion;
		extendedRegion = newExtendedRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.REGION__EXTENDED_REGION, oldExtendedRegion, extendedRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (eContainerFeatureID() != StateMachinesPackage.REGION__STATE) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, StateMachinesPackage.REGION__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != StateMachinesPackage.REGION__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, StateMachinesPackage.STATE__REGION, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.REGION__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		if (eContainerFeatureID() != StateMachinesPackage.REGION__STATE_MACHINE) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, StateMachinesPackage.REGION__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != StateMachinesPackage.REGION__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, StateMachinesPackage.STATE_MACHINE__REGION, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.REGION__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, StateMachinesPackage.REGION__TRANSITION, StateMachinesPackage.TRANSITION__CONTAINER);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getSubvertex() {
		if (subvertex == null) {
			subvertex = new EObjectContainmentWithInverseEList<Vertex>(Vertex.class, this, StateMachinesPackage.REGION__SUBVERTEX, StateMachinesPackage.VERTEX__CONTAINER);
		}
		return subvertex;
	}

	/**
	 * The cached invocation delegate for the '{@link #belongsToPsm() <em>Belongs To Psm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #belongsToPsm()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate BELONGS_TO_PSM__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.REGION___BELONGS_TO_PSM).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean belongsToPsm() {
		try {
			return (Boolean)BELONGS_TO_PSM__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #containingStateMachine() <em>Containing State Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containingStateMachine()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINING_STATE_MACHINE__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.REGION___CONTAINING_STATE_MACHINE).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate REDEFINITION_CONTEXT__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.REGION___REDEFINITION_CONTEXT).getInvocationDelegate();

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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateMachinesPackage.REGION__STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State)otherEnd, msgs);
			case StateMachinesPackage.REGION__STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine((StateMachine)otherEnd, msgs);
			case StateMachinesPackage.REGION__TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransition()).basicAdd(otherEnd, msgs);
			case StateMachinesPackage.REGION__SUBVERTEX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubvertex()).basicAdd(otherEnd, msgs);
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
			case StateMachinesPackage.REGION__STATE:
				return basicSetState(null, msgs);
			case StateMachinesPackage.REGION__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
			case StateMachinesPackage.REGION__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
			case StateMachinesPackage.REGION__SUBVERTEX:
				return ((InternalEList<?>)getSubvertex()).basicRemove(otherEnd, msgs);
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
			case StateMachinesPackage.REGION__STATE:
				return eInternalContainer().eInverseRemove(this, StateMachinesPackage.STATE__REGION, State.class, msgs);
			case StateMachinesPackage.REGION__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, StateMachinesPackage.STATE_MACHINE__REGION, StateMachine.class, msgs);
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
			case StateMachinesPackage.REGION__IS_LEAF:
				return isIsLeaf();
			case StateMachinesPackage.REGION__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case StateMachinesPackage.REGION__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case StateMachinesPackage.REGION__EXTENDED_REGION:
				if (resolve) return getExtendedRegion();
				return basicGetExtendedRegion();
			case StateMachinesPackage.REGION__STATE:
				return getState();
			case StateMachinesPackage.REGION__STATE_MACHINE:
				return getStateMachine();
			case StateMachinesPackage.REGION__TRANSITION:
				return getTransition();
			case StateMachinesPackage.REGION__SUBVERTEX:
				return getSubvertex();
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
			case StateMachinesPackage.REGION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case StateMachinesPackage.REGION__EXTENDED_REGION:
				setExtendedRegion((Region)newValue);
				return;
			case StateMachinesPackage.REGION__STATE:
				setState((State)newValue);
				return;
			case StateMachinesPackage.REGION__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case StateMachinesPackage.REGION__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case StateMachinesPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
				getSubvertex().addAll((Collection<? extends Vertex>)newValue);
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
			case StateMachinesPackage.REGION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case StateMachinesPackage.REGION__EXTENDED_REGION:
				setExtendedRegion((Region)null);
				return;
			case StateMachinesPackage.REGION__STATE:
				setState((State)null);
				return;
			case StateMachinesPackage.REGION__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case StateMachinesPackage.REGION__TRANSITION:
				getTransition().clear();
				return;
			case StateMachinesPackage.REGION__SUBVERTEX:
				getSubvertex().clear();
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
			case StateMachinesPackage.REGION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case StateMachinesPackage.REGION__REDEFINED_ELEMENT:
				return !getRedefinedElement().isEmpty();
			case StateMachinesPackage.REGION__REDEFINITION_CONTEXT:
				return !getRedefinitionContext().isEmpty();
			case StateMachinesPackage.REGION__EXTENDED_REGION:
				return extendedRegion != null;
			case StateMachinesPackage.REGION__STATE:
				return getState() != null;
			case StateMachinesPackage.REGION__STATE_MACHINE:
				return getStateMachine() != null;
			case StateMachinesPackage.REGION__TRANSITION:
				return transition != null && !transition.isEmpty();
			case StateMachinesPackage.REGION__SUBVERTEX:
				return subvertex != null && !subvertex.isEmpty();
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
				case StateMachinesPackage.REGION__IS_LEAF: return ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case StateMachinesPackage.REGION__REDEFINED_ELEMENT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case StateMachinesPackage.REGION__REDEFINITION_CONTEXT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
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
				case ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF: return StateMachinesPackage.REGION__IS_LEAF;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return StateMachinesPackage.REGION__REDEFINED_ELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return StateMachinesPackage.REGION__REDEFINITION_CONTEXT;
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
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT: return StateMachinesPackage.REGION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT: return StateMachinesPackage.REGION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
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
			case StateMachinesPackage.REGION___BELONGS_TO_PSM:
				return belongsToPsm();
			case StateMachinesPackage.REGION___CONTAINING_STATE_MACHINE:
				return containingStateMachine();
			case StateMachinesPackage.REGION___REDEFINITION_CONTEXT:
				return redefinitionContext();
			case StateMachinesPackage.REGION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
				return isConsistentWith((RedefinableElement)arguments.get(0));
			case StateMachinesPackage.REGION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
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
		result.append(')');
		return result.toString();
	}

} //RegionImpl
